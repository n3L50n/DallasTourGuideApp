package com.adventurekit.node_coyote.dallastourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by node_coyote on 3/27/17.
 */

public class TourAdapter extends FragmentStatePagerAdapter {

    public TourAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        if (position == 0){
            return new FoodFragment();
        } else if (position == 1){
            return new ArtFragment();
        } else if (position == 2){
            return new CultureFragment();
        } else {
            return new OutdoorsFragment();
        }
    }

    @Override
    public int getCount(){
        return 4;
    }
}
