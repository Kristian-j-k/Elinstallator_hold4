package com.elinstallator_hold4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "users.db";
    public static final String TABLE_NAME = "registation";

    private static final String COL_1 = "ID";
    private static final String COL_2 = "username";
    private static final String COL_3 = "email";
    private static final String COL_4 = "password";

    public DatabaseHelper (Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE registration (ID INTERGER PRIMARY KEY AUTOINCREMENT, username TEXT, email TEXT, password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);

    }

    public boolean checkUser( String username, String email, String password){
        String[] columns = {COL_1};
        SQLiteDatabase db = getReadableDatabase();
        String selection = COL_2 + "=?" + "and" + COL_3 + "=?" + "and" + COL_4 + "=?";
        String[] selectionArg = {username, email, password};
        Cursor cursor = db.query(TABLE_NAME, columns, selection,selectionArg, null,null, null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        return count > 0;
    }

    public long addUser(String username,String email, String password) {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("email",email);
        contentValues.put("password", password);
        long res=db.insert("registration", null, contentValues);
        db.close();
        return res;
    }
}