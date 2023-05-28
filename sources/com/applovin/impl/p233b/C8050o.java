package com.applovin.impl.p233b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8622s;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.applovin.impl.b.o */
public class C8050o {

    /* renamed from: a */
    private Uri f19500a;

    /* renamed from: b */
    private Uri f19501b;

    /* renamed from: c */
    private C8051a f19502c;

    /* renamed from: d */
    private String f19503d;

    /* renamed from: e */
    private int f19504e;

    /* renamed from: f */
    private int f19505f;

    /* renamed from: g */
    private int f19506g;

    /* renamed from: com.applovin.impl.b.o$a */
    public enum C8051a {
        Progressive,
        Streaming
    }

    private C8050o() {
    }

    /* renamed from: a */
    private static C8051a m23977a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return C8051a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return C8051a.Streaming;
            }
        }
        return C8051a.Progressive;
    }

    /* renamed from: a */
    public static C8050o m23978a(C8622s sVar, C8490n nVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (nVar != null) {
            try {
                String c = sVar.mo57799c();
                if (URLUtil.isValidUrl(c)) {
                    Uri parse = Uri.parse(c);
                    C8050o oVar = new C8050o();
                    oVar.f19500a = parse;
                    oVar.f19501b = parse;
                    oVar.f19506g = StringUtils.parseInt(sVar.mo57797b().get("bitrate"));
                    oVar.f19502c = m23977a(sVar.mo57797b().get("delivery"));
                    oVar.f19505f = StringUtils.parseInt(sVar.mo57797b().get(IabUtils.KEY_HEIGHT));
                    oVar.f19504e = StringUtils.parseInt(sVar.mo57797b().get(IabUtils.KEY_WIDTH));
                    oVar.f19503d = sVar.mo57797b().get("type").toLowerCase(Locale.ENGLISH);
                    return oVar;
                }
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57822e("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                nVar.mo57320D();
                if (!C8626v.m26252a()) {
                    return null;
                }
                nVar.mo57320D().mo57819b("VastVideoFile", "Error occurred while initializing", th);
                return null;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* renamed from: a */
    public Uri mo55944a() {
        return this.f19500a;
    }

    /* renamed from: a */
    public void mo55945a(Uri uri) {
        this.f19501b = uri;
    }

    /* renamed from: b */
    public Uri mo55946b() {
        return this.f19501b;
    }

    /* renamed from: c */
    public String mo55947c() {
        return this.f19503d;
    }

    /* renamed from: d */
    public int mo55948d() {
        return this.f19506g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8050o)) {
            return false;
        }
        C8050o oVar = (C8050o) obj;
        if (this.f19504e != oVar.f19504e || this.f19505f != oVar.f19505f || this.f19506g != oVar.f19506g) {
            return false;
        }
        Uri uri = this.f19500a;
        if (uri == null ? oVar.f19500a != null : !uri.equals(oVar.f19500a)) {
            return false;
        }
        Uri uri2 = this.f19501b;
        if (uri2 == null ? oVar.f19501b != null : !uri2.equals(oVar.f19501b)) {
            return false;
        }
        if (this.f19502c != oVar.f19502c) {
            return false;
        }
        String str = this.f19503d;
        String str2 = oVar.f19503d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f19500a;
        int i = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f19501b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        C8051a aVar = this.f19502c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f19503d;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((hashCode3 + i) * 31) + this.f19504e) * 31) + this.f19505f) * 31) + this.f19506g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f19500a + ", videoUri=" + this.f19501b + ", deliveryType=" + this.f19502c + ", fileType='" + this.f19503d + '\'' + ", width=" + this.f19504e + ", height=" + this.f19505f + ", bitrate=" + this.f19506g + '}';
    }
}
