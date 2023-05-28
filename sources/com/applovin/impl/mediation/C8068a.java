package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8313a;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8561a;

/* renamed from: com.applovin.impl.mediation.a */
public class C8068a extends C8561a {

    /* renamed from: a */
    private final C8313a f19593a;

    /* renamed from: b */
    private final C8626v f19594b;

    /* renamed from: c */
    private C8069a f19595c;

    /* renamed from: d */
    private C8072c f19596d;

    /* renamed from: e */
    private int f19597e;

    /* renamed from: f */
    private boolean f19598f;

    /* renamed from: com.applovin.impl.mediation.a$a */
    public interface C8069a {
        /* renamed from: a */
        void mo56058a(C8072c cVar);
    }

    C8068a(C8490n nVar) {
        this.f19594b = nVar.mo57320D();
        this.f19593a = nVar.mo57368ai();
    }

    /* renamed from: a */
    public void mo56056a() {
        if (C8626v.m26252a()) {
            this.f19594b.mo57818b("AdActivityObserver", "Cancelling...");
        }
        this.f19593a.mo56834b(this);
        this.f19595c = null;
        this.f19596d = null;
        this.f19597e = 0;
        this.f19598f = false;
    }

    /* renamed from: a */
    public void mo56057a(C8072c cVar, C8069a aVar) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19594b;
            vVar.mo57818b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        mo56056a();
        this.f19595c = aVar;
        this.f19596d = cVar;
        this.f19593a.mo56832a(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f19598f) {
            this.f19598f = true;
        }
        this.f19597e++;
        if (C8626v.m26252a()) {
            this.f19594b.mo57818b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f19597e);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (this.f19598f) {
            this.f19597e--;
            if (C8626v.m26252a()) {
                this.f19594b.mo57818b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f19597e);
            }
            if (this.f19597e <= 0) {
                if (C8626v.m26252a()) {
                    this.f19594b.mo57818b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f19595c != null) {
                    if (C8626v.m26252a()) {
                        this.f19594b.mo57818b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f19595c.mo56058a(this.f19596d);
                }
                mo56056a();
            }
        }
    }
}
