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

public class CultureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Summon a list container for the CardView items
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        // Populate data
        ArrayList<TourLocation> items = new ArrayList<TourLocation>();
        items.add(new TourLocation(R.string.matt_title, R.string.matt_desc));
        items.add(new TourLocation(R.string.rock_title, R.string.rock_desc));

        // Adapt data to cardView
        TourLocationAdapter adapter = new TourLocationAdapter(getActivity(), items, R.color.culture_background_color);

        // Find and add CardView with data to ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
