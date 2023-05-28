package com.appodeal.ads;

import com.appodeal.ads.C9258l;
import com.appodeal.ads.api.Stats;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.networking.binders.C9336b;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.waterfall_filter.C9692a;
import com.appodeal.ads.waterfall_filter.C9695d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.r */
public abstract class C9420r<AdObjectType extends C9258l> {

    /* renamed from: A */
    public boolean f23877A = false;

    /* renamed from: B */
    public boolean f23878B = false;

    /* renamed from: C */
    public boolean f23879C = false;

    /* renamed from: D */
    public boolean f23880D = false;

    /* renamed from: E */
    public boolean f23881E = false;

    /* renamed from: F */
    public boolean f23882F = false;

    /* renamed from: G */
    public JSONObject f23883G;

    /* renamed from: H */
    public C9420r<AdObjectType> f23884H;

    /* renamed from: I */
    public final C9421a f23885I = new C9421a();

    /* renamed from: a */
    public ArrayList f23886a = new ArrayList(0);

    /* renamed from: b */
    public ArrayList f23887b = new ArrayList(0);

    /* renamed from: c */
    public final CopyOnWriteArrayList f23888c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final CopyOnWriteArrayList f23889d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public final CopyOnWriteArrayList f23890e = new CopyOnWriteArrayList();

    /* renamed from: f */
    public final CopyOnWriteArrayList f23891f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public final CopyOnWriteArrayList f23892g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public boolean f23893h;

    /* renamed from: i */
    public boolean f23894i;

    /* renamed from: j */
    public String f23895j;

    /* renamed from: k */
    public Long f23896k = null;

    /* renamed from: l */
    public C9336b.C9337a.C9338a f23897l;

    /* renamed from: m */
    public long f23898m = 0;

    /* renamed from: n */
    public long f23899n = 0;

    /* renamed from: o */
    public long f23900o = 0;

    /* renamed from: p */
    public final AtomicLong f23901p = new AtomicLong(0);

    /* renamed from: q */
    public final HashMap f23902q = new HashMap();

    /* renamed from: r */
    public final String f23903r = UUID.randomUUID().toString();

    /* renamed from: s */
    public AdObjectType f23904s;

    /* renamed from: t */
    public double f23905t;

    /* renamed from: u */
    public boolean f23906u = false;

    /* renamed from: v */
    public boolean f23907v = false;

    /* renamed from: w */
    public boolean f23908w = false;

    /* renamed from: x */
    public boolean f23909x = false;

    /* renamed from: y */
    public boolean f23910y = false;

    /* renamed from: z */
    public boolean f23911z = false;

    /* renamed from: com.appodeal.ads.r$a */
    public class C9421a extends C9565t<AdObjectType> {
    }

    public C9420r(C9464s sVar) {
        if (sVar != null) {
            this.f23893h = sVar.mo60714b();
            this.f23894i = sVar.mo60715c();
        }
    }

    /* renamed from: a */
    public final int mo60592a() {
        return this.f23887b.size() + this.f23886a.size();
    }

    /* renamed from: a */
    public final JSONObject mo60594a(int i) {
        if (i < this.f23886a.size()) {
            return (JSONObject) this.f23886a.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final JSONObject mo60595a(int i, boolean z, boolean z2) {
        JSONObject jSONObject;
        ArrayList arrayList;
        if (!z || this.f23887b.size() <= i) {
            if (this.f23886a.size() > i) {
                jSONObject = (JSONObject) this.f23886a.get(i);
                if (!this.f23894i) {
                    arrayList = this.f23886a;
                }
            } else {
                jSONObject = null;
            }
            if (z2 && !this.f23894i) {
                this.f23886a.clear();
                this.f23887b.clear();
            }
            return jSONObject;
        }
        jSONObject = (JSONObject) this.f23887b.get(i);
        if (!this.f23894i) {
            arrayList = this.f23887b;
        }
        this.f23886a.clear();
        this.f23887b.clear();
        return jSONObject;
        arrayList.remove(i);
        this.f23886a.clear();
        this.f23887b.clear();
        return jSONObject;
    }

    /* renamed from: a */
    public void mo60596a(Stats.Builder builder) {
    }

    /* renamed from: a */
    public final void mo60597a(C9162d0 d0Var) {
        this.f23892g.add(d0Var);
    }

    /* renamed from: a */
    public final void mo60598a(AdObjectType adobjecttype) {
        this.f23890e.add(adobjecttype);
    }

    /* renamed from: a */
    public final void mo60600a(C9258l lVar, String str, Object obj) {
        if (str != null && obj != null) {
            str = "(" + obj + ") " + str;
        } else if (str == null) {
            str = "(network not provided any appropriate text or code)";
        }
        mo60599a(lVar, str);
    }

    /* renamed from: a */
    public final void mo60601a(C9336b.C9337a.C9338a aVar) {
        this.f23897l = aVar;
    }

    /* renamed from: a */
    public final void mo60603a(Long l) {
        this.f23896k = l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r5 == false) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60605a(boolean r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.f23908w
            if (r0 != 0) goto L_0x0015
            if (r5 == 0) goto L_0x0015
            java.util.concurrent.atomic.AtomicLong r6 = r4.f23901p
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r6.compareAndSet(r2, r0)
            r6 = 0
        L_0x0012:
            r4.f23909x = r6
            goto L_0x001a
        L_0x0015:
            if (r0 == 0) goto L_0x001a
            if (r5 != 0) goto L_0x001a
            goto L_0x0012
        L_0x001a:
            r4.f23908w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9420r.mo60605a(boolean, boolean):void");
    }

    /* renamed from: a */
    public final boolean mo60606a(AdObjectType adobjecttype, C9490g gVar, AdType adType) {
        try {
            if (!adobjecttype.mo60103f()) {
                return true;
            }
            int i = 0;
            boolean z = true;
            while (i < adobjecttype.f23271e.size()) {
                String str = (String) adobjecttype.f23271e.get(i);
                if (!this.f23902q.containsKey(str)) {
                    return true;
                }
                C9258l lVar = (C9258l) this.f23902q.get(str);
                if (lVar == null || gVar.mo60739a(C9148b.f22956b.f22957a.getApplicationContext(), adType, lVar.f23269c.getEcpm())) {
                    i++;
                    z = false;
                } else {
                    String id = lVar.f23269c.getId();
                    try {
                        Iterator it = this.f23902q.values().iterator();
                        while (it.hasNext()) {
                            if (((C9258l) it.next()).f23269c.getId().equals(id)) {
                                it.remove();
                            }
                        }
                    } catch (Exception e) {
                        Log.log(e);
                    }
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            Log.log(e2);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo60607b(C9162d0 d0Var) {
        this.f23892g.remove(d0Var);
    }

    /* renamed from: b */
    public final void mo60608b(AdObjectType adobjecttype) {
        if (adobjecttype != null && !this.f23888c.contains(adobjecttype)) {
            this.f23888c.add(adobjecttype);
        }
    }

    /* renamed from: b */
    public final void mo60609b(String str) {
        this.f23895j = str;
    }

    /* renamed from: b */
    public final boolean mo60610b() {
        return !this.f23893h && ((!this.f23906u && !mo60630u()) || this.f23879C);
    }

    /* renamed from: c */
    public final void mo60611c() {
        if (this.f23878B) {
            this.f23886a.clear();
            this.f23887b.clear();
            this.f23890e.clear();
            this.f23888c.clear();
            this.f23889d.clear();
            this.f23892g.clear();
            this.f23891f.clear();
            this.f23881E = true;
            AdObjectType adobjecttype = this.f23904s;
            if (adobjecttype != null) {
                adobjecttype.mo60107k();
                this.f23904s = null;
                this.f23885I.f24256a = null;
                this.f23906u = false;
                this.f23907v = false;
            }
            try {
                Iterator it = this.f23902q.values().iterator();
                while (it.hasNext()) {
                    C9258l lVar = (C9258l) it.next();
                    if (lVar != null) {
                        lVar.mo60107k();
                    }
                    it.remove();
                }
            } catch (Exception e) {
                Log.log(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo60612c(AdObjectType adobjecttype) {
        if (!this.f23889d.contains(adobjecttype)) {
            this.f23889d.add(adobjecttype);
        }
    }

    /* renamed from: d */
    public final C9336b.C9337a.C9338a mo60613d() {
        return this.f23897l;
    }

    /* renamed from: d */
    public final void mo60614d(C9258l lVar) {
        if (lVar != null) {
            Iterator it = this.f23888c.iterator();
            while (it.hasNext()) {
                C9258l lVar2 = (C9258l) it.next();
                if (lVar2.f23269c.getId().equals(lVar.f23269c.getId())) {
                    this.f23888c.remove(lVar2);
                    return;
                }
            }
            this.f23892g.remove(lVar);
        }
    }

    /* renamed from: e */
    public final long mo60615e() {
        return this.f23899n;
    }

    /* renamed from: e */
    public abstract void mo60092e(AdObjectType adobjecttype);

    /* renamed from: f */
    public final long mo60616f() {
        return this.f23900o;
    }

    /* renamed from: g */
    public final String mo60617g() {
        return this.f23903r;
    }

    /* renamed from: h */
    public final AdObjectType mo60618h() {
        return this.f23904s;
    }

    /* renamed from: i */
    public final HashMap mo60619i() {
        return this.f23902q;
    }

    /* renamed from: j */
    public final List<JSONObject> mo60620j() {
        return this.f23887b;
    }

    /* renamed from: k */
    public final List<JSONObject> mo60621k() {
        return this.f23886a;
    }

    /* renamed from: l */
    public final Long mo60622l() {
        return this.f23896k;
    }

    /* renamed from: m */
    public final long mo60623m() {
        return this.f23898m;
    }

    /* renamed from: n */
    public abstract AdType mo60093n();

    /* renamed from: o */
    public final String mo60624o() {
        return this.f23895j;
    }

    /* renamed from: p */
    public final boolean mo60625p() {
        return this.f23906u;
    }

    /* renamed from: q */
    public final boolean mo60626q() {
        return this.f23893h;
    }

    /* renamed from: r */
    public final boolean mo60627r() {
        return this.f23882F;
    }

    /* renamed from: s */
    public final boolean mo60628s() {
        return this.f23911z;
    }

    /* renamed from: t */
    public final boolean mo60629t() {
        return this.f23894i;
    }

    /* renamed from: u */
    public final boolean mo60630u() {
        return this.f23908w && System.currentTimeMillis() - this.f23901p.get() <= 120000;
    }

    /* renamed from: v */
    public final boolean mo60631v() {
        return !this.f23879C && !this.f23906u && this.f23907v;
    }

    /* renamed from: w */
    public final Stats.Builder mo60632w() {
        Stats.Builder newBuilder = Stats.newBuilder();
        newBuilder.setStart(this.f23901p.get());
        newBuilder.setSuccessful(this.f23906u || this.f23907v);
        newBuilder.setCompleted(this.f23909x);
        long j = 0;
        Iterator it = this.f23892g.iterator();
        while (it.hasNext()) {
            C9191f5 f5Var = (C9191f5) it.next();
            if (f5Var.getRequestResult() == null) {
                LoadingError loadingError = LoadingError.Canceled;
                if (f5Var.getRequestResult() == null) {
                    f5Var.mo59874a(loadingError != null ? loadingError.getRequestResult() : C9173e0.Exception);
                    f5Var.mo59898a(System.currentTimeMillis());
                }
            }
            newBuilder.addAdUnit(f5Var.mo59897a());
            j = Math.max(j, f5Var.mo59900c());
        }
        newBuilder.setFinish(j);
        mo60596a(newBuilder);
        return newBuilder;
    }

    /* renamed from: x */
    public final Long mo60633x() {
        Long l = this.f23896k;
        return Long.valueOf(l == null ? -1 : l.longValue());
    }

    /* renamed from: y */
    public final void mo60634y() {
        this.f23879C = false;
        this.f23878B = false;
        this.f23907v = false;
        this.f23906u = false;
        this.f23910y = false;
        this.f23877A = false;
        this.f23880D = false;
        this.f23911z = false;
    }

    /* renamed from: z */
    public final void mo60635z() {
        mo60605a(true, false);
    }

    /* renamed from: a */
    public final void mo60602a(C9692a aVar) {
        C9695d dVar = aVar.f24523e;
        this.f23886a = dVar.f24531b;
        this.f23887b = dVar.f24530a;
    }

    /* renamed from: a */
    public final AdObjectType mo60593a(String str) {
        if (str == null || !this.f23902q.containsKey(str)) {
            return this.f23904s;
        }
        return (C9258l) this.f23902q.get(str);
    }

    /* renamed from: a */
    public final void mo60599a(C9258l lVar, String str) {
        if (lVar != null && lVar.getRequestResult() != C9173e0.TimeOutReached && !this.f23882F && !this.f23879C) {
            Log.log(mo60093n().getDisplayName(), LogConstants.EVENT_NETWORK_ERROR, String.format("%s - %s", new Object[]{C9326n5.m27531a(lVar.getStatus()), str}));
        }
    }

    /* renamed from: a */
    public final void mo60604a(JSONObject jSONObject) {
        this.f23883G = jSONObject;
        if (jSONObject != null) {
            this.f23886a.add(jSONObject);
        }
    }
}
