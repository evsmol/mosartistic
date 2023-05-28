package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.q0 */
class C6413q0<T> {

    /* renamed from: a */
    private final List<Callable<T>> f13771a = new ArrayList();

    /* renamed from: b */
    private boolean f13772b = false;

    /* renamed from: com.adcolony.sdk.q0$a */
    interface C6414a<T> extends Callable<T> {
        /* renamed from: a */
        T mo50975a();
    }

    C6413q0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50973a(Callable<T> callable) {
        if (!this.f13772b) {
            this.f13771a.add(callable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50974b() {
        return this.f13771a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo50971a() {
        return mo50972a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo50972a(long j) {
        List<Future<T>> list;
        this.f13772b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f13771a.size());
        ArrayList arrayList2 = new ArrayList();
        if (j > 0) {
            try {
                list = newFixedThreadPool.invokeAll(this.f13771a, j, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        } else {
            list = newFixedThreadPool.invokeAll(this.f13771a);
        }
        arrayList2.addAll(list);
        newFixedThreadPool.shutdownNow();
        for (int i = 0; i < arrayList2.size(); i++) {
            Future future = (Future) arrayList2.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f13771a.get(i) instanceof C6414a) {
                arrayList.add(((C6414a) this.f13771a.get(i)).mo50975a());
            }
        }
        return arrayList;
    }
}
