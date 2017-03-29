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

public class ArtFragment extends Fragment {

    /**
     * Populate Art Fragment with Views and data
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Summon ListView as a root to hold CardViews
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        // Populate with data from Art category
        ArrayList<TourLocation> items = new ArrayList<TourLocation>();
        items.add(new TourLocation(R.string.beach_house_title, R.string.beach_house_desc, R.drawable.beach_house));
        items.add(new TourLocation(R.string.museum_title, R.string.museum_desc, R.drawable.museum));
        items.add(new TourLocation(R.string.de_title, R.string.de_desc));
        items.add(new TourLocation(R.string.arch_title, R.string.arch_desc, R.drawable.tub));
        items.add(new TourLocation(R.string.mural_title, R.string.mural_desc, R.drawable.mural));

        // Adapt Art data to CardView
        TourLocationAdapter adapter = new TourLocationAdapter(getActivity(), items, R.color.art_background_color);

        // Find and add CardView with data to Listview
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
