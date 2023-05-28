package com.applovin.exoplayer2.p220k;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.applovin.exoplayer2.k.c */
public final class C7658c extends C7664e {

    /* renamed from: a */
    private final AssetManager f18027a;

    /* renamed from: b */
    private Uri f18028b;

    /* renamed from: c */
    private InputStream f18029c;

    /* renamed from: d */
    private long f18030d;

    /* renamed from: e */
    private boolean f18031e;

    /* renamed from: com.applovin.exoplayer2.k.c$a */
    public static final class C7659a extends C7672j {
        public C7659a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C7658c(Context context) {
        super(false);
        this.f18027a = context.getAssets();
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws C7659a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f18030d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C7659a(e, 2000);
            }
        }
        int read = ((InputStream) C7728ai.m22198a(this.f18029c)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f18030d;
        if (j2 != -1) {
            this.f18030d = j2 - ((long) read);
        }
        mo54897a(read);
        return read;
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws C7659a {
        try {
            Uri uri = lVar.f18057a;
            this.f18028b = uri;
            String str = (String) C7717a.m22120b(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            mo54898b(lVar);
            InputStream open = this.f18027a.open(str, 1);
            this.f18029c = open;
            if (open.skip(lVar.f18063g) >= lVar.f18063g) {
                if (lVar.f18064h != -1) {
                    this.f18030d = lVar.f18064h;
                } else {
                    long available = (long) this.f18029c.available();
                    this.f18030d = available;
                    if (available == 2147483647L) {
                        this.f18030d = -1;
                    }
                }
                this.f18031e = true;
                mo54899c(lVar);
                return this.f18030d;
            }
            throw new C7659a((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (C7659a e) {
            throw e;
        } catch (IOException e2) {
            throw new C7659a(e2, e2 instanceof FileNotFoundException ? IronSourceConstants.IS_INSTANCE_OPENED : 2000);
        }
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f18028b;
    }

    /* renamed from: c */
    public void mo54526c() throws C7659a {
        this.f18028b = null;
        try {
            if (this.f18029c != null) {
                this.f18029c.close();
            }
            this.f18029c = null;
            if (this.f18031e) {
                this.f18031e = false;
                mo54900d();
            }
        } catch (IOException e) {
            throw new C7659a(e, 2000);
        } catch (Throwable th) {
            this.f18029c = null;
            if (this.f18031e) {
                this.f18031e = false;
                mo54900d();
            }
            throw th;
        }
    }
}
