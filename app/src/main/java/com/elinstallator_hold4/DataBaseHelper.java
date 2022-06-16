
package com.elinstallator_hold4;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {


    public DataBaseHelper(@Nullable Context context) {
        super(context, "DbElinstallator.db", null, 1);
    }

    @Override
    public  void onCreate(SQLiteDatabase db){
        String createTableStatement = "CREATE TABLE USER (user_id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT NOT NULL, pasword TEXT NOT NULL)";
        db.execSQL(createTableStatement);
    }
    //if the version number change later on, then old users will be updated
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}