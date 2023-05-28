package com.explorestack.iab.mraid;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.explorestack.iab.mraid.b */
public class C1356b {

    /* renamed from: a */
    public final List<String> f4166a;

    public C1356b(List<String> list) {
        this.f4166a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1356b(String[] strArr) {
        this((List<String>) strArr != null ? Arrays.asList(strArr) : null);
    }

    /* renamed from: a */
    public boolean mo3883a() {
        MraidLog.m5985d("MRAIDNativeFeatureManager", "isCalendarSupported: false (deprecated)");
        return false;
    }

    /* renamed from: b */
    public boolean mo3884b() {
        List<String> list = this.f4166a;
        boolean z = list != null && list.contains("inlineVideo");
        MraidLog.m5985d("MRAIDNativeFeatureManager", "isInlineVideoSupported " + z);
        return z;
    }

    /* renamed from: c */
    public boolean mo3885c() {
        MraidLog.m5985d("MRAIDNativeFeatureManager", "isSmsSupported: false (deprecated)");
        return false;
    }

    /* renamed from: d */
    public boolean mo3886d() {
        MraidLog.m5985d("MRAIDNativeFeatureManager", "isStorePictureSupported: false (deprecated)");
        return false;
    }

    /* renamed from: e */
    public boolean mo3887e() {
        MraidLog.m5985d("MRAIDNativeFeatureManager", "isTelSupported: false (deprecated)");
        return false;
    }
}
