package com.applovin.exoplayer2.p209i.p212c;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p209i.C7572d;
import com.applovin.exoplayer2.p209i.C7585f;
import com.applovin.exoplayer2.p209i.C7600h;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.i.c.a */
public final class C7569a extends C7572d {

    /* renamed from: a */
    private final C7772y f17597a = new C7772y();

    /* renamed from: b */
    private final C7772y f17598b = new C7772y();

    /* renamed from: c */
    private final C7570a f17599c = new C7570a();

    /* renamed from: d */
    private Inflater f17600d;

    /* renamed from: com.applovin.exoplayer2.i.c.a$a */
    private static final class C7570a {

        /* renamed from: a */
        private final C7772y f17601a = new C7772y();

        /* renamed from: b */
        private final int[] f17602b = new int[256];

        /* renamed from: c */
        private boolean f17603c;

        /* renamed from: d */
        private int f17604d;

        /* renamed from: e */
        private int f17605e;

        /* renamed from: f */
        private int f17606f;

        /* renamed from: g */
        private int f17607g;

        /* renamed from: h */
        private int f17608h;

        /* renamed from: i */
        private int f17609i;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m21433a(C7772y yVar, int i) {
            if (i % 5 == 2) {
                yVar.mo55079e(2);
                Arrays.fill(this.f17602b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int h = yVar.mo55084h();
                    int h2 = yVar.mo55084h();
                    int h3 = yVar.mo55084h();
                    int h4 = yVar.mo55084h();
                    int h5 = yVar.mo55084h();
                    double d = (double) h2;
                    double d2 = (double) (h3 - 128);
                    int i4 = i3;
                    double d3 = (double) (h4 - 128);
                    int[] iArr = this.f17602b;
                    int a = C7728ai.m22180a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE) << 8;
                    iArr[h] = C7728ai.m22180a((int) (d + (d3 * 1.772d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE) | a | (h5 << 24) | (C7728ai.m22180a((int) ((1.402d * d2) + d), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE) << 16);
                    i3 = i4 + 1;
                }
                this.f17603c = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m21435b(C7772y yVar, int i) {
            int m;
            if (i >= 4) {
                yVar.mo55079e(3);
                int i2 = i - 4;
                if ((yVar.mo55084h() & 128) != 0) {
                    if (i2 >= 7 && (m = yVar.mo55089m()) >= 4) {
                        this.f17608h = yVar.mo55085i();
                        this.f17609i = yVar.mo55085i();
                        this.f17601a.mo55067a(m - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int c = this.f17601a.mo55074c();
                int b = this.f17601a.mo55072b();
                if (c < b && i2 > 0) {
                    int min = Math.min(i2, b - c);
                    yVar.mo55071a(this.f17601a.mo55077d(), c, min);
                    this.f17601a.mo55076d(c + min);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m21437c(C7772y yVar, int i) {
            if (i >= 19) {
                this.f17604d = yVar.mo55085i();
                this.f17605e = yVar.mo55085i();
                yVar.mo55079e(11);
                this.f17606f = yVar.mo55085i();
                this.f17607g = yVar.mo55085i();
            }
        }

        /* renamed from: a */
        public C7540a mo54707a() {
            int h;
            if (this.f17604d == 0 || this.f17605e == 0 || this.f17608h == 0 || this.f17609i == 0 || this.f17601a.mo55072b() == 0 || this.f17601a.mo55074c() != this.f17601a.mo55072b() || !this.f17603c) {
                return null;
            }
            this.f17601a.mo55076d(0);
            int i = this.f17608h * this.f17609i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int h2 = this.f17601a.mo55084h();
                if (h2 != 0) {
                    h = i2 + 1;
                    iArr[i2] = this.f17602b[h2];
                } else {
                    int h3 = this.f17601a.mo55084h();
                    if (h3 != 0) {
                        h = ((h3 & 64) == 0 ? h3 & 63 : ((h3 & 63) << 8) | this.f17601a.mo55084h()) + i2;
                        Arrays.fill(iArr, i2, h, (h3 & 128) == 0 ? 0 : this.f17602b[this.f17601a.mo55084h()]);
                    }
                }
                i2 = h;
            }
            return new C7540a.C7542a().mo54641a(Bitmap.createBitmap(iArr, this.f17608h, this.f17609i, Bitmap.Config.ARGB_8888)).mo54638a(((float) this.f17606f) / ((float) this.f17604d)).mo54648b(0).mo54639a(((float) this.f17607g) / ((float) this.f17605e), 0).mo54640a(0).mo54646b(((float) this.f17608h) / ((float) this.f17604d)).mo54651c(((float) this.f17609i) / ((float) this.f17605e)).mo54656e();
        }

        /* renamed from: b */
        public void mo54708b() {
            this.f17604d = 0;
            this.f17605e = 0;
            this.f17606f = 0;
            this.f17607g = 0;
            this.f17608h = 0;
            this.f17609i = 0;
            this.f17601a.mo55067a(0);
            this.f17603c = false;
        }
    }

    public C7569a() {
        super("PgsDecoder");
    }

    /* renamed from: a */
    private static C7540a m21429a(C7772y yVar, C7570a aVar) {
        int b = yVar.mo55072b();
        int h = yVar.mo55084h();
        int i = yVar.mo55085i();
        int c = yVar.mo55074c() + i;
        C7540a aVar2 = null;
        if (c > b) {
            yVar.mo55076d(b);
            return null;
        }
        if (h != 128) {
            switch (h) {
                case 20:
                    aVar.m21433a(yVar, i);
                    break;
                case 21:
                    aVar.m21435b(yVar, i);
                    break;
                case 22:
                    aVar.m21437c(yVar, i);
                    break;
            }
        } else {
            aVar2 = aVar.mo54707a();
            aVar.mo54708b();
        }
        yVar.mo55076d(c);
        return aVar2;
    }

    /* renamed from: a */
    private void m21430a(C7772y yVar) {
        if (yVar.mo55064a() > 0 && yVar.mo55080f() == 120) {
            if (this.f17600d == null) {
                this.f17600d = new Inflater();
            }
            if (C7728ai.m22217a(yVar, this.f17598b, this.f17600d)) {
                yVar.mo55070a(this.f17598b.mo55077d(), this.f17598b.mo55072b());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7585f mo54699a(byte[] bArr, int i, boolean z) throws C7600h {
        this.f17597a.mo55070a(bArr, i);
        m21430a(this.f17597a);
        this.f17599c.mo54708b();
        ArrayList arrayList = new ArrayList();
        while (this.f17597a.mo55064a() >= 3) {
            C7540a a = m21429a(this.f17597a, this.f17599c);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new C7571b(Collections.unmodifiableList(arrayList));
    }
}
