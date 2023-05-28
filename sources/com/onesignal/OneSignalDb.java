package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;

public interface OneSignalDb {
    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
