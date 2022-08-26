package com.njagi.application.models

import java.time.LocalDateTime

data class ErrorResponse(val title: String = "Bad Request", val message: String, val datetime: LocalDateTime = LocalDateTime.now())
