package com.appodeal.ads;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.k5 */
public final class C9256k5 implements C9235j5 {

    /* renamed from: a */
    public final Lazy f23264a;

    /* renamed from: com.appodeal.ads.k5$a */
    public static final class C9257a extends Lambda implements Function0<String> {

        /* renamed from: a */
        public final /* synthetic */ C9256k5 f23265a;

        /* renamed from: b */
        public final /* synthetic */ C9464s<?> f23266b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9257a(C9256k5 k5Var, C9464s<?> sVar) {
            super(0);
            this.f23265a = k5Var;
            this.f23266b = sVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_INTERSTITIAL) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.BANNER) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_banner";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
            if (r1.equals("native") == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_native";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_NON_REWARDED_VIDEO) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_video";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
            if (r1.equals("banner") == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_interstitial";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_MREC) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.MREC) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
            r0 = "http://herokuapp.appodeal.com/android_waterfall_mrec";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_NATIVE) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            if (r1.equals(com.appodeal.ads.modules.common.internal.Constants.DEBUG_BANNER) == false) goto L_0x0080;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            if (r1.equals("video") == false) goto L_0x0080;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke() {
            /*
                r2 = this;
                com.appodeal.ads.k5 r0 = r2.f23265a
                com.appodeal.ads.s<?> r1 = r2.f23266b
                java.lang.String r1 = r1.mo60713a()
                r0.getClass()
                if (r1 == 0) goto L_0x0080
                int r0 = r1.hashCode()
                switch(r0) {
                    case -1907025354: goto L_0x0074;
                    case -1840422033: goto L_0x006b;
                    case -1396342996: goto L_0x005f;
                    case -1210465393: goto L_0x0053;
                    case -1052618729: goto L_0x0047;
                    case -1031406050: goto L_0x003b;
                    case 95458899: goto L_0x0032;
                    case 112202875: goto L_0x0029;
                    case 624073610: goto L_0x0020;
                    case 894337923: goto L_0x0016;
                    default: goto L_0x0014;
                }
            L_0x0014:
                goto L_0x0080
            L_0x0016:
                java.lang.String r0 = "debug_native"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0050
                goto L_0x0080
            L_0x0020:
                java.lang.String r0 = "debug_banner_320"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0044
                goto L_0x0080
            L_0x0029:
                java.lang.String r0 = "video"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x005c
                goto L_0x0080
            L_0x0032:
                java.lang.String r0 = "debug"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0068
                goto L_0x0080
            L_0x003b:
                java.lang.String r0 = "banner_320"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0044
                goto L_0x0080
            L_0x0044:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_banner"
                goto L_0x0082
            L_0x0047:
                java.lang.String r0 = "native"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0050
                goto L_0x0080
            L_0x0050:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_native"
                goto L_0x0082
            L_0x0053:
                java.lang.String r0 = "debug_video"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x005c
                goto L_0x0080
            L_0x005c:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_video"
                goto L_0x0082
            L_0x005f:
                java.lang.String r0 = "banner"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x0068
                goto L_0x0080
            L_0x0068:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_interstitial"
                goto L_0x0082
            L_0x006b:
                java.lang.String r0 = "debug_mrec"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x007d
                goto L_0x0080
            L_0x0074:
                java.lang.String r0 = "banner_mrec"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L_0x007d
                goto L_0x0080
            L_0x007d:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_mrec"
                goto L_0x0082
            L_0x0080:
                java.lang.String r0 = "http://herokuapp.appodeal.com/android_waterfall_rewarded_video"
            L_0x0082:
                com.appodeal.ads.s<?> r1 = r2.f23266b
                boolean r1 = r1.f24027b
                if (r1 == 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r0 = 0
            L_0x008a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9256k5.C9257a.invoke():java.lang.Object");
        }
    }

    public C9256k5(C9464s<?> sVar) {
        Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
        this.f23264a = LazyKt.lazy(new C9257a(this, sVar));
    }

    /* renamed from: c */
    public final String mo60085c() {
        return (String) this.f23264a.getValue();
    }
}
