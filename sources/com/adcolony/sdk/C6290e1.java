package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.e1 */
class C6290e1 {

    /* renamed from: a */
    private final JSONArray f13502a;

    C6290e1() {
        this(new JSONArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo50647a(int i) throws JSONException {
        return this.f13502a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo50651b(int i) throws JSONException {
        return this.f13502a.getInt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6294f1 mo50653c(int i) {
        C6294f1 f1Var;
        synchronized (this.f13502a) {
            JSONObject optJSONObject = this.f13502a.optJSONObject(i);
            f1Var = optJSONObject != null ? new C6294f1(optJSONObject) : new C6294f1();
        }
        return f1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo50655d(int i) {
        String optString;
        synchronized (this.f13502a) {
            optString = this.f13502a.optString(i);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo50657e(int i) {
        synchronized (this.f13502a) {
            if (!this.f13502a.isNull(i)) {
                Object opt = this.f13502a.opt(i);
                if (opt instanceof String) {
                    String str = (String) opt;
                    return str;
                } else if (opt != null) {
                    String valueOf = String.valueOf(opt);
                    return valueOf;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6290e1 mo50658f(int i) {
        synchronized (this.f13502a) {
            this.f13502a.put(i);
        }
        return this;
    }

    public String toString() {
        String jSONArray;
        synchronized (this.f13502a) {
            jSONArray = this.f13502a.toString();
        }
        return jSONArray;
    }

    C6290e1(String str) throws JSONException {
        this(new JSONArray(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6290e1 mo50646a(C6294f1 f1Var) {
        synchronized (this.f13502a) {
            this.f13502a.put(f1Var.mo50678a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6290e1 mo50652b(String str) {
        synchronized (this.f13502a) {
            this.f13502a.put(str);
        }
        return this;
    }

    C6290e1(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f13502a = jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String[] mo50656d() {
        String[] strArr;
        synchronized (this.f13502a) {
            strArr = new String[this.f13502a.length()];
            for (int i = 0; i < this.f13502a.length(); i++) {
                strArr[i] = mo50655d(i);
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo50649a(String str) {
        boolean z;
        synchronized (this.f13502a) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= this.f13502a.length()) {
                    break;
                } else if (mo50655d(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo50650b() {
        return this.f13502a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6294f1[] mo50654c() {
        C6294f1[] f1VarArr;
        synchronized (this.f13502a) {
            f1VarArr = new C6294f1[this.f13502a.length()];
            for (int i = 0; i < this.f13502a.length(); i++) {
                f1VarArr[i] = mo50653c(i);
            }
        }
        return f1VarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONArray mo50648a() {
        return this.f13502a;
    }
}
