package com.njagi.application.service

import com.njagi.application.dto.AddStudentRequest
import com.njagi.application.dto.StudentResponse
import com.njagi.application.dto.UpdateStudentRequest


interface PersonManagementService {

    fun findById(id: String): StudentResponse?

    fun findAll(): List<StudentResponse>

    fun save(addStudentRequest: AddStudentRequest): StudentResponse

    fun updateStudent(updateStudentRequest: UpdateStudentRequest): StudentResponse

    fun deleteById(id: String)
}