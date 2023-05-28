package com.appodeal.ads.networking.binders;

import com.amazon.aps.shared.APSAnalytics;
import com.appodeal.ads.C9203h0;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.networking.C9327a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.networking.binders.b */
public interface C9336b {

    /* renamed from: com.appodeal.ads.networking.binders.b$a */
    public static final class C9337a implements C9336b {

        /* renamed from: a */
        public final String f23648a;

        /* renamed from: b */
        public final Boolean f23649b;

        /* renamed from: c */
        public final Boolean f23650c;

        /* renamed from: d */
        public final String f23651d;

        /* renamed from: e */
        public final long f23652e;

        /* renamed from: f */
        public final Long f23653f;

        /* renamed from: g */
        public final Long f23654g;

        /* renamed from: h */
        public final Long f23655h;

        /* renamed from: i */
        public final String f23656i;

        /* renamed from: j */
        public final C9338a f23657j;

        /* renamed from: com.appodeal.ads.networking.binders.b$a$a */
        public interface C9338a {

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$a */
            public static final class C9339a implements C9338a {

                /* renamed from: a */
                public final String f23658a;

                /* renamed from: b */
                public final int f23659b;

                /* renamed from: c */
                public final boolean f23660c;

                /* renamed from: d */
                public final boolean f23661d;

                public C9339a(String str, int i, boolean z, boolean z2) {
                    Intrinsics.checkNotNullParameter(str, "type");
                    this.f23658a = str;
                    this.f23659b = i;
                    this.f23660c = z;
                    this.f23661d = z2;
                }

                /* renamed from: a */
                public final boolean mo60449a() {
                    return this.f23660c;
                }

                /* renamed from: b */
                public final int mo60450b() {
                    return this.f23659b;
                }

                /* renamed from: c */
                public final boolean mo60451c() {
                    return this.f23661d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C9339a)) {
                        return false;
                    }
                    C9339a aVar = (C9339a) obj;
                    return Intrinsics.areEqual((Object) this.f23658a, (Object) aVar.f23658a) && this.f23659b == aVar.f23659b && this.f23660c == aVar.f23660c && this.f23661d == aVar.f23661d;
                }

                public final String getType() {
                    return this.f23658a;
                }

                public final int hashCode() {
                    int hashCode = (this.f23659b + (this.f23658a.hashCode() * 31)) * 31;
                    boolean z = this.f23660c;
                    boolean z2 = true;
                    if (z) {
                        z = true;
                    }
                    int i = (hashCode + (z ? 1 : 0)) * 31;
                    boolean z3 = this.f23661d;
                    if (!z3) {
                        z2 = z3;
                    }
                    return i + (z2 ? 1 : 0);
                }

                public final String toString() {
                    StringBuilder a = C9203h0.m27334a("Banner(type=");
                    a.append(this.f23658a);
                    a.append(", size=");
                    a.append(this.f23659b);
                    a.append(", animation=");
                    a.append(this.f23660c);
                    a.append(", smart=");
                    a.append(this.f23661d);
                    a.append(')');
                    return a.toString();
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$b */
            public static final class C9340b implements C9338a {

                /* renamed from: a */
                public static final C9340b f23662a = new C9340b();

                public final String getType() {
                    return "banner";
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$c */
            public static final class C9341c implements C9338a {

                /* renamed from: a */
                public static final C9341c f23663a = new C9341c();

                public final String getType() {
                    return "bannerview";
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$d */
            public static final class C9342d implements C9338a {

                /* renamed from: a */
                public final String f23664a;

                public C9342d(String str) {
                    Intrinsics.checkNotNullParameter(str, "type");
                    this.f23664a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C9342d) && Intrinsics.areEqual((Object) this.f23664a, (Object) ((C9342d) obj).f23664a);
                }

                public final String getType() {
                    return this.f23664a;
                }

                public final int hashCode() {
                    return this.f23664a.hashCode();
                }

                public final String toString() {
                    StringBuilder a = C9203h0.m27334a("Native(type=");
                    a.append(this.f23664a);
                    a.append(')');
                    return a.toString();
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$e */
            public static final class C9343e implements C9338a {

                /* renamed from: a */
                public static final C9343e f23665a = new C9343e();

                public final String getType() {
                    return "rewarded_video";
                }
            }

            /* renamed from: com.appodeal.ads.networking.binders.b$a$a$f */
            public static final class C9344f implements C9338a {

                /* renamed from: a */
                public static final C9344f f23666a = new C9344f();

                public final String getType() {
                    return "video";
                }
            }

            String getType();
        }

        public C9337a(String str, Boolean bool, Boolean bool2, String str2, long j, Long l, Long l2, Long l3, String str3, C9338a aVar) {
            Intrinsics.checkNotNullParameter(str, "adType");
            this.f23648a = str;
            this.f23649b = bool;
            this.f23650c = bool2;
            this.f23651d = str2;
            this.f23652e = j;
            this.f23653f = l;
            this.f23654g = l2;
            this.f23655h = l3;
            this.f23656i = str3;
            this.f23657j = aVar;
        }

        /* renamed from: a */
        public final C9338a mo60435a() {
            return this.f23657j;
        }

        /* renamed from: b */
        public final String mo60436b() {
            return this.f23648a;
        }

        /* renamed from: c */
        public final Long mo60437c() {
            return this.f23654g;
        }

        /* renamed from: d */
        public final Long mo60438d() {
            return this.f23655h;
        }

        /* renamed from: e */
        public final String mo60439e() {
            return this.f23656i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9337a)) {
                return false;
            }
            C9337a aVar = (C9337a) obj;
            return Intrinsics.areEqual((Object) this.f23648a, (Object) aVar.f23648a) && Intrinsics.areEqual((Object) this.f23649b, (Object) aVar.f23649b) && Intrinsics.areEqual((Object) this.f23650c, (Object) aVar.f23650c) && Intrinsics.areEqual((Object) this.f23651d, (Object) aVar.f23651d) && this.f23652e == aVar.f23652e && Intrinsics.areEqual((Object) this.f23653f, (Object) aVar.f23653f) && Intrinsics.areEqual((Object) this.f23654g, (Object) aVar.f23654g) && Intrinsics.areEqual((Object) this.f23655h, (Object) aVar.f23655h) && Intrinsics.areEqual((Object) this.f23656i, (Object) aVar.f23656i) && Intrinsics.areEqual((Object) this.f23657j, (Object) aVar.f23657j);
        }

        /* renamed from: f */
        public final Boolean mo60441f() {
            return this.f23650c;
        }

        /* renamed from: g */
        public final String mo60442g() {
            return this.f23651d;
        }

        /* renamed from: h */
        public final Boolean mo60443h() {
            return this.f23649b;
        }

        public final int hashCode() {
            int hashCode = this.f23648a.hashCode() * 31;
            Boolean bool = this.f23649b;
            int i = 0;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f23650c;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f23651d;
            int hashCode4 = (C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23652e) + ((hashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Long l = this.f23653f;
            int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.f23654g;
            int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.f23655h;
            int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
            String str2 = this.f23656i;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C9338a aVar = this.f23657j;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode8 + i;
        }

        /* renamed from: i */
        public final long mo60445i() {
            return this.f23652e;
        }

        /* renamed from: j */
        public final Long mo60446j() {
            return this.f23653f;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("AdRequest(adType=");
            a.append(this.f23648a);
            a.append(", rewardedVideo=");
            a.append(this.f23649b);
            a.append(", largeBanners=");
            a.append(this.f23650c);
            a.append(", mainId=");
            a.append(this.f23651d);
            a.append(", segmentId=");
            a.append(this.f23652e);
            a.append(", showTimeStamp=");
            a.append(this.f23653f);
            a.append(", clickTimeStamp=");
            a.append(this.f23654g);
            a.append(", finishTimeStamp=");
            a.append(this.f23655h);
            a.append(", impressionId=");
            a.append(this.f23656i);
            a.append(", adProperties=");
            a.append(this.f23657j);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$b */
    public static final class C9345b implements C9336b {

        /* renamed from: a */
        public final C9346a f23667a;

        /* renamed from: com.appodeal.ads.networking.binders.b$b$a */
        public static final class C9346a {

            /* renamed from: a */
            public final String f23668a;

            /* renamed from: b */
            public final int f23669b;

            /* renamed from: c */
            public final int f23670c;

            /* renamed from: d */
            public final int f23671d;

            /* renamed from: e */
            public final int f23672e;

            /* renamed from: f */
            public final Integer f23673f;

            /* renamed from: g */
            public final int f23674g;

            public C9346a(String str, int i, int i2, int i3, int i4, Integer num, int i5) {
                Intrinsics.checkNotNullParameter(str, "adServerCodeName");
                this.f23668a = str;
                this.f23669b = i;
                this.f23670c = i2;
                this.f23671d = i3;
                this.f23672e = i4;
                this.f23673f = num;
                this.f23674g = i5;
            }

            /* renamed from: a */
            public final String mo60462a() {
                return this.f23668a;
            }

            /* renamed from: b */
            public final int mo60463b() {
                return this.f23671d;
            }

            /* renamed from: c */
            public final int mo60464c() {
                return this.f23672e;
            }

            /* renamed from: d */
            public final Integer mo60465d() {
                return this.f23673f;
            }

            /* renamed from: e */
            public final int mo60466e() {
                return this.f23674g;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9346a)) {
                    return false;
                }
                C9346a aVar = (C9346a) obj;
                return Intrinsics.areEqual((Object) this.f23668a, (Object) aVar.f23668a) && this.f23669b == aVar.f23669b && this.f23670c == aVar.f23670c && this.f23671d == aVar.f23671d && this.f23672e == aVar.f23672e && Intrinsics.areEqual((Object) this.f23673f, (Object) aVar.f23673f) && this.f23674g == aVar.f23674g;
            }

            /* renamed from: f */
            public final int mo60468f() {
                return this.f23669b;
            }

            /* renamed from: g */
            public final int mo60469g() {
                return this.f23670c;
            }

            public final int hashCode() {
                int i = this.f23669b;
                int i2 = this.f23670c;
                int hashCode = (this.f23672e + ((this.f23671d + ((i2 + ((i + (this.f23668a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
                Integer num = this.f23673f;
                return this.f23674g + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder a = C9203h0.m27334a("AdStat(adServerCodeName=");
                a.append(this.f23668a);
                a.append(", impressions=");
                a.append(this.f23669b);
                a.append(", impressionsTotal=");
                a.append(this.f23670c);
                a.append(", click=");
                a.append(this.f23671d);
                a.append(", clickTotal=");
                a.append(this.f23672e);
                a.append(", finish=");
                a.append(this.f23673f);
                a.append(", finishTotal=");
                a.append(this.f23674g);
                a.append(')');
                return a.toString();
            }
        }

        public C9345b(C9346a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "adStats");
            this.f23667a = aVar;
        }

        /* renamed from: a */
        public final C9346a mo60458a() {
            return this.f23667a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9345b) && Intrinsics.areEqual((Object) this.f23667a, (Object) ((C9345b) obj).f23667a);
        }

        public final int hashCode() {
            return this.f23667a.hashCode();
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("AdStats(adStats=");
            a.append(this.f23667a);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$c */
    public static final class C9347c implements C9336b {

        /* renamed from: a */
        public final List<String> f23675a;

        /* renamed from: b */
        public final Map<String, C9335a> f23676b;

        public C9347c(ArrayList arrayList, LinkedHashMap linkedHashMap) {
            Intrinsics.checkNotNullParameter(arrayList, "showArray");
            Intrinsics.checkNotNullParameter(linkedHashMap, "adapters");
            this.f23675a = arrayList;
            this.f23676b = linkedHashMap;
        }

        /* renamed from: a */
        public final Map<String, C9335a> mo60472a() {
            return this.f23676b;
        }

        /* renamed from: b */
        public final List<String> mo60473b() {
            return this.f23675a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9347c)) {
                return false;
            }
            C9347c cVar = (C9347c) obj;
            return Intrinsics.areEqual((Object) this.f23675a, (Object) cVar.f23675a) && Intrinsics.areEqual((Object) this.f23676b, (Object) cVar.f23676b);
        }

        public final int hashCode() {
            return this.f23676b.hashCode() + (this.f23675a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Adapters(showArray=");
            a.append(this.f23675a);
            a.append(", adapters=");
            a.append(this.f23676b);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$d */
    public static final class C9348d implements C9336b {

        /* renamed from: a */
        public final String f23677a;

        /* renamed from: b */
        public final String f23678b;

        /* renamed from: c */
        public final boolean f23679c;

        public C9348d(String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "ifa");
            Intrinsics.checkNotNullParameter(str2, "advertisingTracking");
            this.f23677a = str;
            this.f23678b = str2;
            this.f23679c = z;
        }

        /* renamed from: a */
        public final boolean mo60477a() {
            return this.f23679c;
        }

        /* renamed from: b */
        public final String mo60478b() {
            return this.f23678b;
        }

        /* renamed from: c */
        public final String mo60479c() {
            return this.f23677a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9348d)) {
                return false;
            }
            C9348d dVar = (C9348d) obj;
            return Intrinsics.areEqual((Object) this.f23677a, (Object) dVar.f23677a) && Intrinsics.areEqual((Object) this.f23678b, (Object) dVar.f23678b) && this.f23679c == dVar.f23679c;
        }

        public final int hashCode() {
            int a = C9327a.m27564a(this.f23678b, this.f23677a.hashCode() * 31, 31);
            boolean z = this.f23679c;
            if (z) {
                z = true;
            }
            return a + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Advertising(ifa=");
            a.append(this.f23677a);
            a.append(", advertisingTracking=");
            a.append(this.f23678b);
            a.append(", advertisingIdGenerated=");
            a.append(this.f23679c);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$e */
    public static final class C9349e implements C9336b {

        /* renamed from: A */
        public final double f23680A;

        /* renamed from: B */
        public final long f23681B;

        /* renamed from: C */
        public final long f23682C;

        /* renamed from: D */
        public final long f23683D;

        /* renamed from: E */
        public final long f23684E;

        /* renamed from: F */
        public final long f23685F;

        /* renamed from: G */
        public final long f23686G;

        /* renamed from: H */
        public final double f23687H;

        /* renamed from: I */
        public final boolean f23688I;

        /* renamed from: J */
        public final Boolean f23689J;

        /* renamed from: K */
        public final JSONObject f23690K;

        /* renamed from: a */
        public final String f23691a;

        /* renamed from: b */
        public final String f23692b;

        /* renamed from: c */
        public final String f23693c = APSAnalytics.OS_NAME;

        /* renamed from: d */
        public final String f23694d;

        /* renamed from: e */
        public final String f23695e;

        /* renamed from: f */
        public final String f23696f;

        /* renamed from: g */
        public final String f23697g;

        /* renamed from: h */
        public final int f23698h;

        /* renamed from: i */
        public final String f23699i;

        /* renamed from: j */
        public final String f23700j;

        /* renamed from: k */
        public final String f23701k;

        /* renamed from: l */
        public final Long f23702l;

        /* renamed from: m */
        public final String f23703m;

        /* renamed from: n */
        public final String f23704n;

        /* renamed from: o */
        public final String f23705o;

        /* renamed from: p */
        public final String f23706p;

        /* renamed from: q */
        public final double f23707q;

        /* renamed from: r */
        public final String f23708r;

        /* renamed from: s */
        public final boolean f23709s;

        /* renamed from: t */
        public final String f23710t;

        /* renamed from: u */
        public final String f23711u;

        /* renamed from: v */
        public final boolean f23712v;

        /* renamed from: w */
        public final String f23713w;

        /* renamed from: x */
        public final int f23714x;

        /* renamed from: y */
        public final int f23715y;

        /* renamed from: z */
        public final String f23716z;

        public C9349e(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, double d, String str14, boolean z, String str15, String str16, boolean z2, String str17, int i2, int i3, String str18, double d2, long j, long j2, long j3, long j4, long j5, long j6, double d3, boolean z3, Boolean bool, JSONObject jSONObject) {
            String str19 = str3;
            String str20 = str4;
            String str21 = str5;
            String str22 = str6;
            String str23 = str8;
            String str24 = str14;
            String str25 = str15;
            String str26 = str16;
            Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
            Intrinsics.checkNotNullParameter(str2, "sdk");
            Intrinsics.checkNotNullParameter(APSAnalytics.OS_NAME, "os");
            Intrinsics.checkNotNullParameter(str19, "osVersion");
            Intrinsics.checkNotNullParameter(str20, "osv");
            Intrinsics.checkNotNullParameter(str21, "platform");
            Intrinsics.checkNotNullParameter(str22, "android");
            Intrinsics.checkNotNullParameter(str23, "packageName");
            Intrinsics.checkNotNullParameter(str24, "deviceType");
            Intrinsics.checkNotNullParameter(str25, "manufacturer");
            Intrinsics.checkNotNullParameter(str26, "deviceModelManufacturer");
            this.f23691a = str;
            this.f23692b = str2;
            this.f23694d = str19;
            this.f23695e = str20;
            this.f23696f = str21;
            this.f23697g = str22;
            this.f23698h = i;
            this.f23699i = str7;
            this.f23700j = str23;
            this.f23701k = str9;
            this.f23702l = l;
            this.f23703m = str10;
            this.f23704n = str11;
            this.f23705o = str12;
            this.f23706p = str13;
            this.f23707q = d;
            this.f23708r = str24;
            this.f23709s = z;
            this.f23710t = str25;
            this.f23711u = str26;
            this.f23712v = z2;
            this.f23713w = str17;
            this.f23714x = i2;
            this.f23715y = i3;
            this.f23716z = str18;
            this.f23680A = d2;
            this.f23681B = j;
            this.f23682C = j2;
            this.f23683D = j3;
            this.f23684E = j4;
            this.f23685F = j5;
            this.f23686G = j6;
            this.f23687H = d3;
            this.f23688I = z3;
            this.f23689J = bool;
            this.f23690K = jSONObject;
        }

        /* renamed from: A */
        public final boolean mo60483A() {
            return this.f23712v;
        }

        /* renamed from: B */
        public final int mo60484B() {
            return this.f23715y;
        }

        /* renamed from: C */
        public final double mo60485C() {
            return this.f23707q;
        }

        /* renamed from: D */
        public final int mo60486D() {
            return this.f23714x;
        }

        /* renamed from: E */
        public final String mo60487E() {
            return this.f23692b;
        }

        /* renamed from: F */
        public final String mo60488F() {
            return this.f23699i;
        }

        /* renamed from: G */
        public final long mo60489G() {
            return this.f23682C;
        }

        /* renamed from: H */
        public final long mo60490H() {
            return this.f23681B;
        }

        /* renamed from: I */
        public final long mo60491I() {
            return this.f23683D;
        }

        /* renamed from: J */
        public final Boolean mo60492J() {
            return this.f23689J;
        }

        /* renamed from: K */
        public final String mo60493K() {
            return this.f23713w;
        }

        /* renamed from: a */
        public final String mo60494a() {
            return this.f23697g;
        }

        /* renamed from: b */
        public final int mo60495b() {
            return this.f23698h;
        }

        /* renamed from: c */
        public final String mo60496c() {
            return this.f23691a;
        }

        /* renamed from: d */
        public final String mo60497d() {
            return this.f23704n;
        }

        /* renamed from: e */
        public final String mo60498e() {
            return this.f23705o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9349e)) {
                return false;
            }
            C9349e eVar = (C9349e) obj;
            return Intrinsics.areEqual((Object) this.f23691a, (Object) eVar.f23691a) && Intrinsics.areEqual((Object) this.f23692b, (Object) eVar.f23692b) && Intrinsics.areEqual((Object) this.f23693c, (Object) eVar.f23693c) && Intrinsics.areEqual((Object) this.f23694d, (Object) eVar.f23694d) && Intrinsics.areEqual((Object) this.f23695e, (Object) eVar.f23695e) && Intrinsics.areEqual((Object) this.f23696f, (Object) eVar.f23696f) && Intrinsics.areEqual((Object) this.f23697g, (Object) eVar.f23697g) && this.f23698h == eVar.f23698h && Intrinsics.areEqual((Object) this.f23699i, (Object) eVar.f23699i) && Intrinsics.areEqual((Object) this.f23700j, (Object) eVar.f23700j) && Intrinsics.areEqual((Object) this.f23701k, (Object) eVar.f23701k) && Intrinsics.areEqual((Object) this.f23702l, (Object) eVar.f23702l) && Intrinsics.areEqual((Object) this.f23703m, (Object) eVar.f23703m) && Intrinsics.areEqual((Object) this.f23704n, (Object) eVar.f23704n) && Intrinsics.areEqual((Object) this.f23705o, (Object) eVar.f23705o) && Intrinsics.areEqual((Object) this.f23706p, (Object) eVar.f23706p) && Intrinsics.areEqual((Object) Double.valueOf(this.f23707q), (Object) Double.valueOf(eVar.f23707q)) && Intrinsics.areEqual((Object) this.f23708r, (Object) eVar.f23708r) && this.f23709s == eVar.f23709s && Intrinsics.areEqual((Object) this.f23710t, (Object) eVar.f23710t) && Intrinsics.areEqual((Object) this.f23711u, (Object) eVar.f23711u) && this.f23712v == eVar.f23712v && Intrinsics.areEqual((Object) this.f23713w, (Object) eVar.f23713w) && this.f23714x == eVar.f23714x && this.f23715y == eVar.f23715y && Intrinsics.areEqual((Object) this.f23716z, (Object) eVar.f23716z) && Intrinsics.areEqual((Object) Double.valueOf(this.f23680A), (Object) Double.valueOf(eVar.f23680A)) && this.f23681B == eVar.f23681B && this.f23682C == eVar.f23682C && this.f23683D == eVar.f23683D && this.f23684E == eVar.f23684E && this.f23685F == eVar.f23685F && this.f23686G == eVar.f23686G && Intrinsics.areEqual((Object) Double.valueOf(this.f23687H), (Object) Double.valueOf(eVar.f23687H)) && this.f23688I == eVar.f23688I && Intrinsics.areEqual((Object) this.f23689J, (Object) eVar.f23689J) && Intrinsics.areEqual((Object) this.f23690K, (Object) eVar.f23690K);
        }

        /* renamed from: f */
        public final String mo60500f() {
            return this.f23706p;
        }

        /* renamed from: g */
        public final double mo60501g() {
            return this.f23680A;
        }

        /* renamed from: h */
        public final boolean mo60502h() {
            return this.f23688I;
        }

        public final int hashCode() {
            int a = (this.f23698h + C9327a.m27564a(this.f23697g, C9327a.m27564a(this.f23696f, C9327a.m27564a(this.f23695e, C9327a.m27564a(this.f23694d, C9327a.m27564a(this.f23693c, C9327a.m27564a(this.f23692b, this.f23691a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31;
            String str = this.f23699i;
            int i = 0;
            int a2 = C9327a.m27564a(this.f23700j, (a + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.f23701k;
            int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.f23702l;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.f23703m;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f23704n;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f23705o;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f23706p;
            int a3 = C9327a.m27564a(this.f23708r, (Double.doubleToLongBits(this.f23707q) + ((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31, 31);
            boolean z = this.f23709s;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int a4 = C9327a.m27564a(this.f23711u, C9327a.m27564a(this.f23710t, (a3 + (z ? 1 : 0)) * 31, 31), 31);
            boolean z3 = this.f23712v;
            if (z3) {
                z3 = true;
            }
            int i2 = (a4 + (z3 ? 1 : 0)) * 31;
            String str7 = this.f23713w;
            int hashCode6 = (this.f23715y + ((this.f23714x + ((i2 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31)) * 31;
            String str8 = this.f23716z;
            int hashCode7 = (Double.doubleToLongBits(this.f23687H) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23686G) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23685F) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23684E) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23683D) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23682C) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23681B) + ((Double.doubleToLongBits(this.f23680A) + ((hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            boolean z4 = this.f23688I;
            if (!z4) {
                z2 = z4;
            }
            int i3 = (hashCode7 + (z2 ? 1 : 0)) * 31;
            Boolean bool = this.f23689J;
            int hashCode8 = (i3 + (bool == null ? 0 : bool.hashCode())) * 31;
            JSONObject jSONObject = this.f23690K;
            if (jSONObject != null) {
                i = jSONObject.hashCode();
            }
            return hashCode8 + i;
        }

        /* renamed from: i */
        public final double mo60504i() {
            return this.f23687H;
        }

        /* renamed from: j */
        public final String mo60505j() {
            return this.f23716z;
        }

        /* renamed from: k */
        public final String mo60506k() {
            return this.f23711u;
        }

        /* renamed from: l */
        public final String mo60507l() {
            return this.f23708r;
        }

        /* renamed from: m */
        public final JSONObject mo60508m() {
            return this.f23690K;
        }

        /* renamed from: n */
        public final boolean mo60509n() {
            return this.f23709s;
        }

        /* renamed from: o */
        public final Long mo60510o() {
            return this.f23702l;
        }

        /* renamed from: p */
        public final String mo60511p() {
            return this.f23703m;
        }

        /* renamed from: q */
        public final String mo60512q() {
            return this.f23710t;
        }

        /* renamed from: r */
        public final String mo60513r() {
            return this.f23693c;
        }

        /* renamed from: s */
        public final String mo60514s() {
            return this.f23694d;
        }

        /* renamed from: t */
        public final String mo60515t() {
            return this.f23695e;
        }

        public final String toString() {
            return "Base(appKey=" + this.f23691a + ", sdk=" + this.f23692b + ", os=" + this.f23693c + ", osVersion=" + this.f23694d + ", osv=" + this.f23695e + ", platform=" + this.f23696f + ", android=" + this.f23697g + ", androidLevel=" + this.f23698h + ", secureAndroidId=" + this.f23699i + ", packageName=" + this.f23700j + ", packageVersion=" + this.f23701k + ", installTime=" + this.f23702l + ", installer=" + this.f23703m + ", appodealFramework=" + this.f23704n + ", appodealFrameworkVersion=" + this.f23705o + ", appodealPluginVersion=" + this.f23706p + ", screenPxRatio=" + this.f23707q + ", deviceType=" + this.f23708r + ", httpAllowed=" + this.f23709s + ", manufacturer=" + this.f23710t + ", deviceModelManufacturer=" + this.f23711u + ", rooted=" + this.f23712v + ", webviewVersion=" + this.f23713w + ", screenWidth=" + this.f23714x + ", screenHeight=" + this.f23715y + ", crr=" + this.f23716z + ", battery=" + this.f23680A + ", storageSize=" + this.f23681B + ", storageFree=" + this.f23682C + ", storageUsed=" + this.f23683D + ", ramSize=" + this.f23684E + ", ramFree=" + this.f23685F + ", ramUsed=" + this.f23686G + ", cpuUsage=" + this.f23687H + ", coppa=" + this.f23688I + ", testMode=" + this.f23689J + ", extensions=" + this.f23690K + ')';
        }

        /* renamed from: u */
        public final String mo60517u() {
            return this.f23700j;
        }

        /* renamed from: v */
        public final String mo60518v() {
            return this.f23701k;
        }

        /* renamed from: w */
        public final String mo60519w() {
            return this.f23696f;
        }

        /* renamed from: x */
        public final long mo60520x() {
            return this.f23685F;
        }

        /* renamed from: y */
        public final long mo60521y() {
            return this.f23684E;
        }

        /* renamed from: z */
        public final long mo60522z() {
            return this.f23686G;
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$f */
    public static final class C9350f implements C9336b {

        /* renamed from: a */
        public final String f23717a;

        /* renamed from: b */
        public final String f23718b;

        public C9350f(String str, String str2) {
            this.f23717a = str;
            this.f23718b = str2;
        }

        /* renamed from: a */
        public final String mo60523a() {
            return this.f23717a;
        }

        /* renamed from: b */
        public final String mo60524b() {
            return this.f23718b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9350f)) {
                return false;
            }
            C9350f fVar = (C9350f) obj;
            return Intrinsics.areEqual((Object) this.f23717a, (Object) fVar.f23717a) && Intrinsics.areEqual((Object) this.f23718b, (Object) fVar.f23718b);
        }

        public final int hashCode() {
            String str = this.f23717a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f23718b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Connection(connection=");
            a.append(this.f23717a);
            a.append(", connectionSubtype=");
            a.append(this.f23718b);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$g */
    public static final class C9351g implements C9336b {

        /* renamed from: a */
        public final Boolean f23719a;

        /* renamed from: b */
        public final JSONArray f23720b;

        /* renamed from: c */
        public final Boolean f23721c;

        public C9351g(Boolean bool, JSONArray jSONArray, Boolean bool2) {
            this.f23719a = bool;
            this.f23720b = jSONArray;
            this.f23721c = bool2;
        }

        /* renamed from: a */
        public final Boolean mo60528a() {
            return this.f23719a;
        }

        /* renamed from: b */
        public final Boolean mo60529b() {
            return this.f23721c;
        }

        /* renamed from: c */
        public final JSONArray mo60530c() {
            return this.f23720b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9351g)) {
                return false;
            }
            C9351g gVar = (C9351g) obj;
            return Intrinsics.areEqual((Object) this.f23719a, (Object) gVar.f23719a) && Intrinsics.areEqual((Object) this.f23720b, (Object) gVar.f23720b) && Intrinsics.areEqual((Object) this.f23721c, (Object) gVar.f23721c);
        }

        public final int hashCode() {
            Boolean bool = this.f23719a;
            int i = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            JSONArray jSONArray = this.f23720b;
            int hashCode2 = (hashCode + (jSONArray == null ? 0 : jSONArray.hashCode())) * 31;
            Boolean bool2 = this.f23721c;
            if (bool2 != null) {
                i = bool2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Get(adTypeDebug=");
            a.append(this.f23719a);
            a.append(", suspiciousActivity=");
            a.append(this.f23720b);
            a.append(", checkSdkVersion=");
            a.append(this.f23721c);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$h */
    public static final class C9352h implements C9336b {

        /* renamed from: a */
        public final Integer f23722a;

        /* renamed from: b */
        public final Float f23723b;

        /* renamed from: c */
        public final Float f23724c;

        public C9352h(Integer num, Float f, Float f2) {
            this.f23722a = num;
            this.f23723b = f;
            this.f23724c = f2;
        }

        /* renamed from: a */
        public final Float mo60534a() {
            return this.f23723b;
        }

        /* renamed from: b */
        public final Integer mo60535b() {
            return this.f23722a;
        }

        /* renamed from: c */
        public final Float mo60536c() {
            return this.f23724c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9352h)) {
                return false;
            }
            C9352h hVar = (C9352h) obj;
            return Intrinsics.areEqual((Object) this.f23722a, (Object) hVar.f23722a) && Intrinsics.areEqual((Object) this.f23723b, (Object) hVar.f23723b) && Intrinsics.areEqual((Object) this.f23724c, (Object) hVar.f23724c);
        }

        public final int hashCode() {
            Integer num = this.f23722a;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f = this.f23723b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f23724c;
            if (f2 != null) {
                i = f2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Location(locationType=");
            a.append(this.f23722a);
            a.append(", latitude=");
            a.append(this.f23723b);
            a.append(", longitude=");
            a.append(this.f23724c);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$i */
    public static final class C9353i implements C9336b {

        /* renamed from: a */
        public final JSONObject f23725a;

        public C9353i(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "customState");
            this.f23725a = jSONObject;
        }

        /* renamed from: a */
        public final JSONObject mo60540a() {
            return this.f23725a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9353i) && Intrinsics.areEqual((Object) this.f23725a, (Object) ((C9353i) obj).f23725a);
        }

        public final int hashCode() {
            return this.f23725a.hashCode();
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Segment(customState=");
            a.append(this.f23725a);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$j */
    public static final class C9354j implements C9336b {

        /* renamed from: a */
        public final List<ServiceInfo> f23726a;

        public C9354j(List<ServiceInfo> list) {
            Intrinsics.checkNotNullParameter(list, "services");
            this.f23726a = list;
        }

        /* renamed from: a */
        public final List<ServiceInfo> mo60544a() {
            return this.f23726a;
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$k */
    public static final class C9355k implements C9336b {

        /* renamed from: a */
        public final List<ServiceData> f23727a;

        public C9355k(List<? extends ServiceData> list) {
            Intrinsics.checkNotNullParameter(list, "servicesData");
            this.f23727a = list;
        }

        /* renamed from: a */
        public final List<ServiceData> mo60545a() {
            return this.f23727a;
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$l */
    public static final class C9356l implements C9336b {

        /* renamed from: a */
        public final long f23728a;

        /* renamed from: b */
        public final String f23729b;

        /* renamed from: c */
        public final long f23730c;

        /* renamed from: d */
        public final long f23731d;

        /* renamed from: e */
        public final long f23732e;

        /* renamed from: f */
        public final long f23733f;

        /* renamed from: g */
        public final long f23734g;

        /* renamed from: h */
        public final long f23735h;

        /* renamed from: i */
        public final long f23736i;

        /* renamed from: j */
        public final long f23737j;

        public C9356l(long j, String str, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
            this.f23728a = j;
            this.f23729b = str;
            this.f23730c = j2;
            this.f23731d = j3;
            this.f23732e = j4;
            this.f23733f = j5;
            this.f23734g = j6;
            this.f23735h = j7;
            this.f23736i = j8;
            this.f23737j = j9;
        }

        /* renamed from: a */
        public final long mo60546a() {
            return this.f23736i;
        }

        /* renamed from: b */
        public final long mo60547b() {
            return this.f23737j;
        }

        /* renamed from: c */
        public final long mo60548c() {
            return this.f23734g;
        }

        /* renamed from: d */
        public final long mo60549d() {
            return this.f23735h;
        }

        /* renamed from: e */
        public final long mo60550e() {
            return this.f23728a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9356l)) {
                return false;
            }
            C9356l lVar = (C9356l) obj;
            return this.f23728a == lVar.f23728a && Intrinsics.areEqual((Object) this.f23729b, (Object) lVar.f23729b) && this.f23730c == lVar.f23730c && this.f23731d == lVar.f23731d && this.f23732e == lVar.f23732e && this.f23733f == lVar.f23733f && this.f23734g == lVar.f23734g && this.f23735h == lVar.f23735h && this.f23736i == lVar.f23736i && this.f23737j == lVar.f23737j;
        }

        /* renamed from: f */
        public final long mo60552f() {
            return this.f23732e;
        }

        /* renamed from: g */
        public final long mo60553g() {
            return this.f23733f;
        }

        /* renamed from: h */
        public final long mo60554h() {
            return this.f23730c;
        }

        public final int hashCode() {
            int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23728a) * 31;
            String str = this.f23729b;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23730c);
            int hashCode4 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23731d);
            int hashCode5 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23732e);
            int hashCode6 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23733f);
            int hashCode7 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23734g);
            int hashCode8 = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23735h);
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23737j) + ((C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23736i) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        /* renamed from: i */
        public final long mo60556i() {
            return this.f23731d;
        }

        /* renamed from: j */
        public final String mo60557j() {
            return this.f23729b;
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Session(sessionId=");
            a.append(this.f23728a);
            a.append(", sessionUuid=");
            a.append(this.f23729b);
            a.append(", sessionUptime=");
            a.append(this.f23730c);
            a.append(", sessionUptimeMonotonicMs=");
            a.append(this.f23731d);
            a.append(", sessionStart=");
            a.append(this.f23732e);
            a.append(", sessionStartMonotonicMs=");
            a.append(this.f23733f);
            a.append(", appUptime=");
            a.append(this.f23734g);
            a.append(", appUptimeMonotonicMs=");
            a.append(this.f23735h);
            a.append(", appSessionAverageLength=");
            a.append(this.f23736i);
            a.append(", appSessionAverageLengthMonotonicMs=");
            a.append(this.f23737j);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$m */
    public static final class C9357m implements C9336b {

        /* renamed from: a */
        public final JSONArray f23738a;

        public C9357m(JSONArray jSONArray) {
            Intrinsics.checkNotNullParameter(jSONArray, "previousSessions");
            this.f23738a = jSONArray;
        }

        /* renamed from: a */
        public final JSONArray mo60559a() {
            return this.f23738a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9357m) && Intrinsics.areEqual((Object) this.f23738a, (Object) ((C9357m) obj).f23738a);
        }

        public final int hashCode() {
            return this.f23738a.hashCode();
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("Sessions(previousSessions=");
            a.append(this.f23738a);
            a.append(')');
            return a.toString();
        }
    }

    /* renamed from: com.appodeal.ads.networking.binders.b$n */
    public static final class C9358n implements C9336b {

        /* renamed from: a */
        public final String f23739a;

        /* renamed from: b */
        public final String f23740b;

        /* renamed from: c */
        public final boolean f23741c;

        /* renamed from: d */
        public final JSONObject f23742d;

        /* renamed from: e */
        public final JSONObject f23743e;

        /* renamed from: f */
        public final String f23744f;

        /* renamed from: g */
        public final String f23745g;

        /* renamed from: h */
        public final long f23746h;

        public C9358n(String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2, String str3, String str4, long j) {
            Intrinsics.checkNotNullParameter(str2, "userLocale");
            Intrinsics.checkNotNullParameter(str4, "userTimezone");
            this.f23739a = str;
            this.f23740b = str2;
            this.f23741c = z;
            this.f23742d = jSONObject;
            this.f23743e = jSONObject2;
            this.f23744f = str3;
            this.f23745g = str4;
            this.f23746h = j;
        }

        /* renamed from: a */
        public final String mo60563a() {
            return this.f23744f;
        }

        /* renamed from: b */
        public final boolean mo60564b() {
            return this.f23741c;
        }

        /* renamed from: c */
        public final JSONObject mo60565c() {
            return this.f23742d;
        }

        /* renamed from: d */
        public final String mo60566d() {
            return this.f23739a;
        }

        /* renamed from: e */
        public final long mo60567e() {
            return this.f23746h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9358n)) {
                return false;
            }
            C9358n nVar = (C9358n) obj;
            return Intrinsics.areEqual((Object) this.f23739a, (Object) nVar.f23739a) && Intrinsics.areEqual((Object) this.f23740b, (Object) nVar.f23740b) && this.f23741c == nVar.f23741c && Intrinsics.areEqual((Object) this.f23742d, (Object) nVar.f23742d) && Intrinsics.areEqual((Object) this.f23743e, (Object) nVar.f23743e) && Intrinsics.areEqual((Object) this.f23744f, (Object) nVar.f23744f) && Intrinsics.areEqual((Object) this.f23745g, (Object) nVar.f23745g) && this.f23746h == nVar.f23746h;
        }

        /* renamed from: f */
        public final String mo60569f() {
            return this.f23740b;
        }

        /* renamed from: g */
        public final String mo60570g() {
            return this.f23745g;
        }

        /* renamed from: h */
        public final JSONObject mo60571h() {
            return this.f23743e;
        }

        public final int hashCode() {
            String str = this.f23739a;
            int i = 0;
            int a = C9327a.m27564a(this.f23740b, (str == null ? 0 : str.hashCode()) * 31, 31);
            boolean z = this.f23741c;
            if (z) {
                z = true;
            }
            int i2 = (a + (z ? 1 : 0)) * 31;
            JSONObject jSONObject = this.f23742d;
            int hashCode = (i2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
            JSONObject jSONObject2 = this.f23743e;
            int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
            String str2 = this.f23744f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f23746h) + C9327a.m27564a(this.f23745g, (hashCode2 + i) * 31, 31);
        }

        public final String toString() {
            StringBuilder a = C9203h0.m27334a("User(userId=");
            a.append(this.f23739a);
            a.append(", userLocale=");
            a.append(this.f23740b);
            a.append(", userConsent=");
            a.append(this.f23741c);
            a.append(", userIabConsentData=");
            a.append(this.f23742d);
            a.append(", userToken=");
            a.append(this.f23743e);
            a.append(", userAgent=");
            a.append(this.f23744f);
            a.append(", userTimezone=");
            a.append(this.f23745g);
            a.append(", userLocalTime=");
            a.append(this.f23746h);
            a.append(')');
            return a.toString();
        }
    }
}
