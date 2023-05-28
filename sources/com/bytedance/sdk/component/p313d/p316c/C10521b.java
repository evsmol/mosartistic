package com.bytedance.sdk.component.p313d.p316c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p313d.C10498c;
import com.bytedance.sdk.component.p313d.C10560i;
import com.bytedance.sdk.component.p313d.C10563l;
import com.bytedance.sdk.component.p313d.C10564m;
import com.bytedance.sdk.component.p313d.C10568q;
import com.bytedance.sdk.component.p313d.p316c.C10523c;
import com.bytedance.sdk.component.p313d.p316c.p321c.C10532c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

/* renamed from: com.bytedance.sdk.component.d.c.b */
/* compiled from: ImageLoader */
public class C10521b implements C10564m {

    /* renamed from: a */
    private volatile C10537f f26234a;

    private C10521b() {
    }

    /* renamed from: a */
    public static C10564m m30772a(Context context, C10563l lVar) {
        C10521b bVar = new C10521b();
        bVar.m30773b(context, lVar);
        return bVar;
    }

    /* renamed from: b */
    private void m30773b(Context context, C10563l lVar) {
        if (this.f26234a != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (lVar == null) {
            lVar = C10534e.m30864a(context);
        }
        this.f26234a = new C10537f(context, lVar);
    }

    /* renamed from: a */
    public C10560i mo64068a(String str) {
        return new C10523c.C10529b(this.f26234a).mo64112c(str);
    }

    /* renamed from: a */
    public InputStream mo64069a(String str, String str2) {
        if (this.f26234a != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = C10532c.m30853a(str);
            }
            Collection<C10568q> a = this.f26234a.mo64136a();
            if (a != null) {
                for (C10568q a2 : a) {
                    byte[] bArr = (byte[]) a2.mo63991a(str2);
                    if (bArr != null) {
                        return new ByteArrayInputStream(bArr);
                    }
                }
            }
            Collection<C10498c> b = this.f26234a.mo64138b();
            if (b != null) {
                for (C10498c a3 : b) {
                    InputStream a4 = a3.mo64016a(str2);
                    if (a4 != null) {
                        return a4;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo64070a(String str, String str2, String str3) {
        if (this.f26234a == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = C10532c.m30853a(str);
        }
        C10498c a = this.f26234a.mo64134a(str3);
        if (a != null) {
            return a.mo63993b(str2);
        }
        return false;
    }
}
