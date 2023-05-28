package com.bytedance.sdk.openadsdk.core.video.p033b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p312c.C10486a;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10577a;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10621a;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10627f;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0379a;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a */
/* compiled from: PlayableCache */
public class C0642a {

    /* renamed from: a */
    private static volatile C0642a f2395a;

    /* renamed from: b */
    private String f2396b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<C0477n, C0648b> f2397c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private Map<String, JSONObject> f2398d = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicBoolean f2399e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Set<String> f2400f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    private Handler f2401g = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$a */
    /* compiled from: PlayableCache */
    public interface C0647a {
        /* renamed from: a */
        void mo868a(boolean z);
    }

    /* renamed from: a */
    public static C0642a m3091a() {
        if (f2395a == null) {
            synchronized (C0642a.class) {
                if (f2395a == null) {
                    f2395a = new C0642a();
                }
            }
        }
        return f2395a;
    }

    private C0642a() {
    }

    /* renamed from: a */
    public boolean mo2123a(C0477n nVar) {
        if (!(!this.f2399e.get() || nVar == null || nVar.mo1330J() == null || nVar.mo1330J().mo62926k() == null)) {
            try {
                String a = C10626e.m31201a(nVar.mo1330J().mo62926k());
                if (this.f2398d.get(a) == null) {
                    return false;
                }
                return m3110e(new File(m3104c(), a));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo2124b() {
        if (!this.f2399e.get()) {
            C10615e.m31160a(new C10618g("PlayableCache_init") {
                public void run() {
                    File[] listFiles;
                    try {
                        String a = C0642a.this.m3104c();
                        if (!TextUtils.isEmpty(a)) {
                            File file = new File(a);
                            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                                for (File a2 : listFiles) {
                                    try {
                                        JSONObject unused = C0642a.this.m3097a(C0642a.this.m3093a(a2), true);
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    C0642a.this.f2399e.set(true);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject m3097a(File file, boolean z) {
        byte[] d;
        String str;
        try {
            if (!m3103b(file) || (d = C10627f.m31211d(file)) == null || d.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                str = C10621a.m31188b(new String(d));
            } else {
                str = C10486a.m30630a(new String(d), C0379a.m1622a());
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z && jSONObject.length() > 0) {
                this.f2398d.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File m3093a(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        if (m3103b(file2)) {
            return file2;
        }
        return new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    /* renamed from: b */
    private boolean m3103b(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|(2:17|(1:19))|20|21|(1:23)(2:24|(1:26)(3:27|(2:29|(1:31)(2:32|(1:34)(2:35|(2:39|40))))|44))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ all -> 0x00b1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[Catch:{ all -> 0x00b1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse mo2121a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f2399e     // Catch:{ all -> 0x00b1 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x001e
            goto L_0x00b0
        L_0x001e:
            java.lang.String r1 = "http"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "?"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "\\?"
            java.lang.String[] r1 = r7.split(r1)     // Catch:{ all -> 0x0049 }
            r2 = 0
            r7 = r1[r2]     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "/"
            boolean r1 = r7.endsWith(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            int r1 = r7.length()     // Catch:{ all -> 0x0049 }
            int r1 = r1 + -1
            java.lang.String r7 = r7.substring(r2, r1)     // Catch:{ all -> 0x0049 }
        L_0x0049:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = com.bytedance.sdk.component.utils.C10640n.m31246a((android.content.Context) r1, (java.lang.String) r7)     // Catch:{ all -> 0x00b1 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.String r5 = com.bytedance.sdk.component.utils.C10626e.m31201a((java.lang.String) r5)     // Catch:{ all -> 0x00b1 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0063
            return r0
        L_0x0063:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r4.m3104c()     // Catch:{ all -> 0x00b1 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x00b1 }
            boolean r3 = r4.m3110e(r2)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00b9
            java.lang.String r6 = r4.m3095a((java.lang.String) r6)     // Catch:{ all -> 0x00b1 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x007d
            return r0
        L_0x007d:
            java.lang.String r3 = ""
            java.lang.String r6 = r7.replace(r6, r3)     // Catch:{ all -> 0x00b1 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r7 == 0) goto L_0x008a
            return r0
        L_0x008a:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00b1 }
            r7.<init>(r2, r6)     // Catch:{ all -> 0x00b1 }
            boolean r5 = r4.m3100a((java.lang.String) r5, (java.lang.String) r6, (java.io.File) r7)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r5 = r7.getCanonicalPath()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r2.getCanonicalPath()     // Catch:{ all -> 0x00b1 }
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b9
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00b1 }
            r2.<init>(r7)     // Catch:{ all -> 0x00b1 }
            r5.<init>(r1, r6, r2)     // Catch:{ all -> 0x00b1 }
            return r5
        L_0x00b0:
            return r0
        L_0x00b1:
            r5 = move-exception
            java.lang.String r6 = "PlayableCache"
            java.lang.String r7 = "playable intercept error: "
            com.bytedance.sdk.component.utils.C10638l.m31239c(r6, r7, r5)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.mo2121a(java.lang.String, java.lang.String, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    private String m3095a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            if (split[0] != null && split[0].endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            if (split[0] != null && split[0].endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    /* renamed from: a */
    private boolean m3100a(String str, String str2, File file) {
        JSONObject jSONObject;
        String optString;
        if (file == null || !file.exists() || (jSONObject = this.f2398d.get(str)) == null || (optString = jSONObject.optString(str2)) == null || !optString.equalsIgnoreCase(C10626e.m31200a(file))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo2122a(C0477n nVar, C0647a aVar) {
        if (nVar == null || nVar.mo1330J() == null || TextUtils.isEmpty(nVar.mo1330J().mo62926k())) {
            C0649b.m3125a(C0558m.m2663a(), nVar, -701, (String) null);
            m3098a(aVar, false);
            return;
        }
        final String k = nVar.mo1330J().mo62926k();
        if (!this.f2400f.contains(k)) {
            this.f2397c.put(nVar, new C0648b().mo2129a(System.currentTimeMillis()));
            C0649b.m3124a(C0558m.m2663a(), nVar);
            String a = C10626e.m31201a(k);
            final File file = new File(m3104c(), a);
            if (m3110e(file)) {
                C0649b.m3125a(C0558m.m2663a(), nVar, -702, (String) null);
                m3109d(file);
                this.f2397c.remove(nVar);
                m3098a(aVar, true);
                return;
            }
            try {
                C10627f.m31210c(file);
            } catch (Throwable unused) {
            }
            this.f2400f.add(k);
            String d = m3107d();
            File file2 = new File(d, a + ".zip");
            C10577a d2 = C0835d.m4093a().mo2660b().mo64152d();
            d2.mo64176a(k);
            d2.mo64171a(file2.getParent(), file2.getName());
            final C0477n nVar2 = nVar;
            final C0647a aVar2 = aVar;
            d2.mo64170a((C10575a) new C10575a() {
                /* renamed from: a */
                public void mo444a(C10581c cVar, final C10576b bVar) {
                    C0642a.this.f2400f.remove(k);
                    final C0648b bVar2 = (C0648b) C0642a.this.f2397c.remove(nVar2);
                    if (bVar2 != null) {
                        bVar2.mo2131b(System.currentTimeMillis());
                    }
                    if (!bVar.mo64166f() || bVar.mo64165e() == null || !bVar.mo64165e().exists()) {
                        int i = -700;
                        if (bVar.mo64160a() != 0) {
                            i = bVar.mo64160a();
                        }
                        C0649b.m3125a(C0558m.m2663a(), nVar2, i, (String) null);
                        C10638l.m31238c("PlayableCache", "onResponse: Playable zip download fail");
                        C0642a.this.m3098a(aVar2, false);
                        return;
                    }
                    C10638l.m31238c("PlayableCache", "onResponse: Playable zip download success");
                    C10615e.m31160a(new C10618g("downloadZip") {
                        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(10:1|2|(1:4)|5|(1:7)|8|(1:10)(1:11)|12|13|14)|17|18|19|21) */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008b */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                                r7 = this;
                                r0 = 1
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                if (r1 == 0) goto L_0x000e
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
                                r1.mo2132c(r2)     // Catch:{ all -> 0x0071 }
                            L_0x000e:
                                com.bytedance.sdk.component.e.b r1 = r5     // Catch:{ all -> 0x0071 }
                                java.io.File r1 = r1.mo64165e()     // Catch:{ all -> 0x0071 }
                                java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.this     // Catch:{ all -> 0x0071 }
                                java.lang.String r2 = r2.m3104c()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.component.utils.C10654y.m31321a(r1, r2)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                if (r1 == 0) goto L_0x0030
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
                                r1.mo2133d(r2)     // Catch:{ all -> 0x0071 }
                            L_0x0030:
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                r2 = 0
                                if (r1 == 0) goto L_0x0045
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = r1.mo2128a()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r4 = r1.mo2130b()     // Catch:{ all -> 0x0071 }
                                r5 = r4
                                r3 = r2
                                goto L_0x0047
                            L_0x0045:
                                r5 = r2
                                r3 = r5
                            L_0x0047:
                                android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.e.n r2 = r5     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.p033b.C0649b.m3126a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x0071 }
                                java.io.File r2 = r6     // Catch:{ all -> 0x0071 }
                                r1.m3106c((java.io.File) r2)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x008b }
                                java.io.File r2 = r6     // Catch:{ all -> 0x008b }
                                java.io.File r1 = r1.m3093a((java.io.File) r2)     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.this     // Catch:{ all -> 0x008b }
                                org.json.JSONObject unused = r2.m3097a((java.io.File) r1, (boolean) r0)     // Catch:{ all -> 0x008b }
                                goto L_0x008b
                            L_0x0071:
                                r0 = move-exception
                                java.lang.String r1 = "PlayableCache"
                                java.lang.String r2 = "unzip error: "
                                com.bytedance.sdk.component.utils.C10638l.m31239c(r1, r2, r0)
                                android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this
                                com.bytedance.sdk.openadsdk.core.e.n r2 = r5
                                r3 = -704(0xfffffffffffffd40, float:NaN)
                                java.lang.String r0 = r0.getMessage()
                                com.bytedance.sdk.openadsdk.core.video.p033b.C0649b.m3125a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r2, (int) r3, (java.lang.String) r0)
                                r0 = 0
                            L_0x008b:
                                com.bytedance.sdk.component.e.b r1 = r5     // Catch:{ all -> 0x0094 }
                                java.io.File r1 = r1.mo64165e()     // Catch:{ all -> 0x0094 }
                                r1.delete()     // Catch:{ all -> 0x0094 }
                            L_0x0094:
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.this
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.this
                                com.bytedance.sdk.openadsdk.core.video.b.a$a r2 = r7
                                r1.m3098a((com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C0647a) r2, (boolean) r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.C06442.C06451.run():void");
                        }
                    }, 5);
                }

                /* renamed from: a */
                public void mo445a(C10581c cVar, IOException iOException) {
                    C0642a.this.f2400f.remove(k);
                    C0642a.this.f2397c.remove(nVar2);
                    C0649b.m3125a(C0558m.m2663a(), nVar2, -700, iOException.getMessage());
                    C0642a.this.m3098a(aVar2, false);
                    C10638l.m31238c("PlayableCache", "onFailure: Playable zip download fail");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3098a(final C0647a aVar, final boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (aVar != null) {
                aVar.mo868a(z);
            }
        } else if (aVar != null) {
            this.f2401g.post(new Runnable() {
                public void run() {
                    C0647a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo868a(z);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3106c(File file) {
        m3109d(file);
        try {
            C0503h.m2281d().mo1615p().mo64588a(file);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m3109d(File file) {
        try {
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!file.setLastModified(currentTimeMillis)) {
                    file.renameTo(file);
                    if (file.lastModified() < currentTimeMillis) {
                        C10638l.m31241d("PlayableCache", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private boolean m3110e(File file) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return false;
        }
        return Arrays.asList(list).contains("index.html");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m3104c() {
        File file = new File(m3107d(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* renamed from: d */
    private String m3107d() {
        if (TextUtils.isEmpty(this.f2396b)) {
            try {
                File file = new File(C0558m.m2663a().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f2396b = file.getAbsolutePath();
            } catch (Throwable th) {
                C10638l.m31242e("PlayableCache", "init root path error: " + th);
            }
        }
        return this.f2396b;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$b */
    /* compiled from: PlayableCache */
    private static class C0648b {

        /* renamed from: a */
        long f2414a;

        /* renamed from: b */
        long f2415b;

        /* renamed from: c */
        long f2416c;

        /* renamed from: d */
        long f2417d;

        private C0648b() {
        }

        /* renamed from: a */
        public long mo2128a() {
            return this.f2415b - this.f2414a;
        }

        /* renamed from: b */
        public long mo2130b() {
            return this.f2417d - this.f2416c;
        }

        /* renamed from: a */
        public C0648b mo2129a(long j) {
            this.f2414a = j;
            return this;
        }

        /* renamed from: b */
        public C0648b mo2131b(long j) {
            this.f2415b = j;
            return this;
        }

        /* renamed from: c */
        public C0648b mo2132c(long j) {
            this.f2416c = j;
            return this;
        }

        /* renamed from: d */
        public C0648b mo2133d(long j) {
            this.f2417d = j;
            return this;
        }
    }
}
