package com.example.newapplicationproject.ui.adabter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.newapplicationproject.R

class userrecyclerview : RecyclerView.Adapter<userrecyclerview.movieviewholder>(){
    class movieviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_moveimage : ImageView = itemView.findViewById(R.id.iv_image_item_move)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieviewholder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return movieviewholder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: movieviewholder, position: Int) {
        TODO("Not yet implemented")
    }
}