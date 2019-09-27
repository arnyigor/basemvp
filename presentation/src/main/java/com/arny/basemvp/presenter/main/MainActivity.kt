package com.arny.basemvp.presenter.main

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arny.basemvp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : MvpAppCompatActivity(),MainView {

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setName(string: String) {
        tv_app_name.text = string
    }
}
