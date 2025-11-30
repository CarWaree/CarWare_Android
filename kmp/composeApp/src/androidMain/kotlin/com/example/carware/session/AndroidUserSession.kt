package com.example.carware.session

import android.content.Context
import com.example.carware.util.UserSession

class AndroidUserSession(private val context: Context) : UserSession {
    private val prefs = context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

    override suspend fun login(token: String) {
        prefs.edit().putBoolean("is_logged_in", true).apply()
        prefs.edit().putString("token", token).apply()
    }

    override suspend fun logout() {
        prefs.edit().clear().apply()
    }

    override  fun isLoggedIn(): Boolean {
        return prefs.getBoolean("is_logged_in", false)
    }

    override suspend fun getToken(): String? {
        return prefs.getString("token", null)
    }
}
