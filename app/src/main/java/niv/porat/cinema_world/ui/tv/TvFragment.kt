package niv.porat.cinema_world.ui.tv

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.*
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import niv.porat.cinema_world.Category
import niv.porat.cinema_world.R
import niv.porat.cinema_world.adapter.TvPopularAdapter
import niv.porat.cinema_world.adapter.TvRatedAdapter
import niv.porat.cinema_world.databinding.TvFragmentBinding
import niv.porat.cinema_world.utils.ProgressFragment
import niv.porat.movie_world_project.models.TvPopular
import niv.porat.movie_world_project.models.TvRated

class TvFragment : ProgressFragment() {

    private var _binding: TvFragmentBinding? = null
    val binding: TvFragmentBinding get() = _binding!!

    private lateinit var viewModel: TvViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        setHasOptionsMenu(true)
        viewModel = ViewModelProvider(this).get(TvViewModel::class.java)
        _binding = TvFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun doFilterPopular(filtered: List<TvPopular>) {
        binding.rvPopularTv.adapter =
            TvPopularAdapter(filtered) { callback ->
                Toast.makeText(requireContext(), callback.title, Toast.LENGTH_SHORT).show()
            }

    }

    fun doFilterRated(filtered: List<TvRated>) {
        binding.rvRatedTv.adapter = TvRatedAdapter(filtered) { callback ->
            Toast.makeText(requireContext(), callback.title, Toast.LENGTH_SHORT).show()
        }

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainViewModel.tvPopular.observe(viewLifecycleOwner) { tvPopular ->
            binding.rvPopularTv.adapter = TvPopularAdapter(tvPopular) { callback ->
                Toast.makeText(requireContext(), callback.title, Toast.LENGTH_SHORT).show()
            }
            binding.rvPopularTv.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

        mainViewModel.tvPopularSearch.observe(viewLifecycleOwner, {

            doFilterPopular(it.list as List<TvPopular>)

        })
        mainViewModel.tvRatedSearch.observe(viewLifecycleOwner, {
            doFilterRated(it.list as List<TvRated>)

        })

        mainViewModel.tvRated.observe(viewLifecycleOwner) { tvRated ->
            binding.rvRatedTv.adapter = TvRatedAdapter(tvRated) { callback ->
                Toast.makeText(requireContext(), callback.title, Toast.LENGTH_SHORT).show()
            }
            binding.rvRatedTv.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar, menu)

        val item = menu.findItem(R.id.search_action)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if (p0 != null) {
                    mainViewModel.setSearchQuery(p0,
                        listOf(Category.TV_POPULAR, Category.TV_RATED))
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if (p0 == null || p0.isEmpty()) {
                    mainViewModel.setSearchQuery("DEFAULT_UNSET",
                        listOf(Category.TV_POPULAR, Category.TV_RATED))
                } else {
                    mainViewModel.setSearchQuery(p0,
                        listOf(Category.TV_POPULAR, Category.TV_RATED))
                }
                return false
            }

        })

    }

}