package com.alfianyusufabdullah

import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.util.AttributeSet

import java.util.ArrayList

/**
 * Created by jonesrandom on 12/19/17.
 *
 *
 * AA
 */

class SPager : ViewPager {

    private var pages: ArrayList<SPagerModel> = arrayListOf()
    private var manager: FragmentManager? = null
    private var tab: TabLayout? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    fun initFragmentManager(manager: FragmentManager) {
        this.manager = manager
    }

    fun addTabLayout(tab: TabLayout) {
        this.tab = tab
    }

    fun addPages(Title: String, Page: Fragment) {
        pages.add(SPagerModel(Page, Title))
    }

    fun build() {
        if (manager == null) {
            throw RuntimeException("Add initFragmentManager() before call build()")
        }

        tab?.setupWithViewPager(this)

        val adapter = SPagerAdapter(manager)
        adapter.setPages(pages)
        setAdapter(adapter)
    }
}
