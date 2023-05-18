package com.example.jmui.model

import android.graphics.drawable.Drawable
import androidx.databinding.ObservableField

data class UserProfile(
    val cash: ObservableField<String> = ObservableField<String>(),
    val chats: ObservableField<String> = ObservableField<String>(),
    val smiles: ObservableField<String> = ObservableField<String>(),
    val name: ObservableField<String> = ObservableField<String>(),
)