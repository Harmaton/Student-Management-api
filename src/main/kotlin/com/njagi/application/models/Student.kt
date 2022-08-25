package com.njagi.application.models

import java.time.Year
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.SequenceGenerator

@Entity
data class Student(@Id
                   @SequenceGenerator(name = PERSON_SEQUENCE, sequenceName = PERSON_SEQUENCE, initialValue = 1, allocationSize = 1)
                   var id: String?,
                   var name: String? = null,
                   val course: String? = null,
                   val year: Year? = null){

    companion object{
      const val PERSON_SEQUENCE: String = "PERSON_SEQUENCE"
    }

}



