package com.example.fruitapp.adapters

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fruitapp.FruitDetailActivity
import com.example.fruitapp.R
import com.example.fruitapp.model.Fruit
import android.view.View as View1

class Fruitadapter (

    private val dataset: List<Fruit>): RecyclerView.Adapter<Fruitadapter.ItemviewHolder>() {


    class ItemviewHolder (val view: View1) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageview : ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemviewHolder {
       val adapterlayout = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_view, parent, false)
        return ItemviewHolder(adapterlayout)
    }

    override fun onBindViewHolder(holder: ItemviewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = item.Name
        holder.imageview.setImageResource(item.imageResourceId)
        holder.view.setOnClickListener {
            val context = holder.view.context
            val intent =  Intent(context, FruitDetailActivity::class.java)
            intent.putExtra("Value1",item.Name)
            val descrip = context.resources.getString(item.stringResourceId)
            intent.putExtra("Value2",descrip)
            intent.putExtra("Value3",item.imageResourceId)
            context.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
        return  dataset.size
    }
    }





