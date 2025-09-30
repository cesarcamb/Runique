package com.polisan.auth.domain

import com.polisan.core.domain.util.DataError
import com.polisan.core.domain.util.EmptyResult


interface AuthRepository {
    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}