package no.kristiania.macandroidfarm.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import no.kristiania.macandroidfarm.R
import no.kristiania.macandroidfarm.databinding.FragmentAnimalBinding

class AnimalFragment : Fragment(R.layout.fragment_animal)  {

    private lateinit var binding: FragmentAnimalBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAnimalBinding.bind(view)
        binding.imgBigger.setImageResource(R.drawable.chicken)
        binding.animalNameText.text = getString(R.string.chicken)
    }

    }