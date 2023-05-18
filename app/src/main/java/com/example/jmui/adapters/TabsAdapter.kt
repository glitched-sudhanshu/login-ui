package com.example.jmui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.jmui.databinding.RvTabItemBinding
import com.example.jmui.model.Tabs

class TabsAdapter(private val context : Context, private val tabList: List<Tabs>) :
    RecyclerView.Adapter<TabsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(RvTabItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = tabList[position]
        holder.tvText.text = item.title
        holder.tvText.background = item.background
        holder.tvText.setOnClickListener {
            Toast.makeText(context, "${item.title} clicked", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = tabList.size


    class ViewHolder(view: RvTabItemBinding) : RecyclerView.ViewHolder(view.root) {
        val tvText = view.txtTab
    }
}