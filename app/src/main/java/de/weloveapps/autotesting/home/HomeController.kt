package de.weloveapps.autotesting.home

import android.app.AlertDialog
import android.widget.Toast
import com.jakewharton.rxbinding3.view.clicks
import de.weloveapps.autotesting.R
import de.weloveapps.autotesting.base.BaseController
import de.weloveapps.autotesting.databinding.ControllerHomeBinding
import de.weloveapps.autotesting.register.RegisterFormController
import de.weloveapps.autotesting.utils.pushAndSlideHorizontal
import io.reactivex.rxkotlin.plusAssign

class HomeController: BaseController<ControllerHomeBinding>(R.layout.controller_home) {

    private val viewModel by lazy {
        HomeViewModel()
    }

    override fun onSetupView() {
        binding.lifecycleOwner = this
    }

    override fun onSetupViewBinding() {
        disposables += binding.buttonDisplayText.clicks().subscribe {
            binding.textView.text = binding.textInputEditText.text
        }

        disposables += binding.buttonDisplayAlert.clicks().subscribe {
            AlertDialog
                .Builder(activity)
                .setTitle("Your device has been compromised")
                .setMessage("The CIA has hacked your phone and is now in the process of stealing all your data. Delete all dick pics quickly!")
                .setNeutralButton("FUCK!") { _, _ ->  }
                .setCancelable(false)
                .create().also {
                    it.setCanceledOnTouchOutside(false)
                    it.show()
                }
        }

        disposables += binding.buttonDisplayToast.clicks().subscribe {
            Toast.makeText(activity,  "Did you just fart?", Toast.LENGTH_LONG).show()
        }

        disposables += binding.buttonRegisterForm.clicks().subscribe {
            router.pushAndSlideHorizontal(RegisterFormController())
        }
    }

    override fun onSetupViewModelBinding() {
    }

}