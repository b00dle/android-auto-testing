package de.weloveapps.autotesting.home

import de.weloveapps.autotesting.R
import de.weloveapps.autotesting.base.BaseController
import de.weloveapps.autotesting.databinding.ControllerHomeBinding

class HomeController: BaseController<ControllerHomeBinding>(R.layout.controller_home) {

    private val viewModel by lazy {
        HomeViewModel()
    }

    override fun onSetupView() {
        binding.lifecycleOwner = this
    }

    override fun onSetupViewBinding() {
    }

    override fun onSetupViewModelBinding() {
    }

}