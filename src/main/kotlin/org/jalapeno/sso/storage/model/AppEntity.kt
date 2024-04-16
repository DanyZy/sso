package org.jalapeno.sso.storage.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class AppEntity {
    @Id
    @GeneratedValue
    var id: Long? = null
    lateinit var name: String
    lateinit var secret: String
}