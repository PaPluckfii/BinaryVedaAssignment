package com.sumeet.binaryvedaassignmentapp.model

import com.sumeet.binaryvedaassignmentapp.R

object StaticLandingPageItemList {
    fun getList() : List<LandingPageItem>{
        val list : ArrayList<LandingPageItem> = ArrayList(8)
        val imageList = listOf(
            R.drawable.ic_landing_image_1,
            R.drawable.ic_landing_image_2,
            R.drawable.ic_landing_image_3,
            R.drawable.ic_landing_image_4,
            R.drawable.ic_landing_image_5,
            R.drawable.ic_landing_image_6,
            R.drawable.ic_landing_image_7,
            R.drawable.ic_landing_image_8
        )
        for (i in 0..7) {
            list.add(
                LandingPageItem(
                    imageList[i],
                    "lorem ipsum is used",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco."
                )
            )
        }
        return list
    }
}