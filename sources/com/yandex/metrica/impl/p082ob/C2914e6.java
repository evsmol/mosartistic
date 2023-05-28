package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p082ob.C2572Tl;

/* renamed from: com.yandex.metrica.impl.ob.e6 */
public class C2914e6 implements C2885d6 {

    /* renamed from: a */
    private final String f7707a;

    /* renamed from: b */
    protected final C2861c9 f7708b;

    /* renamed from: c */
    private C2572Tl.C2573a f7709c;

    public C2914e6(C2861c9 c9Var, String str) {
        this.f7708b = c9Var;
        this.f7707a = str;
        C2572Tl.C2573a aVar = new C2572Tl.C2573a();
        try {
            String g = c9Var.mo17393g(str);
            if (!TextUtils.isEmpty(g)) {
                aVar = new C2572Tl.C2573a(g);
            }
        } catch (Throwable unused) {
        }
        this.f7709c = aVar;
    }

    /* renamed from: a */
    public C2914e6 mo17482a(long j) {
        m9402a("SESSION_INIT_TIME", Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public C2914e6 mo17485b(long j) {
        m9402a("SESSION_LAST_EVENT_OFFSET", Long.valueOf(j));
        return this;
    }

    /* renamed from: c */
    public Long mo17488c() {
        return this.f7709c.mo16725a("SESSION_INIT_TIME");
    }

    /* renamed from: d */
    public C2914e6 mo17489d(long j) {
        m9402a("SESSION_ID", Long.valueOf(j));
        return this;
    }

    /* renamed from: e */
    public Long mo17492e() {
        return this.f7709c.mo16725a("SESSION_COUNTER_ID");
    }

    /* renamed from: f */
    public Long mo17493f() {
        return this.f7709c.mo16725a("SESSION_ID");
    }

    /* renamed from: g */
    public Long mo17494g() {
        return this.f7709c.mo16725a("SESSION_SLEEP_START");
    }

    /* renamed from: h */
    public boolean mo17495h() {
        return this.f7709c.length() > 0;
    }

    /* renamed from: i */
    public Boolean mo17496i() {
        C2572Tl.C2573a aVar = this.f7709c;
        aVar.getClass();
        try {
            return Boolean.valueOf(aVar.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C2914e6 mo17483a(boolean z) {
        m9402a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public void mo17486b() {
        this.f7708b.mo17388c(this.f7707a, this.f7709c.toString());
        this.f7708b.mo17448d();
    }

    /* renamed from: c */
    public C2914e6 mo17487c(long j) {
        m9402a("SESSION_COUNTER_ID", Long.valueOf(j));
        return this;
    }

    /* renamed from: d */
    public Long mo17490d() {
        return this.f7709c.mo16725a("SESSION_LAST_EVENT_OFFSET");
    }

    /* renamed from: e */
    public C2914e6 mo17491e(long j) {
        m9402a("SESSION_SLEEP_START", Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    private void m9402a(String str, Object obj) {
        try {
            this.f7709c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo17484a() {
        this.f7709c = new C2572Tl.C2573a();
        mo17486b();
    }
}
