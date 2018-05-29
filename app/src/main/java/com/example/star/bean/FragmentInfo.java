package com.example.star.bean;

import android.support.v4.app.Fragment;

public class FragmentInfo {
    private String title;

    public FragmentInfo(String title, Fragment fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public Fragment getFragment() {

        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    private Fragment fragment;
}
