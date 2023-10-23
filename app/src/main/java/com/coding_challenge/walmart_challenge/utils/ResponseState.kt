package com.coding_challenge.walmart_challenge.utils

import com.coding_challenge.walmart_challenge.model.CountriesDetails

sealed interface ResponseState {
    object LOADING: ResponseState
    class SUCCESS(val countries: List<CountriesDetails>): ResponseState
    class ERROR(val error: Throwable): ResponseState
}