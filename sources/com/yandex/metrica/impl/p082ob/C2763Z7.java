package com.yandex.metrica.impl.p082ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Z7 */
public class C2763Z7 implements C2736Y7 {

    /* renamed from: a */
    private final HashMap<String, List<String>> f7265a;

    public C2763Z7(String str, HashMap<String, List<String>> hashMap) {
        this.f7265a = hashMap;
    }

    /* renamed from: a */
    public boolean mo17104a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            boolean z = true;
            for (Map.Entry next : this.f7265a.entrySet()) {
                cursor = null;
                cursor = sQLiteDatabase.query((String) next.getKey(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (cursor == null) {
                    C1848A2.m6805a(cursor);
                    return false;
                }
                String str = (String) next.getKey();
                List asList = Arrays.asList(cursor.getColumnNames());
                Collections.sort(asList);
                z &= ((List) next.getValue()).equals(asList);
                C1848A2.m6805a(cursor);
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
