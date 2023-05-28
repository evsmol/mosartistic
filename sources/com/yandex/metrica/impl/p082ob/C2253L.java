package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.yandex.metrica.impl.ob.L */
public class C2253L {

    /* renamed from: a */
    private final C2673W0 f5985a;

    /* renamed from: b */
    private final C2673W0 f5986b;

    /* renamed from: c */
    private final C2673W0 f5987c;

    /* renamed from: d */
    private final C2673W0 f5988d;

    /* renamed from: e */
    private final C2673W0 f5989e;

    /* renamed from: f */
    private final C2673W0 f5990f;

    /* renamed from: g */
    private final C2673W0 f5991g;

    /* renamed from: h */
    private final C2673W0 f5992h;

    /* renamed from: i */
    private final C2673W0 f5993i;

    /* renamed from: j */
    private final C2673W0 f5994j;

    /* renamed from: k */
    private final C2673W0 f5995k;

    /* renamed from: l */
    private final long f5996l;

    /* renamed from: m */
    private final C2972fl f5997m;

    /* renamed from: n */
    private final C3437ra f5998n;

    /* renamed from: o */
    private final long f5999o;

    /* renamed from: p */
    private final C2720Xh f6000p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2253L(com.yandex.metrica.impl.p082ob.C3356pi r21, com.yandex.metrica.impl.p082ob.C3729zb r22, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            r20 = this;
            java.lang.String r0 = r21.mo17968V()
            com.yandex.metrica.impl.ob.W0 r2 = m7663a((java.lang.String) r0)
            java.lang.String r0 = r21.mo17977i()
            com.yandex.metrica.impl.ob.W0 r3 = m7663a((java.lang.String) r0)
            java.lang.String r0 = r21.mo17978j()
            com.yandex.metrica.impl.ob.W0 r4 = m7663a((java.lang.String) r0)
            java.lang.String r0 = r21.mo17953G()
            com.yandex.metrica.impl.ob.W0 r5 = m7663a((java.lang.String) r0)
            java.lang.String r0 = r21.mo17984p()
            com.yandex.metrica.impl.ob.W0 r6 = m7663a((java.lang.String) r0)
            java.lang.String r0 = r21.mo17982n()
            java.util.Map r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8518a((java.lang.String) r0)
            java.lang.String r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8515a((java.util.Map<java.lang.String, java.lang.String>) r0)
            com.yandex.metrica.impl.ob.W0 r7 = m7663a((java.lang.String) r0)
            java.lang.String r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8515a((java.util.Map<java.lang.String, java.lang.String>) r23)
            com.yandex.metrica.impl.ob.W0 r8 = m7663a((java.lang.String) r0)
            com.yandex.metrica.impl.ob.W0 r9 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18453a()
            com.yandex.metrica.impl.ob.tb r0 = r0.f9198a
            r1 = 0
            if (r0 != 0) goto L_0x004d
            r0 = r1
            goto L_0x0055
        L_0x004d:
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18453a()
            com.yandex.metrica.impl.ob.tb r0 = r0.f9198a
            java.lang.String r0 = r0.f9142b
        L_0x0055:
            com.yandex.metrica.impl.ob.ub r10 = r22.mo18453a()
            com.yandex.metrica.impl.ob.U0 r10 = r10.f9199b
            com.yandex.metrica.impl.ob.ub r11 = r22.mo18453a()
            java.lang.String r11 = r11.f9200c
            r9.<init>(r0, r10, r11)
            com.yandex.metrica.impl.ob.W0 r10 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18454b()
            com.yandex.metrica.impl.ob.tb r0 = r0.f9198a
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0078
        L_0x0070:
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18454b()
            com.yandex.metrica.impl.ob.tb r0 = r0.f9198a
            java.lang.String r0 = r0.f9142b
        L_0x0078:
            com.yandex.metrica.impl.ob.ub r11 = r22.mo18454b()
            com.yandex.metrica.impl.ob.U0 r11 = r11.f9199b
            com.yandex.metrica.impl.ob.ub r12 = r22.mo18454b()
            java.lang.String r12 = r12.f9200c
            r10.<init>(r0, r11, r12)
            com.yandex.metrica.impl.ob.W0 r11 = new com.yandex.metrica.impl.ob.W0
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18455c()
            com.yandex.metrica.impl.ob.tb r0 = r0.f9198a
            if (r0 != 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18455c()
            com.yandex.metrica.impl.ob.tb r0 = r0.f9198a
            java.lang.String r1 = r0.f9142b
        L_0x009a:
            com.yandex.metrica.impl.ob.ub r0 = r22.mo18455c()
            com.yandex.metrica.impl.ob.U0 r0 = r0.f9199b
            com.yandex.metrica.impl.ob.ub r12 = r22.mo18455c()
            java.lang.String r12 = r12.f9200c
            r11.<init>(r1, r0, r12)
            java.util.Map r0 = r21.mo17976h()
            java.lang.String r0 = com.yandex.metrica.impl.p082ob.C2572Tl.m8529b((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r0)
            com.yandex.metrica.impl.ob.W0 r12 = m7663a((java.lang.String) r0)
            com.yandex.metrica.impl.ob.fl r0 = new com.yandex.metrica.impl.ob.fl
            r13 = r0
            r1 = r21
            r0.<init>((com.yandex.metrica.impl.p082ob.C3356pi) r1)
            com.yandex.metrica.impl.ob.ra r14 = r21.mo17980l()
            long r15 = com.yandex.metrica.impl.p082ob.C2814b.m9057a()
            long r17 = r21.mo17949C()
            com.yandex.metrica.impl.ob.si r0 = r21.mo17961O()
            int r0 = r0.mo18215a()
            long r0 = (long) r0
            long r17 = r17 + r0
            com.yandex.metrica.impl.ob.Sh r0 = r21.mo17974f()
            java.lang.Boolean r0 = r0.f6685x
            com.yandex.metrica.impl.ob.Xh r19 = m7665a((java.lang.Boolean) r0)
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2253L.<init>(com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.zb, java.util.Map):void");
    }

    /* renamed from: a */
    public C2673W0 mo16090a() {
        return this.f5991g;
    }

    /* renamed from: b */
    public C2673W0 mo16091b() {
        return this.f5995k;
    }

    /* renamed from: c */
    public C2673W0 mo16092c() {
        return this.f5986b;
    }

    /* renamed from: d */
    public C2673W0 mo16094d() {
        return this.f5987c;
    }

    /* renamed from: e */
    public C3437ra mo16095e() {
        return this.f5998n;
    }

    /* renamed from: f */
    public C2720Xh mo16096f() {
        return this.f6000p;
    }

    /* renamed from: g */
    public C2673W0 mo16097g() {
        return this.f5992h;
    }

    /* renamed from: h */
    public C2673W0 mo16098h() {
        return this.f5989e;
    }

    /* renamed from: i */
    public C2673W0 mo16099i() {
        return this.f5993i;
    }

    /* renamed from: j */
    public long mo16100j() {
        return this.f5999o;
    }

    /* renamed from: k */
    public C2673W0 mo16101k() {
        return this.f5988d;
    }

    /* renamed from: l */
    public C2673W0 mo16102l() {
        return this.f5990f;
    }

    /* renamed from: m */
    public long mo16103m() {
        return this.f5996l;
    }

    /* renamed from: n */
    public C2972fl mo16104n() {
        return this.f5997m;
    }

    /* renamed from: o */
    public C2673W0 mo16105o() {
        return this.f5985a;
    }

    /* renamed from: p */
    public C2673W0 mo16106p() {
        return this.f5994j;
    }

    public String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f5985a + ", mDeviceIdData=" + this.f5986b + ", mDeviceIdHashData=" + this.f5987c + ", mReportAdUrlData=" + this.f5988d + ", mGetAdUrlData=" + this.f5989e + ", mResponseClidsData=" + this.f5990f + ", mClientClidsForRequestData=" + this.f5991g + ", mGaidData=" + this.f5992h + ", mHoaidData=" + this.f5993i + ", yandexAdvIdData=" + this.f5994j + ", customSdkHostsData=" + this.f5995k + ", customSdkHosts=" + this.f5995k + ", mServerTimeOffset=" + this.f5996l + ", mUiAccessConfig=" + this.f5997m + ", diagnosticsConfigsHolder=" + this.f5998n + ", nextStartupTime=" + this.f5999o + ", features=" + this.f6000p + '}';
    }

    /* renamed from: a */
    private static Bundle m7661a(Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE, parcelable);
        return bundle;
    }

    /* renamed from: b */
    private static C2972fl m7668b(Bundle bundle) {
        return (C2972fl) m7662a(bundle.getBundle("UiAccessConfig"), C2972fl.class.getClassLoader());
    }

    /* renamed from: c */
    public void mo16093c(Bundle bundle) {
        bundle.putBundle("Uuid", m7661a((Parcelable) this.f5985a));
        bundle.putBundle("DeviceId", m7661a((Parcelable) this.f5986b));
        bundle.putBundle("DeviceIdHash", m7661a((Parcelable) this.f5987c));
        bundle.putBundle("AdUrlReport", m7661a((Parcelable) this.f5988d));
        bundle.putBundle("AdUrlGet", m7661a((Parcelable) this.f5989e));
        bundle.putBundle("Clids", m7661a((Parcelable) this.f5990f));
        bundle.putBundle("RequestClids", m7661a((Parcelable) this.f5991g));
        bundle.putBundle(IronSourceConstants.TYPE_GAID, m7661a((Parcelable) this.f5992h));
        bundle.putBundle("HOAID", m7661a((Parcelable) this.f5993i));
        bundle.putBundle("YANDEX_ADV_ID", m7661a((Parcelable) this.f5994j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", m7661a((Parcelable) this.f5995k));
        bundle.putBundle("UiAccessConfig", m7661a((Parcelable) this.f5997m));
        bundle.putBundle("DiagnosticsConfigsHolder", m7661a((Parcelable) this.f5998n));
        bundle.putLong("ServerTimeOffset", this.f5996l);
        bundle.putLong("NextStartupTime", this.f5999o);
        bundle.putBundle("features", m7661a((Parcelable) this.f6000p));
    }

    /* renamed from: a */
    private static Parcelable m7662a(Bundle bundle, ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable(AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    /* renamed from: b */
    private static C2673W0 m7667b(Bundle bundle, String str) {
        C2673W0 w0 = (C2673W0) m7662a(bundle.getBundle(str), C2673W0.class.getClassLoader());
        return w0 == null ? new C2673W0((String) null, C2577U0.UNKNOWN, "bundle serialization error") : w0;
    }

    /* renamed from: a */
    private static C3437ra m7666a(Bundle bundle) {
        C3437ra raVar = (C3437ra) m7662a(bundle.getBundle("DiagnosticsConfigsHolder"), C3437ra.class.getClassLoader());
        return raVar == null ? new C3437ra() : raVar;
    }

    /* renamed from: a */
    private static C2720Xh m7664a(Bundle bundle, String str) {
        C2720Xh xh = (C2720Xh) m7662a(bundle.getBundle(str), C2720Xh.class.getClassLoader());
        return xh == null ? new C2720Xh((Boolean) null, C2577U0.UNKNOWN, "bundle serialization error") : xh;
    }

    /* renamed from: a */
    private static C2673W0 m7663a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new C2673W0(str, isEmpty ? C2577U0.UNKNOWN : C2577U0.OK, isEmpty ? "no identifier in startup state" : null);
    }

    /* renamed from: a */
    private static C2720Xh m7665a(Boolean bool) {
        boolean z = bool != null;
        return new C2720Xh(bool, z ? C2577U0.OK : C2577U0.UNKNOWN, z ? null : "no identifier in startup state");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2253L(android.os.Bundle r22) {
        /*
            r21 = this;
            r0 = r22
            r1 = r21
            java.lang.String r2 = "Uuid"
            com.yandex.metrica.impl.ob.W0 r2 = m7667b(r0, r2)
            java.lang.String r3 = "DeviceId"
            com.yandex.metrica.impl.ob.W0 r3 = m7667b(r0, r3)
            java.lang.String r4 = "DeviceIdHash"
            com.yandex.metrica.impl.ob.W0 r4 = m7667b(r0, r4)
            java.lang.String r5 = "AdUrlReport"
            com.yandex.metrica.impl.ob.W0 r5 = m7667b(r0, r5)
            java.lang.String r6 = "AdUrlGet"
            com.yandex.metrica.impl.ob.W0 r6 = m7667b(r0, r6)
            java.lang.String r7 = "Clids"
            com.yandex.metrica.impl.ob.W0 r7 = m7667b(r0, r7)
            java.lang.String r8 = "RequestClids"
            com.yandex.metrica.impl.ob.W0 r8 = m7667b(r0, r8)
            java.lang.String r9 = "GAID"
            com.yandex.metrica.impl.ob.W0 r9 = m7667b(r0, r9)
            java.lang.String r10 = "HOAID"
            com.yandex.metrica.impl.ob.W0 r10 = m7667b(r0, r10)
            java.lang.String r11 = "YANDEX_ADV_ID"
            com.yandex.metrica.impl.ob.W0 r11 = m7667b(r0, r11)
            java.lang.String r12 = "CUSTOM_SDK_HOSTS"
            com.yandex.metrica.impl.ob.W0 r12 = m7667b(r0, r12)
            com.yandex.metrica.impl.ob.fl r13 = m7668b(r22)
            com.yandex.metrica.impl.ob.ra r14 = m7666a((android.os.Bundle) r22)
            java.lang.String r15 = "ServerTimeOffset"
            long r15 = r0.getLong(r15)
            r20 = r1
            java.lang.String r1 = "NextStartupTime"
            long r17 = r0.getLong(r1)
            java.lang.String r1 = "features"
            com.yandex.metrica.impl.ob.Xh r19 = m7664a((android.os.Bundle) r0, (java.lang.String) r1)
            r1 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2253L.<init>(android.os.Bundle):void");
    }

    public C2253L(C2673W0 w0, C2673W0 w02, C2673W0 w03, C2673W0 w04, C2673W0 w05, C2673W0 w06, C2673W0 w07, C2673W0 w08, C2673W0 w09, C2673W0 w010, C2673W0 w011, C2972fl flVar, C3437ra raVar, long j, long j2, C2720Xh xh) {
        this.f5985a = w0;
        this.f5986b = w02;
        this.f5987c = w03;
        this.f5988d = w04;
        this.f5989e = w05;
        this.f5990f = w06;
        this.f5991g = w07;
        this.f5992h = w08;
        this.f5993i = w09;
        this.f5994j = w010;
        this.f5995k = w011;
        this.f5997m = flVar;
        this.f5998n = raVar;
        this.f5996l = j;
        this.f5999o = j2;
        this.f6000p = xh;
    }
}
