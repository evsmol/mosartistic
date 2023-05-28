package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.p082ob.C3364q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.p */
public class C3330p implements C3364q.C3366b {

    /* renamed from: a */
    private final Set<C3332b> f8540a = new HashSet();

    /* renamed from: b */
    private final ICommonExecutor f8541b;

    /* renamed from: com.yandex.metrica.impl.ob.p$a */
    class C3331a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f8542a;

        C3331a(Activity activity) {
            this.f8542a = activity;
        }

        public void run() {
            C3330p.this.mo17922a(this.f8542a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.p$b */
    public interface C3332b {
        /* renamed from: a */
        void mo17570a(Activity activity);
    }

    public C3330p(C3364q qVar, ICommonExecutor iCommonExecutor) {
        this.f8541b = iCommonExecutor;
        qVar.mo18056a((C3364q.C3366b) this, new C3364q.C3365a[0]);
    }

    /* renamed from: a */
    public synchronized void mo17923a(C3332b bVar) {
        this.f8540a.add(bVar);
    }

    /* renamed from: a */
    public void mo17922a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f8540a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C3332b) it.next()).mo17570a(activity);
        }
    }

    /* renamed from: a */
    public void mo17137a(Activity activity, C3364q.C3365a aVar) {
        this.f8541b.execute(new C3331a(activity));
    }
}
