package com.example.medi_verse.ClubAdmin

import android.graphics.drawable.AdaptiveIconDrawable
import com.example.medi_verse.R
import com.example.medi_verse.Student.StNav.HomeBottomBarScreen

sealed class ClubAdminBottomBarScreen (
    val route:String,
    val title:String,
    val drawableId: Int
){
    object Home : ClubAdminBottomBarScreen(
        route = "home",
        title = "Home",
        drawableId = R.drawable.home
    )
    object AddPost:ClubAdminBottomBarScreen(
        route = "addpost",
        title = "AddPost",
        drawableId =R.drawable.addmg
    )
    object Feedback:ClubAdminBottomBarScreen(
        route = "addpost",
        title = "Feedback",
        drawableId =R.drawable.addmg
    )


}