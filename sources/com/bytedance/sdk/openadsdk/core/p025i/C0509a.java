package com.bytedance.sdk.openadsdk.core.p025i;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.a */
/* compiled from: AdSlotSetter */
public class C0509a {

    /* renamed from: A */
    public int f1838A = 5;

    /* renamed from: a */
    public String f1839a;

    /* renamed from: b */
    public int f1840b = 1;

    /* renamed from: c */
    public int f1841c = 1;

    /* renamed from: d */
    public int f1842d = 2;

    /* renamed from: e */
    public int f1843e = 1;

    /* renamed from: f */
    public int f1844f = 100;

    /* renamed from: g */
    public int f1845g = 0;

    /* renamed from: h */
    public int f1846h = 2;

    /* renamed from: i */
    public int f1847i = 1;

    /* renamed from: j */
    public int f1848j = 3;

    /* renamed from: k */
    public int f1849k = -1;

    /* renamed from: l */
    public int f1850l = 1;

    /* renamed from: m */
    public int f1851m = 1;

    /* renamed from: n */
    public int f1852n = 2;

    /* renamed from: o */
    public int f1853o = 1500;

    /* renamed from: p */
    public int f1854p = 2;

    /* renamed from: q */
    public int f1855q = -1;

    /* renamed from: r */
    public int f1856r = 0;

    /* renamed from: s */
    public int f1857s = 5;

    /* renamed from: t */
    public boolean f1858t = false;

    /* renamed from: u */
    public int f1859u = 0;

    /* renamed from: v */
    public List<String> f1860v;

    /* renamed from: w */
    public int f1861w = 2;

    /* renamed from: x */
    public int f1862x = -1;

    /* renamed from: y */
    public int f1863y = 0;

    /* renamed from: z */
    public int f1864z = 0;

    /* renamed from: a */
    public static C0509a m2346a() {
        return new C0509a();
    }

    private C0509a() {
    }

    /* renamed from: a */
    public C0509a mo1630a(int i) {
        this.f1862x = i;
        return this;
    }

    /* renamed from: b */
    public C0509a mo1634b(int i) {
        this.f1856r = i;
        return this;
    }

    /* renamed from: c */
    public C0509a mo1635c(int i) {
        this.f1859u = i;
        return this;
    }

    /* renamed from: d */
    public C0509a mo1636d(int i) {
        this.f1855q = i;
        return this;
    }

    /* renamed from: e */
    public C0509a mo1637e(int i) {
        this.f1852n = i;
        return this;
    }

    /* renamed from: f */
    public C0509a mo1638f(int i) {
        this.f1853o = i;
        return this;
    }

    /* renamed from: g */
    public C0509a mo1639g(int i) {
        this.f1854p = i;
        return this;
    }

    /* renamed from: h */
    public C0509a mo1640h(int i) {
        this.f1850l = i;
        return this;
    }

    /* renamed from: i */
    public C0509a mo1641i(int i) {
        this.f1849k = i;
        return this;
    }

    /* renamed from: j */
    public C0509a mo1642j(int i) {
        this.f1848j = i;
        return this;
    }

    /* renamed from: a */
    public C0509a mo1631a(String str) {
        this.f1839a = str;
        return this;
    }

    /* renamed from: k */
    public C0509a mo1643k(int i) {
        this.f1840b = i;
        return this;
    }

    /* renamed from: l */
    public C0509a mo1644l(int i) {
        this.f1841c = i;
        return this;
    }

    /* renamed from: m */
    public C0509a mo1645m(int i) {
        this.f1842d = i;
        return this;
    }

    /* renamed from: n */
    public C0509a mo1646n(int i) {
        this.f1843e = i;
        return this;
    }

    /* renamed from: o */
    public C0509a mo1647o(int i) {
        this.f1844f = i;
        return this;
    }

    /* renamed from: p */
    public C0509a mo1648p(int i) {
        this.f1845g = i;
        return this;
    }

    /* renamed from: q */
    public C0509a mo1649q(int i) {
        this.f1846h = i;
        return this;
    }

    /* renamed from: r */
    public C0509a mo1650r(int i) {
        this.f1847i = i;
        return this;
    }

    /* renamed from: s */
    public C0509a mo1651s(int i) {
        this.f1851m = i;
        return this;
    }

    /* renamed from: t */
    public C0509a mo1652t(int i) {
        this.f1861w = i;
        return this;
    }

    /* renamed from: a */
    public C0509a mo1632a(JSONArray jSONArray) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            this.f1860v = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    this.f1860v.add(jSONArray.get(i).toString());
                    i++;
                } catch (Exception unused) {
                }
            }
        }
        return this;
    }

    /* renamed from: u */
    public C0509a mo1653u(int i) {
        this.f1857s = i;
        return this;
    }

    /* renamed from: a */
    public C0509a mo1633a(boolean z) {
        this.f1858t = z;
        return this;
    }

    /* renamed from: v */
    public C0509a mo1654v(int i) {
        this.f1863y = i;
        return this;
    }

    /* renamed from: w */
    public C0509a mo1655w(int i) {
        this.f1864z = i;
        return this;
    }

    /* renamed from: x */
    public C0509a mo1656x(int i) {
        this.f1838A = i;
        return this;
    }
}
