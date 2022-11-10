package linnick.lop.io.marvelstudios.features.splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import linnick.lop.io.marvelstudios.R
import linnick.lop.io.marvelstudios.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}