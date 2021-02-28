package com.example.readvk.ui.NewsFeed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsFeedModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "news"
    }
    val text: LiveData<String> = _text
}