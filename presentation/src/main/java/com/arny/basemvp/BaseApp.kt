package com.arny.basemvp

import android.app.Application
import android.content.Context
import com.arny.basemvp.di.AppModule
import com.arny.costaccounting.di.AppComponent
import com.arny.costaccounting.di.DaggerAppComponent
import com.facebook.stetho.Stetho

class BaseApp : Application() {
    companion object {
        @JvmStatic
        lateinit var appContext: Context
        @JvmStatic
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
        Stetho.initializeWithDefaults(this)
    }
}
