package com.example.carware.network.apiResponse

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    val data: UserData,
    val statusCode: Int,
    val message: String
)
@Serializable
data class UserData(
    val isAuthenticated: Boolean,
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val roles: List<String>,
    val token: String,
    val expiresOn: String
)