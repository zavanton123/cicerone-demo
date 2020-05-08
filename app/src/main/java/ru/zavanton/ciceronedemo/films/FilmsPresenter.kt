package ru.zavanton.ciceronedemo.films

import moxy.InjectViewState
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import ru.zavanton.ciceronedemo.films.di.FilmsFragmentScope
import ru.zavanton.ciceronedemo.navigation.FilmDetailsScreen
import javax.inject.Inject

@FilmsFragmentScope
@InjectViewState
class FilmsPresenter @Inject constructor(
    private val router: Router
) : MvpPresenter<FilmsView>() {

    fun goToDetails() {
        router.navigateTo(FilmDetailsScreen)
    }
}