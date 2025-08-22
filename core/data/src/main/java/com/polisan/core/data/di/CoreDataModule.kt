package com.polisan.core.data.di

import com.polisan.core.data.auth.EncryptedSessionStorage
import com.polisan.core.data.networking.HttpClientFactory
import com.polisan.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}