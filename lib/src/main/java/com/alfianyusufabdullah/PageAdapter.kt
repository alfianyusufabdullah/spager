package com.alfianyusufabdullah

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by jonesrandom on 3/24/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

internal class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var pages: MutableList<PageModel> = mutableListOf()

    fun setPages(pages: MutableList<PageModel>) {
        this.pages = pages
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
