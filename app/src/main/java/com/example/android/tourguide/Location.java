package com.example.android.tourguide;

public class Location {

    private int mnameId;
    private int maddressId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(int nameId, int addressId, int imageResourceId) {
        mnameId = nameId;
        maddressId = addressId;
        mImageResourceId = imageResourceId;
    }

    public int getMnameId() { return mnameId; }

    public int getMaddressId() { return maddressId; }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}