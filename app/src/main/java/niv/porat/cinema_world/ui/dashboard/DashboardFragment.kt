package niv.porat.cinema_world.ui.dashboard

import android.os.Bundle
import android.view.*
import android.widget.SearchView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import niv.porat.cinema_world.Category
import niv.porat.cinema_world.R

import niv.porat.cinema_world.adapter.MoviePopularAdapter
import niv.porat.cinema_world.adapter.MovieRatedAdapter

import niv.porat.cinema_world.databinding.FragmentDashboardBinding
import niv.porat.cinema_world.utils.ProgressFragment
import niv.porat.movie_world_project.models.MoviePopular
import niv.porat.movie_world_project.models.MovieRated

class DashboardFragment : ProgressFragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)
        setHasOptionsMenu(true)
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onPause() {
        super.onPause()
        println("pause")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvPopularMovie.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        mainViewModel.moviePopularSearch.observe(viewLifecycleOwner, {

            doFilterPopular(it.list as List<MoviePopular>)

        })
        mainViewModel.movieRatedSearch.observe(viewLifecycleOwner, {
            doFilterRated(it.list as List<MovieRated>)
        })

        binding.rvRatedMovie.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }

    fun doFilterPopular(filtered: List<MoviePopular>) {
        binding.rvPopularMovie.adapter = MoviePopularAdapter(filtered) { callback ->
            Toast.makeText(requireContext(), callback.original_title, Toast.LENGTH_SHORT).show()
        }
        dismissDialog()
    }

    fun doFilterRated(filtered: List<MovieRated>) {
        binding.rvRatedMovie.adapter = MovieRatedAdapter(filtered) { callback ->
            Toast.makeText(requireContext(), callback.title, Toast.LENGTH_SHORT).show()
        }
        dismissDialog()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar, menu)

        val item = menu.findItem(R.id.search_action)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if (p0 != null) {
                    mainViewModel.setSearchQuery(p0,
                        listOf(Category.MOVIE_POPULAR, Category.MOVIE_RATED))
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if (p0 == null || p0.isEmpty()) {
                    mainViewModel.setSearchQuery("DEFAULT_UNSET",
                        listOf(Category.MOVIE_POPULAR, Category.MOVIE_RATED))

                } else {
                    mainViewModel.setSearchQuery(p0,
                        listOf(Category.MOVIE_POPULAR, Category.MOVIE_RATED))
                }
                return false
            }

        })

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}