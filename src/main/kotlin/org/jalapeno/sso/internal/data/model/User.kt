package org.jalapeno.sso.internal.data.model

data class User(
    val id: Long?,
    val email: String,
    val passHash: List<Byte>
)
