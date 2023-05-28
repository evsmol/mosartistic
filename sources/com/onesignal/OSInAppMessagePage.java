package com.onesignal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u0003R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000f"}, mo38199d2 = {"Lcom/onesignal/OSInAppMessagePage;", "", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "pageIndex", "getPageIndex", "setPageIndex", "toJSONObject", "onesignal_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* compiled from: OSInAppMessagePage.kt */
public class OSInAppMessagePage {
    private String pageId;
    private String pageIndex;

    public OSInAppMessagePage(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "jsonObject");
        this.pageId = jSONObject.optString("pageId", (String) null);
        this.pageIndex = jSONObject.optString("pageIndex", (String) null);
    }

    public final String getPageId() {
        return this.pageId;
    }
}
