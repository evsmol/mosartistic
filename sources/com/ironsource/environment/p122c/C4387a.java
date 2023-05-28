package com.ironsource.environment.p122c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appnext.base.p264b.C8856i;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.p119d.C4370a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c.a */
public final class C4387a {

    /* renamed from: a */
    public ConcurrentHashMap<String, Object> f10466a;

    /* renamed from: b */
    AtomicBoolean f10467b;

    /* renamed from: c */
    public AtomicBoolean f10468c;

    /* renamed from: com.ironsource.environment.c.a$a */
    public static class C4389a {

        /* renamed from: a */
        public static volatile C4387a f10471a = new C4387a((byte) 0);
    }

    private C4387a() {
        this.f10467b = new AtomicBoolean(false);
        this.f10468c = new AtomicBoolean(false);
        this.f10466a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C4387a(byte b) {
        this();
    }

    /* renamed from: a */
    private void m12487a(String str) {
        try {
            this.f10466a.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private boolean m12488b(String str) {
        try {
            return this.f10466a.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private void m12489c(final Context context) {
        if (!this.f10467b.get()) {
            try {
                this.f10467b.set(true);
                C4401c.m12518b(new Runnable() {
                    public final void run() {
                        String[] C;
                        try {
                            C4387a aVar = C4387a.this;
                            Context context = context;
                            if (!(context == null || (C = C4407h.m12535C(context)) == null || C.length != 2)) {
                                String str = C[0];
                                Boolean valueOf = Boolean.valueOf(C[1]);
                                if (!TextUtils.isEmpty(str)) {
                                    aVar.mo33198a("gaid", str);
                                    aVar.mo33198a(C8856i.f22445fC, valueOf);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        C4387a.this.f10467b.set(false);
                    }
                }, 0);
            } catch (Exception unused) {
                this.f10467b.set(false);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo33197a(Context context) {
        mo33199b(context);
        return new JSONObject(C4390b.m12493a(this.f10466a));
    }

    /* renamed from: a */
    public void mo33198a(String str, Object obj) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                this.f10466a.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo33199b(Context context) {
        if (context != null) {
            m12489c(context);
            String B = C4407h.m12534B(context);
            if (!TextUtils.isEmpty(B)) {
                mo33198a("asid", B);
            } else if (m12488b("asid")) {
                m12487a("asid");
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                mo33198a("lang", language.toUpperCase());
            }
            String c = C4407h.m12547c();
            if (!TextUtils.isEmpty(c)) {
                mo33198a("tz", c);
            }
            String a = C4370a.m12414a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                mo33198a("connt", a);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                mo33198a("vpn", Boolean.valueOf(C4370a.m12419c(context)));
            }
            String j = C4407h.m12563j(context);
            if (!TextUtils.isEmpty(j)) {
                mo33198a("icc", j);
            }
            mo33198a("vol", Float.valueOf(C4407h.m12567l(context)));
            mo33198a("dfs", String.valueOf(C4407h.m12575p()));
            mo33198a("scrnw", Integer.valueOf(C4407h.m12565k()));
            mo33198a("scrnh", Integer.valueOf(C4407h.m12568l()));
            mo33198a("ltime", String.valueOf(C4407h.m12538a()));
            mo33198a("tzoff", String.valueOf(C4407h.m12544b()));
            mo33198a("mcc", Integer.valueOf(C4377a.C43781.m12462c(context)));
            mo33198a("mnc", Integer.valueOf(C4377a.C43781.m12465d(context)));
            mo33198a("sdcrd", Boolean.valueOf(C4407h.m12551d()));
            mo33198a("chrg", Boolean.valueOf(C4407h.m12554e(context)));
            mo33198a("chrgt", Integer.valueOf(C4407h.m12556f(context)));
            mo33198a("apm", Boolean.valueOf(C4407h.m12558g(context)));
            mo33198a("owp", Boolean.valueOf(C4407h.m12560h(context)));
            mo33198a("rt", Boolean.valueOf(C4407h.m12564j()));
            mo33198a("sscl", String.valueOf(C4407h.m12573o()));
            mo33198a("bat", Integer.valueOf(C4407h.m12585v(context)));
            mo33198a("lpm", Boolean.valueOf(C4407h.m12586w(context)));
            mo33198a("apor", C4407h.m12572n(context));
            mo33198a("ua", C4407h.m12580r());
            int D = C4407h.m12536D(context);
            if (D >= 0) {
                mo33198a("tca", Integer.valueOf(D));
            }
            String E = C4407h.m12537E(context);
            if (E != null) {
                mo33198a("tcs", E);
            }
        }
    }
}
