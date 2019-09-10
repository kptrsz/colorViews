package com.ptr.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(tv_box1, tv_box2, tv_box3, tv_box4, tv_box5)
        for (v in clickableViews) {
            v.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.tv_box1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_box2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.tv_box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tv_box4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tv_box5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
