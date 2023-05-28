package com.appodeal.consent.internal;

import android.app.Activity;
import android.content.Context;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentManager;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.view.C9784b;
import com.appodeal.consent.view.C9790d;
import com.appodeal.consent.view.ConsentActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;

/* renamed from: com.appodeal.consent.internal.d */
public final class C9757d implements C9784b.C9788c {

    /* renamed from: a */
    public final Context f24758a;

    /* renamed from: b */
    public final C9758a f24759b;

    /* renamed from: c */
    public int f24760c = 1;

    /* renamed from: d */
    public final CoroutineScope f24761d = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());

    /* renamed from: e */
    public final Lazy f24762e = LazyKt.lazy(new C9766g(this));

    /* renamed from: f */
    public Activity f24763f;

    /* renamed from: com.appodeal.consent.internal.d$a */
    public interface C9758a {
        void onClosed();

        void onError(ConsentManagerError consentManagerError);

        void onLoaded();

        void onOpened();
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalForm$handleClose$1", mo38569f = "InternalForm.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.d$b */
    public static final class C9759b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9757d f24764a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f24765b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9759b(C9757d dVar, JSONObject jSONObject, Continuation<? super C9759b> continuation) {
            super(2, continuation);
            this.f24764a = dVar;
            this.f24765b = jSONObject;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9759b(this.f24764a, this.f24765b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9759b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24764a.f24760c = 1;
            Function1<? super Activity, Unit> function1 = ConsentActivity.f24807b;
            ConsentActivity.C9782a.m28618b();
            Activity a = this.f24764a.f24763f;
            if (a != null) {
                a.finish();
            }
            this.f24764a.f24763f = null;
            Lazy lazy = C9774g.f24791a;
            C9774g.m28606a(false);
            JSONObject jSONObject = this.f24765b;
            C9774g.m28604a(jSONObject == null ? Consent.copy$default(C9774g.m28607b(), Consent.Status.NON_PERSONALIZED, (Consent.Zone) null, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, 510, (Object) null) : new Consent(jSONObject));
            Consent b = C9774g.m28607b();
            Context applicationContext = this.f24764a.mo61333b().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            C9752b.m28580a(b, applicationContext);
            Consent b2 = C9774g.m28607b();
            Context applicationContext2 = this.f24764a.mo61333b().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            C9752b.m28581b(b2, applicationContext2);
            this.f24764a.mo61334c().onClosed();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalForm$handleError$1", mo38569f = "InternalForm.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.d$c */
    public static final class C9760c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ String f24766a;

        /* renamed from: b */
        public final /* synthetic */ C9757d f24767b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9760c(String str, C9757d dVar, Continuation<? super C9760c> continuation) {
            super(2, continuation);
            this.f24766a = str;
            this.f24767b = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9760c(this.f24766a, this.f24767b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9760c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = this.f24766a;
            if (str != null) {
                this.f24767b.mo61334c().onError(new ConsentManagerError.ShowingError(str));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalForm$handleLoaded$1", mo38569f = "InternalForm.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.d$d */
    public static final class C9761d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9757d f24768a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9761d(C9757d dVar, Continuation<? super C9761d> continuation) {
            super(2, continuation);
            this.f24768a = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9761d(this.f24768a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9761d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24768a.f24760c = 3;
            this.f24768a.mo61334c().onLoaded();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalForm$load$1", mo38569f = "InternalForm.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.d$e */
    public static final class C9762e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9757d f24769a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9762e(C9757d dVar, Continuation<? super C9762e> continuation) {
            super(2, continuation);
            this.f24769a = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9762e(this.f24769a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9762e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C9757d dVar;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f24769a.mo61336e()) {
                dVar = this.f24769a;
                str = "Cannot simultaneously load multiple consent forms.";
            } else {
                if (this.f24769a.mo61335d()) {
                    this.f24769a.mo61330a();
                } else if (C9790d.m28634a(C9757d.m28589b(this.f24769a))) {
                    dVar = this.f24769a;
                    str = "Consent url is not valid.";
                } else {
                    this.f24769a.f24760c = 2;
                    C9757d.m28591d(this.f24769a).mo61350a();
                    C9757d.m28591d(this.f24769a).loadUrl(C9757d.m28589b(this.f24769a));
                }
                return Unit.INSTANCE;
            }
            dVar.mo61331a(str);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalForm$show$1", mo38569f = "InternalForm.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.d$f */
    public static final class C9763f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ C9757d f24770a;

        /* renamed from: com.appodeal.consent.internal.d$f$a */
        public static final class C9764a extends Lambda implements Function1<Activity, Unit> {

            /* renamed from: a */
            public final /* synthetic */ C9757d f24771a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9764a(C9757d dVar) {
                super(1);
                this.f24771a = dVar;
            }

            public final Object invoke(Object obj) {
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activity, "it");
                this.f24771a.f24763f = activity;
                Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24771a.f24761d, (CoroutineContext) null, (CoroutineStart) null, new C9767e(this.f24771a, (Continuation<? super C9767e>) null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.appodeal.consent.internal.d$f$b */
        public static final class C9765b extends Lambda implements Function1<Activity, Unit> {

            /* renamed from: a */
            public final /* synthetic */ C9757d f24772a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9765b(C9757d dVar) {
                super(1);
                this.f24772a = dVar;
            }

            public final Object invoke(Object obj) {
                Intrinsics.checkNotNullParameter((Activity) obj, "it");
                C9757d.m28591d(this.f24772a).getCloseButton().callOnClick();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9763f(C9757d dVar, Continuation<? super C9763f> continuation) {
            super(2, continuation);
            this.f24770a = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9763f(this.f24770a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9763f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C9757d dVar;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean f = this.f24770a.mo61337f();
            Function1<? super Activity, Unit> function1 = ConsentActivity.f24807b;
            if (f || ConsentActivity.C9782a.m28617a()) {
                dVar = this.f24770a;
                str = "Consent form is already displayed.";
            } else if (!this.f24770a.mo61335d()) {
                dVar = this.f24770a;
                str = "Consent form is not ready to be displayed.";
            } else {
                this.f24770a.f24760c = 4;
                ConsentActivity.C9782a.m28614a(new C9764a(this.f24770a));
                ConsentActivity.C9782a.m28615a(new C9765b(this.f24770a));
                ConsentActivity.C9782a.m28616a(C9757d.m28591d(this.f24770a));
                return Unit.INSTANCE;
            }
            dVar.mo61331a(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.appodeal.consent.internal.d$g */
    public static final class C9766g extends Lambda implements Function0<C9784b> {

        /* renamed from: a */
        public final /* synthetic */ C9757d f24773a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9766g(C9757d dVar) {
            super(0);
            this.f24773a = dVar;
        }

        public final Object invoke() {
            C9757d dVar = this.f24773a;
            return new C9784b(dVar.f24758a, dVar, C9774g.f24793c, ConsentManager.getConsent(), ConsentManager.getCustomVendors());
        }
    }

    public C9757d(Context context, C9758a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24758a = context;
        this.f24759b = aVar;
    }

    /* renamed from: b */
    public static final String m28589b(C9757d dVar) {
        dVar.getClass();
        return C9774g.f24793c;
    }

    /* renamed from: d */
    public static final C9784b m28591d(C9757d dVar) {
        return (C9784b) dVar.f24762e.getValue();
    }

    /* renamed from: a */
    public final void mo61330a() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24761d, (CoroutineContext) null, (CoroutineStart) null, new C9761d(this, (Continuation<? super C9761d>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo61331a(String str) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24761d, (CoroutineContext) null, (CoroutineStart) null, new C9760c(str, this, (Continuation<? super C9760c>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public final void mo61332a(JSONObject jSONObject) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24761d, (CoroutineContext) null, (CoroutineStart) null, new C9759b(this, jSONObject, (Continuation<? super C9759b>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public final Context mo61333b() {
        return this.f24758a;
    }

    /* renamed from: c */
    public final C9758a mo61334c() {
        return this.f24759b;
    }

    /* renamed from: d */
    public final boolean mo61335d() {
        return this.f24760c == 3;
    }

    /* renamed from: e */
    public final boolean mo61336e() {
        return this.f24760c == 2;
    }

    /* renamed from: f */
    public final boolean mo61337f() {
        return this.f24760c == 4;
    }

    /* renamed from: g */
    public final void mo61338g() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24761d, (CoroutineContext) null, (CoroutineStart) null, new C9762e(this, (Continuation<? super C9762e>) null), 3, (Object) null);
    }

    /* renamed from: h */
    public final void mo61339h() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this.f24761d, (CoroutineContext) null, (CoroutineStart) null, new C9763f(this, (Continuation<? super C9763f>) null), 3, (Object) null);
    }
}
