package com.example.aula2_exemplonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.aula2_exemplonavigation.databinding.FragmentTerceiroBinding

class TerceiroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentTerceiroBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_terceiro, container, false)

        return binding.root
    }
}