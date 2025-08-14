package com.polisan.auth.data.di

import com.polisan.auth.data.EmailPatternValidator
import com.polisan.auth.domain.PatternValidator
import com.polisan.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}