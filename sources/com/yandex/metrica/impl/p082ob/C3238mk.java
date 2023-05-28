package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.mk */
class C3238mk implements C3673xl {

    /* renamed from: a */
    private final C2291M0 f8405a;

    /* renamed from: b */
    private final TimeProvider f8406b;

    /* renamed from: c */
    private Map<Long, Long> f8407c;

    C3238mk() {
        this(C3322oh.m10248a(), new SystemTimeProvider());
    }

    /* renamed from: a */
    public synchronized void mo16227a(Activity activity, long j) {
        this.f8407c.put(Long.valueOf(j), Long.valueOf(this.f8406b.currentTimeMillis()));
    }

    /* renamed from: a */
    public void mo16228a(Activity activity, boolean z) {
    }

    /* renamed from: a */
    public void mo16229a(Throwable th, C3634wl wlVar) {
    }

    /* renamed from: a */
    public boolean mo16230a(C2972fl flVar) {
        return false;
    }

    C3238mk(C2291M0 m0, TimeProvider timeProvider) {
        this.f8407c = new HashMap();
        this.f8405a = m0;
        this.f8406b = timeProvider;
    }

    /* renamed from: a */
    public synchronized void mo16225a(long j, Activity activity, C2903dl dlVar, List<C3454rl> list, C2972fl flVar, C1900Bk bk) {
        this.f8406b.currentTimeMillis();
        if (this.f8407c.get(Long.valueOf(j)) != null) {
            this.f8407c.remove(Long.valueOf(j));
        } else {
            this.f8405a.reportError("ui_parsing_diagnostics", (Throwable) new IllegalStateException("Unexpected situation: no start time"));
        }
    }
}
