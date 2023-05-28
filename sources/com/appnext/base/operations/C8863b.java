package com.appnext.base.operations;

import android.os.Bundle;
import com.appnext.base.operations.C8861a;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8856i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.appnext.base.operations.b */
public class C8863b {

    /* renamed from: eq */
    private static final String f22463eq = "com.appnext.base.operations.imp";

    /* renamed from: er */
    private static volatile C8863b f22464er;

    /* renamed from: es */
    private List<C8861a> f22465es = new ArrayList();

    /* renamed from: aI */
    public static C8863b m26748aI() {
        if (f22464er == null) {
            synchronized (C8863b.class) {
                if (f22464er == null) {
                    f22464er = new C8863b();
                }
            }
        }
        return f22464er;
    }

    private C8863b() {
    }

    /* renamed from: a */
    private static C8861a m26747a(String str, C8838c cVar, Bundle bundle, Object obj) {
        if (cVar == null) {
            return null;
        }
        try {
            Object newInstance = Class.forName(m26746B(str)).getConstructor(new Class[]{C8838c.class, Bundle.class, Object.class}).newInstance(new Object[]{cVar, bundle, obj});
            if (newInstance instanceof C8861a) {
                return (C8861a) newInstance;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo58796a(String str, C8838c cVar, Bundle bundle, Object obj, C8861a.C8862a aVar) {
        if (cVar != null) {
            try {
                C8861a a = m26747a(str, cVar, bundle, obj);
                if (a != null) {
                    synchronized (this) {
                        this.f22465es.add(a);
                    }
                    a.mo58778a(aVar);
                    C8856i aR = C8856i.m26695aR();
                    aR.putLong(cVar.getKey() + C8856i.f22448fy, System.currentTimeMillis());
                    a.mo58780aC();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo58798b(String str, C8838c cVar, Bundle bundle, Object obj) {
        if (cVar != null) {
            try {
                m26747a(str, cVar, (Bundle) null, (Object) null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo58795a(C8861a aVar) {
        synchronized (this) {
            this.f22465es.remove(aVar);
        }
    }

    /* renamed from: aJ */
    public final void mo58797aJ() {
        synchronized (this) {
            Iterator<C8861a> it = this.f22465es.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f22465es.clear();
        }
    }

    /* renamed from: B */
    public static String m26746B(String str) {
        return "com.appnext.base.operations.imp." + str;
    }
}
