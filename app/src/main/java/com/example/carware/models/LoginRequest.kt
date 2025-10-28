package com.example.carware.models


import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("emailOrUsername")
    val emailOrUsername: String,
    @SerializedName("password")
    val password: String
)