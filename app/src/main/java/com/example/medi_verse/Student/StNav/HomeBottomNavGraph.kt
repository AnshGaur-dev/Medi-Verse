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
fun HomeBottomNavGraph(navController: NavHostController, context: Context) {
    NavHost(navController = navController,
        startDestination = HomeBottomBarScreen.Home.route ){
        composable(route = HomeBottomBarScreen.Home.route){
            Home(context,navController= navController)
        }
        composable(route = HomeBottomBarScreen.Announcements.route){
            Announcements()
        }
        composable(route = HomeBottomBarScreen.Feedback.route){
            Feedback()
        }
        composable(route = HomeBottomBarScreen.StLogin.route){

        }
    }
}