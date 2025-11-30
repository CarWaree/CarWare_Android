package com.example.carware.network.apiResponse

import kotlinx.serialization.Serializable

@Serializable
data class ForgotPasswordResponse(
    val statusCode: Int,
    val message: String
)
