package com.yandex.metrica.impl.p082ob;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Id */
public class C2118Id {

    /* renamed from: b */
    public static final Map<String, String> f5556b = Collections.unmodifiableMap(new C2119a());

    /* renamed from: a */
    private C2186Jd f5557a;

    /* renamed from: com.yandex.metrica.impl.ob.Id$a */
    class C2119a extends HashMap<String, String> {
        C2119a() {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    }

    public C2118Id(C2186Jd jd) {
        this.f5557a = jd;
    }

    /* renamed from: a */
    public void mo15894a() {
        if (this.f5557a.mo15995b((String) null) != null) {
            this.f5557a.mo16003j();
            this.f5557a.mo15999f();
        }
    }

    /* renamed from: b */
    public void mo15896b() {
        Map<String, ?> all = this.f5557a.f5974b.getAll();
        for (String rd : f5556b.values()) {
            int i = C2186Jd.f5847j;
            all.remove(new C2484Rd("init_event_pref_key", rd).mo16558a());
        }
        LinkedList linkedList = new LinkedList();
        for (String next : all.keySet()) {
            try {
                int i2 = C2186Jd.f5847j;
                linkedList.add(Integer.valueOf(Integer.parseInt(next.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        mo15895a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15897c() {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = f5556b
            com.yandex.metrica.impl.ob.Jd r1 = r4.f5557a
            java.lang.String r1 = r1.f5973a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0035
            com.yandex.metrica.impl.ob.Jd r1 = r4.f5557a
            android.content.SharedPreferences r1 = r1.f5974b
            java.util.Map r1 = r1.getAll()
            int r2 = com.yandex.metrica.impl.p082ob.C2186Jd.f5847j
            com.yandex.metrica.impl.ob.Rd r2 = new com.yandex.metrica.impl.ob.Rd
            java.lang.String r3 = "init_event_pref_key"
            r2.<init>(r3, r0)
            java.lang.String r2 = r2.mo16558a()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r2 = "DONE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r4.mo15895a(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2118Id.mo15897c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15895a(String str) {
        if (str != null) {
            C2186Jd jd = this.f5557a;
            jd.getClass();
            jd.f5974b.edit().remove(new C2484Rd("init_event_pref_key", str).mo16558a()).apply();
            this.f5557a.mo16003j();
        }
    }
}
