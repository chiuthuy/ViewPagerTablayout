package com.example.viewpagertablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        addTags(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void addTags(ViewPager viewPager){
        ViewpagerAdapter adapter=new ViewpagerAdapter(getSupportFragmentManager());
        adapter.add(new FragmentOne(),"one");
        adapter.add(new FragmentTwo(),"two");
        adapter.add(new FragmentThree(),"Three");
        viewPager.setAdapter(adapter);
    }
}
