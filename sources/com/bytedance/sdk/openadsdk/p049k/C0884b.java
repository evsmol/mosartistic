package com.bytedance.sdk.openadsdk.p049k;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10633j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.k.b */
/* compiled from: TrackAdUrlImpl */
public class C0884b implements C0883a {

    /* renamed from: a */
    private final Context f3168a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0892g f3169b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f3170c = Executors.newSingleThreadExecutor();

    public C0884b(Context context, C0892g gVar) {
        this.f3168a = context;
        this.f3169b = gVar;
    }

    /* renamed from: c */
    public Context mo2742c() {
        Context context = this.f3168a;
        return context == null ? C0558m.m2663a() : context;
    }

    /* renamed from: a */
    public void mo2740a(final List<String> list) {
        if (C0515e.m2397a()) {
            C10615e.m31166b(new C10618g("trackUrls") {
                public void run() {
                    if (C10633j.m31222b(list)) {
                        for (String fVar : list) {
                            new C0887a(new C0891f(C0984l.m4553a() + "_" + System.currentTimeMillis(), fVar, 5)).executeOnExecutor(C0884b.this.f3170c, new Void[0]);
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: a */
    public void mo2739a() {
        C10615e.m31165b((C10618g) new C10618g("trackFailedUrls") {
            public void run() {
                C0884b.this.m4242b(C0884b.this.f3169b.mo2752a());
            }
        });
    }

    /* renamed from: b */
    public void mo2741b() {
        try {
            this.f3170c.shutdownNow();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4242b(List<C0891f> list) {
        if (C10633j.m31222b(list)) {
            for (C0891f aVar : list) {
                new C0887a(aVar).executeOnExecutor(this.f3170c, new Void[0]);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.k.b$a */
    /* compiled from: TrackAdUrlImpl */
    private class C0887a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private final C0891f f3175b;

        private C0887a(C0891f fVar) {
            this.f3175b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2746a(String str) {
            return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:21|22|23|24|25|26|29|(3:31|32|(3:49|34|(1:36)(0)))|37|(1:39)|40|(3:51|42|(1:44)(0))(3:45|54|48)) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
            r4 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A[SYNTHETIC, Splitter:B:31:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[Catch:{ all -> 0x0125 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0118 A[Catch:{ all -> 0x0125 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r4) {
            /*
                r3 = this;
                boolean r4 = com.bytedance.sdk.openadsdk.core.p025i.C0515e.m2397a()
                r0 = 0
                if (r4 != 0) goto L_0x0008
                return r0
            L_0x0008:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b
                java.lang.String r4 = r4.mo2750b()
                boolean r4 = r3.mo2746a((java.lang.String) r4)
                if (r4 != 0) goto L_0x0015
                return r0
            L_0x0015:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b
                int r4 = r4.mo2751c()
                if (r4 != 0) goto L_0x0029
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p049k.C0884b.this
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f3169b
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f3175b
                r4.mo2755c(r1)
                return r0
            L_0x0029:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b
                int r4 = r4.mo2751c()
                if (r4 <= 0) goto L_0x0128
                boolean r4 = r3.isCancelled()
                if (r4 != 0) goto L_0x0128
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b     // Catch:{ all -> 0x0125 }
                int r4 = r4.mo2751c()     // Catch:{ all -> 0x0125 }
                r1 = 5
                if (r4 != r1) goto L_0x004b
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p049k.C0884b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f3169b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f3175b     // Catch:{ all -> 0x0125 }
                r4.mo2753a(r1)     // Catch:{ all -> 0x0125 }
            L_0x004b:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p049k.C0884b.this     // Catch:{ all -> 0x0125 }
                android.content.Context r4 = r4.mo2742c()     // Catch:{ all -> 0x0125 }
                boolean r4 = com.bytedance.sdk.component.utils.C10642o.m31257a((android.content.Context) r4)     // Catch:{ all -> 0x0125 }
                if (r4 != 0) goto L_0x0059
                goto L_0x0128
            L_0x0059:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.mo2750b()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.i.d r1 = com.bytedance.sdk.openadsdk.p046i.C0835d.m4093a()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.e.a r1 = r1.mo2660b()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.e.b.b r1 = r1.mo64151c()     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = com.bytedance.sdk.openadsdk.utils.C0994s.m4605b(r4)     // Catch:{ all -> 0x0125 }
                r1.mo64176a((java.lang.String) r4)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = "User-Agent"
                java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.C0996u.m4631b()     // Catch:{ Exception -> 0x007b }
                r1.mo64179b(r4, r2)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                com.bytedance.sdk.component.e.b r4 = r1.mo64172a()     // Catch:{ all -> 0x0080 }
                goto L_0x0081
            L_0x0080:
                r4 = r0
            L_0x0081:
                java.lang.String r1 = "trackurl"
                if (r4 == 0) goto L_0x00b7
                boolean r4 = r4.mo64166f()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x00b7
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p049k.C0884b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f3169b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f3175b     // Catch:{ all -> 0x0125 }
                r4.mo2755c(r2)     // Catch:{ all -> 0x0125 }
                boolean r4 = com.bytedance.sdk.component.utils.C10638l.m31240c()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x0128
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
                r4.<init>()     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = "track success : "
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f3175b     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = r2.mo2750b()     // Catch:{ all -> 0x0125 }
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r4)     // Catch:{ all -> 0x0125 }
                goto L_0x0128
            L_0x00b7:
                boolean r4 = com.bytedance.sdk.component.utils.C10638l.m31240c()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x00d7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
                r4.<init>()     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = "track fail : "
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f3175b     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = r2.mo2750b()     // Catch:{ all -> 0x0125 }
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r4)     // Catch:{ all -> 0x0125 }
            L_0x00d7:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f3175b     // Catch:{ all -> 0x0125 }
                int r2 = r2.mo2751c()     // Catch:{ all -> 0x0125 }
                int r2 = r2 + -1
                r4.mo2749a(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f3175b     // Catch:{ all -> 0x0125 }
                int r4 = r4.mo2751c()     // Catch:{ all -> 0x0125 }
                if (r4 != 0) goto L_0x0118
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p049k.C0884b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f3169b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f3175b     // Catch:{ all -> 0x0125 }
                r4.mo2755c(r2)     // Catch:{ all -> 0x0125 }
                boolean r4 = com.bytedance.sdk.component.utils.C10638l.m31240c()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x0128
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
                r4.<init>()     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = "track fail and delete : "
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f3175b     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = r2.mo2750b()     // Catch:{ all -> 0x0125 }
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.utils.C10638l.m31238c(r1, r4)     // Catch:{ all -> 0x0125 }
                goto L_0x0128
            L_0x0118:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p049k.C0884b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f3169b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f3175b     // Catch:{ all -> 0x0125 }
                r4.mo2754b(r1)     // Catch:{ all -> 0x0125 }
                goto L_0x0029
            L_0x0125:
                goto L_0x0029
            L_0x0128:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p049k.C0884b.C0887a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    /* renamed from: d */
    public static C0883a m4243d() {
        return C0889d.m4253c();
    }
}
