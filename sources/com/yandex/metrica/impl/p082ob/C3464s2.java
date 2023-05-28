package com.yandex.metrica.impl.p082ob;

import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.s2 */
public class C3464s2 {

    /* renamed from: a */
    private final C3465a f9086a;

    /* renamed from: b */
    private Boolean f9087b;

    /* renamed from: c */
    private final HashSet<String> f9088c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f9089d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.s2$a */
    public interface C3465a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.s2$b */
    public static class C3466b implements C3465a {

        /* renamed from: a */
        private final C2917e9 f9090a;

        public C3466b(C2917e9 e9Var) {
            this.f9090a = e9Var;
        }

        /* renamed from: a */
        public void mo18201a(boolean z) {
            this.f9090a.mo17513b(z).mo17448d();
        }

        /* renamed from: a */
        public Boolean mo18200a() {
            return this.f9090a.mo17522f();
        }
    }

    public C3464s2(C3465a aVar) {
        this.f9086a = aVar;
        this.f9087b = ((C3466b) aVar).mo18200a();
    }

    /* renamed from: b */
    private boolean m10683b() {
        Boolean bool = this.f9087b;
        if (bool == null) {
            return !this.f9088c.isEmpty() || this.f9089d.isEmpty();
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public synchronized void mo18194a(Boolean bool) {
        if (C1848A2.m6809a((Object) bool) || this.f9087b == null) {
            Boolean valueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f9087b = valueOf;
            ((C3466b) this.f9086a).mo18201a(valueOf.booleanValue());
        }
    }

    /* renamed from: c */
    public synchronized boolean mo18197c() {
        boolean z;
        Boolean bool = this.f9087b;
        if (bool == null) {
            z = this.f9089d.isEmpty() && this.f9088c.isEmpty();
        } else {
            z = bool.booleanValue();
        }
        return z;
    }

    /* renamed from: d */
    public synchronized boolean mo18198d() {
        return m10683b();
    }

    /* renamed from: e */
    public synchronized boolean mo18199e() {
        return m10683b();
    }

    /* renamed from: a */
    public synchronized void mo18195a(String str, Boolean bool) {
        if (C1848A2.m6809a((Object) bool) || (!this.f9089d.contains(str) && !this.f9088c.contains(str))) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue()) {
                this.f9089d.add(str);
                this.f9088c.remove(str);
            } else {
                this.f9088c.add(str);
                this.f9089d.remove(str);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo18196a() {
        Boolean bool;
        bool = this.f9087b;
        return bool == null ? this.f9089d.isEmpty() : bool.booleanValue();
    }
}
