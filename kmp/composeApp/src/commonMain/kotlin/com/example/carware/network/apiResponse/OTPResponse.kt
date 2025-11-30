package com.example.carware.network.apiResponse

import kotlinx.serialization.Serializable

@Serializable
data class OTPResponse(
    val token: String,
    val statusCode: Int,
    val message:String

)
