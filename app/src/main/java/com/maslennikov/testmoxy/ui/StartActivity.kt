package com.maslennikov.testmoxy.ui

import android.os.Bundle
import com.maslennikov.testmoxy.R
import kotlinx.android.synthetic.main.start_activity.*
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class StartActivity: MvpAppCompatActivity(), StartView {

    @InjectPresenter
    lateinit var presenter: StartPresenter

    override fun showText(tex: String) {

        text.text = tex
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        button.setOnClickListener {
            presenter.buttonClick()
        }
    }
}