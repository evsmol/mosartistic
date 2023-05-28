package com.applovin.exoplayer2.p220k;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.applovin.exoplayer2.k.f */
public final class C7665f extends C7664e {

    /* renamed from: a */
    private final ContentResolver f18040a;

    /* renamed from: b */
    private Uri f18041b;

    /* renamed from: c */
    private AssetFileDescriptor f18042c;

    /* renamed from: d */
    private FileInputStream f18043d;

    /* renamed from: e */
    private long f18044e;

    /* renamed from: f */
    private boolean f18045f;

    /* renamed from: com.applovin.exoplayer2.k.f$a */
    private static final class C7666a {
        /* renamed from: a */
        public static void m21944a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    /* renamed from: com.applovin.exoplayer2.k.f$b */
    public static class C7667b extends C7672j {
        public C7667b(IOException iOException, int i) {
            super((Throwable) iOException, i);
        }
    }

    public C7665f(Context context) {
        super(false);
        this.f18040a = context.getContentResolver();
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws C7667b {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f18044e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C7667b(e, 2000);
            }
        }
        int read = ((FileInputStream) C7728ai.m22198a(this.f18043d)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f18044e;
        if (j2 != -1) {
            this.f18044e = j2 - ((long) read);
        }
        mo54897a(read);
        return read;
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) throws C7667b {
        AssetFileDescriptor assetFileDescriptor;
        int i = 2000;
        try {
            Uri uri = lVar.f18057a;
            this.f18041b = uri;
            mo54898b(lVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(lVar.f18057a.getScheme())) {
                Bundle bundle = new Bundle();
                if (C7728ai.f18249a >= 31) {
                    C7666a.m21944a(bundle);
                }
                assetFileDescriptor = this.f18040a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.f18040a.openAssetFileDescriptor(uri, "r");
            }
            this.f18042c = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.f18043d = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    if (lVar.f18063g > length) {
                        throw new C7667b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(lVar.f18063g + startOffset) - startOffset;
                if (skip == lVar.f18063g) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f18044e = -1;
                        } else {
                            long position = size - channel.position();
                            this.f18044e = position;
                            if (position < 0) {
                                throw new C7667b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f18044e = j;
                        if (j < 0) {
                            throw new C7667b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    if (lVar.f18064h != -1) {
                        long j2 = this.f18044e;
                        this.f18044e = j2 == -1 ? lVar.f18064h : Math.min(j2, lVar.f18064h);
                    }
                    this.f18045f = true;
                    mo54899c(lVar);
                    return lVar.f18064h != -1 ? lVar.f18064h : this.f18044e;
                }
                throw new C7667b((IOException) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new C7667b(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (C7667b e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = IronSourceConstants.IS_INSTANCE_OPENED;
            }
            throw new C7667b(e2, i);
        }
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f18041b;
    }

    /* renamed from: c */
    public void mo54526c() throws C7667b {
        this.f18041b = null;
        try {
            if (this.f18043d != null) {
                this.f18043d.close();
            }
            this.f18043d = null;
            try {
                if (this.f18042c != null) {
                    this.f18042c.close();
                }
                this.f18042c = null;
                if (this.f18045f) {
                    this.f18045f = false;
                    mo54900d();
                }
            } catch (IOException e) {
                throw new C7667b(e, 2000);
            } catch (Throwable th) {
                this.f18042c = null;
                if (this.f18045f) {
                    this.f18045f = false;
                    mo54900d();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C7667b(e2, 2000);
        } catch (Throwable th2) {
            this.f18043d = null;
            try {
                if (this.f18042c != null) {
                    this.f18042c.close();
                }
                this.f18042c = null;
                if (this.f18045f) {
                    this.f18045f = false;
                    mo54900d();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C7667b(e3, 2000);
            } catch (Throwable th3) {
                this.f18042c = null;
                if (this.f18045f) {
                    this.f18045f = false;
                    mo54900d();
                }
                throw th3;
            }
        }
    }
}
