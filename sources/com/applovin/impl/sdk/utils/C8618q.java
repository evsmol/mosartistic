package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p254c.C8383e;

/* renamed from: com.applovin.impl.sdk.utils.q */
public final class C8618q {

    /* renamed from: a */
    private final C8490n f21765a;

    /* renamed from: b */
    private String f21766b;

    /* renamed from: c */
    private final String f21767c;

    /* renamed from: d */
    private final String f21768d;

    public C8618q(C8490n nVar) {
        this.f21765a = nVar;
        this.f21767c = m26215a(C8382d.f20999g, (String) C8383e.m25219b(C8382d.f20998f, null, nVar.mo57332P()));
        this.f21768d = m26215a(C8382d.f21000h, (String) nVar.mo57342a(C8380b.f20725aa));
        mo57785a(m26217d());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.c.d, com.applovin.impl.sdk.c.d<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m26215a(com.applovin.impl.sdk.p254c.C8382d<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            com.applovin.impl.sdk.n r0 = r2.f21765a
            android.content.Context r0 = r0.mo57332P()
            r1 = 0
            java.lang.Object r0 = com.applovin.impl.sdk.p254c.C8383e.m25219b(r3, r1, (android.content.Context) r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0029:
            com.applovin.impl.sdk.n r0 = r2.f21765a
            android.content.Context r0 = r0.mo57332P()
            com.applovin.impl.sdk.p254c.C8383e.m25217a(r3, r4, (android.content.Context) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C8618q.m26215a(com.applovin.impl.sdk.c.d, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m26216a(C8490n nVar) {
        String str = (String) nVar.mo57343a(C8382d.f21001i);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
        nVar.mo57349a(C8382d.f21001i, valueOf);
        return valueOf;
    }

    /* renamed from: d */
    private String m26217d() {
        if (!((Boolean) this.f21765a.mo57342a(C8380b.f20863dH)).booleanValue()) {
            this.f21765a.mo57382b(C8382d.f20997e);
        }
        String str = (String) this.f21765a.mo57343a(C8382d.f20997e);
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        this.f21765a.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.f21765a.mo57320D();
            D.mo57818b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        }
        return str;
    }

    /* renamed from: a */
    public String mo57784a() {
        return this.f21766b;
    }

    /* renamed from: a */
    public void mo57785a(String str) {
        if (((Boolean) this.f21765a.mo57342a(C8380b.f20863dH)).booleanValue()) {
            this.f21765a.mo57349a(C8382d.f20997e, str);
        }
        this.f21766b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", mo57787c());
        this.f21765a.mo57369aj().mo57287a(bundle, "user_info");
    }

    /* renamed from: b */
    public String mo57786b() {
        return this.f21767c;
    }

    /* renamed from: c */
    public String mo57787c() {
        return this.f21768d;
    }
}
