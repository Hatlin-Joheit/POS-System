package com.example.possystem.ui.supplies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SuppliesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is supplies page"
    }
    val text: LiveData<String> = _text
}