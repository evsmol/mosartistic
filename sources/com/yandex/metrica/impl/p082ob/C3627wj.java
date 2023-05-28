package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.wj */
public class C3627wj implements C2748Yj<C3555uj> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final SparseArray<String> f9404d = new C3628a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2159Ij f9405a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3731zd f9406b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3731zd f9407c;

    /* renamed from: com.yandex.metrica.impl.ob.wj$a */
    class C3628a extends SparseArray<String> {
        C3628a() {
            put(0, (Object) null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            put(14, "eHRPD");
            put(13, "LTE");
            put(15, "HSPA+");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$b */
    class C3629b implements C3731zd {

        /* renamed from: a */
        final /* synthetic */ C3697yd f9408a;

        C3629b(C3627wj wjVar, C3697yd ydVar) {
            this.f9408a = ydVar;
        }

        /* renamed from: a */
        public boolean mo15812a(Context context) {
            this.f9408a.getClass();
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$c */
    class C3630c implements C3731zd {

        /* renamed from: a */
        final /* synthetic */ C3697yd f9409a;

        C3630c(C3627wj wjVar, C3697yd ydVar) {
            this.f9409a = ydVar;
        }

        /* renamed from: a */
        public boolean mo15812a(Context context) {
            return this.f9409a.mo18425b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$d */
    class C3631d implements C3731zd {

        /* renamed from: a */
        final /* synthetic */ C3697yd f9410a;

        C3631d(C3627wj wjVar, C3697yd ydVar) {
            this.f9410a = ydVar;
        }

        /* renamed from: a */
        public boolean mo15812a(Context context) {
            return this.f9410a.mo18424a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wj$e */
    class C3632e implements C3731zd {
        C3632e(C3627wj wjVar) {
        }

        /* renamed from: a */
        public boolean mo15812a(Context context) {
            return true;
        }
    }

    public C3627wj(C2159Ij ij, C3697yd ydVar) {
        this.f9405a = ij;
        if (C1848A2.m6808a(29)) {
            this.f9406b = new C3629b(this, ydVar);
            this.f9407c = new C3630c(this, ydVar);
            return;
        }
        this.f9406b = new C3631d(this, ydVar);
        this.f9407c = new C3632e(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[SYNTHETIC, Splitter:B:29:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4 A[SYNTHETIC, Splitter:B:41:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7 A[SYNTHETIC, Splitter:B:53:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC, Splitter:B:59:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0113  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo18374b() {
        /*
            r7 = this;
            com.yandex.metrica.impl.ob.Ij r0 = r7.f9405a
            boolean r0 = r0.mo15947c()
            r1 = 0
            if (r0 == 0) goto L_0x0121
            com.yandex.metrica.impl.ob.uj$a r0 = new com.yandex.metrica.impl.ob.uj$a
            r0.<init>()
            com.yandex.metrica.impl.ob.Ij r2 = r7.f9405a
            android.telephony.TelephonyManager r2 = r2.mo15950f()
            r3 = -1
            if (r2 == 0) goto L_0x003d
            com.yandex.metrica.impl.ob.zd r4 = r7.f9406b     // Catch:{ all -> 0x003d }
            com.yandex.metrica.impl.ob.Ij r5 = r7.f9405a     // Catch:{ all -> 0x003d }
            android.content.Context r5 = r5.mo15949e()     // Catch:{ all -> 0x003d }
            boolean r4 = r4.mo15812a(r5)     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x003d
            android.telephony.CellLocation r2 = r2.getCellLocation()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0030
            goto L_0x003d
        L_0x0030:
            android.telephony.gsm.GsmCellLocation r2 = (android.telephony.gsm.GsmCellLocation) r2     // Catch:{ all -> 0x003d }
            int r2 = r2.getLac()     // Catch:{ all -> 0x003d }
            if (r3 == r2) goto L_0x003d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r2 = r1
        L_0x003e:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18300c((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f9405a
            android.telephony.TelephonyManager r2 = r2.mo15950f()
            r4 = 3
            r5 = 0
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r2.getNetworkOperator()     // Catch:{ all -> 0x006b }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x005b
            java.lang.String r2 = r2.substring(r5, r4)     // Catch:{ all -> 0x006b }
            goto L_0x005c
        L_0x005b:
            r2 = r1
        L_0x005c:
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x006b }
            if (r6 != 0) goto L_0x006b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x006b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r2 = r1
        L_0x006c:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18306i((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f9405a
            android.telephony.TelephonyManager r2 = r2.mo15950f()
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = r2.getNetworkOperator()     // Catch:{ all -> 0x0097 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0087
            java.lang.String r2 = r2.substring(r4)     // Catch:{ all -> 0x0097 }
            goto L_0x0088
        L_0x0087:
            r2 = r1
        L_0x0088:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x0097
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0097 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0097 }
            goto L_0x0098
        L_0x0097:
            r2 = r1
        L_0x0098:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18307j((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f9405a
            android.telephony.TelephonyManager r2 = r2.mo15950f()
            if (r2 == 0) goto L_0x00ca
            com.yandex.metrica.impl.ob.zd r4 = r7.f9406b     // Catch:{ all -> 0x00ca }
            com.yandex.metrica.impl.ob.Ij r6 = r7.f9405a     // Catch:{ all -> 0x00ca }
            android.content.Context r6 = r6.mo15949e()     // Catch:{ all -> 0x00ca }
            boolean r4 = r4.mo15812a(r6)     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x00ca
            android.telephony.CellLocation r2 = r2.getCellLocation()     // Catch:{ all -> 0x00ca }
            android.telephony.gsm.GsmCellLocation r2 = (android.telephony.gsm.GsmCellLocation) r2     // Catch:{ all -> 0x00ca }
            r4 = 1
            if (r2 == 0) goto L_0x00c3
            int r4 = r2.getCid()     // Catch:{ all -> 0x00ca }
        L_0x00c3:
            if (r3 == r4) goto L_0x00ca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            r2 = r1
        L_0x00cb:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18298b((java.lang.Integer) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f9405a
            android.telephony.TelephonyManager r2 = r2.mo15950f()
            if (r2 == 0) goto L_0x00dc
            java.lang.String r2 = r2.getNetworkOperatorName()     // Catch:{ all -> 0x00dc }
            goto L_0x00dd
        L_0x00dc:
            r2 = r1
        L_0x00dd:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18299b((java.lang.String) r2)
            com.yandex.metrica.impl.ob.Ij r2 = r7.f9405a
            android.telephony.TelephonyManager r2 = r2.mo15950f()
            java.lang.String r3 = "unknown"
            if (r2 == 0) goto L_0x0110
            com.yandex.metrica.impl.ob.zd r4 = r7.f9407c     // Catch:{ all -> 0x010f }
            com.yandex.metrica.impl.ob.Ij r6 = r7.f9405a     // Catch:{ all -> 0x010f }
            android.content.Context r6 = r6.mo15949e()     // Catch:{ all -> 0x010f }
            boolean r4 = r4.mo15812a(r6)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x010d
            int r2 = r2.getNetworkType()     // Catch:{ all -> 0x010f }
            android.util.SparseArray r4 = f9404d     // Catch:{ all -> 0x010f }
            java.lang.Object r2 = r4.get(r2, r3)     // Catch:{ all -> 0x010f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x010f }
            r1 = r2
            goto L_0x0110
        L_0x010d:
            r1 = r3
            goto L_0x0110
        L_0x010f:
        L_0x0110:
            if (r1 != 0) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            r3 = r1
        L_0x0114:
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18296a((java.lang.String) r3)
            com.yandex.metrica.impl.ob.uj$a r0 = r0.mo18293a((int) r5)
            com.yandex.metrica.impl.ob.uj r1 = new com.yandex.metrica.impl.ob.uj
            r1.<init>(r0)
        L_0x0121:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3627wj.mo18374b():java.lang.Object");
    }
}
