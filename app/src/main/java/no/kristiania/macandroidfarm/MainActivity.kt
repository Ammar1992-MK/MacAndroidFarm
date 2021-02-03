package no.kristiania.macandroidfarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import no.kristiania.macandroidfarm.databinding.ActivityMainBinding
import no.kristiania.macandroidfarm.details.AnimalFragment

class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnChicken.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, AnimalFragment())
                .addToBackStack("chicken")
                .commit()
        }




    }
}