package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.sdk.p144g.C4935c;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.p147j.C4961e;
import com.ironsource.sdk.p147j.p148a.C4955b;
import com.ironsource.sdk.p147j.p148a.C4956c;
import com.ironsource.sdk.p147j.p148a.C4957d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.p */
public final class C4820p implements C4817m {

    /* renamed from: a */
    String f12285a = "";

    /* renamed from: b */
    private final C4399a f12286b;

    C4820p(String str, C4399a aVar, final C4784e eVar) {
        this.f12286b = aVar;
        this.f12285a = str;
        m14102a((Runnable) new Runnable() {
            public final void run() {
                eVar.mo34332b();
            }
        });
    }

    /* renamed from: a */
    private void m14102a(Runnable runnable) {
        C4399a aVar = this.f12286b;
        if (aVar != null) {
            aVar.mo33207c(runnable);
        }
    }

    /* renamed from: a */
    public final void mo34341a(Context context) {
    }

    /* renamed from: a */
    public final void mo34342a(C4935c cVar, final Map<String, String> map, final C4955b bVar) {
        if (bVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    bVar.mo34629d((String) map.get("demandSourceName"), C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34343a(final C4935c cVar, Map<String, String> map, final C4956c cVar2) {
        if (cVar2 != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo34620b(cVar.f12638b, C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34345a(final String str, final C4956c cVar) {
        if (cVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    cVar.mo34620b(str, C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34346a(String str, String str2, C4935c cVar, C4955b bVar) {
        if (bVar != null) {
            bVar.mo34601a(C4936d.C4941e.Banner, cVar.f12638b, this.f12285a);
        }
    }

    /* renamed from: a */
    public final void mo34347a(String str, String str2, final C4935c cVar, final C4956c cVar2) {
        if (cVar2 != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo34601a(C4936d.C4941e.Interstitial, cVar.f12638b, C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34348a(String str, String str2, final C4935c cVar, final C4957d dVar) {
        if (dVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    dVar.mo34601a(C4936d.C4941e.RewardedVideo, cVar.f12638b, C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34349a(String str, String str2, final C4961e eVar) {
        if (eVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onGetOWCreditsFailed(C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34350a(String str, String str2, Map<String, String> map, final C4961e eVar) {
        if (eVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onOfferwallInitFail(C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34351a(Map<String, String> map, final C4961e eVar) {
        if (eVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    eVar.onOWShowFail(C4820p.this.f12285a);
                    eVar.onOfferwallInitFail(C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34352a(JSONObject jSONObject) {
    }

    /* renamed from: a */
    public final void mo34353a(final JSONObject jSONObject, final C4956c cVar) {
        if (cVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    cVar.mo34625c(jSONObject.optString("demandSourceName"), C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34354a(final JSONObject jSONObject, final C4957d dVar) {
        if (dVar != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    dVar.mo34606a(jSONObject.optString("demandSourceName"), C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo34355b(Context context) {
    }

    /* renamed from: b */
    public final void mo34356b(final C4935c cVar, Map<String, String> map, final C4956c cVar2) {
        if (cVar2 != null) {
            m14102a((Runnable) new Runnable() {
                public final void run() {
                    cVar2.mo34625c(cVar.f12638b, C4820p.this.f12285a);
                }
            });
        }
    }

    /* renamed from: c */
    public final C4936d.C4939c mo34357c() {
        return C4936d.C4939c.Native;
    }

    /* renamed from: c */
    public final boolean mo34358c(String str) {
        return false;
    }

    /* renamed from: d */
    public final void mo34359d() {
    }

    public final void destroy() {
    }

    /* renamed from: e */
    public final void mo34361e() {
    }

    /* renamed from: f */
    public final void mo34362f() {
    }

    /* renamed from: g */
    public final void mo34363g() {
    }

    /* renamed from: h */
    public final void mo34364h() {
    }
}
