package com.example.carware.util.onBoarding

import carware.composeapp.generated.resources.Res
import carware.composeapp.generated.resources.onBoard1
import carware.composeapp.generated.resources.onBoard3
import carware.composeapp.generated.resources.onBoarding2
import org.jetbrains.compose.resources.DrawableResource

data class OnboardingPage(
    val id: Int,
    val title: String,
    val description: String,
    val imageRes: DrawableResource // Will be handled differently per platform
)
object OnboardingConfig {
    val pages = listOf(
        OnboardingPage(
            id = 1,
            title = "Reliable Care You Can Trust",
            description = "Certified services, clear pricing, and \n" +
                    "quality you can depend on.",
            imageRes = Res.drawable.onBoard1
        ),
        OnboardingPage(
            id = 2,
            title = "Know Your Car’s Health",
            description = " Connect your OBD sensor to monitor engine health and" +
                    " detect issues instantly.",
            imageRes = Res.drawable.onBoarding2
        ),
        OnboardingPage(
            id = 3,
            title = "Ready to keep your car in top shape!",
            description = " Join thousands who trust CarWare.",
            imageRes = Res.drawable.onBoard3
        )
    )

}
