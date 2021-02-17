package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val dataList:List<DataItem>): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>(){
     inner class RecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
         val text1: TextView= itemView.findViewById(R.id.question);
         val text2: TextView= itemView.findViewById(R.id.answer);

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView= RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_explore,parent,false));
        return itemView;
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentItem= dataList[position];
        holder.text1.text=currentItem.text1;
        holder.text2.text=currentItem.text2;

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}