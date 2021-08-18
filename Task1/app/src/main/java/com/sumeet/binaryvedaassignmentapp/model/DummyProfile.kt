package com.sumeet.binaryvedaassignmentapp.model

import com.sumeet.binaryvedaassignmentapp.R

data class DummyProfile(
    val profileName: String = "john.doe",
    val profilePic: Int = R.drawable.profile_pic,
    val followers : Int = 2300,
    val artWork : Int = 50,
    val exhibitions : Int = 21,
    val likes : Int = 120,
    val views : Int = 4300,
    val share : Int = 2300,
    val pelletsList : List<Int> = listOf(
        R.color.purple_700,
        R.color.cherry,
        R.color.cornflowerBlue
    ),
    val picturesList : List<Int> = listOf(
//        R.drawable
    )
)
