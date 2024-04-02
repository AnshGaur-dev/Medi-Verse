package com.example.medi_verse.Student

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
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
