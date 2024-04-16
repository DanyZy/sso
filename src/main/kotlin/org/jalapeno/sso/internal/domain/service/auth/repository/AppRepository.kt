package org.jalapeno.sso.internal.domain.service.auth.repository

import org.jalapeno.sso.internal.data.model.App

interface AppRepository {
    suspend fun getApp(id: Int): App
}