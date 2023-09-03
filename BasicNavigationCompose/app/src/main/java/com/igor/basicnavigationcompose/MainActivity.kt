package com.igor.basicnavigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.igor.basicnavigationcompose.navigation.SetupNavGraph
import com.igor.basicnavigationcompose.ui.theme.BasicNavigationComposeTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicNavigationComposeTheme {
                Box (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                ){
                    // predefined composable function which allow us to immediately create
                    // a nav host controller which will handle the navigation in our app
                    // it is the main component of our navigation
                    navController = rememberNavController()
                    SetupNavGraph(navHostController = navController)
                }
            }
        }
    }
}
