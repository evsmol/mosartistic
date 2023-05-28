package com.bytedance.sdk.openadsdk.core.p026j.p030c;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p026j.p027a.C0519a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c.c */
/* compiled from: VastMacroHelper */
public class C0544c {

    /* renamed from: a */
    private final List<String> f2029a;

    /* renamed from: b */
    private final Map<C0543b, String> f2030b;

    public C0544c(List<String> list) {
        this.f2029a = list;
        HashMap hashMap = new HashMap();
        this.f2030b = hashMap;
        hashMap.put(C0543b.CACHEBUSTING, m2571b());
    }

    /* renamed from: a */
    public List<String> mo1782a() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f2029a) {
            if (!TextUtils.isEmpty(next)) {
                for (C0543b bVar : C0543b.values()) {
                    String str = this.f2030b.get(bVar);
                    if (str == null) {
                        str = "";
                    }
                    next = next.replaceAll("\\[" + bVar.name() + "\\]", str);
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C0544c mo1780a(C0519a aVar) {
        if (aVar != null) {
            this.f2030b.put(C0543b.ERRORCODE, aVar.mo1747a());
        }
        return this;
    }

    /* renamed from: a */
    public C0544c mo1779a(long j) {
        if (j >= 0) {
            String b = m2572b(j);
            if (!TextUtils.isEmpty(b)) {
                this.f2030b.put(C0543b.CONTENTPLAYHEAD, b);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0544c mo1781a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f2030b.put(C0543b.ASSETURI, str);
        }
        return this;
    }

    /* renamed from: b */
    private String m2571b() {
        return String.format(Locale.US, "%08d", new Object[]{Long.valueOf(Math.round(Math.random() * 1.0E8d))});
    }

    /* renamed from: b */
    private String m2572b(long j) {
        return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(j % 1000)});
    }
}
