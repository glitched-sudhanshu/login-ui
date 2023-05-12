package com.example.jmui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            Testimonial(" @manofhearttherock", "Had a Great Chat"),
            Testimonial(" @sudhanshu", "Glad to be here"),
            Testimonial(" @piyush", "Nice way to connect healthy minds"),
            Testimonial(" @manofhearttherock", "Had a Great Chat"),
            Testimonial(" @sudhanshu", "Glad to be here"),
            Testimonial(" @piyush", "Nice way to connect healthy minds")
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