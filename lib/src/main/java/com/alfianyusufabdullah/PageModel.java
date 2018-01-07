package com.alfianyusufabdullah;

import android.support.v4.app.Fragment;

/**
 * Created by jonesrandom on 12/19/17.
 * <p>
 * AA
 */

class PageModel {

    private Fragment Page;
    private String Title;

    PageModel(Fragment page, String title) {
        Page = page;
        Title = title;
    }

    Fragment getPage() {
        return Page;
    }

    String getTitle() {
        return Title;
    }
}
