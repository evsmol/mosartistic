package com.applovin.exoplayer2.p206h;

import android.net.Uri;
import com.applovin.exoplayer2.p220k.C7674l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.exoplayer2.h.j */
public final class C7499j {

    /* renamed from: h */
    private static final AtomicLong f17214h = new AtomicLong();

    /* renamed from: a */
    public final long f17215a;

    /* renamed from: b */
    public final C7674l f17216b;

    /* renamed from: c */
    public final Uri f17217c;

    /* renamed from: d */
    public final Map<String, List<String>> f17218d;

    /* renamed from: e */
    public final long f17219e;

    /* renamed from: f */
    public final long f17220f;

    /* renamed from: g */
    public final long f17221g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7499j(long r13, com.applovin.exoplayer2.p220k.C7674l r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f18057a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p206h.C7499j.<init>(long, com.applovin.exoplayer2.k.l, long):void");
    }

    public C7499j(long j, C7674l lVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f17215a = j;
        this.f17216b = lVar;
        this.f17217c = uri;
        this.f17218d = map;
        this.f17219e = j2;
        this.f17220f = j3;
        this.f17221g = j4;
    }

    /* renamed from: a */
    public static long m20942a() {
        return f17214h.getAndIncrement();
    }
}
