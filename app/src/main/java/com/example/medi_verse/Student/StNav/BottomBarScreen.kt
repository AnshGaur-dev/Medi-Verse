package com.example.medi_verse.Student.StNav

import com.example.medi_verse.R


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val drawableId: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        drawableId = R.drawable.home
    )

    object Announcements : BottomBarScreen(
        route = "announcements",
        title = "Announcements",
        drawableId = R.drawable.annoucements
    )

    object Feedback : BottomBarScreen(
        route = "feedback",
        title = "Feedback",
        drawableId = R.drawable.feedback

    )
}
