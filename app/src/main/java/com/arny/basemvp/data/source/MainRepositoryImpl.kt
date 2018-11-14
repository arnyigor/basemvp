package com.arny.basemvp.data.source

import android.content.Context
import com.arny.basemvp.BaseApp
import com.arny.basemvp.data.source.base.BaseRepository

class MainRepositoryImpl : BaseRepository {
    private object Holder {
        val INSTANCE = MainRepositoryImpl()
    }

    companion object {
        val instance: MainRepositoryImpl by lazy { Holder.INSTANCE }
    }

    override fun getContext(): Context {
        return BaseApp.appContext
    }

}
