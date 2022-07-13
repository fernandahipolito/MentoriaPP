package com.example.projetomentoria.fourthexercise

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.projetomentoria.R
import com.example.projetomentoria.thirdexercise.ThirdExerciseViewModel

class FourthExerciseActivity : AppCompatActivity(R.layout.activity_fourth_exercise) {
    private val model: ThirdExerciseViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState == null) {
            supportFragmentManager
               // .beginTransaction()
               // .add(R.id.fragment_container_text,TextFragment.newInstance(),
               // "text counter")
              ////  .add(R.id.fragment_container_button,ButtonFragment.newInstance(),
             //   "button")
                .commit {
                    replace(R.id.fragment_container_text,TextFragment())
                    replace (R.id.fragment_container_button,ButtonFragment())
                }
        }



        /*if (savedInstanceState ==null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<TextFragment>(R.id.fragment_container_text)
                add<ButtonFragment>(R.id.fragment_container_button)

                }
            }*/
        }

}