package com.example.medi_verse.Student

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.medi_verse.Student.Screens.Announcements
import com.example.medi_verse.Student.Screens.Feedback
import com.example.medi_verse.Student.Screens.Home

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = BottomBarScreen.Home.route ){
        composable(route = BottomBarScreen.Home.route){
            Home()
        }
        composable(route = BottomBarScreen.Announcements.route){
            Announcements()
        }
        composable(route = BottomBarScreen.Feedback.route){
            Feedback()
        }


    }
}