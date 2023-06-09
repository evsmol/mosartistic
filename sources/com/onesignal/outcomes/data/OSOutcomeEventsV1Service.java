package com.onesignal.outcomes.data;

import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalApiResponseHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo38199d2 = {"Lcom/onesignal/outcomes/data/OSOutcomeEventsV1Service;", "Lcom/onesignal/outcomes/data/OSOutcomeEventsClient;", "client", "Lcom/onesignal/OneSignalAPIClient;", "(Lcom/onesignal/OneSignalAPIClient;)V", "sendOutcomeEvent", "", "jsonObject", "Lorg/json/JSONObject;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "onesignal_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* compiled from: OSOutcomeEventsV1Service.kt */
public final class OSOutcomeEventsV1Service extends OSOutcomeEventsClient {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OSOutcomeEventsV1Service(OneSignalAPIClient oneSignalAPIClient) {
        super(oneSignalAPIClient);
        Intrinsics.checkNotNullParameter(oneSignalAPIClient, "client");
    }

    public void sendOutcomeEvent(JSONObject jSONObject, OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        Intrinsics.checkNotNullParameter(oneSignalApiResponseHandler, "responseHandler");
        getClient().post("outcomes/measure", jSONObject, oneSignalApiResponseHandler);
    }
}
