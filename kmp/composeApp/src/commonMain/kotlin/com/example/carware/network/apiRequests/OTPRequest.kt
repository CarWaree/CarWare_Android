package com.example.carware.network.apiRequests

import kotlinx.serialization.Serializable

@Serializable
data class OTPRequest(
    val otp : String
)
