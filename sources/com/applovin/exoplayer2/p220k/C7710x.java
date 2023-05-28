package com.applovin.exoplayer2.p220k;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.applovin.exoplayer2.k.x */
public final class C7710x extends C7664e {

    /* renamed from: a */
    private final Resources f18195a;

    /* renamed from: b */
    private final String f18196b;

    /* renamed from: c */
    private Uri f18197c;

    /* renamed from: d */
    private AssetFileDescriptor f18198d;

    /* renamed from: e */
    private InputStream f18199e;

    /* renamed from: f */
    private long f18200f;

    /* renamed from: g */
    private boolean f18201g;

    /* renamed from: com.applovin.exoplayer2.k.x$a */
    public static class C7711a extends C7672j {
        public C7711a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C7710x(Context context) {
        super(false);
        this.f18195a = context.getResources();
        this.f18196b = context.getPackageName();
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws C7711a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f18200f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C7711a((String) null, e, 2000);
            }
        }
        int read = ((InputStream) C7728ai.m22198a(this.f18199e)).read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f18200f;
            if (j2 != -1) {
                this.f18200f = j2 - ((long) read);
            }
            mo54897a(read);
            return read;
        } else if (this.f18200f == -1) {
            return -1;
        } else {
            throw new C7711a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws C7711a {
        int i;
        String str;
        C7674l lVar2 = lVar;
        Uri uri = lVar2.f18057a;
        this.f18197c = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) C7717a.m22120b(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                i = Integer.parseInt((String) C7717a.m22120b(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C7711a("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String str2 = (String) C7717a.m22120b(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            i = this.f18195a.getIdentifier(sb.toString(), "raw", this.f18196b);
            if (i == 0) {
                throw new C7711a("Resource not found.", (Throwable) null, IronSourceConstants.IS_INSTANCE_OPENED);
            }
        } else {
            throw new C7711a("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        mo54898b(lVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f18195a.openRawResourceFd(i);
            this.f18198d = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f18199e = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    try {
                        if (lVar2.f18063g > length) {
                            throw new C7711a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (C7711a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new C7711a((String) null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(lVar2.f18063g + startOffset) - startOffset;
                if (skip == lVar2.f18063g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f18200f = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f18200f = size;
                            if (size < 0) {
                                throw new C7711a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f18200f = j;
                        if (j < 0) {
                            throw new C7672j(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    if (lVar2.f18064h != -1) {
                        long j2 = this.f18200f;
                        this.f18200f = j2 == -1 ? lVar2.f18064h : Math.min(j2, lVar2.f18064h);
                    }
                    this.f18201g = true;
                    mo54899c(lVar);
                    return lVar2.f18064h != -1 ? lVar2.f18064h : this.f18200f;
                }
                throw new C7711a((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new C7711a("Resource is compressed: " + uri, (Throwable) null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new C7711a((String) null, e3, IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f18197c;
    }

    /* renamed from: c */
    public void mo54526c() throws C7711a {
        this.f18197c = null;
        try {
            if (this.f18199e != null) {
                this.f18199e.close();
            }
            this.f18199e = null;
            try {
                if (this.f18198d != null) {
                    this.f18198d.close();
                }
                this.f18198d = null;
                if (this.f18201g) {
                    this.f18201g = false;
                    mo54900d();
                }
            } catch (IOException e) {
                throw new C7711a((String) null, e, 2000);
            } catch (Throwable th) {
                this.f18198d = null;
                if (this.f18201g) {
                    this.f18201g = false;
                    mo54900d();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C7711a((String) null, e2, 2000);
        } catch (Throwable th2) {
            this.f18199e = null;
            try {
                if (this.f18198d != null) {
                    this.f18198d.close();
                }
                this.f18198d = null;
                if (this.f18201g) {
                    this.f18201g = false;
                    mo54900d();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C7711a((String) null, e3, 2000);
            } catch (Throwable th3) {
                this.f18198d = null;
                if (this.f18201g) {
                    this.f18201g = false;
                    mo54900d();
                }
                throw th3;
            }
        }
    }
}
