package com.sumeet.binaryvedaassignmentapp.ui.profile

import androidx.lifecycle.ViewModel
import com.sumeet.binaryvedaassignmentapp.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel() {
}