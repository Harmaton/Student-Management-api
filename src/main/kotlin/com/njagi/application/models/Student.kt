package com.njagi.application.models


import javax.persistence.*

@Entity
data class Student(@Id
                   @SequenceGenerator(name = PERSON_SEQUENCE, sequenceName = PERSON_SEQUENCE, initialValue = 1, allocationSize = 1)
                   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PERSON_SEQUENCE)
                   var id: String = "",
                   var name: String? = "",
                   var course: String? = ""
                   ){

    companion object{
      const val PERSON_SEQUENCE: String = "PERSON_SEQUENCE"
    }

}



