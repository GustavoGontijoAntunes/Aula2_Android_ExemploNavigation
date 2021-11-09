package com.example.aula2_exemplonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.aula2_exemplonavigation.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentStartBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_start, container, false)

        binding.button.setOnClickListener(){ view : View ->

            if(binding.editNome.text.toString() != "") {
                var texto = binding.editNome.text.toString()

                view.findNavController().navigate(StartFragmentDirections.actionStartFragmentToPrimeiroFragment(texto))
            }
        }

        return binding.root
    }
}