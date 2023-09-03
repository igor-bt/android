package com.igor.basicnavigationcompose.screens

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Second: Screen(route = "second_screen")
}
