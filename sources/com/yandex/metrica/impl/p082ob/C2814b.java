package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.yandex.metrica.C10723g;
import com.yandex.metrica.billing_interface.C1803e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.p151io.FilesKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.b */
public class C2814b {
    /* renamed from: a */
    public static boolean m9068a(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    /* renamed from: b */
    public static boolean m9071b(String str, String str2) {
        return !((str == null && str2 == null) ? true : (str == null || str2 == null) ? false : str.equals(str2));
    }

    /* renamed from: c */
    public static Integer m9073c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static C1803e m9074d(String str) {
        if ("inapp".equals(str)) {
            return C1803e.INAPP;
        }
        if ("subs".equals(str)) {
            return C1803e.SUBS;
        }
        return C1803e.UNKNOWN;
    }

    /* renamed from: e */
    public static byte[] m9075e(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: a */
    public static String m9061a(Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    /* renamed from: b */
    public static byte[] m9072b(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static SharedPreferences m9059a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    /* renamed from: a */
    public static boolean m9067a(File file, File file2) {
        try {
            FilesKt.copyTo(file, file2, false, 8192);
            file.delete();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m9069a(Collection<?> collection, Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            Collection<?> collection3 = collection2;
            hashSet = (HashSet) collection;
            collection = collection3;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        for (Object contains : collection) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m9066a(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            int type = cursor.getType(i);
            if (type == 0) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type == 1) {
                contentValues.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
            } else if (type == 2) {
                contentValues.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
            } else if (type == 3) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else if (type != 4) {
                contentValues.put(columnNames[i], cursor.getString(i));
            } else {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            }
        }
    }

    /* renamed from: a */
    public static long m9057a() {
        return C2974fm.m9584c().mo16498a();
    }

    /* renamed from: a */
    public static String m9062a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: a */
    public static List<Integer> m9064a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m9065a(SharedPreferences sharedPreferences, String str, int i) {
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            try {
                sharedPreferences.edit().remove(str).putLong(str, (long) sharedPreferences.getInt(str, i)).apply();
            } catch (ClassCastException unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: a */
    public static long m9058a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = 0;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, cursor);
            return cursor.moveToFirst() ? cursor.getLong(0) : 0;
        } finally {
            C1848A2.m6805a((Cursor) cursor);
        }
    }

    /* renamed from: a */
    public static int[] m9070a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        int i = 0;
        for (Integer intValue : list) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static C10723g m9060a(String str) {
        C10723g gVar = new C10723g();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                gVar.mo64746b(jSONObject.optString("UserInfo.UserId", (String) null));
                gVar.mo64743a(jSONObject.optString("UserInfo.Type", (String) null));
                gVar.mo64744a((Map<String, String>) C2572Tl.m8531b(jSONObject.optJSONObject("UserInfo.Options")));
            } catch (Throwable unused) {
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public static String m9063a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b & Ascii.f15551SI));
        }
        return sb.toString();
    }
}
