package com.igor.basicnavigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.igor.basicnavigationcompose.screens.Screen
import com.igor.basicnavigationcompose.screens.HomeScreen
import com.igor.basicnavigationcompose.screens.SecondScreen

@Composable
fun SetupNavGraph (
    navHostController: NavHostController
) {
    // inside this NavHost we will put all our destinations as composable
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route // home screen is our default destination when init
    ) {
        // each composable above is one destination that our navController can send us
        composable (route = Screen.Home.route) {
            HomeScreen(navController = navHostController)
        }
        composable (route = Screen.Second.route) {
            SecondScreen(navController = navHostController)
        }
    }
}