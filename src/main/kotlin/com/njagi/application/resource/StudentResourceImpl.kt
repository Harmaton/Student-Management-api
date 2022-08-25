package com.njagi.application.resource

import com.njagi.application.dto.AddStudentRequest
import com.njagi.application.dto.StudentResponse
import com.njagi.application.dto.UpdateStudentRequest
import com.njagi.application.resource.StudentResourceImpl.Companion.BASE_PERSON_URL
import com.njagi.application.service.StudentManagementService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping(value = [BASE_PERSON_URL])
class StudentResourceImpl(private val studentManagementService: StudentManagementService) : StudentResource {

    @GetMapping("/{id}")
    override fun findById(id: String): ResponseEntity<StudentResponse?> {
        val studentResponse = this.studentManagementService.findById(id)
        return ResponseEntity.status(HttpStatus.OK).body(studentResponse)
    }

    @GetMapping
    override fun findAll(): ResponseEntity<List<StudentResponse>> = ResponseEntity.ok(this.studentManagementService.findAll())

    @PostMapping
    override fun save(addStudentRequest: AddStudentRequest): ResponseEntity<StudentResponse> {
        val studentResponse = this.studentManagementService.save(addStudentRequest)
        return ResponseEntity.created(URI.create(BASE_PERSON_URL.plus("/{studentResponse.id}"))).body(studentResponse)
    }

    @PutMapping
    override fun update(updateStudentRequest: UpdateStudentRequest): ResponseEntity<StudentResponse> {
        return ResponseEntity.ok(this.studentManagementService.updateStudent(updateStudentRequest))
    }

    @DeleteMapping("/{id}")
    override fun deleteById(id: String): ResponseEntity<Unit> {
        this.studentManagementService.deleteById(id)
        return ResponseEntity.noContent().build()
    }
    companion object{
        const val BASE_PERSON_URL = "/api/v1/person"
    }
}