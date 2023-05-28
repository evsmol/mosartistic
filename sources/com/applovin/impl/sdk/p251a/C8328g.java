package com.applovin.impl.sdk.p251a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.p233b.C8034b;
import com.applovin.impl.p233b.C8038f;
import com.applovin.impl.p233b.C8040h;
import com.applovin.impl.p233b.C8044k;
import com.applovin.impl.p233b.C8046m;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.a.g */
public class C8328g extends C8315b {

    /* renamed from: h */
    static final /* synthetic */ boolean f20510h = (!C8328g.class.desiredAssertionStatus());

    /* renamed from: i */
    private final C8029a f20511i;

    /* renamed from: j */
    private final AtomicBoolean f20512j = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MediaEvents f20513k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final VastProperties f20514l;

    /* renamed from: m */
    private final AtomicBoolean f20515m = new AtomicBoolean();

    /* renamed from: n */
    private final AtomicBoolean f20516n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f20517o = new AtomicBoolean();

    /* renamed from: p */
    private final AtomicBoolean f20518p = new AtomicBoolean();

    public C8328g(C8029a aVar) {
        super(aVar);
        this.f20511i = aVar;
        this.f20514l = aVar.mo55853i() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) aVar.mo55853i(), true, Position.STANDALONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo56845a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NATIVE, false);
        } catch (Throwable th) {
            C8626v vVar = this.f20485c;
            if (C8626v.m26252a()) {
                this.f20485c.mo57819b(this.f20486d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionContext mo56846a(WebView webView) {
        Set<C8044k> d;
        C8038f fVar;
        if (f20510h || this.f20511i.mo55839aW() != null) {
            ArrayList arrayList = new ArrayList();
            for (C8034b next : this.f20511i.mo55839aW().mo55883a()) {
                List<C8040h> b = next.mo55877b();
                if (!b.isEmpty()) {
                    ArrayList<C8040h> arrayList2 = new ArrayList<>();
                    for (C8040h next2 : b) {
                        if ("omid".equalsIgnoreCase(next2.mo55910a())) {
                            arrayList2.add(next2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        d = next.mo55879d();
                        fVar = C8038f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        C8046m.m23959a(d, fVar, this.f20484b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList<>();
                        for (C8040h b2 : arrayList2) {
                            try {
                                arrayList3.add(new URL(b2.mo55911b()));
                            } catch (Throwable th) {
                                C8626v vVar = this.f20485c;
                                if (C8626v.m26252a()) {
                                    this.f20485c.mo57819b(this.f20486d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String c = next.mo55878c();
                            String a = next.mo55876a();
                            if (!StringUtils.isValidString(c) || StringUtils.isValidString(a)) {
                                for (URL url : arrayList3) {
                                    arrayList.add(StringUtils.isValidString(c) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(a, url, c) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                d = next.mo55879d();
                fVar = C8038f.FAILED_TO_LOAD_RESOURCE;
                C8046m.m23959a(d, fVar, this.f20484b);
            }
            String e = this.f20484b.mo57374ao().mo56874e();
            if (TextUtils.isEmpty(e)) {
                C8626v vVar2 = this.f20485c;
                if (C8626v.m26252a()) {
                    this.f20485c.mo57822e(this.f20486d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f20484b.mo57374ao().mo56873d(), e, arrayList, this.f20511i.getOpenMeasurementContentUrl(), this.f20511i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                C8626v vVar3 = this.f20485c;
                if (!C8626v.m26252a()) {
                    return null;
                }
                this.f20485c.mo57819b(this.f20486d, "Failed to create ad session context", th2);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo56876a(final float f, final boolean z) {
        if (this.f20515m.compareAndSet(false, true)) {
            mo56851a("track started", (Runnable) new Runnable() {
                public void run() {
                    C8328g.this.f20513k.start(f, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo56849a(AdSession adSession) {
        try {
            this.f20513k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            C8626v vVar = this.f20485c;
            if (C8626v.m26252a()) {
                this.f20485c.mo57819b(this.f20486d, "Failed to create media events", th);
            }
        }
    }

    /* renamed from: a */
    public void mo56877a(final boolean z) {
        mo56851a("track volume changed", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20513k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    /* renamed from: c */
    public void mo56854c() {
        mo56851a("track loaded", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20489g.loaded(C8328g.this.f20514l);
            }
        });
    }

    /* renamed from: f */
    public void mo56878f() {
        if (this.f20516n.compareAndSet(false, true)) {
            mo56851a("track first quartile", (Runnable) new Runnable() {
                public void run() {
                    C8328g.this.f20513k.firstQuartile();
                }
            });
        }
    }

    /* renamed from: g */
    public void mo56879g() {
        if (this.f20517o.compareAndSet(false, true)) {
            mo56851a("track midpoint", (Runnable) new Runnable() {
                public void run() {
                    C8328g.this.f20513k.midpoint();
                }
            });
        }
    }

    /* renamed from: h */
    public void mo56880h() {
        if (this.f20518p.compareAndSet(false, true)) {
            mo56851a("track third quartile", (Runnable) new Runnable() {
                public void run() {
                    C8328g.this.f20513k.thirdQuartile();
                }
            });
        }
    }

    /* renamed from: i */
    public void mo56881i() {
        mo56851a("track completed", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20513k.complete();
            }
        });
    }

    /* renamed from: j */
    public void mo56882j() {
        mo56851a("track paused", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20513k.pause();
            }
        });
    }

    /* renamed from: k */
    public void mo56883k() {
        mo56851a("track resumed", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20513k.resume();
            }
        });
    }

    /* renamed from: l */
    public void mo56884l() {
        if (this.f20512j.compareAndSet(false, true)) {
            mo56851a("buffer started", (Runnable) new Runnable() {
                public void run() {
                    C8328g.this.f20513k.bufferStart();
                }
            });
        }
    }

    /* renamed from: m */
    public void mo56885m() {
        if (this.f20512j.compareAndSet(true, false)) {
            mo56851a("buffer finished", (Runnable) new Runnable() {
                public void run() {
                    C8328g.this.f20513k.bufferFinish();
                }
            });
        }
    }

    /* renamed from: n */
    public void mo56886n() {
        mo56851a("track skipped", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20513k.skipped();
            }
        });
    }

    /* renamed from: o */
    public void mo56887o() {
        mo56851a("track clicked", (Runnable) new Runnable() {
            public void run() {
                C8328g.this.f20513k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
