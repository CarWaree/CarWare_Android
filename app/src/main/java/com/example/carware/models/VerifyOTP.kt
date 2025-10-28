package com.example.carware.models


import com.google.gson.annotations.SerializedName

data class VerifyOTP(
    @SerializedName("email")
    val email: String,
    @SerializedName("otp")
    val otp: String
)