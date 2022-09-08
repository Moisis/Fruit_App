package com.example.fruitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitapp.adapters.Fruitadapter
import com.example.fruitapp.database.Database

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = Database().loadfruits()
        val recyclerView = findViewById<RecyclerView>(R.id.recycleview1)
        recyclerView.adapter= Fruitadapter(data)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.setHasFixedSize(true)


    }


}




