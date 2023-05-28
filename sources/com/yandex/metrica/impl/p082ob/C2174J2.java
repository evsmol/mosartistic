package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2815b0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.J2 */
public class C2174J2 implements C3140l2 {

    /* renamed from: a */
    private final List<C3167lm<Context, Intent, Void>> f5824a;

    /* renamed from: b */
    private boolean f5825b;

    /* renamed from: c */
    private boolean f5826c;

    /* renamed from: d */
    private final Context f5827d;

    /* renamed from: e */
    private final C2815b0 f5828e;

    /* renamed from: com.yandex.metrica.impl.ob.J2$a */
    class C2175a implements C3135km<Context, Intent> {
        C2175a() {
        }

        /* renamed from: a */
        public void mo15578a(Object obj, Object obj2) {
            C2174J2.m7485a(C2174J2.this, (Context) obj, (Intent) obj2);
        }
    }

    public C2174J2(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new C2815b0.C2816a());
    }

    /* renamed from: a */
    public synchronized void mo15575a() {
        this.f5826c = true;
        if (!this.f5824a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f5828e.mo17205a(this.f5827d, intentFilter);
            this.f5825b = true;
        }
    }

    /* renamed from: b */
    public synchronized void mo15576b() {
        this.f5826c = false;
        if (this.f5825b) {
            this.f5828e.mo17206a(this.f5827d);
            this.f5825b = false;
        }
    }

    C2174J2(Context context, ICommonExecutor iCommonExecutor, C2815b0.C2816a aVar) {
        this.f5824a = new ArrayList();
        this.f5825b = false;
        this.f5826c = false;
        this.f5827d = context;
        this.f5828e = aVar.mo17207a(new C2249Kl(new C2175a(), iCommonExecutor));
    }

    /* renamed from: b */
    public synchronized void mo15975b(C3167lm<Context, Intent, Void> lmVar) {
        this.f5824a.remove(lmVar);
        if (this.f5824a.isEmpty() && this.f5825b) {
            this.f5828e.mo17206a(this.f5827d);
            this.f5825b = false;
        }
    }

    /* renamed from: a */
    public synchronized void mo15974a(C3167lm<Context, Intent, Void> lmVar) {
        this.f5824a.add(lmVar);
        if (this.f5826c && !this.f5825b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f5828e.mo17205a(this.f5827d, intentFilter);
            this.f5825b = true;
        }
    }

    /* renamed from: a */
    static void m7485a(C2174J2 j2, Context context, Intent intent) {
        synchronized (j2) {
            for (C3167lm<Context, Intent, Void> a : j2.f5824a) {
                a.mo15813a(context, intent);
            }
        }
    }
}
