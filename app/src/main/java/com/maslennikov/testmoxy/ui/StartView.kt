package com.maslennikov.testmoxy.ui

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType


interface StartView: MvpView {

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showText(tex: String)
}