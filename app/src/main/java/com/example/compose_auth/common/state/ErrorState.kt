package com.example.compose_auth.common.state

import androidx.annotation.StringRes
import com.example.compose_auth.R

/**
 * Error state holding values for error ui
 */
data class ErrorState(
    val hasError: Boolean = false,
    @StringRes val errorMessageStringResource: Int = R.string.empty_string
)