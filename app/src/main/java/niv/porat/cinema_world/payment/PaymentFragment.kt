package niv.porat.cinema_world.payment

import android.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import kotlinx.android.synthetic.main.payment_fragment.*
import niv.porat.cinema_world.R
import niv.porat.cinema_world.databinding.PaymentFragmentBinding
import niv.porat.cinema_world.models.Payment
import niv.porat.cinema_world.models.Ticket
import niv.porat.movie_world_project.utils.hideKeyboard


class PaymentFragment : Fragment() {

    private var _binding: PaymentFragmentBinding? = null
    val binding: PaymentFragmentBinding get() = _binding!!

    private lateinit var viewModel: PaymentViewModel

    private val args: PaymentFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        viewModel = ViewModelProvider(this).get(PaymentViewModel::class.java)
        _binding = PaymentFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val json = args.ticket
        val gson = Gson()
        val ticket = gson.fromJson(json, Ticket::class.java)

        binding.TotalPay.text = "Price: ${ticket.numberOfTickets * 35}"
        val fullName = binding.etPaymentName.text
        val numberCard = binding.etCardNumber.text
        val cvv = binding.etCvv.text
        val expiry = binding.etExpiry.text
        binding.tvNumberTicket.text = "NumberTicket: ${ticket.numberOfTickets} "
        binding.locationMovie.text = "Location: ${ticket.location}"
        binding.nameMovie.text = "Movie: ${ticket.movie}"
        binding.timeMovie.text = "Time: ${ticket.time}"

        binding.etExpiry.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var prev = binding.etExpiry.text
                if (p0!!.length == 2 && !p0.contains("/") && prev.length >= p0.length) {
                    binding.etExpiry.setText("${p0}/")
                    binding.etExpiry.setSelection(binding.etExpiry.text.length)
                }
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
        binding.btnPay.setOnClickListener {
            hideKeyboard(this.requireActivity())
            AlertDialog.Builder(this.requireContext()).setTitle("Confirm")
                .setMessage("${ticket.numberOfTickets} Tickets for: ${ticket.movie}\n" +
                        "Price: ${ticket.numberOfTickets * 35}\n" +
                        "Location: ${ticket.location} \n" +
                        "Time: ${ticket.time}\n" +
                        "Full Name:  $fullName \n" +
                        "Number Card: $numberCard \n" +
                        "CVV:  $cvv \n" +
                        "Expiry: $expiry\n")
                .setPositiveButton("Confirm") { _, _ ->
                    Toast.makeText(requireContext(),
                        "Thanks For Purchase, Enjoy The Movie ",
                        Toast.LENGTH_LONG).show()
                    PaymentViewModel.addToPayment(Payment(name = fullName.toString(),
                        totalPrice = (ticket.numberOfTickets * 35),
                        cardNumber = numberCard.toString(),
                        cvv = cvv.toString(),
                        expiry = expiry.toString()))
                    findNavController().navigate(R.id.action_paymentFragment_to_navigation_home)
                }
                .setNegativeButton("Cancel") { _, _ ->

                }.show()


        }

        binding.btnChancel.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_navigation_home)
        }
    }


}




