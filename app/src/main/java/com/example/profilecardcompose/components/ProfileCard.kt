package com.example.profilecardcompose.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.example.profilecardcompose.R
import com.example.profilecardcompose.model.UserProfile

@Composable
fun ProfileCard(profile: UserProfile) {
    Card(
        modifier = Modifier
            .padding(horizontal = 16.dp,vertical = 8.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture(profile.imgId, profile.status)
            ProfileContent(profile.name, profile.status)
        }
    }
}

@Composable
private fun ProfilePicture(id: String, active: Boolean) {
    Card(
        shape = CircleShape,
        border = BorderStroke(
            width = 2.dp,
            color = if (active) Color.Green else Color.Red
        ),
        modifier = Modifier.padding(16.dp),
        elevation = 4.dp
    ) {
        Image(
            painter = rememberImagePainter(id,
                builder = {
                    crossfade(true)
                    placeholder(R.drawable.profile)
                    transformations(CircleCropTransformation())
                }),
            contentDescription = null,
            modifier = Modifier.size(72.dp),
        )
        /*Image(
            painter = painterResource(id = id),
            contentDescription = "",
            modifier = Modifier.size(72.dp),
            contentScale = ContentScale.Crop
        )*/
    }

}

@Composable
private fun ProfileContent(name: String, active: Boolean) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(text = name, style = MaterialTheme.typography.h5)

        Text(
            text = if(active) "Active Now" else "Offline",
            style = MaterialTheme.typography.body2,
            color = Color.LightGray
        )
    }
}