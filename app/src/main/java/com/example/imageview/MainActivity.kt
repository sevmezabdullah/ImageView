package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            imageView.setImageResource(R.drawable.resim1)
        }

        button2.setOnClickListener {
            imageView.setImageResource(R.drawable.resim2)
            imageView.setImageResource(resources.getIdentifier("resim2", "drawable", packageName))
        }
    }
}