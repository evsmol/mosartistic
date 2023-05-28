package com.applovin.impl.sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p252ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p252ad.C8349d;
import com.applovin.impl.sdk.p252ad.C8356f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.c */
public class C8378c {

    /* renamed from: a */
    private final C8490n f20641a;

    /* renamed from: b */
    private final C8626v f20642b;

    /* renamed from: c */
    private final Object f20643c = new Object();

    /* renamed from: d */
    private final Map<C8349d, C8629x> f20644d = CollectionUtils.map();

    /* renamed from: e */
    private final Map<C8349d, C8629x> f20645e = CollectionUtils.map();

    C8378c(C8490n nVar) {
        this.f20641a = nVar;
        this.f20642b = nVar.mo57320D();
        for (C8349d next : C8349d.m25020f()) {
            this.f20644d.put(next, new C8629x());
            this.f20645e.put(next, new C8629x());
        }
    }

    /* renamed from: d */
    private C8629x m25188d(C8349d dVar) {
        C8629x xVar;
        synchronized (this.f20643c) {
            xVar = this.f20644d.get(dVar);
            if (xVar == null) {
                xVar = new C8629x();
                this.f20644d.put(dVar, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: e */
    private C8629x m25189e(C8349d dVar) {
        C8629x xVar;
        synchronized (this.f20643c) {
            xVar = this.f20645e.get(dVar);
            if (xVar == null) {
                xVar = new C8629x();
                this.f20645e.put(dVar, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: f */
    private C8629x m25190f(C8349d dVar) {
        synchronized (this.f20643c) {
            C8629x e = m25189e(dVar);
            if (e.mo57826a() > 0) {
                return e;
            }
            C8629x d = m25188d(dVar);
            return d;
        }
    }

    /* renamed from: a */
    public AppLovinAdImpl mo57080a(C8349d dVar) {
        C8356f fVar;
        String str;
        StringBuilder sb;
        String str2;
        C8626v vVar;
        synchronized (this.f20643c) {
            C8629x d = m25188d(dVar);
            if (d.mo57826a() > 0) {
                m25189e(dVar).mo57827a(d.mo57829c());
                fVar = new C8356f(dVar, this.f20641a);
            } else {
                fVar = null;
            }
        }
        boolean a = C8626v.m26252a();
        if (fVar != null) {
            if (a) {
                vVar = this.f20642b;
                str2 = "AdPreloadManager";
                sb = new StringBuilder();
                str = "Retrieved ad of zone ";
            }
            return fVar;
        }
        if (a) {
            vVar = this.f20642b;
            str2 = "AdPreloadManager";
            sb = new StringBuilder();
            str = "Unable to retrieve ad of zone ";
        }
        return fVar;
        sb.append(str);
        sb.append(dVar);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        vVar.mo57818b(str2, sb.toString());
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo57081a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f20643c) {
            m25188d(appLovinAdImpl.getAdZone()).mo57827a(appLovinAdImpl);
            if (C8626v.m26252a()) {
                C8626v vVar = this.f20642b;
                vVar.mo57818b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    /* renamed from: b */
    public AppLovinAdImpl mo57082b(C8349d dVar) {
        AppLovinAdImpl c;
        synchronized (this.f20643c) {
            c = m25190f(dVar).mo57829c();
        }
        return c;
    }

    /* renamed from: c */
    public AppLovinAdBase mo57083c(C8349d dVar) {
        AppLovinAdImpl d;
        synchronized (this.f20643c) {
            d = m25190f(dVar).mo57830d();
        }
        return d;
    }
}
