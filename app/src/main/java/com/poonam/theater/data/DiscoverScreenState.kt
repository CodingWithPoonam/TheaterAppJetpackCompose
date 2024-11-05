package com.poonam.theater.data

data class DiscoverScreenState(
    val featureMovies: List<FeaturedMovieState> = FeatureMoviesData,
    val upcomingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatchedMovies: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovies: List<MovieThumbnailState> = StreamingMoviesData,

    ) {
}