package com.example.carware.models


import com.google.gson.annotations.SerializedName

data class RegisterRequest(
    @SerializedName("agreeToTerms")
    val agreeToTerms: Boolean,
    @SerializedName("confirmPassword")
    val confirmPassword: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
    @SerializedName("username")
    val username: String
)