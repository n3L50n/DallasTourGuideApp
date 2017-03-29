package com.adventurekit.node_coyote.dallastourguideapp;

/**
 * Created by node_coyote on 3/28/17.
 */

public class TourLocation {

    private int mLocationTitle;
    private int mLocationDescription;
    private int mLocationImage = NO_IMAGE_PROVIDED;

    /** Set if no image is provided */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor to provide Title and Description for a given Tour item
     * @param locationTitle
     * @param locationDescripton
     */
    public TourLocation(int locationTitle, int locationDescripton){

        mLocationTitle = locationTitle;
        mLocationDescription = locationDescripton;

    }

    /**
     * Constructor to provide Title, Description, and Image for a given tour item
     * @param locationTitle
     * @param locationDescription
     * @param locationImage
     */
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

    // Return an image or not
    public boolean hasImage() {
        return mLocationImage != NO_IMAGE_PROVIDED;
    }
}
