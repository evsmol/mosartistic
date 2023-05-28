package com.yandex.metrica.impl.p082ob;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.yandex.metrica.impl.p082ob.C3460s;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c9 */
public class C2861c9 extends C2888d9 implements C2945f8 {

    /* renamed from: c */
    private static final C2484Rd f7563c = new C2484Rd("IDENTITY_SEND_TIME", (String) null);

    /* renamed from: d */
    private static final C2484Rd f7564d = new C2484Rd("PERMISSIONS_CHECK_TIME", (String) null);

    /* renamed from: e */
    private static final C2484Rd f7565e = new C2484Rd("USER_INFO", (String) null);

    /* renamed from: f */
    private static final C2484Rd f7566f = new C2484Rd("PROFILE_ID", (String) null);

    /* renamed from: g */
    private static final C2484Rd f7567g = new C2484Rd("APP_ENVIRONMENT", (String) null);

    /* renamed from: h */
    private static final C2484Rd f7568h = new C2484Rd("APP_ENVIRONMENT_REVISION", (String) null);

    /* renamed from: i */
    private static final C2484Rd f7569i = new C2484Rd("LAST_MIGRATION_VERSION", (String) null);

    /* renamed from: j */
    private static final C2484Rd f7570j = new C2484Rd("LAST_APP_VERSION_WITH_FEATURES", (String) null);

    /* renamed from: k */
    private static final C2484Rd f7571k = new C2484Rd("APPLICATION_FEATURES", (String) null);

    /* renamed from: l */
    private static final C2484Rd f7572l = new C2484Rd("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", (String) null);

    /* renamed from: m */
    private static final C2484Rd f7573m = new C2484Rd("CERTIFICATES_SHA1_FINGERPRINTS", (String) null);

    /* renamed from: n */
    static final C2484Rd f7574n = new C2484Rd("DEPRECATED_NATIVE_CRASHES_CHECKED", (String) null);

    /* renamed from: o */
    private static final C2484Rd f7575o = new C2484Rd("REFERRER_HANDLED", (String) null);

    /* renamed from: p */
    private static final C2484Rd f7576p = new C2484Rd("VITAL_DATA", (String) null);

    public C2861c9(C2511S7 s7) {
        super(s7);
    }

    /* renamed from: a */
    public C2861c9 mo17384a(C3460s.C3461a aVar) {
        synchronized (this) {
            mo17443b(f7567g.mo16558a(), aVar.f9083a);
            mo17442b(f7568h.mo16558a(), aVar.f9084b);
        }
        return this;
    }

    /* renamed from: b */
    public long mo17386b(long j) {
        return mo17437a(f7563c.mo16558a(), j);
    }

    /* renamed from: c */
    public C2861c9 mo17387c(long j) {
        return (C2861c9) mo17442b(f7563c.mo16558a(), j);
    }

    /* renamed from: d */
    public C2861c9 mo17389d(long j) {
        return (C2861c9) mo17442b(f7572l.mo16558a(), j);
    }

    /* renamed from: e */
    public C2861c9 mo17390e(long j) {
        return (C2861c9) mo17442b(f7564d.mo16558a(), j);
    }

    /* renamed from: f */
    public C3460s.C3461a mo17391f() {
        C3460s.C3461a aVar;
        synchronized (this) {
            aVar = new C3460s.C3461a(mo17438a(f7567g.mo16558a(), JsonUtils.EMPTY_JSON), mo17437a(f7568h.mo16558a(), 0));
        }
        return aVar;
    }

    /* renamed from: g */
    public String mo17392g() {
        return mo17438a(f7571k.mo16558a(), "");
    }

    /* renamed from: h */
    public C2861c9 mo17394h(String str) {
        return (C2861c9) mo17443b(f7571k.mo16558a(), str);
    }

    /* renamed from: i */
    public int mo17396i() {
        return mo17436a(f7570j.mo16558a(), -1);
    }

    /* renamed from: j */
    public C2861c9 mo17398j(String str) {
        return (C2861c9) mo17443b(f7565e.mo16558a(), str);
    }

    /* renamed from: k */
    public long mo17400k() {
        return mo17437a(f7572l.mo16558a(), 0);
    }

    /* renamed from: l */
    public long mo17401l() {
        return mo17437a(f7564d.mo16558a(), 0);
    }

    /* renamed from: m */
    public String mo17402m() {
        return mo17449e(f7566f.mo16558a());
    }

    /* renamed from: n */
    public String mo17403n() {
        return mo17438a(f7565e.mo16558a(), (String) null);
    }

    /* renamed from: o */
    public boolean mo17404o() {
        return mo17440a(f7574n.mo16558a(), false);
    }

    /* renamed from: p */
    public C2861c9 mo17405p() {
        return (C2861c9) mo17445b(f7574n.mo16558a(), true);
    }

    @Deprecated
    /* renamed from: q */
    public C2861c9 mo17406q() {
        return (C2861c9) mo17445b(f7575o.mo16558a(), true);
    }

    @Deprecated
    /* renamed from: r */
    public C2861c9 mo17407r() {
        return (C2861c9) mo17451f(f7569i.mo16558a());
    }

    @Deprecated
    /* renamed from: s */
    public C2861c9 mo17408s() {
        return (C2861c9) mo17451f(f7575o.mo16558a());
    }

    @Deprecated
    /* renamed from: t */
    public Boolean mo17409t() {
        C2484Rd rd = f7575o;
        if (!mo17446c(rd.mo16558a())) {
            return null;
        }
        return Boolean.valueOf(mo17440a(rd.mo16558a(), false));
    }

    /* renamed from: c */
    public C2861c9 mo17388c(String str, String str2) {
        return (C2861c9) mo17443b(new C2484Rd("SESSION_", str).mo16558a(), str2);
    }

    /* renamed from: g */
    public String mo17393g(String str) {
        return mo17438a(new C2484Rd("SESSION_", str).mo16558a(), "");
    }

    /* renamed from: h */
    public List<String> mo17395h() {
        return mo17439a(f7573m.mo16558a(), (List<String>) Collections.emptyList());
    }

    /* renamed from: i */
    public C2861c9 mo17397i(String str) {
        return (C2861c9) mo17443b(f7566f.mo16558a(), str);
    }

    @Deprecated
    /* renamed from: j */
    public Integer mo17399j() {
        C2484Rd rd = f7569i;
        if (!mo17446c(rd.mo16558a())) {
            return null;
        }
        return Integer.valueOf((int) mo17437a(rd.mo16558a(), 0));
    }

    /* renamed from: c */
    public String mo16514c() {
        return mo17438a(f7576p.mo16558a(), (String) null);
    }

    /* renamed from: a */
    public C2861c9 mo17383a(int i) {
        return (C2861c9) mo17441b(f7570j.mo16558a(), i);
    }

    /* renamed from: a */
    public C2861c9 mo17385a(List<String> list) {
        return (C2861c9) mo17444b(f7573m.mo16558a(), list);
    }

    /* renamed from: a */
    public void mo16513a(String str) {
        mo17443b(f7576p.mo16558a(), str);
    }
}
