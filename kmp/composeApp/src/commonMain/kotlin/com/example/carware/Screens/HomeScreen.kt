package com.example.carware.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import careware.composeapp.generated.resources.Res
import careware.composeapp.generated.resources.poppins_medium
import careware.composeapp.generated.resources.poppins_semibold
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text("Home Screen")
    }

    @OptIn(ExperimentalResourceApi::class)
    val popSemi = FontFamily(
        Font(Res.font.poppins_semibold ) // name of your font file without extension
    )

    val popMid = FontFamily(Font(Res.font.poppins_medium))
}