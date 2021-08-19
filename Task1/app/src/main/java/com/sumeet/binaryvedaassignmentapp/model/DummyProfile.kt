package com.sumeet.binaryvedaassignmentapp.model

import com.sumeet.binaryvedaassignmentapp.R

/**
 * Dummy data class for profile
 */
data class DummyProfile(
    val profileName: String = "john.doe",
    val profilePic: Int = R.drawable.profile_pic,
    val followers : String = "2.3K",
    val artWork : String = "50",
    val exhibitions : String = "21",
    val likes : String = "120",
    val views : String = "43K",
    val share : String = "2.3K",
    val pelletsList : List<Int> = listOf(
        R.color.purple_700,
        R.color.cherry,
        R.color.cornflowerBlue
    ),
    val picturesList : List<Int> = listOf(
        R.drawable.pic_1,
        R.drawable.pic_2,
        R.drawable.pic_3,
        R.drawable.pic_4,
        R.drawable.pic_1,
        R.drawable.pic_2,
        R.drawable.pic_3,
        R.drawable.pic_4
    )
)
