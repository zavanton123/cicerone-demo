package ru.zavanton.ciceronedemo.app.di

import dagger.Component
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.zavanton.ciceronedemo.app.App
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CiceroneModule::class
    ]
)
interface AppComponent : NavigationDependencies {

    fun inject(app: App)
}

@Module
class CiceroneModule {

    @Singleton
    @Provides
    fun provideCicerone(): Cicerone<Router> =
        Cicerone.create()

    @Singleton
    @Provides
    fun provideNavigatorHolder(cicerone: Cicerone<Router>): NavigatorHolder =
        cicerone.navigatorHolder

    @Singleton
    @Provides
    fun provideRouter(cicerone: Cicerone<Router>): Router =
        cicerone.router
}