package fisei.uta.ec.app_kotlin_003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fisei.uta.ec.app_kotlin_003.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}