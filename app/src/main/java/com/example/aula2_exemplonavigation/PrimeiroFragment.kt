package com.example.aula2_exemplonavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.aula2_exemplonavigation.databinding.FragmentPrimeiroBinding

class PrimeiroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentPrimeiroBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_primeiro, container, false)

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this){
            Toast.makeText(context, "Não é possível retornar à tela anterior", Toast.LENGTH_SHORT).show()
        }

        val args = PrimeiroFragmentArgs.fromBundle(requireArguments())

        binding.txtPergunta.text = "Escolha o próximo fragmento ${args.nome}"

        binding.button1.setOnClickListener(){ view : View ->

            var opcaoSelecionada = binding.radioGroup.checkedRadioButtonId

            if(opcaoSelecionada != -1){

                if(opcaoSelecionada == R.id.rdSegundoFragmento) {
                    view.findNavController().navigate(PrimeiroFragmentDirections.actionPrimeiroFragmentToSegundoFragment())
                    //view.findNavController().navigate(R.id.action_primeiroFragment_to_segundoFragment)
                } else if(opcaoSelecionada == R.id.rdTerceiroFragmento){
                    view.findNavController().navigate(PrimeiroFragmentDirections.actionPrimeiroFragmentToTerceiroFragment())
                    //view.findNavController().navigate(R.id.action_primeiroFragment_to_terceiroFragment)
                }
            } else {
                Toast.makeText(context, "Selecione uma opção!", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }
}