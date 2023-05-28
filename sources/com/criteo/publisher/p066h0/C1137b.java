package com.criteo.publisher.p066h0;

import android.util.Base64;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.model.p073b0.C1243n;
import com.criteo.publisher.model.p073b0.C1248r;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p074n0.C1288a;
import com.criteo.publisher.p074n0.C1296c;
import com.criteo.publisher.p074n0.C1307k;
import com.criteo.publisher.p074n0.C1311o;
import com.criteo.publisher.p074n0.C1315s;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.criteo.publisher.h0.b */
/* compiled from: DfpHeaderBidding */
public class C1137b implements C1143d {

    /* renamed from: a */
    private final C1296c f3630a;

    /* renamed from: b */
    private final C1307k f3631b;

    /* renamed from: c */
    private final C1195g f3632c = C1197h.m5407b(getClass());

    /* renamed from: a */
    public void mo3234a(Object obj) {
    }

    public C1137b(C1296c cVar, C1307k kVar) {
        this.f3630a = cVar;
        this.f3631b = kVar;
    }

    /* renamed from: b */
    public boolean mo3237b(Object obj) {
        return C1141d.m5246a(obj);
    }

    /* renamed from: a */
    public C1147a mo3232a() {
        return C1147a.GAM_APP_BIDDING;
    }

    /* renamed from: a */
    public void mo3235a(Object obj, C1288a aVar, C1272s sVar) {
        C1141d b = C1141d.m5247b(obj);
        if (b != null) {
            b.mo3238a("crt_cpm", sVar.mo3566a());
            int i = C1138a.f3633a[aVar.ordinal()];
            if (i == 1) {
                m5232a(b, sVar);
                b.mo3238a("crt_size", sVar.mo3581k() + "x" + sVar.mo3573e());
            } else if (i == 2 || i == 3) {
                m5232a(b, sVar);
                b.mo3238a("crt_size", m5231a(sVar));
            } else if (i == 4) {
                m5234b(b, sVar);
            }
            if (sVar.mo3586p()) {
                b.mo3238a("crt_format", "video");
            }
            this.f3632c.mo3337a(C1136a.m5229a(mo3232a(), b.mo3239a()));
        }
    }

    /* renamed from: com.criteo.publisher.h0.b$a */
    /* compiled from: DfpHeaderBidding */
    static /* synthetic */ class C1138a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3633a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.criteo.publisher.n0.a[] r0 = com.criteo.publisher.p074n0.C1288a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3633a = r0
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3633a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3633a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3633a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_CUSTOM_NATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.p066h0.C1137b.C1138a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m5232a(C1141d dVar, C1272s sVar) {
        String str;
        String d = sVar.mo3572d();
        if (!C1315s.m5789a((CharSequence) d)) {
            if (sVar.mo3586p()) {
                try {
                    str = mo3236b(mo3236b(d));
                } catch (UnsupportedEncodingException e) {
                    C1311o.m5779a((Throwable) e);
                    return;
                }
            } else {
                str = mo3233a(d);
            }
            dVar.mo3238a("crt_displayurl", str);
        }
    }

    /* renamed from: a */
    private String m5231a(C1272s sVar) {
        boolean z = true;
        if (this.f3630a.mo3619a() != 1) {
            z = false;
        }
        if (this.f3631b.mo3657c()) {
            if (z && sVar.mo3581k() >= 768 && sVar.mo3573e() >= 1024) {
                return "768x1024";
            }
            if (!z && sVar.mo3581k() >= 1024 && sVar.mo3573e() >= 768) {
                return "1024x768";
            }
        }
        return z ? "320x480" : "480x320";
    }

    /* renamed from: b */
    private void m5234b(C1141d dVar, C1272s sVar) {
        C1243n g = sVar.mo3576g();
        if (g != null) {
            C1248r n = g.mo3491n();
            m5233a(dVar, n.mo3462g(), "crtn_title");
            m5233a(dVar, n.mo3458c(), "crtn_desc");
            m5233a(dVar, n.mo3461f(), "crtn_price");
            m5233a(dVar, n.mo3457b().toString(), "crtn_clickurl");
            m5233a(dVar, n.mo3456a(), "crtn_cta");
            m5233a(dVar, n.mo3493e().toString(), "crtn_imageurl");
            m5233a(dVar, g.mo3483c(), "crtn_advname");
            m5233a(dVar, g.mo3484d(), "crtn_advdomain");
            m5233a(dVar, g.mo3486f().toString(), "crtn_advlogourl");
            m5233a(dVar, g.mo3485e().toString(), "crtn_advurl");
            m5233a(dVar, g.mo3489l().toString(), "crtn_prurl");
            m5233a(dVar, g.mo3490m().toString(), "crtn_primageurl");
            m5233a(dVar, g.mo3488k(), "crtn_prtext");
            List<URL> g2 = g.mo3487g();
            for (int i = 0; i < g2.size(); i++) {
                String url = g2.get(i).toString();
                m5233a(dVar, url, "crtn_pixurl_" + i);
            }
            dVar.mo3238a("crtn_pixcount", g2.size() + "");
        }
    }

    /* renamed from: a */
    private void m5233a(C1141d dVar, String str, String str2) {
        if (!C1315s.m5789a((CharSequence) str)) {
            dVar.mo3238a(str2, mo3233a(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo3233a(String str) {
        if (C1315s.m5789a((CharSequence) str)) {
            return null;
        }
        try {
            return mo3236b(mo3236b(Base64.encodeToString(str.getBytes(Charset.forName("UTF-8")), 2)));
        } catch (UnsupportedEncodingException e) {
            C1311o.m5779a((Throwable) e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo3236b(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, Charset.forName("UTF-8").name());
    }

    /* renamed from: com.criteo.publisher.h0.b$d */
    /* compiled from: DfpHeaderBidding */
    private static abstract class C1141d {

        /* renamed from: a */
        private final String f3638a;

        /* renamed from: b */
        private final StringBuilder f3639b;

        /* synthetic */ C1141d(String str, C1138a aVar) {
            this(str);
        }

        private C1141d(String str) {
            this.f3638a = str;
            this.f3639b = new StringBuilder();
        }

        /* renamed from: a */
        static boolean m5246a(Object obj) {
            return C1140c.m5244a(obj) || C1139b.m5242a(obj);
        }

        /* renamed from: b */
        static C1141d m5247b(Object obj) {
            if (C1140c.m5244a(obj)) {
                return new C1140c((AdManagerAdRequest.Builder) obj, (C1138a) null);
            }
            if (C1139b.m5242a(obj)) {
                return new C1139b(obj, (C1138a) null);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3238a(String str, String str2) {
            if (this.f3639b.length() != 0) {
                this.f3639b.append(",");
            } else {
                StringBuilder sb = this.f3639b;
                sb.append(this.f3638a);
                sb.append(':');
            }
            StringBuilder sb2 = this.f3639b;
            sb2.append(str);
            sb2.append("=");
            sb2.append(str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final String mo3239a() {
            return this.f3639b.toString();
        }
    }

    /* renamed from: com.criteo.publisher.h0.b$c */
    /* compiled from: DfpHeaderBidding */
    private static class C1140c extends C1141d {

        /* renamed from: c */
        private final AdManagerAdRequest.Builder f3637c;

        /* synthetic */ C1140c(AdManagerAdRequest.Builder builder, C1138a aVar) {
            this(builder);
        }

        private C1140c(AdManagerAdRequest.Builder builder) {
            super("AdMob20", (C1138a) null);
            this.f3637c = builder;
        }

        /* renamed from: a */
        static boolean m5244a(Object obj) {
            try {
                return obj instanceof AdManagerAdRequest.Builder;
            } catch (LinkageError unused) {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3238a(String str, String str2) {
            try {
                this.f3637c.addCustomTargeting(str, str2);
                super.mo3238a(str, str2);
            } catch (LinkageError e) {
                C1311o.m5779a((Throwable) e);
            }
        }
    }

    /* renamed from: com.criteo.publisher.h0.b$b */
    /* compiled from: DfpHeaderBidding */
    private static class C1139b extends C1141d {

        /* renamed from: d */
        private static Class<?> f3634d;

        /* renamed from: e */
        private static Method f3635e;

        /* renamed from: c */
        private final Object f3636c;

        /* synthetic */ C1139b(Object obj, C1138a aVar) {
            this(obj);
        }

        private C1139b(Object obj) {
            super("AdMob19", (C1138a) null);
            this.f3636c = obj;
        }

        /* renamed from: a */
        static boolean m5242a(Object obj) {
            return m5241a(obj.getClass().getClassLoader()) && f3634d.isAssignableFrom(obj.getClass());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3238a(String str, String str2) {
            try {
                f3635e.invoke(this.f3636c, new Object[]{str, str2});
            } catch (IllegalAccessException e) {
                C1311o.m5779a((Throwable) e);
            } catch (InvocationTargetException e2) {
                C1311o.m5779a((Throwable) e2);
            }
            super.mo3238a(str, str2);
        }

        /* renamed from: a */
        private static boolean m5241a(ClassLoader classLoader) {
            if (f3634d != null && f3635e != null) {
                return true;
            }
            try {
                Class<?> cls = Class.forName("com.google.android.gms.ads.doubleclick.PublisherAdRequest$Builder", false, classLoader);
                f3634d = cls;
                f3635e = cls.getMethod("addCustomTargeting", new Class[]{String.class, String.class});
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            } catch (NoSuchMethodException e) {
                C1311o.m5779a((Throwable) e);
                return false;
            }
        }
    }
}
