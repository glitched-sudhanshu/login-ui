package com.example.jmui

import android.graphics.drawable.Drawable

data class UserProfile(
    var name: String? = null,
    var image: Drawable? = null,
    var smiles: String? = null,
    var chats: String? = null,
    var cash: String? = null,
)