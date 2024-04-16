package org.jalapeno.sso.storage.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class UserEntity {
    @Id
    @GeneratedValue
    val id: Long? = null
    lateinit var email: String
    lateinit var passHash: List<Byte>
}