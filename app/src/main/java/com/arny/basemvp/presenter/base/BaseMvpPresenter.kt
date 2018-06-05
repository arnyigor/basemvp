package com.arny.basemvp.presenter.base


interface BaseMvpPresenter<in V : BaseMvpView> {
    fun attachView(mvpView: V)
    fun detachView()

}