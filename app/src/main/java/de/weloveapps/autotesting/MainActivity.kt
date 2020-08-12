package de.weloveapps.autotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bluelinelabs.conductor.Conductor
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import de.weloveapps.autotesting.databinding.ActivityMainBinding
import de.weloveapps.autotesting.home.HomeController

class MainActivity : AppCompatActivity() {
    private lateinit var router: Router

    private lateinit var binding: ActivityMainBinding

    private var savedInstanceState: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        this.savedInstanceState = savedInstanceState

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        router = Conductor.attachRouter(this, binding.changeHandlerFrameLayout, savedInstanceState)
        if(!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(HomeController()))
        }
    }
}