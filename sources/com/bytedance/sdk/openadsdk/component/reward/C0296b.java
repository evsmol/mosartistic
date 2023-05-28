package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10577a;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b */
/* compiled from: FullScreenVideoCache */
class C0296b {

    /* renamed from: a */
    private static volatile C0296b f987a;

    /* renamed from: b */
    private final Context f988b;

    /* renamed from: c */
    private final C0347j f989c;

    /* renamed from: d */
    private Map<C0477n, Long> f990d = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.b$a */
    /* compiled from: FullScreenVideoCache */
    interface C0300a<T> {
        /* renamed from: a */
        void mo841a(boolean z, T t);
    }

    /* renamed from: a */
    public void mo834a(String str) {
        this.f989c.mo912d(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|(2:5|6)(1:7)|8|(2:14|(5:16|17|18|(2:20|44)(2:21|43)|22))|24|25|(1:52)(4:35|(5:37|38|39|46|40)|45|53)) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo830a() {
        /*
            r9 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "shared_prefs"
            r3 = 24
            if (r1 < r3) goto L_0x0015
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0075 }
            android.content.Context r4 = r9.f988b     // Catch:{ all -> 0x0075 }
            java.io.File r4 = r4.getDataDir()     // Catch:{ all -> 0x0075 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x002b
        L_0x0015:
            android.content.Context r1 = r9.f988b     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "1"
            java.io.File r1 = r1.getDatabasePath(r4)     // Catch:{ all -> 0x0075 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0075 }
            r1 = r4
        L_0x002b:
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            com.bytedance.sdk.openadsdk.component.reward.b$1 r2 = new com.bytedance.sdk.openadsdk.component.reward.b$1     // Catch:{ all -> 0x0075 }
            r2.<init>()     // Catch:{ all -> 0x0075 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0075
            int r2 = r1.length     // Catch:{ all -> 0x0075 }
            r4 = 0
        L_0x0044:
            if (r4 >= r2) goto L_0x0075
            r5 = r1[r4]     // Catch:{ all -> 0x0075 }
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = ".xml"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replace(r7, r8)     // Catch:{ all -> 0x0072 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0072 }
            if (r7 < r3) goto L_0x005e
            android.content.Context r5 = r9.f988b     // Catch:{ all -> 0x0072 }
            r5.deleteSharedPreferences(r6)     // Catch:{ all -> 0x0072 }
            goto L_0x0072
        L_0x005e:
            android.content.Context r7 = r9.f988b     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences r6 = r7.getSharedPreferences(r6, r0)     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch:{ all -> 0x0072 }
            r6.apply()     // Catch:{ all -> 0x0072 }
            com.bytedance.sdk.component.utils.C10627f.m31210c(r5)     // Catch:{ all -> 0x0072 }
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0075:
            android.content.Context r1 = r9.f988b     // Catch:{ all -> 0x00a2 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.component.reward.b$2 r2 = new com.bytedance.sdk.openadsdk.component.reward.b$2     // Catch:{ all -> 0x00a2 }
            r2.<init>()     // Catch:{ all -> 0x00a2 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
            if (r2 <= 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            if (r0 >= r2) goto L_0x00a2
            r3 = r1[r0]     // Catch:{ all -> 0x00a2 }
            com.bytedance.sdk.component.utils.C10627f.m31210c(r3)     // Catch:{ all -> 0x009f }
        L_0x009f:
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.C0296b.mo830a():void");
    }

    /* renamed from: a */
    public void mo832a(AdSlot adSlot, C0477n nVar) {
        mo831a(adSlot);
        if (nVar != null) {
            try {
                this.f989c.mo908a(adSlot.getCodeId(), nVar.mo1397ar().toString());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public AdSlot mo836b(String str) {
        return this.f989c.mo913e(str);
    }

    /* renamed from: a */
    public void mo831a(AdSlot adSlot) {
        this.f989c.mo907a(adSlot);
    }

    /* renamed from: b */
    public void mo837b(AdSlot adSlot) {
        this.f989c.mo910b(adSlot);
    }

    /* renamed from: b */
    public AdSlot mo835b() {
        return this.f989c.mo905a();
    }

    /* renamed from: a */
    public static C0296b m1271a(Context context) {
        if (f987a == null) {
            synchronized (C0296b.class) {
                if (f987a == null) {
                    f987a = new C0296b(context);
                }
            }
        }
        return f987a;
    }

    private C0296b(Context context) {
        Context a = context == null ? C0558m.m2663a() : context.getApplicationContext();
        this.f988b = a;
        this.f989c = new C0347j(a, "sp_full_screen_video");
    }

    /* renamed from: a */
    public String mo828a(C0477n nVar) {
        if (nVar == null || nVar.mo1330J() == null || TextUtils.isEmpty(nVar.mo1330J().mo62923i())) {
            return null;
        }
        return mo829a(nVar.mo1330J().mo62923i(), nVar.mo1330J().mo62927l(), nVar.mo1373aD());
    }

    /* renamed from: a */
    public String mo829a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = C10626e.m31201a(str);
        }
        File a = m1272a(str2, i);
        if (a == null || !a.exists() || !a.isFile() || a.length() <= 0) {
            return null;
        }
        return a.getAbsolutePath();
    }

    /* renamed from: c */
    public C0477n mo838c(String str) {
        C0477n a;
        long b = this.f989c.mo909b(str);
        boolean c = this.f989c.mo911c(str);
        if (!(System.currentTimeMillis() - b < 10500000) || c) {
            return null;
        }
        try {
            String a2 = this.f989c.mo906a(str);
            if (TextUtils.isEmpty(a2) || (a = C0402b.m1636a(new JSONObject(a2))) == null) {
                return null;
            }
            if (C0480p.m2198i(a)) {
                return a;
            }
            C10187b J = a.mo1330J();
            if (J == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(mo829a(J.mo62923i(), J.mo62927l(), a.mo1373aD()))) {
                return a;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1274a(boolean z, C0477n nVar, long j, String str) {
        long j2;
        Long remove = this.f990d.remove(nVar);
        if (remove == null) {
            j2 = 0;
        } else {
            j2 = SystemClock.elapsedRealtime() - remove.longValue();
        }
        C0136e.m599a(this.f988b, nVar, "fullscreen_interstitial_ad", z ? "load_video_success" : "load_video_error", C0996u.m4621a(z, nVar, j2, j, (z || str == null) ? null : str));
    }

    /* renamed from: a */
    public void mo833a(final C0477n nVar, final C0300a<Object> aVar) {
        this.f990d.put(nVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (nVar == null || nVar.mo1330J() == null || TextUtils.isEmpty(nVar.mo1330J().mo62923i())) {
            if (aVar != null) {
                aVar.mo841a(false, null);
            }
            m1274a(false, nVar, -1, (String) null);
            return;
        }
        String i = nVar.mo1330J().mo62923i();
        File a = m1272a(nVar.mo1330J().mo62927l(), nVar.mo1373aD());
        C10577a d = C0835d.m4093a().mo2660b().mo64152d();
        d.mo64176a(i);
        d.mo64171a(a.getParent(), a.getName());
        d.mo64170a((C10575a) new C10575a() {
            /* renamed from: a */
            public void mo444a(C10581c cVar, C10576b bVar) {
                if (!bVar.mo64166f() || bVar.mo64165e() == null || !bVar.mo64165e().exists()) {
                    C0300a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo841a(false, null);
                    }
                    C10638l.m31238c("FullScreenVideoCache", "onResponse: FullScreenVideo preload Fail ");
                    C0296b.this.m1274a(false, nVar, (long) bVar.mo64160a(), bVar.mo64162b());
                    return;
                }
                C0300a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo841a(true, null);
                }
                C10638l.m31238c("FullScreenVideoCache", "onResponse: FullScreenVideo preload success ");
                C0296b.this.m1274a(true, nVar, (long) bVar.mo64160a(), bVar.mo64162b());
            }

            /* renamed from: a */
            public void mo445a(C10581c cVar, IOException iOException) {
                C0300a aVar = aVar;
                if (aVar != null) {
                    aVar.mo841a(false, null);
                }
                C10638l.m31238c("FullScreenVideoCache", "onFailure: FullScreenVideo preload fail ");
                C0296b.this.m1274a(false, nVar, -2, iOException.getMessage());
            }
        });
    }

    /* renamed from: a */
    private File m1272a(String str, int i) {
        return new File(CacheDirFactory.getICacheDir(i).mo62649b(), str);
    }
}
