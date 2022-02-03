package niv.porat.cinema_world.login

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.core.Tag
import niv.porat.cinema_world.R
import niv.porat.cinema_world.databinding.FragmentForgetPasswordBinding
import niv.porat.movie_world_project.utils.hideKeyboard
import niv.porat.movie_world_project.utils.isEmailValid

class Forget_Password_Fragment : Fragment() {

    private val email get() = binding.editTextTextEmailAddress.text.toString()

    private var _binding:FragmentForgetPasswordBinding? = null
    val binding:FragmentForgetPasswordBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View{
        // Inflate the layout for this fragment
       _binding = FragmentForgetPasswordBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonForgetSend.setOnClickListener {
            hideKeyboard(this.requireActivity())
            forgetPassword()
        }
    }


    fun forgetPassword() {
        if (!checkEmail()) {
            Snackbar.make(
                binding.buttonForgetSend,
                "Check The Email",
                Snackbar.LENGTH_LONG
            )
                .show()
            return
        }


        FirebaseAuth.getInstance().sendPasswordResetEmail(email)
            .addOnCompleteListener{task ->
                if (task.isSuccessful){
                    Snackbar.make(binding.buttonForgetSend,"Email,Sent",Snackbar.LENGTH_LONG)
                        .show()
                    findNavController().navigate(R.id.action_forget_Password_Fragment_to_FirstFragment)
                }else{
                    Snackbar.make(binding.buttonForgetSend,"Check Your Email",Snackbar.LENGTH_LONG)
                        .show()
                }
            }

    }






    fun checkEmail(): Boolean = binding.editTextTextEmailAddress.text.isEmailValid()
}