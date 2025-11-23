package com.example.carware.screens

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color


fun Modifier.appGradBack(): Modifier = this.then(
    background(
        brush = Brush.verticalGradient(
            colors = listOf(
                Color(0xFFC20000),
                Color(0xFF5C0000)
            )
        )
    )
)

fun Modifier.appButtonBack(): Modifier = this.then(
    background(
        brush = Brush.horizontalGradient(
            colors = listOf(
                Color(0xFFC20000),
                Color(0xFF5C0000)
            )
        )
    )
)