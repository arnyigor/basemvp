package com.arny.costaccounting.di

import com.arny.basemvp.di.AppModule
import com.arny.basemvp.presenter.main.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainPresenter: MainPresenter)
}