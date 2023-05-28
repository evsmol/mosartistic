package com.applovin.exoplayer2.p220k;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.appnext.base.p264b.C8849c;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.applovin.exoplayer2.k.h */
public final class C7669h extends C7664e {

    /* renamed from: a */
    private C7674l f18046a;

    /* renamed from: b */
    private byte[] f18047b;

    /* renamed from: c */
    private int f18048c;

    /* renamed from: d */
    private int f18049d;

    public C7669h() {
        super(false);
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f18049d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C7728ai.m22198a(this.f18047b), this.f18048c, bArr, i, min);
        this.f18048c += min;
        this.f18049d -= min;
        mo54897a(min);
        return min;
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws IOException {
        mo54898b(lVar);
        this.f18046a = lVar;
        Uri uri = lVar.f18057a;
        String scheme = uri.getScheme();
        boolean equals = C8849c.DATA.equals(scheme);
        C7717a.m22119a(equals, (Object) "Unsupported scheme: " + scheme);
        String[] a = C7728ai.m22225a(uri.getSchemeSpecificPart(), ",");
        if (a.length == 2) {
            String str = a[1];
            if (a[0].contains(";base64")) {
                try {
                    this.f18047b = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw C6809ai.m17539a("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f18047b = C7728ai.m22250c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            if (lVar.f18063g <= ((long) this.f18047b.length)) {
                int i = (int) lVar.f18063g;
                this.f18048c = i;
                this.f18049d = this.f18047b.length - i;
                if (lVar.f18064h != -1) {
                    this.f18049d = (int) Math.min((long) this.f18049d, lVar.f18064h);
                }
                mo54899c(lVar);
                return lVar.f18064h != -1 ? lVar.f18064h : (long) this.f18049d;
            }
            this.f18047b = null;
            throw new C7672j(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw C6809ai.m17539a("Unexpected URI format: " + uri, (Throwable) null);
    }

    /* renamed from: a */
    public Uri mo54523a() {
        C7674l lVar = this.f18046a;
        if (lVar != null) {
            return lVar.f18057a;
        }
        return null;
    }

    /* renamed from: c */
    public void mo54526c() {
        if (this.f18047b != null) {
            this.f18047b = null;
            mo54900d();
        }
        this.f18046a = null;
    }
}
