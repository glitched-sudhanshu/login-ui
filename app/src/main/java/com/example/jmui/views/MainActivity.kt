package com.example.jmui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jmui.R
import com.example.jmui.model.Tabs
import com.example.jmui.adapters.TabsAdapter
import com.example.jmui.model.Testimonial
import com.example.jmui.adapters.TestimonialAdapter
import com.example.jmui.databinding.ActivityMainBinding
import com.example.jmui.viewmodels.MainViewModel

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var mBinding: ActivityMainBinding? = null
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding?.user = viewModel.user

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
            ),
            Testimonial(
                " @ketan",
                "Best app in the market",
                ContextCompat.getDrawable(this, R.drawable.avatar_piyush)
            ),
            Testimonial(
                " @binks",
                "Healthy to young minds",
                ContextCompat.getDrawable(this, R.drawable.avatar_cutie)
            ),
            Testimonial(
                " @pinkie",
                "Best therapy!",
                ContextCompat.getDrawable(this, R.drawable.avatar_smarty)
            )
        )

        val adapter = TestimonialAdapter(list)
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

        val tabAdapter = TabsAdapter(applicationContext, listTabs)
        val tabLayout = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mBinding?.rvTabs?.adapter = tabAdapter
        mBinding?.rvTabs?.layoutManager = tabLayout

        clickListeners()
    }

    private fun clickListeners() {
        mBinding?.let {
            with(it){
                imgProfile.setOnClickListener(this@MainActivity)
                txtProfile.setOnClickListener(this@MainActivity)
                imgWallet.setOnClickListener(this@MainActivity)
                imgSettings.setOnClickListener(this@MainActivity)
                imgBack.setOnClickListener(this@MainActivity)
                btnAddBio.setOnClickListener(this@MainActivity)
                btnShareProfile.setOnClickListener(this@MainActivity)
                cvSmile.setOnClickListener(this@MainActivity)
                cvCash.setOnClickListener(this@MainActivity)
                cvChats.setOnClickListener(this@MainActivity)
                cvPremium.setOnClickListener(this@MainActivity)
                btnTnE.setOnClickListener(this@MainActivity)
                btnUpgrade.setOnClickListener(this@MainActivity)
            }
        }
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

            mBinding!!.btnUpgrade.id -> {
                Toast.makeText(this, "Upgrade clicked", Toast.LENGTH_SHORT).show()
            }

            mBinding!!.btnTnE.id -> {
                Toast.makeText(this, "Talk & Earn clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}