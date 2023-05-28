package com.appnext.core.result;

import com.appnext.core.AppnextAd;
import com.appnext.core.C8874Ad;
import com.appnext.core.C8936p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.result.c */
public interface C8962c {
    /* renamed from: A */
    String mo58486A();

    /* renamed from: B */
    String mo58487B();

    /* renamed from: C */
    C8936p mo58488C();

    /* renamed from: D */
    C8874Ad mo58489D();

    /* renamed from: E */
    C8960a mo58490E();

    JSONObject getConfigParams() throws JSONException;

    String getPlacementId();

    AppnextAd getSelectedAd();

    /* renamed from: z */
    String mo58494z();
}
