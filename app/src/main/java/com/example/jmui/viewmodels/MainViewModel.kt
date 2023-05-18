package com.example.jmui.viewmodels

import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import com.example.jmui.R
import com.example.jmui.model.UserProfile

class MainViewModel : ViewModel() {

    var user = UserProfile()

    init {
        user.cash.set("0")
        user.chats.set("15334")
        user.smiles.set("18543")
        user.name.set("london98")
    }


}