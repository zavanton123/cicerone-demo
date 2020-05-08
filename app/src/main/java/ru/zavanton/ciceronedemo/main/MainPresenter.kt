package ru.zavanton.ciceronedemo.main

import android.util.Log
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun echo() {

        Log.d("zavanton", "zavanton - presenter is on")
    }
}