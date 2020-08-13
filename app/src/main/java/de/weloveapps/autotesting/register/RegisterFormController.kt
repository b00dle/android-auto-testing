package de.weloveapps.autotesting.register

import com.jakewharton.rxbinding3.view.clicks
import de.weloveapps.autotesting.R
import de.weloveapps.autotesting.base.BaseController
import de.weloveapps.autotesting.databinding.ControllerRegisterFormBinding
import de.weloveapps.autotesting.databinding.ControllerWelcomeBinding
import de.weloveapps.autotesting.home.HomeController
import de.weloveapps.autotesting.utils.pushAndSlideHorizontal
import io.reactivex.rxkotlin.plusAssign

class RegisterFormController: BaseController<ControllerRegisterFormBinding>(R.layout.controller_register_form) {

    private val viewModel by lazy {
        RegisterFormViewModel()
    }

    override fun onSetupView() {
        binding.lifecycleOwner = this
    }

    override fun onSetupViewBinding() {

    }

    override fun onSetupViewModelBinding() {
    }

}