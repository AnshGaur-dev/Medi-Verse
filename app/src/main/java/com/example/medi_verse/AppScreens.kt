package com.example.medi_verse

import java.util.Scanner


sealed class AppScreens(val route: String) {
object FirstPage :AppScreens("AppScreens")
object Login :AppScreens("Login")
object Decision :AppScreens("Decision")
object HomeMainScreen :AppScreens("HomeMainScreen")
object SignUp :AppScreens("Signup")

}