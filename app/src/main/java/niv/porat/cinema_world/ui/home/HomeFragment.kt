package niv.porat.cinema_world.ui.home


import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.SearchView
import android.widget.Spinner
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.gson.Gson
import kotlinx.android.synthetic.main.payment_fragment.view.*
import niv.porat.cinema_world.Category
import niv.porat.cinema_world.R
import niv.porat.cinema_world.SearchResult
import niv.porat.cinema_world.adapter.*
import niv.porat.cinema_world.databinding.FragmentHomeBinding
import niv.porat.cinema_world.models.Location
import niv.porat.cinema_world.models.Ticket
import niv.porat.cinema_world.utils.ProgressFragment


class HomeFragment : ProgressFragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null


    lateinit var spinnerLocation: Spinner
    lateinit var spinnerTime: Spinner
    lateinit var spinnerTicket: Spinner
    lateinit var spinnerMovie: Spinner

    var ticket = Ticket()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun doTransition(result: SearchResult) {
        val controller = findNavController()
        when (result.category) {
            "popular_movie", "rated_movie" -> {
                controller.navigate(R.id.action_navigation_home_to_navigation_dashboard)
            }
            "popular_tv", "rated_tv" -> {
                controller.navigate(R.id.action_navigation_home_to_navigation_tvshow)
            }
        }
    }


    fun addObservers() {

        mainViewModel.moviePopularSearch.observe(viewLifecycleOwner, {
            println(mainViewModel.searchAction)
            if (mainViewModel.searchAction) {
                doTransition(it)
            }
            mainViewModel.searchAction = false
        })
        mainViewModel.movieRatedSearch.observe(viewLifecycleOwner, {
            println(mainViewModel.searchAction)
            if (mainViewModel.searchAction) {
                doTransition(it)
            }
            mainViewModel.searchAction = false
        })

        mainViewModel.tvRatedSearch.observe(viewLifecycleOwner, {
            println(mainViewModel.searchAction)
            if (mainViewModel.searchAction) {
                doTransition(it)
            }
            mainViewModel.searchAction = false
        })
        mainViewModel.tvPopularSearch.observe(viewLifecycleOwner, {
            println(mainViewModel.searchAction)
            if (mainViewModel.searchAction) {
                doTransition(it)
            }
            mainViewModel.searchAction = false
            dismissDialog()
        })
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinnerLocation = binding.spinner
        addObservers()
        val listLocation = listOf("Rishon Lezion",
            "Kfar-Saba",
            "Jerusalem",
            "Jerusalem (VIP)",
            "Herzeliya","Herzeliya(VIP)")


        val adapter = LocationAdapter(listLocation)



        spinnerLocation.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val location = listLocation[p2]
                ticket.location = location
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        spinnerLocation.adapter = adapter
        setHasOptionsMenu(true)

//<--------------------------------------------spinner Time------------------------------------------------------->

        spinnerTime = binding.spinnerChooseTime
        val listTime = listOf(
            "12:00","12:30", "13:00", "13:30",
            "14:00", "15:00", "19:00", "19:30", "21:00",
            "22:00", "23:00", "23:30",
        )

        val adapterTime = SpinnerTimeAdapter(listTime)

        spinnerTime.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val time = listTime[p2]
                ticket.time = time
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        spinnerTime.adapter = adapterTime

//<--------------------------------------------spinner Ticket------------------------------------------------------->

        spinnerTicket = binding.spinnerTicket
        val listTicket = listOf(
            1,
            2,
            3,
            4,
            5
        )

        val adapterTicket = TicketSpinnerAdapter(listTicket)

        binding.btnBuyTicket.setOnClickListener {
            if (ticket.movie.isEmpty() || ticket.numberOfTickets == 0 || ticket.time.isEmpty() || ticket.location.isEmpty()) {
                Toast.makeText(requireContext(),"Please select for all the fields",Toast.LENGTH_LONG).show()

            }else {
                val gson = Gson()
                val json = gson.toJson(ticket)
                val actionTicket =
                    HomeFragmentDirections.actionNavigationHomeToPaymentFragment(json)
                view.findNavController().navigate(actionTicket)
            }
        }

        spinnerTicket.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val numberOfTickets = listTicket[p2]
                ticket.numberOfTickets = numberOfTickets

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        spinnerTicket.adapter = adapterTicket


//<--------------------------------------------spinner movie------------------------------------------------------->

        spinnerMovie = binding.spinnerChooseMovie

        var allMovieNames:List<String> = mutableListOf()
        mainViewModel.allMoviesNames.observe(viewLifecycleOwner) {
            val adapterMovie = SpinnerMovieAdapter(it)
            allMovieNames = it
            spinnerMovie.adapter = adapterMovie
        }



        spinnerMovie.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val movie = allMovieNames[p2]
                ticket.movie = movie
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }



    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar, menu)

        val item = menu.findItem(R.id.search_action)
        val searchView = item.actionView as SearchView
        println("Created")
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if (p0 != null) {
                    mainViewModel.setSearchQuery(p0, listOf(Category.ALL))
                }
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {

                return false
            }

        })

    }

    override fun onResume() {
        super.onResume()
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            val email = user!!.email
            val name = email!!.split("@")[0]
            Toast.makeText(requireContext(), "Welcome, $name", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}