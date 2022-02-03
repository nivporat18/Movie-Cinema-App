package niv.porat.cinema_world.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import niv.porat.cinema_world.adapter.FavoriteAdapter
import niv.porat.cinema_world.adapter.clickRemove

import niv.porat.cinema_world.databinding.FragmentNotificationsBinding
import niv.porat.cinema_world.models.Favorite
import niv.porat.cinema_world.repo.AppRepository

class NotificationsFragment : Fragment(),clickRemove{

    private lateinit var deleteViewModel: NotificationsViewModel

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        deleteViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        AppRepository.fetchFavoriteFromFirebase()

        binding.rvFavorite.layoutManager = LinearLayoutManager(requireContext())
        NotificationsViewModel.appLiveData.observe(viewLifecycleOwner) { favorite ->
            binding.rvFavorite.adapter = FavoriteAdapter(favorite,this)
        }


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun delete(favorite: Favorite) {
        favorite.title?.let { NotificationsViewModel.deleteFavorite(it) }
    }

}