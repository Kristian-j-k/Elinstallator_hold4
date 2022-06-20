
package com.elinstallator_hold4;

        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static DataBaseHelper mInstance = null;
    private Context mCxt;


    public static final String DB_NAME = "DbElinstallator20.db";

    //database tables create statements
    public static final String CREATE_TABLE_USER = "CREATE TABLE \"USER\" (\n" +
            "\t\"user_id\"\tINTEGER,\n" +
            "\t\"email\"\tTEXT NOT NULL,\n" +
            "\t\"pasword\"\tTEXT NOT NULL,\n" +
            "\tPRIMARY KEY(\"user_id\" AUTOINCREMENT)\n" +
            ")";
    public static final String CREATE_TABLE_VC = "CREATE TABLE \"VC\" (\n" +
            "\t\"vc_id\"\tINTEGER,\n" +
            "\t\"installation\"\tINTEGER,\n" +
            "\t\"adress\"\tTEXT,\n" +
            "\tPRIMARY KEY(\"vc_id\" AUTOINCREMENT)\n" +
            ")";
    public static final String CREATE_TABLE_QUESTION = "CREATE TABLE \"QUESTIONS\" (\n" +
            "\t\"questions_id\"\tINTEGER,\n" +
            "\t\"question\"\tTEXT,\n" +
            "\tPRIMARY KEY(\"questions_id\")\n" +
            ")";
    public static final String CREATE_TABLE_ANSWER = "CREATE TABLE \"ANSWER\" (\n" +
            "\t\"answer_id\"\tINTEGER,\n" +
            "\t\"answer\"\tTEXT,\n" +
            "\tPRIMARY KEY(\"answer_id\")\n" +
            ")";
    public static final String CREATE_TABLE_IMG = "CREATE TABLE \"IMG\" (\n" +
            "\t\"img_id\"\tINTEGER,\n" +
            "\t\"fk_vc\"\tINTEGER,\n" +
            "\t\"fk_questions\"\tINTEGER,\n" +
            "\tFOREIGN KEY(\"fk_vc\") REFERENCES \"VC\"(\"vc_id\"),\n" +
            "\tFOREIGN KEY(\"fk_questions\") REFERENCES \"QUESTIONS\"(\"questions_id\"),\n" +
            "\tPRIMARY KEY(\"img_id\")\n" +
            ")";
    public static final String CREATE_TABLE_JOIN_USER_VC = "CREATE TABLE \"JOIN_USER_VC\" (\n" +
            "\t\"fk_user\"\tINTEGER,\n" +
            "\t\"fk_vc\"\tINTEGER,\n" +
            "\tFOREIGN KEY(\"fk_vc\") REFERENCES \"VC\"(\"vc_id\"),\n" +
            "\tFOREIGN KEY(\"fk_user\") REFERENCES \"USER\"(\"user_id\")\n" +
            ")";
    public static final String CREATE_TABLE_JOIN_VC_QUEST_ANSW = "CREATE TABLE \"JOIN_VC_QUESTION_ANSWER\" (\n" +
            "\t\"fk_vc\"\tINTEGER,\n" +
            "\t\"fk_questions\"\tINTEGER,\n" +
            "\t\"fk_answer\"\tINTEGER,\n" +
            "\tFOREIGN KEY(\"fk_vc\") REFERENCES \"VC\"(\"vc_id\"),\n" +
            "\tFOREIGN KEY(\"fk_answer\") REFERENCES \"ANSWER\"(\"answer_id\"),\n" +
            "\tFOREIGN KEY(\"fk_questions\") REFERENCES \"QUESTIONS\"(\"questions_id\")\n" +
            ")";




    private DataBaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
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
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_TABLE_VC);
        db.execSQL(CREATE_TABLE_QUESTION);
        db.execSQL(CREATE_TABLE_ANSWER);
        db.execSQL(CREATE_TABLE_IMG);
        db.execSQL(CREATE_TABLE_JOIN_USER_VC);
        db.execSQL(CREATE_TABLE_JOIN_VC_QUEST_ANSW);

    }
    //if the version number change later on, then old users will be updated
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+ DB_NAME);
        onCreate(db);
    }
/*
    public String databaseToString() {
        String dbString ="";
        SQLiteDatabase db = getWritableDatabase();

        String query = "SELECT * FROM USER WHERE 1";
        Cursor c = db.rawQuery(query,null);
        c.moveToFirst();

        while (!c.isAfterLast()){
            if(c.getString(c.getColumnIndex( "user_id"))!=null){
                dbString += c.getString(c.getColumnIndex("user_id"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }*/
}