package com.apm.insight.runtime.p179a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.AttachUserData;
import com.apm.insight.C6617h;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.entity.C6594a;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6674h;
import com.apm.insight.p178l.C6695w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.c */
public abstract class C6723c {

    /* renamed from: a */
    protected CrashType f14457a;

    /* renamed from: b */
    protected Context f14458b;

    /* renamed from: c */
    protected ICommonParams f14459c = C6617h.m16297a().mo52292c();

    /* renamed from: d */
    protected C6720b f14460d;

    /* renamed from: e */
    protected C6725d f14461e;

    /* renamed from: com.apm.insight.runtime.a.c$a */
    public interface C6724a {
        /* renamed from: a */
        C6594a mo52108a(int i, C6594a aVar);

        /* renamed from: a */
        C6594a mo52109a(int i, C6594a aVar, boolean z);

        /* renamed from: a */
        void mo52110a(Throwable th);
    }

    C6723c(CrashType crashType, Context context, C6720b bVar, C6725d dVar) {
        this.f14457a = crashType;
        this.f14458b = context;
        this.f14460d = bVar;
        this.f14461e = dVar;
    }

    /* renamed from: i */
    private void m16866i(C6594a aVar) {
        List<AttachUserData> a = C6617h.m16307b().mo51966a(this.f14457a);
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = aVar.mo52066h().optJSONObject("custom");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            aVar.mo52052a("custom", (Object) optJSONObject);
        }
        if (a != null) {
            for (int i = 0; i < a.size(); i++) {
                try {
                    AttachUserData attachUserData = a.get(i);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C6594a.m16166a(optJSONObject, attachUserData.getUserData(this.f14457a));
                    hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                } catch (Throwable th) {
                    C6594a.m16165a(optJSONObject, th);
                }
            }
        }
        try {
            optJSONObject.put("fd_count", C6674h.m16514a());
        } catch (Throwable unused) {
        }
        List<AttachUserData> b = C6617h.m16307b().mo51973b(this.f14457a);
        if (b != null) {
            JSONObject optJSONObject2 = aVar.mo52066h().optJSONObject("custom_long");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                aVar.mo52052a("custom_long", (Object) optJSONObject2);
            }
            for (int i2 = 0; i2 < b.size(); i2++) {
                try {
                    AttachUserData attachUserData2 = b.get(i2);
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    C6594a.m16166a(optJSONObject2, attachUserData2.getUserData(this.f14457a));
                    hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                } catch (Throwable th2) {
                    C6594a.m16165a(optJSONObject2, th2);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                optJSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public C6594a mo52263a(int i, C6594a aVar) {
        if (aVar == null) {
            aVar = new C6594a();
        }
        if (i == 0) {
            mo52266b(aVar);
        } else if (i == 1) {
            mo52267c(aVar);
            m16866i(aVar);
        } else if (i == 2) {
            mo52271e(aVar);
        } else if (i == 4) {
            mo52272f(aVar);
        } else if (i == 5) {
            mo52269d(aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public C6594a mo52248a(C6594a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C6594a mo52264a(C6594a aVar, C6724a aVar2, boolean z) {
        if (aVar == null) {
            aVar = new C6594a();
        }
        C6594a aVar3 = aVar;
        for (int i = 0; i < mo52265b(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.mo52108a(i, aVar3);
                } catch (Throwable th) {
                    aVar2.mo52110a(th);
                }
            }
            try {
                aVar3 = mo52263a(i, aVar3);
            } catch (Throwable th2) {
                if (aVar2 != null) {
                    aVar2.mo52110a(th2);
                }
            }
            if (aVar2 != null) {
                try {
                    boolean z2 = true;
                    if (i != mo52265b() - 1) {
                        z2 = false;
                    }
                    aVar3 = aVar2.mo52109a(i, aVar3, z2);
                } catch (Throwable th3) {
                    aVar2.mo52110a(th3);
                }
                if (z) {
                    if (i != 0) {
                        aVar.mo52060c(aVar3.mo52066h());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new C6594a();
                }
            }
            aVar.mo52054b("step_cost_" + i, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo52248a(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo52249a() {
        return false;
    }

    /* renamed from: b */
    public int mo52265b() {
        return 6;
    }

    /* renamed from: b */
    public C6594a mo52266b(C6594a aVar) {
        aVar.mo52043a(C6617h.m16322p(), C6617h.m16323q());
        if (C6617h.m16319m()) {
            aVar.mo52052a("is_mp", (Object) 1);
        }
        try {
            aVar.mo52050a(this.f14459c.getPluginInfo());
        } catch (Throwable unused) {
        }
        aVar.mo52055b((Map<Integer, String>) C6617h.m16321o());
        aVar.mo52052a("process_name", (Object) C6662a.m16480c(C6617h.m16313g()));
        return aVar;
    }

    /* renamed from: c */
    public C6594a mo52267c(C6594a aVar) {
        C6720b bVar;
        if (!C6662a.m16479b(C6617h.m16313g())) {
            aVar.mo52052a("remote_process", (Object) 1);
        }
        aVar.mo52052a("pid", (Object) Integer.valueOf(Process.myPid()));
        aVar.mo52044a(C6617h.m16316j());
        if (mo52268c() && (bVar = this.f14460d) != null) {
            aVar.mo52046a(bVar);
        }
        try {
            aVar.mo52049a(this.f14459c.getPatchInfo());
        } catch (Throwable unused) {
        }
        String k = C6617h.m16317k();
        if (k != null) {
            aVar.mo52052a("business", (Object) k);
        }
        aVar.mo52052a("is_background", (Object) Boolean.valueOf(!C6662a.m16477a(this.f14458b)));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo52268c() {
        return true;
    }

    /* renamed from: d */
    public C6594a mo52269d(C6594a aVar) {
        if (mo52270d()) {
            aVar.mo52056b(C6695w.m16683a(this.f14458b));
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo52270d() {
        return true;
    }

    /* renamed from: e */
    public C6594a mo52271e(C6594a aVar) {
        C6725d dVar = this.f14461e;
        aVar.mo52052a("battery", (Object) Integer.valueOf(dVar == null ? 0 : dVar.mo52275a()));
        aVar.mo52058c((Map<? extends String, ? extends String>) C6617h.m16307b().mo51967a());
        return aVar;
    }

    /* renamed from: f */
    public C6594a mo52272f(C6594a aVar) {
        if (mo52249a()) {
            mo52274h(aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo52273g(C6594a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo52274h(C6594a aVar) {
    }
}
