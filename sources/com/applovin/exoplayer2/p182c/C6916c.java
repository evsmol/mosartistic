package com.applovin.exoplayer2.p182c;

import android.media.MediaCodec;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.c.c */
public final class C6916c {

    /* renamed from: a */
    public byte[] f15308a;

    /* renamed from: b */
    public byte[] f15309b;

    /* renamed from: c */
    public int f15310c;

    /* renamed from: d */
    public int[] f15311d;

    /* renamed from: e */
    public int[] f15312e;

    /* renamed from: f */
    public int f15313f;

    /* renamed from: g */
    public int f15314g;

    /* renamed from: h */
    public int f15315h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f15316i = new MediaCodec.CryptoInfo();

    /* renamed from: j */
    private final C6918a f15317j;

    /* renamed from: com.applovin.exoplayer2.c.c$a */
    private static final class C6918a {

        /* renamed from: a */
        private final MediaCodec.CryptoInfo f15318a;

        /* renamed from: b */
        private final MediaCodec.CryptoInfo.Pattern f15319b;

        private C6918a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f15318a = cryptoInfo;
            this.f15319b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m18439a(int i, int i2) {
            this.f15319b.set(i, i2);
            this.f15318a.setPattern(this.f15319b);
        }
    }

    public C6916c() {
        this.f15317j = C7728ai.f18249a >= 24 ? new C6918a(this.f15316i) : null;
    }

    /* renamed from: a */
    public MediaCodec.CryptoInfo mo53130a() {
        return this.f15316i;
    }

    /* renamed from: a */
    public void mo53131a(int i) {
        if (i != 0) {
            if (this.f15311d == null) {
                int[] iArr = new int[1];
                this.f15311d = iArr;
                this.f15316i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f15311d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: a */
    public void mo53132a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f15313f = i;
        this.f15311d = iArr;
        this.f15312e = iArr2;
        this.f15309b = bArr;
        this.f15308a = bArr2;
        this.f15310c = i2;
        this.f15314g = i3;
        this.f15315h = i4;
        this.f15316i.numSubSamples = i;
        this.f15316i.numBytesOfClearData = iArr;
        this.f15316i.numBytesOfEncryptedData = iArr2;
        this.f15316i.key = bArr;
        this.f15316i.iv = bArr2;
        this.f15316i.mode = i2;
        if (C7728ai.f18249a >= 24) {
            ((C6918a) C7717a.m22120b(this.f15317j)).m18439a(i3, i4);
        }
    }
}
