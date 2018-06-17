package com.alfianyusufabdullah.sample

import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.alfianyusufabdullah.initViewPager

import com.alfianyusufabdullah.sample.fragment.PageOne
import com.alfianyusufabdullah.sample.fragment.PageThree
import com.alfianyusufabdullah.sample.fragment.PageTwo

class KotlinExampleActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.mainToolbar)
        toolbar.title = "Sample"

        tabLayout = findViewById(R.id.mainTabLayout)

        initViewPager(R.id.mainPage , tabLayout) {
            addPages("One", PageOne())
            addPages("Two", PageTwo())
            addPages("Three", PageThree())
        }
    }
}
