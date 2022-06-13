package com.example.projetomentoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetomentoria.databinding.ActivityMainBinding
import com.example.projetomentoria.exerciseone.FirstExerciseActivity
import com.example.projetomentoria.secondexercise.SecondExerciseActivity


class MainActivity : AppCompatActivity() {

    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.appCompatButton.setOnClickListener {
            val intent = Intent(this, FirstExerciseActivity::class.java)
            startActivity(intent)
        }

        binding.appCompatButton2.setOnClickListener {

            val intent2 = Intent(this, SecondExerciseActivity::class.java)
            startActivity(intent2)
        }
    }
}