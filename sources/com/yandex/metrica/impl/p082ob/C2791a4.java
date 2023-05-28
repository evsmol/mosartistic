package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.p082ob.C2294M3;

/* renamed from: com.yandex.metrica.impl.ob.a4 */
public class C2791a4 {

    /* renamed from: a */
    private final C2861c9 f7364a;

    /* renamed from: b */
    private final C2827b8 f7365b;

    /* renamed from: c */
    private C2823b6 f7366c;

    /* renamed from: d */
    private C2265L7 f7367d;

    /* renamed from: e */
    private final C1965Dm f7368e;

    /* renamed from: f */
    private final C3020h6 f7369f;

    /* renamed from: g */
    private final C3460s f7370g;

    /* renamed from: h */
    private final C2364O3 f7371h;

    /* renamed from: i */
    private C2792a f7372i;

    /* renamed from: j */
    private final TimeProvider f7373j;

    /* renamed from: k */
    private final int f7374k;

    /* renamed from: l */
    private long f7375l;

    /* renamed from: m */
    private long f7376m;

    /* renamed from: n */
    private int f7377n;

    /* renamed from: com.yandex.metrica.impl.ob.a4$a */
    public interface C2792a {
    }

    public C2791a4(C2861c9 c9Var, C2827b8 b8Var, C2823b6 b6Var, C2265L7 l7, C3460s sVar, C1965Dm dm, C3020h6 h6Var, int i, C2792a aVar, C2364O3 o3, TimeProvider timeProvider) {
        this.f7364a = c9Var;
        this.f7365b = b8Var;
        this.f7366c = b6Var;
        this.f7367d = l7;
        this.f7370g = sVar;
        this.f7368e = dm;
        this.f7369f = h6Var;
        this.f7374k = i;
        this.f7371h = o3;
        this.f7373j = timeProvider;
        this.f7372i = aVar;
        this.f7375l = c9Var.mo17386b(0);
        this.f7376m = c9Var.mo17401l();
        this.f7377n = c9Var.mo17396i();
    }

    /* renamed from: a */
    public void mo17143a(C2851c0 c0Var) {
        this.f7366c.mo17213c(c0Var);
    }

    /* renamed from: b */
    public void mo17146b(C2851c0 c0Var) {
        mo17144a(c0Var, this.f7366c.mo17212b(c0Var));
    }

    /* renamed from: c */
    public void mo17147c(C2851c0 c0Var) {
        mo17144a(c0Var, this.f7366c.mo17212b(c0Var));
        int i = this.f7374k;
        this.f7377n = i;
        this.f7364a.mo17383a(i).mo17448d();
    }

    /* renamed from: d */
    public void mo17149d(C2851c0 c0Var) {
        mo17144a(c0Var, this.f7366c.mo17212b(c0Var));
        long currentTimeSeconds = this.f7373j.currentTimeSeconds();
        this.f7375l = currentTimeSeconds;
        this.f7364a.mo17387c(currentTimeSeconds).mo17448d();
    }

    /* renamed from: e */
    public void mo17151e(C2851c0 c0Var) {
        mo17144a(c0Var, this.f7366c.mo17212b(c0Var));
        long currentTimeSeconds = this.f7373j.currentTimeSeconds();
        this.f7376m = currentTimeSeconds;
        this.f7364a.mo17390e(currentTimeSeconds).mo17448d();
    }

    /* renamed from: f */
    public void mo17152f(C2851c0 c0Var) {
        mo17144a(c0Var, this.f7366c.mo17215f(c0Var));
    }

    /* renamed from: a */
    public void mo17144a(C2851c0 c0Var, C2858c6 c6Var) {
        if (TextUtils.isEmpty(c0Var.mo17347p())) {
            c0Var.mo15970e(this.f7364a.mo17403n());
        }
        c0Var.mo17340i().putAll(this.f7369f.mo17653a());
        c0Var.mo15969d(this.f7364a.mo17402m());
        c0Var.mo17325a(Integer.valueOf(this.f7365b.mo17230e()));
        C2858c6 c6Var2 = c6Var;
        this.f7367d.mo16156a(this.f7368e.mo15639a(c0Var).mo15473a(c0Var), c0Var.mo17346o(), c6Var2, this.f7370g.mo18188a(), this.f7371h);
        ((C2294M3.C2295a) this.f7372i).f6145a.mo16587g();
    }

    /* renamed from: b */
    public void mo17145b() {
        int i = this.f7374k;
        this.f7377n = i;
        this.f7364a.mo17383a(i).mo17448d();
    }

    /* renamed from: c */
    public boolean mo17148c() {
        return this.f7377n < this.f7374k;
    }

    /* renamed from: d */
    public boolean mo17150d() {
        return this.f7373j.currentTimeSeconds() - this.f7375l > C2734Y5.f7221a;
    }

    /* renamed from: a */
    public long mo17142a() {
        return this.f7376m;
    }
}
