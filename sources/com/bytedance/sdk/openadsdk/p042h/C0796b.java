package com.bytedance.sdk.openadsdk.p042h;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C0434c;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0794a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.b */
/* compiled from: StatsLogManager */
public class C0796b {

    /* renamed from: a */
    private static volatile C0796b f2977a;

    /* renamed from: b */
    private ExecutorService f2978b = Executors.newFixedThreadPool(5);

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m3990g(C0795b bVar) {
        return bVar == null;
    }

    private C0796b() {
    }

    /* renamed from: a */
    public static C0796b m3985a() {
        if (f2977a == null) {
            synchronized (C0796b.class) {
                if (f2977a == null) {
                    f2977a = new C0796b();
                }
            }
        }
        return f2977a;
    }

    /* renamed from: a */
    public void mo2603a(final C0795b bVar) {
        if (!m3990g(bVar)) {
            bVar.mo2578a(System.currentTimeMillis() / 1000);
            C0558m.m2674i().mo2622a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo2610b(final C0795b bVar) {
        if (!m3990g(bVar)) {
            bVar.mo2579a("express_ad_render");
            bVar.mo2578a(System.currentTimeMillis() / 1000);
            C0558m.m2674i().mo2622a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m3988a(String str, int i) {
        C0434c a = C0434c.m1779a(C0558m.m2663a());
        boolean z = false;
        int b = a.mo1178b(str, 0);
        if ((b & 2) == 0 || (b & 1) != i) {
            z = true;
        }
        if (z) {
            a.mo1174a(str, i + 2);
        }
        return z;
    }

    /* renamed from: c */
    public void mo2613c(final C0795b bVar) {
        if (!m3990g(bVar)) {
            this.f2978b.execute(new Runnable() {
                public void run() {
                    if (!C0796b.this.m3990g(bVar) && C0796b.this.m3988a(bVar.mo2587e(), 1)) {
                        bVar.mo2579a("reg_creative");
                        C0558m.m2674i().mo2622a(new C0793a() {
                            /* renamed from: a */
                            public C0794a mo322a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo2614d(final C0795b bVar) {
        if (!m3990g(bVar)) {
            this.f2978b.execute(new Runnable() {
                public void run() {
                    if (!C0796b.this.m3990g(bVar) && C0796b.this.m3988a(bVar.mo2587e(), 0)) {
                        bVar.mo2579a("no_reg_creative");
                        C0558m.m2674i().mo2622a(new C0793a() {
                            /* renamed from: a */
                            public C0794a mo322a() throws Exception {
                                return bVar;
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public void mo2615e(final C0795b bVar) {
        if (!m3990g(bVar)) {
            bVar.mo2579a("load_icon_error");
            C0558m.m2674i().mo2622a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: f */
    public void mo2616f(final C0795b bVar) {
        if (!m3990g(bVar)) {
            bVar.mo2579a("show_backup_endcard");
            bVar.mo2578a(System.currentTimeMillis() / 1000);
            C0558m.m2674i().mo2622a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return bVar;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo2609a(JSONObject jSONObject) {
        if (jSONObject != null) {
            final C0795b b = C0795b.m3955b().mo2579a("app_env").mo2578a(System.currentTimeMillis() / 1000).mo2581b(jSONObject.toString());
            C0558m.m2674i().mo2622a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return b;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo2605a(final String str) {
        C0558m.m2674i().mo2623a(new C0793a() {
            /* renamed from: a */
            public C0794a mo322a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return C0795b.m3955b().mo2579a("click_playable_test_tool").mo2581b(jSONObject.toString());
            }
        }, false);
    }

    /* renamed from: b */
    public void mo2611b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
        } catch (Throwable unused) {
        }
        final C0795b b = C0795b.m3955b().mo2579a("close_playable_test_tool").mo2581b(jSONObject.toString());
        C0558m.m2674i().mo2623a(new C0793a() {
            /* renamed from: a */
            public C0794a mo322a() throws Exception {
                return b;
            }
        }, false);
    }

    /* renamed from: a */
    public void mo2606a(String str, int i, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
            jSONObject.put("error_code", i);
            jSONObject.put("error_message", str2);
        } catch (Throwable unused) {
        }
        final C0795b b = C0795b.m3955b().mo2579a("use_playable_test_tool_error").mo2581b(jSONObject.toString());
        C0558m.m2674i().mo2623a(new C0793a() {
            /* renamed from: a */
            public C0794a mo322a() throws Exception {
                return b;
            }
        }, false);
    }

    /* renamed from: a */
    public void mo2602a(long j, long j2, int i) {
        final long j3 = j2 - j;
        final long j4 = j;
        final long j5 = j2;
        final int i2 = i;
        C0558m.m2674i().mo2623a(new C0793a() {
            /* renamed from: a */
            public C0794a mo322a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j4);
                    jSONObject.put("endtime", j5);
                    jSONObject.put("start_type", i2);
                } catch (Throwable unused) {
                }
                C0795b a = C0795b.m3955b().mo2579a("general_label");
                return a.mo2592h(j3 + "").mo2581b(jSONObject.toString());
            }
        }, false);
    }

    /* renamed from: a */
    public void mo2607a(final String str, long j) {
        if (!C10148a.m28919b()) {
            final long currentTimeMillis = System.currentTimeMillis() - j;
            C0558m.m2674i().mo2623a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, currentTimeMillis);
                        jSONObject.put("method_name", str);
                    } catch (Throwable unused) {
                    }
                    return C0795b.m3955b().mo2579a("log_mssdk_method_time_report").mo2581b(jSONObject.toString());
                }
            }, false);
        }
    }

    /* renamed from: a */
    public void mo2608a(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            final C0795b b = C0795b.m3955b().mo2579a(str).mo2581b(jSONObject.toString());
            C0558m.m2674i().mo2623a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return b;
                }
            }, false);
        }
    }

    /* renamed from: b */
    public static void m3989b() {
        try {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    long a = m3984a(file2);
                    j += a;
                    jSONObject.put(file2.getName(), a);
                }
            }
            if (j >= 524288000) {
                final C0795b b = C0795b.m3955b().mo2579a("disk_log").mo2581b(jSONObject.toString());
                C0558m.m2674i().mo2623a(new C0793a() {
                    /* renamed from: a */
                    public C0794a mo322a() throws Exception {
                        return b;
                    }
                }, false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo2612c() {
        try {
            C0558m.m2674i().mo2623a(new C0793a() {
                /* renamed from: a */
                public C0794a mo322a() throws Exception {
                    return C0795b.m3955b().mo2579a("bidding_get_creative");
                }
            }, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static long m3984a(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j = 0;
        for (File a : file.listFiles()) {
            j += m3984a(a);
        }
        return j;
    }

    /* renamed from: a */
    public void mo2604a(C0793a aVar) {
        C0558m.m2674i().mo2623a(aVar, false);
    }
}
