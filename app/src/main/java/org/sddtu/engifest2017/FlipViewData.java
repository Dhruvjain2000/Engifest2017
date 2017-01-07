package org.sddtu.engifest2017;

import se.emilsjolander.flipview.FlipView;

/**
 * Created by mohitkumar on 07/01/17.
 */

public class FlipViewData {

    private String place;
    private int imagesrc;

    public FlipViewData(String place,int imagesrc)
    {
        this.place = place;
        this.imagesrc = imagesrc;
    }

    public int getImagesrc() {
        return imagesrc;
    }

    public String getPlace() {
        return place;
    }

    public void setImagesrc(int imagesrc) {
        this.imagesrc = imagesrc;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
