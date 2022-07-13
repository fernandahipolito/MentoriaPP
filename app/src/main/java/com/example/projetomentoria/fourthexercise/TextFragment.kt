package com.example.projetomentoria.fourthexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.projetomentoria.databinding.FragmentTextBinding
import com.example.projetomentoria.thirdexercise.ThirdExerciseViewModel

class TextFragment: Fragment() {

    private val binding: FragmentTextBinding by lazy { FragmentTextBinding.inflate(layoutInflater) }

    private val model: ThirdExerciseViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.rootText
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model.valueLiveData.observe(viewLifecycleOwner) {
            binding.tvFragment.text = it.toString()
        }
    }
}