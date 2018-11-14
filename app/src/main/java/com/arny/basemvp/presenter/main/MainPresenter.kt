package com.arny.basemvp.presenter.main

import com.arny.basemvp.data.source.MainRepositoryImpl
import com.arny.basemvp.presenter.base.BaseMvpPresenterImpl


class MainPresenter : BaseMvpPresenterImpl<MainContract.View>(), MainContract.Presenter {
    val repository = MainRepositoryImpl.instance
}