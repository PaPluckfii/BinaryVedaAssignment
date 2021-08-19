package com.sumeet.binaryvedaassignmentapp.ui.profile.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.sumeet.binaryvedaassignmentapp.R
import com.sumeet.binaryvedaassignmentapp.databinding.FragmentViewPagerBinding
import com.sumeet.binaryvedaassignmentapp.ui.adapters.ViewPagerAdapter

class ViewPagerFragment : Fragment() {

    private lateinit var binding : FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()

    }

    /**
     * setting up viewpager.
     */
    private fun setUpViewPager() {
        binding.viewPager.adapter = ViewPagerAdapter(
                this,
                listOf(
                    UploadsFragment.newInstance(),
                    ExhibitionsFragment.newInstance(),
                    RevenueFragment.newInstance()
                )
            )

        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position ->
            tab.apply {
                text = when(position){
                    0 -> "Uploads"
                    1 -> "Exhibitions"
                    2 -> "Revenue"
                    else -> "Uploads"
                }
                icon = when(position){
                    0 -> context?.let { ContextCompat.getDrawable(it,R.drawable.icon_upload) }
                    1 -> context?.let { ContextCompat.getDrawable(it,R.drawable.icon_exibitions) }
                    2 -> context?.let { ContextCompat.getDrawable(it,R.drawable.icon_revenue) }
                    else -> context?.let { ContextCompat.getDrawable(it,R.drawable.icon_upload) }
                }
            }
        }.attach()
    }
}