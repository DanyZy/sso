package org.jalapeno.sso.internal.domain.service.auth.repository

import org.jalapeno.sso.internal.data.model.User

interface UserRepository {
    suspend fun saveUser(user: User)

    suspend fun getUser(email: String): User
}