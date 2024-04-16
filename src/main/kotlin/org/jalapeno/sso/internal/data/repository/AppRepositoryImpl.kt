package org.jalapeno.sso.internal.data.repository

import io.quarkus.hibernate.reactive.panache.PanacheRepository
import org.jalapeno.sso.internal.data.model.App
import org.jalapeno.sso.internal.domain.service.auth.repository.AppRepository
import org.jalapeno.sso.storage.model.AppEntity

class AppRepositoryImpl: PanacheRepository<AppEntity>, AppRepository {
    override suspend fun getApp(id: Int): App {
        TODO("Not yet implemented")
    }
}