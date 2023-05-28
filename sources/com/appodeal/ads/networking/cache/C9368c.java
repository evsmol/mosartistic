package com.appodeal.ads.networking.cache;

import com.appodeal.ads.C9698x0;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.networking.cache.c */
public final class C9368c implements C9698x0 {

    /* renamed from: a */
    public final String f23774a;

    /* renamed from: b */
    public final C9529a f23775b;

    public /* synthetic */ C9368c(C9529a aVar) {
        this("init_response", aVar);
    }

    public C9368c(String str, C9529a aVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(aVar, "keyValueStorage");
        this.f23774a = str;
        this.f23775b = aVar;
    }

    /* renamed from: a */
    public final JSONObject mo60574a() {
        try {
            JSONObject component1 = this.f23775b.mo60770a(this.f23774a).component1();
            if (component1 != null) {
                return component1;
            }
            this.f23775b.mo60776c(this.f23774a);
            return null;
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo60575a(JSONObject jSONObject) {
        C9529a aVar = this.f23775b;
        String str = this.f23774a;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value.toString()");
        aVar.mo60772a(Integer.MAX_VALUE, System.currentTimeMillis(), str, jSONObject2);
    }
}
