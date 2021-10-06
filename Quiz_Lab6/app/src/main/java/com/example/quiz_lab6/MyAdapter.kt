package com.example.quiz_lab6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_shopping.view.*
import kotlinx.android.synthetic.main.item_list.view.*



class MyAdapter (var products:ArrayList<Product>, val mItemClickListener:onItemClickListener) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.itemView.img_prod.setImageResource(
            products[position].image
        )
        holder.itemView.txt_prodTitle.text = products[position].title
        holder.itemView.txt_prodColor.text = "Color: " + products[position].color
        holder.itemView.txt_prodPrice.text = "Price: " + products[position].price.toString()
    }



    override fun getItemCount(): Int {
        return products.size
    }
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener{
                mItemClickListener.onItemClick(adapterPosition)
            }
        }
    }

}