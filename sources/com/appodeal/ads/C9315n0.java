package com.appodeal.ads;

import android.util.SparseArray;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.utils.C9650s;
import com.appodeal.ads.utils.C9660v;
import com.appodeal.ads.utils.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.n0 */
public final class C9315n0 {

    /* renamed from: a */
    public final String f23547a;

    /* renamed from: b */
    public final JSONObject f23548b;

    /* renamed from: c */
    public final Lazy f23549c;

    /* renamed from: d */
    public AppodealRequestCallbacks f23550d;

    /* renamed from: e */
    public final SparseArray<JSONObject> f23551e;

    /* renamed from: f */
    public final SparseArray<Pair<String, Long>> f23552f;

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onClick$1", mo38569f = "AppodealRequestCallbacksWrapper.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.n0$a */
    public static final class C9316a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9315n0 f23553a;

        /* renamed from: b */
        public final /* synthetic */ AdType f23554b;

        /* renamed from: c */
        public final /* synthetic */ String f23555c;

        /* renamed from: d */
        public final /* synthetic */ String f23556d;

        /* renamed from: e */
        public final /* synthetic */ double f23557e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9316a(C9315n0 n0Var, AdType adType, String str, String str2, double d, Continuation<? super C9316a> continuation) {
            super(2, continuation);
            this.f23553a = n0Var;
            this.f23554b = adType;
            this.f23555c = str;
            this.f23556d = str2;
            this.f23557e = d;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9316a(this.f23553a, this.f23554b, this.f23555c, this.f23556d, this.f23557e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9316a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b = this.f23553a.f23550d;
            if (b != null) {
                b.onClick(this.f23554b.getDisplayName(), this.f23555c, this.f23556d, this.f23557e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onImpression$1", mo38569f = "AppodealRequestCallbacksWrapper.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.n0$b */
    public static final class C9317b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9315n0 f23558a;

        /* renamed from: b */
        public final /* synthetic */ AdType f23559b;

        /* renamed from: c */
        public final /* synthetic */ String f23560c;

        /* renamed from: d */
        public final /* synthetic */ String f23561d;

        /* renamed from: e */
        public final /* synthetic */ double f23562e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9317b(C9315n0 n0Var, AdType adType, String str, String str2, double d, Continuation<? super C9317b> continuation) {
            super(2, continuation);
            this.f23558a = n0Var;
            this.f23559b = adType;
            this.f23560c = str;
            this.f23561d = str2;
            this.f23562e = d;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9317b(this.f23558a, this.f23559b, this.f23560c, this.f23561d, this.f23562e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9317b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b = this.f23558a.f23550d;
            if (b != null) {
                b.onImpression(this.f23559b.getDisplayName(), this.f23560c, this.f23561d, this.f23562e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onRequestFinish$1", mo38569f = "AppodealRequestCallbacksWrapper.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.n0$c */
    public static final class C9318c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9315n0 f23563a;

        /* renamed from: b */
        public final /* synthetic */ AdType f23564b;

        /* renamed from: c */
        public final /* synthetic */ String f23565c;

        /* renamed from: d */
        public final /* synthetic */ String f23566d;

        /* renamed from: e */
        public final /* synthetic */ boolean f23567e;

        /* renamed from: f */
        public final /* synthetic */ double f23568f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9318c(C9315n0 n0Var, AdType adType, String str, String str2, boolean z, double d, Continuation<? super C9318c> continuation) {
            super(2, continuation);
            this.f23563a = n0Var;
            this.f23564b = adType;
            this.f23565c = str;
            this.f23566d = str2;
            this.f23567e = z;
            this.f23568f = d;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9318c(this.f23563a, this.f23564b, this.f23565c, this.f23566d, this.f23567e, this.f23568f, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9318c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b = this.f23563a.f23550d;
            if (b != null) {
                String displayName = this.f23564b.getDisplayName();
                String str = this.f23565c;
                String str2 = this.f23566d;
                boolean z = this.f23567e;
                b.onRequestFinish(displayName, str, str2, z ? this.f23568f : 0.0d, z);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onRequestStart$1", mo38569f = "AppodealRequestCallbacksWrapper.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.n0$d */
    public static final class C9319d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9315n0 f23569a;

        /* renamed from: b */
        public final /* synthetic */ AdType f23570b;

        /* renamed from: c */
        public final /* synthetic */ String f23571c;

        /* renamed from: d */
        public final /* synthetic */ String f23572d;

        /* renamed from: e */
        public final /* synthetic */ double f23573e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9319d(C9315n0 n0Var, AdType adType, String str, String str2, double d, Continuation<? super C9319d> continuation) {
            super(2, continuation);
            this.f23569a = n0Var;
            this.f23570b = adType;
            this.f23571c = str;
            this.f23572d = str2;
            this.f23573e = d;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9319d(this.f23569a, this.f23570b, this.f23571c, this.f23572d, this.f23573e, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9319d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b = this.f23569a.f23550d;
            if (b != null) {
                b.onRequestStart(this.f23570b.getDisplayName(), this.f23571c, this.f23572d, this.f23573e);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onWaterfallFinish$1", mo38569f = "AppodealRequestCallbacksWrapper.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.n0$e */
    public static final class C9320e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9315n0 f23574a;

        /* renamed from: b */
        public final /* synthetic */ AdType f23575b;

        /* renamed from: c */
        public final /* synthetic */ boolean f23576c;

        /* renamed from: d */
        public final /* synthetic */ double f23577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9320e(C9315n0 n0Var, AdType adType, boolean z, double d, Continuation<? super C9320e> continuation) {
            super(2, continuation);
            this.f23574a = n0Var;
            this.f23575b = adType;
            this.f23576c = z;
            this.f23577d = d;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9320e(this.f23574a, this.f23575b, this.f23576c, this.f23577d, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9320e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b = this.f23574a.f23550d;
            if (b != null) {
                String displayName = this.f23575b.getDisplayName();
                boolean z = this.f23576c;
                b.onWaterfallFinish(displayName, z ? this.f23577d : 0.0d, z);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.AppodealRequestCallbacksWrapper$onWaterfallStart$1", mo38569f = "AppodealRequestCallbacksWrapper.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.n0$f */
    public static final class C9321f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9315n0 f23578a;

        /* renamed from: b */
        public final /* synthetic */ AdType f23579b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9321f(C9315n0 n0Var, AdType adType, Continuation<? super C9321f> continuation) {
            super(2, continuation);
            this.f23578a = n0Var;
            this.f23579b = adType;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9321f(this.f23578a, this.f23579b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9321f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppodealRequestCallbacks b = this.f23578a.f23550d;
            if (b != null) {
                b.onWaterfallStart(this.f23579b.getDisplayName());
            }
            return Unit.INSTANCE;
        }
    }

    public C9315n0() {
        this(0);
    }

    public /* synthetic */ C9315n0(int i) {
        this(C9402q0.m27786a(), "https://rri.appodeal.com/api/stat");
    }

    public C9315n0(JSONObject jSONObject, String str) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(jSONObject, "defaultWaterfall");
        this.f23547a = str;
        this.f23548b = jSONObject;
        this.f23549c = LazyKt.lazy(C9377o0.f23798a);
        this.f23551e = new SparseArray<>();
        this.f23552f = new SparseArray<>();
    }

    /* renamed from: a */
    public static boolean m27499a(int i) {
        if (i == 128) {
            return C9384o4.m27742a().f24301s;
        }
        if (i == 256) {
            return C9205h2.m27336a().f24301s;
        }
        if (i == 512) {
            return Native.m27078a().f24301s;
        }
        if (i == 1) {
            return C9378o1.m27718a().f24301s;
        }
        if (i == 2) {
            return C9685w2.m28463a().f24301s;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            return C9566t0.m28247a().f24301s;
        } else if (C9378o1.m27718a().f24301s || C9685w2.m28463a().f24301s) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final CoroutineScope mo60323a() {
        return (CoroutineScope) this.f23549c.getValue();
    }

    /* renamed from: a */
    public final void mo60325a(AdType adType, double d, String str, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9316a(this, adType, str, str2, d, (Continuation<? super C9316a>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60326a(AdType adType, double d, String str, String str2, boolean z, int i) {
        Pair pair;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(adType, "adType");
        try {
            int notifyType = adType.getNotifyType();
            if (m27499a(notifyType) && (pair = this.f23552f.get(notifyType)) != null) {
                String str3 = (String) pair.getFirst();
                long longValue = ((Number) pair.getSecond()).longValue();
                JSONObject jSONObject = this.f23551e.get(notifyType);
                if (jSONObject != null) {
                    long currentTimeMillis = System.currentTimeMillis() - longValue;
                    JSONArray jSONArray = jSONObject.getJSONArray("ad_units");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("aid", str3);
                    jSONObject2.put("network_name", str);
                    jSONObject2.put("fill", z2);
                    jSONObject2.put("delta", currentTimeMillis);
                    if (!z2) {
                        jSONObject2.put(IronSourceConstants.EVENTS_ERROR_REASON, i);
                    }
                    jSONArray.put(jSONObject2);
                    Job unused = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9318c(this, adType, str, str2, z, d, (Continuation<? super C9318c>) null), 3, (Object) null);
                }
            }
            String str4 = str;
            Job unused2 = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9318c(this, adType, str, str2, z, d, (Continuation<? super C9318c>) null), 3, (Object) null);
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: b */
    public final void mo60328b(AdType adType, double d, String str, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9317b(this, adType, str, str2, d, (Continuation<? super C9317b>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo60329c(AdType adType, double d, String str, String str2) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        mo60326a(adType, d, str, str2, true, 0);
    }

    /* renamed from: d */
    public final void mo60330d(AdType adType, double d, String str, String str2) {
        AdType adType2 = adType;
        Intrinsics.checkNotNullParameter(adType, "adType");
        int notifyType = adType.getNotifyType();
        if (m27499a(notifyType)) {
            this.f23552f.put(notifyType, TuplesKt.m14544to(str2, Long.valueOf(System.currentTimeMillis())));
        } else {
            String str3 = str2;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9319d(this, adType, str, str2, d, (Continuation<? super C9319d>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60327a(AdType adType, double d, boolean z) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(adType, "adType");
        try {
            int notifyType = adType.getNotifyType();
            if (m27499a(notifyType) && (jSONObject = this.f23551e.get(notifyType)) != null) {
                jSONObject.put(IronSourceConstants.EVENTS_RESULT, z);
                Intrinsics.checkNotNullParameter(jSONObject, "waterfall");
                this.f23551e.remove(notifyType);
                this.f23552f.remove(notifyType);
                C9650s.f24449e.execute(new C9660v(jSONObject.toString(), this.f23547a));
            }
            Job unused = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9320e(this, adType, z, d, (Continuation<? super C9320e>) null), 3, (Object) null);
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: a */
    public final void mo60324a(AdType adType) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(adType, "adType");
        int notifyType = adType.getNotifyType();
        if (m27499a(notifyType)) {
            SparseArray<JSONObject> sparseArray = this.f23551e;
            synchronized (this) {
                try {
                    jSONObject = JsonObjectBuilderKt.jsonObject(new C9271m0(this, notifyType));
                } catch (Exception e) {
                    Log.log(e);
                    jSONObject = null;
                }
            }
            sparseArray.put(notifyType, jSONObject);
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60323a(), (CoroutineContext) null, (CoroutineStart) null, new C9321f(this, adType, (Continuation<? super C9321f>) null), 3, (Object) null);
    }
}
