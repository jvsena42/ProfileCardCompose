package com.example.profilecardcompose.scenes.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profilecardcompose.components.AppBar
import com.example.profilecardcompose.components.ProfileContent
import com.example.profilecardcompose.components.ProfilePicture
import com.example.profilecardcompose.model.UserProfile
import com.example.profilecardcompose.model.userProfileList

@Composable
fun UserProfileDetailsScreen(userId: Int) {
    val userProfile = userProfileList.first { userProfile -> userId == userProfile.id  }
    Scaffold(topBar = { AppBar() }) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                ProfilePicture(userProfile.imgId, userProfile.status,240.dp)
                ProfileContent(userProfile.name, userProfile.status, Alignment.CenterHorizontally)
            }
        }
    }
}