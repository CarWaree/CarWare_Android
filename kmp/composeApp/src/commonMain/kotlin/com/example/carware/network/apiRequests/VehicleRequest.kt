package com.example.carware.network.apiRequests

import kotlinx.serialization.Serializable

@Serializable
data class VehicleBrandRequest(
    val id: Int,
    val name: String
)
@Serializable
data class VehicleModelRequest(
    val id: Int,
    val name: String
)


