package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.p182c.C6916c;
import com.applovin.exoplayer2.p197f.C7376g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7727ah;
import com.applovin.exoplayer2.p221l.C7728ai;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.f.m */
public class C7393m implements C7376g {

    /* renamed from: a */
    private final MediaCodec f16974a;

    /* renamed from: b */
    private final Surface f16975b;

    /* renamed from: c */
    private ByteBuffer[] f16976c;

    /* renamed from: d */
    private ByteBuffer[] f16977d;

    /* renamed from: com.applovin.exoplayer2.f.m$a */
    private static final class C7395a {
        /* renamed from: a */
        public static Surface m20612a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }
    }

    /* renamed from: com.applovin.exoplayer2.f.m$b */
    public static class C7396b implements C7376g.C7378b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public MediaCodec mo54199a(C7376g.C7377a aVar) throws IOException {
            C7717a.m22120b(aVar.f16865a);
            String str = aVar.f16865a.f16875a;
            C7727ah.m22175a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C7727ah.m22174a();
            return createByCodecName;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.exoplayer2.p197f.C7376g mo54125b(com.applovin.exoplayer2.p197f.C7376g.C7377a r8) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 0
                android.media.MediaCodec r1 = r7.mo54199a(r8)     // Catch:{ IOException -> 0x004e, RuntimeException -> 0x004c }
                java.lang.String r2 = "configureCodec"
                com.applovin.exoplayer2.p221l.C7727ah.m22175a(r2)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.media.MediaFormat r2 = r8.f16866b     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.view.Surface r3 = r8.f16868d     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                android.media.MediaCrypto r4 = r8.f16869e     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                int r5 = r8.f16870f     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                r1.configure(r2, r3, r4, r5)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                com.applovin.exoplayer2.p221l.C7727ah.m22174a()     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                boolean r8 = r8.f16871g     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                if (r8 == 0) goto L_0x002f
                int r8 = com.applovin.exoplayer2.p221l.C7728ai.f18249a     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                r2 = 18
                if (r8 < r2) goto L_0x0027
                android.view.Surface r8 = com.applovin.exoplayer2.p197f.C7393m.C7395a.m20612a(r1)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                goto L_0x0030
            L_0x0027:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                java.lang.String r2 = "Encoding from a surface is only supported on API 18 and up."
                r8.<init>(r2)     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
                throw r8     // Catch:{ IOException -> 0x004a, RuntimeException -> 0x0048 }
            L_0x002f:
                r8 = r0
            L_0x0030:
                java.lang.String r2 = "startCodec"
                com.applovin.exoplayer2.p221l.C7727ah.m22175a(r2)     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                r1.start()     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                com.applovin.exoplayer2.p221l.C7727ah.m22174a()     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                com.applovin.exoplayer2.f.m r2 = new com.applovin.exoplayer2.f.m     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                r2.<init>(r1, r8)     // Catch:{ IOException -> 0x0043, RuntimeException -> 0x0041 }
                return r2
            L_0x0041:
                r0 = move-exception
                goto L_0x0044
            L_0x0043:
                r0 = move-exception
            L_0x0044:
                r6 = r0
                r0 = r8
                r8 = r6
                goto L_0x0050
            L_0x0048:
                r8 = move-exception
                goto L_0x0050
            L_0x004a:
                r8 = move-exception
                goto L_0x0050
            L_0x004c:
                r8 = move-exception
                goto L_0x004f
            L_0x004e:
                r8 = move-exception
            L_0x004f:
                r1 = r0
            L_0x0050:
                if (r0 == 0) goto L_0x0055
                r0.release()
            L_0x0055:
                if (r1 == 0) goto L_0x005a
                r1.release()
            L_0x005a:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7393m.C7396b.mo54125b(com.applovin.exoplayer2.f.g$a):com.applovin.exoplayer2.f.g");
        }
    }

    private C7393m(MediaCodec mediaCodec, Surface surface) {
        this.f16974a = mediaCodec;
        this.f16975b = surface;
        if (C7728ai.f18249a < 21) {
            this.f16976c = this.f16974a.getInputBuffers();
            this.f16977d = this.f16974a.getOutputBuffers();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20595a(C7376g.C7379c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo54158a(this, j, j2);
    }

    /* renamed from: a */
    public int mo54108a(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f16974a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && C7728ai.f18249a < 21) {
                this.f16977d = this.f16974a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: a */
    public ByteBuffer mo54109a(int i) {
        return C7728ai.f18249a >= 21 ? this.f16974a.getInputBuffer(i) : ((ByteBuffer[]) C7728ai.m22198a(this.f16976c))[i];
    }

    /* renamed from: a */
    public void mo54110a(int i, int i2, int i3, long j, int i4) {
        this.f16974a.queueInputBuffer(i, i2, i3, j, i4);
    }

    /* renamed from: a */
    public void mo54111a(int i, int i2, C6916c cVar, long j, int i3) {
        this.f16974a.queueSecureInputBuffer(i, i2, cVar.mo53130a(), j, i3);
    }

    /* renamed from: a */
    public void mo54112a(int i, long j) {
        this.f16974a.releaseOutputBuffer(i, j);
    }

    /* renamed from: a */
    public void mo54113a(int i, boolean z) {
        this.f16974a.releaseOutputBuffer(i, z);
    }

    /* renamed from: a */
    public void mo54114a(Bundle bundle) {
        this.f16974a.setParameters(bundle);
    }

    /* renamed from: a */
    public void mo54115a(Surface surface) {
        this.f16974a.setOutputSurface(surface);
    }

    /* renamed from: a */
    public void mo54116a(C7376g.C7379c cVar, Handler handler) {
        this.f16974a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(cVar) {
            public final /* synthetic */ C7376g.C7379c f$1;

            {
                this.f$1 = r2;
            }

            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C7393m.this.m20595a(this.f$1, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* renamed from: a */
    public boolean mo54117a() {
        return false;
    }

    /* renamed from: b */
    public int mo54118b() {
        return this.f16974a.dequeueInputBuffer(0);
    }

    /* renamed from: b */
    public ByteBuffer mo54119b(int i) {
        return C7728ai.f18249a >= 21 ? this.f16974a.getOutputBuffer(i) : ((ByteBuffer[]) C7728ai.m22198a(this.f16977d))[i];
    }

    /* renamed from: c */
    public MediaFormat mo54120c() {
        return this.f16974a.getOutputFormat();
    }

    /* renamed from: c */
    public void mo54121c(int i) {
        this.f16974a.setVideoScalingMode(i);
    }

    /* renamed from: d */
    public void mo54122d() {
        this.f16974a.flush();
    }

    /* renamed from: e */
    public void mo54123e() {
        this.f16976c = null;
        this.f16977d = null;
        Surface surface = this.f16975b;
        if (surface != null) {
            surface.release();
        }
        this.f16974a.release();
    }
}
