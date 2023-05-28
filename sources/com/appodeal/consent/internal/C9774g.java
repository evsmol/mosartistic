package com.appodeal.consent.internal;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.consent.Consent;
import com.appodeal.consent.IConsentInfoUpdateListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.json.JSONObject;
import p150io.bidmachine.protobuf.EventTypeExtended;

/* renamed from: com.appodeal.consent.internal.g */
public final class C9774g {

    /* renamed from: a */
    public static final Lazy f24791a = LazyKt.lazy(C9775a.f24796a);

    /* renamed from: b */
    public static final CoroutineScope f24792b = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    /* renamed from: c */
    public static String f24793c = new String();

    /* renamed from: d */
    public static boolean f24794d;

    /* renamed from: e */
    public static Consent f24795e = new Consent((Consent.Status) null, (Consent.Zone) null, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, (DefaultConstructorMarker) null);

    /* renamed from: com.appodeal.consent.internal.g$a */
    public static final class C9775a extends Lambda implements Function0<C9780k> {

        /* renamed from: a */
        public static final C9775a f24796a = new C9775a();

        public C9775a() {
            super(0);
        }

        public final Object invoke() {
            return new C9780k();
        }
    }

    /* renamed from: a */
    public static final C9780k m28602a() {
        return (C9780k) f24791a.getValue();
    }

    /* renamed from: a */
    public static void m28603a(Context context, String str, IConsentInfoUpdateListener iConsentInfoUpdateListener, Consent consent, Consent.Status status, Consent.Zone zone) {
        Consent consent2;
        Consent consent3;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, Constants.APP_KEY);
        Intrinsics.checkNotNullParameter(iConsentInfoUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (consent != null) {
            consent2 = consent;
        } else {
            if (status == null || zone == null) {
                consent3 = C9752b.m28579a(Consent.Companion, context2);
                if (consent3 == null) {
                    consent3 = f24795e;
                }
            } else {
                consent3 = new Consent(status, zone, 0, (String) null, 0, 0, (JSONObject) null, (JSONObject) null, (List) null, 508, (DefaultConstructorMarker) null);
            }
            consent2 = consent3;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(f24792b, (CoroutineContext) null, (CoroutineStart) null, new C9768f(str, context, consent2, iConsentInfoUpdateListener, (Continuation<? super C9768f>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public static void m28604a(Consent consent) {
        Intrinsics.checkNotNullParameter(consent, "<set-?>");
        f24795e = consent;
    }

    /* renamed from: a */
    public static void m28605a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f24793c = str;
    }

    /* renamed from: a */
    public static void m28606a(boolean z) {
        f24794d = z;
    }

    /* renamed from: b */
    public static Consent m28607b() {
        return f24795e;
    }
}
