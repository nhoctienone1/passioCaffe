package com.example.passio_caffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Adapter.Tintuc;
import Adapter.TintucAdapter;
import TruyVan.TintucTV;

public class HomeActivity extends AppCompatActivity {

    ImageView im, coupon304, thongbao304, chonmon304, map304;
    RelativeLayout profile304;

    GridView gv304;
    ArrayList<Tintuc> arrayList304;
    TintucAdapter adapter304;
    TintucTV tintucTV304;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tintucTV304 = new TintucTV(HomeActivity.this);
        arrayList304 = tintucTV304.getAll();
        gv304 = findViewById(R.id.home_list);
        adapter304 = new TintucAdapter(HomeActivity.this, arrayList304);
        gv304.setAdapter(adapter304);

        im =findViewById(R.id.home_card_passio);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(getApplication(), TheThanhvienActivity.class);
                startActivity(Intent);
            }
        });

        coupon304 = findViewById(R.id.home_coupon);
        coupon304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), CouPonActivity.class);
                startActivity(intent1);
            }
        });

        thongbao304 = findViewById(R.id.home_thongbao);
        thongbao304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplication(), ThongBaoActivity.class);
                startActivity(intent2);
            }
        });

        chonmon304 = findViewById(R.id.home_chonmon);
        chonmon304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplication(), ChonMonActivity.class);
                startActivity(intent3);
            }
        });

        map304 = findViewById(R.id.home_map);
        map304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(getApplication(), MapActivity.class);
                startActivity(intent4);
            }
        });

        profile304 = findViewById(R.id.home_profile);
        profile304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplication(),ProfileActicity.class);
                startActivity(intent5);
            }
        });
    }
}
