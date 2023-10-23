package com.coding_challenge.walmart_challenge.fragments

import android.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.coding_challenge.walmart_challenge.viewmodel.CountriesViewModel

open class BaseFragment : Fragment() {

    protected val countriesViewModel: CountriesViewModel by viewModels()

    fun errorBox(
        message: String = "Trying to resolve issue...",
        retry: () -> Unit){
        AlertDialog.Builder(requireContext())
            .setTitle("ERROR HAS OCCURRED.")
            .setPositiveButton("Retry"){
                    dialog, _ -> dialog.dismiss()
                retry()
            }
            .setNegativeButton("Dismiss"){
                    dialog, _ -> dialog.dismiss()
            }
            .setMessage(message)
            .create()
            .show()
    }

}