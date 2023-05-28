package com.appodeal.ads;

import com.appodeal.ads.C9258l;
import com.appodeal.ads.C9313n;
import com.appodeal.ads.context.C9148b;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import org.json.JSONException;

/* renamed from: com.appodeal.ads.k */
public final class C9236k implements NetworkInitializationListener {

    /* renamed from: a */
    public final /* synthetic */ C9258l.C9259a f23196a;

    /* renamed from: b */
    public final /* synthetic */ C9420r f23197b;

    /* renamed from: c */
    public final /* synthetic */ int f23198c;

    /* renamed from: d */
    public final /* synthetic */ ContextProvider f23199d;

    /* renamed from: e */
    public final /* synthetic */ C9258l f23200e;

    public C9236k(C9258l lVar, C9313n.C9314a aVar, C9420r rVar, int i, C9148b bVar) {
        this.f23200e = lVar;
        this.f23196a = aVar;
        this.f23197b = rVar;
        this.f23198c = i;
        this.f23199d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27394a(ContextProvider contextProvider, Object obj, C9258l.C9259a aVar, C9420r rVar) {
        LoadingError loadingError;
        try {
            C9258l lVar = this.f23200e;
            lVar.mo60097a(contextProvider, lVar.f23273g, obj, lVar.f23274h, lVar.f23272f);
        } catch (Throwable th) {
            C9376o oVar = C9313n.this.f23545a;
            oVar.getClass();
            Log.log(th);
            if (th instanceof JSONException) {
                loadingError = LoadingError.IncorrectAdunit;
            } else {
                loadingError = LoadingError.InternalError;
            }
            C9673v vVar = (C9673v) oVar;
            vVar.f24498f.f24286d.mo59838a(vVar.f24497e, vVar.f24496d, loadingError);
        }
    }

    public final void onInitializationFailed(LoadingError loadingError) {
        C9212h5.f23153a.post(new Runnable(this.f23197b, loadingError) {
            public final /* synthetic */ C9420r f$1;
            public final /* synthetic */ LoadingError f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ((C9313n.C9314a) C9258l.C9259a.this).mo60322a(this.f$2);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.appodeal.ads.-$$Lambda$hNZW9Cm-0R-P1uYA39rp72crKxA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializationFinished(java.lang.Object r9) {
        /*
            r8 = this;
            com.appodeal.ads.l r0 = r8.f23200e
            com.appodeal.ads.f5 r0 = r0.f23269c
            com.appodeal.ads.e0 r0 = r0.getRequestResult()
            if (r0 != 0) goto L_0x0047
            com.appodeal.ads.l r0 = r8.f23200e
            com.appodeal.ads.AdNetwork r1 = r0.f23268b
            com.appodeal.ads.unified.UnifiedAd r1 = r0.mo60071a((com.appodeal.ads.AdNetwork) r1)
            r0.f23272f = r1
            com.appodeal.ads.l r0 = r8.f23200e
            UnifiedAdType r1 = r0.f23272f
            if (r1 != 0) goto L_0x0024
            com.appodeal.ads.l$a r9 = r8.f23196a
            com.appodeal.ads.r r0 = r8.f23197b
            com.appodeal.ads.-$$Lambda$hNZW9Cm-0R-P1uYA39rp72crKxA r1 = new com.appodeal.ads.-$$Lambda$hNZW9Cm-0R-P1uYA39rp72crKxA
            r1.<init>(r0)
            goto L_0x0042
        L_0x0024:
            int r1 = r8.f23198c
            com.appodeal.ads.unified.UnifiedAdParams r1 = r0.mo60072a((int) r1)
            r0.f23273g = r1
            com.appodeal.ads.l r0 = r8.f23200e
            com.appodeal.ads.unified.UnifiedAdCallback r1 = r0.mo60074c()
            r0.f23274h = r1
            com.appodeal.ads.modules.common.internal.context.ContextProvider r4 = r8.f23199d
            com.appodeal.ads.l$a r6 = r8.f23196a
            com.appodeal.ads.r r7 = r8.f23197b
            com.appodeal.ads.-$$Lambda$k$IGDzlYiHrW42cqd6Y0LycZUCYbk r1 = new com.appodeal.ads.-$$Lambda$k$IGDzlYiHrW42cqd6Y0LycZUCYbk
            r2 = r1
            r3 = r8
            r5 = r9
            r2.<init>(r4, r5, r6, r7)
        L_0x0042:
            android.os.Handler r9 = com.appodeal.ads.C9212h5.f23153a
            r9.post(r1)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.C9236k.onInitializationFinished(java.lang.Object):void");
    }
}
