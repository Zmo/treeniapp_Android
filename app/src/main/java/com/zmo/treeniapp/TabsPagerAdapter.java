package com.zmo.treeniapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Simo on 25.4.2014.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ResultsFragment();
            case 1:
                return new CalorieCounterFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
