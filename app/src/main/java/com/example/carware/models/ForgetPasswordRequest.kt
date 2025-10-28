package com.example.carware.models


import com.google.gson.annotations.SerializedName

data class ForgetPasswordRequest(
    @SerializedName("email")
    val email: String
)