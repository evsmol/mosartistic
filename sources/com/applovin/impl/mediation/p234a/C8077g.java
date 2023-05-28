package com.applovin.impl.mediation.p234a;

import com.applovin.impl.mediation.C8241g;

/* renamed from: com.applovin.impl.mediation.a.g */
public class C8077g {

    /* renamed from: a */
    private final C8079h f19624a;

    /* renamed from: b */
    private final String f19625b;

    /* renamed from: c */
    private final String f19626c;

    /* renamed from: d */
    private final String f19627d;

    /* renamed from: e */
    private final String f19628e;

    /* renamed from: com.applovin.impl.mediation.a.g$a */
    public interface C8078a {
        /* renamed from: a */
        void mo56197a(C8077g gVar);
    }

    private C8077g(C8079h hVar, C8241g gVar, String str, String str2) {
        String str3;
        this.f19624a = hVar;
        this.f19627d = str;
        this.f19628e = str2;
        if (gVar != null) {
            this.f19625b = gVar.mo56566h();
            str3 = gVar.mo56567i();
        } else {
            str3 = null;
            this.f19625b = null;
        }
        this.f19626c = str3;
    }

    /* renamed from: a */
    public static C8077g m24149a(C8079h hVar, C8241g gVar, String str) {
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (gVar != null) {
            return new C8077g(hVar, gVar, str, (String) null);
        } else {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
    }

    /* renamed from: a */
    public static C8077g m24150a(C8079h hVar, String str) {
        return m24151b(hVar, (C8241g) null, str);
    }

    /* renamed from: b */
    public static C8077g m24151b(C8079h hVar, C8241g gVar, String str) {
        if (hVar != null) {
            return new C8077g(hVar, gVar, (String) null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public C8079h mo56191a() {
        return this.f19624a;
    }

    /* renamed from: b */
    public String mo56192b() {
        return this.f19625b;
    }

    /* renamed from: c */
    public String mo56193c() {
        return this.f19626c;
    }

    /* renamed from: d */
    public String mo56194d() {
        return this.f19627d;
    }

    /* renamed from: e */
    public String mo56195e() {
        return this.f19628e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f19624a);
        sb.append(", mSdkVersion='");
        sb.append(this.f19625b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f19626c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f19627d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.f19628e);
        sb.append('}');
        return sb.toString();
    }
}
