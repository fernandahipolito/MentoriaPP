package com.example.projetomentoria.secondexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.projetomentoria.R

class SecondExerciseActivity : AppCompatActivity() {
    lateinit var txtCounter: TextView
    private lateinit var btnIncrement: Button
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_exercise)

        txtCounter = findViewById(R.id.appCompatTextView)
        btnIncrement = findViewById(R.id.counterButton)

        btnIncrement.setOnClickListener {
            number++
            txtCounter.text = "$number"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", number)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        number = savedInstanceState.getInt("counter", 0)
        txtCounter.text = "$number"
    }
}
