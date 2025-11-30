package com.example.carware.util.onBoarding


import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class OnboardingViewModel {
    // Current page state
    private val _currentPage = MutableStateFlow(0)
    val currentPage: StateFlow<Int> = _currentPage.asStateFlow()

    // Computed properties
    val totalPages: Int get() = OnboardingConfig.pages.size
    val isLastPage: Boolean get() = _currentPage.value == totalPages - 1
    val isFirstPage: Boolean get() = _currentPage.value == 0

    // Get current page data
    fun getCurrentPageData(): OnboardingPage {
        return OnboardingConfig.pages[_currentPage.value]
    }

    // Navigation methods
    fun nextPage() {
        if (!isLastPage) {
            _currentPage.value++
        }
    }

    fun previousPage() {
        if (!isFirstPage) {
            _currentPage.value--
        }
    }

    fun skipToEnd() {
        _currentPage.value = totalPages - 1
    }

    fun setCurrentPage(page: Int) {
        _currentPage.value = page.coerceIn(0, totalPages - 1)
    }

    fun completeOnboarding() {
        // Here you would typically:
        // 1. Save that onboarding was completed (to shared preferences/database)
        // 2. Navigate to main screen (handled by each platform)
        println("Onboarding completed!")
    }
}