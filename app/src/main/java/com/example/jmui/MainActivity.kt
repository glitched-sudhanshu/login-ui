package com.example.jmui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar.Tab
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


        val listTabs = listOf(
            Tabs("\uD83D\uDCBC Work", ContextCompat.getDrawable(this, R.drawable.work_bg)),
            Tabs("❤️ Relationship", ContextCompat.getDrawable(this, R.drawable.rlshp_bg)),
            Tabs("\uD83D\uDCDA Academics", ContextCompat.getDrawable(this, R.drawable.academics_bg)),
            Tabs("\uD83D\uDCBC Work", ContextCompat.getDrawable(this, R.drawable.work_bg)),
            Tabs("❤️ Relationship", ContextCompat.getDrawable(this, R.drawable.rlshp_bg)),
            Tabs("\uD83D\uDCDA Academics", ContextCompat.getDrawable(this, R.drawable.academics_bg)),
        )

//        val tabAdapter = TabsAdapter(activity = this@MainActivity, listTabs)
//        val tabLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        mBinding?.rvTabs?.adapter = tabAdapter
//        mBinding?.rvTabs?.layoutManager = tabLayout
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}