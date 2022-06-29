package com.example.projetomentoria.thirdexercise

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

import androidx.appcompat.app.AppCompatActivity
import com.example.projetomentoria.R


class ThirdExerciseActivity : AppCompatActivity() {
    private val model: ThirdExerciseViewModel by viewModels()
    //var number: Int = 0 -> setei o valor 0 na viewModel


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_exercise)

       val txtCounter = findViewById<TextView>(R.id.appCompatTextView)
       val btnIncrement = findViewById<Button>(R.id.counterButton)

        model.valueLiveData.observe(this) { number ->
            txtCounter.text = "$number"


        }
        btnIncrement.setOnClickListener {
            model.increment()
           // number++
        }
    }
}