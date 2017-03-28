package com.adventurekit.node_coyote.dallastourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by node_coyote on 3/27/17.
 */

public class FoodFragment extends Fragment {

    public FoodFragment(){
            // Required Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView =  inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<TourLocation> items = new ArrayList<TourLocation>();
        items.add(new TourLocation(R.string.truckyard_title, R.string.truckyard_desc));
        items.add(new TourLocation(R.string.flying_saucer_title, R.string.flying_saucer_desc));
        items.add(new TourLocation(R.string.kellers_title, R.string.kellers_desc));

        TourLocationAdapter adapter = new TourLocationAdapter(getActivity(), items, R.color.food_background_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
