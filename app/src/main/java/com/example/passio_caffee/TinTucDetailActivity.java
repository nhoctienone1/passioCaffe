package com.example.passio_caffee;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import Database.TinTucHelper;

public class TinTucDetailActivity extends AppCompatActivity {

    ImageView back304;

    ImageView proImg304;
    TextView proTitle304, proCmt304;
    String title;
    TinTucHelper helper304;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tintuc_detail);

        back304 = findViewById(R.id.back);
        back304.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent1);
            }
        });

        Intent i = getIntent();
        title = i.getStringExtra("title");

        helper304 = new TinTucHelper(this);

        proImg304 = findViewById(R.id.pro_image);
        proTitle304 = findViewById(R.id.pro_title);
        proCmt304 = findViewById(R.id.pro_cmt);

        String selectQuery = "SELECT * FROM Danhsachtt WHERE title = '" + title + "'";
        SQLiteDatabase db = helper304.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if (cursor.moveToFirst()){
            do {
                int id = cursor.getInt(0);
                String image = "" + cursor.getString(1);
                String title = "" + cursor.getString(2);
                String cmt = "" + cursor.getString(3);

                proTitle304.setText(title);
                proCmt304.setText(cmt);
                int resId = getResources().getIdentifier(image, "drawable", getPackageName());
                proImg304.setImageResource(resId);
            }while (cursor.moveToNext());
        }
        db.close();
    }
}
