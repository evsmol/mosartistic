package com.appodeal.ads;

import com.appodeal.ads.modules.libs.network.AppodealEndpoint;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.l4 */
public final class C9268l4 implements C9255k4 {

    /* renamed from: a */
    public final AppodealEndpoint f23313a;

    public /* synthetic */ C9268l4() {
        this(AppodealEndpoints.INSTANCE);
    }

    public C9268l4(AppodealEndpoint appodealEndpoint) {
        Intrinsics.checkNotNullParameter(appodealEndpoint, "appodealEndpoint");
        this.f23313a = appodealEndpoint;
    }

    /* renamed from: b */
    public final boolean mo60094b() {
        return this.f23313a.popNextEndpoint() != null;
    }
}
