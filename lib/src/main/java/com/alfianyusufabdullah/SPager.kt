package com.alfianyusufabdullah

import android.content.Context
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.util.AttributeSet

import java.util.ArrayList

/**
 * Created by jonesrandom on 3/24/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 *
 */

class SPager : ViewPager {

    private var pages: MutableList<PageModel> = ArrayList()
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
        pages.add(PageModel(Page, Title))
    }

    fun build() {
        manager?.let {
            tab?.setupWithViewPager(this)

            val adapter = PageAdapter(it)
            adapter.setPages(pages)
            setAdapter(adapter)

        } ?: throw RuntimeException("Add initFragmentManager() before you call build()")
    }
}
