package com.bytedance.sdk.openadsdk.p000b;

import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.b.b */
/* compiled from: AdEventConstants */
public class C0112b {

    /* renamed from: a */
    public static final Set<String> f453a = new HashSet(Arrays.asList(new String[]{Constants.CLICK, Constants.SHOW, "insight_log"}));

    /* renamed from: a */
    public static boolean m465a(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
