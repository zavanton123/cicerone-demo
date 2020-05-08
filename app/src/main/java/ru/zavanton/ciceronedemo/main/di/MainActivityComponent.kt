package ru.zavanton.ciceronedemo.main.di

import dagger.Component
import ru.zavanton.ciceronedemo.details.di.FilmDetailsFragmentComponent
import ru.zavanton.ciceronedemo.app.di.NavigationDependencies
import ru.zavanton.ciceronedemo.films.di.FilmsFragmentComponent
import ru.zavanton.ciceronedemo.main.MainActivity
import ru.zavanton.ciceronedemo.main.MainPresenter
import javax.inject.Scope

@Scope
@Retention
annotation class ActivityScope

@ActivityScope
@Component(
    dependencies = [
        NavigationDependencies::class
    ]
)
interface MainActivityComponent {

    fun providePresenter(): MainPresenter

    fun inject(mainActivity: MainActivity)

    fun filmsFragmentComponent(): FilmsFragmentComponent

    fun filmDetailsFragmentComponent(): FilmDetailsFragmentComponent
}