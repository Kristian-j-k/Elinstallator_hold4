
package com.elinstallator_hold4;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static DataBaseHelper mInstance = null;
    private Context mCxt;


    public static final String TABLE_NAME = "DbElinstallator20";
    public static final String COL_1 = "user_id";



    private DataBaseHelper(Context context) {
        super(context, TABLE_NAME, null, 1);
        this.mCxt = context;
    }

    public static DataBaseHelper getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new DataBaseHelper(context.getApplicationContext());
        }
        return mInstance;
    }



    @Override
    public  void onCreate(SQLiteDatabase db){
        String createTableStatement = "CREATE TABLE "+ TABLE_NAME +" (user_id INTEGER PRIMARY KEY)";
        db.execSQL(createTableStatement);
    }
    //if the version number change later on, then old users will be updated
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}