package com.sumeet.binaryvedaassignmentapp.repository

import android.content.res.Resources
import com.sumeet.binaryvedaassignmentapp.R
import com.sumeet.binaryvedaassignmentapp.model.DummyProfile
import com.sumeet.binaryvedaassignmentapp.model.LandingPageItem
import com.sumeet.binaryvedaassignmentapp.model.StaticLandingPageItemList

class MyRepository {

    /**
     * Generating static data for the landing page recycler view.
     */
    fun getLandingItems(): List<LandingPageItem> {
        return StaticLandingPageItemList.getList()
    }

    fun getProfileData(): DummyProfile {
        return DummyProfile()
    }

}