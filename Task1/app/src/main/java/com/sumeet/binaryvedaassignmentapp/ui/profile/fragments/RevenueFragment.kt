package com.sumeet.binaryvedaassignmentapp.ui.profile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sumeet.binaryvedaassignmentapp.R
import com.sumeet.binaryvedaassignmentapp.databinding.FragmentRevenueBinding

class RevenueFragment : Fragment() {

    private lateinit var binding : FragmentRevenueBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRevenueBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        fun newInstance() = RevenueFragment()
    }
}