package ru.zavanton.ciceronedemo.main

import android.util.Log
import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import ru.zavanton.ciceronedemo.main.di.ActivityScope
import ru.zavanton.ciceronedemo.main.di.Age
import ru.zavanton.ciceronedemo.navigation.FilmsScreen
import javax.inject.Inject

@ActivityScope
@InjectViewState
class MainPresenter @Inject constructor(
    private val router: Router,
    @Age private val age: Int
) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        Log.d("zavanton", "zavanton - age: $age")

        router.newRootScreen(FilmsScreen)
    }
}