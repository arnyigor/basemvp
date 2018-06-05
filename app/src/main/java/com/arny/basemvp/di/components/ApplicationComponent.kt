package com.arny.basemvp.di.components

import android.content.Context
import com.arny.basemvp.BaseApp
import com.arny.basemvp.di.modules.AndroidModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AndroidModule::class)])
interface ApplicationComponent {
//    fun inject(target: FruitRepository)
    fun inject(target: BaseApp)
    fun getContext(): Context
}