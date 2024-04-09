package com.example.medi_verse

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.medi_verse.Student.HomeMainScreen

@Composable
fun AppNavigation(context: Context) {
    val navController= rememberNavController()
    NavHost(navController =navController , startDestination = AppScreens.FirstPage.route ){
        composable(route=AppScreens.FirstPage.route){
            FirstPage(AppnavController=navController)
        }
        composable(route=AppScreens.Decision.route){
            DecisionPage(AppnavController=navController)
        }
        composable(route=AppScreens.Login.route){
            Login(AppnavController=navController)
        }
        composable(route=AppScreens.HomeMainScreen.route){
            HomeMainScreen(context)
        }
        composable(route=AppScreens.SignUp.route){
            Signup(AppnavController = navController)
        }
    }
}
