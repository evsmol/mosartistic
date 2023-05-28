package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.Ld */
public class C2272Ld extends C2241Kd {

    /* renamed from: l */
    private static final C2484Rd f6060l = new C2484Rd(IronSourceConstants.TYPE_UUID, (String) null);

    /* renamed from: m */
    private static final C2484Rd f6061m = new C2484Rd("DEVICEID_3", (String) null);

    /* renamed from: n */
    private static final C2484Rd f6062n = new C2484Rd("AD_URL_GET", (String) null);

    /* renamed from: o */
    private static final C2484Rd f6063o = new C2484Rd("AD_URL_REPORT", (String) null);

    /* renamed from: p */
    private static final C2484Rd f6064p = new C2484Rd("HOST_URL", (String) null);

    /* renamed from: q */
    private static final C2484Rd f6065q = new C2484Rd("SERVER_TIME_OFFSET", (String) null);

    /* renamed from: r */
    private static final C2484Rd f6066r = new C2484Rd("CLIDS", (String) null);

    /* renamed from: f */
    private C2484Rd f6067f = new C2484Rd(f6060l.mo16560b());

    /* renamed from: g */
    private C2484Rd f6068g = new C2484Rd(f6061m.mo16560b());

    /* renamed from: h */
    private C2484Rd f6069h = new C2484Rd(f6062n.mo16560b());

    /* renamed from: i */
    private C2484Rd f6070i = new C2484Rd(f6063o.mo16560b());

    /* renamed from: j */
    private C2484Rd f6071j;

    /* renamed from: k */
    private C2484Rd f6072k;

    public C2272Ld(Context context) {
        super(context, (String) null);
        new C2484Rd(f6064p.mo16560b());
        this.f6071j = new C2484Rd(f6065q.mo16560b());
        this.f6072k = new C2484Rd(f6066r.mo16560b());
    }

    /* renamed from: a */
    public long mo16168a(long j) {
        return this.f5974b.getLong(this.f6071j.mo16560b(), j);
    }

    /* renamed from: b */
    public String mo16169b(String str) {
        return this.f5974b.getString(this.f6069h.mo16558a(), (String) null);
    }

    /* renamed from: c */
    public String mo16170c(String str) {
        return this.f5974b.getString(this.f6070i.mo16558a(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo15997d() {
        return "_startupinfopreferences";
    }

    /* renamed from: d */
    public String mo16171d(String str) {
        return this.f5974b.getString(this.f6072k.mo16558a(), (String) null);
    }

    /* renamed from: e */
    public String mo16172e(String str) {
        return this.f5974b.getString(this.f6068g.mo16558a(), (String) null);
    }

    /* renamed from: f */
    public String mo16174f(String str) {
        return this.f5974b.getString(this.f6067f.mo16558a(), (String) null);
    }

    /* renamed from: g */
    public Map<String, ?> mo16175g() {
        return this.f5974b.getAll();
    }

    /* renamed from: f */
    public C2272Ld mo16173f() {
        return (C2272Ld) mo16081e();
    }
}
