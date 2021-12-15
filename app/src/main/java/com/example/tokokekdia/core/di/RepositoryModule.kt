package com.example.tokokekdia.core.di

import com.example.tokokekdia.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(),get()) }
}