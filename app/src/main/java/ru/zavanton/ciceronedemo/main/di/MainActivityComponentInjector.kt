package ru.zavanton.ciceronedemo.main.di

import ru.zavanton.ciceronedemo.app.di.AppComponentInjector

object MainActivityComponentInjector {

    private var mainActivityComponent: MainActivityComponent? = null

    fun provideMainActivityComponent(): MainActivityComponent =
        mainActivityComponent ?: DaggerMainActivityComponent
            .builder()
            .navigationDependencies(AppComponentInjector.provideAppComponent())
            .provideAge(33)
            .build()
            .also {
                mainActivityComponent = it
            }
}