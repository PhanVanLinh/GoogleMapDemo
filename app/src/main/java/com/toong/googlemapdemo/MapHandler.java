package com.toong.googlemapdemo;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by PhanVanLinh on 12/07/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class MapHandler {
    private GoogleMap mGoogleMap;

    public MapHandler(GoogleMap googleMap) {
        mGoogleMap = googleMap;
    }

    public void move(LatLng latLng){
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }

    public void addMarker(LatLng latLng, String title, String snippet, int drawableIcon){
        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(drawableIcon);
        MarkerOptions markerOptions = new MarkerOptions().position(latLng)
                .title(title)
                .snippet(snippet)
                .icon(icon);
        mGoogleMap.addMarker(markerOptions);
    }
}
