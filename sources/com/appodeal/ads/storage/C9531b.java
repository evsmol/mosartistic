package com.appodeal.ads.storage;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appodeal.ads.C9422r0;
import com.appodeal.ads.C9690w4;
import com.appodeal.ads.C9706x4;
import com.appodeal.ads.C9725y4;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.C9529a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.storage.b */
public final class C9531b implements C9529a, C9529a.C9530a {

    /* renamed from: a */
    public final Lazy f24172a = LazyKt.lazy(C9537f.f24190a);

    /* renamed from: b */
    public final Lazy f24173b = LazyKt.lazy(new C9548q(this));

    /* renamed from: c */
    public final LinkedHashMap f24174c = new LinkedHashMap();

    /* renamed from: com.appodeal.ads.storage.b$a */
    public enum C9532a {
        Default("appodeal"),
        Placement(Constants.PLACEMENT_FREQUENCY),
        InstallTracking("install_tracking"),
        CampaignFrequency(Constants.CAMPAIGN_FREQUENCY),
        CampaignFrequencyClicks("freq_clicks");
        

        /* renamed from: a */
        public final String f24181a;

        /* access modifiers changed from: public */
        C9532a(String str) {
            this.f24181a = str;
        }

        /* renamed from: a */
        public final String mo60807a() {
            return this.f24181a;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearClicks$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$b */
    public static final class C9533b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24182a;

        /* renamed from: b */
        public final /* synthetic */ long f24183b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9533b(C9531b bVar, long j, Continuation<? super C9533b> continuation) {
            super(2, continuation);
            this.f24182a = bVar;
            this.f24183b = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9533b(this.f24182a, this.f24183b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9533b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Map<String, ?> all = this.f24182a.mo60778a(C9532a.CampaignFrequencyClicks).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getInstance(CampaignFrequencyClicks).all");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : all.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                Pair pair = null;
                Long l = value instanceof Long ? (Long) value : null;
                if (l != null) {
                    l.longValue();
                    pair = TuplesKt.m14544to(str, value);
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map map = MapsKt.toMap(arrayList);
            SharedPreferences.Editor edit = this.f24182a.mo60778a(C9532a.CampaignFrequencyClicks).edit();
            long j = this.f24183b - 259200000;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (((Number) entry.getValue()).longValue() < j) {
                    edit.remove(str2);
                }
            }
            edit.apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearExpiredTrackingDataAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$c */
    public static final class C9534c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24184a;

        /* renamed from: b */
        public final /* synthetic */ long f24185b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9534c(C9531b bVar, long j, Continuation<? super C9534c> continuation) {
            super(2, continuation);
            this.f24184a = bVar;
            this.f24185b = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9534c(this.f24184a, this.f24185b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9534c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Map<String, ?> all = this.f24184a.mo60778a(C9532a.InstallTracking).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getInstance(InstallTracking).all");
            long j = this.f24185b;
            C9531b bVar = this.f24184a;
            for (Map.Entry next : all.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                Long l = value instanceof Long ? (Long) value : null;
                if ((l == null ? 0 : l.longValue()) < j) {
                    bVar.mo60778a(C9532a.InstallTracking).edit().remove(str).apply();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearRequestDataAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$d */
    public static final class C9535d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ String f24186a;

        /* renamed from: b */
        public final /* synthetic */ C9531b f24187b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9535d(C9531b bVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f24186a = str;
            this.f24187b = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9535d(this.f24187b, this.f24186a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9535d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String stringPlus = Intrinsics.stringPlus(this.f24186a, "_timestamp");
            this.f24187b.mo60778a(C9532a.Default).edit().remove(this.f24186a).remove(stringPlus).remove(Intrinsics.stringPlus(this.f24186a, "_wst")).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$clearTrackingExpireTimeAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$e */
    public static final class C9536e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24188a;

        /* renamed from: b */
        public final /* synthetic */ String f24189b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9536e(C9531b bVar, String str, Continuation<? super C9536e> continuation) {
            super(2, continuation);
            this.f24188a = bVar;
            this.f24189b = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9536e(this.f24188a, this.f24189b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9536e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24188a.mo60778a(C9532a.InstallTracking).edit().remove(this.f24189b).apply();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.appodeal.ads.storage.b$f */
    public static final class C9537f extends Lambda implements Function0<ExecutorCoroutineDispatcher> {

        /* renamed from: a */
        public static final C9537f f24190a = new C9537f();

        public C9537f() {
            super(0);
        }

        public final Object invoke() {
            return ThreadPoolDispatcherKt.newSingleThreadContext("shared_prefs");
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveAllCampaigns$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$g */
    public static final class C9538g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24191a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f24192b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9538g(C9531b bVar, JSONObject jSONObject, Continuation<? super C9538g> continuation) {
            super(2, continuation);
            this.f24191a = bVar;
            this.f24192b = jSONObject;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9538g(this.f24191a, this.f24192b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9538g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SharedPreferences.Editor edit = this.f24191a.mo60778a(C9532a.CampaignFrequency).edit();
            edit.clear();
            Iterator<String> keys = this.f24192b.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "campaigns.keys()");
            JSONObject jSONObject = this.f24192b;
            while (keys.hasNext()) {
                String next = keys.next();
                edit.putString(next, jSONObject.getString(next));
            }
            edit.apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveCampaign$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$h */
    public static final class C9539h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24193a;

        /* renamed from: b */
        public final /* synthetic */ String f24194b;

        /* renamed from: c */
        public final /* synthetic */ String f24195c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9539h(C9531b bVar, String str, String str2, Continuation<? super C9539h> continuation) {
            super(2, continuation);
            this.f24193a = bVar;
            this.f24194b = str;
            this.f24195c = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9539h(this.f24193a, this.f24194b, this.f24195c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9539h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24193a.mo60778a(C9532a.CampaignFrequency).edit().putString(this.f24194b, this.f24195c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveClicks$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$i */
    public static final class C9540i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24196a;

        /* renamed from: b */
        public final /* synthetic */ String f24197b;

        /* renamed from: c */
        public final /* synthetic */ long f24198c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9540i(C9531b bVar, String str, long j, Continuation<? super C9540i> continuation) {
            super(2, continuation);
            this.f24196a = bVar;
            this.f24197b = str;
            this.f24198c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9540i(this.f24196a, this.f24197b, this.f24198c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9540i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24196a.mo60778a(C9532a.CampaignFrequencyClicks).edit().putLong(this.f24197b, this.f24198c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveEventDataAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$j */
    public static final class C9541j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24199a;

        /* renamed from: b */
        public final /* synthetic */ String f24200b;

        /* renamed from: c */
        public final /* synthetic */ String f24201c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9541j(C9531b bVar, String str, String str2, Continuation<? super C9541j> continuation) {
            super(2, continuation);
            this.f24199a = bVar;
            this.f24200b = str;
            this.f24201c = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9541j(this.f24199a, this.f24200b, this.f24201c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9541j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24199a.mo60778a(C9532a.Default).edit().putString(this.f24200b, this.f24201c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveFirstAdSessionLaunchTimeAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$k */
    public static final class C9542k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24202a;

        /* renamed from: b */
        public final /* synthetic */ long f24203b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9542k(C9531b bVar, long j, Continuation<? super C9542k> continuation) {
            super(2, continuation);
            this.f24202a = bVar;
            this.f24203b = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9542k(this.f24202a, this.f24203b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9542k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24202a.mo60778a(C9532a.Default).edit().putLong("first_ad_session_launch_time", this.f24203b).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$savePlacementAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$l */
    public static final class C9543l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24204a;

        /* renamed from: b */
        public final /* synthetic */ String f24205b;

        /* renamed from: c */
        public final /* synthetic */ String f24206c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9543l(C9531b bVar, String str, String str2, Continuation<? super C9543l> continuation) {
            super(2, continuation);
            this.f24204a = bVar;
            this.f24205b = str;
            this.f24206c = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9543l(this.f24204a, this.f24205b, this.f24206c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9543l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24204a.mo60778a(C9532a.Placement).edit().putString(this.f24205b, this.f24206c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveSessionUptimeAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$m */
    public static final class C9544m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24207a;

        /* renamed from: b */
        public final /* synthetic */ long f24208b;

        /* renamed from: c */
        public final /* synthetic */ long f24209c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9544m(C9531b bVar, long j, long j2, Continuation<? super C9544m> continuation) {
            super(2, continuation);
            this.f24207a = bVar;
            this.f24208b = j;
            this.f24209c = j2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9544m(this.f24207a, this.f24208b, this.f24209c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9544m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24207a.mo60778a(C9532a.Default).edit().putLong("session_uptime", this.f24208b).putLong("session_uptime_m", this.f24209c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveSessionsData$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$n */
    public static final class C9545n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24210a;

        /* renamed from: b */
        public final /* synthetic */ String f24211b;

        /* renamed from: c */
        public final /* synthetic */ long f24212c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9545n(C9531b bVar, String str, long j, Continuation<? super C9545n> continuation) {
            super(2, continuation);
            this.f24210a = bVar;
            this.f24211b = str;
            this.f24212c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9545n(this.f24210a, this.f24211b, this.f24212c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9545n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24210a.mo60778a(C9532a.Default).edit().putString(Constants.SESSIONS, this.f24211b).putLong("sessions_size", this.f24212c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveTrackingExpireTimeAsync$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$o */
    public static final class C9546o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24213a;

        /* renamed from: b */
        public final /* synthetic */ String f24214b;

        /* renamed from: c */
        public final /* synthetic */ long f24215c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9546o(C9531b bVar, String str, long j, Continuation<? super C9546o> continuation) {
            super(2, continuation);
            this.f24213a = bVar;
            this.f24214b = str;
            this.f24215c = j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9546o(this.f24213a, this.f24214b, this.f24215c, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9546o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24213a.mo60778a(C9532a.InstallTracking).edit().putLong(this.f24214b, this.f24215c).apply();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.ads.storage.KeyValueStorageImpl$saveUserToken$1", mo38569f = "KeyValueStorageImpl.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.ads.storage.b$p */
    public static final class C9547p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24216a;

        /* renamed from: b */
        public final /* synthetic */ String f24217b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9547p(C9531b bVar, String str, Continuation<? super C9547p> continuation) {
            super(2, continuation);
            this.f24216a = bVar;
            this.f24217b = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9547p(this.f24216a, this.f24217b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9547p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24216a.mo60778a(C9532a.Default).edit().putString("user_token", this.f24217b).apply();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.appodeal.ads.storage.b$q */
    public static final class C9548q extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a */
        public final /* synthetic */ C9531b f24218a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9548q(C9531b bVar) {
            super(0);
            this.f24218a = bVar;
        }

        public final Object invoke() {
            return CoroutineScopeKt.CoroutineScope(this.f24218a.mo60796e());
        }
    }

    /* renamed from: a */
    public final SharedPreferences mo60778a(C9532a aVar) {
        Object obj = this.f24174c.get(aVar);
        if (obj != null) {
            return ((C9564q) obj).mo60826a();
        }
        throw new IllegalArgumentException(("Prefs " + aVar + " is not initialized").toString());
    }

    /* renamed from: a */
    public final Object mo60779a(C9422r0.C9423a aVar) {
        return BuildersKt.withContext(mo60796e(), new C9551e(this, (Continuation<? super C9551e>) null), aVar);
    }

    /* renamed from: a */
    public final Object mo60765a(C9690w4 w4Var) {
        return BuildersKt.withContext(mo60796e(), new C9549c(this, (Continuation<? super C9549c>) null), w4Var);
    }

    /* renamed from: a */
    public final Object mo60777a(C9706x4.C9707a aVar) {
        Object withContext = BuildersKt.withContext(mo60796e(), new C9552f(this, (Continuation<? super C9552f>) null), aVar);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Object mo60766a(C9725y4 y4Var) {
        Object withContext = BuildersKt.withContext(mo60796e(), new C9558l(this, (Continuation<? super C9558l>) null), y4Var);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Object mo60767a(String str, C9725y4 y4Var) {
        Object withContext = BuildersKt.withContext(mo60796e(), new C9553g(this, str, (Continuation<? super C9553g>) null), y4Var);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Object mo60780a(LinkedHashSet linkedHashSet, C9422r0.C9424b bVar) {
        Object withContext = BuildersKt.withContext(mo60796e(), new C9557k(this, linkedHashSet, (Continuation<? super C9557k>) null), bVar);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* renamed from: a */
    public final Object mo60768a(ContinuationImpl continuationImpl) {
        return BuildersKt.withContext(mo60796e(), new C9550d(this, (Continuation<? super C9550d>) null), continuationImpl);
    }

    /* renamed from: a */
    public final String mo60769a() {
        return mo60778a(C9532a.Default).getString("user_token", (String) null);
    }

    /* renamed from: a */
    public final Triple<JSONObject, Long, Integer> mo60770a(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        String stringPlus = Intrinsics.stringPlus(str, "_timestamp");
        String stringPlus2 = Intrinsics.stringPlus(str, "_wst");
        C9532a aVar = C9532a.Default;
        JSONObject jSONObject = null;
        String string = mo60778a(aVar).getString(str, (String) null);
        if (string != null) {
            jSONObject = new JSONObject(string);
        }
        return new Triple<>(jSONObject, Long.valueOf(mo60778a(aVar).getLong(stringPlus, 0)), Integer.valueOf(mo60778a(aVar).getInt(stringPlus2, Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD)));
    }

    /* renamed from: a */
    public final void mo60771a(int i) {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9554h(this, "part_of_audience", i, (Continuation<? super C9554h>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60772a(int i, long j, String str, String str2) {
        String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "key");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "jsonString");
        String stringPlus = Intrinsics.stringPlus(str3, "_timestamp");
        String stringPlus2 = Intrinsics.stringPlus(str3, "_wst");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9555i(this, str3, str4, stringPlus, j, stringPlus2, i, (Continuation<? super C9555i>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60781a(long j) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9533b(this, j, (Continuation<? super C9533b>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60782a(long j, long j2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9544m(this, j, j2, (Continuation<? super C9544m>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60783a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9540i(this, str, j, (Continuation<? super C9540i>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60784a(String str, long j, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(str, Constants.UUID);
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9556j(this, str, j, 0, 0, j2, j3, j4, j5, (Continuation<? super C9556j>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60785a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        Intrinsics.checkNotNullParameter(str2, "campaignData");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9539h(this, str, str2, (Continuation<? super C9539h>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo60786a(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "campaigns");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9538g(this, jSONObject, (Continuation<? super C9538g>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final int mo60773b() {
        Intrinsics.checkNotNullParameter("part_of_audience", "key");
        return mo60778a(C9532a.Default).getInt("part_of_audience", -1);
    }

    /* renamed from: b */
    public final void mo60787b(long j) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9534c(this, j, (Continuation<? super C9534c>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final void mo60774b(String str) {
        Intrinsics.checkNotNullParameter(str, "userToken");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9547p(this, str, (Continuation<? super C9547p>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final void mo60788b(String str, long j) {
        Intrinsics.checkNotNullParameter(str, Constants.SESSIONS);
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9545n(this, str, j, (Continuation<? super C9545n>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final void mo60789b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9541j(this, str, str2, (Continuation<? super C9541j>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final String mo60775c() {
        return mo60778a(C9532a.Default).getString(Constants.APP_KEY, (String) null);
    }

    /* renamed from: c */
    public final void mo60790c(long j) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9542k(this, j, (Continuation<? super C9542k>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo60776c(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9535d(this, str, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo60791c(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9546o(this, str, j, (Continuation<? super C9546o>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo60792c(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "string");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9543l(this, str, str2, (Continuation<? super C9543l>) null), 3, (Object) null);
    }

    /* renamed from: d */
    public final Map<String, String> mo60793d() {
        Map<String, ?> all = mo60778a(C9532a.CampaignFrequency).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getInstance(CampaignFrequency).all");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            Pair pair = null;
            if ((value instanceof String ? (String) value : null) != null) {
                pair = TuplesKt.m14544to(str, value);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* renamed from: d */
    public final void mo60794d(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(mo60800g(), (CoroutineContext) null, (CoroutineStart) null, new C9536e(this, str, (Continuation<? super C9536e>) null), 3, (Object) null);
    }

    /* renamed from: e */
    public final String mo60795e(String str) {
        Intrinsics.checkNotNullParameter(str, "campaignId");
        return mo60778a(C9532a.CampaignFrequency).getString(str, (String) null);
    }

    /* renamed from: e */
    public final ExecutorCoroutineDispatcher mo60796e() {
        return (ExecutorCoroutineDispatcher) this.f24172a.getValue();
    }

    /* renamed from: f */
    public final String mo60797f(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        String string = mo60778a(C9532a.Default).getString(str, JsonUtils.EMPTY_JSON);
        return string == null ? JsonUtils.EMPTY_JSON : string;
    }

    /* renamed from: f */
    public final Map<String, String> mo60798f() {
        Map<String, ?> all = mo60778a(C9532a.Placement).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getInstance(Placement).all");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            Pair pair = value == null ? null : TuplesKt.m14544to(str, value.toString());
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    /* renamed from: g */
    public final Long mo60799g(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        C9532a aVar = C9532a.InstallTracking;
        if (!mo60778a(aVar).contains(str)) {
            return null;
        }
        return Long.valueOf(mo60778a(aVar).getLong(str, 0));
    }

    /* renamed from: g */
    public final CoroutineScope mo60800g() {
        return (CoroutineScope) this.f24173b.getValue();
    }

    /* renamed from: h */
    public final long mo60801h() {
        return mo60778a(C9532a.Default).getLong("session_id", 0);
    }

    /* renamed from: i */
    public final long mo60802i() {
        return mo60778a(C9532a.Default).getLong("session_start_ts_m", 0);
    }

    /* renamed from: j */
    public final long mo60803j() {
        return mo60778a(C9532a.Default).getLong("session_start_ts", 0);
    }

    /* renamed from: k */
    public final long mo60804k() {
        return mo60778a(C9532a.Default).getLong("session_uptime_m", 0);
    }

    /* renamed from: l */
    public final long mo60805l() {
        return mo60778a(C9532a.Default).getLong("session_uptime", 0);
    }

    /* renamed from: m */
    public final String mo60806m() {
        return mo60778a(C9532a.Default).getString("session_uuid", (String) null);
    }
}
