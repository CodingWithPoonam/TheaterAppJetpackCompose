package com.poonam.theater.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.poonam.theater.data.DiscoverScreenState
import com.poonam.theater.data.FeaturedMovieState
import com.poonam.theater.ui.components.section.FeatureMoviesSection

@Composable
fun DiscoveryScreen(
    modifier: Modifier = Modifier, screenState: DiscoverScreenState
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        FeatureMoviesSection(data = screenState.featureMovies)
    }
}

