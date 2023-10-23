package com.coding_challenge.walmart_challenge.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.coding_challenge.walmart_challenge.R
import com.coding_challenge.walmart_challenge.databinding.FragmentHomeBinding

/**
 * Welcome home screen that allows user to click a button to show country list
 */
class HomeFragment : BaseFragment() {

    private  val binding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Navigate to ListFragment that shows list of countries
        binding.showButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_listFragment)
        }
        return binding.root
    }
}