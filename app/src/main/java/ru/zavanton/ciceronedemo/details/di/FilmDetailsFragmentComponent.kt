package ru.zavanton.ciceronedemo.details.di

import dagger.Subcomponent
import ru.zavanton.ciceronedemo.details.FilmDetailsPresenter
import javax.inject.Scope

@Scope
@Retention
annotation class FilmDetailsFragmentScope

@FilmDetailsFragmentScope
@Subcomponent
interface FilmDetailsFragmentComponent {

    fun providePresenter(): FilmDetailsPresenter
}