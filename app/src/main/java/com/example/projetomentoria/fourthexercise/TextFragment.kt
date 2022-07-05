package com.example.projetomentoria.fourthexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.projetomentoria.R

class TextFragment: Fragment() {

    companion object { // para criar a instancia desse fragment e nao ter que criar parametros e construtores que vao quebrar o app
        fun newInstance() = TextFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_text, container, false)
    }
}