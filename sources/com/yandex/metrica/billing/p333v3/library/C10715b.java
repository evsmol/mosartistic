package com.yandex.metrica.billing.p333v3.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.billing.v3.library.b */
class C10715b {

    /* renamed from: a */
    private final Handler f26842a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f26843b;

    /* renamed from: c */
    private final Set<Object> f26844c;

    C10715b(BillingClient billingClient) {
        this(billingClient, new Handler(Looper.getMainLooper()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo64732b(Object obj) {
        this.f26844c.remove(obj);
        if (this.f26844c.size() == 0) {
            this.f26842a.post(new C10714a(this));
        }
    }

    C10715b(BillingClient billingClient, Handler handler) {
        this.f26843b = billingClient;
        this.f26844c = new HashSet();
        this.f26842a = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64731a(Object obj) {
        this.f26844c.add(obj);
    }
}
