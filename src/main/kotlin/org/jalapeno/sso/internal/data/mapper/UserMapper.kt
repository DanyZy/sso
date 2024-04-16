package org.jalapeno.sso.internal.data.mapper

import org.jalapeno.sso.internal.data.model.User
import org.jalapeno.sso.storage.model.UserEntity

fun UserEntity.toModel(): User =
    User(
        id = this.id,
        email = this.email,
        passHash = this.passHash
    )

fun User.toEntity(): UserEntity =
    UserEntity().also {
        it.email = this.email
        it.passHash = this.passHash
    }
