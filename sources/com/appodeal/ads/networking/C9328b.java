package com.appodeal.ads.networking;

import com.appodeal.ads.C9203h0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.networking.b */
public final class C9328b {

    /* renamed from: a */
    public final C9330b f23600a;

    /* renamed from: b */
    public final C9329a f23601b;

    /* renamed from: c */
    public final C9331c f23602c;

    /* renamed from: d */
    public final C9332d f23603d;

    /* renamed from: e */
    public final C9334f f23604e;

    /* renamed from: f */
    public final C9333e f23605f;

    /* renamed from: com.appodeal.ads.networking.b$a */
    public static final class C9329a {

        /* renamed from: a */
        public final String f23606a;

        /* renamed from: b */
        public final String f23607b;

        /* renamed from: c */
        public final Map<String, String> f23608c;

        /* renamed from: d */
        public final boolean f23609d;

        /* renamed from: e */
        public final boolean f23610e;

        /* renamed from: f */
        public final long f23611f;

        /* renamed from: g */
        public final String f23612g;

        public C9329a(String str, String str2, Map<String, String> map, boolean z, boolean z2, long j, String str3) {
            Intrinsics.checkNotNullParameter(str, "appToken");
            Intrinsics.checkNotNullParameter(str2, "environment");
            Intrinsics.checkNotNullParameter(map, "eventTokens");
            this.f23606a = str;
            this.f23607b = str2;
            this.f23608c = map;
            this.f23609d = z;
            this.f23610e = z2;
            this.f23611f = j;
            this.f23612g = str3;
        }

        /* renamed from: a */
        public final String mo60373a() {
            return this.f23606a;
        }

        /* renamed from: b */
        public final String mo60374b() {
            return this.f23607b;
        }

        /* renamed from: c */
        public final Map<String, String> mo60375c() {
            return this.f23608c;
        }

        /* renamed from: d */
        public final long mo60376d() {
            return this.f23611f;
        }

        /* renamed from: e */
        public final String mo60377e() {
            return this.f23612g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9329a)) {
                return false;
            }
            C9329a aVar = (C9329a) obj;
            return Intrinsics.areEqual((Object) this.f23606a, (Object) aVar.f23606a) && Intrinsics.areEqual((Object) this.f23607b, (Object) aVar.f23607b) && Intrinsics.areEqual((Object) this.f23608c, (Object) aVar.f23608c) && this.f23609d == aVar.f23609d && this.f23610e == aVar.f23610e && this.f23611f == aVar.f23611f && Intrinsics.areEqual((Object) this.f23612g, (Object) aVar.f23612g);
        }

        /* renamed from: f */
        public final boolean mo60379f() {
            return this.f23609d;
        }

        /* renamed from: g */
        public final boolean mo60380g() {
            return this.f23610e;
        }

        public final int hashCode() {
            int hashCode = (this.f23608c.hashCode() + C9327a.m27564a(this.f23607b, this.f23606a.hashCode() * 31, 31)) * 31;
            boolean z = this.f23609d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f23610e;
            if (!z3) {
                z2 = z3;
            }
            int hashCode2 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23611f) + ((i + (z2 ? 1 : 0)) * 31)) * 31;
            String str = this.f23612g;
            return hashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("AdjustConfig(appToken=");
            a.append(this.f23606a);
            a.append(", environment=");
            a.append(this.f23607b);
            a.append(", eventTokens=");
            a.append(this.f23608c);
            a.append(", isEventTrackingEnabled=");
            a.append(this.f23609d);
            a.append(", isRevenueTrackingEnabled=");
            a.append(this.f23610e);
            a.append(", initTimeoutMs=");
            a.append(this.f23611f);
            a.append(", initializationMode=");
            a.append(this.f23612g);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.b$b */
    public static final class C9330b {

        /* renamed from: a */
        public final String f23613a;

        /* renamed from: b */
        public final String f23614b;

        /* renamed from: c */
        public final String f23615c;

        /* renamed from: d */
        public final List<String> f23616d;

        /* renamed from: e */
        public final boolean f23617e;

        /* renamed from: f */
        public final boolean f23618f;

        /* renamed from: g */
        public final long f23619g;

        /* renamed from: h */
        public final String f23620h;

        public C9330b(String str, String str2, String str3, List<String> list, boolean z, boolean z2, long j, String str4) {
            Intrinsics.checkNotNullParameter(str, "devKey");
            Intrinsics.checkNotNullParameter(str2, "appId");
            Intrinsics.checkNotNullParameter(str3, "adId");
            Intrinsics.checkNotNullParameter(list, "conversionKeys");
            this.f23613a = str;
            this.f23614b = str2;
            this.f23615c = str3;
            this.f23616d = list;
            this.f23617e = z;
            this.f23618f = z2;
            this.f23619g = j;
            this.f23620h = str4;
        }

        /* renamed from: a */
        public final String mo60383a() {
            return this.f23614b;
        }

        /* renamed from: b */
        public final List<String> mo60384b() {
            return this.f23616d;
        }

        /* renamed from: c */
        public final String mo60385c() {
            return this.f23613a;
        }

        /* renamed from: d */
        public final long mo60386d() {
            return this.f23619g;
        }

        /* renamed from: e */
        public final String mo60387e() {
            return this.f23620h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9330b)) {
                return false;
            }
            C9330b bVar = (C9330b) obj;
            return Intrinsics.areEqual((Object) this.f23613a, (Object) bVar.f23613a) && Intrinsics.areEqual((Object) this.f23614b, (Object) bVar.f23614b) && Intrinsics.areEqual((Object) this.f23615c, (Object) bVar.f23615c) && Intrinsics.areEqual((Object) this.f23616d, (Object) bVar.f23616d) && this.f23617e == bVar.f23617e && this.f23618f == bVar.f23618f && this.f23619g == bVar.f23619g && Intrinsics.areEqual((Object) this.f23620h, (Object) bVar.f23620h);
        }

        /* renamed from: f */
        public final boolean mo60389f() {
            return this.f23617e;
        }

        /* renamed from: g */
        public final boolean mo60390g() {
            return this.f23618f;
        }

        public final int hashCode() {
            int hashCode = (this.f23616d.hashCode() + C9327a.m27564a(this.f23615c, C9327a.m27564a(this.f23614b, this.f23613a.hashCode() * 31, 31), 31)) * 31;
            boolean z = this.f23617e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f23618f;
            if (!z3) {
                z2 = z3;
            }
            int hashCode2 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23619g) + ((i + (z2 ? 1 : 0)) * 31)) * 31;
            String str = this.f23620h;
            return hashCode2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("AppsflyerConfig(devKey=");
            a.append(this.f23613a);
            a.append(", appId=");
            a.append(this.f23614b);
            a.append(", adId=");
            a.append(this.f23615c);
            a.append(", conversionKeys=");
            a.append(this.f23616d);
            a.append(", isEventTrackingEnabled=");
            a.append(this.f23617e);
            a.append(", isRevenueTrackingEnabled=");
            a.append(this.f23618f);
            a.append(", initTimeoutMs=");
            a.append(this.f23619g);
            a.append(", initializationMode=");
            a.append(this.f23620h);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.b$c */
    public static final class C9331c {

        /* renamed from: a */
        public final boolean f23621a;

        /* renamed from: b */
        public final boolean f23622b;

        /* renamed from: c */
        public final long f23623c;

        public C9331c(boolean z, boolean z2, long j) {
            this.f23621a = z;
            this.f23622b = z2;
            this.f23623c = j;
        }

        /* renamed from: a */
        public final long mo60393a() {
            return this.f23623c;
        }

        /* renamed from: b */
        public final boolean mo60394b() {
            return this.f23621a;
        }

        /* renamed from: c */
        public final boolean mo60395c() {
            return this.f23622b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9331c)) {
                return false;
            }
            C9331c cVar = (C9331c) obj;
            return this.f23621a == cVar.f23621a && this.f23622b == cVar.f23622b && this.f23623c == cVar.f23623c;
        }

        public final int hashCode() {
            boolean z = this.f23621a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f23622b;
            if (!z3) {
                z2 = z3;
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23623c) + ((i + (z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("FacebookConfig(isEventTrackingEnabled=");
            a.append(this.f23621a);
            a.append(", isRevenueTrackingEnabled=");
            a.append(this.f23622b);
            a.append(", initTimeoutMs=");
            a.append(this.f23623c);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.b$d */
    public static final class C9332d {

        /* renamed from: a */
        public final List<String> f23624a;

        /* renamed from: b */
        public final Long f23625b;

        /* renamed from: c */
        public final boolean f23626c;

        /* renamed from: d */
        public final boolean f23627d;

        /* renamed from: e */
        public final String f23628e;

        /* renamed from: f */
        public final long f23629f;

        /* renamed from: g */
        public final String f23630g;

        public C9332d(List<String> list, Long l, boolean z, boolean z2, String str, long j, String str2) {
            Intrinsics.checkNotNullParameter(list, "configKeys");
            Intrinsics.checkNotNullParameter(str, "adRevenueKey");
            this.f23624a = list;
            this.f23625b = l;
            this.f23626c = z;
            this.f23627d = z2;
            this.f23628e = str;
            this.f23629f = j;
            this.f23630g = str2;
        }

        /* renamed from: a */
        public final String mo60399a() {
            return this.f23628e;
        }

        /* renamed from: b */
        public final List<String> mo60400b() {
            return this.f23624a;
        }

        /* renamed from: c */
        public final Long mo60401c() {
            return this.f23625b;
        }

        /* renamed from: d */
        public final long mo60402d() {
            return this.f23629f;
        }

        /* renamed from: e */
        public final String mo60403e() {
            return this.f23630g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9332d)) {
                return false;
            }
            C9332d dVar = (C9332d) obj;
            return Intrinsics.areEqual((Object) this.f23624a, (Object) dVar.f23624a) && Intrinsics.areEqual((Object) this.f23625b, (Object) dVar.f23625b) && this.f23626c == dVar.f23626c && this.f23627d == dVar.f23627d && Intrinsics.areEqual((Object) this.f23628e, (Object) dVar.f23628e) && this.f23629f == dVar.f23629f && Intrinsics.areEqual((Object) this.f23630g, (Object) dVar.f23630g);
        }

        /* renamed from: f */
        public final boolean mo60405f() {
            return this.f23626c;
        }

        /* renamed from: g */
        public final boolean mo60406g() {
            return this.f23627d;
        }

        public final int hashCode() {
            int hashCode = this.f23624a.hashCode() * 31;
            Long l = this.f23625b;
            int i = 0;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            boolean z = this.f23626c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f23627d;
            if (!z3) {
                z2 = z3;
            }
            int hashCode3 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23629f) + C9327a.m27564a(this.f23628e, (i2 + (z2 ? 1 : 0)) * 31, 31)) * 31;
            String str = this.f23630g;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("FirebaseConfig(configKeys=");
            a.append(this.f23624a);
            a.append(", expirationDurationSec=");
            a.append(this.f23625b);
            a.append(", isEventTrackingEnabled=");
            a.append(this.f23626c);
            a.append(", isRevenueTrackingEnabled=");
            a.append(this.f23627d);
            a.append(", adRevenueKey=");
            a.append(this.f23628e);
            a.append(", initTimeoutMs=");
            a.append(this.f23629f);
            a.append(", initializationMode=");
            a.append(this.f23630g);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.b$e */
    public static final class C9333e {

        /* renamed from: a */
        public final String f23631a;

        /* renamed from: b */
        public final String f23632b;

        /* renamed from: c */
        public final boolean f23633c;

        /* renamed from: d */
        public final boolean f23634d;

        /* renamed from: e */
        public final String f23635e;

        /* renamed from: f */
        public final boolean f23636f;

        /* renamed from: g */
        public final long f23637g;

        public C9333e(String str, String str2, boolean z, boolean z2, String str3, boolean z3, long j) {
            Intrinsics.checkNotNullParameter(str, "sentryDsn");
            Intrinsics.checkNotNullParameter(str2, "sentryEnvironment");
            Intrinsics.checkNotNullParameter(str3, "mdsReportUrl");
            this.f23631a = str;
            this.f23632b = str2;
            this.f23633c = z;
            this.f23634d = z2;
            this.f23635e = str3;
            this.f23636f = z3;
            this.f23637g = j;
        }

        /* renamed from: a */
        public final long mo60409a() {
            return this.f23637g;
        }

        /* renamed from: b */
        public final String mo60410b() {
            return this.f23635e;
        }

        /* renamed from: c */
        public final boolean mo60411c() {
            return this.f23633c;
        }

        /* renamed from: d */
        public final String mo60412d() {
            return this.f23631a;
        }

        /* renamed from: e */
        public final String mo60413e() {
            return this.f23632b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9333e)) {
                return false;
            }
            C9333e eVar = (C9333e) obj;
            return Intrinsics.areEqual((Object) this.f23631a, (Object) eVar.f23631a) && Intrinsics.areEqual((Object) this.f23632b, (Object) eVar.f23632b) && this.f23633c == eVar.f23633c && this.f23634d == eVar.f23634d && Intrinsics.areEqual((Object) this.f23635e, (Object) eVar.f23635e) && this.f23636f == eVar.f23636f && this.f23637g == eVar.f23637g;
        }

        /* renamed from: f */
        public final boolean mo60415f() {
            return this.f23636f;
        }

        /* renamed from: g */
        public final boolean mo60416g() {
            return this.f23634d;
        }

        public final int hashCode() {
            int a = C9327a.m27564a(this.f23632b, this.f23631a.hashCode() * 31, 31);
            boolean z = this.f23633c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (a + (z ? 1 : 0)) * 31;
            boolean z3 = this.f23634d;
            if (z3) {
                z3 = true;
            }
            int a2 = C9327a.m27564a(this.f23635e, (i + (z3 ? 1 : 0)) * 31, 31);
            boolean z4 = this.f23636f;
            if (!z4) {
                z2 = z4;
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23637g) + ((a2 + (z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("SentryAnalyticConfig(sentryDsn=");
            a.append(this.f23631a);
            a.append(", sentryEnvironment=");
            a.append(this.f23632b);
            a.append(", sentryCollectThreads=");
            a.append(this.f23633c);
            a.append(", isSentryTrackingEnabled=");
            a.append(this.f23634d);
            a.append(", mdsReportUrl=");
            a.append(this.f23635e);
            a.append(", isMdsEventTrackingEnabled=");
            a.append(this.f23636f);
            a.append(", initTimeoutMs=");
            a.append(this.f23637g);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.b$f */
    public static final class C9334f {

        /* renamed from: a */
        public final String f23638a;

        /* renamed from: b */
        public final long f23639b;

        /* renamed from: c */
        public final String f23640c;

        /* renamed from: d */
        public final String f23641d;

        /* renamed from: e */
        public final boolean f23642e;

        /* renamed from: f */
        public final long f23643f;

        /* renamed from: g */
        public final boolean f23644g;

        /* renamed from: h */
        public final long f23645h;

        public C9334f(String str, long j, String str2, String str3, boolean z, long j2, boolean z2, long j3) {
            Intrinsics.checkNotNullParameter(str, "reportUrl");
            Intrinsics.checkNotNullParameter(str2, "crashLogLevel");
            Intrinsics.checkNotNullParameter(str3, "reportLogLevel");
            this.f23638a = str;
            this.f23639b = j;
            this.f23640c = str2;
            this.f23641d = str3;
            this.f23642e = z;
            this.f23643f = j2;
            this.f23644g = z2;
            this.f23645h = j3;
        }

        /* renamed from: a */
        public final String mo60419a() {
            return this.f23640c;
        }

        /* renamed from: b */
        public final long mo60420b() {
            return this.f23645h;
        }

        /* renamed from: c */
        public final long mo60421c() {
            return this.f23643f;
        }

        /* renamed from: d */
        public final String mo60422d() {
            return this.f23641d;
        }

        /* renamed from: e */
        public final long mo60423e() {
            return this.f23639b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9334f)) {
                return false;
            }
            C9334f fVar = (C9334f) obj;
            return Intrinsics.areEqual((Object) this.f23638a, (Object) fVar.f23638a) && this.f23639b == fVar.f23639b && Intrinsics.areEqual((Object) this.f23640c, (Object) fVar.f23640c) && Intrinsics.areEqual((Object) this.f23641d, (Object) fVar.f23641d) && this.f23642e == fVar.f23642e && this.f23643f == fVar.f23643f && this.f23644g == fVar.f23644g && this.f23645h == fVar.f23645h;
        }

        /* renamed from: f */
        public final String mo60425f() {
            return this.f23638a;
        }

        /* renamed from: g */
        public final boolean mo60426g() {
            return this.f23642e;
        }

        /* renamed from: h */
        public final boolean mo60427h() {
            return this.f23644g;
        }

        public final int hashCode() {
            int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23639b);
            int a = C9327a.m27564a(this.f23641d, C9327a.m27564a(this.f23640c, (hashCode + (this.f23638a.hashCode() * 31)) * 31, 31), 31);
            boolean z = this.f23642e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23643f) + ((a + (z ? 1 : 0)) * 31)) * 31;
            boolean z3 = this.f23644g;
            if (!z3) {
                z2 = z3;
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23645h) + ((hashCode2 + (z2 ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("StackAnalyticConfig(reportUrl=");
            a.append(this.f23638a);
            a.append(", reportSize=");
            a.append(this.f23639b);
            a.append(", crashLogLevel=");
            a.append(this.f23640c);
            a.append(", reportLogLevel=");
            a.append(this.f23641d);
            a.append(", isEventTrackingEnabled=");
            a.append(this.f23642e);
            a.append(", reportIntervalMsec=");
            a.append(this.f23643f);
            a.append(", isNativeTrackingEnabled=");
            a.append(this.f23644g);
            a.append(", initTimeoutMs=");
            a.append(this.f23645h);
            a.append(')');
            return a.toString();
        }
    }

    public C9328b(C9330b bVar, C9329a aVar, C9331c cVar, C9332d dVar, C9334f fVar, C9333e eVar) {
        this.f23600a = bVar;
        this.f23601b = aVar;
        this.f23602c = cVar;
        this.f23603d = dVar;
        this.f23604e = fVar;
        this.f23605f = eVar;
    }

    /* renamed from: a */
    public final C9329a mo60364a() {
        return this.f23601b;
    }

    /* renamed from: b */
    public final C9330b mo60365b() {
        return this.f23600a;
    }

    /* renamed from: c */
    public final C9331c mo60366c() {
        return this.f23602c;
    }

    /* renamed from: d */
    public final C9332d mo60367d() {
        return this.f23603d;
    }

    /* renamed from: e */
    public final C9333e mo60368e() {
        return this.f23605f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9328b)) {
            return false;
        }
        C9328b bVar = (C9328b) obj;
        return Intrinsics.areEqual((Object) this.f23600a, (Object) bVar.f23600a) && Intrinsics.areEqual((Object) this.f23601b, (Object) bVar.f23601b) && Intrinsics.areEqual((Object) this.f23602c, (Object) bVar.f23602c) && Intrinsics.areEqual((Object) this.f23603d, (Object) bVar.f23603d) && Intrinsics.areEqual((Object) this.f23604e, (Object) bVar.f23604e) && Intrinsics.areEqual((Object) this.f23605f, (Object) bVar.f23605f);
    }

    /* renamed from: f */
    public final C9334f mo60370f() {
        return this.f23604e;
    }

    public final int hashCode() {
        C9330b bVar = this.f23600a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        C9329a aVar = this.f23601b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C9331c cVar = this.f23602c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C9332d dVar = this.f23603d;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C9334f fVar = this.f23604e;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        C9333e eVar = this.f23605f;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder a = C9203h0.m27334a("Config(appsflyerConfig=");
        a.append(this.f23600a);
        a.append(", adjustConfig=");
        a.append(this.f23601b);
        a.append(", facebookConfig=");
        a.append(this.f23602c);
        a.append(", firebaseConfig=");
        a.append(this.f23603d);
        a.append(", stackAnalyticConfig=");
        a.append(this.f23604e);
        a.append(", sentryAnalyticConfig=");
        a.append(this.f23605f);
        a.append(')');
        return a.toString();
    }
}
