package com.sumeet.binaryvedaassignmentapp.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.sumeet.binaryvedaassignmentapp.databinding.ActivityProfileBinding
import com.sumeet.binaryvedaassignmentapp.model.DummyProfile
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProfileBinding
    private val viewModel : ProfileViewModel by viewModels()
    private lateinit var profileData : DummyProfile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        profileData = viewModel.getProfileData()
        updateProfileData()

    }

    private fun updateProfileData() {
        Glide.with(binding.root).load(ContextCompat.getDrawable(this,profileData.profilePic))
            .into(binding.ivProfilePic)
        binding.apply {
            tvProfileName.text = profileData.profileName
            tvFollowers.text = profileData.followers
            tvArtWork.text = profileData.artWork
            tvExhibitions.text = profileData.exhibitions
            tvLikes.text = profileData.likes
            tvViews.text = profileData.views
            tvShare.text = profileData.share
        }
    }
}