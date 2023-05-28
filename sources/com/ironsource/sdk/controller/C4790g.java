package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.p137a.C4743a;
import com.ironsource.sdk.p137a.C4747d;
import com.ironsource.sdk.p137a.C4748e;
import com.ironsource.sdk.p137a.C4749f;
import com.ironsource.sdk.p144g.C4935c;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.p144g.C4942e;
import com.ironsource.sdk.p145h.C4944a;
import com.ironsource.sdk.p145h.C4945b;
import com.ironsource.sdk.p145h.C4949d;
import com.ironsource.sdk.p147j.C4960d;
import com.ironsource.sdk.p147j.C4961e;
import com.ironsource.sdk.p147j.p148a.C4955b;
import com.ironsource.sdk.p147j.p148a.C4956c;
import com.ironsource.sdk.p147j.p148a.C4957d;
import com.ironsource.sdk.service.C4977a;
import com.ironsource.sdk.service.C4980d;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.g */
public class C4790g implements C4784e, C4817m {

    /* renamed from: a */
    public C4817m f12194a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f12195b = C4790g.class.getSimpleName();

    /* renamed from: c */
    private C4936d.C4938b f12196c = C4936d.C4938b.None;

    /* renamed from: d */
    private CountDownTimer f12197d;

    /* renamed from: e */
    private final C4780b f12198e = new C4780b("NativeCommandExecutor");

    /* renamed from: f */
    private final C4780b f12199f = new C4780b("ControllerCommandsExecutor");

    /* renamed from: g */
    private final C4399a f12200g;

    public C4790g(Context context, C4782c cVar, C4980d dVar, C4812j jVar, C4399a aVar) {
        this.f12200g = aVar;
        final Context context2 = context;
        final C4782c cVar2 = cVar;
        final C4980d dVar2 = dVar;
        final C4812j jVar2 = jVar;
        m14031b((Runnable) new Runnable() {
            public final void run() {
                try {
                    C4817m unused = C4790g.this.f12194a = C4790g.m14028a(C4790g.this, context2, cVar2, dVar2, jVar2);
                    C4790g.this.f12194a.mo34364h();
                } catch (Exception e) {
                    C4790g.this.m14032d(Log.getStackTraceString(e));
                }
            }
        });
        this.f12197d = new CountDownTimer(200000, 1000) {
            public final void onFinish() {
                Logger.m14507i(C4790g.this.f12195b, "Global Controller Timer Finish");
                C4790g.this.m14032d("controller html - download timeout");
            }

            public final void onTick(long j) {
                String b = C4790g.this.f12195b;
                Logger.m14507i(b, "Global Controller Timer Tick " + j);
            }
        }.start();
    }

    /* renamed from: a */
    static /* synthetic */ C4845x m14028a(C4790g gVar, Context context, C4782c cVar, C4980d dVar, C4812j jVar) {
        C4747d.m13920a(C4749f.f12038b);
        C4845x xVar = new C4845x(context, jVar, cVar, gVar, gVar.f12200g);
        C4945b bVar = new C4945b(context, xVar.mo34432a(), new C4944a(C4399a.m12508a()), new C4949d(xVar.mo34432a().f12698b));
        xVar.f12396p = new C4842v(context, dVar);
        xVar.f12394n = new C4833q(context);
        xVar.f12395o = new C4835r(context);
        xVar.f12397q = new C4813k(context);
        xVar.f12398r = new C4778a(cVar);
        C4778a aVar = xVar.f12398r;
        if (xVar.f12400t == null) {
            xVar.f12400t = new C4905y() {
                /* renamed from: a */
                public final void mo34457a(String str, JSONObject jSONObject) {
                    C4845x.this.mo34441b(C4845x.m14183b(str, jSONObject.toString()));
                }
            };
        }
        aVar.f12157a = xVar.f12400t;
        xVar.f12399s = new C4815l(xVar.mo34432a().f12698b, bVar);
        return xVar;
    }

    /* renamed from: b */
    private void m14031b(Runnable runnable) {
        C4399a aVar = this.f12200g;
        if (aVar != null) {
            aVar.mo33205a(runnable);
        } else {
            Logger.m14505e(this.f12195b, "mThreadManager = null");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m14032d(String str) {
        C4747d.m13921a(C4749f.f12039c, (Map<String, Object>) new C4743a().mo34234a("callfailreason", str).f12028a);
        this.f12194a = new C4820p(str, this.f12200g, this);
        this.f12198e.mo34323a();
        this.f12198e.mo34325b();
    }

    /* renamed from: i */
    private boolean m14033i() {
        return C4936d.C4938b.Ready.equals(this.f12196c);
    }

    /* renamed from: a */
    public final void mo34330a() {
        this.f12196c = C4936d.C4938b.Loaded;
        this.f12198e.mo34323a();
        this.f12198e.mo34325b();
    }

    /* renamed from: a */
    public final void mo34341a(Context context) {
        if (m14033i()) {
            this.f12194a.mo34341a(context);
        }
    }

    /* renamed from: a */
    public final void mo34342a(final C4935c cVar, final Map<String, String> map, final C4955b bVar) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34342a(cVar, (Map<String, String>) map, bVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34343a(final C4935c cVar, final Map<String, String> map, final C4956c cVar2) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4743a a = new C4743a().mo34234a("demandsourcename", cVar.f12637a).mo34234a("producttype", C4748e.m13922a(cVar, C4936d.C4941e.Interstitial)).mo34234a("isbiddinginstance", Boolean.valueOf(C4748e.m13923a(cVar)));
                C4977a aVar = C4977a.f12725a;
                C4747d.m13921a(C4749f.f12045i, (Map<String, Object>) a.mo34234a("custom_c", Long.valueOf(C4977a.m14474c(cVar.f12638b))).f12028a);
                C4790g.this.f12194a.mo34343a(cVar, (Map<String, String>) map, cVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo34344a(Runnable runnable) {
        this.f12198e.mo34324a(runnable);
    }

    /* renamed from: a */
    public final void mo34331a(String str) {
        C4747d.m13921a(C4749f.f12048l, (Map<String, Object>) new C4743a().mo34234a("callfailreason", str).f12028a);
        C4960d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new C4942e(1001, str));
            IronSourceNetwork.setInitListener((C4960d) null);
        }
        CountDownTimer countDownTimer = this.f12197d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m14032d(str);
    }

    /* renamed from: a */
    public final void mo34345a(final String str, final C4956c cVar) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34345a(str, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34346a(String str, String str2, C4935c cVar, C4955b bVar) {
        final String str3 = str;
        final String str4 = str2;
        final C4935c cVar2 = cVar;
        final C4955b bVar2 = bVar;
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34346a(str3, str4, cVar2, bVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo34347a(String str, String str2, C4935c cVar, C4956c cVar2) {
        final String str3 = str;
        final String str4 = str2;
        final C4935c cVar3 = cVar;
        final C4956c cVar4 = cVar2;
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34347a(str3, str4, cVar3, cVar4);
            }
        });
    }

    /* renamed from: a */
    public final void mo34348a(String str, String str2, C4935c cVar, C4957d dVar) {
        final String str3 = str;
        final String str4 = str2;
        final C4935c cVar2 = cVar;
        final C4957d dVar2 = dVar;
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34348a(str3, str4, cVar2, dVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo34349a(final String str, final String str2, final C4961e eVar) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34349a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34350a(String str, String str2, Map<String, String> map, C4961e eVar) {
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C4961e eVar2 = eVar;
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34350a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo34351a(final Map<String, String> map, final C4961e eVar) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34351a((Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34352a(final JSONObject jSONObject) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34352a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final void mo34353a(final JSONObject jSONObject, final C4956c cVar) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34353a(jSONObject, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34354a(final JSONObject jSONObject, final C4957d dVar) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34354a(jSONObject, dVar);
            }
        });
    }

    /* renamed from: b */
    public final void mo34332b() {
        if (C4936d.C4939c.Web.equals(mo34357c())) {
            C4747d.m13920a(C4749f.f12040d);
            C4960d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener((C4960d) null);
            }
        }
        this.f12196c = C4936d.C4938b.Ready;
        CountDownTimer countDownTimer = this.f12197d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f12199f.mo34323a();
        this.f12199f.mo34325b();
        this.f12194a.mo34363g();
    }

    /* renamed from: b */
    public final void mo34355b(Context context) {
        if (m14033i()) {
            this.f12194a.mo34355b(context);
        }
    }

    /* renamed from: b */
    public final void mo34356b(final C4935c cVar, final Map<String, String> map, final C4956c cVar2) {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34356b(cVar, map, cVar2);
            }
        });
    }

    /* renamed from: b */
    public final void mo34333b(String str) {
        C4747d.m13921a(C4749f.f12057u, (Map<String, Object>) new C4743a().mo34234a("generalmessage", str).f12028a);
        CountDownTimer countDownTimer = this.f12197d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        m14032d(str);
    }

    /* renamed from: c */
    public final C4936d.C4939c mo34357c() {
        return this.f12194a.mo34357c();
    }

    /* renamed from: c */
    public final boolean mo34358c(String str) {
        if (!m14033i()) {
            return false;
        }
        return this.f12194a.mo34358c(str);
    }

    /* renamed from: d */
    public final void mo34359d() {
        this.f12199f.mo34324a(new Runnable() {
            public final void run() {
                C4790g.this.f12194a.mo34359d();
            }
        });
    }

    public void destroy() {
        CountDownTimer countDownTimer = this.f12197d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f12197d = null;
        m14031b((Runnable) new Runnable() {
            public final void run() {
                if (C4790g.this.f12194a != null) {
                    C4790g.this.f12194a.destroy();
                    C4817m unused = C4790g.this.f12194a = null;
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo34361e() {
        if (m14033i()) {
            this.f12194a.mo34361e();
        }
    }

    /* renamed from: f */
    public final void mo34362f() {
        if (m14033i()) {
            this.f12194a.mo34362f();
        }
    }

    @Deprecated
    /* renamed from: g */
    public final void mo34363g() {
    }

    /* renamed from: h */
    public final void mo34364h() {
    }
}
