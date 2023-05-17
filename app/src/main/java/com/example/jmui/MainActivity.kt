package com.example.jmui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar.Tab
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.jmui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var mBinding: ActivityMainBinding? = null
    private val user = UserProfile()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        user.cash = "0"
        user.image = ContextCompat.getDrawable(this, R.drawable.ic_avatar)
        user.chats = "15334"
        user.smiles = "18543"
        user.name = "london98"


        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding?.user = user

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
                " @scott",
                "Best way to release stress",
                ContextCompat.getDrawable(this, R.drawable.avatar_cutie)
            ),
            Testimonial(
                " @rolyn",
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
            Tabs(
                "\uD83D\uDCDA Academics",
                ContextCompat.getDrawable(this, R.drawable.academics_bg)
            ),
            Tabs(
                "\uD83E\uDD38\u200D♂️ Activities",
                ContextCompat.getDrawable(this, R.drawable.rlshp_bg)
            ),
            Tabs("\uD83E\uDEC2 Friends", ContextCompat.getDrawable(this, R.drawable.work_bg)),
            Tabs(
                "\uD83C\uDFF3️\u200D\uD83C\uDF08 Achievements",
                ContextCompat.getDrawable(this, R.drawable.academics_bg)
            ),
        )

        val tabAdapter = TabsAdapter(activity = this@MainActivity, listTabs)
        val tabLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mBinding?.rvTabs?.adapter = tabAdapter
        mBinding?.rvTabs?.layoutManager = tabLayout



        clickListeners()
    }

    private fun clickListeners() {
        mBinding!!.imgProfile.setOnClickListener(this)
        mBinding!!.txtProfile.setOnClickListener(this)
        mBinding!!.imgWallet.setOnClickListener(this)
        mBinding!!.imgSettings.setOnClickListener(this)
        mBinding!!.imgBack.setOnClickListener(this)
        mBinding!!.btnAddBio.setOnClickListener(this)
        mBinding!!.btnShareProfile.setOnClickListener(this)
        mBinding!!.cvSmile.setOnClickListener(this)
        mBinding!!.cvCash.setOnClickListener(this)
        mBinding!!.cvChats.setOnClickListener(this)
        mBinding!!.cvPremium.setOnClickListener(this)
        mBinding!!.btnTnE.setOnClickListener(this)
        mBinding!!.btnUpgrade.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            mBinding!!.imgProfile.id -> {
                Toast.makeText(this, "Profile image clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.txtProfile.id -> {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.imgWallet.id -> {
                Toast.makeText(this, "Wallet clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.imgSettings.id -> {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.imgBack.id -> {
                Toast.makeText(this, "Back button clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.btnAddBio.id -> {
                Toast.makeText(this, "Add Bio clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.btnShareProfile.id -> {
                Toast.makeText(this, "Share profile clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.cvSmile.id -> {
                Toast.makeText(this, "Smiles clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.cvCash.id -> {
                Toast.makeText(this, "Cash clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.cvChats.id -> {
                Toast.makeText(this, "Chats clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.cvPremium.id -> {
                Toast.makeText(this, "Premium clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.btnUpgrade?.id -> {
                Toast.makeText(this, "Upgrade clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.btnTnE?.id -> {
                Toast.makeText(this, "Talk & Earn clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}