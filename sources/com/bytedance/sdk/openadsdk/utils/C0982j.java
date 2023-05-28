package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.utils.j */
/* compiled from: NetUtils */
public class C0982j {
    /* renamed from: a */
    public static void m4548a(SSWebView sSWebView, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        sSWebView.mo64300a(str, (Map<String, String>) hashMap);
    }
}
