package com.example.carware.Screens

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import careware.composeapp.generated.resources.Res
import careware.composeapp.generated.resources.poppins_medium
import careware.composeapp.generated.resources.poppins_semibold
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font



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