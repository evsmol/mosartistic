package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.data.UserPersonalData;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.m5 */
public final class C9280m5 extends C9234j4 implements UserPersonalData {

    /* renamed from: c */
    public static final C9280m5 f23344c = new C9280m5();

    public final JSONObject getCachedToken() {
        return C9700x2.m28512f();
    }

    public final JSONObject getExtraData() {
        return ExtraData.INSTANCE.asJson();
    }

    public final boolean wasAdIdGenerated() {
        return C9700x2.m28514h();
    }
}
