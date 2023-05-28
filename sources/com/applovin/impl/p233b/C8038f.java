package com.applovin.impl.p233b;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.applovin.impl.b.f */
public enum C8038f {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(C5643c.COLLECT_MODE_FINANCE),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(IronSourceConstants.OFFERWALL_AVAILABLE),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(TTAdConstant.MATE_IS_NULL_CODE),
    MEDIA_FILE_TIMEOUT(TTAdConstant.AD_ID_IS_NULL_CODE),
    MEDIA_FILE_ERROR(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);
    

    /* renamed from: q */
    private final int f19460q;

    private C8038f(int i) {
        this.f19460q = i;
    }

    /* renamed from: a */
    public int mo55902a() {
        return this.f19460q;
    }
}
