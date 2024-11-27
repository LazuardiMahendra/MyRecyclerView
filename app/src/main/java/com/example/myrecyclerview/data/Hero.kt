package com.example.myrecyclerview.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    val name: String,
    val desc: String,
    val photo: String
) : Parcelable


