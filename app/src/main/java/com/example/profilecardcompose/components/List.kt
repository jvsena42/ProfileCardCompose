package com.example.profilecardcompose.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.profilecardcompose.model.UserProfile

@Composable
fun ListProfileCards(items:List<UserProfile>, clickAction: () -> Unit){
    LazyColumn {
        items(items){ userProfile ->
            ProfileCard(profile = userProfile){
                clickAction.invoke()
            }
        }
    }
}