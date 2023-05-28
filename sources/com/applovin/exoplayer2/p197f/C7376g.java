package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p182c.C6916c;
import com.applovin.exoplayer2.p197f.C7393m;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.f.g */
public interface C7376g {

    /* renamed from: com.applovin.exoplayer2.f.g$a */
    public static final class C7377a {

        /* renamed from: a */
        public final C7381i f16865a;

        /* renamed from: b */
        public final MediaFormat f16866b;

        /* renamed from: c */
        public final C7864v f16867c;

        /* renamed from: d */
        public final Surface f16868d;

        /* renamed from: e */
        public final MediaCrypto f16869e;

        /* renamed from: f */
        public final int f16870f;

        /* renamed from: g */
        public final boolean f16871g;

        private C7377a(C7381i iVar, MediaFormat mediaFormat, C7864v vVar, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.f16865a = iVar;
            this.f16866b = mediaFormat;
            this.f16867c = vVar;
            this.f16868d = surface;
            this.f16869e = mediaCrypto;
            this.f16870f = i;
            this.f16871g = z;
        }

        /* renamed from: a */
        public static C7377a m20413a(C7381i iVar, MediaFormat mediaFormat, C7864v vVar, MediaCrypto mediaCrypto) {
            return new C7377a(iVar, mediaFormat, vVar, (Surface) null, mediaCrypto, 0, false);
        }

        /* renamed from: a */
        public static C7377a m20414a(C7381i iVar, MediaFormat mediaFormat, C7864v vVar, Surface surface, MediaCrypto mediaCrypto) {
            return new C7377a(iVar, mediaFormat, vVar, surface, mediaCrypto, 0, false);
        }
    }

    /* renamed from: com.applovin.exoplayer2.f.g$b */
    public interface C7378b {

        /* renamed from: a */
        public static final C7378b f16872a = new C7393m.C7396b();

        /* renamed from: b */
        C7376g mo54125b(C7377a aVar) throws IOException;
    }

    /* renamed from: com.applovin.exoplayer2.f.g$c */
    public interface C7379c {
        /* renamed from: a */
        void mo54158a(C7376g gVar, long j, long j2);
    }

    /* renamed from: a */
    int mo54108a(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: a */
    ByteBuffer mo54109a(int i);

    /* renamed from: a */
    void mo54110a(int i, int i2, int i3, long j, int i4);

    /* renamed from: a */
    void mo54111a(int i, int i2, C6916c cVar, long j, int i3);

    /* renamed from: a */
    void mo54112a(int i, long j);

    /* renamed from: a */
    void mo54113a(int i, boolean z);

    /* renamed from: a */
    void mo54114a(Bundle bundle);

    /* renamed from: a */
    void mo54115a(Surface surface);

    /* renamed from: a */
    void mo54116a(C7379c cVar, Handler handler);

    /* renamed from: a */
    boolean mo54117a();

    /* renamed from: b */
    int mo54118b();

    /* renamed from: b */
    ByteBuffer mo54119b(int i);

    /* renamed from: c */
    MediaFormat mo54120c();

    /* renamed from: c */
    void mo54121c(int i);

    /* renamed from: d */
    void mo54122d();

    /* renamed from: e */
    void mo54123e();
}
