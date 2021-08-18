package com.sumeet.binaryvedaassignmentapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sumeet.binaryvedaassignmentapp.databinding.LandingItemLayoutBinding
import com.sumeet.binaryvedaassignmentapp.model.LandingPageItem

class LandingPageAdapter(
    private val list : List<LandingPageItem>
) : RecyclerView.Adapter<LandingPageAdapter.LandingPageViewHolder>(){

    inner class LandingPageViewHolder(private val binding: LandingItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun setData(landingPageItem: LandingPageItem) {
            Glide.with(binding.root).load(landingPageItem.image).into(binding.ivIcon)
            binding.tvHeading.text = landingPageItem.heading
            binding.tvContent.text = landingPageItem.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandingPageViewHolder {
        val binding = LandingItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandingPageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LandingPageViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}