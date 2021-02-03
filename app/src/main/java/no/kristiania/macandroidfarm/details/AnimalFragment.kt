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

            val item: Int? = arguments?.getInt("item")
            if(item == null){
                showError()
            }else {
                binding.imgBigger.setImageResource(item)
                binding.animalNameText.text = when(item){
                    R.drawable.chicken -> getString(R.string.chicken)
                    R.drawable.cow -> getString(R.string.cow)
                    R.drawable.sheep -> getString(R.string.sheep)
                    R.drawable.goat -> getString(R.string.goat)
                    else -> ""
                }
            }


        }

        companion object{


            fun newInstance( item : Int) : AnimalFragment = AnimalFragment().apply {

                arguments = Bundle().apply {

                    putInt("item", item)
                }
            }

        }

        private fun showError() {
            TODO("Not yet implemented")
        }



    }



