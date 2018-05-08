package com.alfianyusufabdullah

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by jonesrandom on 12/19/17.
 *
 * AA
 */

internal class SPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    private var pages: ArrayList<SPagerModel> = arrayListOf()

    fun setPages(pages: ArrayList<SPagerModel>) {
        this.pages.addAll(pages)
    }

    override fun getItem(position: Int): Fragment {
        return pages[position].page
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pages[position].title
    }

    override fun getCount(): Int {
        return pages.size
    }
}
