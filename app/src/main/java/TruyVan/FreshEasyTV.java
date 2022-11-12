package TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import Adapter.ChonMon;
import Database.ChonMonHelper;

public class FreshEasyTV {
    ChonMonHelper helper304;
    public FreshEasyTV(Context context){
        helper304 = new ChonMonHelper(context);
    }
    public ArrayList<ChonMon> getAll(){
        ArrayList<ChonMon> ds304 = new ArrayList<>();
        SQLiteDatabase db304 =helper304.getReadableDatabase();
        Cursor cs304 = db304.rawQuery("SELECT * FROM Fresh", null);
        cs304.moveToFirst();
        while (!cs304.isAfterLast()) {
            int id = cs304.getInt(0);
            String image = cs304.getString(1);
            String title = cs304.getString(2);
            String price = cs304.getString(3);
            ChonMon a304 = new ChonMon(id, image, title, price);
            ds304.add(a304);
            cs304.moveToNext();
        }
        cs304.close();
        return ds304;
    }
}
