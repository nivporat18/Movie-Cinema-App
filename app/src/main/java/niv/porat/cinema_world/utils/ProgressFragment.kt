package niv.porat.cinema_world.utils

import android.app.ProgressDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import niv.porat.cinema_world.MainViewModel

open class ProgressFragment: Fragment() {


    protected lateinit var mainViewModel: MainViewModel // shared
    private lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        progressDialog = ProgressDialog(requireContext())
        progressDialog.setCancelable(true)
        progressDialog.setMessage("Loading movies..")
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER)
        mainViewModel =
            ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

    }

    open fun dismissDialog() {
        progressDialog.dismiss()
    }
    open fun showDialog() {
        progressDialog.show()
    }

    override fun onPause() {
        super.onPause()
        mainViewModel.clearSearch()
    }
}