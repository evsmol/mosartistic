package com.appodeal.consent.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.aps.shared.APSAnalytics;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.advertising.AdvertisingInfo;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentManager;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.consent.internal.a */
public final class C9749a {

    /* renamed from: a */
    public final Context f24732a;

    /* renamed from: b */
    public final String f24733b;

    /* renamed from: c */
    public final Consent f24734c;

    /* renamed from: d */
    public final AdvertisingInfo.AdvertisingProfile f24735d;

    /* renamed from: e */
    public final Map<?, ?> f24736e;

    /* renamed from: f */
    public final String f24737f;

    /* renamed from: g */
    public final String f24738g;

    /* renamed from: h */
    public final String f24739h;

    /* renamed from: i */
    public final String f24740i;

    /* renamed from: j */
    public final Lazy f24741j = LazyKt.lazy(new C9751b(this));

    /* renamed from: k */
    public final String f24742k = ConsentManager.getVersion();

    /* renamed from: l */
    public final String f24743l;

    /* renamed from: m */
    public final String f24744m;

    /* renamed from: n */
    public final String f24745n;

    /* renamed from: o */
    public final Lazy f24746o;

    /* renamed from: com.appodeal.consent.internal.a$a */
    public static final class C9750a extends Lambda implements Function0<String> {

        /* renamed from: a */
        public static final C9750a f24747a = new C9750a();

        public C9750a() {
            super(0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.String r0 = "com.appodeal.ads.Appodeal"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "getVersion"
                r2 = 0
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0025 }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{ all -> 0x0025 }
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0025 }
                r2 = 0
                java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ all -> 0x0025 }
                boolean r1 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x001d
                r2 = r0
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0025 }
            L_0x001d:
                if (r2 != 0) goto L_0x002a
                java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0025 }
                r2.<init>()     // Catch:{ all -> 0x0025 }
                goto L_0x002a
            L_0x0025:
                java.lang.String r2 = new java.lang.String
                r2.<init>()
            L_0x002a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.internal.C9749a.C9750a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.appodeal.consent.internal.a$b */
    public static final class C9751b extends Lambda implements Function0<Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        public final /* synthetic */ C9749a f24748a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9751b(C9749a aVar) {
            super(0);
            this.f24748a = aVar;
        }

        public final Object invoke() {
            DisplayMetrics displayMetrics = this.f24748a.f24732a.getResources().getDisplayMetrics();
            return TuplesKt.m14544to(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        }
    }

    public C9749a(Context context, String str, Consent consent, AdvertisingInfo.AdvertisingProfile advertisingProfile, Map<?, ?> map, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(advertisingProfile, "advertisingProfile");
        Intrinsics.checkNotNullParameter(map, "extraData");
        Intrinsics.checkNotNullParameter(str2, "deviceModel");
        Intrinsics.checkNotNullParameter(str3, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(str4, "osVersion");
        Intrinsics.checkNotNullParameter(str5, "locale");
        this.f24732a = context;
        this.f24733b = str;
        this.f24734c = consent;
        this.f24735d = advertisingProfile;
        this.f24736e = map;
        this.f24737f = str2;
        this.f24738g = str3;
        this.f24739h = str4;
        this.f24740i = str5;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        this.f24743l = packageName;
        this.f24744m = mo61328o() ? "tablet" : "phone";
        this.f24745n = APSAnalytics.OS_NAME;
        this.f24746o = LazyKt.lazy(C9750a.f24747a);
    }

    /* renamed from: a */
    public final AdvertisingInfo.AdvertisingProfile mo61314a() {
        return this.f24735d;
    }

    /* renamed from: b */
    public final String mo61315b() {
        return this.f24733b;
    }

    /* renamed from: c */
    public final String mo61316c() {
        return (String) this.f24746o.getValue();
    }

    /* renamed from: d */
    public final Consent mo61317d() {
        return this.f24734c;
    }

    /* renamed from: e */
    public final String mo61318e() {
        return this.f24742k;
    }

    /* renamed from: f */
    public final String mo61319f() {
        return this.f24738g;
    }

    /* renamed from: g */
    public final String mo61320g() {
        return this.f24737f;
    }

    /* renamed from: h */
    public final String mo61321h() {
        return this.f24744m;
    }

    /* renamed from: i */
    public final Map<?, ?> mo61322i() {
        return this.f24736e;
    }

    /* renamed from: j */
    public final String mo61323j() {
        return this.f24740i;
    }

    /* renamed from: k */
    public final String mo61324k() {
        return this.f24745n;
    }

    /* renamed from: l */
    public final String mo61325l() {
        return this.f24739h;
    }

    /* renamed from: m */
    public final String mo61326m() {
        return this.f24743l;
    }

    /* renamed from: n */
    public final Pair<Integer, Integer> mo61327n() {
        return (Pair) this.f24741j.getValue();
    }

    /* renamed from: o */
    public final boolean mo61328o() {
        Object systemService = this.f24732a.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "windowManager.defaultDisplay");
            DisplayMetrics displayMetrics = this.f24732a.getResources().getDisplayMetrics();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            defaultDisplay.getMetrics(displayMetrics);
            return Math.sqrt(Math.pow((double) (((float) point.y) / displayMetrics.ydpi), 2.0d) + Math.pow((double) (((float) point.x) / displayMetrics.xdpi), 2.0d)) > 7.0d;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
