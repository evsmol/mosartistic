package com.bytedance.sdk.openadsdk.multipro.p054c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p020d.C0441a;
import com.bytedance.sdk.openadsdk.multipro.C0894a;
import com.bytedance.sdk.openadsdk.multipro.C0950e;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0895a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c.b */
/* compiled from: FrequentCallProviderImpl */
public class C0945b implements C0894a {
    /* renamed from: a */
    public int mo2756a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo2757a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public Cursor mo2758a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: a */
    public Uri mo2759a(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    public String mo2760a() {
        return "t_frequent";
    }

    /* renamed from: b */
    public void mo2762b() {
    }

    /* renamed from: e */
    private static IListenerManager m4379e() {
        try {
            if (C0558m.m2663a() != null) {
                return C0895a.m4283a(C0558m.m2663a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m4376a(String str) {
        if (C0558m.m2663a() == null) {
            return false;
        }
        try {
            IListenerManager e = m4379e();
            if (e != null) {
                return "true".equals(e.getType(Uri.parse(m4380f() + "checkFrequency" + "?rit=" + String.valueOf(str))));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m4377c() {
        if (C0558m.m2663a() == null) {
            return false;
        }
        try {
            IListenerManager e = m4379e();
            if (e != null) {
                return "true".equals(e.getType(Uri.parse(m4380f() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static String m4378d() {
        if (C0558m.m2663a() == null) {
            return null;
        }
        try {
            IListenerManager e = m4379e();
            if (e != null) {
                return e.getType(Uri.parse(m4380f() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: f */
    private static String m4380f() {
        return C0950e.f3265b + "/" + "t_frequent" + "/";
    }

    /* renamed from: a */
    public String mo2761a(Uri uri) {
        C10638l.m31235b("FrequentCallProviderImpl", "get type uri: " + String.valueOf(uri));
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return C0441a.m1805a().mo1189a(uri.getQueryParameter("rit")) ? "true" : "false";
        } else if ("isSilent".equals(str)) {
            return C0441a.m1805a().mo1190b() ? "true" : "false";
        } else {
            if ("maxRit".equals(str)) {
                return C0441a.m1805a().mo1191c();
            }
            return null;
        }
    }
}
