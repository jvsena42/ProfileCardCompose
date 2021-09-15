package com.example.profilecardcompose.scenes.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.profilecardcompose.components.AppBar
import com.example.profilecardcompose.components.ListProfileCards
import com.example.profilecardcompose.model.UserProfile
import com.example.profilecardcompose.model.userProfileList

@Composable
fun UserListScreen(userProfiles: List<UserProfile> = userProfileList) {
    Scaffold(topBar = { AppBar() }) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            ListProfileCards(items = userProfiles)
        }
    }
}