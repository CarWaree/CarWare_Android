package com.example.carware

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.carware.Screens.HomeScreen
import com.example.carware.Screens.LoginScreen
import com.example.carware.Screens.NewPasswordScreen
import com.example.carware.Screens.ResetPasswordScreen
import com.example.carware.Screens.VerificationCodeScreen
import com.example.carware.navigation.HomeScreen
import com.example.carware.navigation.LoginScreen
import com.example.carware.navigation.NewPasswordScreen
import com.example.carware.navigation.ResetPasswordScreen
import com.example.carware.navigation.SignUpScreen
import com.example.carware.navigation.VerificationCodeScreen
import com.example.carware.screens.SignUpScreen

val m= Modifier

@Composable
fun MainScreen() {
    val navController= rememberNavController()

    NavHost(navController=navController,
        startDestination = SignUpScreen,
        )
    {
        composable<SignUpScreen> {
            SignUpScreen(navController)
        }
        composable<LoginScreen> {
            LoginScreen(navController)
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


