package com.bytedance.sdk.openadsdk.p000b.p002b.p003a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p287b.C10185a;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.p001a.C0109a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0116a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0117b;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0119d;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0120e;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0121f;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0122g;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0123h;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0124i;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0125j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0126k;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0127l;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0128m;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0129n;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;
import com.bytedance.sdk.openadsdk.p042h.C0793a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0794a;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.a.a */
/* compiled from: VideoEventManager */
public class C0113a {

    /* renamed from: a */
    private static final Map<C10185a, C0130o> f454a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public static JSONObject m467a(C0477n nVar, String str, int i, int i2) {
        C10187b J;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (!(nVar == null || (J = nVar.mo1330J()) == null)) {
                jSONObject.put("video_resolution", J.mo62919g());
                jSONObject.put("video_size", Long.valueOf(J.mo62913e()));
                jSONObject.put("video_url", J.mo62923i());
                jSONObject.put("player_type", i2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m471a(C0116a<C0126k> aVar) {
        m472a((C0116a) aVar, "load_video_start");
    }

    /* renamed from: b */
    public static void m481b(C0116a<C0127l> aVar) {
        m472a((C0116a) aVar, "load_video_success");
    }

    /* renamed from: c */
    public static void m484c(C0116a<C0125j> aVar) {
        m472a((C0116a) aVar, "load_video_error");
    }

    /* renamed from: d */
    public static void m487d(C0116a<C0124i> aVar) {
        m472a((C0116a) aVar, "load_video_cancel");
    }

    /* renamed from: a */
    public static void m476a(C0477n nVar, C10185a aVar, C10188c cVar) {
        if (nVar != null && aVar != null && cVar != null) {
            String a = C0984l.m4553a();
            boolean z = true;
            int i = CacheDirFactory.getICacheDir(nVar.mo1373aD()).mo62647a(cVar) ? 1 : 2;
            f454a.put(aVar, new C0130o(SystemClock.elapsedRealtime(), a, i, cVar, nVar));
            C0116a aVar2 = new C0116a(nVar, C0996u.m4617a(nVar), m467a(nVar, a, i, cVar.mo62963l()), null);
            if (cVar.mo62963l() != -1) {
                z = false;
            }
            aVar2.mo324a(z);
            m472a(aVar2, "play_start");
        }
    }

    /* renamed from: a */
    public static void m468a(Context context, C10185a aVar, C0130o.C0131a aVar2, C0146j jVar) {
        C0130o oVar;
        if (context != null && aVar != null && aVar2 != null && (oVar = f454a.get(aVar)) != null) {
            C10188c d = oVar.mo368d();
            C0477n e = oVar.mo369e();
            if (d != null && e != null) {
                if (!aVar2.mo391l()) {
                    m477a(e, d, aVar2);
                }
                C0123h hVar = new C0123h();
                hVar.mo345a(aVar2.mo392m() ? 1 : 0);
                hVar.mo347b(CacheDirFactory.getICacheDir(e.mo1373aD()).mo62648b(d));
                hVar.mo346a(SystemClock.elapsedRealtime() - oVar.mo365a());
                C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), hVar);
                aVar3.mo324a(aVar2.mo391l());
                m473a(aVar3, "feed_play", jVar);
            }
        }
    }

    /* renamed from: a */
    public static void m469a(C10185a aVar, C0130o.C0131a aVar2) {
        C0130o oVar;
        if (aVar != null && aVar2 != null && (oVar = f454a.get(aVar)) != null) {
            C10188c d = oVar.mo368d();
            C0477n e = oVar.mo369e();
            if (d != null && e != null) {
                long a = aVar2.mo370a();
                long c = aVar2.mo377c();
                if (c > 0 && a > 0) {
                    C0122g gVar = new C0122g();
                    gVar.mo343a(aVar2.mo374b());
                    gVar.mo344b(c);
                    C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), gVar);
                    aVar3.mo324a(aVar2.mo391l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, a);
                        jSONObject.put("percent", aVar2.mo387h());
                        m474a(aVar3, "feed_pause", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m479b(C10185a aVar, C0130o.C0131a aVar2) {
        C0130o oVar;
        if (aVar != null && aVar2 != null && (oVar = f454a.get(aVar)) != null) {
            C10188c d = oVar.mo368d();
            C0477n e = oVar.mo369e();
            if (d != null && e != null) {
                long a = aVar2.mo370a();
                long c = aVar2.mo377c();
                if (c > 0 && a > 0) {
                    C0120e eVar = new C0120e();
                    eVar.mo338a(aVar2.mo374b());
                    eVar.mo339b(c);
                    C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), eVar);
                    aVar3.mo324a(aVar2.mo391l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, a);
                        jSONObject.put("percent", aVar2.mo387h());
                        m474a(aVar3, "feed_continue", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m483c(C10185a aVar, C0130o.C0131a aVar2) {
        C0130o oVar;
        if (aVar != null && aVar2 != null && (oVar = f454a.get(aVar)) != null) {
            C10188c d = oVar.mo368d();
            C0477n e = oVar.mo369e();
            if (d != null && e != null) {
                long a = aVar2.mo370a();
                long c = aVar2.mo377c();
                C0129n nVar = new C0129n();
                nVar.mo362a(aVar2.mo374b());
                nVar.mo364b(c);
                nVar.mo361a(aVar2.mo380d());
                nVar.mo363b(aVar2.mo382e());
                C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), nVar);
                aVar3.mo324a(aVar2.mo391l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, a);
                    jSONObject.put("percent", aVar2.mo387h());
                    m474a(aVar3, "play_error", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: d */
    public static void m486d(C10185a aVar, C0130o.C0131a aVar2) {
        C0130o oVar;
        if (aVar != null && aVar2 != null && (oVar = f454a.get(aVar)) != null) {
            C10188c d = oVar.mo368d();
            C0477n e = oVar.mo369e();
            if (d != null && e != null) {
                long a = aVar2.mo370a();
                long c = aVar2.mo377c();
                C0117b bVar = new C0117b();
                bVar.mo330a(aVar2.mo374b());
                bVar.mo333b(c);
                bVar.mo329a(aVar2.mo384f());
                bVar.mo332b(aVar2.mo386g());
                C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), bVar);
                aVar3.mo324a(aVar2.mo391l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, a);
                    jSONObject.put("percent", aVar2.mo387h());
                    m474a(aVar3, "endcard_skip", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f454a.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m470a(C10185a aVar, C0130o.C0131a aVar2, C0146j jVar) {
        C0130o oVar;
        if (aVar != null && aVar2 != null && (oVar = f454a.get(aVar)) != null) {
            C10188c d = oVar.mo368d();
            C0477n e = oVar.mo369e();
            if (d != null && e != null) {
                long a = aVar2.mo370a();
                long c = aVar2.mo377c();
                C0119d dVar = new C0119d();
                dVar.mo337b(aVar2.mo374b());
                dVar.mo335a(c);
                dVar.mo334a(aVar2.mo388i());
                dVar.mo336b(aVar2.mo389j());
                C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), dVar);
                aVar3.mo324a(aVar2.mo391l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, a);
                    jSONObject.put("percent", aVar2.mo387h());
                    m475a(aVar3, "feed_break", jSONObject, jVar);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f454a.remove(aVar);
            }
        }
    }

    /* renamed from: b */
    public static void m480b(C10185a aVar, C0130o.C0131a aVar2, C0146j jVar) {
        if (aVar != null && aVar2 != null) {
            m488e(aVar, aVar2);
            C0130o oVar = f454a.get(aVar);
            if (oVar != null) {
                C10188c d = oVar.mo368d();
                C0477n e = oVar.mo369e();
                if (d != null && e != null) {
                    long a = aVar2.mo370a();
                    long c = aVar2.mo377c();
                    if (c > 0) {
                        C0121f fVar = new C0121f();
                        fVar.mo342b(aVar2.mo374b());
                        fVar.mo341a(c);
                        fVar.mo340a(aVar2.mo389j());
                        C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), fVar);
                        aVar3.mo324a(aVar2.mo391l());
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, a);
                            jSONObject.put("percent", aVar2.mo387h());
                            m475a(aVar3, "feed_over", jSONObject, jVar);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        f454a.remove(aVar);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m488e(C10185a aVar, C0130o.C0131a aVar2) {
        if (aVar != null && aVar2 != null) {
            if (aVar2.mo390k() <= 0) {
                C10638l.m31238c("VideoEventManager", "Cancel log report when buffer count is 0");
                return;
            }
            C0130o oVar = f454a.get(aVar);
            if (oVar != null) {
                C10188c d = oVar.mo368d();
                C0477n e = oVar.mo369e();
                if (d != null && e != null) {
                    long c = aVar2.mo377c();
                    if (c > 0) {
                        C0128m mVar = new C0128m();
                        mVar.mo359a(aVar2.mo374b());
                        mVar.mo360b(c);
                        mVar.mo358a(aVar2.mo390k());
                        C0116a aVar3 = new C0116a(e, C0996u.m4617a(e), m467a(e, oVar.mo366b(), oVar.mo367c(), d.mo62963l()), mVar);
                        aVar3.mo324a(aVar2.mo391l());
                        m472a(aVar3, "play_buffer");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m472a(C0116a aVar, String str) {
        m475a(aVar, str, (JSONObject) null, (C0146j) null);
    }

    /* renamed from: a */
    private static void m474a(C0116a aVar, String str, JSONObject jSONObject) {
        m475a(aVar, str, jSONObject, (C0146j) null);
    }

    /* renamed from: a */
    private static void m473a(C0116a aVar, String str, C0146j jVar) {
        m475a(aVar, str, (JSONObject) null, jVar);
    }

    /* renamed from: a */
    private static void m475a(final C0116a aVar, String str, JSONObject jSONObject, final C0146j jVar) {
        if (aVar != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            if (aVar.mo328e() && !TextUtils.isEmpty(aVar.mo325b())) {
                String b = aVar.mo325b();
                char c = 65535;
                int hashCode = b.hashCode();
                if (hashCode != -891990144) {
                    if (hashCode != -712491894) {
                        if (hashCode == 1912999166 && b.equals("draw_ad")) {
                            c = 2;
                        }
                    } else if (b.equals("embeded_ad")) {
                        c = 0;
                    }
                } else if (b.equals("stream")) {
                    c = 1;
                }
                if (c == 0 || c == 1 || c == 2) {
                    str = "customer_" + str;
                }
            }
            final String str2 = str;
            C0136e.m612a(aVar.mo323a(), aVar.mo325b(), str2, jSONObject2, jVar, (C0109a) new C0109a() {
                /* renamed from: a */
                public void mo320a(JSONObject jSONObject) throws JSONException {
                    C0146j jVar;
                    JSONObject c = aVar.mo326c();
                    if (aVar.mo327d() != null) {
                        aVar.mo327d().mo331a(c);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (jVar = jVar) != null) {
                        jVar.mo419a(c);
                    }
                    jSONObject.put("ad_extra_data", c.toString());
                }
            });
        }
    }

    /* renamed from: a */
    private static void m477a(final C0477n nVar, final C10188c cVar, final C0130o.C0131a aVar) {
        C0796b.m3985a().mo2604a((C0793a) new C0793a() {
            /* renamed from: a */
            public C0794a mo322a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", C0113a.m482c(cVar));
                jSONObject.put("player_duration", aVar.mo377c());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", cVar.mo62961j());
                jSONObject.put("path", C0113a.m485d(cVar));
                jSONObject.put("player_type", cVar.mo62963l());
                return C0795b.m3955b().mo2579a("pangle_video_play_state").mo2577a(C0996u.m4653e(nVar)).mo2581b(jSONObject.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static long m482c(C10188c cVar) {
        if (cVar == null) {
            return 0;
        }
        C10187b r = cVar.mo62960i() ? cVar.mo62969r() : cVar.mo62968q();
        if (r != null) {
            return Double.valueOf(r.mo62916f() * 1000.0d).longValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m485d(C10188c cVar) {
        return new File(cVar.mo62936a(), cVar.mo62962k()).getAbsolutePath();
    }
}
