package ru.zavanton.ciceronedemo.main

import android.os.Bundle
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.zavanton.ciceronedemo.R
import ru.zavanton.ciceronedemo.app.App

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    private val navigator = SupportAppNavigator(this, R.id.fragmentContainer)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        App.instance.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()

        App.instance.navigatorHolder.removeNavigator()
    }
}
