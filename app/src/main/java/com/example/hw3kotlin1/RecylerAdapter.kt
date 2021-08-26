package com.example.hw3kotlin1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.MenuView
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView


open class RecylerAdapter (private val  Mlist: ArrayList<ItemsViewModel>):
    RecyclerView.Adapter<RecylerAdapter.ViewHolder>(){

        class ViewHolder(ItemView :View):RecyclerView.ViewHolder(ItemView){
       val RecyclerView : RecyclerView = ItemView.findViewById(R.id.recyler_photo)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
  val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.item_view_photo,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     val ItemsViewModel = Mlist[position]
      ItemsViewModel.RecylerView.also { holder.RecyclerView.get(43) }
    }

    override fun getItemCount(): Int {
     return Mlist.size
    }
}

