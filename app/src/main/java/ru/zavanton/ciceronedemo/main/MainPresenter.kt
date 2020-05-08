package ru.zavanton.ciceronedemo.main

import moxy.InjectViewState
import moxy.MvpPresenter
import ru.zavanton.ciceronedemo.app.App
import ru.zavanton.ciceronedemo.navigation.FilmsScreen

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    private val router = App.instance.router

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        router.newRootScreen(FilmsScreen)
    }
}