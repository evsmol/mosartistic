package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C1900Bk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bl */
class C1902Bl {

    /* renamed from: a */
    private Runnable f5128a;

    /* renamed from: b */
    private final ICommonExecutor f5129b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3165lk f5130c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2932el f5131d;

    /* renamed from: e */
    private final C3739zk f5132e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1903a f5133f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final List<C3673xl> f5134g;

    /* renamed from: h */
    private final List<C2669Vk> f5135h;

    /* renamed from: i */
    private final C1900Bk.C1901a f5136i;

    /* renamed from: com.yandex.metrica.impl.ob.Bl$a */
    static class C1903a {
        C1903a() {
        }
    }

    C1902Bl(ICommonExecutor iCommonExecutor, C3165lk lkVar, C3739zk zkVar) {
        this(iCommonExecutor, lkVar, zkVar, new C2932el(), new C1903a(), Collections.emptyList(), new C1900Bk.C1901a());
    }

    /* renamed from: a */
    static void m6943a(C1902Bl bl, List list, Throwable th, C3634wl wlVar) {
        bl.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C3595vl) it.next()).mo16229a(th, wlVar);
        }
        for (C3673xl a : bl.f5134g) {
            a.mo16229a(th, wlVar);
        }
    }

    C1902Bl(ICommonExecutor iCommonExecutor, C3165lk lkVar, C3739zk zkVar, C2932el elVar, C1903a aVar, List<C2669Vk> list, C1900Bk.C1901a aVar2) {
        this.f5134g = new ArrayList();
        this.f5129b = iCommonExecutor;
        this.f5130c = lkVar;
        this.f5132e = zkVar;
        this.f5131d = elVar;
        this.f5133f = aVar;
        this.f5135h = list;
        this.f5136i = aVar2;
    }

    /* renamed from: a */
    static void m6942a(C1902Bl bl, List list, C2903dl dlVar, List list2, Activity activity, C2972fl flVar, C1900Bk bk, long j) {
        bl.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C3595vl) it.next()).mo16225a(j, activity, dlVar, list2, flVar, bk);
        }
        for (C3673xl a : bl.f5134g) {
            a.mo16225a(j, activity, dlVar, list2, flVar, bk);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15573a(C3673xl... xlVarArr) {
        this.f5134g.addAll(Arrays.asList(xlVarArr));
    }

    /* renamed from: a */
    static void m6941a(C1902Bl bl, Activity activity, long j) {
        for (C3673xl a : bl.f5134g) {
            a.mo16227a(activity, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15572a(Activity activity, long j, C2972fl flVar, C3634wl wlVar, List<C3595vl> list) {
        boolean z;
        Activity activity2 = activity;
        Iterator<C2669Vk> it = this.f5135h.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo16981a(activity, wlVar)) {
                    z = true;
                    break;
                }
            } else {
                C3634wl wlVar2 = wlVar;
                z = false;
                break;
            }
        }
        WeakReference weakReference = new WeakReference(activity);
        C1900Bk.C1901a aVar = this.f5136i;
        C3739zk zkVar = this.f5132e;
        aVar.getClass();
        C2972fl flVar2 = flVar;
        C1871Al al = new C1871Al(this, weakReference, list, flVar2, wlVar, new C1900Bk(zkVar, flVar2), z);
        Runnable runnable = this.f5128a;
        if (runnable != null) {
            this.f5129b.remove(runnable);
        }
        this.f5128a = al;
        for (C3673xl a : this.f5134g) {
            a.mo16228a(activity, z);
        }
        long j2 = j;
        this.f5129b.executeDelayed(al, j);
    }
}
