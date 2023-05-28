package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.yandex.metrica.impl.p082ob.C1992Eg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Hg */
public class C2095Hg extends C1992Eg {

    /* renamed from: m */
    private String f5535m;

    /* renamed from: n */
    private String f5536n;

    /* renamed from: com.yandex.metrica.impl.ob.Hg$a */
    protected static abstract class C2096a<T extends C2095Hg, A extends C1992Eg.C1993a> extends C1992Eg.C1994b<T, A> {

        /* renamed from: c */
        private final C3241mn f5537c;

        protected C2096a(Context context, String str) {
            this(context, str, new C3241mn());
        }

        /* renamed from: a */
        public T mo15869a(C1992Eg.C1995c<A> cVar) {
            T a = mo15617a();
            a.mo15691a(C2575U.m8554a());
            C2854c2 a2 = C2007F0.m7154g().mo15751n().mo17477a();
            a.mo15692a(a2);
            a.mo15693a(cVar.f5341a);
            String str = ((C1992Eg.C1993a) cVar.f5342b).f5336a;
            String str2 = null;
            if (str == null) {
                str = a2.mo17355a() != null ? a2.mo17355a().mo64728a() : null;
            }
            a.mo15699c(str);
            String str3 = this.f5340b;
            String str4 = ((C1992Eg.C1993a) cVar.f5342b).f5337b;
            Context context = this.f5339a;
            if (TextUtils.isEmpty(str4)) {
                str4 = C1848A2.m6796a(context, str3);
            }
            a.mo15697b(str4);
            String str5 = this.f5340b;
            String str6 = ((C1992Eg.C1993a) cVar.f5342b).f5338c;
            Context context2 = this.f5339a;
            if (TextUtils.isEmpty(str6)) {
                str6 = String.valueOf(C1848A2.m6812b(context2, str5));
            }
            a.mo15695a(str6);
            a.mo15703e(this.f5340b);
            a.mo15694a(C2007F0.m7154g().mo15755r().mo18393a(this.f5339a));
            a.mo15690a(C2007F0.m7154g().mo15737a().mo15551a());
            List<String> a3 = C2980g1.m9593a(this.f5339a).mo17618a();
            if (!a3.isEmpty()) {
                str2 = a3.get(0);
            }
            a.mo15701d(str2);
            T t = (C2095Hg) a;
            String packageName = this.f5339a.getPackageName();
            ApplicationInfo a4 = this.f5537c.mo17878a(this.f5339a, this.f5340b, 0);
            String str7 = "1";
            if (a4 != null) {
                t.mo15866f((a4.flags & 2) != 0 ? str7 : BuildConfig.ADAPTER_VERSION);
                if ((a4.flags & 1) == 0) {
                    str7 = BuildConfig.ADAPTER_VERSION;
                }
                t.mo15867g(str7);
            } else if (TextUtils.equals(packageName, this.f5340b)) {
                t.mo15866f((this.f5339a.getApplicationInfo().flags & 2) != 0 ? str7 : BuildConfig.ADAPTER_VERSION);
                if ((this.f5339a.getApplicationInfo().flags & 1) == 0) {
                    str7 = BuildConfig.ADAPTER_VERSION;
                }
                t.mo15867g(str7);
            } else {
                t.mo15866f(BuildConfig.ADAPTER_VERSION);
                t.mo15867g(BuildConfig.ADAPTER_VERSION);
            }
            return t;
        }

        protected C2096a(Context context, String str, C3241mn mnVar) {
            super(context, str);
            this.f5537c = mnVar;
        }
    }

    /* renamed from: A */
    public String mo15865A() {
        return this.f5536n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15866f(String str) {
        this.f5535m = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15867g(String str) {
        this.f5536n = str;
    }

    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f5535m + '\'' + ", mAppSystem='" + this.f5536n + '\'' + "} " + super.toString();
    }

    /* renamed from: z */
    public String mo15868z() {
        return this.f5535m;
    }
}
