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
            //Add the fragment when the activity is ready
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, AnimalFragment.newInstance(item = R.drawable.goat))
                .addToBackStack("goat")
                .commit()
        }






    }
}