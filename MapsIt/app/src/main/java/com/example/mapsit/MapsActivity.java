package com.example.mapsit;

import androidx.fragment.app.FragmentActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapsit.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Kakamega and move the camera
        LatLng kakamega = new LatLng(0.2827, 34.7519);
        mMap.addMarker(new MarkerOptions().position(kakamega).title("Marker in Kakamega"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kakamega));

        //Add a marker in Nairobi and move the camera
        LatLng nairobi = new LatLng(-1.2921, 36.8219);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Marker in Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nairobi));

        // Add a marker in Dodoma and move the camera
        LatLng dar = new LatLng(-6.7924, 39.2083);
        mMap.addMarker(new MarkerOptions().position(dar).title("Marker in Dar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dar));

        //Add a marker in Arusha and move the camera
        LatLng arusha = new LatLng(-3.3869, 36.6830);
        mMap.addMarker(new MarkerOptions().position(arusha).title("Marker in Arusha"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arusha));

        float[] results = new float[1];
        Location.distanceBetween(arusha.latitude, arusha.longitude, dar.latitude,dar.longitude,results);
        float distance = results[0];

        Toast.makeText(this, String.valueOf(distance/1000) + "KM", Toast.LENGTH_SHORT).show();

    }
}