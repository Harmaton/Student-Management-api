package com.njagi.application.service

import com.njagi.application.dao.StudentDao
import com.njagi.application.dto.AddStudentRequest
import com.njagi.application.dto.StudentResponse
import com.njagi.application.dto.UpdateStudentRequest
import org.springframework.stereotype.Service

@Service
class PersonManagementServiceImpl(private val studentDao: StudentDao) : PersonManagementService {
    override fun findById(id: String): StudentResponse? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<StudentResponse> {
        TODO("Not yet implemented")
    }

    override fun save(addStudentRequest: AddStudentRequest): StudentResponse {
        TODO("Not yet implemented")
    }

    override fun updateStudent(updateStudentRequest: UpdateStudentRequest): StudentResponse {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String) {
        TODO("Not yet implemented")
    }
}