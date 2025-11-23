package com.example.carware.network

import kotlinx.serialization.Serializable

@Serializable
data class SignUpData(
    val isAuthenticated: Boolean,
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val roles: List<String>,
    val token: String,
    val expiresOn: String
)