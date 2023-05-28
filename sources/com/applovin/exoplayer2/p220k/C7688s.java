package com.applovin.exoplayer2.p220k;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.applovin.exoplayer2.k.s */
public final class C7688s extends C7664e {

    /* renamed from: a */
    private RandomAccessFile f18155a;

    /* renamed from: b */
    private Uri f18156b;

    /* renamed from: c */
    private long f18157c;

    /* renamed from: d */
    private boolean f18158d;

    /* renamed from: com.applovin.exoplayer2.k.s$a */
    private static final class C7689a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m22041b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.s$b */
    public static class C7690b extends C7672j {
        public C7690b(String str, Throwable th, int i) {
            super(str, th, i);
        }

        public C7690b(Throwable th, int i) {
            super(th, i);
        }
    }

    public C7688s() {
        super(false);
    }

    /* renamed from: a */
    private static RandomAccessFile m22035a(Uri uri) throws C7690b {
        int i = 2006;
        try {
            return new RandomAccessFile((String) C7717a.m22120b(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C7690b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e, 1004);
            }
            if (C7728ai.f18249a < 21 || !C7689a.m22041b(e.getCause())) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new C7690b(e, i);
        } catch (SecurityException e2) {
            throw new C7690b(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C7690b(e3, 2000);
        }
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws C7690b {
        if (i2 == 0) {
            return 0;
        }
        if (this.f18157c == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C7728ai.m22198a(this.f18155a)).read(bArr, i, (int) Math.min(this.f18157c, (long) i2));
            if (read > 0) {
                this.f18157c -= (long) read;
                mo54897a(read);
            }
            return read;
        } catch (IOException e) {
            throw new C7690b(e, 2000);
        }
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws C7690b {
        Uri uri = lVar.f18057a;
        this.f18156b = uri;
        mo54898b(lVar);
        RandomAccessFile a = m22035a(uri);
        this.f18155a = a;
        try {
            a.seek(lVar.f18063g);
            long length = lVar.f18064h == -1 ? this.f18155a.length() - lVar.f18063g : lVar.f18064h;
            this.f18157c = length;
            if (length >= 0) {
                this.f18158d = true;
                mo54899c(lVar);
                return this.f18157c;
            }
            throw new C7690b((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e) {
            throw new C7690b(e, 2000);
        }
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f18156b;
    }

    /* renamed from: c */
    public void mo54526c() throws C7690b {
        this.f18156b = null;
        try {
            if (this.f18155a != null) {
                this.f18155a.close();
            }
            this.f18155a = null;
            if (this.f18158d) {
                this.f18158d = false;
                mo54900d();
            }
        } catch (IOException e) {
            throw new C7690b(e, 2000);
        } catch (Throwable th) {
            this.f18155a = null;
            if (this.f18158d) {
                this.f18158d = false;
                mo54900d();
            }
            throw th;
        }
    }
}
