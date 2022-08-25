package com.njagi.application.transformer

import com.njagi.application.dto.AddStudentRequest
import com.njagi.application.models.Student
import org.springframework.stereotype.Component

@Component
class AddStudentRequestTransformer: Transformer<AddStudentRequest, Student> {
    override fun transform(source: AddStudentRequest): Student {
        return Student(
            name = source.name,
            course = source.course,
            id = ""
        )
    }
}