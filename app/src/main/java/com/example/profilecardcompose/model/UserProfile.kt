package com.example.profilecardcompose.model

import com.example.profilecardcompose.R

data class UserProfile(
    var name: String = "",
    var status: Boolean = true,
    var imgId: Int = R.drawable.profile
)
