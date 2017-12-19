package com.alfianyusufabdullah.sample.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alfianyusufabdullah.sample.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageTwo extends Fragment {

    public PageTwo() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_two, container, false);
    }

}
