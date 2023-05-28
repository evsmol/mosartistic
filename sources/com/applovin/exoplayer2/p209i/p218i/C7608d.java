package com.applovin.exoplayer2.p209i.p218i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.exoplayer2.i.i.d */
public final class C7608d {

    /* renamed from: a */
    private String f17748a = "";

    /* renamed from: b */
    private String f17749b = "";

    /* renamed from: c */
    private Set<String> f17750c = Collections.emptySet();

    /* renamed from: d */
    private String f17751d = "";

    /* renamed from: e */
    private String f17752e = null;

    /* renamed from: f */
    private int f17753f;

    /* renamed from: g */
    private boolean f17754g = false;

    /* renamed from: h */
    private int f17755h;

    /* renamed from: i */
    private boolean f17756i = false;

    /* renamed from: j */
    private int f17757j = -1;

    /* renamed from: k */
    private int f17758k = -1;

    /* renamed from: l */
    private int f17759l = -1;

    /* renamed from: m */
    private int f17760m = -1;

    /* renamed from: n */
    private int f17761n = -1;

    /* renamed from: o */
    private float f17762o;

    /* renamed from: p */
    private int f17763p = -1;

    /* renamed from: q */
    private boolean f17764q = false;

    /* renamed from: a */
    private static int m21616a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public int mo54761a() {
        if (this.f17759l == -1 && this.f17760m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f17759l == 1 ? 1 : 0;
        if (this.f17760m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: a */
    public int mo54762a(String str, String str2, Set<String> set, String str3) {
        if (this.f17748a.isEmpty() && this.f17749b.isEmpty() && this.f17750c.isEmpty() && this.f17751d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a = m21616a(m21616a(m21616a(0, this.f17748a, str, 1073741824), this.f17749b, str2, 2), this.f17751d, str3, 4);
        if (a == -1 || !set.containsAll(this.f17750c)) {
            return 0;
        }
        return a + (this.f17750c.size() * 4);
    }

    /* renamed from: a */
    public C7608d mo54763a(float f) {
        this.f17762o = f;
        return this;
    }

    /* renamed from: a */
    public C7608d mo54764a(int i) {
        this.f17753f = i;
        this.f17754g = true;
        return this;
    }

    /* renamed from: a */
    public C7608d mo54765a(boolean z) {
        this.f17758k = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public void mo54766a(String str) {
        this.f17748a = str;
    }

    /* renamed from: a */
    public void mo54767a(String[] strArr) {
        this.f17750c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: b */
    public C7608d mo54768b(int i) {
        this.f17755h = i;
        this.f17756i = true;
        return this;
    }

    /* renamed from: b */
    public C7608d mo54769b(boolean z) {
        this.f17759l = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public void mo54770b(String str) {
        this.f17749b = str;
    }

    /* renamed from: b */
    public boolean mo54771b() {
        return this.f17757j == 1;
    }

    /* renamed from: c */
    public C7608d mo54772c(int i) {
        this.f17761n = i;
        return this;
    }

    /* renamed from: c */
    public C7608d mo54773c(boolean z) {
        this.f17760m = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public void mo54774c(String str) {
        this.f17751d = str;
    }

    /* renamed from: c */
    public boolean mo54775c() {
        return this.f17758k == 1;
    }

    /* renamed from: d */
    public C7608d mo54776d(int i) {
        this.f17763p = i;
        return this;
    }

    /* renamed from: d */
    public C7608d mo54777d(String str) {
        this.f17752e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    /* renamed from: d */
    public C7608d mo54778d(boolean z) {
        this.f17764q = z;
        return this;
    }

    /* renamed from: d */
    public String mo54779d() {
        return this.f17752e;
    }

    /* renamed from: e */
    public int mo54780e() {
        if (this.f17754g) {
            return this.f17753f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: f */
    public boolean mo54781f() {
        return this.f17754g;
    }

    /* renamed from: g */
    public int mo54782g() {
        if (this.f17756i) {
            return this.f17755h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: h */
    public boolean mo54783h() {
        return this.f17756i;
    }

    /* renamed from: i */
    public int mo54784i() {
        return this.f17761n;
    }

    /* renamed from: j */
    public float mo54785j() {
        return this.f17762o;
    }

    /* renamed from: k */
    public int mo54786k() {
        return this.f17763p;
    }

    /* renamed from: l */
    public boolean mo54787l() {
        return this.f17764q;
    }
}
