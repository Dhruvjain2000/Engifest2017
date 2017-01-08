package org.sddtu.engifest2017.DataProviders;

import se.emilsjolander.flipview.FlipView;

/**
 * Created by mohitkumar on 07/01/17.
 */

public class FlipViewData {

    private String place;
    private int imagesrc;
    private String buttext;

    public FlipViewData(String place,int imagesrc,String buttext)
    {
        this.place = place;
        this.imagesrc = imagesrc;
        this.buttext = buttext;
    }

    public String getButtext() {
        return buttext;
    }

    public void setButtext(String buttext) {
        this.buttext = buttext;
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
