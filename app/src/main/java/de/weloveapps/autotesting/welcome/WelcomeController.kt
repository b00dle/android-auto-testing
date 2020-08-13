package de.weloveapps.autotesting.welcome

import com.jakewharton.rxbinding3.view.clicks
import de.weloveapps.autotesting.R
import de.weloveapps.autotesting.base.BaseController
import de.weloveapps.autotesting.databinding.ControllerWelcomeBinding
import de.weloveapps.autotesting.home.HomeController
import de.weloveapps.autotesting.utils.pushAndSlideHorizontal
import io.reactivex.rxkotlin.plusAssign

class WelcomeController: BaseController<ControllerWelcomeBinding>(R.layout.controller_welcome) {

    private val viewModel by lazy {
        WelcomeViewModel()
    }

    override fun onSetupView() {
        binding.lifecycleOwner = this
    }

    override fun onSetupViewBinding() {
        disposables += binding.buttonWelcome.clicks().subscribe {
            router.pushAndSlideHorizontal(HomeController())
        }
    }

    override fun onSetupViewModelBinding() {
    }

}