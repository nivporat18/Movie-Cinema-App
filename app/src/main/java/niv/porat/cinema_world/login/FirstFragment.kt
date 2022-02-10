package niv.porat.cinema_world.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import niv.porat.cinema_world.MainActivity
import niv.porat.cinema_world.R
import niv.porat.cinema_world.databinding.FragmentFirstBinding
import niv.porat.movie_world_project.utils.hideKeyboard
import niv.porat.movie_world_project.utils.isEmailValid


class FirstFragment : Fragment() {


    private val email get() = binding.etEmailLogin.text.toString()
    private val password get() = binding.etPasswordLogin.text.toString()

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogin.setOnClickListener {
            hideKeyboard(this.requireActivity())
            login()
        }


        binding.textViewToRegister.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.textViewForgetPassword.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_forget_Password_Fragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun login() {
        if (!checkEmail() || !checkPassword()) {
            Snackbar.make(
                binding.buttonLogin,
                "Check The Email Or password",
                Snackbar.LENGTH_LONG
            )
                .show()
            return
        }

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                val intent = Intent(this.requireActivity(), MainActivity::class.java)
                startActivity(intent)
            }
            .addOnFailureListener {
                Snackbar.make(binding.buttonLogin, "Unknown error, try again", Snackbar.LENGTH_LONG)
                    .show()
            }
    }


    fun checkEmail(): Boolean = binding.etEmailLogin.text.toString().isEmailValid()
    fun checkPassword(): Boolean = binding.etPasswordLogin.text.toString().length >= 6
}