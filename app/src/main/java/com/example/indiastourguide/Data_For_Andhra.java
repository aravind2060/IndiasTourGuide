package com.example.indiastourguide;

public class Data_For_Andhra {
    private String SpotName;
    private String Address;
    private int ImageId;
    private String Texte;

    public Data_For_Andhra(String spotName, String address, int imageId, String text) {
        SpotName = spotName;
        Address = address;
        ImageId = imageId;
        Texte = text;
    }

    public String getTexte() {
        return Texte;
    }

    public void setTexte(String texte) {
        Texte = texte;
    }

    public String getSpotName() {
        return SpotName;
    }

    public void setSpotName(String spotName) {
        SpotName = spotName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
