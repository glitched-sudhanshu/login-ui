package com.example.jmui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jmui.databinding.RvItemBinding

class TestimonialAdapter(
    private val activity: MainActivity,
    private val testimonials : List<Testimonial>
) : RecyclerView.Adapter<TestimonialAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val binding : RvItemBinding = RvItemBinding.inflate(LayoutInflater.from(activity), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TestimonialAdapter.ViewHolder, position: Int) {
        val item = testimonials[position]
        holder.bind(item)
    }


    override fun getItemCount(): Int {
        return testimonials.size
    }


    class ViewHolder(private val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Testimonial) {
            binding.item = item
            binding.executePendingBindings()
        }
    }
}