package com.example.carware.util
import com.russhwolf.settings.Settings


class LoginManager(private val session: UserSession) {
    private val KEY_ONBOARDING = "onboarding_complete"
    private val KEY_CAR_ADDED = "car_added_complete"
    private val settings = Settings()

    suspend fun performLogin(token: String?) {
        session.login(token) // save login state
    }

    suspend fun performLogout() {
        session.logout()
    }

     fun shouldAutoLogin(): Boolean {
        return session.isLoggedIn() // shared check logic
    }
    fun isOnboardingComplete() = settings.getBoolean(KEY_ONBOARDING, false)

    fun setOnboardingComplete() {
        settings.putBoolean(KEY_ONBOARDING, true)
    }

    fun hasAddedCar(): Boolean {
        return settings.getBoolean(KEY_CAR_ADDED, false)
    }

    fun setCarAdded(isAdded: Boolean) {
        settings.putBoolean(KEY_CAR_ADDED, isAdded)
    }


}
