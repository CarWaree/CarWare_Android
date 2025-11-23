package com.example.carware.network.apiRequests

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    val emailOrUsername: String,
    val password: String
)