package com.bytedance.sdk.openadsdk.core.p026j.p027a;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a */
/* compiled from: VastErrorCode */
public enum C0519a {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);
    

    /* renamed from: h */
    private final int f1968h;

    private C0519a(int i) {
        this.f1968h = i;
    }

    /* renamed from: a */
    public String mo1747a() {
        return String.valueOf(this.f1968h);
    }
}
