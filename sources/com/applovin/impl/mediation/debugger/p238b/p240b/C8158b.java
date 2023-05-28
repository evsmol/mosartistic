package com.applovin.impl.mediation.debugger.p238b.p240b;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.b */
public class C8158b {

    /* renamed from: a */
    private final String f19905a;

    /* renamed from: b */
    private final String f19906b;

    /* renamed from: c */
    private final String f19907c;

    /* renamed from: d */
    private final String f19908d;

    /* renamed from: e */
    private final boolean f19909e;

    /* renamed from: f */
    private final String f19910f;

    /* renamed from: g */
    private final int f19911g;

    public C8158b(String str) {
        this(str, -1);
    }

    public C8158b(String str, int i) {
        this.f19910f = str;
        this.f19911g = i;
        String[] split = str.split(",");
        boolean z = split.length == 3 || split.length == 4;
        this.f19909e = z;
        String str2 = "";
        if (z) {
            this.f19905a = m24448a(split[0]);
            this.f19906b = m24448a(split[1]);
            this.f19907c = m24448a(split[2]);
            if (split.length == 4) {
                str2 = m24448a(split[3]);
            }
        } else {
            this.f19905a = str2;
            this.f19906b = str2;
            this.f19907c = str2;
        }
        this.f19908d = str2;
    }

    /* renamed from: a */
    private String m24448a(String str) {
        return str.replace(173, ' ').trim();
    }

    /* renamed from: a */
    public String mo56349a() {
        return this.f19905a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo56350a(Object obj) {
        return obj instanceof C8158b;
    }

    /* renamed from: b */
    public String mo56351b() {
        return this.f19906b;
    }

    /* renamed from: c */
    public String mo56352c() {
        return this.f19907c;
    }

    /* renamed from: d */
    public String mo56353d() {
        return this.f19908d;
    }

    /* renamed from: e */
    public boolean mo56354e() {
        return this.f19909e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8158b)) {
            return false;
        }
        C8158b bVar = (C8158b) obj;
        if (!bVar.mo56350a((Object) this) || mo56354e() != bVar.mo56354e()) {
            return false;
        }
        String a = mo56349a();
        String a2 = bVar.mo56349a();
        if (a != null ? !a.equals(a2) : a2 != null) {
            return false;
        }
        String b = mo56351b();
        String b2 = bVar.mo56351b();
        if (b != null ? !b.equals(b2) : b2 != null) {
            return false;
        }
        String c = mo56352c();
        String c2 = bVar.mo56352c();
        if (c != null ? !c.equals(c2) : c2 != null) {
            return false;
        }
        String d = mo56353d();
        String d2 = bVar.mo56353d();
        return d != null ? d.equals(d2) : d2 == null;
    }

    public int hashCode() {
        int i = mo56354e() ? 79 : 97;
        String a = mo56349a();
        int i2 = 43;
        int hashCode = ((i + 59) * 59) + (a == null ? 43 : a.hashCode());
        String b = mo56351b();
        int hashCode2 = (hashCode * 59) + (b == null ? 43 : b.hashCode());
        String c = mo56352c();
        int hashCode3 = (hashCode2 * 59) + (c == null ? 43 : c.hashCode());
        String d = mo56353d();
        int i3 = hashCode3 * 59;
        if (d != null) {
            i2 = d.hashCode();
        }
        return i3 + i2;
    }
}
