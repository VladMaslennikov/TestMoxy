package com.maslennikov.testmoxy.ui

import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class StartPresenter: MvpPresenter<StartView>() {

    fun buttonClick(){

        viewState.showText("New text")
    }
}