package com.sumeet.binaryvedaassignmentapp.ui.landing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sumeet.binaryvedaassignmentapp.R
import com.sumeet.binaryvedaassignmentapp.databinding.ActivityLandingBinding
import com.sumeet.binaryvedaassignmentapp.model.LandingPageItem
import com.sumeet.binaryvedaassignmentapp.ui.adapters.LandingPageAdapter
import com.sumeet.binaryvedaassignmentapp.ui.profile.ProfileActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LandingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingBinding
    private val viewModel : LandingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRecyclerView()
        handleListeners()

    }

    /**
     * Function to handle click listeners
     */
    private fun handleListeners() {
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.btnTrack.setOnClickListener {
            binding.scrollView.smoothScrollTo(0,binding.recyclerView.top,500)
        }
    }

    /**
     * Function to setup recycler view with the list of items.
     */
    private fun setUpRecyclerView() {
        val recyclerAdapter = LandingPageAdapter(viewModel.getRecyclerList())
        val linearLayoutManager = LinearLayoutManager(this)
        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = recyclerAdapter
        }
    }
}