package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.d9 */
public abstract class C2888d9 {

    /* renamed from: a */
    private final C2511S7 f7632a;

    /* renamed from: b */
    private final String f7633b;

    public C2888d9(C2511S7 s7) {
        this(s7, (String) null);
    }

    /* renamed from: a */
    public long mo17437a(String str, long j) {
        return this.f7632a.mo16593a(str, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C2888d9> T mo17443b(String str, String str2) {
        synchronized (this) {
            this.f7632a.mo16594a(str, str2);
        }
        return this;
    }

    /* renamed from: c */
    public boolean mo17446c(String str) {
        return this.f7632a.mo16597a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2484Rd mo17447d(String str) {
        return new C2484Rd(str, this.f7633b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo17449e(String str) {
        return this.f7632a.mo16601b(str, (String) null);
    }

    /* renamed from: f */
    public <T extends C2888d9> T mo17451f(String str) {
        synchronized (this) {
            this.f7632a.mo16598b(str);
        }
        return this;
    }

    public C2888d9(C2511S7 s7, String str) {
        this.f7632a = s7;
        this.f7633b = str;
    }

    /* renamed from: a */
    public int mo17436a(String str, int i) {
        return this.f7632a.mo16592a(str, i);
    }

    /* renamed from: e */
    public Set<String> mo17450e() {
        return this.f7632a.mo16596a();
    }

    /* renamed from: a */
    public String mo17438a(String str, String str2) {
        return this.f7632a.mo16601b(str, str2);
    }

    /* renamed from: a */
    public boolean mo17440a(String str, boolean z) {
        return this.f7632a.mo16603b(str, z);
    }

    /* renamed from: d */
    public void mo17448d() {
        synchronized (this) {
            this.f7632a.mo16602b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<String> mo17439a(String str, List<String> list) {
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String b = this.f7632a.mo16601b(str, (String) null);
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONArray jSONArray = new JSONArray(b);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: b */
    public <T extends C2888d9> T mo17442b(String str, long j) {
        synchronized (this) {
            this.f7632a.mo16600b(str, j);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C2888d9> T mo17441b(String str, int i) {
        synchronized (this) {
            this.f7632a.mo16599b(str, i);
        }
        return this;
    }

    /* renamed from: b */
    public <T extends C2888d9> T mo17445b(String str, boolean z) {
        synchronized (this) {
            this.f7632a.mo16595a(str, z);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C2888d9> T mo17444b(String str, List<String> list) {
        String str2;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        try {
            JSONArray jSONArray = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f7632a.mo16594a(str, str2);
        return this;
    }
}
