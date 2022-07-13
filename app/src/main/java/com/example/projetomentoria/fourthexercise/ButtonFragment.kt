package com.example.projetomentoria.fourthexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.projetomentoria.databinding.FragmantButtonBinding
import com.example.projetomentoria.thirdexercise.ThirdExerciseViewModel

class ButtonFragment : Fragment() {

    private val model: ThirdExerciseViewModel by activityViewModels()
    private val binding: FragmantButtonBinding by lazy {
        FragmantButtonBinding.inflate(layoutInflater)
    }

    override fun onCreateView( //ao criar a view
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.buttonFragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //apos a view estar criada
        super.onViewCreated(view, savedInstanceState)
        binding.buttonCounterFragment.setOnClickListener {
            model.increment()
        }
    }
}