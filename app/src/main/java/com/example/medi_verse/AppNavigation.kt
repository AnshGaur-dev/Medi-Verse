package com.example.medi_verse

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.medi_verse.Student.HomeMainScreen
import com.example.medi_verse.Student.StNav.HomeBottomBarScreen
import com.example.medi_verse.StudentLoginSignup.Signup
import com.example.medi_verse.StudentLoginSignup.StLogin

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
        composable(route=AppScreens.StLogin.route){
            StLogin(AppnavController = navController)
        }
        composable(route=AppScreens.HomeMainScreen.route){
            HomeMainScreen(context)
        }
        composable(route=AppScreens.StSignUp.route){
            Signup(AppnavController = navController)
        }
    }
}
