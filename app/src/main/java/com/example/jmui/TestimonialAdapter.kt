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
    ): TestimonialAdapter.ViewHolder {
        val binding : RvItemBinding = RvItemBinding.inflate(LayoutInflater.from(activity), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TestimonialAdapter.ViewHolder, position: Int) {
        val item = testimonials[position]
        holder.tvText.text = item.email
        holder.tvReview.text = item.review
        holder.imgProfile.setImageDrawable(item.image)
    }

    override fun getItemCount(): Int {
        return testimonials.size
    }

    class ViewHolder(view : RvItemBinding) : RecyclerView.ViewHolder(view.root) {
        val tvText = view.txtEmail
        val tvReview = view.txtReview
        val imgProfile = view.imgProfile
    }
}