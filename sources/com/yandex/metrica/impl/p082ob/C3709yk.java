package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.yk */
abstract class C3709yk<T> {

    /* renamed from: a */
    private List<Object> f9536a;

    /* renamed from: b */
    private final C3594vk f9537b;

    C3709yk(T t, C3594vk vkVar) {
        this.f9536a = m11093c(t);
        this.f9537b = vkVar;
    }

    /* renamed from: c */
    private List<Object> m11093c(T t) {
        Pattern pattern;
        Pattern pattern2;
        ArrayList arrayList = new ArrayList();
        if (t == null) {
            return arrayList;
        }
        int b = mo16724b(t);
        List<C3740zl> a = mo16723a(t);
        arrayList.add(new C2779Zk(b));
        for (C3740zl next : a) {
            int ordinal = next.f9597a.ordinal();
            Object obj = null;
            if (ordinal == 0) {
                obj = new C3514tk(next.f9598b);
            } else if (ordinal == 1) {
                obj = new C3104jk(next.f9598b);
            } else if (ordinal == 2) {
                try {
                    pattern = Pattern.compile(next.f9598b);
                } catch (Throwable unused) {
                    pattern = null;
                }
                if (pattern != null) {
                    obj = new C2349Nk(pattern);
                }
            } else if (ordinal == 3) {
                try {
                    pattern2 = Pattern.compile(next.f9598b);
                } catch (Throwable unused2) {
                    pattern2 = null;
                }
                if (pattern2 != null) {
                    obj = new C3325ok(pattern2);
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return C1848A2.m6816c(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3594vk mo18434a() {
        return this.f9537b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<C3740zl> mo16723a(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo16724b(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<Object> mo18435b() {
        return this.f9536a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo18436d(T t) {
        this.f9537b.mo18341a();
        this.f9536a = m11093c(t);
    }
}
