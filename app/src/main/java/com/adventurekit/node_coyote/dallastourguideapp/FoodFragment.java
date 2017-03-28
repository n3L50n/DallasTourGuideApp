package com.adventurekit.node_coyote.dallastourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by node_coyote on 3/27/17.
 */

public class FoodFragment extends Fragment {

    private static final String ARG_PAGE_NUMBER = "page_number";

    public FoodFragment(){

    }

    public static FoodFragment newInstance(int page){
        FoodFragment foodFragment = new FoodFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        foodFragment.setArguments(args);
        return foodFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_food, container, false);
    }

}
