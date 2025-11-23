package com.example.carware.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import carware.composeapp.generated.resources.Res
import carware.composeapp.generated.resources.poppins_medium
import carware.composeapp.generated.resources.poppins_semibold
import com.example.carware.m
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

@Composable
fun HomeScreen(navController: NavController) {

    @OptIn(ExperimentalResourceApi::class)
    val popSemi = FontFamily(
        Font(Res.font.poppins_semibold ) // name of your font file without extension
    )

    val popMid = FontFamily(Font(Res.font.poppins_medium))

    Column (modifier=m.fillMaxSize()
    ){

    }


}