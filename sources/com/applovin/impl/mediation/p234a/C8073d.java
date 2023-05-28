package com.applovin.impl.mediation.p234a;

import com.applovin.impl.mediation.C8241g;
import com.applovin.impl.sdk.C8360b;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.d */
public class C8073d extends C8075e implements C8360b.C8362a {

    /* renamed from: c */
    private final AtomicBoolean f19612c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicBoolean f19613d = new AtomicBoolean();

    /* renamed from: e */
    private C8360b f19614e;

    /* renamed from: f */
    private WeakReference<C8074a> f19615f = new WeakReference<>((Object) null);

    /* renamed from: com.applovin.impl.mediation.a.d$a */
    public interface C8074a {
        void onAdExpired(C8073d dVar);
    }

    private C8073d(C8073d dVar, C8241g gVar) {
        super(dVar.mo56168aa(), dVar.mo56150Q(), dVar.mo56149P(), gVar, dVar.f19617b);
    }

    public C8073d(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
        super(map, jSONObject, jSONObject2, (C8241g) null, nVar);
    }

    /* renamed from: a */
    private void m24088a(boolean z) {
        C8360b bVar = this.f19614e;
        if (bVar != null) {
            bVar.mo57052a();
            this.f19614e = null;
        }
        if (z) {
            this.f19615f.clear();
        }
    }

    /* renamed from: A */
    public String mo56130A() {
        return BundleUtils.getString("template", "", mo56169ab());
    }

    /* renamed from: B */
    public boolean mo56131B() {
        return mo56177b("inacc", (Boolean) this.f19617b.mo57342a(C8379a.f20668W)).booleanValue();
    }

    /* renamed from: C */
    public long mo56132C() {
        long b = mo56176b("ad_expiration_ms", -1);
        return b >= 0 ? b : mo56162a("ad_expiration_ms", ((Long) this.f19617b.mo57342a(C8379a.f20649D)).longValue());
    }

    /* renamed from: D */
    public boolean mo56133D() {
        return this.f19599a == null;
    }

    /* renamed from: E */
    public AtomicBoolean mo56134E() {
        return this.f19612c;
    }

    /* renamed from: F */
    public AtomicBoolean mo56135F() {
        return this.f19613d;
    }

    /* renamed from: G */
    public void mo56136G() {
        m24088a(true);
    }

    /* renamed from: a */
    public C8070a mo56059a(C8241g gVar) {
        return new C8073d(this, gVar);
    }

    /* renamed from: a */
    public void mo56137a(C8074a aVar) {
        if (!this.f19612c.get() && this.f19614e == null) {
            C8360b bVar = new C8360b(this.f19617b, this);
            this.f19614e = bVar;
            bVar.mo57053a((C8070a) this);
            this.f19615f = new WeakReference<>(aVar);
        }
    }

    /* renamed from: a */
    public void mo56138a(MaxNativeAdView maxNativeAdView) {
        this.f19599a.mo56557a(maxNativeAdView);
    }

    public void onAdExpired() {
        if (getNativeAd() != null) {
            getNativeAd().setExpired();
        }
        m24088a(false);
        C8074a aVar = (C8074a) this.f19615f.get();
        if (aVar != null) {
            aVar.onAdExpired(this);
            this.f19615f.clear();
        }
    }

    /* renamed from: z */
    public MaxNativeAdView mo56113z() {
        return this.f19599a.mo56561c();
    }
}
