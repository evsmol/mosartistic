package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10197a;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10621a;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.p008c.C0251a;
import com.bytedance.sdk.openadsdk.component.p009d.C0253a;
import com.bytedance.sdk.openadsdk.component.p011f.C0260a;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p021e.C0482r;
import com.bytedance.sdk.openadsdk.core.video.p035d.C0668a;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.C0826a;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0831b;
import com.bytedance.sdk.openadsdk.p332a.C10682b;
import com.bytedance.sdk.openadsdk.utils.C0977g;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.a */
/* compiled from: TTAppOpenAdCacheManager */
public class C0224a {

    /* renamed from: a */
    private static volatile C0224a f750a;

    /* renamed from: b */
    private final C10682b f751b;

    /* renamed from: c */
    private final C0561n<C0106a> f752c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f753d;

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$b */
    /* compiled from: TTAppOpenAdCacheManager */
    public interface C0233b {
        /* renamed from: a */
        void mo589a();

        /* renamed from: a */
        void mo590a(C0831b bVar);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$c */
    /* compiled from: TTAppOpenAdCacheManager */
    interface C0234c {
        /* renamed from: a */
        void mo587a();

        /* renamed from: a */
        void mo588a(int i, String str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$d */
    /* compiled from: TTAppOpenAdCacheManager */
    public interface C0235d {
        /* renamed from: a */
        void mo36a();

        /* renamed from: a */
        void mo37a(Bitmap bitmap);
    }

    private C0224a(Context context) {
        if (context != null) {
            this.f753d = context.getApplicationContext();
        } else {
            this.f753d = C0558m.m2663a();
        }
        this.f751b = new C10682b(10, 8, true);
        this.f752c = C0558m.m2671f();
    }

    /* renamed from: a */
    public static C0224a m881a(Context context) {
        if (f750a == null) {
            synchronized (C0224a.class) {
                if (f750a == null) {
                    f750a = new C0224a(context);
                }
            }
        }
        return f750a;
    }

    /* renamed from: a */
    public void mo573a(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        final C0482r rVar = new C0482r();
        rVar.mo1508a(currentTimeMillis);
        C0479o oVar = new C0479o();
        oVar.f1732g = currentTimeMillis;
        oVar.f1734i = rVar;
        oVar.f1729d = 2;
        this.f752c.mo1840a(adSlot, oVar, 3, new C0561n.C0562a() {
            /* renamed from: a */
            public void mo186a(int i, String str) {
                C10638l.m31235b("TTAppOpenAdCacheManager", "cache Load App OpenAd From Network fail");
            }

            /* renamed from: a */
            public void mo187a(C0448a aVar, C0449b bVar) {
                C10638l.m31235b("TTAppOpenAdCacheManager", "cache Load App Open Ad From Network success");
                if (aVar == null || aVar.mo1199b() == null || aVar.mo1199b().size() == 0) {
                    C10638l.m31235b("TTAppOpenAdCacheManager", "material is null");
                    bVar.mo1204a(-3);
                    C0449b.m1835a(bVar);
                    return;
                }
                C0477n nVar = aVar.mo1199b().get(0);
                if (C0477n.m2012c(nVar)) {
                    C0224a.this.m884a(nVar, adSlot, rVar);
                } else {
                    C0224a.this.m886a(nVar, rVar);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m884a(final C0477n nVar, AdSlot adSlot, final C0482r rVar) {
        final int f = C0996u.m4657f(nVar);
        mo575a(nVar, adSlot, rVar, (C0234c) new C0234c() {
            /* renamed from: a */
            public void mo588a(int i, String str) {
            }

            /* renamed from: a */
            public void mo587a() {
                C0253a aVar = new C0253a(f, nVar);
                C0224a.this.mo574a(aVar);
                C0251a.m980a(aVar.mo624b(), 1, rVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m886a(final C0477n nVar, final C0482r rVar) {
        final int f = C0996u.m4657f(nVar);
        mo576a(nVar, rVar, (C0233b) new C0233b() {
            /* renamed from: a */
            public void mo589a() {
            }

            /* renamed from: a */
            public void mo590a(C0831b bVar) {
                C0253a aVar = new C0253a(f, nVar);
                C0224a.this.mo574a(aVar);
                C0251a.m980a(aVar.mo624b(), 1, rVar);
            }
        });
    }

    /* renamed from: a */
    public void mo575a(C0477n nVar, AdSlot adSlot, C0482r rVar, C0234c cVar) {
        C0477n nVar2 = nVar;
        C0482r rVar2 = rVar;
        long currentTimeMillis = System.currentTimeMillis();
        int f = C0996u.m4657f(nVar);
        C10187b J = nVar.mo1330J();
        String i = J.mo62923i();
        String l = J.mo62927l();
        if (TextUtils.isEmpty(l)) {
            l = C10626e.m31201a(i);
        }
        final File a = C0260a.m1012a(l, f);
        if (a.exists()) {
            C10638l.m31235b("TTAppOpenAdCacheManager", "The video cache exists locally, use the cache directly");
            C0260a.m1016a(a);
            mo572a(f);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.mo1513c(currentTimeMillis2);
                rVar2.mo1507a(1);
            }
            cVar.mo587a();
            m885a(nVar2, (C0235d) null);
        } else if (!C0558m.m2673h().mo1709m(String.valueOf(f)) || C10642o.m31261d(C0558m.m2663a())) {
            C0234c cVar2 = cVar;
            C10188c a2 = C0477n.m2007a(a.getParent(), nVar2);
            a2.mo62940a("material_meta", nVar2);
            a2.mo62940a("ad_slot", adSlot);
            final int i2 = f;
            C02284 r15 = r0;
            final long j = currentTimeMillis;
            C10188c cVar3 = a2;
            final C0477n nVar3 = nVar;
            final C0482r rVar3 = rVar;
            final C0234c cVar4 = cVar;
            C02284 r0 = new C10197a.C10198a() {
                /* renamed from: b */
                public void mo593b(C10188c cVar, int i) {
                }

                /* renamed from: a */
                public void mo591a(C10188c cVar, int i) {
                    C10638l.m31235b("TTAppOpenAdCacheManager", "Video file caching success");
                    C0224a.this.mo577a(a);
                    C0224a.this.mo572a(i2);
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C0251a.m985b(nVar3, currentTimeMillis, true);
                    C0482r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo1513c(currentTimeMillis);
                        rVar3.mo1507a(2);
                    }
                    cVar4.mo587a();
                    C0224a.m885a(nVar3, (C0235d) null);
                }

                /* renamed from: a */
                public void mo592a(C10188c cVar, int i, String str) {
                    C10638l.m31235b("TTAppOpenAdCacheManager", "Video file caching failed");
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    C0251a.m985b(nVar3, currentTimeMillis, false);
                    C0482r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo1513c(currentTimeMillis);
                    }
                    cVar4.mo588a(i, str);
                    try {
                        if (a.exists() && a.isFile()) {
                            C10627f.m31210c(a);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            C0668a.m3283a(cVar3, r15);
            if (Build.VERSION.SDK_INT < 23) {
                mo577a(new File(C10184b.m29123a().getCacheDir(), "proxy_cache"));
                mo572a(f);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                C0251a.m985b(nVar2, currentTimeMillis3, true);
                C0482r rVar4 = rVar;
                if (rVar4 != null) {
                    rVar4.mo1513c(currentTimeMillis3);
                    rVar4.mo1507a(2);
                }
                cVar.mo587a();
                m885a(nVar2, (C0235d) null);
            }
        } else {
            cVar.mo588a(100, "OnlyWifi");
        }
    }

    /* renamed from: a */
    public void mo576a(C0477n nVar, C0482r rVar, C0233b bVar) {
        C0482r rVar2 = rVar;
        final long currentTimeMillis = System.currentTimeMillis();
        final int f = C0996u.m4657f(nVar);
        C0463k kVar = nVar.mo1336P().get(0);
        String g = kVar.mo1292g();
        String a = kVar.mo1281a();
        int b = kVar.mo1285b();
        int c = kVar.mo1288c();
        File b2 = C0260a.m1017b(TextUtils.isEmpty(g) ? C10626e.m31201a(a) : g, f);
        if (mo578a(a, g)) {
            C10638l.m31235b("TTAppOpenAdCacheManager", "The image cache exists locally, directly use the cache");
            mo581c(f);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (rVar2 != null) {
                rVar2.mo1513c(currentTimeMillis2);
                rVar2.mo1507a(1);
            }
            bVar.mo590a((C0831b) null);
            return;
        }
        final C0233b bVar2 = bVar;
        C0826a aVar = new C0826a(a, kVar.mo1292g());
        final C0477n nVar2 = nVar;
        final C0482r rVar3 = rVar;
        C0977g.m4536a(aVar, b, c, new C0977g.C0979a() {
            /* renamed from: a */
            public void mo30a(C0831b bVar) {
                if (bVar.mo2643c()) {
                    C10638l.m31235b("TTAppOpenAdCacheManager", "Image loaded successfully");
                    C0224a.this.mo581c(f);
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C0251a.m983a(nVar2, currentTimeMillis, true);
                    C0482r rVar = rVar3;
                    if (rVar != null) {
                        rVar.mo1513c(currentTimeMillis);
                        rVar3.mo1507a(2);
                    }
                    bVar2.mo590a(bVar);
                    return;
                }
                C0251a.m983a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.mo589a();
            }

            /* renamed from: a */
            public void mo29a() {
                C10638l.m31235b("TTAppOpenAdCacheManager", "Image loading failed");
                C0251a.m983a(nVar2, System.currentTimeMillis() - currentTimeMillis, false);
                bVar2.mo589a();
            }

            /* renamed from: b */
            public void mo31b() {
                C10638l.m31235b("TTAppOpenAdCacheManager", "Image caching success");
            }
        }, b2.getParent());
    }

    /* renamed from: a */
    public static void m885a(C0477n nVar, final C0235d dVar) {
        C0750a.m3821a(nVar.mo1330J().mo62921h()).mo64107a(C10571t.BITMAP).mo64102a((C10565n) new C10565n<Bitmap>() {
            /* renamed from: a */
            public void mo257a(C10561j<Bitmap> jVar) {
                if (jVar == null || jVar.mo64116b() == null) {
                    C0235d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo36a();
                        return;
                    }
                    return;
                }
                C0235d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.mo37a(jVar.mo64116b());
                }
            }

            /* renamed from: a */
            public void mo256a(int i, String str, Throwable th) {
                C0235d dVar = dVar;
                if (dVar != null) {
                    dVar.mo36a();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo572a(int i) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("tt_openad", "video_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f753d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("video_has_cached" + i, true).apply();
    }

    /* renamed from: b */
    public boolean mo579b(int i) {
        if (C0934b.m4334c()) {
            return C0947a.m4407a("tt_openad", "video_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f753d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("video_has_cached" + i, false);
    }

    /* renamed from: c */
    public void mo581c(int i) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("tt_openad", "image_has_cached" + i, (Boolean) true);
            return;
        }
        SharedPreferences.Editor edit = this.f753d.getSharedPreferences("tt_openad", 0).edit();
        edit.putBoolean("image_has_cached" + i, true).apply();
    }

    /* renamed from: d */
    public boolean mo582d(int i) {
        if (C0934b.m4334c()) {
            return C0947a.m4407a("tt_openad", "image_has_cached" + i, false);
        }
        SharedPreferences sharedPreferences = this.f753d.getSharedPreferences("tt_openad", 0);
        return sharedPreferences.getBoolean("image_has_cached" + i, false);
    }

    /* renamed from: a */
    public void mo574a(C0253a aVar) {
        if (aVar.mo624b() != null && aVar.mo623a() != 0) {
            long ag = aVar.mo624b().mo1386ag();
            if (C0934b.m4334c()) {
                C0947a.m4403a("tt_openad", "material_expiration_time" + aVar.mo623a(), Long.valueOf(ag));
            } else {
                SharedPreferences.Editor edit = this.f753d.getSharedPreferences("tt_openad", 0).edit();
                edit.putLong("material_expiration_time" + aVar.mo623a(), ag).apply();
            }
            m887b(aVar);
        }
    }

    /* renamed from: e */
    public boolean mo583e(int i) {
        long j;
        if (C0934b.m4334c()) {
            j = C0947a.m4396a("tt_openad", "material_expiration_time" + i, -1);
        } else {
            SharedPreferences sharedPreferences = this.f753d.getSharedPreferences("tt_openad", 0);
            j = sharedPreferences.getLong("material_expiration_time" + i, -1);
        }
        if (System.currentTimeMillis() / 1000 < j) {
            return true;
        }
        if (j != -1) {
            C0477n f = mo584f(i);
            if (f != null) {
                C0251a.m978a(f);
            }
            mo585g(i);
        }
        return false;
    }

    /* renamed from: f */
    public C0477n mo584f(int i) {
        String str;
        String str2;
        if (C0934b.m4334c()) {
            str = C0947a.m4410b("tt_openad_materialMeta", "material" + i, (String) null);
        } else {
            str = this.f753d.getSharedPreferences("tt_openad_materialMeta", 0).getString("material" + i, (String) null);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt("cypher", -1);
                str2 = C10621a.m31188b(jSONObject.optString("message"));
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    C0477n a = C0402b.m1636a(new JSONObject(str2));
                    if (a != null) {
                        return a;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m887b(C0253a aVar) {
        C10615e.m31161a(new C0232a(aVar), 10, 5);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.a$a */
    /* compiled from: TTAppOpenAdCacheManager */
    private class C0232a extends C10618g {

        /* renamed from: b */
        private final C0253a f781b;

        public C0232a(C0253a aVar) {
            super("App Open Ad Write Cache");
            this.f781b = aVar;
        }

        public void run() {
            try {
                String jSONObject = C10621a.m31186a(this.f781b.mo624b().mo1397ar()).toString();
                if (C0934b.m4334c()) {
                    C0947a.m4404a("tt_openad_materialMeta", "material" + this.f781b.mo623a(), jSONObject);
                    return;
                }
                SharedPreferences.Editor edit = C0224a.this.f753d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
                edit.putString("material" + this.f781b.mo623a(), jSONObject).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public String mo569a(C0477n nVar) {
        if (!(nVar == null || nVar.mo1330J() == null || TextUtils.isEmpty(nVar.mo1330J().mo62923i()))) {
            String i = nVar.mo1330J().mo62923i();
            String l = nVar.mo1330J().mo62927l();
            String valueOf = String.valueOf(C0996u.m4657f(nVar));
            if (TextUtils.isEmpty(l)) {
                l = C10626e.m31201a(i);
            }
            File a = C0260a.m1011a(this.f753d, mo570a(valueOf), l);
            if (a.exists() && a.isFile()) {
                return a.getAbsolutePath();
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo580b(C0477n nVar) {
        if (nVar == null || nVar.mo1336P() == null || nVar.mo1336P().size() == 0 || TextUtils.isEmpty(nVar.mo1336P().get(0).mo1281a())) {
            return false;
        }
        C0463k kVar = nVar.mo1336P().get(0);
        return mo578a(kVar.mo1281a(), kVar.mo1292g());
    }

    /* renamed from: a */
    public boolean mo578a(String str, String str2) {
        boolean z;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = C10626e.m31201a(str);
            }
            File b = C0260a.m1017b(str2, 0);
            InputStream a = C0750a.m3823a(str, str2);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (C0750a.m3824a(str, str2, b.getParent())) {
                    return true;
                }
                if (new File(b.getPath() + ".0").exists()) {
                    return true;
                }
            }
            return z;
        } catch (Exception e2) {
            C10638l.m31242e("TTAppOpenAdCacheManager", e2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public void mo577a(File file) {
        try {
            this.f751b.mo64588a(file);
        } catch (IOException e) {
            C10638l.m31242e("TTAppOpenAdCacheManager", "trimFileCache IOException:" + e.toString());
        }
    }

    /* renamed from: g */
    public void mo585g(int i) {
        if (C0934b.m4334c()) {
            C0947a.m4412b("tt_openad_materialMeta", "material" + i);
            C0947a.m4412b("tt_openad", "material_expiration_time" + i);
            C0947a.m4412b("tt_openad", "video_has_cached" + i);
            C0947a.m4412b("tt_openad", "image_has_cached" + i);
            return;
        }
        SharedPreferences.Editor edit = this.f753d.getSharedPreferences("tt_openad_materialMeta", 0).edit();
        edit.remove("material" + i).apply();
        SharedPreferences.Editor edit2 = this.f753d.getSharedPreferences("tt_openad", 0).edit();
        SharedPreferences.Editor remove = edit2.remove("material_expiration_time" + i);
        SharedPreferences.Editor remove2 = remove.remove("video_has_cached" + i);
        remove2.remove("image_has_cached" + i).apply();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|(2:5|6)(1:7)|8|9|(1:34)(4:19|(5:21|22|23|28|24)|27|35)) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo571a() {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.C0934b.m4334c()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "tt_openad"
            java.lang.String r3 = "tt_openad_materialMeta"
            if (r1 == 0) goto L_0x0012
            com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4398a((java.lang.String) r3)     // Catch:{ all -> 0x0034 }
            com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4398a((java.lang.String) r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0034
        L_0x0012:
            android.content.Context r1 = r4.f753d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
            android.content.Context r1 = r4.f753d     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r1.clear()     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            android.content.Context r1 = r4.f753d     // Catch:{ all -> 0x0061 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0061
            com.bytedance.sdk.openadsdk.component.a$7 r2 = new com.bytedance.sdk.openadsdk.component.a$7     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
            if (r2 <= 0) goto L_0x0061
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
        L_0x0057:
            if (r0 >= r2) goto L_0x0061
            r3 = r1[r0]     // Catch:{ all -> 0x0061 }
            com.bytedance.sdk.component.utils.C10627f.m31210c(r3)     // Catch:{ all -> 0x005e }
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.C0224a.mo571a():void");
    }

    /* renamed from: a */
    public String mo570a(String str) {
        return C0934b.m4334c() ? "openad_video_cache/" : "/openad_video_cache/";
    }

    /* renamed from: h */
    public String mo586h(int i) {
        return C0934b.m4334c() ? "openad_image_cache/" : "/openad_image_cache/";
    }
}
