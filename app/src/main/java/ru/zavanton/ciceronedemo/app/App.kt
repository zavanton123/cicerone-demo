package ru.zavanton.ciceronedemo.app

import android.app.Application
import android.util.Log
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class App : Application() {

    companion object {

        lateinit var instance: App
    }

    private lateinit var cicerone: Cicerone<Router>

    lateinit var router: Router

    lateinit var navigatorHolder: NavigatorHolder

    override fun onCreate() {
        super.onCreate()

        Log.d("zavanton", "zavanton - app")

        instance = this

        cicerone = Cicerone.create()

        router = cicerone.router

        navigatorHolder = cicerone.navigatorHolder
    }
}