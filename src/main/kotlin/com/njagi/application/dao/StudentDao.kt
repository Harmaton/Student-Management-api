package com.njagi.application.dao

import com.njagi.application.models.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentDao: JpaRepository<Student, String > {

}