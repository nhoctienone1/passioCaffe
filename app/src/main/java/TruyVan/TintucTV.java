package TruyVan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import Adapter.Tintuc;
import Database.TinTucHelper;

public class TintucTV {
    TinTucHelper helper304;
    public TintucTV(Context context){
        helper304 = new TinTucHelper(context);
    }
    public ArrayList<Tintuc> getAll(){
        ArrayList<Tintuc> ds304 = new ArrayList<>();
        SQLiteDatabase db304 =helper304.getReadableDatabase();
        Cursor cs304 = db304.rawQuery("SELECT * FROM Danhsachtt", null);
        cs304.moveToFirst();
        while (!cs304.isAfterLast()) {
            int id = cs304.getInt(0);
            String image = cs304.getString(1);
            String title = cs304.getString(2);
            String cmt = cs304.getString(3);
            Tintuc a304 = new Tintuc(id, image, title, cmt);
            ds304.add(a304);
            cs304.moveToNext();
        }
        cs304.close();
        return ds304;
    }
}
