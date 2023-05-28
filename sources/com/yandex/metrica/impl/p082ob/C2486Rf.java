package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.C10728p;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Rf */
public class C2486Rf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2522Sf f6573a;

    /* renamed from: b */
    private final ICommonExecutor f6574b;

    /* renamed from: c */
    private final C2252Kn<Context> f6575c;

    /* renamed from: d */
    private final C2252Kn<String> f6576d;

    /* renamed from: e */
    private final C3042hm f6577e;

    /* renamed from: com.yandex.metrica.impl.ob.Rf$a */
    class C2487a extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Context f6578a;

        /* renamed from: b */
        final /* synthetic */ IIdentifierCallback f6579b;

        /* renamed from: c */
        final /* synthetic */ List f6580c;

        C2487a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f6578a = context;
            this.f6579b = iIdentifierCallback;
            this.f6580c = list;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C2522Sf a = C2486Rf.this.f6573a;
            Context context = this.f6578a;
            a.getClass();
            C2470R2.m8217a(context).mo16538a(this.f6579b, (List<String>) this.f6580c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$b */
    class C2488b extends C2904dm<String> {
        C2488b() {
        }

        /* renamed from: a */
        public Object mo16571a() throws Exception {
            C2486Rf.this.f6573a.getClass();
            C2470R2 k = C2470R2.m8232k();
            if (k == null) {
                return null;
            }
            return k.mo16546e().mo15676a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$c */
    class C2489c extends C2904dm<Boolean> {
        C2489c() {
        }

        /* renamed from: a */
        public Object mo16571a() throws Exception {
            C2486Rf.this.f6573a.getClass();
            C2470R2 k = C2470R2.m8232k();
            if (k == null) {
                return null;
            }
            return k.mo16546e().mo15677b();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$d */
    class C2490d extends C2933em {

        /* renamed from: a */
        final /* synthetic */ boolean f6584a;

        C2490d(boolean z) {
            this.f6584a = z;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C2522Sf a = C2486Rf.this.f6573a;
            boolean z = this.f6584a;
            a.getClass();
            C2470R2.m8224b(z);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$e */
    class C2491e extends C2933em {

        /* renamed from: a */
        final /* synthetic */ C10728p.Ucc f6586a;

        /* renamed from: b */
        final /* synthetic */ boolean f6587b;

        /* renamed from: com.yandex.metrica.impl.ob.Rf$e$a */
        class C2492a implements C3166ll {
            C2492a() {
            }

            public void onError(String str) {
                C2491e.this.f6586a.onError(str);
            }

            public void onResult(JSONObject jSONObject) {
                C2491e.this.f6586a.onResult(jSONObject);
            }
        }

        C2491e(C10728p.Ucc ucc, boolean z) {
            this.f6586a = ucc;
            this.f6587b = z;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C2486Rf.m8265b(C2486Rf.this).mo16056a((C3166ll) new C2492a(), this.f6587b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$f */
    class C2493f extends C2933em {

        /* renamed from: a */
        final /* synthetic */ Context f6590a;

        /* renamed from: b */
        final /* synthetic */ Map f6591b;

        C2493f(Context context, Map map) {
            this.f6590a = context;
            this.f6591b = map;
        }

        /* renamed from: a */
        public void mo15597a() throws Exception {
            C2522Sf a = C2486Rf.this.f6573a;
            Context context = this.f6590a;
            a.getClass();
            C2470R2.m8217a(context).mo16539a((Map<String, Object>) this.f6591b);
        }
    }

    public C2486Rf(ICommonExecutor iCommonExecutor, C2522Sf sf) {
        this(iCommonExecutor, sf, new C2243Kf(sf), new C2103Hn(new C2069Gn("Context")), new C2103Hn(new C2069Gn("Event name")), new C3042hm());
    }

    /* renamed from: b */
    public Future<Boolean> mo16568b() {
        return this.f6574b.submit(new C2489c());
    }

    /* renamed from: c */
    public String mo16569c(Context context) {
        this.f6575c.mo15517a(context);
        return context.getPackageName();
    }

    /* renamed from: d */
    public String mo16570d(Context context) {
        this.f6575c.mo15517a(context);
        this.f6573a.getClass();
        return C2470R2.m8217a(context).mo16535a();
    }

    public C2486Rf(ICommonExecutor iCommonExecutor, C2522Sf sf, C2243Kf kf, C2252Kn<Context> kn, C2252Kn<String> kn2, C3042hm hmVar) {
        this.f6573a = sf;
        this.f6574b = iCommonExecutor;
        this.f6575c = kn;
        this.f6576d = kn2;
        this.f6577e = hmVar;
    }

    /* renamed from: a */
    public void mo16563a(Context context, IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f6575c.mo15517a(context);
        this.f6574b.execute(new C2487a(context, iIdentifierCallback, list));
    }

    /* renamed from: b */
    public String mo16567b(Context context) {
        this.f6575c.mo15517a(context);
        this.f6573a.getClass();
        return C2470R2.m8217a(context).mo16543c();
    }

    /* renamed from: a */
    public Future<String> mo16562a() {
        return this.f6574b.submit(new C2488b());
    }

    /* renamed from: a */
    public String mo16561a(Context context) {
        this.f6575c.mo15517a(context);
        return this.f6577e.mo17689a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    /* renamed from: a */
    public void mo16565a(Context context, boolean z) {
        this.f6575c.mo15517a(context);
        this.f6574b.execute(new C2490d(z));
    }

    /* renamed from: a */
    public void mo16566a(C10728p.Ucc ucc, boolean z) {
        this.f6573a.getClass();
        if (!C2470R2.m8230i()) {
            ucc.onError("Main API key is not activated");
        } else {
            this.f6574b.execute(new C2491e(ucc, z));
        }
    }

    /* renamed from: b */
    static C2214K0 m8265b(C2486Rf rf) {
        rf.f6573a.getClass();
        return C2470R2.m8232k().mo16545d().mo17772b();
    }

    /* renamed from: a */
    public void mo16564a(Context context, Map<String, Object> map) {
        this.f6575c.mo15517a(context);
        this.f6574b.execute(new C2493f(context, map));
    }
}
