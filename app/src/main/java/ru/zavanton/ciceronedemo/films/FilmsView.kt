package ru.zavanton.ciceronedemo.films

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

@AddToEndSingle
interface FilmsView : MvpView{
}