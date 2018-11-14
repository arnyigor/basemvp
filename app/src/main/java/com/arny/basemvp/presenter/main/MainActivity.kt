package com.arny.basemvp.presenter.main

import android.os.Bundle
import com.arny.basemvp.R
import com.arny.basemvp.presenter.base.BaseMvpActivity


class MainActivity : BaseMvpActivity<MainContract.View, MainPresenter>(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun initPresenter(): MainPresenter {
        return MainPresenter()
    }

}
