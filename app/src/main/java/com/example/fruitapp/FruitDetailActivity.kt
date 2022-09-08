package com.example.fruitapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class FruitDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fruits_detail)

        val name = intent?.extras?.getString("Value1").toString()
        title = name

        val descrip = intent?.extras?.getString("Value2").toString()
        val textView: TextView = findViewById(R.id.textView2)
        textView.text = descrip

        val imageView: ImageView = findViewById(R.id.imageView3)
        val pic: Int = intent.extras!!.getInt("Value3")
        imageView.setImageResource(pic)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}





