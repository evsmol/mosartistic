package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.V5 */
public class C2652V5 {

    /* renamed from: a */
    private final C2259L3 f7028a;

    /* renamed from: b */
    private final C2885d6 f7029b;

    /* renamed from: c */
    private final C2703X5 f7030c;

    /* renamed from: d */
    private long f7031d;

    /* renamed from: e */
    private long f7032e;

    /* renamed from: f */
    private AtomicLong f7033f;

    /* renamed from: g */
    private boolean f7034g;

    /* renamed from: h */
    private volatile C2653a f7035h;

    /* renamed from: i */
    private long f7036i;

    /* renamed from: j */
    private long f7037j;

    /* renamed from: k */
    private SystemTimeProvider f7038k;

    /* renamed from: com.yandex.metrica.impl.ob.V5$a */
    static class C2653a {

        /* renamed from: a */
        private final String f7039a;

        /* renamed from: b */
        private final String f7040b;

        /* renamed from: c */
        private final String f7041c;

        /* renamed from: d */
        private final String f7042d;

        /* renamed from: e */
        private final String f7043e;

        /* renamed from: f */
        private final int f7044f;

        /* renamed from: g */
        private final int f7045g;

        C2653a(JSONObject jSONObject) {
            this.f7039a = jSONObject.optString("analyticsSdkVersionName", (String) null);
            this.f7040b = jSONObject.optString("kitBuildNumber", (String) null);
            this.f7041c = jSONObject.optString("appVer", (String) null);
            this.f7042d = jSONObject.optString("appBuild", (String) null);
            this.f7043e = jSONObject.optString("osVer", (String) null);
            this.f7044f = jSONObject.optInt("osApiLev", -1);
            this.f7045g = jSONObject.optInt("attribution_id", 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo16964a(C2275Lg lg) {
            lg.getClass();
            return TextUtils.equals("5.3.0", this.f7039a) && TextUtils.equals("45003240", this.f7040b) && TextUtils.equals(lg.mo15704f(), this.f7041c) && TextUtils.equals(lg.mo15696b(), this.f7042d) && TextUtils.equals(lg.mo15713o(), this.f7043e) && this.f7044f == lg.mo15712n() && this.f7045g == lg.mo16186C();
        }

        public String toString() {
            return "SessionRequestParams{mKitVersionName='" + this.f7039a + '\'' + ", mKitBuildNumber='" + this.f7040b + '\'' + ", mAppVersion='" + this.f7041c + '\'' + ", mAppBuild='" + this.f7042d + '\'' + ", mOsVersion='" + this.f7043e + '\'' + ", mApiLevel=" + this.f7044f + ", mAttributionId=" + this.f7045g + '}';
        }
    }

    C2652V5(C2259L3 l3, C2885d6 d6Var, C2703X5 x5, SystemTimeProvider systemTimeProvider) {
        this.f7028a = l3;
        this.f7029b = d6Var;
        this.f7030c = x5;
        this.f7038k = systemTimeProvider;
        m8764g();
    }

    /* renamed from: g */
    private void m8764g() {
        this.f7032e = this.f7030c.mo17014a(this.f7038k.elapsedRealtime());
        this.f7031d = this.f7030c.mo17018c(-1);
        this.f7033f = new AtomicLong(this.f7030c.mo17017b(0));
        this.f7034g = this.f7030c.mo17016a(true);
        long e = this.f7030c.mo17020e(0);
        this.f7036i = e;
        this.f7037j = this.f7030c.mo17019d(e - this.f7032e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo16952a(long j) {
        C2885d6 d6Var = this.f7029b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j - this.f7032e);
        this.f7037j = seconds;
        ((C2914e6) d6Var).mo17485b(seconds);
        return this.f7037j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo16954b() {
        return Math.max(this.f7036i - TimeUnit.MILLISECONDS.toSeconds(this.f7032e), this.f7037j);
    }

    /* renamed from: c */
    public long mo16956c() {
        return this.f7031d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo16958d() {
        return this.f7037j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo16959e() {
        long andIncrement = this.f7033f.getAndIncrement();
        ((C2914e6) this.f7029b).mo17487c(this.f7033f.get()).mo17486b();
        return andIncrement;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C2943f6 mo16960f() {
        return this.f7030c.mo17015a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo16961h() {
        return this.f7034g && this.f7031d > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void mo16962i() {
        ((C2914e6) this.f7029b).mo17484a();
        this.f7035h = null;
    }

    public String toString() {
        return "Session{mId=" + this.f7031d + ", mInitTime=" + this.f7032e + ", mCurrentReportId=" + this.f7033f + ", mSessionRequestParams=" + this.f7035h + ", mSleepStartSeconds=" + this.f7036i + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo16955b(long j) {
        boolean z = this.f7031d >= 0;
        boolean a = m8763a();
        long elapsedRealtime = this.f7038k.elapsedRealtime();
        long j2 = this.f7036i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        boolean z2 = !(((timeUnit.toSeconds(elapsedRealtime) > j2 ? 1 : (timeUnit.toSeconds(elapsedRealtime) == j2 ? 0 : -1)) < 0) || timeUnit.toSeconds(j) - j2 >= ((long) this.f7030c.mo17013a(this.f7028a.mo16135m().mo16197N())) || timeUnit.toSeconds(j - this.f7032e) >= C2734Y5.f7222b);
        if (!z || !a || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16957c(long j) {
        C2885d6 d6Var = this.f7029b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        this.f7036i = seconds;
        ((C2914e6) d6Var).mo17491e(seconds).mo17486b();
    }

    /* renamed from: a */
    public void mo16953a(boolean z) {
        if (this.f7034g != z) {
            this.f7034g = z;
            ((C2914e6) this.f7029b).mo17483a(z).mo17486b();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|(1:9))|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8763a() {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.V5$a r0 = r4.f7035h
            if (r0 != 0) goto L_0x0038
            monitor-enter(r4)
            com.yandex.metrica.impl.ob.V5$a r0 = r4.f7035h     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0033
            com.yandex.metrica.impl.ob.L3 r0 = r4.f7028a     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.L7 r0 = r0.mo16131i()     // Catch:{ all -> 0x0033 }
            long r1 = r4.f7031d     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.X5 r3 = r4.f7030c     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.f6 r3 = r3.mo17015a()     // Catch:{ all -> 0x0033 }
            android.content.ContentValues r0 = r0.mo16151a((long) r1, (com.yandex.metrica.impl.p082ob.C2943f6) r3)     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "report_request_parameters"
            java.lang.String r0 = r0.getAsString(r1)     // Catch:{ all -> 0x0033 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0033
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ all -> 0x0033 }
            com.yandex.metrica.impl.ob.V5$a r0 = new com.yandex.metrica.impl.ob.V5$a     // Catch:{ all -> 0x0033 }
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            r4.f7035h = r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            com.yandex.metrica.impl.ob.V5$a r0 = r4.f7035h
            r1 = 0
            if (r0 == 0) goto L_0x0047
            com.yandex.metrica.impl.ob.L3 r1 = r4.f7028a
            com.yandex.metrica.impl.ob.Lg r1 = r1.mo16135m()
            boolean r1 = r0.mo16964a(r1)
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2652V5.m8763a():boolean");
    }
}
