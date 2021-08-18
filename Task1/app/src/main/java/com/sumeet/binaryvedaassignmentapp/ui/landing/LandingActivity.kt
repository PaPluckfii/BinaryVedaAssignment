package com.sumeet.binaryvedaassignmentapp.ui.landing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sumeet.binaryvedaassignmentapp.databinding.ActivityLandingBinding

class LandingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}