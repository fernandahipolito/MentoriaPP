package com.example.projetomentoria.exerciseone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.projetomentoria.R

class FirstExerciseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_exercise)
        Log.d("ActivityLifecycle", "App em OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifecycle", "App em OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle", "App em OnResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifecycle", "App em OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifecycle", "App em OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifecycle", "App em OnDestroy")
    }
}