package com.example.carware.session

import com.example.carware.util.UserSession
import platform.Foundation.NSUserDefaults

class IOSUserSession : UserSession {
    private val defaults = NSUserDefaults.standardUserDefaults()

    override suspend fun login(token: String) {
        defaults.setBool(true, "is_logged_in")
        defaults.setObject(token, "token")
    }

    override suspend fun logout() {
        defaults.removeObjectForKey("is_logged_in")
        defaults.removeObjectForKey("token")
    }

    override suspend fun isLoggedIn(): Boolean {
        return defaults.boolForKey("is_logged_in")
    }

    override suspend fun getToken(): String? {
        return defaults.stringForKey("token")
    }
}
