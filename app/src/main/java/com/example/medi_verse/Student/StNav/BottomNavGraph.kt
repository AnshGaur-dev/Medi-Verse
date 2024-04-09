package com.example.medi_verse.Student.StNav

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.medi_verse.Student.Screens.Announcements
import com.example.medi_verse.Student.Screens.Feedback
import com.example.medi_verse.Student.Screens.Home

@Composable
fun BottomNavGraph(navController: NavHostController, context: Context) {
    NavHost(navController = navController,
        startDestination = BottomBarScreen.Home.route ){
        composable(route = BottomBarScreen.Home.route){
            Home(context)
        }
        composable(route = BottomBarScreen.Announcements.route){
            Announcements()
        }
        composable(route = BottomBarScreen.Feedback.route){
            Feedback()
        }




    }
}