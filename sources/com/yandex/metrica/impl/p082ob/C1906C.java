package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C2815b0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.C */
public class C1906C implements C3140l2 {

    /* renamed from: a */
    private final List<C3240mm<Intent>> f5139a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Intent f5140b;

    /* renamed from: c */
    private final Context f5141c;

    /* renamed from: d */
    private final C2815b0 f5142d;

    /* renamed from: com.yandex.metrica.impl.ob.C$a */
    class C1907a implements C3135km<Context, Intent> {
        C1907a() {
        }

        /* renamed from: a */
        public void mo15578a(Object obj, Object obj2) {
            Context context = (Context) obj;
            Intent intent = (Intent) obj2;
            synchronized (C1906C.this) {
                Intent unused = C1906C.this.f5140b = intent;
                C1906C.this.m6951a(intent);
            }
        }
    }

    public C1906C(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, new C2815b0.C2816a());
    }

    /* renamed from: c */
    public synchronized Intent mo15577c(C3240mm<Intent> mmVar) {
        this.f5139a.add(mmVar);
        return this.f5140b;
    }

    C1906C(Context context, ICommonExecutor iCommonExecutor, C2815b0.C2816a aVar) {
        this.f5139a = new ArrayList();
        this.f5140b = null;
        this.f5141c = context;
        this.f5142d = aVar.mo17207a(new C2249Kl(new C1907a(), iCommonExecutor));
    }

    /* renamed from: a */
    public synchronized void mo15575a() {
        Intent a = this.f5142d.mo17205a(this.f5141c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f5140b = a;
        m6951a(a);
    }

    /* renamed from: b */
    public synchronized void mo15576b() {
        this.f5140b = null;
        this.f5140b = null;
        this.f5142d.mo17206a(this.f5141c);
        m6951a((Intent) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6951a(Intent intent) {
        for (C3240mm<Intent> b : this.f5139a) {
            b.mo15447b(intent);
        }
    }
}
