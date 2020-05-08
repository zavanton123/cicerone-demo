package ru.zavanton.ciceronedemo.main

import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import ru.zavanton.ciceronedemo.main.di.ActivityScope
import ru.zavanton.ciceronedemo.navigation.FilmsScreen
import javax.inject.Inject

@ActivityScope
@InjectViewState
class MainPresenter @Inject constructor(
    private val router: Router
) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        router.newRootScreen(FilmsScreen)
    }
}