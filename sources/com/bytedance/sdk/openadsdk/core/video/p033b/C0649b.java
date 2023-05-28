package com.bytedance.sdk.openadsdk.core.video.p033b;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.b */
/* compiled from: PlayableEvent */
public class C0649b {
    /* renamed from: a */
    public static void m3124a(Context context, C0477n nVar) {
        if (C0480p.m2190a(nVar)) {
            C0136e.m629e(context, nVar, "playable_preload", "preload_start", (Map<String, Object>) null);
        }
    }

    /* renamed from: a */
    public static void m3126a(Context context, C0477n nVar, long j, long j2) {
        if (nVar == null) {
            return;
        }
        if (C0480p.m2198i(nVar) || C0480p.m2190a(nVar)) {
            HashMap hashMap = new HashMap();
            hashMap.put("loadzip_success_time", Long.valueOf(j));
            hashMap.put("unzip_success_time", Long.valueOf(j2));
            C0136e.m629e(context, nVar, "playable_preload", "preload_success", (Map<String, Object>) hashMap);
        }
    }

    /* renamed from: a */
    public static void m3125a(Context context, C0477n nVar, int i, String str) {
        if (nVar == null) {
            return;
        }
        if (C0480p.m2198i(nVar) || C0480p.m2190a(nVar)) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", Integer.valueOf(i));
            hashMap.put("error_reason", str);
            C0136e.m629e(context, nVar, "playable_preload", "preload_fail", (Map<String, Object>) hashMap);
        }
    }
}
