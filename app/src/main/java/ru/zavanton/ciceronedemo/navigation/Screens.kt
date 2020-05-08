package ru.zavanton.ciceronedemo.navigation

import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen
import ru.zavanton.ciceronedemo.details.FilmDetailsFragment
import ru.zavanton.ciceronedemo.films.FilmsFragment

object FilmsScreen : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return FilmsFragment.newInstance()
    }
}

object FilmDetailsScreen : SupportAppScreen() {

    override fun getFragment(): Fragment? {
        return FilmDetailsFragment.newInstance()
    }
}