package com.alfianyusufabdullah.spager.widget;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by jonesrandom on 12/19/17.
 * <p>
 * AA
 */

class PageAdapter extends FragmentPagerAdapter {

    private List<PageModel> pages;

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setPages(List<PageModel> pages) {
        this.pages = pages;
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position).getPage();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return pages.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return pages.size();
    }
}
