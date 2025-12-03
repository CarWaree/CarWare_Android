package com.example.carware.repository

import com.example.carware.network.Api.addVehicle
import com.example.carware.network.Api.getBrands
import com.example.carware.network.Api.getModels
import com.example.carware.network.apiRequests.vehicle.VehicleRequest
import com.example.carware.network.apiResponse.vehicle.Brand
import com.example.carware.network.apiResponse.vehicle.Model
import com.example.carware.network.apiResponse.vehicle.VehicleResponse

class VehicleRepository {

    suspend fun getBrandsRepo(): List<Brand> {
        return getBrands() // your existing top-level function
    }

    suspend fun getModelsRepo(brandId: Int): List<Model> {
        return getModels(brandId) // your existing top-level function
    }

    suspend fun addVehicleRepo(vehicleRequest: VehicleRequest): VehicleResponse =
        addVehicle(vehicleRequest)  // calls top-level function


}
