package com.applovin.exoplayer2.p221l;

import android.media.MediaFormat;
import com.applovin.exoplayer2.p222m.C7790b;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.l.t */
public final class C7758t {
    /* renamed from: a */
    public static void m22371a(MediaFormat mediaFormat, C7790b bVar) {
        if (bVar != null) {
            m22373a(mediaFormat, "color-transfer", bVar.f18414c);
            m22373a(mediaFormat, "color-standard", bVar.f18412a);
            m22373a(mediaFormat, "color-range", bVar.f18413b);
            m22374a(mediaFormat, "hdr-static-info", bVar.f18415d);
        }
    }

    /* renamed from: a */
    public static void m22372a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: a */
    public static void m22373a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public static void m22374a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: a */
    public static void m22375a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
