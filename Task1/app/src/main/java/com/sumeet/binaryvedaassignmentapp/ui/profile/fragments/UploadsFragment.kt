package com.sumeet.binaryvedaassignmentapp.ui.profile.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.sumeet.binaryvedaassignmentapp.R
import com.sumeet.binaryvedaassignmentapp.databinding.FragmentUploadsBinding
import com.sumeet.binaryvedaassignmentapp.model.DummyProfile
import com.sumeet.binaryvedaassignmentapp.ui.adapters.UploadsRecyclerAdapter
import com.sumeet.binaryvedaassignmentapp.ui.profile.ProfileViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UploadsFragment() : Fragment() {

    private lateinit var binding : FragmentUploadsBinding
    private val viewModel : ProfileViewModel by activityViewModels()
    private var listOfImages = ArrayList<Drawable>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUploadsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        createListOfDrawables()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = UploadsRecyclerAdapter(listOfImages)
        }
    }

    private fun createListOfDrawables() {
        val list = viewModel.getProfileData().picturesList
        for (i in list){
            context?.let { con ->
                ContextCompat.getDrawable(con,i)?.let {
                    listOfImages.add(it)
                }
            }
        }
    }

    companion object {
        fun newInstance() = UploadsFragment()
    }
}