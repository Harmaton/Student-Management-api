package com.njagi.application.transformer

import com.njagi.application.dto.StudentResponse
import com.njagi.application.models.Student

fun Student?.toStudentResponse(): StudentResponse{
    return StudentResponse(
        id = this?.id,
        name = this?.name
    )
}