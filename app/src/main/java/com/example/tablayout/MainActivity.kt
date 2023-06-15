package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout=findViewById<TabLayout>(R.id.tablayout)
        val viewPager=findViewById<ViewPager>(R.id.framlayout)
        val adapter= TabAdapter(supportFragmentManager)
        adapter.addFragment(ChatFragment(),"Chats")
        adapter.addFragment(StatusFragment(),"Status")
        adapter.addFragment(CallFragment(),"Calls")


        viewPager.adapter=adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}