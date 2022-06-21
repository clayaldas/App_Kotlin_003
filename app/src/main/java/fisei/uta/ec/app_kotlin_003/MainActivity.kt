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

        // asignar los datos (Adapter) al control (Recycler)
        binding.recycler.adapter = MoviesAdapter(
            //cargar datos de prueba
            listOf(
                Movie("Titulo 1", "https://loremflickr.com/320/240?lock=1"),
                Movie("Titulo 2", "https://loremflickr.com/320/240?lock=2"),
                Movie("Titulo 3", "https://loremflickr.com/320/240?lock=3"),
                Movie("Titulo 4", "https://loremflickr.com/320/240?lock=4"),
                Movie("Titulo 5", "https://loremflickr.com/320/240?lock=5"),
                Movie("Titulo 6", "https://loremflickr.com/320/240?lock=6")
            )
        )
    }
}