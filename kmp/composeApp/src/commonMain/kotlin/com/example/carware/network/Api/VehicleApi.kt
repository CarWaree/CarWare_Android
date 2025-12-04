package com.example.carware.network.Api

import com.example.carware.network.apiRequests.auth.SignUpRequest
import com.example.carware.network.apiRequests.vehicle.VehicleRequest
import com.example.carware.network.apiResponse.vehicle.Brand
import com.example.carware.network.apiResponse.vehicle.BrandResponse
import com.example.carware.network.apiResponse.vehicle.Model
import com.example.carware.network.apiResponse.vehicle.ModelResponse
import com.example.carware.network.apiResponse.vehicle.VehicleResponse
import com.example.carware.network.createHttpClient
import com.example.carware.util.SharedToken.token
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.isSuccess

suspend fun getBrands(): List<Brand> {
    val client = createHttpClient()
    return client.get("$baseUrl/api/Vehicle/brands") {
        contentType(ContentType.Application.Json) // optional for GET
    }.body<BrandResponse>().data
}

suspend fun getModels(brandId: Int?): List<Model> {
    val client = createHttpClient()
    return client.get("$baseUrl/api/Vehicle/models") {
        parameter("brandId", brandId)
    }.body<ModelResponse>().data
}

suspend fun addVehicles(request: VehicleRequest): VehicleResponse {
    val client = createHttpClient()

    val response: HttpResponse = client.post { // Store the full HttpResponse
        url("$baseUrl/api/Vehicle")
        contentType(ContentType.Application.Json)
        header("Authorization", "Bearer $token")
        setBody(request)
    }
    println("Sending token: Bearer $token")


    // Check if the API call was successful (HTTP 2xx status)
    if (response.status.isSuccess()) {
        // If successful, parse the body as the expected success response
        return response.body<VehicleResponse>()
    } else {
        // If it failed, throw an exception with the server's error message
        val errorBody = response.bodyAsText() // Get the raw error response
        // You could parse this 'errorBody' into a specific error data class if you have one
        throw Exception("API Error (${response.status}): $errorBody")
    }
}
suspend fun addVehicle(request: VehicleRequest): VehicleResponse {
    val client = createHttpClient()
    return client.post("$baseUrl/api/Vehicle") {
        contentType(ContentType.Application.Json)
        setBody(request)

    }.body()

}


suspend fun getVehicles(): VehicleResponse {
    val client = createHttpClient()
    return client.get("$baseUrl/api/Vehicle") {
        contentType(ContentType.Application.Json)
    }.body()
}

