package com.ironsource.sdk.p147j;

import com.ironsource.sdk.p144g.C4932a;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.j.f */
public interface C4962f extends C4953a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(C4932a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
