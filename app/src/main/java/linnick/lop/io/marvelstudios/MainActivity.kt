package linnick.lop.io.marvelstudios

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import linnick.lop.io.marvelstudios.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}