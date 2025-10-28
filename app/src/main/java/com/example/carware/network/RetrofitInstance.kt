package com.example.carware.network

import  retrofit2.Retrofit
import  retrofit2.converter.gson.GsonConverterFactory
import com.example.carware.network.ApiService


object RetrofitInstance{
    private const val BASE_URL="https://untortious-konnor-extravertively.ngrok-free.dev/"

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // 👇 this is the key line
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}