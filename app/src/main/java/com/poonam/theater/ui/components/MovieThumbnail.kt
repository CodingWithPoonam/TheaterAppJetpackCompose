package com.poonam.theater.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieThumbnail(
    modifier: Modifier = Modifier,
    @DrawableRes img: Int
) {
    Image(
        painter = painterResource(id = img),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .height(340.dp),
    )
}