package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

public class IronSourceQaProperties {

    /* renamed from: a */
    private static IronSourceQaProperties f12733a;

    /* renamed from: b */
    private static Map<String, String> f12734b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f12733a == null) {
            f12733a = new IronSourceQaProperties();
        }
        return f12733a;
    }

    public static boolean isInitialized() {
        return f12733a != null;
    }

    public Map<String, String> getParameters() {
        return f12734b;
    }

    public void setQaParameter(String str, String str2) {
        if (str != null && str2 != null) {
            f12734b.put(str, str2);
        }
    }
}
