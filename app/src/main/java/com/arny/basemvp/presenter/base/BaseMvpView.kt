package com.arny.basemvp.presenter.base


interface BaseMvpView {
    fun showError(error: String?)
    fun toastError(error: String?)
}
