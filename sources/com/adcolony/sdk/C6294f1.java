package com.adcolony.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.f1 */
class C6294f1 {

    /* renamed from: a */
    private final JSONObject f13510a;

    C6294f1() {
        this(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50680a(C6294f1 f1Var) {
        if (f1Var != null) {
            synchronized (this.f13510a) {
                synchronized (f1Var.f13510a) {
                    Iterator<String> c = f1Var.m15232c();
                    while (c.hasNext()) {
                        String next = c.next();
                        try {
                            this.f13510a.put(next, f1Var.f13510a.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo50684b(String str) throws JSONException {
        int i;
        synchronized (this.f13510a) {
            i = this.f13510a.getInt(str);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6290e1 mo50690c(String str) throws JSONException {
        C6290e1 e1Var;
        synchronized (this.f13510a) {
            e1Var = new C6290e1(this.f13510a.getJSONArray(str));
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo50693d(String str) throws JSONException {
        long j;
        synchronized (this.f13510a) {
            j = this.f13510a.getLong(str);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo50694e(String str) throws JSONException {
        String string;
        synchronized (this.f13510a) {
            string = this.f13510a.getString(str);
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo50697f(String str) {
        boolean optBoolean;
        synchronized (this.f13510a) {
            optBoolean = this.f13510a.optBoolean(str);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo50698g(String str) {
        Boolean valueOf;
        try {
            synchronized (this.f13510a) {
                valueOf = Boolean.valueOf(this.f13510a.getBoolean(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public double mo50699h(String str) {
        double optDouble;
        synchronized (this.f13510a) {
            optDouble = this.f13510a.optDouble(str);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Integer mo50700i(String str) {
        Integer valueOf;
        try {
            synchronized (this.f13510a) {
                valueOf = Integer.valueOf(this.f13510a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo50701j(String str) {
        int optInt;
        synchronized (this.f13510a) {
            optInt = this.f13510a.optInt(str);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C6290e1 mo50702k(String str) {
        C6290e1 e1Var;
        synchronized (this.f13510a) {
            JSONArray optJSONArray = this.f13510a.optJSONArray(str);
            e1Var = optJSONArray != null ? new C6290e1(optJSONArray) : new C6290e1();
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C6290e1 mo50703l(String str) {
        C6290e1 e1Var;
        synchronized (this.f13510a) {
            JSONArray optJSONArray = this.f13510a.optJSONArray(str);
            e1Var = optJSONArray != null ? new C6290e1(optJSONArray) : null;
        }
        return e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C6294f1 mo50704m(String str) {
        C6294f1 f1Var;
        synchronized (this.f13510a) {
            JSONObject optJSONObject = this.f13510a.optJSONObject(str);
            f1Var = optJSONObject != null ? new C6294f1(optJSONObject) : new C6294f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C6294f1 mo50705n(String str) {
        C6294f1 f1Var;
        synchronized (this.f13510a) {
            JSONObject optJSONObject = this.f13510a.optJSONObject(str);
            f1Var = optJSONObject != null ? new C6294f1(optJSONObject) : null;
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Object mo50706o(String str) {
        Object opt;
        synchronized (this.f13510a) {
            opt = this.f13510a.isNull(str) ? null : this.f13510a.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo50707p(String str) {
        String optString;
        synchronized (this.f13510a) {
            optString = this.f13510a.optString(str);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return null;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo50708q(java.lang.String r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f13510a
            monitor-enter(r0)
            org.json.JSONObject r1 = r2.f13510a     // Catch:{ all -> 0x0024 }
            boolean r1 = r1.isNull(r3)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0021
            org.json.JSONObject r1 = r2.f13510a     // Catch:{ all -> 0x0024 }
            java.lang.Object r3 = r1.opt(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0019:
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r3 = 0
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C6294f1.mo50708q(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo50709r(String str) {
        synchronized (this.f13510a) {
            this.f13510a.remove(str);
        }
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f13510a) {
            jSONObject = this.f13510a.toString();
        }
        return jSONObject;
    }

    C6294f1(String str) throws JSONException {
        this(new JSONObject(str));
    }

    C6294f1(Map<?, ?> map) {
        this(new JSONObject(map));
    }

    C6294f1(JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f13510a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6294f1 mo50688b(String str, boolean z) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo50691c(String str, int i) throws JSONException {
        synchronized (this.f13510a) {
            if (this.f13510a.has(str)) {
                return false;
            }
            this.f13510a.put(str, i);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo50692d() {
        return this.f13510a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50695e() {
        synchronized (this.f13510a) {
            Iterator<String> c = m15232c();
            while (c.hasNext()) {
                Object o = mo50706o(c.next());
                if (o == null || (((o instanceof JSONArray) && ((JSONArray) o).length() == 0) || (((o instanceof JSONObject) && ((JSONObject) o).length() == 0) || o.equals("")))) {
                    c.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, String> mo50696f() {
        HashMap hashMap = new HashMap();
        synchronized (this.f13510a) {
            Iterator<String> c = m15232c();
            while (c.hasNext()) {
                String next = c.next();
                hashMap.put(next, mo50707p(next));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6294f1 mo50686b(String str, int i) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, i);
        }
        return this;
    }

    /* renamed from: c */
    private Iterator<String> m15232c() {
        return this.f13510a.keys();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6294f1 mo50687b(String str, long j) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6294f1 mo50685b(String str, double d) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, d);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50682a(String str) {
        boolean z;
        synchronized (this.f13510a) {
            Iterator<String> c = m15232c();
            while (true) {
                if (c.hasNext()) {
                    if (str.equals(c.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo50689b() {
        return mo50692d() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50683a(String str, boolean z) {
        boolean optBoolean;
        synchronized (this.f13510a) {
            optBoolean = this.f13510a.optBoolean(str, z);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo50673a(String str, int i) {
        int optInt;
        synchronized (this.f13510a) {
            optInt = this.f13510a.optInt(str, i);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo50674a(String str, long j) {
        long optLong;
        synchronized (this.f13510a) {
            optLong = this.f13510a.optLong(str, j);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo50672a(String str, double d) {
        double optDouble;
        synchronized (this.f13510a) {
            optDouble = this.f13510a.optDouble(str, d);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6294f1 mo50677a(String str, String str2) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, str2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6294f1 mo50676a(String str, C6294f1 f1Var) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, f1Var.mo50678a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6294f1 mo50675a(String str, C6290e1 e1Var) throws JSONException {
        synchronized (this.f13510a) {
            this.f13510a.put(str, e1Var.mo50648a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50681a(String[] strArr) {
        synchronized (this.f13510a) {
            for (String remove : strArr) {
                this.f13510a.remove(remove);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50679a(C6290e1 e1Var) {
        synchronized (this.f13510a) {
            Iterator<String> c = m15232c();
            while (c.hasNext()) {
                if (!e1Var.mo50649a(c.next())) {
                    c.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo50678a() {
        return this.f13510a;
    }
}
