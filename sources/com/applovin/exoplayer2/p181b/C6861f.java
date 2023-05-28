package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.p221l.C7728ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.applovin.exoplayer2.b.f */
public interface C6861f {

    /* renamed from: a */
    public static final ByteBuffer f15015a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.applovin.exoplayer2.b.f$a */
    public static final class C6862a {

        /* renamed from: a */
        public static final C6862a f15016a = new C6862a(-1, -1, -1);

        /* renamed from: b */
        public final int f15017b;

        /* renamed from: c */
        public final int f15018c;

        /* renamed from: d */
        public final int f15019d;

        /* renamed from: e */
        public final int f15020e;

        public C6862a(int i, int i2, int i3) {
            this.f15017b = i;
            this.f15018c = i2;
            this.f15019d = i3;
            this.f15020e = C7728ai.m22254d(i3) ? C7728ai.m22244c(i3, i2) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f15017b + ", channelCount=" + this.f15018c + ", encoding=" + this.f15019d + ']';
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.f$b */
    public static final class C6863b extends Exception {
        public C6863b(C6862a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: a */
    C6862a mo52927a(C6862a aVar) throws C6863b;

    /* renamed from: a */
    void mo52928a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo52929a();

    /* renamed from: b */
    void mo52930b();

    /* renamed from: c */
    ByteBuffer mo52931c();

    /* renamed from: d */
    boolean mo52932d();

    /* renamed from: e */
    void mo52933e();

    /* renamed from: f */
    void mo52934f();
}
