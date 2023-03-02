package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewMIdel : ViewModel() {
    private val factLiveDataObject = MutableLiveData<String> ("this is a fact")

    val factLiveData : LiveData<String>
    get() = factLiveDataObject

    fun updateLiveData(){
        factLiveDataObject.value = "Another fact"
    }
}