package com.explorestack.iab.vast.processor.url;

import android.os.Bundle;
import android.text.TextUtils;
import com.explorestack.iab.vast.VastLog;

/* renamed from: com.explorestack.iab.vast.processor.url.a */
public class C1472a implements UrlProcessor {
    public String prepare(String str, Bundle bundle) {
        int i;
        if (!TextUtils.isEmpty(str) && bundle != null && bundle.containsKey("params_error_code") && (i = bundle.getInt("params_error_code", -1)) > -1) {
            VastLog.m6354d("VastAdUrlProcessor", String.format("Before prepare url: %s", new Object[]{str}));
            if (str.contains("[ERRORCODE]")) {
                str = str.replace("[ERRORCODE]", String.valueOf(i));
            }
            if (str.contains("%5BERRORCODE%5D")) {
                str = str.replace("%5BERRORCODE%5D", String.valueOf(i));
            }
            VastLog.m6354d("VastAdUrlProcessor", String.format("After prepare url: %s", new Object[]{str}));
        }
        return str;
    }
}
