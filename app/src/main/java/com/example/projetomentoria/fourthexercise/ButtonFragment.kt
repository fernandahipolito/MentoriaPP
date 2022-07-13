package com.example.projetomentoria.fourthexercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.projetomentoria.R
import com.example.projetomentoria.databinding.FragmantButtonBinding
import com.example.projetomentoria.thirdexercise.ThirdExerciseViewModel
import java.nio.channels.Selector

class ButtonFragment: Fragment(R.layout.fragmant_button) {

    private val buttonClicked: Button =
    private val model: ThirdExerciseViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        .setOnClickListener {
            model.increment()
        }

    }
    //companion object {
     //   fun newInstance() = ButtonFragment()
    //}

    //override fun onCreateView(
     //   inflater: LayoutInflater,
     //   container: ViewGroup?,
     //   savedInstanceState: Bundle?
  //  ): View? {
  //      return inflater.inflate(R.layout.fragmant_button, container, false)
  //  }
}