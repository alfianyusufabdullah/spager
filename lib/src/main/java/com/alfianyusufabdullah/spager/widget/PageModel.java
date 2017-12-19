package com.alfianyusufabdullah.spager.widget;

import android.support.v4.app.Fragment;

/**
 * Created by jonesrandom on 12/19/17.
 * <p>
 * AA
 */

class PageModel {

    private Fragment Page;
    private String Title;

    public PageModel(Fragment page, String title) {
        Page = page;
        Title = title;
    }

    public Fragment getPage() {
        return Page;
    }

    public String getTitle() {
        return Title;
    }
}
