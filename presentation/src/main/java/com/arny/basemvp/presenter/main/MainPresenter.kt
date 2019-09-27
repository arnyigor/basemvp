package com.arny.basemvp.presenter.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.arny.basemvp.BaseApp
import com.arny.basemvp.R
import com.arny.domain.repositories.BaseRepository
import javax.inject.Inject

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {
    @Inject
    lateinit var baseRepository: BaseRepository
    init {
        BaseApp.appComponent.inject(this)
    }

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        val string = baseRepository.getString(R.string.app_name)
        viewState?.setName(string)
    }
}