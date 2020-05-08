package ru.zavanton.ciceronedemo.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_film_details.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.zavanton.ciceronedemo.R
import ru.zavanton.ciceronedemo.details.di.FilmDetailsFragmentComponentInjector

class FilmDetailsFragment : MvpAppCompatFragment(), FilmDetailsView {

    companion object {

        fun newInstance(): FilmDetailsFragment = FilmDetailsFragment()
    }

    @InjectPresenter
    lateinit var presenter: FilmDetailsPresenter

    @ProvidePresenter
    fun providePresenter(): FilmDetailsPresenter =
        FilmDetailsFragmentComponentInjector
            .provideFilmDetailsFragmentComponent()
            .providePresenter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_film_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        exitButton.setOnClickListener {
            presenter.exit()
        }
    }
}