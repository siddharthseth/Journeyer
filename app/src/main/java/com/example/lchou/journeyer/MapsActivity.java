package com.example.lchou.journeyer;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    boolean foodBoolean = false;
    boolean shelterBoolean = false;
    boolean waterBoolean = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    public void buttonFood(View v) {
        foodBoolean = !foodBoolean;
        v.setActivated(foodBoolean);
    }

    public void buttonWater(View v) {
        waterBoolean = !waterBoolean;
        v.setActivated(waterBoolean);
    }

    public void buttonShelter(View v) {
        shelterBoolean = !shelterBoolean;
        v.setActivated(shelterBoolean);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Ankara (represents the host) and move the camera
        LatLng ankara = new LatLng(40, 33);
        MarkerOptions cur = new MarkerOptions().position(ankara).title("You");
        mMap.addMarker(cur);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ankara, 12));


        // Add a refugee marker
        LatLng r1 = new LatLng(40, 33.02);
        mMap.addMarker(new MarkerOptions().position(r1).title("Refugee 1")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        // Add a refugee marker
        LatLng r2 = new LatLng(40.02, 33.01);
        mMap.addMarker(new MarkerOptions().position(r2).title("Refugee 2")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        // Add a refugee marker
        LatLng r3 = new LatLng(40.005, 32.98);
        mMap.addMarker(new MarkerOptions().position(r3).title("Refugee 3")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        // Add a refugee marker
        LatLng r4 = new LatLng(39.98, 33);
        mMap.addMarker(new MarkerOptions().position(r4).title("Refugee 4")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        // Add a refugee marker
        LatLng r5 = new LatLng(40.01, 33.02);
        mMap.addMarker(new MarkerOptions().position(r5).title("Refugee 5")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        // Add a refugee marker
        LatLng r6 = new LatLng(40.01, 33.01);
        mMap.addMarker(new MarkerOptions().position(r6).title("Refugee 6")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
    }
}