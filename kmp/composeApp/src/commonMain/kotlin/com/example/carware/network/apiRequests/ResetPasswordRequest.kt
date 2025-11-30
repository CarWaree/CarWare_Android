package com.example.carware.network.apiRequests

import kotlinx.serialization.Serializable

@Serializable
data class ResetPasswordRequest(
    val token: String?,
    val newPassword: String,
    val confirmPassword: String
)
