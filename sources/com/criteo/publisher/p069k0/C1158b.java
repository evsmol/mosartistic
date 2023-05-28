package com.criteo.publisher.p069k0;

import com.criteo.publisher.C1135h;
import com.criteo.publisher.C1146i;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.model.C1269p;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.model.C1283x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: com.criteo.publisher.k0.b */
/* compiled from: BidRequestSender */
public class C1158b {

    /* renamed from: a */
    private final C1269p f3676a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1283x f3677b;

    /* renamed from: c */
    private final C1146i f3678c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1166g f3679d;

    /* renamed from: e */
    private final Executor f3680e;

    /* renamed from: f */
    private final Map<C1267n, Future<?>> f3681f;

    /* renamed from: g */
    private final Object f3682g = new Object();

    public C1158b(C1269p pVar, C1283x xVar, C1146i iVar, C1166g gVar, Executor executor) {
        this.f3676a = pVar;
        this.f3677b = xVar;
        this.f3678c = iVar;
        this.f3679d = gVar;
        this.f3680e = executor;
        this.f3681f = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public void mo3257a(C1276t tVar) {
        this.f3680e.execute(new C1160b(this, tVar, (C1159a) null));
    }

    /* renamed from: b */
    public void mo3258b(List<C1267n> list, ContextData contextData, C1135h hVar) {
        ArrayList<C1267n> arrayList = new ArrayList<>(list);
        synchronized (this.f3682g) {
            arrayList.removeAll(this.f3681f.keySet());
            if (!arrayList.isEmpty()) {
                FutureTask<Void> a = m5299a(arrayList, contextData, hVar);
                for (C1267n put : arrayList) {
                    this.f3681f.put(put, a);
                }
                try {
                    this.f3680e.execute(a);
                } catch (Throwable th) {
                    if (a != null) {
                        m5301a((List<C1267n>) arrayList);
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    private FutureTask<Void> m5299a(List<C1267n> list, ContextData contextData, C1135h hVar) {
        return new FutureTask<>(new C1159a(new C1161c(this.f3679d, this.f3676a, this.f3678c, list, contextData, hVar), list), (Object) null);
    }

    /* renamed from: com.criteo.publisher.k0.b$a */
    /* compiled from: BidRequestSender */
    class C1159a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1161c f3683a;

        /* renamed from: b */
        final /* synthetic */ List f3684b;

        C1159a(C1161c cVar, List list) {
            this.f3683a = cVar;
            this.f3684b = list;
        }

        public void run() {
            try {
                this.f3683a.run();
            } finally {
                C1158b.this.m5301a((List<C1267n>) this.f3684b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5301a(List<C1267n> list) {
        synchronized (this.f3682g) {
            this.f3681f.keySet().removeAll(list);
        }
    }

    /* renamed from: a */
    public void mo3256a() {
        synchronized (this.f3682g) {
            for (Future<?> cancel : this.f3681f.values()) {
                cancel.cancel(true);
            }
            this.f3681f.clear();
        }
    }

    /* renamed from: com.criteo.publisher.k0.b$b */
    /* compiled from: BidRequestSender */
    private class C1160b extends C1330x {

        /* renamed from: c */
        private final C1276t f3686c;

        /* synthetic */ C1160b(C1158b bVar, C1276t tVar, C1159a aVar) {
            this(tVar);
        }

        private C1160b(C1276t tVar) {
            this.f3686c = tVar;
        }

        /* renamed from: a */
        public void mo3040a() throws IOException {
            this.f3686c.mo3593b(C1158b.this.f3679d.mo3264a(C1158b.this.f3677b.mo3606a()));
        }
    }
}
