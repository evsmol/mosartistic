package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.multipro.p050a.C0896b;
import com.bytedance.sdk.openadsdk.multipro.p054c.C0938a;
import com.bytedance.sdk.openadsdk.multipro.p054c.C0945b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0949c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.f */
/* compiled from: TTProviderManager */
public class C0951f implements C0894a {

    /* renamed from: a */
    private static volatile C0951f f3266a;

    /* renamed from: b */
    private static WeakReference<Context> f3267b;

    /* renamed from: c */
    private static List<C0894a> f3268c;

    /* renamed from: c */
    private boolean m4442c(Uri uri) {
        return true;
    }

    /* renamed from: a */
    public String mo2760a() {
        return "";
    }

    /* renamed from: b */
    public void mo2762b() {
    }

    static {
        List<C0894a> synchronizedList = Collections.synchronizedList(new ArrayList());
        f3268c = synchronizedList;
        synchronizedList.add(new C0949c());
        f3268c.add(new C0896b());
        f3268c.add(new C0945b());
        f3268c.add(new C0938a());
        for (C0894a b : f3268c) {
            b.mo2762b();
        }
    }

    /* renamed from: a */
    public static C0951f m4440a(Context context) {
        if (context != null) {
            f3267b = new WeakReference<>(context.getApplicationContext());
        }
        if (f3266a == null) {
            synchronized (C0951f.class) {
                if (f3266a == null) {
                    f3266a = new C0951f();
                }
            }
        }
        return f3266a;
    }

    private C0951f() {
    }

    /* renamed from: b */
    private C0894a m4441b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!m4442c(uri)) {
            C10638l.m31235b("TTProviderManager", "uri is error1");
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            C10638l.m31235b("TTProviderManager", "uri is error2");
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            C10638l.m31235b("TTProviderManager", "uri is error3");
            return null;
        }
        for (C0894a next : f3268c) {
            if (str.equals(next.mo2760a())) {
                return next;
            }
        }
        C10638l.m31235b("TTProviderManager", "uri is error4");
        return null;
    }

    /* renamed from: a */
    public Cursor mo2758a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            C0894a b = m4441b(uri);
            if (b != null) {
                return b.mo2758a(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th) {
            C10638l.m31230a("TTProviderManager", "==provider query error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public String mo2761a(Uri uri) {
        try {
            C0894a b = m4441b(uri);
            if (b != null) {
                return b.mo2761a(uri);
            }
            return null;
        } catch (Throwable th) {
            C10638l.m31230a("TTProviderManager", "==provider getType error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public Uri mo2759a(Uri uri, ContentValues contentValues) {
        try {
            C0894a b = m4441b(uri);
            if (b != null) {
                return b.mo2759a(uri, contentValues);
            }
            return null;
        } catch (Throwable th) {
            C10638l.m31230a("TTProviderManager", "==provider insert error==", th);
            return null;
        }
    }

    /* renamed from: a */
    public int mo2757a(Uri uri, String str, String[] strArr) {
        try {
            C0894a b = m4441b(uri);
            if (b != null) {
                return b.mo2757a(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            C10638l.m31230a("TTProviderManager", "==provider delete error==", th);
            return 0;
        }
    }

    /* renamed from: a */
    public int mo2756a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            C0894a b = m4441b(uri);
            if (b != null) {
                return b.mo2756a(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th) {
            C10638l.m31230a("TTProviderManager", "==provider update error==", th);
            return 0;
        }
    }
}
