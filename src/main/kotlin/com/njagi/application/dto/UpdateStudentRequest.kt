package com.njagi.application.dto

data class UpdateStudentRequest(val id: String, val name: String? = null, val course: String? = null)
