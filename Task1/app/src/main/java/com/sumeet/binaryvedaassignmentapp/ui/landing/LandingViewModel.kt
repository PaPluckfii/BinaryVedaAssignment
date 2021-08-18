package com.sumeet.binaryvedaassignmentapp.ui.landing

import androidx.lifecycle.ViewModel
import com.sumeet.binaryvedaassignmentapp.model.LandingPageItem
import com.sumeet.binaryvedaassignmentapp.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LandingViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {

    fun getRecyclerList() : List<LandingPageItem>{
        return repository.getLandingItems()
    }

}