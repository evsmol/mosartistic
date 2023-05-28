package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C3566v3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.a2 */
public class C2789a2 implements C2818b2<C3566v3.C3567a> {

    /* renamed from: a */
    private final Context f7363a;

    public C2789a2(Context context) {
        this.f7363a = context;
    }

    public Object invoke() {
        Cursor cursor;
        try {
            cursor = this.f7363a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    HashMap hashMap = new HashMap();
                    while (cursor.moveToNext()) {
                        try {
                            String string = cursor.getString(cursor.getColumnIndexOrThrow("clid_key"));
                            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("clid_value"));
                            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                                C3015h2.m9658a("Invalid clid {%s : %s}", string, string2);
                            } else {
                                hashMap.put(string, string2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    C3015h2.m9658a("Clids from satellite: %s", hashMap);
                    C3566v3.C3567a aVar = new C3566v3.C3567a(hashMap, C3522u0.SATELLITE);
                    C1848A2.m6805a(cursor);
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    try {
                        C3015h2.m9659a(th, "Error while getting satellite clids", new Object[0]);
                        return null;
                    } finally {
                        C1848A2.m6805a(cursor);
                    }
                }
            } else {
                C3015h2.m9658a("No Satellite content provider found", new Object[0]);
                C1848A2.m6805a(cursor);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            C3015h2.m9659a(th, "Error while getting satellite clids", new Object[0]);
            return null;
        }
    }
}
