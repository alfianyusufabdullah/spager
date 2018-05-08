package com.alfianyusufabdullah.sample

import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import com.alfianyusufabdullah.SPager
import com.alfianyusufabdullah.sample.fragment.PageOne
import com.alfianyusufabdullah.sample.fragment.PageThree
import com.alfianyusufabdullah.sample.fragment.PageTwo


class MainActivity : AppCompatActivity() {

    //    sViewPager viewPager;
    lateinit var mainTabLayout: TabLayout
    lateinit var mainToolbar: Toolbar
    lateinit var mainPage: SPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainToolbar = findViewById(R.id.mainToolbar)
        mainToolbar.title = "Sample"

        mainTabLayout = findViewById(R.id.mainTabLayout)

        mainPage = findViewById(R.id.mainPage)

        mainPage.initFragmentManager(supportFragmentManager)
        mainPage.addPages("One" , PageOne())
        mainPage.addPages("Two" , PageTwo())
        mainPage.addPages("Three" , PageThree())
        mainPage.addTabLayout(mainTabLayout)
        mainPage.build()

    }
}
