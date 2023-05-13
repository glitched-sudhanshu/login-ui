package com.example.jmui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.jmui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)

        val list = listOf(
            Testimonial(
                " @manofhearttherock",
                "Had a Great Chat",
                ContextCompat.getDrawable(this, R.drawable.ic_avatar)
            ),
            Testimonial(
                " @sudhanshu",
                "Glad to be here",
                ContextCompat.getDrawable(this, R.drawable.avatar_sudhanshu)
            ),
            Testimonial(
                " @piyush",
                "Nice way to connect healthy minds",
                ContextCompat.getDrawable(this, R.drawable.avatar_piyush)
            ),
            Testimonial(
                " @manofhearttherock",
                "Best way to release stress",
                ContextCompat.getDrawable(this, R.drawable.avatar_cutie)
            ),
            Testimonial(
                " @sudhanshu",
                "Best decision ever made!",
                ContextCompat.getDrawable(this, R.drawable.avatar_smarty)
            )
        )

        val adapter = TestimonialAdapter(activity = this@MainActivity, list)
        val layout = LinearLayoutManager(this)
        mBinding?.rvTesti?.adapter = adapter
        mBinding?.rvTesti?.layoutManager = layout
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}