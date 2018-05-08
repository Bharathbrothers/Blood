package com.starks.blooddonation;

/**
 * Created by RCP on 5/8/2018.
 */

public class Postfeed {
    String postId;
    String BloodType;
    String HospitalLoc;
    String City;

    public void setBloodType(String bloodType) {
        BloodType = bloodType;
    }

    public void setHospitalLoc(String hospitalLoc) {
        HospitalLoc = hospitalLoc;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCinfo(String cinfo) {
        Cinfo = cinfo;
    }

    String Description;
    String Cinfo;
    Postfeed(){

    }

    public Postfeed(String postId, String bloodType, String hospitalLoc, String city, String description,String cinfo) {
        this.postId = postId;
        BloodType = bloodType;
        HospitalLoc = hospitalLoc;
        City = city;
        Description = description;
        Cinfo = cinfo;
    }

    public String getPostId() {
        return postId;
    }

    public String getBloodType() {
        return BloodType;
    }

    public String getHospitalLoc() {
        return HospitalLoc;
    }

    public String getCity() {
        return City;
    }

    public String getDescription() {
        return Description;
    }
    public String getCinfo(){
        return Cinfo;
    }
}
