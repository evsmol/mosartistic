package com.appodeal.ads.networking.cache;

import com.appodeal.ads.C9698x0;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.networking.cache.a */
public final class C9366a implements C9698x0 {

    /* renamed from: a */
    public final String f23770a;

    /* renamed from: b */
    public final C9529a f23771b;

    public /* synthetic */ C9366a(C9562o oVar) {
        this("config_response", oVar);
    }

    public C9366a(String str, C9562o oVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        this.f23770a = str;
        this.f23771b = oVar;
    }

    /* renamed from: a */
    public final JSONObject mo60574a() {
        try {
            JSONObject component1 = this.f23771b.mo60770a(this.f23770a).component1();
            if (component1 != null) {
                return component1;
            }
            this.f23771b.mo60776c(this.f23770a);
            return null;
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo60575a(JSONObject jSONObject) {
        C9529a aVar = this.f23771b;
        String str = this.f23770a;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value.toString()");
        aVar.mo60772a(Integer.MAX_VALUE, System.currentTimeMillis(), str, jSONObject2);
    }
}
