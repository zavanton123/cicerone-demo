package ru.zavanton.ciceronedemo.app

import android.app.Application
import ru.zavanton.ciceronedemo.app.di.AppComponentInjector

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        AppComponentInjector.provideAppComponent()
    }
}