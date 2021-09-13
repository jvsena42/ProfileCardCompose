package com.example.profilecardcompose.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppBar(){
    TopAppBar(
        title = { Text(text = "Favorites") } ,
        navigationIcon = { Icon(Icons.Default.Home, "",Modifier.padding(horizontal = 12.dp)) }
    )
}