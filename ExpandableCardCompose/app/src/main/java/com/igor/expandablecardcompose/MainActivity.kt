package com.igor.expandablecardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.igor.expandablecardcompose.ui.theme.ExpandableCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCardComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp)
                    ) {
                        ExpandableCard(
                            title = "Uncertainty Principle",
                            description = "In quantum mechanics, the uncertainty principle (also" +
                                    " known as Heisenberg's uncertainty principle) is any of a" +
                                    " variety of mathematical inequalities asserting a fundamental" +
                                    " limit to the product of the accuracy of certain related pairs" +
                                    " of measurements on a quantum system, such as position, x," +
                                    " and momentum, Such paired-variables are known as" +
                                    " complementary variables or canonically conjugate variables."
                        )
                    }
                }
            }
        }
    }
}


