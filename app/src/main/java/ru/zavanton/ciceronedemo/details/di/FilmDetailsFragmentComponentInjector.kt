package ru.zavanton.ciceronedemo.details.di

import ru.zavanton.ciceronedemo.main.di.MainActivityComponentInjector

object FilmDetailsFragmentComponentInjector {

    private var filmDetailsFragmentComponent: FilmDetailsFragmentComponent? = null

    fun provideFilmDetailsFragmentComponent(): FilmDetailsFragmentComponent {
        return filmDetailsFragmentComponent ?: MainActivityComponentInjector
            .provideMainActivityComponent()
            .filmDetailsFragmentComponent()
            .also {
                filmDetailsFragmentComponent = it
            }
    }
}