package com.appodeal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinEventParameters;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.libs.network.AppodealEndpoints;
import com.appodeal.ads.modules.libs.network.HttpClient;
import com.appodeal.ads.networking.binders.C9359c;
import com.appodeal.ads.networking.cache.C9366a;
import com.appodeal.ads.networking.cache.C9367b;
import com.appodeal.ads.networking.cache.C9368c;
import com.appodeal.ads.storage.C9562o;
import java.util.Arrays;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.s1 */
public abstract class C9466s1 {

    /* renamed from: a */
    public final HttpClient.Method f24034a;

    /* renamed from: b */
    public final HttpClient.ZipBase64 f24035b;

    /* renamed from: com.appodeal.ads.s1$a */
    public static abstract class C9467a extends C9466s1 {

        /* renamed from: c */
        public final C9420r<?> f24036c;

        /* renamed from: d */
        public final String f24037d;

        /* renamed from: e */
        public final double f24038e;

        /* renamed from: f */
        public final Integer f24039f;

        /* renamed from: g */
        public final Double f24040g;

        /* renamed from: com.appodeal.ads.s1$a$a */
        public static final class C9468a extends C9467a {

            /* renamed from: h */
            public final String f24041h = Constants.CLICK;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9468a(C9420r<?> rVar, String str, double d, Integer num, Double d2) {
                super(rVar, str, d, num, d2, 0);
                Intrinsics.checkNotNullParameter(rVar, "adRequest");
                Intrinsics.checkNotNullParameter(str, "adObjectId");
            }

            /* renamed from: g */
            public final String mo60720g() {
                return this.f24041h;
            }
        }

        /* renamed from: com.appodeal.ads.s1$a$b */
        public static final class C9469b extends C9467a {

            /* renamed from: h */
            public final String f24042h = Constants.FINISH;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9469b(C9420r<?> rVar, String str, double d, Integer num, Double d2) {
                super(rVar, str, d, num, d2, 0);
                Intrinsics.checkNotNullParameter(rVar, "adRequest");
                Intrinsics.checkNotNullParameter(str, "adObjectId");
            }

            /* renamed from: g */
            public final String mo60720g() {
                return this.f24042h;
            }
        }

        /* renamed from: com.appodeal.ads.s1$a$c */
        public static final class C9470c extends C9467a {

            /* renamed from: h */
            public final String f24043h = Constants.SHOW;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9470c(C9420r<?> rVar, String str, double d, Integer num, Double d2) {
                super(rVar, str, d, num, d2, 0);
                Intrinsics.checkNotNullParameter(rVar, "adRequest");
                Intrinsics.checkNotNullParameter(str, "adObjectId");
            }

            /* renamed from: g */
            public final String mo60720g() {
                return this.f24043h;
            }
        }

        @DebugMetadata(mo38568c = "com.appodeal.ads.JsonRequest$AdController", mo38569f = "JsonRequest.kt", mo38570l = {157}, mo38571m = "bodyBuilder$suspendImpl")
        /* renamed from: com.appodeal.ads.s1$a$d */
        public static final class C9471d extends ContinuationImpl {

            /* renamed from: a */
            public C9467a f24044a;

            /* renamed from: b */
            public /* synthetic */ Object f24045b;

            /* renamed from: c */
            public final /* synthetic */ C9467a f24046c;

            /* renamed from: d */
            public int f24047d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9471d(C9467a aVar, Continuation<? super C9471d> continuation) {
                super(continuation);
                this.f24046c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f24045b = obj;
                this.f24047d |= RecyclerView.UNDEFINED_DURATION;
                return C9467a.m28004a(this.f24046c, this);
            }
        }

        public C9467a(C9420r<?> rVar, String str, double d, Integer num, Double d2) {
            super(0);
            this.f24036c = rVar;
            this.f24037d = str;
            this.f24038e = d;
            this.f24039f = num;
            this.f24040g = d2;
        }

        public /* synthetic */ C9467a(C9420r rVar, String str, double d, Integer num, Double d2, int i) {
            this(rVar, str, d, num, d2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ java.lang.Object m28004a(com.appodeal.ads.C9466s1.C9467a r6, kotlin.coroutines.Continuation r7) {
            /*
                boolean r0 = r7 instanceof com.appodeal.ads.C9466s1.C9467a.C9471d
                if (r0 == 0) goto L_0x0013
                r0 = r7
                com.appodeal.ads.s1$a$d r0 = (com.appodeal.ads.C9466s1.C9467a.C9471d) r0
                int r1 = r0.f24047d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f24047d = r1
                goto L_0x0018
            L_0x0013:
                com.appodeal.ads.s1$a$d r0 = new com.appodeal.ads.s1$a$d
                r0.<init>(r6, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f24045b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f24047d
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                com.appodeal.ads.s1$a r6 = r0.f24044a
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0087
            L_0x002b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r7)
                com.appodeal.ads.b3 r7 = new com.appodeal.ads.b3
                r2 = 0
                r7.<init>((int) r2)
                com.appodeal.ads.r<?> r4 = r6.f24036c
                com.appodeal.ads.b3 r7 = r7.mo59863a((com.appodeal.ads.C9420r<?>) r4)
                java.lang.String r4 = r6.f24037d
                java.lang.String r5 = "id"
                com.appodeal.ads.b3 r7 = r7.mo59866a((java.lang.String) r5, (java.lang.Object) r4)
                kotlin.jvm.internal.SpreadBuilder r4 = new kotlin.jvm.internal.SpreadBuilder
                r5 = 4
                r4.<init>(r5)
                java.util.Set<com.appodeal.ads.networking.binders.c> r5 = com.appodeal.ads.networking.binders.C9359c.f23747a
                java.util.Set r5 = com.appodeal.ads.networking.binders.C9359c.C9360a.m27705a()
                com.appodeal.ads.networking.binders.c[] r2 = new com.appodeal.ads.networking.binders.C9359c[r2]
                java.lang.Object[] r2 = r5.toArray(r2)
                if (r2 == 0) goto L_0x00ae
                r4.addSpread(r2)
                com.appodeal.ads.networking.binders.c r2 = com.appodeal.ads.networking.binders.C9359c.AdRequest
                r4.add(r2)
                com.appodeal.ads.networking.binders.c r2 = com.appodeal.ads.networking.binders.C9359c.Sessions
                r4.add(r2)
                com.appodeal.ads.networking.binders.c r2 = com.appodeal.ads.networking.binders.C9359c.AdStat
                r4.add(r2)
                int r2 = r4.size()
                com.appodeal.ads.networking.binders.c[] r2 = new com.appodeal.ads.networking.binders.C9359c[r2]
                java.lang.Object[] r2 = r4.toArray(r2)
                com.appodeal.ads.networking.binders.c[] r2 = (com.appodeal.ads.networking.binders.C9359c[]) r2
                r0.f24044a = r6
                r0.f24047d = r3
                java.lang.Object r7 = r7.mo59867a((com.appodeal.ads.networking.binders.C9359c[]) r2, (kotlin.coroutines.Continuation<? super com.appodeal.ads.C9131b3>) r0)
                if (r7 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r0 = r7
                com.appodeal.ads.b3 r0 = (com.appodeal.ads.C9131b3) r0
                double r1 = r6.f24038e
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x009b
                java.lang.Double r1 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r1)
                java.lang.String r2 = "ecpm"
                r0.mo59866a((java.lang.String) r2, (java.lang.Object) r1)
            L_0x009b:
                java.lang.Integer r1 = r6.f24039f
                if (r1 == 0) goto L_0x00a4
                java.lang.String r2 = "placement_id"
                r0.mo59866a((java.lang.String) r2, (java.lang.Object) r1)
            L_0x00a4:
                java.lang.Double r6 = r6.f24040g
                if (r6 == 0) goto L_0x00ad
                java.lang.String r1 = "price_floor"
                r0.mo59866a((java.lang.String) r1, (java.lang.Object) r6)
            L_0x00ad:
                return r7
            L_0x00ae:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9466s1.C9467a.m28004a(com.appodeal.ads.s1$a, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            return m28004a(this, continuation);
        }
    }

    /* renamed from: com.appodeal.ads.s1$b */
    public static final class C9472b extends C9466s1 implements C9223i5, C9255k4, C9698x0 {

        /* renamed from: c */
        public final C9131b3 f24048c;

        /* renamed from: d */
        public final /* synthetic */ C9268l4 f24049d;

        /* renamed from: e */
        public final /* synthetic */ C9366a f24050e;

        /* renamed from: f */
        public final String f24051f;

        public /* synthetic */ C9472b() {
            this(new C9131b3(0), new C9268l4(), new C9366a(C9562o.f24251b));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9472b(C9131b3 b3Var, C9268l4 l4Var, C9366a aVar) {
            super(0);
            Intrinsics.checkNotNullParameter(b3Var, "requestBodyBuilder");
            Intrinsics.checkNotNullParameter(l4Var, "retryProvider");
            Intrinsics.checkNotNullParameter(aVar, "cacheProvider");
            this.f24048c = b3Var;
            this.f24049d = l4Var;
            this.f24050e = aVar;
            this.f24051f = Constants.CONFIG;
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            C9131b3 b3Var = this.f24048c;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            Set<C9359c> set = C9359c.f23747a;
            Object[] array = SetsKt.minus(C9359c.C9360a.m27705a(), C9359c.ServicesData).toArray(new C9359c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(C9359c.Services);
                return b3Var.mo59867a((C9359c[]) spreadBuilder.toArray(new C9359c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: a */
        public final JSONObject mo60574a() {
            return this.f24050e.mo60574a();
        }

        /* renamed from: a */
        public final void mo60575a(JSONObject jSONObject) {
            this.f24050e.mo60575a(jSONObject);
        }

        /* renamed from: b */
        public final boolean mo60094b() {
            return this.f24049d.mo60094b();
        }

        /* renamed from: g */
        public final String mo60720g() {
            return this.f24051f;
        }
    }

    /* renamed from: com.appodeal.ads.s1$c */
    public static final class C9473c extends C9466s1 implements C9235j5, C9698x0 {

        /* renamed from: c */
        public final C9420r<?> f24052c;

        /* renamed from: d */
        public final C9464s<?> f24053d;

        /* renamed from: e */
        public final C9577u<?, ?, ?> f24054e;

        /* renamed from: f */
        public final /* synthetic */ C9367b f24055f;

        /* renamed from: g */
        public final /* synthetic */ C9256k5 f24056g;

        /* renamed from: h */
        public final String f24057h = Constants.GET;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9473c(C9420r<?> rVar, C9464s<?> sVar, C9577u<?, ?, ?> uVar) {
            super(0);
            Intrinsics.checkNotNullParameter(rVar, "adRequest");
            Intrinsics.checkNotNullParameter(sVar, "adRequestParams");
            Intrinsics.checkNotNullParameter(uVar, "adTypeController");
            this.f24052c = rVar;
            this.f24053d = sVar;
            this.f24054e = uVar;
            String a = sVar.mo60713a();
            Intrinsics.checkNotNullExpressionValue(a, "adRequestParams.requestPath");
            this.f24055f = new C9367b(a, C9562o.f24251b);
            this.f24056g = new C9256k5(sVar);
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            C9131b3 a = new C9131b3(0).mo59863a(this.f24052c).mo59864a(this.f24053d).mo59865a(this.f24054e);
            SpreadBuilder spreadBuilder = new SpreadBuilder(6);
            Set<C9359c> set = C9359c.f23747a;
            Object[] array = C9359c.C9360a.m27705a().toArray(new C9359c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(C9359c.AdRequest);
                spreadBuilder.add(C9359c.Sessions);
                spreadBuilder.add(C9359c.Adapters);
                spreadBuilder.add(C9359c.AdStat);
                spreadBuilder.add(C9359c.f23754h);
                return a.mo59867a((C9359c[]) spreadBuilder.toArray(new C9359c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: a */
        public final JSONObject mo60574a() {
            return this.f24055f.mo60574a();
        }

        /* renamed from: a */
        public final void mo60575a(JSONObject jSONObject) {
            this.f24055f.mo60575a(jSONObject);
        }

        /* renamed from: c */
        public final String mo60085c() {
            return this.f24056g.mo60085c();
        }

        /* renamed from: g */
        public final String mo60720g() {
            return this.f24057h;
        }
    }

    /* renamed from: com.appodeal.ads.s1$d */
    public static final class C9474d extends C9466s1 {

        /* renamed from: c */
        public final double f24058c;

        /* renamed from: d */
        public final String f24059d;

        /* renamed from: e */
        public final String f24060e = "iap";

        public C9474d(double d, String str) {
            super(0);
            this.f24058c = d;
            this.f24059d = str;
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            C9131b3 a = new C9131b3(0).mo59866a(AppLovinEventParameters.REVENUE_AMOUNT, (Object) Boxing.boxDouble(this.f24058c)).mo59866a(AppLovinEventParameters.REVENUE_CURRENCY, (Object) this.f24059d);
            Set<C9359c> set = C9359c.f23747a;
            Object[] array = C9359c.C9360a.m27705a().toArray(new C9359c[0]);
            if (array != null) {
                C9359c[] cVarArr = (C9359c[]) array;
                return a.mo59867a((C9359c[]) Arrays.copyOf(cVarArr, cVarArr.length), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: g */
        public final String mo60720g() {
            return this.f24060e;
        }
    }

    /* renamed from: com.appodeal.ads.s1$e */
    public static final class C9475e extends C9466s1 implements C9698x0 {

        /* renamed from: c */
        public final C9131b3 f24061c;

        /* renamed from: d */
        public final /* synthetic */ C9368c f24062d;

        /* renamed from: e */
        public final String f24063e;

        public /* synthetic */ C9475e() {
            this(new C9131b3(0), new C9368c(C9562o.f24251b));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9475e(C9131b3 b3Var, C9368c cVar) {
            super(0);
            Intrinsics.checkNotNullParameter(b3Var, "requestBodyBuilder");
            Intrinsics.checkNotNullParameter(cVar, "cacheProvider");
            this.f24061c = b3Var;
            this.f24062d = cVar;
            this.f24063e = Constants.INIT;
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            C9131b3 b3Var = this.f24061c;
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            Set<C9359c> set = C9359c.f23747a;
            Object[] array = C9359c.C9360a.m27705a().toArray(new C9359c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(C9359c.Sessions);
                spreadBuilder.add(C9359c.Adapters);
                return b3Var.mo59867a((C9359c[]) spreadBuilder.toArray(new C9359c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: a */
        public final JSONObject mo60574a() {
            return this.f24062d.mo60574a();
        }

        /* renamed from: a */
        public final void mo60575a(JSONObject jSONObject) {
            this.f24062d.mo60575a(jSONObject);
        }

        /* renamed from: g */
        public final String mo60720g() {
            return this.f24063e;
        }
    }

    /* renamed from: com.appodeal.ads.s1$f */
    public static final class C9476f extends C9466s1 {

        /* renamed from: c */
        public final String f24064c;

        /* renamed from: d */
        public final long f24065d;

        /* renamed from: e */
        public final String f24066e;

        public /* synthetic */ C9476f(String str) {
            this(str, Appodeal.getSegmentId());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9476f(String str, long j) {
            super(0);
            Intrinsics.checkNotNullParameter(str, "packageName");
            this.f24064c = str;
            this.f24065d = j;
            this.f24066e = Constants.INSTALL;
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            C9131b3 a = new C9131b3(0).mo59866a("id", (Object) this.f24064c).mo59866a("segment_id", (Object) Boxing.boxLong(this.f24065d));
            Set<C9359c> set = C9359c.f23747a;
            Object[] array = C9359c.C9360a.m27705a().toArray(new C9359c[0]);
            if (array != null) {
                C9359c[] cVarArr = (C9359c[]) array;
                return a.mo59867a((C9359c[]) Arrays.copyOf(cVarArr, cVarArr.length), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: g */
        public final String mo60720g() {
            return this.f24066e;
        }
    }

    /* renamed from: com.appodeal.ads.s1$g */
    public static final class C9477g extends C9466s1 {

        /* renamed from: c */
        public final String f24067c = Constants.SESSIONS;

        public C9477g() {
            super(0);
        }

        /* renamed from: a */
        public final Object mo60717a(Continuation<? super C9131b3> continuation) {
            C9131b3 b3Var = new C9131b3(0);
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            Set<C9359c> set = C9359c.f23747a;
            Object[] array = C9359c.C9360a.m27705a().toArray(new C9359c[0]);
            if (array != null) {
                spreadBuilder.addSpread(array);
                spreadBuilder.add(C9359c.Sessions);
                return b3Var.mo59867a((C9359c[]) spreadBuilder.toArray(new C9359c[spreadBuilder.size()]), continuation);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: g */
        public final String mo60720g() {
            return this.f24067c;
        }
    }

    public C9466s1() {
        this.f24034a = HttpClient.Method.POST;
        this.f24035b = HttpClient.ZipBase64.INSTANCE;
    }

    public /* synthetic */ C9466s1(int i) {
        this();
    }

    /* renamed from: d */
    public static String m27999d() {
        return AppodealEndpoints.INSTANCE.getActiveEndpoint();
    }

    /* renamed from: a */
    public abstract Object mo60717a(Continuation<? super C9131b3> continuation);

    /* renamed from: e */
    public final HttpClient.ZipBase64 mo60718e() {
        return this.f24035b;
    }

    /* renamed from: f */
    public final HttpClient.Method mo60719f() {
        return this.f24034a;
    }

    /* renamed from: g */
    public abstract String mo60720g();
}
