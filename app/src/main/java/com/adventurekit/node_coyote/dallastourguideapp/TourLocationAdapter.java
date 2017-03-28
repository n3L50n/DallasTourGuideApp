package com.adventurekit.node_coyote.dallastourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by node_coyote on 3/28/17.
 */

public class TourLocationAdapter extends ArrayAdapter<TourLocation> {

    private int mColorResource;

    public TourLocationAdapter(Context context, ArrayList<TourLocation> items, int colorResource ){
        super(context, 0, items);
        mColorResource = colorResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listCard = convertView;
        if (listCard == null){
            listCard = LayoutInflater.from(getContext()).inflate(R.layout.fragment_card_view, parent, false);
        }

        TourLocation currentItem = getItem(position);

        TextView title = (TextView) listCard.findViewById(R.id.tour_location_title);
        title.setText(currentItem.getLocationTitle());

        TextView description = (TextView) listCard.findViewById(R.id.tour_location_description);
        description.setText(currentItem.getLocationDescription());

        View cardContainer = listCard.findViewById(R.id.card_container);
        int color = ContextCompat.getColor(getContext(), mColorResource);
        cardContainer.setBackgroundColor(color);

        return listCard;
    }
}
