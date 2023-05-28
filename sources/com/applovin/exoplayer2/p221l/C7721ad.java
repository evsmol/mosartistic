package com.applovin.exoplayer2.p221l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.applovin.exoplayer2.l.ad */
public class C7721ad implements C7732d {
    protected C7721ad() {
    }

    /* renamed from: a */
    public long mo54963a() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public C7749o mo54964a(Looper looper, Handler.Callback callback) {
        return new C7722ae(new Handler(looper, callback));
    }

    /* renamed from: b */
    public long mo54965b() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    public void mo54966c() {
    }
}
