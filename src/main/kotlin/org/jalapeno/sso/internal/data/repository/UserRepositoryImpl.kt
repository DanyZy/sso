package org.jalapeno.sso.internal.data.repository

import io.quarkus.hibernate.reactive.panache.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import org.jalapeno.sso.internal.data.model.User
import org.jalapeno.sso.internal.domain.service.auth.repository.UserRepository
import org.jalapeno.sso.storage.model.UserEntity

@ApplicationScoped
class UserRepositoryImpl: PanacheRepository<UserEntity>, UserRepository {
    override suspend fun saveUser(user: User) {
        TODO("Not yet implemented")
    }

    override suspend fun getUser(email: String): User {
        TODO("Not yet implemented")
    }
}