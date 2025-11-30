package com.example.carware.screens.mainScreens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.carware.navigation.HistoryScreen

@Composable
fun HistoryScreen(navController: NavController){

    Text("History", color = Color(16, 0, 0, 255))
}