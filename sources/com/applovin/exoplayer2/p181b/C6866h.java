package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C7864v;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.b.h */
public interface C6866h {

    /* renamed from: com.applovin.exoplayer2.b.h$a */
    public static final class C6867a extends Exception {

        /* renamed from: a */
        public final C7864v f15023a;

        public C6867a(String str, C7864v vVar) {
            super(str);
            this.f15023a = vVar;
        }

        public C6867a(Throwable th, C7864v vVar) {
            super(th);
            this.f15023a = vVar;
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.h$b */
    public static final class C6868b extends Exception {

        /* renamed from: a */
        public final int f15024a;

        /* renamed from: b */
        public final boolean f15025b;

        /* renamed from: c */
        public final C7864v f15026c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C6868b(int r3, int r4, int r5, int r6, com.applovin.exoplayer2.C7864v r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f15024a = r3
                r2.f15025b = r8
                r2.f15026c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p181b.C6866h.C6868b.<init>(int, int, int, int, com.applovin.exoplayer2.v, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.h$c */
    public interface C6869c {

        /* renamed from: com.applovin.exoplayer2.b.h$c$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C6869c cVar, long j) {
            }

            public static void $default$a(C6869c cVar, Exception exc) {
            }

            public static void $default$b(C6869c cVar) {
            }

            public static void $default$b(C6869c cVar, long j) {
            }
        }

        /* renamed from: a */
        void mo52970a();

        /* renamed from: a */
        void mo52971a(int i, long j, long j2);

        /* renamed from: a */
        void mo52972a(long j);

        /* renamed from: a */
        void mo52973a(Exception exc);

        /* renamed from: a */
        void mo52974a(boolean z);

        /* renamed from: b */
        void mo52975b();

        /* renamed from: b */
        void mo52976b(long j);
    }

    /* renamed from: com.applovin.exoplayer2.b.h$d */
    public static final class C6870d extends Exception {

        /* renamed from: a */
        public final long f15027a;

        /* renamed from: b */
        public final long f15028b;

        public C6870d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f15027a = j;
            this.f15028b = j2;
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.h$e */
    public static final class C6871e extends Exception {

        /* renamed from: a */
        public final int f15029a;

        /* renamed from: b */
        public final boolean f15030b;

        /* renamed from: c */
        public final C7864v f15031c;

        public C6871e(int i, C7864v vVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f15030b = z;
            this.f15029a = i;
            this.f15031c = vVar;
        }
    }

    /* renamed from: a */
    long mo52946a(boolean z);

    /* renamed from: a */
    void mo52947a();

    /* renamed from: a */
    void mo52948a(float f);

    /* renamed from: a */
    void mo52949a(int i);

    /* renamed from: a */
    void mo52950a(C6813am amVar);

    /* renamed from: a */
    void mo52951a(C6856d dVar);

    /* renamed from: a */
    void mo52952a(C6869c cVar);

    /* renamed from: a */
    void mo52953a(C6876k kVar);

    /* renamed from: a */
    void mo52954a(C7864v vVar, int i, int[] iArr) throws C6867a;

    /* renamed from: a */
    boolean mo52955a(C7864v vVar);

    /* renamed from: a */
    boolean mo52956a(ByteBuffer byteBuffer, long j, int i) throws C6868b, C6871e;

    /* renamed from: b */
    int mo52957b(C7864v vVar);

    /* renamed from: b */
    void mo52958b();

    /* renamed from: b */
    void mo52959b(boolean z);

    /* renamed from: c */
    void mo52960c() throws C6871e;

    /* renamed from: d */
    boolean mo52961d();

    /* renamed from: e */
    boolean mo52962e();

    /* renamed from: f */
    C6813am mo52963f();

    /* renamed from: g */
    void mo52964g();

    /* renamed from: h */
    void mo52965h();

    /* renamed from: i */
    void mo52966i();

    /* renamed from: j */
    void mo52967j();

    /* renamed from: k */
    void mo52968k();

    /* renamed from: l */
    void mo52969l();
}
