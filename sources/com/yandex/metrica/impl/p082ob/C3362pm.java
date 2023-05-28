package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pm */
public class C3362pm<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f8650a;

    /* renamed from: b */
    private int f8651b;

    /* renamed from: c */
    private int f8652c;

    /* renamed from: d */
    private int f8653d;

    /* renamed from: e */
    private int f8654e;

    /* renamed from: f */
    private int f8655f;

    /* renamed from: g */
    private int f8656g;

    public C3362pm(int i) {
        if (i > 0) {
            this.f8652c = i;
            this.f8650a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: b */
    private int m10421b(K k, V v) {
        Pair pair = (Pair) v;
        int length = C2814b.m9072b(((C3633wk) k).f9412b).length + 4 + 4 + 4;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: a */
    public final synchronized V mo18048a(K k) {
        V v = this.f8650a.get(k);
        if (v != null) {
            this.f8655f++;
            return v;
        }
        this.f8656g++;
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f8655f;
        i2 = this.f8656g + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f8652c), Integer.valueOf(this.f8655f), Integer.valueOf(this.f8656g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    /* renamed from: a */
    public final synchronized V mo18049a(K k, V v) {
        V put;
        this.f8653d++;
        this.f8651b += m10421b(k, v);
        put = this.f8650a.put(k, v);
        if (put != null) {
            this.f8651b -= m10421b(k, put);
        }
        m10420a(this.f8652c);
        return put;
    }

    /* renamed from: a */
    private void m10420a(int i) {
        Map.Entry next;
        while (this.f8651b > i && !this.f8650a.isEmpty() && (next = this.f8650a.entrySet().iterator().next()) != null) {
            Object key = next.getKey();
            Object value = next.getValue();
            this.f8650a.remove(key);
            this.f8651b -= m10421b(key, value);
            this.f8654e++;
        }
        if (this.f8651b < 0 || (this.f8650a.isEmpty() && this.f8651b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* renamed from: a */
    public final synchronized void mo18050a() {
        m10420a(-1);
    }
}
