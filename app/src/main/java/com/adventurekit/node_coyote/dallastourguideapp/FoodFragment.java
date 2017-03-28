package com.adventurekit.node_coyote.dallastourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

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

        View rootView =  inflater.inflate(R.layout.fragment_food, container, false);

        final ArrayList<TourLocation> items = new ArrayList<TourLocation>();
        items.add(new TourLocation(R.string.lfh_title, R.string.lfh_description));

        TourLocationAdapter adapter = new TourLocationAdapter(getActivity(), items, R.color.food_background_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
