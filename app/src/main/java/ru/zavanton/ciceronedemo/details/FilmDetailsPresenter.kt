package ru.zavanton.ciceronedemo.details

import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import ru.zavanton.ciceronedemo.details.di.FilmDetailsFragmentScope
import javax.inject.Inject

@FilmDetailsFragmentScope
@InjectViewState
class FilmDetailsPresenter @Inject constructor(
    private val router: Router
) : MvpPresenter<FilmDetailsView>() {

    fun exit() {
        router.finishChain()
    }
}