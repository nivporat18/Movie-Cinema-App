package niv.porat.cinema_world.fragment_info_pages

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.all__info__fragment.*
import kotlinx.android.synthetic.main.all__info__fragment.title
import kotlinx.android.synthetic.main.favorite_item.*
import niv.porat.cinema_world.databinding.AllInfoFragmentBinding
import niv.porat.cinema_world.ui.notifications.NotificationsViewModel
import niv.porat.cinema_world.models.Favorite

class All_Info_Fragment : Fragment() {

    private lateinit var viewModelFavorite: NotificationsViewModel

    private val args: All_Info_FragmentArgs by navArgs()

    private var _binding: AllInfoFragmentBinding? = null
    val binding: AllInfoFragmentBinding get() = _binding!!

    private lateinit var viewModel: AllInfoViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        viewModelFavorite = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        viewModel = ViewModelProvider(this).get(AllInfoViewModel::class.java)

        _binding = AllInfoFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        return super.onOptionsItemSelected(item)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val poster = args.productPhotoArgument
        val title2 = args.productTitleArgument
        val overview = args.productOverViewArgument
        val date2 = args.productDateArgument
        val rating = args.productRetingArgument

        Picasso.get().load(poster).into(imageInfoFragemt)
        title.text = title2
        overviewInfo.text = overview
        date.text = date2
        ratingBar.rating = rating

        val id = args.movieId


        if (NotificationsViewModel.appLiveData.value != null) {
            for (i in NotificationsViewModel.appLiveData.value!!.indices){
                if (NotificationsViewModel.appLiveData.value!![i].title == title2){
                    btn_toFavorite.isEnabled = false
                }
            }
        }

        btn_toFavorite.setOnClickListener {
            (NotificationsViewModel.addFavorite(Favorite(id, poster, title2)))
            btn_toFavorite.isEnabled = false
        }


    }


}