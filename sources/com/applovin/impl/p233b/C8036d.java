package com.applovin.impl.p233b;

import android.net.Uri;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.impl.b.d */
public class C8036d {

    /* renamed from: a */
    private int f19430a;

    /* renamed from: b */
    private int f19431b;

    /* renamed from: c */
    private Uri f19432c;

    /* renamed from: d */
    private C8041i f19433d;

    /* renamed from: e */
    private final Set<C8044k> f19434e = new HashSet();

    /* renamed from: f */
    private final Map<String, Set<C8044k>> f19435f = CollectionUtils.map();

    private C8036d() {
    }

    /* renamed from: a */
    public static C8036d m23910a(C8622s sVar, C8036d dVar, C8037e eVar, C8490n nVar) {
        C8622s b;
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            if (dVar == null) {
                try {
                    dVar = new C8036d();
                } catch (Throwable th) {
                    nVar.mo57320D();
                    if (!C8626v.m26252a()) {
                        return null;
                    }
                    nVar.mo57320D().mo57819b("VastCompanionAd", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (dVar.f19430a == 0 && dVar.f19431b == 0) {
                int parseInt = StringUtils.parseInt(sVar.mo57797b().get(IabUtils.KEY_WIDTH));
                int parseInt2 = StringUtils.parseInt(sVar.mo57797b().get(IabUtils.KEY_HEIGHT));
                if (parseInt > 0 && parseInt2 > 0) {
                    dVar.f19430a = parseInt;
                    dVar.f19431b = parseInt2;
                }
            }
            dVar.f19433d = C8041i.m23934a(sVar, dVar.f19433d, nVar);
            if (dVar.f19432c == null && (b = sVar.mo57796b("CompanionClickThrough")) != null) {
                String c = b.mo57799c();
                if (StringUtils.isValidString(c)) {
                    dVar.f19432c = Uri.parse(c);
                }
            }
            C8046m.m23957a(sVar.mo57795a("CompanionClickTracking"), dVar.f19434e, eVar, nVar);
            C8046m.m23956a(sVar, dVar.f19435f, eVar, nVar);
            return dVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo55887a() {
        return this.f19432c;
    }

    /* renamed from: b */
    public C8041i mo55888b() {
        return this.f19433d;
    }

    /* renamed from: c */
    public Set<C8044k> mo55889c() {
        return this.f19434e;
    }

    /* renamed from: d */
    public Map<String, Set<C8044k>> mo55890d() {
        return this.f19435f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8036d)) {
            return false;
        }
        C8036d dVar = (C8036d) obj;
        if (this.f19430a != dVar.f19430a || this.f19431b != dVar.f19431b) {
            return false;
        }
        Uri uri = this.f19432c;
        if (uri == null ? dVar.f19432c != null : !uri.equals(dVar.f19432c)) {
            return false;
        }
        C8041i iVar = this.f19433d;
        if (iVar == null ? dVar.f19433d != null : !iVar.equals(dVar.f19433d)) {
            return false;
        }
        Set<C8044k> set = this.f19434e;
        if (set == null ? dVar.f19434e != null : !set.equals(dVar.f19434e)) {
            return false;
        }
        Map<String, Set<C8044k>> map = this.f19435f;
        Map<String, Set<C8044k>> map2 = dVar.f19435f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i = ((this.f19430a * 31) + this.f19431b) * 31;
        Uri uri = this.f19432c;
        int i2 = 0;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C8041i iVar = this.f19433d;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        Set<C8044k> set = this.f19434e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C8044k>> map = this.f19435f;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f19430a + ", height=" + this.f19431b + ", destinationUri=" + this.f19432c + ", nonVideoResource=" + this.f19433d + ", clickTrackers=" + this.f19434e + ", eventTrackers=" + this.f19435f + '}';
    }
}
