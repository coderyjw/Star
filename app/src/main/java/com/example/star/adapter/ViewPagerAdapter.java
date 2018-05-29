package com.example.star.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.star.bean.FragmentInfo;
import com.example.star.fragment.MonthFragment;
import com.example.star.fragment.TodayFragment;
import com.example.star.fragment.TomorrowFragment;
import com.example.star.fragment.WeekFragment;
import com.example.star.fragment.YearFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm, List<FragmentInfo> mFragments) {
        super(fm);
        this.mFragments = mFragments;
    }

    private   List<FragmentInfo> mFragments;


    public Fragment getItem(int position) {
        return  mFragments.get(position).getFragment();

    }


    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getTitle();
    }



}
