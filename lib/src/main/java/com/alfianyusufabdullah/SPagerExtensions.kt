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

inline fun AppCompatActivity.initViewPager(id: Int, tabLayout: TabLayout? = null, addPage: SPager.() -> Unit) {
    val pages = findViewById<SPager>(id)
    tabLayout?.setupWithViewPager(pages)
    pages.initFragmentManager(supportFragmentManager)
    pages.addPage()
    pages.build()
}

inline fun Fragment.initViewPager(id: Int, tabLayout: TabLayout? = null, addPage: SPager.() -> Unit) {
    val pages = view?.findViewById<SPager>(id)
    tabLayout?.setupWithViewPager(pages)
    pages?.initFragmentManager(childFragmentManager)
    pages?.addPage()
    pages?.build()
}