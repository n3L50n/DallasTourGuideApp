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

public class OutdoorsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Summon a ListView as root to hole CardView items
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        // Build Outdoor category data into Cardview
        final ArrayList<TourLocation> items = new ArrayList<TourLocation>();
        items.add(new TourLocation(R.string.wrl_title, R.string.wrl_desc));

        // Adapt the data to the CardView
        TourLocationAdapter adapter = new TourLocationAdapter(getActivity(), items, R.color.outdoors_background_color);

        // Find a Listview to hold the populated CardView items
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView ;
    }
}
