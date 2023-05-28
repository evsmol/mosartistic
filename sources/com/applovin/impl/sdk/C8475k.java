package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p254c.C8383e;

/* renamed from: com.applovin.impl.sdk.k */
public class C8475k {

    /* renamed from: a */
    private static final C8476a f21286a = new C8476a("Age Restricted User", C8382d.f21004l);

    /* renamed from: b */
    private static final C8476a f21287b = new C8476a("Has User Consent", C8382d.f21003k);

    /* renamed from: c */
    private static final C8476a f21288c = new C8476a("\"Do Not Sell\"", C8382d.f21005m);

    /* renamed from: com.applovin.impl.sdk.k$a */
    public static class C8476a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f21289a;

        /* renamed from: b */
        private final C8382d<Boolean> f21290b;

        C8476a(String str, C8382d<Boolean> dVar) {
            this.f21289a = str;
            this.f21290b = dVar;
        }

        /* renamed from: a */
        public Boolean mo57299a(Context context) {
            if (context != null) {
                return (Boolean) C8383e.m25219b(this.f21290b, null, context);
            }
            C8626v.m26258i("AppLovinSdk", "Failed to get value for key: " + this.f21290b);
            return null;
        }

        /* renamed from: a */
        public String mo57300a() {
            return this.f21289a;
        }

        /* renamed from: b */
        public String mo57301b(Context context) {
            Boolean a = mo57299a(context);
            return a != null ? a.toString() : "No value set";
        }
    }

    /* renamed from: a */
    public static C8476a m25551a() {
        return f21286a;
    }

    /* renamed from: a */
    public static String m25552a(Context context) {
        return m25553a(f21286a, context) + m25553a(f21287b, context) + m25553a(f21288c, context);
    }

    /* renamed from: a */
    private static String m25553a(C8476a aVar, Context context) {
        return "\n" + aVar.f21289a + " - " + aVar.mo57301b(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.applovin.impl.sdk.c.d, java.lang.Object, com.applovin.impl.sdk.c.d<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m25554a(com.applovin.impl.sdk.p254c.C8382d<java.lang.Boolean> r2, java.lang.Boolean r3, android.content.Context r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x001a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to update compliance value for key: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppLovinSdk"
            com.applovin.impl.sdk.C8626v.m26258i(r3, r2)
            return r0
        L_0x001a:
            r1 = 0
            java.lang.Object r1 = com.applovin.impl.sdk.p254c.C8383e.m25219b(r2, r1, (android.content.Context) r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.applovin.impl.sdk.p254c.C8383e.m25217a(r2, r3, (android.content.Context) r4)
            r2 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r3) goto L_0x002a
            r0 = 1
        L_0x002a:
            return r0
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8475k.m25554a(com.applovin.impl.sdk.c.d, java.lang.Boolean, android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m25555a(boolean z, Context context) {
        return m25554a(C8382d.f21004l, Boolean.valueOf(z), context);
    }

    /* renamed from: b */
    public static C8476a m25556b() {
        return f21287b;
    }

    /* renamed from: b */
    public static boolean m25557b(boolean z, Context context) {
        return m25554a(C8382d.f21003k, Boolean.valueOf(z), context);
    }

    /* renamed from: c */
    public static C8476a m25558c() {
        return f21288c;
    }

    /* renamed from: c */
    public static boolean m25559c(boolean z, Context context) {
        return m25554a(C8382d.f21005m, Boolean.valueOf(z), context);
    }
}
