package com.example.profilecardcompose.scenes.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.profilecardcompose.components.AppBar
import com.example.profilecardcompose.components.ProfileCard
import com.example.profilecardcompose.model.UserProfile

@Composable
fun UserListScreen(userProfiles: List<UserProfile> = listOf(), navController: NavHostController) {
    Scaffold(topBar = { AppBar(
        title = "Users List",
        icon = Icons.Default.Home
    ) }) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

            /*ListProfileCards(items = userProfiles) {
                navController.navigate("user_details/${userProfiles}")
            }*/

            LazyColumn {
                items(userProfiles){ userProfile ->
                    ProfileCard(profile = userProfile){
                        navController.navigate("user_details/${userProfile.id}")
                    }
                }
            }
        }
    }
}