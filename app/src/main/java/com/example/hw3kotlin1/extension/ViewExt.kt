package com.example.hw3kotlin1.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_view.view.*

fun ImageView.load(s: String) {
    Glide.with(context).load(s).centerCrop().into(imageView)
}