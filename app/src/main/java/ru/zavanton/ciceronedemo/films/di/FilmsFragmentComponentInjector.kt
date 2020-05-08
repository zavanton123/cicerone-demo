package ru.zavanton.ciceronedemo.films.di

import ru.zavanton.ciceronedemo.main.di.MainActivityComponentInjector

object FilmsFragmentComponentInjector {

    private var filmsFragmentComponent: FilmsFragmentComponent? = null

    fun provideFilmsFragmentComponent(): FilmsFragmentComponent =
        filmsFragmentComponent ?: MainActivityComponentInjector
            .provideMainActivityComponent()
            .filmsFragmentComponent()
            .also {
                filmsFragmentComponent = it
            }
}