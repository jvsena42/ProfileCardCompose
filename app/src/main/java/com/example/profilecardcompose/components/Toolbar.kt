package com.example.profilecardcompose.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun AppBar(
    title: String = "",
    icon: ImageVector,
    iconClickAction: (() -> Unit)? = null
){
    TopAppBar(
        title = { Text(text = "Favorites") } ,
        navigationIcon = {
            Icon(
                Icons.Default.Home,
                "Back button",
                Modifier
                    .padding(horizontal = 12.dp)
                    .clickable { iconClickAction?.invoke() })
        }
    )
}