package com.adventurekit.node_coyote.dallastourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by node_coyote on 3/27/17.
 */

public class TourSliderAdapter extends FragmentPagerAdapter {

    public TourSliderAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FoodFragment();
            case 1:
                return new CultureFragment();
            case 2:
                return new ArtFragment();
            case 3:
                return new OutdoorsFragment();
            default:
                return new FoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "FOOD";
            case 1:
                return "CULTURE";
            case 2:
                return "ART";
            case 3:
                return "OUTDOORS";
        }
        return "What";
    }
}
