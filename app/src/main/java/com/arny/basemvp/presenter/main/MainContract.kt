package com.arny.basemvp.presenter.main

import com.arny.basemvp.presenter.base.BaseMvpPresenter
import com.arny.basemvp.presenter.base.BaseMvpView

object MainContract {
    interface View : BaseMvpView {
    }

    interface Presenter : BaseMvpPresenter<View> {
    }
}