package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ll */
public class C2286Ll<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f6122a;

    /* renamed from: b */
    private final ICommonExecutor f6123b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C1973E1<T>> f6124c = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.Ll$a */
    class C2287a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1973E1 f6125a;

        C2287a(C1973E1 e1) {
            this.f6125a = e1;
        }

        public void run() {
            synchronized (C2286Ll.this) {
                Object a = C2286Ll.this.f6122a;
                if (a == null) {
                    C2286Ll.this.f6124c.add(this.f6125a);
                } else {
                    this.f6125a.mo15646b(a);
                }
            }
        }
    }

    public C2286Ll(ICommonExecutor iCommonExecutor) {
        this.f6123b = iCommonExecutor;
    }

    /* renamed from: a */
    public void mo16231a(C1973E1<T> e1) {
        this.f6123b.execute(new C2287a(e1));
    }

    /* renamed from: a */
    public synchronized void mo16232a(T t) {
        this.f6122a = t;
        for (C1973E1<T> b : this.f6124c) {
            b.mo15646b(t);
        }
        this.f6124c.clear();
    }
}
