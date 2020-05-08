package ru.zavanton.ciceronedemo.app.di

import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

interface NavigationDependencies {

    fun provideNavigatorHolder(): NavigatorHolder

    fun provideRouter(): Router
}