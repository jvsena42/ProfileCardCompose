package com.example.profilecardcompose.scenes.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.profilecardcompose.components.AppBar
import com.example.profilecardcompose.components.ListProfileCards
import com.example.profilecardcompose.model.UserProfile
import com.example.profilecardcompose.model.userProfileList

@Composable
fun UserListScreen(userProfiles: List<UserProfile> = listOf(), navController: NavHostController) {
    Scaffold(topBar = { AppBar() }) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

            ListProfileCards(items = userProfiles) {
                navController.navigate("user_details")
            }
        }
    }
}