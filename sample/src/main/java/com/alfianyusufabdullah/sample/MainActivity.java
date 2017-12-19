package com.alfianyusufabdullah.sample;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.alfianyusufabdullah.sample.fragment.PageOne;
import com.alfianyusufabdullah.sample.fragment.PageThree;
import com.alfianyusufabdullah.sample.fragment.PageTwo;
import com.alfianyusufabdullah.spager.widget.sViewPager;

public class MainActivity extends AppCompatActivity {

    sViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.mainToolbar);
        toolbar.setTitle("Sample");

        tabLayout = findViewById(R.id.mainTabLayout);

        viewPager = findViewById(R.id.mainPage);
        viewPager.initFragmentManager(getSupportFragmentManager());
        viewPager.addPages("One" , new PageOne());
        viewPager.addPages("Two" , new PageTwo());
        viewPager.addPages("Three" , new PageThree());
        viewPager.addTabLayout(tabLayout);
        viewPager.build();

    }
}
