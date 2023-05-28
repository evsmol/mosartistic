package com.adcolony.sdk;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.n0 */
class C6385n0 {

    /* renamed from: a */
    private final int f13689a;

    /* renamed from: b */
    private final List<C6386a> f13690b = new ArrayList();

    /* renamed from: com.adcolony.sdk.n0$a */
    static class C6386a {

        /* renamed from: a */
        private final String f13691a;

        /* renamed from: b */
        private final String f13692b;

        /* renamed from: c */
        private final int f13693c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String[] f13694d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final String[] f13695e;

        /* renamed from: f */
        private final List<C6387b> f13696f = new ArrayList();

        /* renamed from: g */
        private final List<C6388c> f13697g = new ArrayList();

        /* renamed from: h */
        private final C6389d f13698h;

        /* renamed from: i */
        private final Map<String, String> f13699i;

        C6386a(C6294f1 f1Var) throws JSONException {
            this.f13691a = f1Var.mo50694e("stream");
            this.f13692b = f1Var.mo50694e("table_name");
            this.f13693c = f1Var.mo50673a("max_rows", 10000);
            C6290e1 l = f1Var.mo50703l("event_types");
            this.f13694d = l != null ? C6235c0.m15072a(l) : new String[0];
            C6290e1 l2 = f1Var.mo50703l("request_types");
            this.f13695e = l2 != null ? C6235c0.m15072a(l2) : new String[0];
            for (C6294f1 bVar : C6235c0.m15080b(f1Var.mo50690c("columns"))) {
                this.f13696f.add(new C6387b(bVar));
            }
            for (C6294f1 cVar : C6235c0.m15080b(f1Var.mo50690c("indexes"))) {
                this.f13697g.add(new C6388c(cVar, this.f13692b));
            }
            C6294f1 n = f1Var.mo50705n("ttl");
            this.f13698h = n != null ? new C6389d(n) : null;
            this.f13699i = f1Var.mo50704m("queries").mo50696f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo50860c() {
            return this.f13693c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public String mo50861d() {
            return this.f13691a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map<String, String> mo50862e() {
            return this.f13699i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo50863f() {
            return this.f13692b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C6389d mo50864g() {
            return this.f13698h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<C6387b> mo50858a() {
            return this.f13696f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<C6388c> mo50859b() {
            return this.f13697g;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$b */
    static class C6387b {

        /* renamed from: a */
        private final String f13700a;

        /* renamed from: b */
        private final String f13701b;

        /* renamed from: c */
        private final Object f13702c;

        C6387b(C6294f1 f1Var) throws JSONException {
            this.f13700a = f1Var.mo50694e(AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f13701b = f1Var.mo50694e("type");
            this.f13702c = f1Var.mo50706o(RewardedVideo.VIDEO_MODE_DEFAULT);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo50865a() {
            return this.f13702c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo50866b() {
            return this.f13700a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo50867c() {
            return this.f13701b;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$c */
    static class C6388c {

        /* renamed from: a */
        private final String f13703a;

        /* renamed from: b */
        private final String[] f13704b;

        C6388c(C6294f1 f1Var, String str) throws JSONException {
            this.f13703a = str + "_" + f1Var.mo50694e(AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f13704b = C6235c0.m15072a(f1Var.mo50690c("columns"));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String[] mo50868a() {
            return this.f13704b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo50869b() {
            return this.f13703a;
        }
    }

    /* renamed from: com.adcolony.sdk.n0$d */
    static class C6389d {

        /* renamed from: a */
        private final long f13705a;

        /* renamed from: b */
        private final String f13706b;

        C6389d(C6294f1 f1Var) throws JSONException {
            this.f13705a = f1Var.mo50693d("seconds");
            this.f13706b = f1Var.mo50694e("column");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo50870a() {
            return this.f13706b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo50871b() {
            return this.f13705a;
        }
    }

    C6385n0(C6294f1 f1Var) throws JSONException {
        this.f13689a = f1Var.mo50684b("version");
        for (C6294f1 aVar : C6235c0.m15080b(f1Var.mo50690c("streams"))) {
            this.f13690b.add(new C6386a(aVar));
        }
    }

    /* renamed from: a */
    static C6385n0 m15543a(C6294f1 f1Var) {
        try {
            return new C6385n0(f1Var);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo50857b() {
        return this.f13689a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C6386a> mo50856a() {
        return this.f13690b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6386a mo50855a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        for (C6386a next : this.f13690b) {
            int i = 0;
            for (String equals : next.f13694d) {
                if (str.equals(equals)) {
                    return next;
                }
            }
            String[] b = next.f13695e;
            int length = b.length;
            while (true) {
                if (i < length) {
                    if (str.equals(b[i])) {
                        return next;
                    }
                    i++;
                }
            }
        }
        return null;
    }
}
