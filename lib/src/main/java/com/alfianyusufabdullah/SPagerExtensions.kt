package com.alfianyusufabdullah

import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by jonesrandom on 3/24/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 *
 */

inline fun SPager.init(tabLayout: TabLayout? = null, addPage: SPager.() -> Unit) {
    initFragmentManager((context as AppCompatActivity).supportFragmentManager)
    tabLayout?.setupWithViewPager(this)
    addPage()
    build()
}