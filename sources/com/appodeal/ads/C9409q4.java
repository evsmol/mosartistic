package com.appodeal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.FrameLayout;
import com.appodeal.ads.C9205h2;
import com.appodeal.ads.C9378o1;
import com.appodeal.ads.C9384o4;
import com.appodeal.ads.C9566t0;
import com.appodeal.ads.C9685w2;
import com.appodeal.ads.Native;
import com.appodeal.ads.UserSettings;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.context.C9158g;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.regulator.UserConsent;
import com.appodeal.ads.revenue.AdRevenueCallbacks;
import com.appodeal.ads.revenue.RevenueInfo;
import com.appodeal.ads.rewarded.Reward;
import com.appodeal.ads.segments.C9490g;
import com.appodeal.ads.segments.C9492h;
import com.appodeal.ads.segments.C9495j;
import com.appodeal.ads.segments.C9503n;
import com.appodeal.ads.services.C9515c;
import com.appodeal.ads.services.C9525g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.utils.C9662x;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.C9623a;
import com.appodeal.consent.Consent;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: com.appodeal.ads.q4 */
public final class C9409q4 {

    /* renamed from: a */
    public static final C9409q4 f23839a = new C9409q4();

    /* renamed from: b */
    public static boolean f23840b;

    /* renamed from: c */
    public static boolean f23841c;

    /* renamed from: d */
    public static TestActivity f23842d;

    /* renamed from: e */
    public static final Lazy f23843e = LazyKt.lazy(C9414e.f23868a);

    /* renamed from: f */
    public static AdRevenueCallbacks f23844f;

    /* renamed from: g */
    public static String f23845g = "android";

    /* renamed from: h */
    public static String f23846h;

    /* renamed from: i */
    public static String f23847i;

    /* renamed from: j */
    public static final Lazy f23848j = LazyKt.lazy(C9416g.f23870a);

    /* renamed from: k */
    public static final Lazy f23849k = LazyKt.lazy(C9410a.f23855a);

    /* renamed from: l */
    public static final LinkedHashSet f23850l = new LinkedHashSet();

    /* renamed from: m */
    public static final Lazy f23851m = LazyKt.lazy(C9415f.f23869a);

    /* renamed from: n */
    public static final Lazy f23852n = LazyKt.lazy(C9413d.f23867a);

    /* renamed from: o */
    public static final MutableStateFlow<Boolean> f23853o = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* renamed from: p */
    public static final ArrayList f23854p = new ArrayList();

    /* renamed from: com.appodeal.ads.q4$a */
    public static final class C9410a extends Lambda implements Function0<List<? extends C9577u<? extends C9258l<? extends C9420r<? extends C9258l<?, ?, ?, ?>>, ? extends UnifiedAd<? extends UnifiedAdParams, ? extends UnifiedAdCallback, ? extends Object>, ? extends UnifiedAdParams, ? extends UnifiedAdCallback>, ? extends C9420r<? extends C9258l<? extends C9420r<?>, ? extends UnifiedAd<?, ?, ?>, ? extends UnifiedAdParams, ? extends UnifiedAdCallback>>, ? extends C9464s<?>>>> {

        /* renamed from: a */
        public static final C9410a f23855a = new C9410a();

        public C9410a() {
            super(0);
        }

        public final Object invoke() {
            return CollectionsKt.listOf(C9566t0.m28247a(), Native.m27078a(), C9378o1.m27718a(), C9685w2.m28463a(), C9384o4.m27742a(), C9205h2.m27336a());
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCore$logEvent$1", mo38569f = "SdkCore.kt", mo38570l = {810}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.q4$b */
    public static final class C9411b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23856a;

        /* renamed from: b */
        public final /* synthetic */ String f23857b;

        /* renamed from: c */
        public final /* synthetic */ Map<String, Object> f23858c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9411b(String str, Map<String, ? extends Object> map, Continuation<? super C9411b> continuation) {
            super(2, continuation);
            this.f23857b = str;
            this.f23858c = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9411b(this.f23857b, this.f23858c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9411b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23856a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9515c c = C9409q4.m27855c(C9409q4.f23839a);
                String str = this.f23857b;
                Map<String, Object> map = this.f23858c;
                this.f23856a = 1;
                if (c.mo60762a(str, map, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCore$onImpression$1", mo38569f = "SdkCore.kt", mo38570l = {851}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.q4$c */
    public static final class C9412c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public RevenueInfo f23859a;

        /* renamed from: b */
        public int f23860b;

        /* renamed from: c */
        public final /* synthetic */ String f23861c;

        /* renamed from: d */
        public final /* synthetic */ String f23862d;

        /* renamed from: e */
        public final /* synthetic */ String f23863e;

        /* renamed from: f */
        public final /* synthetic */ C9490g f23864f;

        /* renamed from: g */
        public final /* synthetic */ double f23865g;

        /* renamed from: h */
        public final /* synthetic */ AdType f23866h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9412c(String str, String str2, String str3, C9490g gVar, double d, AdType adType, Continuation<? super C9412c> continuation) {
            super(2, continuation);
            this.f23861c = str;
            this.f23862d = str2;
            this.f23863e = str3;
            this.f23864f = gVar;
            this.f23865g = d;
            this.f23866h = adType;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9412c(this.f23861c, this.f23862d, this.f23863e, this.f23864f, this.f23865g, this.f23866h, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9412c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            RevenueInfo revenueInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23860b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f23861c;
                String str2 = str == null ? "" : str;
                String str3 = this.f23862d;
                String str4 = str3 == null ? "" : str3;
                String str5 = this.f23863e;
                String str6 = str5 == null ? "" : str5;
                C9490g gVar = this.f23864f;
                String b = gVar == null ? null : gVar.mo60740b();
                RevenueInfo revenueInfo2 = new RevenueInfo(str2, str4, str6, b == null ? "" : b, this.f23865g / ((double) 1000), this.f23866h.getCode(), this.f23866h.getCodeName());
                C9515c c = C9409q4.m27855c(C9409q4.f23839a);
                this.f23859a = revenueInfo2;
                this.f23860b = 1;
                if (c.mo60761a(revenueInfo2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                revenueInfo = revenueInfo2;
            } else if (i == 1) {
                revenueInfo = this.f23859a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AdRevenueCallbacks e = C9409q4.m27863e();
            if (e != null) {
                e.onAdRevenueReceive(revenueInfo);
            }
            C9409q4.m27875k().mo60328b(this.f23866h, this.f23865g, this.f23861c, this.f23863e);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.appodeal.ads.q4$d */
    public static final class C9413d extends Lambda implements Function0<ParsePriceUseCase> {

        /* renamed from: a */
        public static final C9413d f23867a = new C9413d();

        public C9413d() {
            super(0);
        }

        public final Object invoke() {
            return new ParsePriceUseCase();
        }
    }

    /* renamed from: com.appodeal.ads.q4$e */
    public static final class C9414e extends Lambda implements Function0<C9315n0> {

        /* renamed from: a */
        public static final C9414e f23868a = new C9414e();

        public C9414e() {
            super(0);
        }

        public final Object invoke() {
            return new C9315n0(0);
        }
    }

    /* renamed from: com.appodeal.ads.q4$f */
    public static final class C9415f extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a */
        public static final C9415f f23869a = new C9415f();

        public C9415f() {
            super(0);
        }

        public final Object invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        }
    }

    /* renamed from: com.appodeal.ads.q4$g */
    public static final class C9416g extends Lambda implements Function0<C9662x> {

        /* renamed from: a */
        public static final C9416g f23870a = new C9416g();

        public C9416g() {
            super(0);
        }

        public final Object invoke() {
            HashMap hashMap = C9662x.f24470l;
            return C9662x.C9663a.m28439a();
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.SdkCore$validateInAppPurchase$1", mo38569f = "SdkCore.kt", mo38570l = {822}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.q4$h */
    public static final class C9417h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f23871a;

        /* renamed from: b */
        public final /* synthetic */ InAppPurchase f23872b;

        /* renamed from: c */
        public final /* synthetic */ InAppPurchaseValidateCallback f23873c;

        /* renamed from: d */
        public final /* synthetic */ Context f23874d;

        /* renamed from: com.appodeal.ads.q4$h$a */
        public static final class C9418a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            public final /* synthetic */ Context f23875a;

            /* renamed from: b */
            public final /* synthetic */ InAppPurchase f23876b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9418a(Context context, InAppPurchase inAppPurchase) {
                super(0);
                this.f23875a = context;
                this.f23876b = inAppPurchase;
            }

            public final Object invoke() {
                Context applicationContext = this.f23875a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                Double invoke = C9409q4.m27846b(C9409q4.f23839a).invoke(this.f23876b.getPrice(), this.f23876b.getCurrency());
                C9409q4.m27819a(applicationContext, invoke == null ? 0.0d : invoke.doubleValue(), this.f23876b.getCurrency());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9417h(InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, Context context, Continuation<? super C9417h> continuation) {
            super(2, continuation);
            this.f23872b = inAppPurchase;
            this.f23873c = inAppPurchaseValidateCallback;
            this.f23874d = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9417h(this.f23872b, this.f23873c, this.f23874d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9417h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23871a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9515c c = C9409q4.m27855c(C9409q4.f23839a);
                InAppPurchase inAppPurchase = this.f23872b;
                InAppPurchaseValidateCallback inAppPurchaseValidateCallback = this.f23873c;
                C9418a aVar = new C9418a(this.f23874d, inAppPurchase);
                this.f23871a = 1;
                if (c.mo60760a(inAppPurchase, inAppPurchaseValidateCallback, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final BannerView m27809a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, "BannerView", Log.LogLevel.verbose);
        BannerView bannerView = new BannerView(context, (AttributeSet) null);
        C9566t0.m28252c().mo61225a(-1);
        C9566t0.m28252c().mo61227a((FrameLayout) bannerView);
        return bannerView;
    }

    /* renamed from: a */
    public static final C9148b m27810a(C9409q4 q4Var) {
        q4Var.getClass();
        return C9148b.f22956b;
    }

    /* renamed from: a */
    public static final ArrayList m27811a(int i) {
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, Intrinsics.stringPlus("NativeAds: ", Integer.valueOf(i)), Log.LogLevel.verbose);
        ArrayList a = Native.m27080c().mo60332a(i);
        Intrinsics.checkNotNullExpressionValue(a, "getNativeAdBox().getNativeAds(count)");
        return a;
    }

    /* renamed from: a */
    public static final List<String> m27813a(Context context, int i) {
        List<T> list;
        Intrinsics.checkNotNullParameter(context, "context");
        f23839a.getClass();
        List<C9577u> d = m27859d();
        ArrayList arrayList = new ArrayList();
        for (C9577u uVar : d) {
            if ((C9482s4.m28038a(uVar) & i) > 0) {
                Set<String> a = uVar.mo60847g().mo59981b(context).mo59975a();
                Intrinsics.checkNotNullExpressionValue(a, "adController.networkRegi…  .availableNetworksNames");
                list = CollectionsKt.filterNotNull(a);
            } else {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        return CollectionsKt.sorted(CollectionsKt.distinct(arrayList));
    }

    /* renamed from: a */
    public static final void m27819a(Context context, double d, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!f23841c && !f23840b) {
            C9194g1.f23093w.mo59987b("Appodeal is not initialized");
        } else if (str == null) {
            C9194g1.f23093w.mo59987b("currency is null");
        } else if (C9234j4.f23194a.isUserProtected()) {
            C9194g1.f23093w.mo59987b("The user did not accept the agreement");
        } else {
            C9218i1 i1Var = C9194g1.f23093w;
            i1Var.mo59986a("inapp purchase, amount: " + d + ", currency: " + str);
            C9237k0.m27396a(context, d, str);
        }
    }

    /* renamed from: a */
    public static final void m27824a(Native.MediaAssetType mediaAssetType) {
        Intrinsics.checkNotNullParameter(mediaAssetType, "requiredMediaAssetType");
        C9194g1.f23092v.mo59986a(Intrinsics.stringPlus("required native media assets type: ", mediaAssetType));
        Native.f22733c = mediaAssetType;
    }

    /* renamed from: a */
    public static final void m27825a(Native.NativeAdType nativeAdType) {
        if (nativeAdType == null) {
            C9194g1.f23080j.mo59987b("adType is null");
            return;
        }
        C9194g1.f23080j.mo59986a(Intrinsics.stringPlus("NativeAd type: ", nativeAdType));
        Native.f22732b = nativeAdType;
    }

    /* renamed from: a */
    public static final void m27828a(UserSettings.Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        C9194g1.f23096z.mo59985a();
        C9269l5.m27453a().setGender(gender);
    }

    /* renamed from: a */
    public static final void m27831a(UserConsent userConsent) {
        Intrinsics.checkNotNullParameter(userConsent, "userConsent");
        C9218i1 i1Var = C9194g1.f23072b;
        i1Var.mo59986a(userConsent.getZone().name() + " consent is " + userConsent.getStatus());
        C9700x2.f24534a.getClass();
        C9700x2.m28500a(userConsent);
    }

    /* renamed from: a */
    public static final void m27832a(Log.LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        C9422r0.f23915d = logLevel;
        C9194g1.f23058C.mo59986a(Intrinsics.stringPlus("log level: ", logLevel));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r3.getStatus();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m27833a(com.appodeal.consent.Consent r3) {
        /*
            com.appodeal.ads.i1 r0 = com.appodeal.ads.C9194g1.f23072b
            if (r3 != 0) goto L_0x0005
            goto L_0x000b
        L_0x0005:
            com.appodeal.consent.Consent$Status r1 = r3.getStatus()
            if (r1 != 0) goto L_0x000d
        L_0x000b:
            r1 = 0
            goto L_0x0011
        L_0x000d:
            java.lang.String r1 = r1.name()
        L_0x0011:
            java.lang.String r2 = "consent is "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r1)
            r0.mo59986a(r1)
            com.appodeal.ads.x2 r0 = com.appodeal.ads.C9700x2.f24534a
            r0.getClass()
            com.appodeal.ads.C9700x2.m28501a((com.appodeal.consent.Consent) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9409q4.m27833a(com.appodeal.consent.Consent):void");
    }

    /* renamed from: a */
    public static final void m27834a(Boolean bool) {
        C9194g1.f23072b.mo59986a(Intrinsics.stringPlus("consent is ", bool == null ? null : bool.toString()));
        C9700x2.m28502a(bool);
    }

    /* renamed from: a */
    public static final void m27837a(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (StringsKt.isBlank(str)) {
            C9194g1.f23059D.mo59987b("name is blank");
            return;
        }
        C9218i1 i1Var = C9194g1.f23059D;
        i1Var.mo59986a("set custom filter: " + str + ", value: " + obj);
        C9495j.m28101a(str, obj);
    }

    /* renamed from: a */
    public static final void m27838a(String str, String str2, String str3) {
        String str4;
        f23845g = str;
        f23846h = str2;
        f23847i = str3;
        if (str3 != null) {
            str4 = "framework: " + str + ", pluginVersion: " + str2 + ", engineVersion: " + str3;
        } else {
            str4 = "framework: " + str + ", pluginVersion: " + str2;
        }
        C9194g1.f23061F.mo59986a(str4);
    }

    /* renamed from: a */
    public static final void m27840a(boolean z) {
        C9194g1.f23062G.mo59986a(Intrinsics.stringPlus("muteVideosIfCallsMuted: ", Boolean.valueOf(z)));
        C9422r0.f23916e = z;
    }

    /* renamed from: a */
    public static final boolean m27842a(Activity activity, int i, String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        f23839a.getClass();
        boolean b = m27853b(activity, i, str);
        C9218i1 i1Var = C9194g1.f23082l;
        i1Var.mo59986a(C9326n5.m27528a(i) + ", result: " + b);
        return b;
    }

    /* renamed from: b */
    public static final MrecView m27845b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.log(LogConstants.KEY_SDK_PUBLIC, LogConstants.EVENT_GET, "MrecView", Log.LogLevel.verbose);
        MrecView mrecView = new MrecView(context, (AttributeSet) null);
        C9205h2.m27340c().mo61225a(-1);
        C9205h2.m27340c().mo61227a((FrameLayout) mrecView);
        return mrecView;
    }

    /* renamed from: b */
    public static final ParsePriceUseCase m27846b(C9409q4 q4Var) {
        q4Var.getClass();
        return (ParsePriceUseCase) f23852n.getValue();
    }

    /* renamed from: b */
    public static final Reward m27847b(String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        C9490g a = C9492h.m28084a(str);
        return new Reward(a.mo60741c(), a.mo60742d());
    }

    /* renamed from: b */
    public static final void m27851b(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        if (StringsKt.isBlank(str)) {
            C9194g1.f23067L.mo59987b("key is blank");
            return;
        }
        C9194g1.f23067L.mo59985a();
        ExtraData.INSTANCE.putExtra(str, obj);
    }

    /* renamed from: b */
    public static final void m27852b(boolean z) {
        C9194g1.f23088r.mo59986a(Intrinsics.stringPlus("728x90 Banners: ", Boolean.valueOf(z)));
        C9566t0.f24259c = z;
    }

    /* renamed from: c */
    public static final Pair<Double, String> m27854c(String str) {
        Intrinsics.checkNotNullParameter(str, "placementName");
        C9490g a = C9492h.m28084a(str);
        return new Pair<>(Double.valueOf(a.mo60741c()), a.mo60742d());
    }

    /* renamed from: c */
    public static final C9515c m27855c(C9409q4 q4Var) {
        q4Var.getClass();
        return C9525g.m28153b();
    }

    /* renamed from: c */
    public static final void m27857c(boolean z) {
        C9194g1.f23089s.mo59986a(Intrinsics.stringPlus("Banner animation: ", Boolean.valueOf(z)));
        C9566t0.m28252c().mo61228a(z);
    }

    /* renamed from: d */
    public static List m27859d() {
        return (List) f23849k.getValue();
    }

    /* renamed from: d */
    public static final void m27860d(String str) {
        Intrinsics.checkNotNullParameter(str, DataKeys.USER_ID);
        C9194g1.f23095y.mo59985a();
        C9269l5.m27453a().setUserId(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        if (r2 != 2048) goto L_0x0052;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m27862d(int r2) {
        /*
            r0 = 1
            if (r2 == r0) goto L_0x0059
            r1 = 2
            if (r2 == r1) goto L_0x0054
            r1 = 3
            if (r2 == r1) goto L_0x0041
            r0 = 4
            if (r2 == r0) goto L_0x003c
            r0 = 8
            if (r2 == r0) goto L_0x003c
            r0 = 16
            if (r2 == r0) goto L_0x003c
            r0 = 64
            if (r2 == r0) goto L_0x003c
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x0037
            r0 = 256(0x100, float:3.59E-43)
            if (r2 == r0) goto L_0x0032
            r0 = 512(0x200, float:7.175E-43)
            if (r2 == r0) goto L_0x002d
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 == r0) goto L_0x003c
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 == r0) goto L_0x003c
            goto L_0x0052
        L_0x002d:
            com.appodeal.ads.Native$a r2 = com.appodeal.ads.Native.m27078a()
            goto L_0x005d
        L_0x0032:
            com.appodeal.ads.h2$b r2 = com.appodeal.ads.C9205h2.m27336a()
            goto L_0x005d
        L_0x0037:
            com.appodeal.ads.o4$b r2 = com.appodeal.ads.C9384o4.m27742a()
            goto L_0x005d
        L_0x003c:
            com.appodeal.ads.t0$b r2 = com.appodeal.ads.C9566t0.m28247a()
            goto L_0x005d
        L_0x0041:
            com.appodeal.ads.o1$a r2 = com.appodeal.ads.C9378o1.m27718a()
            boolean r2 = r2.f24291i
            if (r2 == 0) goto L_0x0052
            com.appodeal.ads.w2$b r2 = com.appodeal.ads.C9685w2.m28463a()
            boolean r2 = r2.f24291i
            if (r2 == 0) goto L_0x0052
            goto L_0x005f
        L_0x0052:
            r0 = 0
            goto L_0x005f
        L_0x0054:
            com.appodeal.ads.w2$b r2 = com.appodeal.ads.C9685w2.m28463a()
            goto L_0x005d
        L_0x0059:
            com.appodeal.ads.o1$a r2 = com.appodeal.ads.C9378o1.m27718a()
        L_0x005d:
            boolean r0 = r2.f24291i
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9409q4.m27862d(int):boolean");
    }

    /* renamed from: e */
    public static final AdRevenueCallbacks m27863e() {
        return f23844f;
    }

    /* renamed from: e */
    public static final void m27864e(boolean z) {
        C9194g1.f23087q.mo59986a(Intrinsics.stringPlus("smart Banners: ", Boolean.valueOf(z)));
        C9566t0.f24258b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        if (r0 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[Catch:{ Exception -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[Catch:{ Exception -> 0x005b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b7 A[Catch:{ Exception -> 0x005b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e4 A[Catch:{ Exception -> 0x005b }, RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m27865e(int r5) {
        /*
            boolean r0 = m27879o()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r5 & 3
            java.lang.String r2 = "getAdController()"
            r3 = 1
            if (r0 <= 0) goto L_0x005e
            com.appodeal.ads.q4 r0 = f23839a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.o1$a r4 = com.appodeal.ads.C9378o1.m27718a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.mo60846f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0034
            boolean r4 = r0.f23879C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x002f
            boolean r4 = r0.f23906u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x002d
            boolean r0 = r0.f23907v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x002f
        L_0x002d:
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x005a
            com.appodeal.ads.w2$b r0 = com.appodeal.ads.C9685w2.m28463a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r0.mo60846f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0057
            boolean r4 = r0.f23879C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0052
            boolean r4 = r0.f23906u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0050
            boolean r0 = r0.f23907v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0052
        L_0x0050:
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0057
            r0 = 1
            goto L_0x0058
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x005e
        L_0x005a:
            return r3
        L_0x005b:
            r5 = move-exception
            goto L_0x00f4
        L_0x005e:
            r0 = r5 & 128(0x80, float:1.794E-43)
            if (r0 <= 0) goto L_0x008b
            com.appodeal.ads.q4 r0 = f23839a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.o4$b r4 = com.appodeal.ads.C9384o4.m27742a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.mo60846f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0087
            boolean r4 = r0.f23879C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0082
            boolean r4 = r0.f23906u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x0080
            boolean r0 = r0.f23907v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x008b
            return r3
        L_0x008b:
            r0 = r5 & 3164(0xc5c, float:4.434E-42)
            if (r0 <= 0) goto L_0x00b8
            com.appodeal.ads.q4 r0 = f23839a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.t0$b r4 = com.appodeal.ads.C9566t0.m28247a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.mo60846f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00b4
            boolean r4 = r0.f23879C     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x00af
            boolean r4 = r0.f23906u     // Catch:{ Exception -> 0x005b }
            if (r4 != 0) goto L_0x00ad
            boolean r0 = r0.f23907v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00af
        L_0x00ad:
            r0 = 1
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 == 0) goto L_0x00b4
            r0 = 1
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x00b8
            return r3
        L_0x00b8:
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 <= 0) goto L_0x00e5
            com.appodeal.ads.q4 r0 = f23839a     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.h2$b r4 = com.appodeal.ads.C9205h2.m27336a()     // Catch:{ Exception -> 0x005b }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)     // Catch:{ Exception -> 0x005b }
            r0.getClass()     // Catch:{ Exception -> 0x005b }
            com.appodeal.ads.r r0 = r4.mo60846f()     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00e1
            boolean r2 = r0.f23879C     // Catch:{ Exception -> 0x005b }
            if (r2 != 0) goto L_0x00dc
            boolean r2 = r0.f23906u     // Catch:{ Exception -> 0x005b }
            if (r2 != 0) goto L_0x00da
            boolean r0 = r0.f23907v     // Catch:{ Exception -> 0x005b }
            if (r0 == 0) goto L_0x00dc
        L_0x00da:
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            if (r0 == 0) goto L_0x00e1
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            if (r0 == 0) goto L_0x00e5
            return r3
        L_0x00e5:
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 <= 0) goto L_0x00f7
            com.appodeal.ads.n2 r5 = com.appodeal.ads.Native.m27080c()     // Catch:{ Exception -> 0x005b }
            boolean r5 = r5.mo60338b()     // Catch:{ Exception -> 0x005b }
            if (r5 == 0) goto L_0x00f7
            return r3
        L_0x00f4:
            com.appodeal.ads.utils.Log.log(r5)
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9409q4.m27865e(int):boolean");
    }

    /* renamed from: f */
    public static final Date m27866f() {
        return Constants.BUILD_DATE;
    }

    /* renamed from: f */
    public static final void m27867f(boolean z) {
        C9194g1.f23057B.mo59986a(Intrinsics.stringPlus("testing: ", Boolean.valueOf(z)));
        C9422r0.f23913b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        if (r7 != 2048) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0093, code lost:
        if (r3 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041 A[Catch:{ Exception -> 0x00a6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a A[Catch:{ Exception -> 0x00a6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00aa A[RETURN] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m27868f(int r7) {
        /*
            boolean r0 = m27879o()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 3
            r2 = 1
            if (r7 == r0) goto L_0x005b
            r0 = 4
            if (r7 == r0) goto L_0x0042
            r0 = 8
            if (r7 == r0) goto L_0x0042
            r0 = 16
            if (r7 == r0) goto L_0x0042
            r0 = 64
            if (r7 == r0) goto L_0x0042
            r0 = 256(0x100, float:3.59E-43)
            if (r7 == r0) goto L_0x0029
            r0 = 1024(0x400, float:1.435E-42)
            if (r7 == r0) goto L_0x0042
            r0 = 2048(0x800, float:2.87E-42)
            if (r7 == r0) goto L_0x0042
            goto L_0x00aa
        L_0x0029:
            com.appodeal.ads.h2$b r7 = com.appodeal.ads.C9205h2.m27336a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r7 = r7.mo60846f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.k2 r7 = (com.appodeal.ads.C9253k2) r7     // Catch:{ Exception -> 0x00a6 }
            if (r7 != 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            boolean r7 = r7.mo60631v()     // Catch:{ Exception -> 0x00a6 }
            if (r7 != r2) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x00aa
            return r2
        L_0x0042:
            com.appodeal.ads.t0$b r7 = com.appodeal.ads.C9566t0.m28247a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r7 = r7.mo60846f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.w0 r7 = (com.appodeal.ads.C9683w0) r7     // Catch:{ Exception -> 0x00a6 }
            if (r7 != 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            boolean r7 = r7.mo60631v()     // Catch:{ Exception -> 0x00a6 }
            if (r7 != r2) goto L_0x0057
            r7 = 1
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 == 0) goto L_0x00aa
            return r2
        L_0x005b:
            com.appodeal.ads.o1$a r7 = com.appodeal.ads.C9378o1.m27718a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r7 = r7.mo60846f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r1 r7 = (com.appodeal.ads.C9425r1) r7     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.w2$b r0 = com.appodeal.ads.C9685w2.m28463a()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.r r0 = r0.mo60846f()     // Catch:{ Exception -> 0x00a6 }
            com.appodeal.ads.q5 r0 = (com.appodeal.ads.C9419q5) r0     // Catch:{ Exception -> 0x00a6 }
            if (r7 == 0) goto L_0x0085
            if (r0 == 0) goto L_0x0085
            double r2 = r7.f23905t     // Catch:{ Exception -> 0x00a6 }
            double r4 = r0.f23905t     // Catch:{ Exception -> 0x00a6 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0080
            boolean r7 = r7.mo60631v()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0084
        L_0x0080:
            boolean r7 = r0.mo60631v()     // Catch:{ Exception -> 0x00a6 }
        L_0x0084:
            return r7
        L_0x0085:
            if (r0 != 0) goto L_0x0095
            if (r7 != 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            boolean r3 = r7.mo60631v()     // Catch:{ Exception -> 0x00a6 }
            if (r3 != r2) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 != 0) goto L_0x00a5
        L_0x0095:
            if (r7 != 0) goto L_0x00aa
            if (r0 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            boolean r7 = r0.mo60631v()     // Catch:{ Exception -> 0x00a6 }
            if (r7 != r2) goto L_0x00a2
            r7 = 1
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            if (r7 == 0) goto L_0x00aa
        L_0x00a5:
            return r2
        L_0x00a6:
            r7 = move-exception
            com.appodeal.ads.utils.Log.log(r7)
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9409q4.m27868f(int):boolean");
    }

    /* renamed from: g */
    public static final String m27869g() {
        return f23847i;
    }

    /* renamed from: g */
    public static final void m27870g(int i) {
        C9194g1.f23086p.mo59986a(Intrinsics.stringPlus("Banner ViewId: ", Integer.valueOf(i)));
        C9566t0.m28252c().mo61225a(i);
        C9566t0.m28252c().mo61227a((FrameLayout) null);
    }

    /* renamed from: h */
    public static final String m27871h() {
        return f23845g;
    }

    /* renamed from: h */
    public static final void m27872h(int i) {
        C9194g1.f23091u.mo59986a(Intrinsics.stringPlus("Mrec ViewId: ", Integer.valueOf(i)));
        C9205h2.m27340c().mo61225a(i);
        C9205h2.m27340c().mo61227a((FrameLayout) null);
    }

    /* renamed from: i */
    public static final Log.LogLevel m27873i() {
        return C9422r0.f23915d;
    }

    /* renamed from: j */
    public static final String m27874j() {
        return f23846h;
    }

    /* renamed from: k */
    public static final C9315n0 m27875k() {
        return (C9315n0) f23843e.getValue();
    }

    /* renamed from: l */
    public static final long m27876l() {
        return C9503n.m28137c().f24113a;
    }

    /* renamed from: m */
    public static final C9662x m27877m() {
        return (C9662x) f23848j.getValue();
    }

    /* renamed from: n */
    public static final String m27878n() {
        return Constants.SDK_VERSION;
    }

    /* renamed from: o */
    public static final boolean m27879o() {
        return C9182f1.m27286j() < 21;
    }

    /* renamed from: p */
    public static boolean m27880p() {
        return !(!C9137c.f22948b.f22949a.f22982e.get());
    }

    /* renamed from: a */
    public static final void m27830a(C9409q4 q4Var, Context context, int i, List list) {
        q4Var.getClass();
        if (C9139c1.m27232b()) {
            m27814a(4095, false);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C9577u) it.next()).mo60831a(context);
            }
            Activity activity = C9148b.f22956b.getActivity();
            if (activity != null) {
                m27815a(activity);
                return;
            }
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C9577u uVar = (C9577u) it2.next();
            if ((C9482s4.m28038a(uVar) & i) > 0) {
                uVar.mo60831a(context);
            }
        }
        if (f23841c) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((C9577u) it3.next()).mo60855q();
            }
        }
    }

    /* renamed from: b */
    public static final double m27844b(int i) {
        boolean z = false;
        if (i == 1) {
            C9409q4 q4Var = f23839a;
            C9420r f = C9378o1.m27718a().mo60846f();
            q4Var.getClass();
            if (f == null) {
                return 0.0d;
            }
            if (!f.f23879C && (f.f23906u || f.f23907v)) {
                z = true;
            }
            if (z) {
                return f.f23905t;
            }
            return 0.0d;
        } else if (i == 2) {
            C9409q4 q4Var2 = f23839a;
            C9420r f2 = C9685w2.m28463a().mo60846f();
            q4Var2.getClass();
            if (f2 == null) {
                return 0.0d;
            }
            if (!f2.f23879C && (f2.f23906u || f2.f23907v)) {
                z = true;
            }
            if (z) {
                return f2.f23905t;
            }
            return 0.0d;
        } else if (i == 3) {
            return Math.max(m27844b(1), m27844b(2));
        } else {
            if (!(i == 4 || i == 8 || i == 16 || i == 64)) {
                if (i == 128) {
                    C9409q4 q4Var3 = f23839a;
                    C9420r f3 = C9384o4.m27742a().mo60846f();
                    q4Var3.getClass();
                    if (f3 == null) {
                        return 0.0d;
                    }
                    if (!f3.f23879C && (f3.f23906u || f3.f23907v)) {
                        z = true;
                    }
                    if (z) {
                        return f3.f23905t;
                    }
                    return 0.0d;
                } else if (i == 256) {
                    C9409q4 q4Var4 = f23839a;
                    C9420r f4 = C9205h2.m27336a().mo60846f();
                    q4Var4.getClass();
                    if (f4 == null) {
                        return 0.0d;
                    }
                    if (!f4.f23879C && (f4.f23906u || f4.f23907v)) {
                        z = true;
                    }
                    if (z) {
                        return f4.f23905t;
                    }
                    return 0.0d;
                } else if (!(i == 1024 || i == 2048)) {
                    return 0.0d;
                }
            }
            C9409q4 q4Var5 = f23839a;
            C9420r f5 = C9566t0.m28247a().mo60846f();
            q4Var5.getClass();
            if (f5 == null) {
                return 0.0d;
            }
            if (!f5.f23879C && (f5.f23906u || f5.f23907v)) {
                z = true;
            }
            if (z) {
                return f5.f23905t;
            }
            return 0.0d;
        }
    }

    /* renamed from: c */
    public static final boolean m27858c(int i) {
        C9577u uVar;
        if (i == 3) {
            return C9403q1.m27787a().f23828c;
        }
        if (!(i == 4 || i == 8 || i == 16 || i == 64)) {
            if (i == 128) {
                uVar = C9384o4.m27742a();
            } else if (i == 256) {
                uVar = C9205h2.m27336a();
            } else if (i == 512) {
                uVar = Native.m27078a();
            } else if (!(i == 1024 || i == 2048)) {
                return false;
            }
            return uVar.f24293k;
        }
        uVar = C9566t0.m28247a();
        return uVar.f24293k;
    }

    /* renamed from: a */
    public static final void m27817a(Activity activity, int i, int i2) {
        if (activity == null) {
            C9194g1.f23081k.mo59987b("activity is null");
        } else if (!m27879o()) {
            C9194g1.f23081k.mo59985a();
            f23839a.getClass();
            C9158g.f22974b.setActivity(activity);
            if ((i & 3) > 0) {
                C9419q5 q5Var = (C9419q5) C9685w2.m28463a().mo60846f();
                C9425r1 r1Var = (C9425r1) C9378o1.m27718a().mo60846f();
                if ((q5Var == null && r1Var == null) || !C9403q1.m27787a().mo60587b()) {
                    C9403q1.m27787a().mo60588c();
                    C9378o1.m27718a().mo60842c(activity);
                    C9685w2.m28463a().mo60842c(activity);
                }
            }
            if ((i & 128) > 0) {
                C9384o4.m27742a().mo60844d(activity);
            }
            if ((i & 3164) > 0) {
                C9566t0.m28247a().mo60844d(activity);
            }
            if ((i & 256) > 0) {
                C9205h2.m27336a().mo60844d(activity);
            }
            if ((i & 512) > 0) {
                Native.m27080c().mo60337b(i2);
                Native.m27080c().mo60339c();
            }
        }
    }

    /* renamed from: d */
    public static final void m27861d(boolean z) {
        C9194g1.f23068M.mo59986a(Intrinsics.stringPlus("value: ", Boolean.valueOf(z)));
        f23839a.getClass();
        C9158g.f22974b.setAutomaticActivityObserving(z);
        C9422r0.f23923l = z;
    }

    /* renamed from: a */
    public static final boolean m27841a(int i, String str) {
        C9218i1 i1Var;
        String str2;
        Intrinsics.checkNotNullParameter(str, "placementName");
        if (!f23841c) {
            i1Var = C9194g1.f23060E;
            str2 = "Appodeal is not initialized";
        } else if (!NetworkStatus.INSTANCE.isConnected()) {
            i1Var = C9194g1.f23060E;
            str2 = "no Internet";
        } else {
            C9194g1.f23060E.mo59985a();
            try {
                C9490g a = C9492h.m28084a(str);
                C9409q4 q4Var = f23839a;
                C9566t0.C9568b a2 = C9566t0.m28247a();
                Intrinsics.checkNotNullExpressionValue(a2, "getAdController()");
                q4Var.getClass();
                if (!((i & 3164) > 0 ? m27843a(a2.mo60846f(), a) : false)) {
                    C9205h2.C9207b a3 = C9205h2.m27336a();
                    Intrinsics.checkNotNullExpressionValue(a3, "getAdController()");
                    if (!((i & 256) > 0 ? m27843a(a3.mo60846f(), a) : false)) {
                        C9378o1.C9379a a4 = C9378o1.m27718a();
                        Intrinsics.checkNotNullExpressionValue(a4, "getAdController()");
                        if (!((i & 1) > 0 ? m27843a(a4.mo60846f(), a) : false)) {
                            C9384o4.C9386b a5 = C9384o4.m27742a();
                            Intrinsics.checkNotNullExpressionValue(a5, "getAdController()");
                            if (!((i & 128) > 0 ? m27843a(a5.mo60846f(), a) : false)) {
                                C9685w2.C9687b a6 = C9685w2.m28463a();
                                Intrinsics.checkNotNullExpressionValue(a6, "getAdController()");
                                if ((i & 2) > 0 ? m27843a(a6.mo60846f(), a) : false) {
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                }
                return true;
            } catch (Exception e) {
                Log.log(e);
                return false;
            }
        }
        i1Var.mo59987b(str2);
        return false;
    }

    /* renamed from: b */
    public static final void m27850b(Activity activity, int i) {
        if (activity == null) {
            C9194g1.f23083m.mo59987b("activity is null");
        } else if (!m27879o()) {
            C9194g1.f23083m.mo59986a(C9326n5.m27528a(i));
            f23839a.getClass();
            C9158g.f22974b.setActivity(activity);
            if ((i & 3164) > 0) {
                C9566t0.m28248a(activity);
            }
            if ((i & 256) > 0) {
                C9205h2.m27337a(activity);
            }
        }
    }

    /* renamed from: a */
    public static boolean m27843a(C9420r rVar, C9490g gVar) {
        if (rVar != null) {
            if (!rVar.f23879C && (rVar.f23906u || rVar.f23907v)) {
                Context applicationContext = C9148b.f22956b.f22957a.getApplicationContext();
                AdType n = rVar.mo60093n();
                gVar.getClass();
                if (gVar.mo60739a(applicationContext, n, rVar.f23905t)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m27849b(int i, boolean z) {
        C9218i1 i1Var = C9194g1.f23085o;
        StringBuilder a = C9203h0.m27334a("triggerOnLoadedOnPrecache for ");
        a.append(C9326n5.m27528a(i));
        a.append(": ");
        a.append(z);
        i1Var.mo59986a(a.toString());
        if ((i & 3) > 0) {
            C9378o1.m27718a().f24302t = z;
            C9685w2.m28463a().f24302t = z;
        }
        if ((i & 128) > 0) {
            C9384o4.m27742a().f24302t = z;
        }
        if ((i & 3164) > 0) {
            C9566t0.m28247a().f24302t = z;
        }
        if ((i & 256) > 0) {
            C9205h2.m27336a().f24302t = z;
        }
    }

    /* renamed from: a */
    public static final void m27836a(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "network");
        if (StringsKt.isBlank(str)) {
            C9194g1.f23094x.mo59987b("network is blank");
        } else if (!m27879o()) {
            C9218i1 i1Var = C9194g1.f23094x;
            i1Var.mo59986a(str + " - " + C9326n5.m27528a(i));
            f23839a.getClass();
            for (C9577u uVar : m27859d()) {
                C9409q4 q4Var = f23839a;
                int a = C9482s4.m28038a(uVar);
                q4Var.getClass();
                if ((i & a) > 0 && !uVar.f24291i) {
                    uVar.f24287e.mo59977a(str);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m27818a(Activity activity, String str, int i, Consent consent, Boolean bool, ApdInitializationCallback apdInitializationCallback) {
        Activity activity2 = activity;
        ApdInitializationCallback apdInitializationCallback2 = apdInitializationCallback;
        String str2 = str;
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        ArrayList arrayList = new ArrayList();
        if (activity2 == null) {
            arrayList.add(ApdInitializationError.Critical.ActivityIsNull.INSTANCE);
        }
        if (StringsKt.isBlank(str)) {
            String packageName = activity2 != null ? activity.getPackageName() : "your app";
            Intrinsics.checkNotNullExpressionValue(packageName, "bundleId");
            arrayList.add(new ApdInitializationError.Critical.AppKeyIsNullOrEmpty(packageName));
        }
        if (m27879o()) {
            arrayList.add(ApdInitializationError.Critical.SdkVersionIsNotSupported.INSTANCE);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C9194g1.f23071a.mo59987b(((ApdInitializationError.Critical) it.next()).getDescription());
            }
            if (apdInitializationCallback2 != null) {
                apdInitializationCallback2.onInitializationFinished(arrayList);
            }
        } else if (activity2 != null) {
            Application application = activity.getApplication();
            f23839a.getClass();
            C9158g gVar = C9158g.f22974b;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "checkedActivity.applicationContext");
            gVar.setApplicationContext(applicationContext);
            gVar.setActivity(activity);
            Intrinsics.checkNotNullExpressionValue(application, "application");
            Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f23851m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new C9428r4(apdInitializationCallback, C9735z4.m28557a(), application, str, consent, bool, i, (Continuation<? super C9428r4>) null), 3, (Object) null);
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: b */
    public static boolean m27853b(Activity activity, int i, String str) {
        Activity activity2 = activity;
        int i2 = i;
        String str2 = str;
        if (activity2 == null) {
            Log.log(new C9623a("Unable to show an ad: activity = null"));
            return false;
        } else if (m27879o()) {
            return false;
        } else {
            C9158g.f22974b.setActivity(activity2);
            try {
                C9490g a = C9492h.m28084a(str);
                if (i2 == 1) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9378o1.m27718a().mo60835a(str2);
                    }
                    return C9378o1.m27719a(activity2, new C9401q(a));
                } else if (i2 == 2) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9685w2.m28463a().mo60835a(str2);
                    }
                    return C9685w2.m28464a(activity2, new C9401q(a));
                } else if (i2 == 4) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9566t0.m28247a().mo60835a(str2);
                    }
                    return C9566t0.m28249a(activity2, new C9726y5(a, C9566t0.m28252c().mo61234b(activity2)));
                } else if (i2 == 8) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9566t0.m28247a().mo60835a(str2);
                    }
                    return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.BOTTOM));
                } else if (i2 == 16) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9566t0.m28247a().mo60835a(str2);
                    }
                    return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.TOP));
                } else if (i2 == 64) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9566t0.m28247a().mo60835a(str2);
                    }
                    return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.VIEW));
                } else if (i2 == 128) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9384o4.m27742a().mo60835a(str2);
                    }
                    return C9384o4.m27743a(activity2, new C9401q(a));
                } else if (i2 == 256) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9205h2.m27336a().mo60835a(str2);
                    }
                    return C9205h2.m27338a(activity2, new C9726y5(a, C8998a.VIEW));
                } else if (i2 == 1024) {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9566t0.m28247a().mo60835a(str2);
                    }
                    return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.f22771f));
                } else if (i2 != 2048) {
                    TreeMap treeMap = new TreeMap();
                    C9683w0 w0Var = (C9683w0) C9566t0.m28247a().mo60846f();
                    if ((i2 & 3164) > 0) {
                        if (m27843a((C9420r) w0Var, a)) {
                            if (w0Var != null) {
                                if ((i2 & 4) > 0) {
                                    treeMap.put(Double.valueOf(((C9674v0) w0Var.mo60593a(str2)).getEcpm()), 4);
                                }
                                if ((i2 & 8) > 0) {
                                    treeMap.put(Double.valueOf(((C9674v0) w0Var.mo60593a(str2)).getEcpm()), 8);
                                }
                                if ((i2 & 16) > 0) {
                                    treeMap.put(Double.valueOf(((C9674v0) w0Var.mo60593a(str2)).getEcpm()), 16);
                                }
                                if ((i2 & 1024) > 0) {
                                    treeMap.put(Double.valueOf(((C9674v0) w0Var.mo60593a(str2)).getEcpm()), 1024);
                                }
                                if ((i2 & 2048) > 0) {
                                    treeMap.put(Double.valueOf(((C9674v0) w0Var.mo60593a(str2)).getEcpm()), 2048);
                                }
                                if ((i2 & 64) > 0) {
                                    treeMap.put(Double.valueOf(((C9674v0) w0Var.mo60593a(str2)).getEcpm()), 64);
                                }
                            } else {
                                throw new IllegalArgumentException("Already checked at [canShow]".toString());
                            }
                        }
                    }
                    C9253k2 k2Var = (C9253k2) C9205h2.m27336a().mo60846f();
                    if ((i2 & 256) > 0 && m27843a((C9420r) k2Var, a)) {
                        if (k2Var != null) {
                            treeMap.put(Double.valueOf(((C9230j2) k2Var.mo60593a(str2)).getEcpm()), 256);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    C9425r1 r1Var = (C9425r1) C9378o1.m27718a().mo60846f();
                    int i3 = i2 & 1;
                    if (i3 > 0 && m27843a((C9420r) r1Var, a)) {
                        if (r1Var != null) {
                            treeMap.put(Double.valueOf(((C9394p1) r1Var.mo60593a(str2)).getEcpm()), 1);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    C9325n4 n4Var = (C9325n4) C9384o4.m27742a().mo60846f();
                    if ((i2 & 128) > 0 && m27843a((C9420r) n4Var, a)) {
                        if (n4Var != null) {
                            treeMap.put(Double.valueOf(((C9277m4) n4Var.mo60593a(str2)).getEcpm()), 128);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    C9419q5 q5Var = (C9419q5) C9685w2.m28463a().mo60846f();
                    if ((i2 & 2) > 0 && m27843a((C9420r) q5Var, a)) {
                        if (q5Var != null) {
                            treeMap.put(Double.valueOf(((C9388o5) q5Var.mo60593a(str2)).getEcpm()), 2);
                        } else {
                            throw new IllegalArgumentException("Already checked at [canShow]".toString());
                        }
                    }
                    if (!treeMap.isEmpty()) {
                        Map.Entry lastEntry = treeMap.lastEntry();
                        Integer num = lastEntry == null ? null : (Integer) lastEntry.getValue();
                        if (num != null) {
                            if (num.intValue() == 1) {
                                return C9378o1.m27719a(activity2, new C9401q(a));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 2) {
                                return C9685w2.m28464a(activity2, new C9401q(a));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 128) {
                                return C9384o4.m27743a(activity2, new C9401q(a));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 4) {
                                return C9566t0.m28249a(activity2, new C9726y5(a, C9566t0.m28252c().mo61234b(activity2)));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 8) {
                                return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.BOTTOM));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 16) {
                                return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.TOP));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 1024) {
                                return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.f22771f));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 2048) {
                                return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.f22772g));
                            }
                        }
                        if (num != null) {
                            if (num.intValue() == 64) {
                                return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.VIEW));
                            }
                        }
                        if (num == null) {
                            return false;
                        }
                        if (num.intValue() == 256) {
                            return C9205h2.m27338a(activity2, new C9726y5(a, C8998a.VIEW));
                        }
                        return false;
                    } else if (i3 <= 0) {
                        return false;
                    } else {
                        if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                            C9378o1.m27718a().mo60835a(str2);
                        }
                        return C9378o1.m27719a(activity2, new C9401q(a));
                    }
                } else {
                    if (C9492h.m28088a(a) && !C9492h.m28090c()) {
                        C9566t0.m28247a().mo60835a(str2);
                    }
                    return C9566t0.m28249a(activity2, new C9726y5(a, C8998a.f22772g));
                }
            } catch (Exception e) {
                Log.log(e);
                return false;
            }
        }
    }

    /* renamed from: a */
    public static final void m27839a(String str, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        if (StringsKt.isBlank(str)) {
            C9194g1.f23069N.mo59987b("event name is blank");
            return;
        }
        C9218i1 i1Var = C9194g1.f23069N;
        i1Var.mo59986a("event: " + str + ", params: " + map);
        f23839a.getClass();
        Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f23851m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new C9411b(str, map, (Continuation<? super C9411b>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final void m27829a(AdType adType, String str, String str2, String str3, C9490g gVar, double d) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        f23839a.getClass();
        Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f23851m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new C9412c(str, str2, str3, gVar, d, adType, (Continuation<? super C9412c>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static final void m27814a(int i, boolean z) {
        C9218i1 i1Var = C9194g1.f23084n;
        StringBuilder a = C9203h0.m27334a("auto cache for ");
        a.append(C9326n5.m27528a(i));
        a.append(": ");
        a.append(z);
        i1Var.mo59986a(a.toString());
        if ((i & 3) > 0) {
            C9403q1.m27787a().f23828c = z;
        }
        if ((i & 128) > 0) {
            C9384o4.m27742a().f24293k = z;
        }
        if ((i & 3164) > 0) {
            C9566t0.m28247a().f24293k = z;
        }
        if ((i & 256) > 0) {
            C9205h2.m27336a().f24293k = z;
        }
        if ((i & 512) > 0) {
            Native.m27078a().f24293k = z;
        }
    }

    /* renamed from: a */
    public static final void m27821a(BannerCallbacks bannerCallbacks) {
        C9194g1.f23077g.mo59986a((String) null);
        C9566t0.f24257a.f24319a = bannerCallbacks;
    }

    /* renamed from: a */
    public static final void m27822a(InterstitialCallbacks interstitialCallbacks) {
        C9194g1.f23075e.mo59986a((String) null);
        C9403q1.m27787a().f23826a = interstitialCallbacks;
    }

    /* renamed from: a */
    public static final void m27823a(MrecCallbacks mrecCallbacks) {
        C9194g1.f23078h.mo59986a((String) null);
        C9205h2.f23146a.f23181a = mrecCallbacks;
    }

    /* renamed from: a */
    public static final void m27826a(NativeCallbacks nativeCallbacks) {
        C9194g1.f23079i.mo59986a((String) null);
        C9323n2.f23580e = nativeCallbacks;
    }

    /* renamed from: a */
    public static final void m27827a(RewardedVideoCallbacks rewardedVideoCallbacks) {
        C9194g1.f23076f.mo59986a((String) null);
        C9384o4.f23805a.f23822a = rewardedVideoCallbacks;
    }

    /* renamed from: a */
    public static final void m27815a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C9194g1.f23064I.mo59985a();
        f23839a.getClass();
        C9158g.f22974b.setActivity(activity);
        activity.startActivity(new Intent(activity, TestActivity.class));
    }

    /* renamed from: a */
    public static final void m27820a(Context context, InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppPurchase, "purchase");
        C9194g1.f23070O.mo59986a(Intrinsics.stringPlus("purchase: ", inAppPurchase));
        f23839a.getClass();
        Job unused = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) f23851m.getValue(), (CoroutineContext) null, (CoroutineStart) null, new C9417h(inAppPurchase, inAppPurchaseValidateCallback, context, (Continuation<? super C9417h>) null), 3, (Object) null);
    }
}
