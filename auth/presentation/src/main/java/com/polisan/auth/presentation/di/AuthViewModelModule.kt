package com.polisan.auth.presentation.di

import com.polisan.auth.presentation.login.LoginViewModel
import com.polisan.auth.presentation.register.RegisterViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}