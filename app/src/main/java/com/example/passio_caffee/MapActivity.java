package com.example.passio_caffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map304;
    ImageView back304;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        back304 = findViewById(R.id.back);
        back304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

        SupportMapFragment mapFragment304 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment304.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map304 = googleMap;

        LatLng passio = new LatLng(16.0679826, 108.2211235);
        map304.addMarker(new MarkerOptions().position(passio).title("Passio Coffee"));
        map304.getUiSettings().setZoomControlsEnabled(true);
        map304.getUiSettings().setZoomGesturesEnabled(true);
        map304.animateCamera(CameraUpdateFactory.newLatLngZoom(passio,20));
    }
}
