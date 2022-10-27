package com.example.movietheaterapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie (
    var image: Int,
    var title: String,
    var detail: String,
    var photo: Int,
    var name: String
) : Parcelable