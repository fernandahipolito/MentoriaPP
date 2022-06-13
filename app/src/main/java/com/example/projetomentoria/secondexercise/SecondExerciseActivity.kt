package com.example.projetomentoria.secondexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetomentoria.R
import com.example.projetomentoria.databinding.ActivitySecondExerciseBinding


class SecondExerciseActivity : AppCompatActivity() {

    val binding: ActivitySecondExerciseBinding by lazy {
        ActivitySecondExerciseBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setClickListener()
    }

    fun clickCount(): Int {
        var number = 0
        with(binding) {
            number = appCompatTextView.text.toString().toInt()
            number++
        }
        return number
    }

    private fun setClickListener() {
        binding.counterButton.setOnClickListener {
            binding.appCompatTextView.text = clickCount().toString()
        }
    }
}