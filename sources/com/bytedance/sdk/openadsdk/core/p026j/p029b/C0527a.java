package com.bytedance.sdk.openadsdk.core.p026j.p029b;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.p026j.p029b.C0532c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a */
/* compiled from: VastAbsoluteProgressTracker */
public class C0527a extends C0532c implements Comparable<C0527a> {

    /* renamed from: a */
    public long f1984a;

    protected C0527a(long j, String str, C0532c.C0535b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f1984a = j;
    }

    /* renamed from: a */
    public static int m2533a(String str) {
        if (TextUtils.isEmpty(str)) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) (((float) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000))) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: a */
    public boolean mo1758a(long j) {
        return this.f1984a <= j && !mo1769e();
    }

    /* renamed from: a */
    public int compareTo(C0527a aVar) {
        if (aVar == null) {
            return 1;
        }
        long j = this.f1984a;
        long j2 = aVar.f1984a;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a$a */
    /* compiled from: VastAbsoluteProgressTracker */
    public static class C0528a {

        /* renamed from: a */
        private String f1985a;

        /* renamed from: b */
        private long f1986b;

        /* renamed from: c */
        private C0532c.C0535b f1987c = C0532c.C0535b.TRACKING_URL;

        /* renamed from: d */
        private boolean f1988d = false;

        public C0528a(String str, long j) {
            this.f1985a = str;
            this.f1986b = j;
        }

        /* renamed from: a */
        public C0527a mo1760a() {
            return new C0527a(this.f1986b, this.f1985a, this.f1987c, Boolean.valueOf(this.f1988d));
        }
    }

    /* renamed from: a */
    public JSONObject mo1757a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, mo1767c());
        jSONObject.put("trackingMilliseconds", this.f1984a);
        return jSONObject;
    }
}
