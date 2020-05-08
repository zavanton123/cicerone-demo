package ru.zavanton.ciceronedemo.films

import android.util.Log
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class FilmsPresenter : MvpPresenter<FilmsView>() {
    fun echo() {
        Log.d("zavanton", "zavanton - films presenter")
    }
}