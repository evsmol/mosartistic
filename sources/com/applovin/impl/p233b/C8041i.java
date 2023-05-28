package com.applovin.impl.p233b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.b.i */
public class C8041i {

    /* renamed from: a */
    private C8042a f19469a;

    /* renamed from: b */
    private Uri f19470b;

    /* renamed from: c */
    private String f19471c;

    /* renamed from: com.applovin.impl.b.i$a */
    public enum C8042a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C8041i() {
    }

    /* renamed from: a */
    static C8041i m23934a(C8622s sVar, C8041i iVar, C8490n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            if (iVar == null) {
                try {
                    iVar = new C8041i();
                } catch (Throwable th) {
                    nVar.mo57320D();
                    if (!C8626v.m26252a()) {
                        return null;
                    }
                    nVar.mo57320D().mo57819b("VastNonVideoResource", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (iVar.f19470b == null && !StringUtils.isValidString(iVar.f19471c)) {
                String a = m23935a(sVar, "StaticResource");
                if (URLUtil.isValidUrl(a)) {
                    iVar.f19470b = Uri.parse(a);
                    iVar.f19469a = C8042a.STATIC;
                    return iVar;
                }
                String a2 = m23935a(sVar, "IFrameResource");
                if (StringUtils.isValidString(a2)) {
                    iVar.f19469a = C8042a.IFRAME;
                    if (URLUtil.isValidUrl(a2)) {
                        iVar.f19470b = Uri.parse(a2);
                    } else {
                        iVar.f19471c = a2;
                    }
                    return iVar;
                }
                String a3 = m23935a(sVar, "HTMLResource");
                if (StringUtils.isValidString(a3)) {
                    iVar.f19469a = C8042a.HTML;
                    if (URLUtil.isValidUrl(a3)) {
                        iVar.f19470b = Uri.parse(a3);
                    } else {
                        iVar.f19471c = a3;
                    }
                }
            }
            return iVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    private static String m23935a(C8622s sVar, String str) {
        C8622s b = sVar.mo57796b(str);
        if (b != null) {
            return b.mo57799c();
        }
        return null;
    }

    /* renamed from: a */
    public C8042a mo55915a() {
        return this.f19469a;
    }

    /* renamed from: a */
    public void mo55916a(Uri uri) {
        this.f19470b = uri;
    }

    /* renamed from: a */
    public void mo55917a(String str) {
        this.f19471c = str;
    }

    /* renamed from: b */
    public Uri mo55918b() {
        return this.f19470b;
    }

    /* renamed from: c */
    public String mo55919c() {
        return this.f19471c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8041i)) {
            return false;
        }
        C8041i iVar = (C8041i) obj;
        if (this.f19469a != iVar.f19469a) {
            return false;
        }
        Uri uri = this.f19470b;
        if (uri == null ? iVar.f19470b != null : !uri.equals(iVar.f19470b)) {
            return false;
        }
        String str = this.f19471c;
        String str2 = iVar.f19471c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        C8042a aVar = this.f19469a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f19470b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f19471c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f19469a + ", resourceUri=" + this.f19470b + ", resourceContents='" + this.f19471c + '\'' + '}';
    }
}
