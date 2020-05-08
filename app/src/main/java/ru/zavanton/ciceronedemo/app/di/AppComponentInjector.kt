package ru.zavanton.ciceronedemo.app.di

object AppComponentInjector {

    private var appComponent: AppComponent? = null

    fun provideAppComponent(): AppComponent =
        appComponent ?: DaggerAppComponent.builder()
            .build()
            .also {
                appComponent = it
            }
}