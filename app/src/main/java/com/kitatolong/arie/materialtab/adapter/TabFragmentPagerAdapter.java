package com.kitatolong.arie.materialtab.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.kitatolong.arie.materialtab.fragment.Tab1Fragment;
import com.kitatolong.arie.materialtab.fragment.Tab2Fragment;

/**
 * Created by Arie on 3/2/2016.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    public TabFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    String[] title = new String[]{
            "Tab 1",
            "Tab 2"
    };

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }

    public CharSequence getPageTitle(int position){
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
