package com.example.listviewicon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon.model.Prog

class ListProgAdapter (private val listFood: ArrayList<Prog>) : RecyclerView.Adapter<ListProgAdapter.FoodViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = listFood[position]
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        Glide.with(holder.itemView.context)
            .load(food.poster)
            .into(holder.imgPoster)
    }

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster : ImageView = itemView.findViewById(R.id.img_item_poster)


    }


}