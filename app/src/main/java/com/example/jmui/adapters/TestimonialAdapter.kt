package com.example.jmui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jmui.model.Testimonial
import com.example.jmui.databinding.RvItemBinding

class TestimonialAdapter(
    private val testimonials: List<Testimonial>,
) : RecyclerView.Adapter<TestimonialAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) = ViewHolder(
        RvItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = testimonials[position]
        with(holder) {
            bind(item)
        }
    }


    override fun getItemCount(): Int = testimonials.size


    class ViewHolder(private val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Testimonial) {
            binding.item = item
            binding.executePendingBindings()
        }
    }
}