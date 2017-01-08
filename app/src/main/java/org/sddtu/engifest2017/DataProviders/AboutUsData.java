package org.sddtu.engifest2017.DataProviders;

import org.sddtu.engifest2017.AboutUs;

/**
 * Created by mohitkumar on 08/01/17.
 */

public class AboutUsData {

    private String name,designation,mobile,contact;
    private int imgsrc;

    public AboutUsData(String name,String designation,String mobile,String contact,int imgsrc) {
        this.setName(name);
        this.setContact(contact);
        this.setDesignation(designation);
        this.setMobile(mobile);
        this.setImgsrc(imgsrc);
    }

    public int getImgsrc() {
        return imgsrc;
    }
    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getDesignation() {
        return designation;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setImgsrc(int imgsrc) {
        this.imgsrc = imgsrc;
    }
}
