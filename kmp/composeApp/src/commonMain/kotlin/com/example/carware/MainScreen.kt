package com.example.carware

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carware.navigation.HomeScreen
import com.example.carware.navigation.LoginScreen
import com.example.carware.navigation.NewPasswordScreen
import com.example.carware.navigation.OnboardingScreen
import com.example.carware.navigation.ResetPasswordScreen
import com.example.carware.navigation.SignUpScreen
import com.example.carware.navigation.VerificationCodeScreen
import com.example.carware.screens.HomeScreen
import com.example.carware.screens.OnBoardingScreen
import com.example.carware.screens.auth.LoginScreen
import com.example.carware.screens.auth.NewPasswordScreen
import com.example.carware.screens.auth.ResetPasswordScreen
import com.example.carware.screens.auth.SignUpScreen
import com.example.carware.screens.auth.VerificationCodeScreen
import com.example.carware.util.LoginManager

val m= Modifier

@Composable
fun MainScreen(loginManager: LoginManager) {
    val navController= rememberNavController()

    val startDestination = if (!loginManager.isOnboardingComplete()) {
        OnboardingScreen
    } else {
        SignUpScreen
    }

        NavHost(
            navController = navController,
            startDestination = startDestination,
        )
        {
            composable<OnboardingScreen> {
                OnBoardingScreen(navController,loginManager)
            }
            composable<SignUpScreen> {
                SignUpScreen(navController, loginManager)
            }
            composable<LoginScreen> {
                LoginScreen(navController, loginManager)
            }
            composable<HomeScreen> {
                HomeScreen(navController)
            }
            composable<ResetPasswordScreen> {
                ResetPasswordScreen(navController)
            }
            composable<VerificationCodeScreen> {
                VerificationCodeScreen(navController)
            }
            composable<NewPasswordScreen> {
                NewPasswordScreen(navController)
            }


        }


    }



