package com.example.projetomentoria.thirdexercise

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdExerciseViewModel  : ViewModel() {
    private val mutableValueLiveData = MutableLiveData(0)
    //consigo atualizar o valor dele através do método setValue que corresponde ao value(val privada)
    val valueLiveData: LiveData<Int> = mutableValueLiveData
    //não consigo alterar ele pois é o valor que será exposto para nossa view (val publica)
//a view não pode alterar o valor dele, o valor só pode ser alterado aqui na viewModel
    fun increment() {
        mutableValueLiveData.value = valueLiveData.value?.plus(1)
    }

}