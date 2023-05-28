package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ae */
public class C2803ae implements C2818b2<C2923ee> {

    /* renamed from: a */
    private final Context f7392a;

    public C2803ae(Context context) {
        this.f7392a = context;
    }

    /* renamed from: a */
    public C2923ee invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        try {
            cursor = this.f7392a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), (String[]) null, (String) null, (String[]) null, (String) null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject = new JSONObject(string2);
                                C3015h2.m9658a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                                C2923ee eeVar = new C2923ee(string, jSONObject, !TextUtils.isEmpty(string), false, C3522u0.SATELLITE);
                                C1848A2.m6805a(cursor);
                                return eeVar;
                            }
                        } catch (Throwable unused) {
                        }
                        jSONObject = jSONObject2;
                        C3015h2.m9658a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C2923ee eeVar2 = new C2923ee(string, jSONObject, !TextUtils.isEmpty(string), false, C3522u0.SATELLITE);
                        C1848A2.m6805a(cursor);
                        return eeVar2;
                    }
                    C3015h2.m9658a("No Preload Info data in Satellite content provider", new Object[0]);
                    C1848A2.m6805a(cursor);
                    return null;
                } catch (Throwable unused2) {
                }
            } else {
                C3015h2.m9658a("No Satellite content provider found", new Object[0]);
                C1848A2.m6805a(cursor);
                return null;
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
    }
}
