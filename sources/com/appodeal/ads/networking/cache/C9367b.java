package com.appodeal.ads.networking.cache;

import com.appodeal.ads.C9698x0;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9529a;
import com.appodeal.ads.storage.C9562o;
import com.appodeal.ads.utils.Log;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.networking.cache.b */
public final class C9367b implements C9698x0 {

    /* renamed from: a */
    public final String f23772a;

    /* renamed from: b */
    public final C9529a f23773b;

    public C9367b(String str, C9562o oVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        this.f23772a = str;
        this.f23773b = oVar;
    }

    /* renamed from: a */
    public final JSONObject mo60574a() {
        try {
            Triple<JSONObject, Long, Integer> a = this.f23773b.mo60770a(this.f23772a);
            JSONObject component1 = a.component1();
            long longValue = a.component2().longValue();
            int intValue = a.component3().intValue();
            if (component1 != null) {
                if (System.currentTimeMillis() - longValue <= ((long) intValue)) {
                    return component1;
                }
            }
            this.f23773b.mo60776c(this.f23772a);
            return null;
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo60575a(JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        int optInt = jSONObject.optInt("wst", Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD);
        C9529a aVar = this.f23773b;
        String str = this.f23772a;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value.toString()");
        aVar.mo60772a(optInt, currentTimeMillis, str, jSONObject2);
    }
}
