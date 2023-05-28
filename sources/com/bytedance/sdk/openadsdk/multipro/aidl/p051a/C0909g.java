package com.bytedance.sdk.openadsdk.multipro.aidl.p051a;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.multipro.C0951f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.g */
/* compiled from: ProviderListenerManagerImpl */
public class C0909g extends C0903a {

    /* renamed from: a */
    private static volatile C0909g f3207a;

    /* renamed from: a */
    public static C0909g m4316a() {
        if (f3207a == null) {
            synchronized (C0909g.class) {
                if (f3207a == null) {
                    f3207a = new C0909g();
                }
            }
        }
        return f3207a;
    }

    public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!C0515e.m2397a()) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Cursor a = C0951f.m4440a(C0558m.m2663a()).mo2758a(uri, strArr, str, strArr2, str2);
            if (a != null) {
                String[] columnNames = a.getColumnNames();
                while (a.getCount() > 0 && a.moveToNext()) {
                    for (String str3 : columnNames) {
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new LinkedList());
                        }
                        ((List) hashMap.get(str3)).add(a.getString(a.getColumnIndex(str3)));
                    }
                }
                a.close();
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getType(Uri uri) {
        if (!C0515e.m2397a()) {
            return null;
        }
        return C0951f.m4440a(C0558m.m2663a()).mo2761a(uri);
    }

    public String insert(Uri uri, ContentValues contentValues) {
        Uri a;
        if (C0515e.m2397a() && (a = C0951f.m4440a(C0558m.m2663a()).mo2759a(uri, contentValues)) != null) {
            return a.toString();
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (!C0515e.m2397a()) {
            return 0;
        }
        return C0951f.m4440a(C0558m.m2663a()).mo2757a(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!C0515e.m2397a()) {
            return 0;
        }
        return C0951f.m4440a(C0558m.m2663a()).mo2756a(uri, contentValues, str, strArr);
    }
}
