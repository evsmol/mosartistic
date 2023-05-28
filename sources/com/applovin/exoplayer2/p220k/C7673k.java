package com.applovin.exoplayer2.p220k;

import com.applovin.exoplayer2.p221l.C7717a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.applovin.exoplayer2.k.k */
public final class C7673k extends InputStream {

    /* renamed from: a */
    private final C7670i f18051a;

    /* renamed from: b */
    private final C7674l f18052b;

    /* renamed from: c */
    private final byte[] f18053c;

    /* renamed from: d */
    private boolean f18054d = false;

    /* renamed from: e */
    private boolean f18055e = false;

    /* renamed from: f */
    private long f18056f;

    public C7673k(C7670i iVar, C7674l lVar) {
        this.f18051a = iVar;
        this.f18052b = lVar;
        this.f18053c = new byte[1];
    }

    /* renamed from: a */
    private void m21957a() throws IOException {
        if (!this.f18054d) {
            this.f18051a.mo54522a(this.f18052b);
            this.f18054d = true;
        }
    }

    public void close() throws IOException {
        if (!this.f18055e) {
            this.f18051a.mo54526c();
            this.f18055e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f18053c) == -1) {
            return -1;
        }
        return this.f18053c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C7717a.m22121b(!this.f18055e);
        m21957a();
        int a = this.f18051a.mo53898a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f18056f += (long) a;
        return a;
    }
}
