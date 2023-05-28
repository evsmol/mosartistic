package com.applovin.impl.p233b;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.b.k */
public class C8044k {

    /* renamed from: a */
    private String f19479a;

    /* renamed from: b */
    private String f19480b;

    /* renamed from: c */
    private String f19481c;

    /* renamed from: d */
    private long f19482d = -1;

    /* renamed from: e */
    private int f19483e = -1;

    private C8044k() {
    }

    /* renamed from: a */
    private static int m23942a(String str, C8037e eVar) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (eVar != null) {
            return eVar.mo55901h();
        }
        return 95;
    }

    /* renamed from: a */
    public static C8044k m23943a(C8622s sVar, C8037e eVar, C8490n nVar) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            try {
                String c = sVar.mo57799c();
                if (StringUtils.isValidString(c)) {
                    C8044k kVar = new C8044k();
                    kVar.f19481c = c;
                    kVar.f19479a = sVar.mo57797b().get("id");
                    kVar.f19480b = sVar.mo57797b().get("event");
                    kVar.f19483e = m23942a(kVar.mo55926a(), eVar);
                    String str = sVar.mo57797b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            kVar.f19483e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = explode.size()) > 0) {
                            long j = 0;
                            int i = size - 1;
                            for (int i2 = i; i2 >= 0; i2--) {
                                String str2 = (explode = CollectionUtils.explode(trim, ":")).get(i2);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = (long) parseInt;
                                    } else {
                                        if (i2 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i2 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds((long) parseInt);
                                    }
                                    j += seconds;
                                }
                            }
                            kVar.f19482d = j;
                            kVar.f19483e = -1;
                        }
                    }
                    return kVar;
                }
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57822e("VastTracker", "Unable to create tracker. Could not find URL.");
                return null;
            } catch (Throwable th) {
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57819b("VastTracker", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public String mo55926a() {
        return this.f19480b;
    }

    /* renamed from: a */
    public boolean mo55927a(long j, int i) {
        boolean z = this.f19482d >= 0;
        boolean z2 = j >= this.f19482d;
        boolean z3 = this.f19483e >= 0;
        boolean z4 = i >= this.f19483e;
        if (!z || !z2) {
            return z3 && z4;
        }
        return true;
    }

    /* renamed from: b */
    public String mo55928b() {
        return this.f19481c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8044k)) {
            return false;
        }
        C8044k kVar = (C8044k) obj;
        if (this.f19482d != kVar.f19482d || this.f19483e != kVar.f19483e) {
            return false;
        }
        String str = this.f19479a;
        if (str == null ? kVar.f19479a != null : !str.equals(kVar.f19479a)) {
            return false;
        }
        String str2 = this.f19480b;
        if (str2 == null ? kVar.f19480b == null : str2.equals(kVar.f19480b)) {
            return this.f19481c.equals(kVar.f19481c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f19479a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f19480b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f19482d;
        return ((((((hashCode + i) * 31) + this.f19481c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f19483e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f19479a + '\'' + ", event='" + this.f19480b + '\'' + ", uriString='" + this.f19481c + '\'' + ", offsetSeconds=" + this.f19482d + ", offsetPercent=" + this.f19483e + '}';
    }
}
