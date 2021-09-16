package com.example.profilecardcompose.scenes.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.profilecardcompose.model.UserProfile
import com.example.profilecardcompose.model.userProfileList
import com.example.profilecardcompose.ui.theme.ProfileCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCardComposeTheme() {
                UsersApplication()
            }
        }
    }
}

@Composable
fun UsersApplication(userProfiles: List<UserProfile> = userProfileList){
    val navController = rememberNavController()
    NavHost(navController = navController,startDestination =  "users_list" ){
        composable("users_list"){
            UserListScreen(userProfiles = userProfiles,navController = navController)
        }
        composable("user_details"){
            UserProfileDetailsScreen()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ProfileCardComposeTheme() {
        UsersApplication()
    }
}