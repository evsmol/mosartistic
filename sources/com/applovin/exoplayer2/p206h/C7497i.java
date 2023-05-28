package com.applovin.exoplayer2.p206h;

import android.net.Uri;
import com.applovin.exoplayer2.p220k.C7654aa;
import com.applovin.exoplayer2.p220k.C7670i;
import com.applovin.exoplayer2.p220k.C7674l;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.h.i */
final class C7497i implements C7670i {

    /* renamed from: a */
    private final C7670i f17209a;

    /* renamed from: b */
    private final int f17210b;

    /* renamed from: c */
    private final C7498a f17211c;

    /* renamed from: d */
    private final byte[] f17212d;

    /* renamed from: e */
    private int f17213e;

    /* renamed from: com.applovin.exoplayer2.h.i$a */
    public interface C7498a {
        /* renamed from: a */
        void mo54527a(C7772y yVar);
    }

    public C7497i(C7670i iVar, int i, C7498a aVar) {
        C7717a.m22118a(i > 0);
        this.f17209a = iVar;
        this.f17210b = i;
        this.f17211c = aVar;
        this.f17212d = new byte[1];
        this.f17213e = i;
    }

    /* renamed from: d */
    private boolean m20934d() throws IOException {
        if (this.f17209a.mo53898a(this.f17212d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f17212d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int a = this.f17209a.mo53898a(bArr, i3, i2);
            if (a == -1) {
                return false;
            }
            i3 += a;
            i2 -= a;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f17211c.mo54527a(new C7772y(bArr, i));
        }
        return true;
    }

    /* renamed from: a */
    public int mo53898a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f17213e == 0) {
            if (!m20934d()) {
                return -1;
            }
            this.f17213e = this.f17210b;
        }
        int a = this.f17209a.mo53898a(bArr, i, Math.min(this.f17213e, i2));
        if (a != -1) {
            this.f17213e -= a;
        }
        return a;
    }

    /* renamed from: a */
    public long mo54522a(C7674l lVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public Uri mo54523a() {
        return this.f17209a.mo54523a();
    }

    /* renamed from: a */
    public void mo54524a(C7654aa aaVar) {
        C7717a.m22120b(aaVar);
        this.f17209a.mo54524a(aaVar);
    }

    /* renamed from: b */
    public Map<String, List<String>> mo54525b() {
        return this.f17209a.mo54525b();
    }

    /* renamed from: c */
    public void mo54526c() {
        throw new UnsupportedOperationException();
    }
}
