package com.example.carware.network

import com.example.carware.models.ForgetPasswordRequest
import com.example.carware.models.LoginRequest
import com.example.carware.models.RegisterRequest
import com.example.carware.models.ResetPassword
import com.example.carware.models.VerifyOTP
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/Auth/login")
    suspend fun login(@Body request: LoginRequest): Response<Unit>

    @POST("api/Auth/register")
    suspend fun register(@Body request: RegisterRequest ): Response<Unit>

    @POST("/api/Auth/forgot-password")
    suspend fun forgotPassword (@Body request:ForgetPasswordRequest ): Response<Unit>

    @POST("/api/Auth/Verify-Otp")
    suspend fun verifyOTP (@Body request: VerifyOTP ): Response<Unit>

    @POST("/api/Auth/reset-password")
    suspend fun resetPassword (@Body request: ResetPassword ): Response<Unit>
    }