package com.applovin.impl.mediation.p235b;

import android.app.Activity;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p234a.C8076f;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.b.a */
public class C8110a extends C8401a {

    /* renamed from: a */
    private final List<C8076f> f19744a;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Activity f19745e;

    /* renamed from: com.applovin.impl.mediation.b.a$a */
    public static class C8112a extends C8401a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C8076f f19748a;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final List<C8076f> f19749e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Activity f19750f;

        private C8112a(C8076f fVar, List<C8076f> list, C8490n nVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.mo56151R(), nVar, true);
            this.f19750f = activity;
            this.f19748a = fVar;
            this.f19749e = list;
        }

        public void run() {
            C8626v vVar = this.f21120d;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21120d;
                String str = this.f21119c;
                vVar2.mo57818b(str, "Auto-initing " + this.f19748a + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f21118b.mo57323G().mo56536a(this.f19748a, this.f19750f, new Runnable() {
                public void run() {
                    C8626v unused = C8112a.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8626v d = C8112a.this.f21120d;
                        String b = C8112a.this.f21119c;
                        d.mo57818b(b, "Initialization task for adapter '" + C8112a.this.f19748a.mo56152S() + "' finished");
                    }
                    int indexOf = C8112a.this.f19749e.indexOf(C8112a.this.f19748a);
                    if (indexOf < C8112a.this.f19749e.size() - 1) {
                        C8076f fVar = (C8076f) C8112a.this.f19749e.get(indexOf + 1);
                        C8112a.this.f21118b.mo57337V().mo57229a((C8401a) new C8112a(fVar, C8112a.this.f19749e, C8112a.this.f21118b, C8112a.this.f19750f), C8432o.C8434a.MAIN, fVar.mo56173af());
                        return;
                    }
                    C8626v unused2 = C8112a.this.f21120d;
                    if (C8626v.m26252a()) {
                        C8112a.this.f21120d.mo57818b(C8112a.this.f21119c, "Finished initializing adapters");
                    }
                }
            });
        }
    }

    public C8110a(List<C8076f> list, Activity activity, C8490n nVar) {
        super("TaskAutoInitAdapters", nVar, true);
        this.f19744a = list;
        this.f19745e = activity;
    }

    public void run() {
        try {
            if (this.f19744a.size() > 0) {
                C8626v vVar = this.f21120d;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21120d;
                    String str = this.f21119c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Auto-initing ");
                    sb.append(this.f19744a.size());
                    sb.append(" adapters");
                    sb.append(this.f21118b.mo57330N().mo56529a() ? " in test mode" : "");
                    sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                    vVar2.mo57818b(str, sb.toString());
                }
                if (TextUtils.isEmpty(this.f21118b.mo57405u())) {
                    this.f21118b.mo57385c(AppLovinMediationProvider.MAX);
                } else if (!this.f21118b.mo57389f()) {
                    C8626v.m26258i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f21118b.mo57405u());
                }
                if (this.f19745e == null) {
                    C8626v.m26258i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f21118b.mo57342a(C8379a.f20662Q)).booleanValue()) {
                    C8076f fVar = this.f19744a.get(0);
                    this.f21118b.mo57337V().mo57229a((C8401a) new C8112a(fVar, this.f19744a, this.f21118b, this.f19745e), C8432o.C8434a.MAIN, fVar.mo56173af());
                    return;
                }
                for (final C8076f next : this.f19744a) {
                    this.f21118b.mo57337V().mo57231a((Runnable) new Runnable() {
                        public void run() {
                            C8626v unused = C8110a.this.f21120d;
                            if (C8626v.m26252a()) {
                                C8626v c = C8110a.this.f21120d;
                                String b = C8110a.this.f21119c;
                                c.mo57818b(b, "Auto-initing adapter: " + next);
                            }
                            C8110a.this.f21118b.mo57323G().mo56535a(next, C8110a.this.f19745e);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            C8626v vVar3 = this.f21120d;
            if (C8626v.m26252a()) {
                this.f21120d.mo57819b(this.f21119c, "Failed to auto-init adapters", th);
            }
        }
    }
}
