package com.example.hw3kotlin1.Adapter


import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3kotlin1.R
import com.example.hw3kotlin1.databinding.ItemViewBinding
import com.example.hw3kotlin1.extension.load


class MyAdapter(private val imgUrls: ArrayList<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var clickListener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false),
            clickListener
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(imgUrls[position])
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        clickListener = listener
    }

    override fun getItemCount() = imgUrls.size

    class MyViewHolder(itemView: View, var clickListener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView) {

        private val binding = ItemViewBinding.bind(itemView)

        fun onBind(imgUrl: String) {

            binding.imageView.load(imgUrl)
            itemView.setOnClickListener {
                clickListener.onItemClick(imgUrl)
                it.setBackgroundColor(Color.YELLOW)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(img: String)
    }
}