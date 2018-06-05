package com.arny.basemvp

import android.app.Application
import com.arny.basemvp.di.components.ApplicationComponent
import com.arny.basemvp.di.components.DaggerApplicationComponent
import com.arny.basemvp.di.modules.AndroidModule
import com.facebook.stetho.Stetho

class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        applicationComponent = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
        applicationComponent.inject(this)
    }

    companion object {
        @JvmStatic
        lateinit var applicationComponent: ApplicationComponent
    }
}
