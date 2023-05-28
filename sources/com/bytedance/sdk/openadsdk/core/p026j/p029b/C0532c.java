package com.bytedance.sdk.openadsdk.core.p026j.p029b;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10579b;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0519a;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0527a;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0529b;
import com.bytedance.sdk.openadsdk.core.p026j.p030c.C0544c;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c */
/* compiled from: VastTracker */
public class C0532c {

    /* renamed from: a */
    private String f1994a;

    /* renamed from: b */
    private C0535b f1995b;

    /* renamed from: c */
    private boolean f1996c;

    /* renamed from: d */
    private boolean f1997d;

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c$b */
    /* compiled from: VastTracker */
    enum C0535b {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    protected C0532c(String str, C0535b bVar, Boolean bool) {
        this.f1994a = str;
        this.f1995b = bVar;
        this.f1996c = bool.booleanValue();
    }

    /* renamed from: c */
    public String mo1767c() {
        return this.f1994a;
    }

    /* renamed from: d */
    public boolean mo1768d() {
        return this.f1996c;
    }

    /* renamed from: f_ */
    public void mo1765f_() {
        this.f1997d = true;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.c$a */
    /* compiled from: VastTracker */
    public static class C0534a {

        /* renamed from: a */
        private String f1998a;

        /* renamed from: b */
        private C0535b f1999b = C0535b.TRACKING_URL;

        /* renamed from: c */
        private boolean f2000c = false;

        public C0534a(String str) {
            this.f1998a = str;
        }

        /* renamed from: a */
        public C0534a mo1770a(boolean z) {
            this.f2000c = z;
            return this;
        }

        /* renamed from: a */
        public C0532c mo1771a() {
            return new C0532c(this.f1998a, this.f1999b, Boolean.valueOf(this.f2000c));
        }
    }

    /* renamed from: e */
    public boolean mo1769e() {
        return this.f1997d;
    }

    /* renamed from: a */
    public static List<String> m2543a(List<C0532c> list, C0519a aVar, long j, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C0532c next : list) {
            if (next != null && (!next.mo1769e() || next.mo1768d())) {
                arrayList.add(next.mo1767c());
                next.mo1765f_();
            }
        }
        return new C0544c(arrayList).mo1780a(aVar).mo1779a(j).mo1781a(str).mo1782a();
    }

    /* renamed from: b */
    public static void m2549b(List<C0532c> list, C0519a aVar, long j, String str) {
        m2546a(m2543a(list, aVar, j, str));
    }

    /* renamed from: a */
    public static void m2546a(List<String> list) {
        C10579b c;
        for (String next : list) {
            if (!(next == null || (c = C0835d.m4093a().mo2660b().mo64151c()) == null)) {
                c.mo64176a(next);
                c.mo64173a(new C10575a() {
                    /* renamed from: a */
                    public void mo444a(C10581c cVar, C10576b bVar) {
                    }

                    /* renamed from: a */
                    public void mo445a(C10581c cVar, IOException iOException) {
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public static JSONArray m2548b(List<C0532c> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).mo1767c());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static List<C0532c> m2544a(JSONArray jSONArray) {
        return m2545a(jSONArray, false);
    }

    /* renamed from: a */
    public static List<C0532c> m2545a(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C0534a(optString).mo1770a(z).mo1771a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<C0529b> m2547b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C0529b.C0531a(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).mo1766a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<C0527a> m2550c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C0527a.C0528a(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), optJSONObject.optLong("trackingMilliseconds", 0)).mo1760a());
                }
            }
        }
        return arrayList;
    }
}
