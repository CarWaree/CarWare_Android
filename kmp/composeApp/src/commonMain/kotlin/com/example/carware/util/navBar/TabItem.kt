package com.example.carware.util.navBar

import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.descriptors.StructureKind
import org.jetbrains.compose.resources.DrawableResource
import kotlin.reflect.KClass

data class TabItem(
    val route: KClass<out Any>,
    val title: String,
    val icon: DrawableResource,
    val index: Int
)
