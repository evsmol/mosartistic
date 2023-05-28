package com.appodeal.ads.utils;

import android.os.SystemClock;
import com.appodeal.ads.storage.C9531b;
import com.appodeal.ads.storage.C9562o;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.utils.w */
public final class C9661w {

    /* renamed from: l */
    public static final C9562o f24458l = C9562o.f24251b;

    /* renamed from: a */
    public final String f24459a;

    /* renamed from: b */
    public final long f24460b;

    /* renamed from: c */
    public final long f24461c;

    /* renamed from: d */
    public final long f24462d;

    /* renamed from: e */
    public volatile long f24463e = 0;

    /* renamed from: f */
    public volatile long f24464f = 0;

    /* renamed from: g */
    public volatile long f24465g = 0;

    /* renamed from: h */
    public volatile long f24466h = 0;

    /* renamed from: i */
    public volatile long f24467i = 0;

    /* renamed from: j */
    public volatile long f24468j = 0;

    /* renamed from: k */
    public long f24469k = 0;

    public C9661w(long j) {
        this.f24460b = j + 1;
        this.f24459a = UUID.randomUUID().toString();
        long a = C9608b0.m28354a();
        this.f24461c = a;
        this.f24465g = a;
        long b = C9608b0.m28355b();
        this.f24462d = b;
        this.f24466h = b;
    }

    public C9661w(String str, long j, long j2, long j3, long j4, long j5) {
        this.f24459a = str;
        this.f24460b = j;
        this.f24461c = j2;
        this.f24462d = j3;
        this.f24463e = j4;
        this.f24464f = j5;
    }

    /* renamed from: a */
    public final synchronized String mo61175a() {
        return this.f24459a;
    }

    /* renamed from: b */
    public final synchronized void mo61176b() {
        synchronized (this) {
            C9562o oVar = f24458l;
            long l = oVar.f24252a.mo60805l();
            long k = oVar.f24252a.mo60804k();
            C9531b bVar = oVar.f24252a;
            C9531b.C9532a aVar = C9531b.C9532a.Default;
            long j = bVar.mo60778a(aVar).getLong("app_uptime", 0);
            long j2 = oVar.f24252a.mo60778a(aVar).getLong("app_uptime_m", 0);
            oVar.mo60812a(this.f24459a, this.f24460b, this.f24461c, this.f24462d, j + l, j2 + k);
        }
    }

    /* renamed from: c */
    public final synchronized void mo61177c() {
        mo61179e();
        C9562o oVar = f24458l;
        oVar.f24252a.mo60782a(this.f24463e, this.f24464f);
    }

    /* renamed from: d */
    public final synchronized JSONObject mo61178d() {
        return new JSONObject().put("session_uuid", this.f24459a).put("session_id", this.f24460b).put("session_uptime", this.f24463e / 1000).put("session_uptime_m", this.f24464f).put("session_start_ts", this.f24461c / 1000).put("session_start_ts_m", this.f24462d);
    }

    /* renamed from: e */
    public final synchronized void mo61179e() {
        this.f24463e = (System.currentTimeMillis() - this.f24465g) + this.f24463e;
        this.f24464f = (SystemClock.elapsedRealtime() - this.f24466h) + this.f24464f;
        this.f24465g = System.currentTimeMillis();
        this.f24466h = SystemClock.elapsedRealtime();
    }
}
