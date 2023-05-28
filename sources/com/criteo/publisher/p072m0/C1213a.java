package com.criteo.publisher.p072m0;

import com.criteo.publisher.C1052b;
import com.criteo.publisher.C1319p;
import com.criteo.publisher.CriteoBannerAdListener;
import com.criteo.publisher.CriteoBannerView;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import java.lang.ref.Reference;

/* renamed from: com.criteo.publisher.m0.a */
/* compiled from: CriteoBannerListenerCallTask */
public class C1213a implements Runnable {

    /* renamed from: a */
    private final C1195g f3800a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final CriteoBannerAdListener f3801b;

    /* renamed from: c */
    private final Reference<CriteoBannerView> f3802c;

    /* renamed from: d */
    private final C1319p f3803d;

    public C1213a(CriteoBannerAdListener criteoBannerAdListener, Reference<CriteoBannerView> reference, C1319p pVar) {
        this.f3801b = criteoBannerAdListener;
        this.f3802c = reference;
        this.f3803d = pVar;
    }

    public void run() {
        CriteoBannerView criteoBannerView = this.f3802c.get();
        C1319p pVar = this.f3803d;
        if (pVar == C1319p.INVALID) {
            this.f3800a.mo3337a(C1052b.m4923a(criteoBannerView));
        } else if (pVar == C1319p.VALID) {
            this.f3800a.mo3337a(C1052b.m4926b(criteoBannerView));
        }
        if (this.f3801b != null && criteoBannerView != null) {
            int i = C1214a.f3804a[this.f3803d.ordinal()];
            if (i == 1) {
                this.f3801b.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NO_FILL);
            } else if (i == 2) {
                this.f3801b.onAdReceived(criteoBannerView);
            } else if (i == 3) {
                this.f3801b.onAdClicked();
                this.f3801b.onAdLeftApplication();
            }
        }
    }

    /* renamed from: com.criteo.publisher.m0.a$a */
    /* compiled from: CriteoBannerListenerCallTask */
    static /* synthetic */ class C1214a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3804a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.criteo.publisher.p[] r0 = com.criteo.publisher.C1319p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3804a = r0
                com.criteo.publisher.p r1 = com.criteo.publisher.C1319p.INVALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3804a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.p r1 = com.criteo.publisher.C1319p.VALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3804a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.criteo.publisher.p r1 = com.criteo.publisher.C1319p.CLICK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.p072m0.C1213a.C1214a.<clinit>():void");
        }
    }
}
