package ru.zavanton.ciceronedemo.films.di

import dagger.Subcomponent
import ru.zavanton.ciceronedemo.films.FilmsFragment
import ru.zavanton.ciceronedemo.films.FilmsPresenter
import javax.inject.Scope

@Scope
@Retention
annotation class FilmsFragmentScope

@FilmsFragmentScope
@Subcomponent
interface FilmsFragmentComponent {

    fun providePresenter(): FilmsPresenter

    fun inject(filmsFragment: FilmsFragment)
}