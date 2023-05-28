package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Kd */
public abstract class C2241Kd {

    /* renamed from: e */
    private static final C2484Rd f5972e = new C2484Rd("UNDEFINED_", (String) null);

    /* renamed from: a */
    protected final String f5973a;

    /* renamed from: b */
    protected final SharedPreferences f5974b;

    /* renamed from: c */
    private final Map<String, Object> f5975c = new HashMap();

    /* renamed from: d */
    private boolean f5976d = false;

    public C2241Kd(Context context, String str) {
        this.f5973a = str;
        this.f5974b = m7639a(context);
        new C2484Rd(f5972e.mo16560b(), str);
    }

    /* renamed from: a */
    private SharedPreferences m7639a(Context context) {
        return C2814b.m9059a(context, mo15997d());
    }

    /* renamed from: b */
    public void mo16079b() {
        synchronized (this) {
            m7640a();
            this.f5975c.clear();
            this.f5976d = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo16080c() {
        return this.f5973a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo15997d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public <T extends C2241Kd> T mo16081e() {
        synchronized (this) {
            this.f5976d = true;
            this.f5975c.clear();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C2241Kd> T mo16078a(String str, Object obj) {
        synchronized (this) {
            if (obj != null) {
                this.f5975c.put(str, obj);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C2241Kd> T mo16077a(String str) {
        synchronized (this) {
            this.f5975c.put(str, this);
        }
        return this;
    }

    /* renamed from: a */
    private void m7640a() {
        SharedPreferences.Editor edit = this.f5974b.edit();
        if (this.f5976d) {
            edit.clear();
            edit.apply();
            return;
        }
        for (Map.Entry next : this.f5975c.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == this) {
                edit.remove(str);
            } else if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value != null) {
                throw new UnsupportedOperationException();
            }
        }
        edit.apply();
    }
}
