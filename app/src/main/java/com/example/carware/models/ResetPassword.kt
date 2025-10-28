package com.example.carware.models


import com.google.gson.annotations.SerializedName

data class ResetPassword(
    @SerializedName("confirmPassword")
    val confirmPassword: String,
    @SerializedName("newPassword")
    val newPassword: String,
    @SerializedName("token")
    val token: String,
    @SerializedName("userId")
    val userId: String
)