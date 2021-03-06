package com.example.viewpagertablayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewpagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> frmlist=new ArrayList<>();
    ArrayList<String > title=new ArrayList<>();

    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return frmlist.get(position);
    }

    @Override
    public int getCount() {
        return frmlist.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
    public void add(Fragment frm, String tt){
        frmlist.add(frm);
        title.add(tt);
    }
}
