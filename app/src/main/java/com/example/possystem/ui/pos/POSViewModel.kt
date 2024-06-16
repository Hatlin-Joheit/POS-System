package com.example.possystem.ui.pos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class POSViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is POS System"
    }
    val text: LiveData<String> = _text
}