package com.example.lchou.journeyer;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class BackUpActivity extends FragmentActivity implements OnMapReadyCallback {

        private GoogleMap mMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_back_up);
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
        @Override
        public void onMapReady(GoogleMap googleMap) {
                mMap = googleMap;

                // Add a departure marker in Syria and move the camera
                LatLng departure = new LatLng(34.79, 38.92);
                mMap.addMarker(new MarkerOptions().position(departure).title("Departure")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));


                // Add a destination marker in Germany
                LatLng destination = new LatLng(50.09, 8.69);
                mMap.addMarker(new MarkerOptions().position(destination).title("Destination")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));






                // Add host markers camp markers in Turkey
                LatLng th1 = new LatLng(36.78, 36.91);
                mMap.addMarker(new MarkerOptions().position(th1).title("Turkey Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng th2 = new LatLng(36.83, 36.83);
                mMap.addMarker(new MarkerOptions().position(th2).title("Turkey Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng t1 = new LatLng(36.11, 36.25);
                mMap.addMarker(new MarkerOptions().position(t1).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t2 = new LatLng(35.90, 36.07);
                mMap.addMarker(new MarkerOptions().position(t2).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t3 = new LatLng(36.08, 36.25);
                mMap.addMarker(new MarkerOptions().position(t3).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t4 = new LatLng(36.11, 36.35);
                mMap.addMarker(new MarkerOptions().position(t4).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t5 = new LatLng(36.17, 36.34);
                mMap.addMarker(new MarkerOptions().position(t5).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t6 = new LatLng(36.27, 36.57);
                mMap.addMarker(new MarkerOptions().position(t6).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t7 = new LatLng(36.71, 38.95);
                mMap.addMarker(new MarkerOptions().position(t7).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t8 = new LatLng(36.87, 40.06);
                mMap.addMarker(new MarkerOptions().position(t8).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t9 = new LatLng(36.70, 37.11);
                mMap.addMarker(new MarkerOptions().position(t9).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t10 = new LatLng(37.03, 36.64);
                mMap.addMarker(new MarkerOptions().position(t10).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t11 = new LatLng(36.83, 38.00);
                mMap.addMarker(new MarkerOptions().position(t11).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t12 = new LatLng(37.01, 37.80);
                mMap.addMarker(new MarkerOptions().position(t12).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t13 = new LatLng(37.07, 36.25);
                mMap.addMarker(new MarkerOptions().position(t13).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t14 = new LatLng(37.58, 36.93);
                mMap.addMarker(new MarkerOptions().position(t14).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng t15 = new LatLng(37.77, 38.28);
                mMap.addMarker(new MarkerOptions().position(t15).title("Turkey Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                //Add host markers and camp markers in Czech Republic
                LatLng ch1 = new LatLng(50.10, 14.38);
                mMap.addMarker(new MarkerOptions().position(ch1).title("Czech Republic Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng ch2 = new LatLng(49.50, 14.40);
                mMap.addMarker(new MarkerOptions().position(ch2).title("Czech Republic Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng c1 = new LatLng(50.09, 14.42);
                mMap.addMarker(new MarkerOptions().position(c1).title("Czech Republic Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng c2 = new LatLng(50.11, 14.27);
                mMap.addMarker(new MarkerOptions().position(c2).title("Czech Republic Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng c3 = new LatLng(49.19, 16.36);
                mMap.addMarker(new MarkerOptions().position(c3).title("Czech Republic Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                // Add host markers and camp markers in Greece
                LatLng gh1 = new LatLng(41.14, 22.4);
                mMap.addMarker(new MarkerOptions().position(gh1).title("Greece Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gh1, 3));

                LatLng gh2 = new LatLng(42.21, 21.6);
                mMap.addMarker(new MarkerOptions().position(gh2).title("Greece Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng g1 = new LatLng(41.14, 22.5);
                mMap.addMarker(new MarkerOptions().position(g1).title("Greece Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng g2 = new LatLng(42.21, 21.70);
                mMap.addMarker(new MarkerOptions().position(g2).title("Greece Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng g3 = new LatLng(39.07, 26.59);
                mMap.addMarker(new MarkerOptions().position(g3).title("Greece Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng g4 = new LatLng(39.37, 26.17);
                mMap.addMarker(new MarkerOptions().position(g4).title("Greece Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng g5 = new LatLng(39.26, 26.28);
                mMap.addMarker(new MarkerOptions().position(g5).title("Greece Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                // Add host markers and camp markers in Bulgaria
                LatLng bh1 = new LatLng(42.68, 23.4);
                mMap.addMarker(new MarkerOptions().position(bh1).title("Bulgaria Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng bh2 = new LatLng(42.68, 23.5);
                mMap.addMarker(new MarkerOptions().position(bh2).title("Bulgaria Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng b1 = new LatLng(42.68, 23.25);
                mMap.addMarker(new MarkerOptions().position(b1).title("Bulgaria Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng b2 = new LatLng(42.68, 23.43);
                mMap.addMarker(new MarkerOptions().position(b2).title("Bulgaria Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng b3 = new LatLng(42.17, 26.57);
                mMap.addMarker(new MarkerOptions().position(b3).title("Bulgaria Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng b4 = new LatLng(42.73, 23.33);
                mMap.addMarker(new MarkerOptions().position(b4).title("Bulgaria Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                // Add host markers and camp markers in Serbia
                LatLng sh1 = new LatLng(43.33, 21.92);
                mMap.addMarker(new MarkerOptions().position(sh1).title("Serbia Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng sh2 = new LatLng(46.06, 20.1);
                mMap.addMarker(new MarkerOptions().position(sh2).title("Serbia Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng s1 = new LatLng(43.33, 21.89);
                mMap.addMarker(new MarkerOptions().position(s1).title("Serbia Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng s2 = new LatLng(46.06, 20.05);
                mMap.addMarker(new MarkerOptions().position(s2).title("Serbia Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng s3 = new LatLng(44.80, 20.47);
                mMap.addMarker(new MarkerOptions().position(s3).title("Serbia Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                // Add host markers and camp markers in Hungary
                LatLng hh1 = new LatLng(47.51, 19.01);
                mMap.addMarker(new MarkerOptions().position(hh1).title("Hungary Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng hh2 = new LatLng(47.53, 21.63);
                mMap.addMarker(new MarkerOptions().position(hh2).title("Hungary Host")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

                LatLng h1 = new LatLng(47.51, 19.01);
                mMap.addMarker(new MarkerOptions().position(h1).title("Hungary Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

                LatLng h2 = new LatLng(47.53, 21.63);
                mMap.addMarker(new MarkerOptions().position(h2).title("Hungary Camp")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        }
}