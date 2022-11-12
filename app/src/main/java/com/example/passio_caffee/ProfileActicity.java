package com.example.passio_caffee;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActicity extends AppCompatActivity {

    ImageView back304;
    Button btn_logout304;
    RelativeLayout ttv_304;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back304 = findViewById(R.id.back);
        back304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });
        ttv_304 = findViewById(R.id.profile_ttv);
        ttv_304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), TheThanhvienActivity.class);
                startActivity(intent1);
            }
        });
        btn_logout304 = findViewById(R.id.profile_logout);
        btn_logout304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ProfileActicity.this);
                alertDialogBuilder.setTitle("Đăng xuất");
                alertDialogBuilder.setMessage("Bạn có muốn đăng xuất không?");
                // set dialog message
                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("ĐĂNG XUẤT",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        Intent intent2 = new Intent(ProfileActicity.this, MainActivity.class);
                                        startActivity(intent2);
                                    }
                                })
                        .setNegativeButton("HỦY",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        dialog.cancel();
                                    }
                                });
                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });
    }
}
