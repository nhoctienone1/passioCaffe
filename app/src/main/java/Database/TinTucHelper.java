package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TinTucHelper extends SQLiteOpenHelper {
    public TinTucHelper(@Nullable Context context) {
        super(context, "Tintuc", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql = "CREATE TABLE Danhsachtt(id INTEGER PRIMARY KEY AUTOINCREMENT, image text, title text, comment text)";
        sqLiteDatabase.execSQL(sql);

        sql = "INSERT INTO Danhsachtt(image, title, comment) VALUES ('tintuc_1', 'GREEN XMAS -  GIÁNG SINH XANH, GIÁNG SINH AN LÀNH','GREEN XMAS -  GIÁNG SINH XANH, GIÁNG SINH AN LÀNH, mùa giáng sinh lại đến')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO Danhsachtt(image, title, comment) VALUES ('tintuc_2', 'THƯỞNG THỨC KEM GELATO NGON CHUẨN Ý VỚI GIÁ 29.000Đ','Đâu cần đi Ý để thưởng thức kem Gelato, vì ngay tại Passio đã có...')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO Danhsachtt(image, title, comment) VALUES ('tintuc_3', 'PASSIO BARISTA CHAMPIONSHIP 2022 ĐÃ CHÍNH THỨC KHỞI TRANH','Đấu trường Passio Barista ChamPionShip 2022 đã chính thức khởi động vào sáng 31/09/2022')";
        sqLiteDatabase.execSQL(sql);
        sql = "INSERT INTO Danhsachtt(image, title, comment) VALUES ('tintuc_4', 'CHÀO THÁNG 10 CÙNG CHƯƠNG TRÌNH MUA 1 TẶNG 1','Từ 18h - 23h mỗi ngày, khi mua 01 ly size L các món Latte đá, Passio Choco, Passio Chill,...')";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
