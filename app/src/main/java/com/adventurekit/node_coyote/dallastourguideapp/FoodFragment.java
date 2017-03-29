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

    /**
     * Populate Food Fragment with Views and data
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Set and inflate a root view to be a ListView to hold the CardView items
        View rootView =  inflater.inflate(R.layout.fragment_list, container, false);

        // Build out the TourLocation data object for the Food category
        final ArrayList<TourLocation> items = new ArrayList<TourLocation>();
        items.add(new TourLocation(R.string.truckyard_title, R.string.truckyard_desc, R.drawable.truckyard));
        items.add(new TourLocation(R.string.flying_saucer_title, R.string.flying_saucer_desc, R.drawable.sauce));
        items.add(new TourLocation(R.string.kellers_title, R.string.kellers_desc, R.drawable.keller));
        items.add(new TourLocation(R.string.uu_title, R.string.uu_desc, R.drawable.lot));
        items.add(new TourLocation(R.string.cad_title, R.string.cad_desc, R.drawable.rustic));

        // Adapt the data to the CardView
        TourLocationAdapter adapter = new TourLocationAdapter(getActivity(), items, R.color.food_background_color);

        // Find the list view and add the data via adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
