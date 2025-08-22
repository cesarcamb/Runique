package com.polisan.auth.data

import com.polisan.auth.domain.AuthRepository
import com.polisan.core.data.networking.post
import com.polisan.core.domain.util.DataError
import com.polisan.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}