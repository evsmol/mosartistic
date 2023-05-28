package com.appodeal.consent.internal;

import android.content.Context;
import com.appodeal.consent.Consent;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.IConsentInfoUpdateListener;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1", mo38569f = "InternalManager.kt", mo38570l = {41, 51, 58, 62, 74, 79, 87}, mo38571m = "invokeSuspend")
/* renamed from: com.appodeal.consent.internal.f */
public final class C9768f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f24775a;

    /* renamed from: b */
    public Object f24776b;

    /* renamed from: c */
    public String f24777c;

    /* renamed from: d */
    public Consent f24778d;

    /* renamed from: e */
    public int f24779e;

    /* renamed from: f */
    public final /* synthetic */ String f24780f;

    /* renamed from: g */
    public final /* synthetic */ Context f24781g;

    /* renamed from: h */
    public final /* synthetic */ Consent f24782h;

    /* renamed from: i */
    public final /* synthetic */ IConsentInfoUpdateListener f24783i;

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$1", mo38569f = "InternalManager.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.f$a */
    public static final class C9769a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ IConsentInfoUpdateListener f24784a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9769a(IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super C9769a> continuation) {
            super(2, continuation);
            this.f24784a = iConsentInfoUpdateListener;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9769a(this.f24784a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9769a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24784a.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError("Appodeal APP KEY is empty"));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$2$1", mo38569f = "InternalManager.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.f$b */
    public static final class C9770b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ IConsentInfoUpdateListener f24785a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9770b(IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super C9770b> continuation) {
            super(2, continuation);
            this.f24785a = iConsentInfoUpdateListener;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9770b(this.f24785a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9770b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f24785a.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError("response is error"));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$2$3", mo38569f = "InternalManager.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.f$c */
    public static final class C9771c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ IConsentInfoUpdateListener f24786a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9771c(IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super C9771c> continuation) {
            super(2, continuation);
            this.f24786a = iConsentInfoUpdateListener;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9771c(this.f24786a, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9771c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IConsentInfoUpdateListener iConsentInfoUpdateListener = this.f24786a;
            Lazy lazy = C9774g.f24791a;
            iConsentInfoUpdateListener.onConsentInfoUpdated(C9774g.m28607b());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$2$4", mo38569f = "InternalManager.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.f$d */
    public static final class C9772d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ IConsentInfoUpdateListener f24787a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f24788b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9772d(IConsentInfoUpdateListener iConsentInfoUpdateListener, Throwable th, Continuation<? super C9772d> continuation) {
            super(2, continuation);
            this.f24787a = iConsentInfoUpdateListener;
            this.f24788b = th;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9772d(this.f24787a, this.f24788b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9772d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IConsentInfoUpdateListener iConsentInfoUpdateListener = this.f24787a;
            String message = this.f24788b.getMessage();
            if (message == null) {
                message = "";
            }
            iConsentInfoUpdateListener.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError(message));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(mo38568c = "com.appodeal.consent.internal.InternalManager$requestConsentInfoUpdate$1$3$1", mo38569f = "InternalManager.kt", mo38570l = {}, mo38571m = "invokeSuspend")
    /* renamed from: com.appodeal.consent.internal.f$e */
    public static final class C9773e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public final /* synthetic */ IConsentInfoUpdateListener f24789a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f24790b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9773e(IConsentInfoUpdateListener iConsentInfoUpdateListener, Throwable th, Continuation<? super C9773e> continuation) {
            super(2, continuation);
            this.f24789a = iConsentInfoUpdateListener;
            this.f24790b = th;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C9773e(this.f24789a, this.f24790b, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C9773e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IConsentInfoUpdateListener iConsentInfoUpdateListener = this.f24789a;
            String message = this.f24790b.getMessage();
            if (message == null) {
                message = "";
            }
            iConsentInfoUpdateListener.onFailedToUpdateConsentInfo(new ConsentManagerError.LoadingError(message));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9768f(String str, Context context, Consent consent, IConsentInfoUpdateListener iConsentInfoUpdateListener, Continuation<? super C9768f> continuation) {
        super(2, continuation);
        this.f24780f = str;
        this.f24781g = context;
        this.f24782h = consent;
        this.f24783i = iConsentInfoUpdateListener;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9768f(this.f24780f, this.f24781g, this.f24782h, this.f24783i, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C9768f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r13 = r1;
        r1 = r15;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r8 = com.appodeal.consent.ConsentManager.getExtraData();
        r9 = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "MODEL");
        r10 = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, "MANUFACTURER");
        r11 = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "RELEASE");
        r12 = java.util.Locale.getDefault().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, "getDefault().toString()");
        r3 = new com.appodeal.consent.internal.C9749a(r4, r5, r6, (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r15, r8, r9, r10, r11, r12);
        r3 = com.appodeal.consent.internal.C9753c.f24749a;
        r14.f24775a = r1;
        r14.f24776b = null;
        r14.f24777c = null;
        r14.f24778d = null;
        r14.f24779e = 3;
        r15 = com.appodeal.consent.internal.C9753c.f24749a.mo61329a(r3, "https://a.appbaqend.com/consent/check", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e2, code lost:
        if (r15 != r0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        r3 = r14.f24783i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        if (kotlin.Result.m31667isSuccessimpl(r1) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        r4 = (org.json.JSONObject) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f0, code lost:
        if (r4 != null) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r15 = kotlinx.coroutines.Dispatchers.getMain();
        r4 = new com.appodeal.consent.internal.C9768f.C9770b(r3, (kotlin.coroutines.Continuation<? super com.appodeal.consent.internal.C9768f.C9770b>) null);
        r14.f24775a = r1;
        r14.f24776b = r3;
        r14.f24779e = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14) != r0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r5 = com.appodeal.consent.internal.C9774g.f24791a;
        com.appodeal.consent.internal.C9774g.m28602a().getClass();
        r4 = com.appodeal.consent.internal.C9780k.m28609a(r4);
        r5 = r4.mo61340a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011a, code lost:
        if (r5 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        com.appodeal.consent.internal.C9774g.m28604a(r5);
        com.appodeal.consent.internal.C9752b.m28580a(com.appodeal.consent.internal.C9774g.m28607b(), r15);
        com.appodeal.consent.internal.C9752b.m28581b(com.appodeal.consent.internal.C9774g.m28607b(), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        r15 = r4.mo61341b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        if (r15 != null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0134, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0136, code lost:
        com.appodeal.consent.internal.C9774g.m28605a(r15);
        r15 = r4.mo61342c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013d, code lost:
        if (r15 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013f, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0141, code lost:
        r15 = r15.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0145, code lost:
        com.appodeal.consent.internal.C9774g.m28606a(r15);
        r15 = kotlinx.coroutines.Dispatchers.getMain();
        r4 = new com.appodeal.consent.internal.C9768f.C9771c(r3, (kotlin.coroutines.Continuation<? super com.appodeal.consent.internal.C9768f.C9771c>) null);
        r14.f24775a = r1;
        r14.f24776b = r3;
        r14.f24779e = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015c, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14) != r0) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x015f, code lost:
        r15 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0176 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f24779e
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0055;
                case 2: goto L_0x0042;
                case 3: goto L_0x0030;
                case 4: goto L_0x001e;
                case 5: goto L_0x001e;
                case 6: goto L_0x0017;
                case 7: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0012:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0197
        L_0x0017:
            java.lang.Object r1 = r14.f24775a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0177
        L_0x001e:
            java.lang.Object r1 = r14.f24776b
            com.appodeal.consent.IConsentInfoUpdateListener r1 = (com.appodeal.consent.IConsentInfoUpdateListener) r1
            java.lang.Object r3 = r14.f24775a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x002a }
            r1 = r3
            goto L_0x0177
        L_0x002a:
            r15 = move-exception
            r13 = r3
            r3 = r1
            r1 = r13
            goto L_0x0160
        L_0x0030:
            java.lang.Object r1 = r14.f24775a
            android.content.Context r1 = (android.content.Context) r1
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.m31669unboximpl()
        L_0x003d:
            r13 = r1
            r1 = r15
            r15 = r13
            goto L_0x00e5
        L_0x0042:
            com.appodeal.consent.Consent r1 = r14.f24778d
            java.lang.String r3 = r14.f24777c
            java.lang.Object r4 = r14.f24776b
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r14.f24775a
            android.content.Context r5 = (android.content.Context) r5
            kotlin.ResultKt.throwOnFailure(r15)
            r6 = r1
            r1 = r5
            r5 = r3
            goto L_0x00a2
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0079
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = r14.f24780f
            boolean r15 = kotlin.text.StringsKt.isBlank(r15)
            if (r15 == 0) goto L_0x007c
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()
            com.appodeal.consent.internal.f$a r1 = new com.appodeal.consent.internal.f$a
            com.appodeal.consent.IConsentInfoUpdateListener r3 = r14.f24783i
            r1.<init>(r3, r2)
            r2 = 1
            r14.f24779e = r2
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r1, r14)
            if (r15 != r0) goto L_0x0079
            return r0
        L_0x0079:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x007c:
            android.content.Context r15 = r14.f24781g
            android.content.Context r4 = r15.getApplicationContext()
            java.lang.String r15 = "context.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r15)
            java.lang.String r3 = r14.f24780f
            com.appodeal.consent.Consent r1 = r14.f24782h
            com.appodeal.advertising.AdvertisingInfo r15 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            r14.f24775a = r4
            r14.f24776b = r4
            r14.f24777c = r3
            r14.f24778d = r1
            r5 = 2
            r14.f24779e = r5
            java.lang.Object r15 = r15.getAdvertisingProfile(r4, r14)
            if (r15 != r0) goto L_0x009f
            return r0
        L_0x009f:
            r6 = r1
            r5 = r3
            r1 = r4
        L_0x00a2:
            r7 = r15
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r7 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r7
            java.util.Map r8 = com.appodeal.consent.ConsentManager.getExtraData()
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r15 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r15)
            java.lang.String r10 = android.os.Build.MANUFACTURER
            java.lang.String r15 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r15)
            java.lang.String r11 = android.os.Build.VERSION.RELEASE
            java.lang.String r15 = "RELEASE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
            java.util.Locale r15 = java.util.Locale.getDefault()
            java.lang.String r12 = r15.toString()
            java.lang.String r15 = "getDefault().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r15)
            com.appodeal.consent.internal.a r15 = new com.appodeal.consent.internal.a
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.appodeal.consent.internal.c r3 = com.appodeal.consent.internal.C9753c.f24749a
            r14.f24775a = r1
            r14.f24776b = r2
            r14.f24777c = r2
            r14.f24778d = r2
            r3 = 3
            r14.f24779e = r3
            java.lang.Object r15 = com.appodeal.consent.internal.C9753c.f24749a.mo61329a(r15, "https://a.appbaqend.com/consent/check", r14)
            if (r15 != r0) goto L_0x003d
            return r0
        L_0x00e5:
            com.appodeal.consent.IConsentInfoUpdateListener r3 = r14.f24783i
            boolean r4 = kotlin.Result.m31667isSuccessimpl(r1)
            if (r4 == 0) goto L_0x0177
            r4 = r1
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 != 0) goto L_0x0109
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.f$b r4 = new com.appodeal.consent.internal.f$b     // Catch:{ all -> 0x015f }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x015f }
            r14.f24775a = r1     // Catch:{ all -> 0x015f }
            r14.f24776b = r3     // Catch:{ all -> 0x015f }
            r5 = 4
            r14.f24779e = r5     // Catch:{ all -> 0x015f }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14)     // Catch:{ all -> 0x015f }
            if (r15 != r0) goto L_0x0177
            return r0
        L_0x0109:
            kotlin.Lazy r5 = com.appodeal.consent.internal.C9774g.f24791a     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.k r5 = com.appodeal.consent.internal.C9774g.m28602a()     // Catch:{ all -> 0x015f }
            r5.getClass()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.k$a r4 = com.appodeal.consent.internal.C9780k.m28609a(r4)     // Catch:{ all -> 0x015f }
            com.appodeal.consent.Consent r5 = r4.mo61340a()     // Catch:{ all -> 0x015f }
            if (r5 != 0) goto L_0x011d
            goto L_0x012e
        L_0x011d:
            com.appodeal.consent.internal.C9774g.m28604a((com.appodeal.consent.Consent) r5)     // Catch:{ all -> 0x015f }
            com.appodeal.consent.Consent r5 = com.appodeal.consent.internal.C9774g.m28607b()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.C9752b.m28580a((com.appodeal.consent.Consent) r5, (android.content.Context) r15)     // Catch:{ all -> 0x015f }
            com.appodeal.consent.Consent r5 = com.appodeal.consent.internal.C9774g.m28607b()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.C9752b.m28581b(r5, r15)     // Catch:{ all -> 0x015f }
        L_0x012e:
            java.lang.String r15 = r4.mo61341b()     // Catch:{ all -> 0x015f }
            if (r15 != 0) goto L_0x0136
            java.lang.String r15 = ""
        L_0x0136:
            com.appodeal.consent.internal.C9774g.m28605a((java.lang.String) r15)     // Catch:{ all -> 0x015f }
            java.lang.Boolean r15 = r4.mo61342c()     // Catch:{ all -> 0x015f }
            if (r15 != 0) goto L_0x0141
            r15 = 0
            goto L_0x0145
        L_0x0141:
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x015f }
        L_0x0145:
            com.appodeal.consent.internal.C9774g.m28606a((boolean) r15)     // Catch:{ all -> 0x015f }
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ all -> 0x015f }
            com.appodeal.consent.internal.f$c r4 = new com.appodeal.consent.internal.f$c     // Catch:{ all -> 0x015f }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x015f }
            r14.f24775a = r1     // Catch:{ all -> 0x015f }
            r14.f24776b = r3     // Catch:{ all -> 0x015f }
            r5 = 5
            r14.f24779e = r5     // Catch:{ all -> 0x015f }
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r4, r14)     // Catch:{ all -> 0x015f }
            if (r15 != r0) goto L_0x0177
            return r0
        L_0x015f:
            r15 = move-exception
        L_0x0160:
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            com.appodeal.consent.internal.f$d r5 = new com.appodeal.consent.internal.f$d
            r5.<init>(r3, r15, r2)
            r14.f24775a = r1
            r14.f24776b = r2
            r15 = 6
            r14.f24779e = r15
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r14)
            if (r15 != r0) goto L_0x0177
            return r0
        L_0x0177:
            com.appodeal.consent.IConsentInfoUpdateListener r15 = r14.f24783i
            java.lang.Throwable r3 = kotlin.Result.m31664exceptionOrNullimpl(r1)
            if (r3 != 0) goto L_0x0180
            goto L_0x0197
        L_0x0180:
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            com.appodeal.consent.internal.f$e r5 = new com.appodeal.consent.internal.f$e
            r5.<init>(r15, r3, r2)
            r14.f24775a = r1
            r14.f24776b = r2
            r15 = 7
            r14.f24779e = r15
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r14)
            if (r15 != r0) goto L_0x0197
            return r0
        L_0x0197:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.internal.C9768f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
