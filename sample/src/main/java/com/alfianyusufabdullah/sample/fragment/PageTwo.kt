package com.alfianyusufabdullah.sample.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.alfianyusufabdullah.sample.R

/**
 * A simple [Fragment] subclass.
 */
class PageTwo : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page_two, container, false)
    }

}
