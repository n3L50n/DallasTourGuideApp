package com.adventurekit.node_coyote.dallastourguideapp;

/**
 * Created by node_coyote on 3/28/17.
 */

public class TourLocation {

    private int mLocationTitle;
    private int mLocationDescription;
    private int mLocationImage;

    public TourLocation(int locationTitle, int locationDescripton){

        mLocationTitle = locationTitle;
        mLocationDescription = locationDescripton;

    }

    public TourLocation(int locationTitle, int locationDescription, int locationImage){
        mLocationTitle = locationTitle;
        mLocationDescription = locationDescription;
        mLocationImage = locationImage;
    }

    public int getLocationTitle(){
        return mLocationTitle;
    }

    public int getLocationDescription(){
        return mLocationDescription;
    }

    public int getLocationImage(){
        return mLocationImage;
    }
}
