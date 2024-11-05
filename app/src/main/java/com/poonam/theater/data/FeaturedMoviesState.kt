package com.poonam.theater.data

import androidx.annotation.DrawableRes
import com.poonam.theater.R

data class FeaturedMovieState(
    val id: Int,
    @DrawableRes val img: Int,
    val title: String,
    val description: String,
    val timeSlots: List<String>
)

val FeatureMoviesData = listOf(
    FeaturedMovieState(
        id = 0,
        img = R.drawable.img_movie_poster_2,
        title = "Jailer",
        description = "A retired jailer goes on a manhunt to find his son's killers. But the road leads him to a familiar, albeit a bit darker place",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM"
        )
    ),
    FeaturedMovieState(
        id = 1,
        img = R.drawable.img_movie_poster_0,
        title = "Scream",
        description = "A year after the murder of her mother, a teenage girl is terrorized by a masked killer who targets her and her friends by using scary movies as part of a deadly game.",
        timeSlots = listOf(
            "11:00 AM",
            "2:00 PM",
            "4:00 PM"
        )
    ),
    FeaturedMovieState(
        id = 2,
        img = R.drawable.img_movie_poster_4,
        title = "Scary Movie",
        description = "A year after disposing of the body of a man they accidentally killed, a group of dumb teenagers are stalked by a bumbling serial killer.",
        timeSlots = listOf(
            "3:30 PM",
            "6:00 PM",
            "8:30 PM"
        )
    ),
    FeaturedMovieState(
        id = 3,
        img = R.drawable.img_movie_poster_3,
        title = "Brave",
        description = "Merida (Kelly Macdonald), the impetuous but courageous daughter of Scottish King Fergus (Billy Connolly) and Queen Elinor (Emma Thompson), is a skilled archer who wants to carve out her own path in life. Her defiance of an age-old tradition angers the Highland lords and leads to chaos in the kingdom ",
        timeSlots = listOf(
            "11:00 AM",
            "2:00 PM",
            "4:00 PM"
        )
    )
)