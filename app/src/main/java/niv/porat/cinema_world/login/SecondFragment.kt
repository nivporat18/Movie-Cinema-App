package niv.porat.cinema_world.login

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import niv.porat.cinema_world.MainViewModel
import niv.porat.cinema_world.R
import niv.porat.cinema_world.databinding.FragmentSecondBinding
import niv.porat.movie_world_project.utils.hideKeyboard
import niv.porat.movie_world_project.utils.isEmailValid


class SecondFragment : Fragment() {

    private val email get() = binding.etEmailRegister.text.toString()
    private val password get() = binding.etPasswordRegister.text.toString()
    private var _binding: FragmentSecondBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

      _binding = FragmentSecondBinding.inflate(inflater, container, false)
      return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonRegister.setOnClickListener {
            hideKeyboard(this.requireActivity())
            register()
        }

    }


override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun register() {
        if (!checkEmail() || !checkPassword()) {
            Snackbar.make(binding.buttonRegister,
                "Email And Password Must Be Valid",
                Snackbar.LENGTH_LONG).show()
            return
        }
        val progress = ProgressDialog(context)
        progress.setTitle("Cinema World")
        progress.setMessage("Loading..")
        progress.setCancelable(false)
        progress.show()

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                FirebaseAuth.getInstance().signOut()
                progress.hide()
                findNavController().popBackStack()

            }
            .addOnFailureListener {
                progress.hide()
                Snackbar.make(binding.buttonRegister,it.localizedMessage ?: "Unknown error,try again"
                    , Snackbar.LENGTH_LONG).show()
            }
    }

    fun checkEmail(): Boolean = binding.etEmailRegister.text.isEmailValid()
    fun checkPassword(): Boolean = binding.etPasswordRegister.text.length >= 6
    fun checkFirstName(): Boolean = binding.etPasswordRegister.text.length >= 2
    fun checkLastName(): Boolean = binding.etPasswordRegister.text.length >= 2
}