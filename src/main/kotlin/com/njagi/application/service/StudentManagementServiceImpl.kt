package com.njagi.application.service

import com.njagi.application.dao.StudentDao
import com.njagi.application.dto.AddStudentRequest
import com.njagi.application.dto.StudentResponse
import com.njagi.application.dto.UpdateStudentRequest
import com.njagi.application.models.Student
import com.njagi.application.transformer.AddStudentRequestTransformer
import com.njagi.application.transformer.toStudentResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class StudentManagementServiceImpl(private val studentDao: StudentDao,
                                   private val addStudentRequestTransformer: AddStudentRequestTransformer) : StudentManagementService {

    override fun findById(id: String): StudentResponse? = this.findStudentById(id).toStudentResponse()


    override fun findAll(): List<StudentResponse> = this.studentDao.findAll().map(Student::toStudentResponse)

    override fun save(addStudentRequest: AddStudentRequest): StudentResponse {
        return saveOrUpdate(
            addStudentRequestTransformer.transform(addStudentRequest)
        )
    }

    override fun updateStudent(updateStudentRequest: UpdateStudentRequest): StudentResponse {
        val student = this.findStudentById(updateStudentRequest.id) ?: throw IllegalStateException("${updateStudentRequest.id} not found")
      return  this.saveOrUpdate(student.apply {
            this.name = updateStudentRequest.name
            this.id = updateStudentRequest.id
        })
    }

    override fun deleteById(id: String) {
        this.studentDao.deleteById(id)
    }

   private fun findStudentById(id: String): Student? = this.studentDao.findByIdOrNull(id)

    private fun saveOrUpdate(student: Student): StudentResponse = this.studentDao.save<Student?>(student).toStudentResponse()
    
}