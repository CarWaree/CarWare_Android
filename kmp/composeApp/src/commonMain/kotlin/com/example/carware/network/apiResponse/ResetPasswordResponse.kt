package com.example.carware.network.apiResponse

import kotlinx.serialization.Serializable

@Serializable
data class ResetPasswordResponse(
    val statusCode: Int,
    val message: String
)
