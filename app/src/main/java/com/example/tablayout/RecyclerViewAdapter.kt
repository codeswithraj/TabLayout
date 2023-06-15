package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sample.DataModel
import com.example.tablayout.ChatFragment
import com.example.tablayout.R

class RecyclerViewAdapter(val context: Context, val datalist: List<DataModel>, val setonclick: setOnClick):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val View =LayoutInflater.from(parent.context).inflate(R.layout.customlistview,parent,false)
        return ViewHolder(View)
    }

    override fun onBindViewHolder(holder:RecyclerViewAdapter.ViewHolder, position: Int) {
        val data =datalist[position]
        holder.description.text=data.description
        holder.title.text=data.title
        Glide.with(context).load(data.image).into(holder.image)
        holder.itemView.setOnClickListener{
            setonclick.onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return datalist.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.image)
        val title=itemView.findViewById<TextView>(R.id.title)
        val description=itemView.findViewById<TextView>(R.id.description)
    }


}

interface setOnClick{
    fun onClick(position: Int)
}
