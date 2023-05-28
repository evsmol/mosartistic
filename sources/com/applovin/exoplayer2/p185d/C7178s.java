package com.applovin.exoplayer2.p185d;

import android.net.Uri;
import com.applovin.exoplayer2.p220k.C7674l;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.exoplayer2.d.s */
public final class C7178s extends IOException {

    /* renamed from: a */
    public final C7674l f15758a;

    /* renamed from: b */
    public final Uri f15759b;

    /* renamed from: c */
    public final Map<String, List<String>> f15760c;

    /* renamed from: d */
    public final long f15761d;

    public C7178s(C7674l lVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f15758a = lVar;
        this.f15759b = uri;
        this.f15760c = map;
        this.f15761d = j;
    }
}
