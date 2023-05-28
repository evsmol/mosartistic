package com.criteo.publisher.model;

import com.criteo.publisher.C1146i;
import com.criteo.publisher.model.p073b0.C1243n;
import com.criteo.publisher.p074n0.C1316t;
import com.google.gson.annotations.SerializedName;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.criteo.publisher.model.s */
/* compiled from: CdbResponseSlot.kt */
public class C1272s {

    /* renamed from: p */
    public static final C1273a f3955p = new C1273a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Lazy f3956a;

    /* renamed from: b */
    private final Lazy f3957b;
    @SerializedName("impId")

    /* renamed from: c */
    private final String f3958c;
    @SerializedName("placementId")

    /* renamed from: d */
    private final String f3959d;
    @SerializedName("zoneId")

    /* renamed from: e */
    private final Integer f3960e;
    @SerializedName("cpm")

    /* renamed from: f */
    private final String f3961f;
    @SerializedName("currency")

    /* renamed from: g */
    private final String f3962g;
    @SerializedName("width")

    /* renamed from: h */
    private final int f3963h;
    @SerializedName("height")

    /* renamed from: i */
    private final int f3964i;
    @SerializedName("displayUrl")

    /* renamed from: j */
    private final String f3965j;
    @SerializedName("native")

    /* renamed from: k */
    private final C1243n f3966k;
    @SerializedName("ttl")

    /* renamed from: l */
    private int f3967l;
    @SerializedName("isVideo")

    /* renamed from: m */
    private boolean f3968m;
    @SerializedName("isRewarded")

    /* renamed from: n */
    private boolean f3969n;

    /* renamed from: o */
    private long f3970o;

    public C1272s() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, 0, 0, (String) null, (C1243n) null, 0, false, false, 0, 8191, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1272s m5637a(JSONObject jSONObject) {
        return f3955p.mo3588a(jSONObject);
    }

    /* renamed from: b */
    public Double mo3570b() {
        return (Double) this.f3956a.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1272s)) {
            return false;
        }
        C1272s sVar = (C1272s) obj;
        return Intrinsics.areEqual((Object) mo3575f(), (Object) sVar.mo3575f()) && Intrinsics.areEqual((Object) mo3577h(), (Object) sVar.mo3577h()) && Intrinsics.areEqual((Object) mo3582l(), (Object) sVar.mo3582l()) && Intrinsics.areEqual((Object) mo3566a(), (Object) sVar.mo3566a()) && Intrinsics.areEqual((Object) mo3571c(), (Object) sVar.mo3571c()) && mo3581k() == sVar.mo3581k() && mo3573e() == sVar.mo3573e() && Intrinsics.areEqual((Object) mo3572d(), (Object) sVar.mo3572d()) && Intrinsics.areEqual((Object) mo3576g(), (Object) sVar.mo3576g()) && mo3580j() == sVar.mo3580j() && mo3586p() == sVar.mo3586p() && mo3584n() == sVar.mo3584n() && mo3579i() == sVar.mo3579i();
    }

    public int hashCode() {
        String f = mo3575f();
        int i = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        String h = mo3577h();
        int hashCode2 = (hashCode + (h != null ? h.hashCode() : 0)) * 31;
        Integer l = mo3582l();
        int hashCode3 = (hashCode2 + (l != null ? l.hashCode() : 0)) * 31;
        String a = mo3566a();
        int hashCode4 = (hashCode3 + (a != null ? a.hashCode() : 0)) * 31;
        String c = mo3571c();
        int hashCode5 = (((((hashCode4 + (c != null ? c.hashCode() : 0)) * 31) + mo3581k()) * 31) + mo3573e()) * 31;
        String d = mo3572d();
        int hashCode6 = (hashCode5 + (d != null ? d.hashCode() : 0)) * 31;
        C1243n g = mo3576g();
        if (g != null) {
            i = g.hashCode();
        }
        int j = (((hashCode6 + i) * 31) + mo3580j()) * 31;
        boolean p = mo3586p();
        boolean z = true;
        if (p) {
            p = true;
        }
        int i2 = (j + (p ? 1 : 0)) * 31;
        boolean n = mo3584n();
        if (!n) {
            z = n;
        }
        long i3 = mo3579i();
        return ((i2 + (z ? 1 : 0)) * 31) + ((int) (i3 ^ (i3 >>> 32)));
    }

    /* renamed from: m */
    public boolean mo3583m() {
        return ((Boolean) this.f3957b.getValue()).booleanValue();
    }

    public String toString() {
        return "CdbResponseSlot(impressionId=" + mo3575f() + ", placementId=" + mo3577h() + ", zoneId=" + mo3582l() + ", cpm=" + mo3566a() + ", currency=" + mo3571c() + ", width=" + mo3581k() + ", height=" + mo3573e() + ", displayUrl=" + mo3572d() + ", nativeAssets=" + mo3576g() + ", ttlInSeconds=" + mo3580j() + ", isVideo=" + mo3586p() + ", isRewarded=" + mo3584n() + ", timeOfDownload=" + mo3579i() + ")";
    }

    /* renamed from: com.criteo.publisher.model.s$c */
    /* compiled from: CdbResponseSlot.kt */
    static final class C1275c extends Lambda implements Function0<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1272s f3972a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1275c(C1272s sVar) {
            super(0);
            this.f3972a = sVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo3590a());
        }

        /* renamed from: a */
        public final boolean mo3590a() {
            return this.f3972a.mo3576g() != null;
        }
    }

    public C1272s(String str, String str2, Integer num, String str3, String str4, int i, int i2, String str5, C1243n nVar, int i3, boolean z, boolean z2, long j) {
        Intrinsics.checkParameterIsNotNull(str3, "cpm");
        this.f3958c = str;
        this.f3959d = str2;
        this.f3960e = num;
        this.f3961f = str3;
        this.f3962g = str4;
        this.f3963h = i;
        this.f3964i = i2;
        this.f3965j = str5;
        this.f3966k = nVar;
        this.f3967l = i3;
        this.f3968m = z;
        this.f3969n = z2;
        this.f3970o = j;
        this.f3956a = LazyKt.lazy(new C1274b(this));
        this.f3957b = LazyKt.lazy(new C1275c(this));
    }

    /* renamed from: f */
    public String mo3575f() {
        return this.f3958c;
    }

    /* renamed from: h */
    public String mo3577h() {
        return this.f3959d;
    }

    /* renamed from: l */
    public Integer mo3582l() {
        return this.f3960e;
    }

    /* renamed from: a */
    public String mo3566a() {
        return this.f3961f;
    }

    /* renamed from: c */
    public String mo3571c() {
        return this.f3962g;
    }

    /* renamed from: k */
    public int mo3581k() {
        return this.f3963h;
    }

    /* renamed from: e */
    public int mo3573e() {
        return this.f3964i;
    }

    /* renamed from: d */
    public String mo3572d() {
        return this.f3965j;
    }

    /* renamed from: g */
    public C1243n mo3576g() {
        return this.f3966k;
    }

    /* renamed from: a */
    public void mo3567a(int i) {
        this.f3967l = i;
    }

    /* renamed from: j */
    public int mo3580j() {
        return this.f3967l;
    }

    /* renamed from: p */
    public boolean mo3586p() {
        return this.f3968m;
    }

    /* renamed from: n */
    public boolean mo3584n() {
        return this.f3969n;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1272s(java.lang.String r16, java.lang.String r17, java.lang.Integer r18, java.lang.String r19, java.lang.String r20, int r21, int r22, java.lang.String r23, com.criteo.publisher.model.p073b0.C1243n r24, int r25, boolean r26, boolean r27, long r28, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r17
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r18
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = "0.0"
            goto L_0x0024
        L_0x0022:
            r5 = r19
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r20
        L_0x002c:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0033
            r7 = 0
            goto L_0x0035
        L_0x0033:
            r7 = r21
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = 0
            goto L_0x003d
        L_0x003b:
            r9 = r22
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = r2
            goto L_0x0045
        L_0x0043:
            r10 = r23
        L_0x0045:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = r24
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = 0
            goto L_0x0054
        L_0x0052:
            r11 = r25
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005a
            r12 = 0
            goto L_0x005c
        L_0x005a:
            r12 = r26
        L_0x005c:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r8 = r27
        L_0x0063:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            r13 = 0
            goto L_0x006c
        L_0x006a:
            r13 = r28
        L_0x006c:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r9
            r24 = r10
            r25 = r2
            r26 = r11
            r27 = r12
            r28 = r8
            r29 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.C1272s.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, int, java.lang.String, com.criteo.publisher.model.b0.n, int, boolean, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: a */
    public void mo3568a(long j) {
        this.f3970o = j;
    }

    /* renamed from: i */
    public long mo3579i() {
        return this.f3970o;
    }

    /* renamed from: com.criteo.publisher.model.s$a */
    /* compiled from: CdbResponseSlot.kt */
    public static final class C1273a {
        private C1273a() {
        }

        public /* synthetic */ C1273a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
            kotlin.p151io.CloseableKt.closeFinally(r1, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.criteo.publisher.model.C1272s mo3588a(org.json.JSONObject r4) {
            /*
                r3 = this;
                java.lang.String r0 = "json"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
                com.criteo.publisher.s r0 = com.criteo.publisher.C1321s.m5824c()
                com.criteo.publisher.n0.l r0 = r0.mo3670H0()
                java.lang.String r1 = "DependencyProvider.getIn…).provideJsonSerializer()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.lang.String r4 = r4.toString()
                java.lang.String r1 = "json.toString()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r1)
                java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
                if (r4 == 0) goto L_0x0046
                byte[] r4 = r4.getBytes(r1)
                java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
                r1.<init>(r4)
                r4 = 0
                java.lang.Class<com.criteo.publisher.model.s> r2 = com.criteo.publisher.model.C1272s.class
                java.lang.Object r0 = r0.mo3659a(r2, (java.io.InputStream) r1)     // Catch:{ all -> 0x003f }
                java.lang.String r2 = "jsonSerializer.read(CdbR…eSlot::class.java, input)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)     // Catch:{ all -> 0x003f }
                com.criteo.publisher.model.s r0 = (com.criteo.publisher.model.C1272s) r0     // Catch:{ all -> 0x003f }
                kotlin.p151io.CloseableKt.closeFinally(r1, r4)
                return r0
            L_0x003f:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x0041 }
            L_0x0041:
                r0 = move-exception
                kotlin.p151io.CloseableKt.closeFinally(r1, r4)
                throw r0
            L_0x0046:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.C1272s.C1273a.mo3588a(org.json.JSONObject):com.criteo.publisher.model.s");
        }
    }

    /* renamed from: com.criteo.publisher.model.s$b */
    /* compiled from: CdbResponseSlot.kt */
    static final class C1274b extends Lambda implements Function0<Double> {

        /* renamed from: a */
        final /* synthetic */ C1272s f3971a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1274b(C1272s sVar) {
            super(0);
            this.f3971a = sVar;
        }

        /* renamed from: a */
        public final Double invoke() {
            return StringsKt.toDoubleOrNull(this.f3971a.mo3566a());
        }
    }

    /* renamed from: o */
    public boolean mo3585o() {
        Double b = mo3570b();
        boolean z = (b != null ? b.doubleValue() : -1.0d) < 0.0d;
        boolean z2 = Intrinsics.areEqual(mo3570b(), 0.0d) && mo3580j() == 0;
        boolean z3 = Intrinsics.areEqual(mo3570b(), 0.0d) && mo3580j() > 0;
        if (z || z2 || (!z3 && !mo3583m() && !C1316t.m5792c(mo3572d()))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo3569a(C1146i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        return ((long) (mo3580j() * 1000)) + mo3579i() <= iVar.mo3242a();
    }
}
