package com.criteo.publisher.p072m0;

import com.criteo.publisher.C1319p;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.CriteoInterstitial;
import com.criteo.publisher.CriteoInterstitialAdListener;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p068j0.C1155b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.m0.d */
/* compiled from: InterstitialListenerNotifier.kt */
public class C1217d {

    /* renamed from: a */
    private final C1195g f3810a;

    /* renamed from: b */
    private final CriteoInterstitial f3811b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Reference<CriteoInterstitialAdListener> f3812c;

    /* renamed from: d */
    private final C1076c f3813d;

    public C1217d(CriteoInterstitial criteoInterstitial, Reference<CriteoInterstitialAdListener> reference, C1076c cVar) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        Intrinsics.checkParameterIsNotNull(reference, "listenerRef");
        Intrinsics.checkParameterIsNotNull(cVar, "runOnUiThreadExecutor");
        this.f3811b = criteoInterstitial;
        this.f3812c = reference;
        this.f3813d = cVar;
        C1195g b = C1197h.m5407b(getClass());
        Intrinsics.checkExpressionValueIsNotNull(b, "LoggerFactory.getLogger(javaClass)");
        this.f3810a = b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1217d(CriteoInterstitial criteoInterstitial, CriteoInterstitialAdListener criteoInterstitialAdListener, C1076c cVar) {
        this(criteoInterstitial, (Reference<CriteoInterstitialAdListener>) new WeakReference(criteoInterstitialAdListener), cVar);
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        Intrinsics.checkParameterIsNotNull(cVar, "runOnUiThreadExecutor");
    }

    /* renamed from: com.criteo.publisher.m0.d$a */
    /* compiled from: InterstitialListenerNotifier.kt */
    public static final class C1218a extends C1330x {

        /* renamed from: c */
        final /* synthetic */ C1217d f3814c;

        /* renamed from: d */
        final /* synthetic */ C1319p f3815d;

        C1218a(C1217d dVar, C1319p pVar) {
            this.f3814c = dVar;
            this.f3815d = pVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            CriteoInterstitialAdListener criteoInterstitialAdListener = (CriteoInterstitialAdListener) this.f3814c.f3812c.get();
            if (criteoInterstitialAdListener != null) {
                this.f3814c.m5450a(criteoInterstitialAdListener, this.f3815d);
            }
        }
    }

    /* renamed from: a */
    public void mo3356a(C1319p pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "code");
        m5451a(this.f3810a, pVar);
        this.f3813d.mo3126a(new C1218a(this, pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5450a(CriteoInterstitialAdListener criteoInterstitialAdListener, C1319p pVar) {
        switch (C1216c.f3809a[pVar.ordinal()]) {
            case 1:
                criteoInterstitialAdListener.onAdReceived(this.f3811b);
                return;
            case 2:
                criteoInterstitialAdListener.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NO_FILL);
                return;
            case 3:
                criteoInterstitialAdListener.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NETWORK_ERROR);
                return;
            case 4:
                criteoInterstitialAdListener.onAdOpened();
                return;
            case 5:
                criteoInterstitialAdListener.onAdClosed();
                return;
            case 6:
                criteoInterstitialAdListener.onAdClicked();
                criteoInterstitialAdListener.onAdLeftApplication();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m5451a(C1195g gVar, C1319p pVar) {
        if (pVar == C1319p.VALID) {
            gVar.mo3337a(C1155b.m5294b(this.f3811b));
        } else if (pVar == C1319p.INVALID || pVar == C1319p.INVALID_CREATIVE) {
            gVar.mo3337a(C1155b.m5290a(this.f3811b));
        }
    }
}
