package com.alfianyusufabdullah.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alfianyusufabdullah.init
import com.alfianyusufabdullah.sample.fragment.PageOne
import com.alfianyusufabdullah.sample.fragment.PageThree
import com.alfianyusufabdullah.sample.fragment.PageTwo
import kotlinx.android.synthetic.main.activity_main.*

class KotlinExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainToolbar.title = "SPager"

        mainPage.init(mainTabLayout) {
            addPages("One" , PageOne())
            addPages("Two" , PageTwo())
            addPages("Three" , PageThree())
        }
    }
}
