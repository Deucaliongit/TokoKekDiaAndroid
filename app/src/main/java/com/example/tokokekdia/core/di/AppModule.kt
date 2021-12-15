package com.example.tokokekdia.core.di

import com.example.tokokekdia.core.data.source.local.LocalDataSource
import com.example.tokokekdia.core.data.source.remote.RemoteDataSource
import com.example.tokokekdia.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }

    single { RemoteDataSource(get()) }

    single { LocalDataSource() }
}