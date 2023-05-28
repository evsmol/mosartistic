package com.bytedance.sdk.openadsdk.core.p021e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.a */
/* compiled from: AdInfo */
public class C0448a {

    /* renamed from: a */
    private String f1478a;

    /* renamed from: b */
    private int f1479b;

    /* renamed from: c */
    private String f1480c;

    /* renamed from: d */
    private List<C0477n> f1481d = new ArrayList();

    /* renamed from: e */
    private String f1482e;

    /* renamed from: f */
    private long f1483f;

    /* renamed from: a */
    public static Map<String, C0477n> m1825a(C0448a aVar) {
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (C0477n next : aVar.mo1199b()) {
            if (!TextUtils.isEmpty(next.mo1385af())) {
                hashMap.put(next.mo1385af(), next);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    /* renamed from: a */
    public int mo1194a() {
        return this.f1479b;
    }

    /* renamed from: a */
    public void mo1195a(int i) {
        this.f1479b = i;
    }

    /* renamed from: a */
    public void mo1196a(long j) {
        this.f1483f = j;
    }

    /* renamed from: a */
    public void mo1197a(C0477n nVar) {
        this.f1481d.add(nVar);
    }

    /* renamed from: a */
    public void mo1198a(String str) {
        this.f1478a = str;
    }

    /* renamed from: b */
    public List<C0477n> mo1199b() {
        return this.f1481d;
    }

    /* renamed from: b */
    public void mo1200b(String str) {
        this.f1480c = str;
    }

    /* renamed from: c */
    public String mo1201c() {
        return this.f1482e;
    }

    /* renamed from: c */
    public void mo1202c(String str) {
        this.f1482e = str;
    }
}
