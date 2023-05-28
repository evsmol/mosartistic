package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.core.p021e.C0458h;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p053b.C0935a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0156p;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.y */
/* compiled from: WebHelper */
public class C0747y {

    /* renamed from: a */
    private static boolean f2882a = false;

    /* renamed from: a */
    public static void m3810a(boolean z) {
        f2882a = z;
    }

    /* renamed from: a */
    public static boolean m3811a(Context context, C0477n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, C1008c cVar, boolean z) {
        String str2;
        String str3;
        Context context2 = context;
        C0477n nVar2 = nVar;
        String str4 = str;
        if (context2 == null || nVar2 == null || i == -1) {
            return false;
        }
        C0458h ab = nVar.mo1381ab();
        if (ab != null) {
            String a = ab.mo1256a();
            if (!TextUtils.isEmpty(a)) {
                Uri parse = Uri.parse(ab.mo1256a());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!C0996u.m4684l(context)) {
                    try {
                        if (C0558m.m2673h().mo1681c()) {
                            C0996u.m4635b(nVar, str4);
                        }
                        if (!(context2 instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        C0136e.m627d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                        context.startActivity(intent);
                        C0156p.m729a().mo450a(nVar, str4);
                        return true;
                    } catch (Throwable unused) {
                        a = nVar.mo1335O();
                    }
                } else if (C0996u.m4628a(context, intent)) {
                    if (C0558m.m2673h().mo1681c()) {
                        C0996u.m4635b(nVar, str4);
                    }
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    final Context context3 = context;
                    final C0477n nVar3 = nVar;
                    final int i2 = i;
                    final String str5 = str;
                    final boolean z2 = z;
                    C10622b.m31190a(context, intent, new C10622b.C10623a() {
                        /* renamed from: a */
                        public void mo299a() {
                        }

                        /* renamed from: a */
                        public void mo300a(Throwable th) {
                            if (!C0558m.m2673h().mo1681c()) {
                                C0747y.m3813a(context3, nVar3.mo1335O(), nVar3, i2, str5, z2);
                                C10638l.m31239c("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", th);
                            }
                        }
                    });
                    C0136e.m627d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                    C0156p.m729a().mo450a(nVar, str4);
                    return true;
                }
            }
            if (ab.mo1261c() != 2 || nVar.mo1383ad() == 5 || nVar.mo1383ad() == 15) {
                if (ab.mo1261c() == 1) {
                    a = ab.mo1259b();
                } else {
                    a = nVar.mo1335O();
                }
            } else if (cVar != null) {
                if (cVar.mo2925a()) {
                    C0136e.m627d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else if (cVar.mo2931e()) {
                    C0136e.m627d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else {
                    C0136e.m627d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return false;
                }
            }
            C0136e.m627d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
            str2 = a;
        } else {
            if (!nVar.mo1402aw() || nVar.mo1403ax() == null) {
                str3 = nVar.mo1335O();
            } else {
                str3 = nVar.mo1403ax().mo1744i();
            }
            str2 = str3;
        }
        return m3812a(context, nVar, i, tTNativeAd, tTNativeExpressAd, str, z, str2);
    }

    /* renamed from: a */
    public static boolean m3812a(Context context, C0477n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, boolean z, String str2) {
        Context context2 = context;
        if (TextUtils.isEmpty(str2) && !C0480p.m2190a(nVar)) {
            return false;
        }
        if (nVar.mo1332L() != 2) {
            C10622b.m31190a(context, m3809a(context, str2, nVar, i, tTNativeAd, tTNativeExpressAd, str, z), (C10622b.C10623a) null);
            f2882a = false;
            return true;
        } else if (!C10642o.m31258a(str2)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            try {
                intent.setData(Uri.parse(str2));
                if (!(context2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C10622b.m31190a(context, intent, (C10622b.C10623a) null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m3813a(Context context, String str, C0477n nVar, int i, String str2, boolean z) {
        try {
            context.startActivity(m3809a(context, str, nVar, i, (TTNativeAd) null, (TTNativeExpressAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m3809a(Context context, String str, C0477n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str2, boolean z) {
        Intent intent;
        if (!C0480p.m2190a(nVar) || (tTNativeAd == null && tTNativeExpressAd == null)) {
            intent = (nVar.mo1332L() != 3 || (nVar.mo1428f() != 2 && (nVar.mo1428f() != 1 || !f2882a)) || nVar.f1667a) ? new Intent(context, TTLandingPageActivity.class) : new Intent(context, TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", m3814a(nVar, z));
            String c = C0480p.m2192c(nVar);
            if (!TextUtils.isEmpty(c)) {
                if (c.contains("?")) {
                    str = c + "&orientation=portrait";
                } else {
                    str = c + "?orientation=portrait";
                }
            }
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", nVar.mo1385af());
        intent.putExtra("web_title", nVar.mo1341U());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", nVar.mo1345Y());
        intent.putExtra("log_extra", nVar.mo1382ac());
        C0935a aVar = null;
        intent.putExtra("icon_url", nVar.mo1333M() == null ? null : nVar.mo1333M().mo1281a());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (C0934b.m4334c()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, nVar.mo1397ar().toString());
        } else {
            C0625t.m3022a().mo2036h();
            C0625t.m3022a().mo2026a(nVar);
        }
        if (nVar.mo1383ad() == 5 || nVar.mo1383ad() == 15 || nVar.mo1383ad() == 50) {
            if (tTNativeAd != null) {
                if (tTNativeAd instanceof C0935a.C0936a) {
                    aVar = ((C0935a.C0936a) tTNativeAd).mo612f();
                }
                if (aVar != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.mo2873a().toString());
                }
            }
            if (!(tTNativeExpressAd == null || (aVar = tTNativeExpressAd.getVideoModel()) == null)) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.mo2873a().toString());
            }
            if (aVar != null) {
                intent.putExtra("video_is_auto_play", aVar.f3249d);
                if (C10638l.m31240c()) {
                    C10638l.m31238c("videoDataModel", "videoDataModel=" + aVar.mo2873a().toString());
                }
            }
        }
        return intent;
    }

    /* renamed from: a */
    private static boolean m3814a(C0477n nVar, boolean z) {
        if (z && nVar != null && nVar.mo1332L() == 4 && C0480p.m2190a(nVar)) {
            return true;
        }
        return false;
    }
}
