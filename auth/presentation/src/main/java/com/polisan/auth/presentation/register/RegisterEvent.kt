package com.polisan.auth.presentation.register

import com.polisan.core.presentation.ui.UiText

sealed interface RegisterEvent {
    data object RegistrationSuccess : RegisterEvent
    data class Error(val error: UiText): RegisterEvent
}