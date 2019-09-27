package com.arny.basemvp.di

import android.app.Application
import android.content.Context
import com.arny.data.repositoryimpl.BaseRepositoryImpl
import com.arny.domain.repositories.BaseRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [AppModule.RepositoryModule::class])
class AppModule(private val application: Application) {
    @Provides
    @Singleton
    fun application(): Application {
        return application
    }

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return application
    }

    @Module
    abstract class RepositoryModule {
        @Binds
        abstract fun bindBaseRepository(baseRepositoryImpl: BaseRepositoryImpl): BaseRepository
    }

}