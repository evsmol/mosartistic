package com.bytedance.sdk.openadsdk.component.p008c;

import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0482r;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0794a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.c.a */
/* compiled from: TTAppOpenAdReport */
public class C0251a {
    /* renamed from: a */
    public static void m977a(final int i, final int i2) {
        C0796b.m3985a().mo2604a((C0793a) new C0793a() {
            /* renamed from: a */
            public C0794a mo322a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return C0795b.m3955b().mo2579a("openad_load_ad_timeout").mo2581b(jSONObject.toString());
            }
        });
    }

    /* renamed from: a */
    public static void m979a(C0477n nVar, int i, int i2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C0477n.m2012c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("skip_time", Integer.valueOf(i));
        hashMap.put("skip_show_time", Integer.valueOf(i2));
        hashMap.put("total_time", Float.valueOf(f));
        C0136e.m623b(nVar, "skip", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m982a(C0477n nVar, long j, float f, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C0477n.m2012c(nVar) ? "video_normal_ad" : "image_normal_ad");
        if (z) {
            hashMap.put("video_duration", Float.valueOf(f));
            hashMap.put("video_percent", Integer.valueOf((int) (((((double) j) * 1.0d) / 10.0d) / ((double) f))));
        } else {
            hashMap.put("image_duration", Float.valueOf(f));
        }
        C0136e.m623b(nVar, "destroy", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m978a(C0477n nVar) {
        C0136e.m623b(nVar, "cache_expire", (Map<String, Object>) null);
    }

    /* renamed from: b */
    public static void m984b(C0477n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C0477n.m2012c(nVar) ? "video_normal_ad" : "image_normal_ad");
        C0136e.m623b(nVar, "cache_loss", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m983a(C0477n nVar, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("order", Integer.valueOf(z ? 1 : 2));
        C0136e.m609a(nVar, "download_image_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m985b(C0477n nVar, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("size", Long.valueOf(nVar.mo1330J().mo62913e()));
        hashMap.put("video_duration", Double.valueOf(nVar.mo1330J().mo62916f()));
        hashMap.put("order", Integer.valueOf(z ? 1 : 2));
        C0136e.m609a(nVar, "download_video_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m980a(C0477n nVar, int i, C0482r rVar) {
        long j;
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C0477n.m2012c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("open_ad_cache_type", Integer.valueOf(i));
        if (rVar != null) {
            rVar.mo1511b(System.currentTimeMillis());
            hashMap.put("client_start_time", Long.valueOf(rVar.mo1510b()));
            hashMap.put("sever_time", Long.valueOf(rVar.mo1514d()));
            hashMap.put("network_time", Long.valueOf(rVar.mo1512c()));
            hashMap.put("client_end_time", Long.valueOf(rVar.mo1515e()));
            hashMap.put("download_resource_duration", Long.valueOf(rVar.mo1517g()));
            hashMap.put("resource_source", Integer.valueOf(rVar.mo1518h()));
            j = rVar.mo1516f();
        } else {
            j = 0;
        }
        C0136e.m609a(nVar, "load_net_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m981a(C0477n nVar, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C0477n.m2012c(nVar) ? "video_normal_ad" : "image_normal_ad");
        C0136e.m609a(nVar, "load_cache_duration", j, (Map<String, Object>) hashMap);
    }
}
