package com.applovin.impl.sdk.p254c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.c */
public class C8381c {

    /* renamed from: a */
    protected final C8490n f20983a;

    /* renamed from: b */
    protected final Context f20984b;

    /* renamed from: c */
    protected final SharedPreferences f20985c;

    /* renamed from: d */
    private final Map<String, Object> f20986d = CollectionUtils.map();

    /* renamed from: e */
    private final Object f20987e = new Object();

    public C8381c(C8490n nVar) {
        this.f20983a = nVar;
        Context P = nVar.mo57332P();
        this.f20984b = P;
        this.f20985c = P.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(C8380b.class.getName());
            Class.forName(C8379a.class.getName());
        } catch (Throwable unused) {
        }
        mo57094b();
    }

    /* renamed from: a */
    private static Object m25200a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* renamed from: e */
    private String m25201e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f20983a.mo57319C()) + ".";
    }

    /* renamed from: a */
    public <T> C8380b<T> mo57088a(String str, C8380b<T> bVar) {
        synchronized (this.f20987e) {
            for (C8380b<T> next : C8380b.m25196c()) {
                if (next.mo57085a().equals(str)) {
                    return next;
                }
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public <T> T mo57089a(C8380b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f20987e) {
                Object obj = this.f20986d.get(bVar.mo57085a());
                if (obj == null) {
                    T b = bVar.mo57086b();
                    return b;
                }
                T a = bVar.mo57084a(obj);
                return a;
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    /* renamed from: a */
    public void mo57090a() {
        String e = m25201e();
        synchronized (this.f20987e) {
            SharedPreferences.Editor edit = this.f20985c.edit();
            for (C8380b next : C8380b.m25196c()) {
                Object obj = this.f20986d.get(next.mo57085a());
                if (obj != null) {
                    this.f20983a.mo57355a(e + next.mo57085a(), obj, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public <T> void mo57091a(C8380b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj != null) {
            synchronized (this.f20987e) {
                this.f20986d.put(bVar.mo57085a(), obj);
            }
        } else {
            throw new IllegalArgumentException("No new value specified");
        }
    }

    /* renamed from: a */
    public void mo57092a(JSONObject jSONObject) {
        String str;
        String str2;
        synchronized (this.f20987e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        C8380b<Boolean> a = mo57088a(next, (C8380b) null);
                        if (a != null) {
                            Object a2 = m25200a(next, jSONObject, a.mo57086b());
                            this.f20986d.put(a.mo57085a(), a2);
                            if (a == C8380b.f20910eC) {
                                this.f20986d.put(C8380b.f20911eD.mo57085a(), Long.valueOf(System.currentTimeMillis()));
                            } else if (a == C8380b.f20744at) {
                                try {
                                    CollectionUtils.setShouldUseArrayMap(C8380b.f20744at.mo57084a(a2).booleanValue());
                                } catch (Throwable unused) {
                                    C8626v.m26258i("SettingsManager", "Failed to update \"uam\" setting for static contexts");
                                }
                            }
                        }
                    } catch (JSONException e) {
                        th = e;
                        str = "SettingsManager";
                        str2 = "Unable to parse JSON settingsValues array";
                    } catch (Throwable th) {
                        th = th;
                        str = "SettingsManager";
                        str2 = "Unable to convert setting object ";
                    }
                }
            }
        }
        return;
        C8626v.m26254c(str, str2, th);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.applovin.impl.sdk.c.b<java.lang.String>, com.applovin.impl.sdk.c.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo57093b(com.applovin.impl.sdk.p254c.C8380b<java.lang.String> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.mo57089a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = com.applovin.impl.sdk.utils.CollectionUtils.explode(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p254c.C8381c.mo57093b(com.applovin.impl.sdk.c.b):java.util.List");
    }

    /* renamed from: b */
    public void mo57094b() {
        String e = m25201e();
        synchronized (this.f20987e) {
            for (C8380b next : C8380b.m25196c()) {
                try {
                    String a = next.mo57085a();
                    Object a2 = this.f20983a.mo57344a(e + a, null, next.mo57086b().getClass(), this.f20985c);
                    if (a2 != null) {
                        this.f20986d.put(next.mo57085a(), a2);
                    }
                } catch (Exception e2) {
                    C8626v.m26254c("SettingsManager", "Unable to load \"" + next.mo57085a() + "\"", e2);
                }
            }
        }
    }

    /* renamed from: c */
    public List<MaxAdFormat> mo57095c(C8380b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String formatFromString : mo57093b(bVar)) {
            arrayList.add(MaxAdFormat.formatFromString(formatFromString));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo57096c() {
        synchronized (this.f20987e) {
            this.f20986d.clear();
        }
        this.f20983a.mo57347a(this.f20985c);
    }

    /* renamed from: d */
    public boolean mo57097d() {
        return this.f20983a.mo57400q().isVerboseLoggingEnabled() || ((Boolean) mo57089a(C8380b.f20729ae)).booleanValue();
    }
}
