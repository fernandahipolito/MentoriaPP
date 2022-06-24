package com.example.projetomentoria.thirdexercise

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomentoria.R

class ThirdExerciseActivity : AppCompatActivity() {
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_exercise)

       val txtCounter = findViewById<TextView>(R.id.appCompatTextView)
       val btnIncrement = findViewById<Button>(R.id.counterButton)

        btnIncrement.setOnClickListener {
            number++
            txtCounter.text = "$number"
        }
    }
}