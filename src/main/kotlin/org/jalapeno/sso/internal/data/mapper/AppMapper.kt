package org.jalapeno.sso.internal.data.mapper

import org.jalapeno.sso.internal.data.model.App
import org.jalapeno.sso.storage.model.AppEntity

fun AppEntity.toModel(): App =
    App(
        id = this.id,
        name = this.name,
        secret = this.secret
    )

fun App.toEntity(): AppEntity =
    AppEntity().also {
        it.name = this.name
        it.secret = this.secret
    }
