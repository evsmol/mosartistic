package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.p206h.C7508o;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7731c;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.p */
public final class C7819p extends C6811ak {

    /* renamed from: h */
    public static final C7397g.C7398a<C7819p> f18564h = $$Lambda$p$hTa8Lwjj_vTaNwsWoxXnMYA4bk.INSTANCE;

    /* renamed from: a */
    public final int f18565a;

    /* renamed from: b */
    public final String f18566b;

    /* renamed from: c */
    public final int f18567c;

    /* renamed from: d */
    public final C7864v f18568d;

    /* renamed from: e */
    public final int f18569e;

    /* renamed from: f */
    public final C7508o f18570f;

    /* renamed from: g */
    final boolean f18571g;

    private C7819p(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C7864v) null, 4, false);
    }

    private C7819p(int i, Throwable th, String str, int i2, String str2, int i3, C7864v vVar, int i4, boolean z) {
        this(m22729a(i, str, str2, i3, vVar, i4), th, i2, i, str2, i3, vVar, i4, (C7508o) null, SystemClock.elapsedRealtime(), z);
    }

    private C7819p(Bundle bundle) {
        super(bundle);
        this.f18565a = bundle.getInt(m17544a(1001), 2);
        this.f18566b = bundle.getString(m17544a(1002));
        this.f18567c = bundle.getInt(m17544a(1003), -1);
        this.f18568d = (C7864v) C7731c.m22274a(C7864v.f18902F, bundle.getBundle(m17544a(1004)));
        this.f18569e = bundle.getInt(m17544a(1005), 4);
        this.f18571g = bundle.getBoolean(m17544a(1006), false);
        this.f18570f = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C7819p(String str, Throwable th, int i, int i2, String str2, int i3, C7864v vVar, int i4, C7508o oVar, long j, boolean z) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        C7717a.m22118a(!z2 || i5 == 1);
        C7717a.m22118a((th != null || i5 == 3) ? true : z3);
        this.f18565a = i5;
        this.f18566b = str2;
        this.f18567c = i3;
        this.f18568d = vVar;
        this.f18569e = i4;
        this.f18570f = oVar;
        this.f18571g = z2;
    }

    /* renamed from: a */
    public static C7819p m22725a(IOException iOException, int i) {
        return new C7819p(0, iOException, i);
    }

    @Deprecated
    /* renamed from: a */
    public static C7819p m22726a(RuntimeException runtimeException) {
        return m22727a(runtimeException, 1000);
    }

    /* renamed from: a */
    public static C7819p m22727a(RuntimeException runtimeException, int i) {
        return new C7819p(2, runtimeException, i);
    }

    /* renamed from: a */
    public static C7819p m22728a(Throwable th, String str, int i, C7864v vVar, int i2, boolean z, int i3) {
        return new C7819p(1, th, (String) null, i3, str, i, vVar, vVar == null ? 4 : i2, z);
    }

    /* renamed from: a */
    private static String m22729a(int i, String str, String str2, int i2, C7864v vVar, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + vVar + ", format_supported=" + C7476h.m20798a(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* renamed from: lambda$hTa8Lwjj_vTaN-wsWoxXnMYA4bk  reason: not valid java name */
    public static /* synthetic */ C7819p m31745lambda$hTa8Lwjj_vTaNwsWoxXnMYA4bk(Bundle bundle) {
        return new C7819p(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7819p mo55232a(C7508o oVar) {
        return new C7819p((String) C7728ai.m22198a(getMessage()), getCause(), this.f14808i, this.f18565a, this.f18566b, this.f18567c, this.f18568d, this.f18569e, oVar, this.f14809j, this.f18571g);
    }
}
