package com.njagi.application.resource

import com.njagi.application.dto.AddStudentRequest
import com.njagi.application.dto.StudentResponse
import com.njagi.application.dto.UpdateStudentRequest
import org.springframework.http.ResponseEntity

interface StudentResource {
    fun findById(id: String): ResponseEntity<StudentResponse?>
    fun findAll(): ResponseEntity<List<StudentResponse>>
    fun save(addStudentRequest: AddStudentRequest): ResponseEntity<StudentResponse>
    fun update(updateStudentRequest: UpdateStudentRequest): ResponseEntity<StudentResponse>
    fun deleteById(id:String): ResponseEntity<Unit>
}