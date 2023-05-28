package com.yandex.metrica.billing.p079v4.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.billing.v4.library.b */
public final class C1795b {

    /* renamed from: a */
    private final Set<Object> f4897a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f4898b;

    /* renamed from: c */
    private final Handler f4899c;

    public C1795b(BillingClient billingClient, Handler handler) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(handler, "mainHandler");
        this.f4898b = billingClient;
        this.f4899c = handler;
        this.f4897a = new LinkedHashSet();
    }

    /* renamed from: b */
    public final void mo15225b(Object obj) {
        Intrinsics.checkNotNullParameter(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f4897a.remove(obj);
        if (this.f4897a.size() == 0) {
            this.f4899c.post(new C1794a(this));
        }
    }

    /* renamed from: a */
    public final void mo15224a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f4897a.add(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1795b(BillingClient billingClient, Handler handler, int i) {
        this(billingClient, (i & 2) != 0 ? new Handler(Looper.getMainLooper()) : null);
    }
}
