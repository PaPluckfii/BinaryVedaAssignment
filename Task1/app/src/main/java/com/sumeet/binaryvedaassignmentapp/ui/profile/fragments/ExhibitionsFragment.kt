package com.sumeet.binaryvedaassignmentapp.ui.profile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sumeet.binaryvedaassignmentapp.R
import com.sumeet.binaryvedaassignmentapp.databinding.FragmentExibitionsBinding
import com.sumeet.binaryvedaassignmentapp.ui.profile.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

class ExhibitionsFragment : Fragment() {

    private lateinit var binding : FragmentExibitionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExibitionsBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
        fun newInstance() = ExhibitionsFragment()
    }
}