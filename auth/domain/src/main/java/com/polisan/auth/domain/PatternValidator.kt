package com.polisan.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}