package com.example.careware

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform