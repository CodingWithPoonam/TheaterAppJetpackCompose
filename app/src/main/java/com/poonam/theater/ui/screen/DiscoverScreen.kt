package com.poonam.theater.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.poonam.theater.data.DiscoverScreenState
import com.poonam.theater.data.FeaturedMovieState
import com.poonam.theater.ui.components.section.ComingSoonSection
import com.poonam.theater.ui.components.section.FeatureMoviesSection
import com.poonam.theater.ui.components.section.HorizontalSection

@Composable
fun DiscoveryScreen(
    modifier: Modifier = Modifier, screenState: DiscoverScreenState
) {
    val scrollableState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollableState),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        FeatureMoviesSection(data = screenState.featureMovies)
        ComingSoonSection(
            data = screenState.upcomingMovies,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        HorizontalSection(
            data = screenState.recentlyWatchedMovies,
            name = "Recently Watched"
        )
        HorizontalSection(
            data = screenState.streamingMovies,
            name = "Streaming on Demand"
        )
    }
}


