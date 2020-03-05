package com.example.helloworld;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.helloworld.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3
    };

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new com.dicoding.tablayout.FragmentProfile();
                break;
            case 1:
                fragment = new com.dicoding.tablayout.FragmentStatus();
                break;
            case 2:
                fragment = new com.dicoding.tablayout.FragmentPanggilan();
                break;
        }
        return fragment;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    @Override
    public int getCount() {
        return 3;
    }
}