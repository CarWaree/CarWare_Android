package com.example.carware.util

interface UserSession {
    suspend fun login(token: String)
    suspend fun logout()
    suspend fun isLoggedIn(): Boolean
    suspend fun getToken(): String?
}
