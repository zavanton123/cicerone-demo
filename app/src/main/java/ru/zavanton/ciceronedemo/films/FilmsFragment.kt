package ru.zavanton.ciceronedemo.films

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_films.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.zavanton.ciceronedemo.R
import ru.zavanton.ciceronedemo.films.di.FilmsFragmentComponentInjector

class FilmsFragment : MvpAppCompatFragment(), FilmsView {

    companion object {

        fun newInstance(): FilmsFragment {
            return FilmsFragment()
        }
    }

    @InjectPresenter
    lateinit var presenter: FilmsPresenter

    @ProvidePresenter
    fun providePresenter(): FilmsPresenter =
        FilmsFragmentComponentInjector
            .provideFilmsFragmentComponent()
            .providePresenter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_films, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToDetailsButton.setOnClickListener {
            presenter.goToDetails()
        }
    }
}