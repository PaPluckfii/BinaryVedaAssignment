package com.sumeet.binaryvedaassignmentapp.ui.adapters

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sumeet.binaryvedaassignmentapp.databinding.UploadItemLayoutBinding

class UploadsRecyclerAdapter(
    private val list : List<Drawable>
) : RecyclerView.Adapter<UploadsRecyclerAdapter.UploadsRecyclerViewHolder>(){

    inner class UploadsRecyclerViewHolder(private val binding: UploadItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun setData(drawable: Drawable) {
            Glide.with(binding.root).load(drawable).into(binding.ivImage)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UploadsRecyclerViewHolder {
        val binding = UploadItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UploadsRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UploadsRecyclerViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}