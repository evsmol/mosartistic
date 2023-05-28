package com.appodeal.ads;

import android.animation.Animator;
import android.view.View;
import com.appodeal.ads.utils.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.appodeal.ads.v5 */
public final class C9681v5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9577u f24508a;

    /* renamed from: b */
    public final /* synthetic */ C9710x5 f24509b;

    public C9681v5(C9710x5 x5Var, C9008a6 a6Var) {
        this.f24509b = x5Var;
        this.f24508a = a6Var;
    }

    public final void run() {
        AdObjectType adobjecttype;
        UnifiedAdType unifiedadtype;
        try {
            C9710x5 x5Var = this.f24509b;
            View view = x5Var.f24585c;
            if (view == null) {
                Log.debug(x5Var.f24583a, "UnRender", "skip: no current ad view");
                return;
            }
            C9710x5<AdRequestType, AdObjectType>.c cVar = x5Var.f24591i;
            if (cVar != null) {
                C9710x5.f24582m.removeCallbacks(cVar);
                this.f24509b.f24591i = null;
            }
            C9737z5 z5Var = (C9737z5) this.f24508a.f24307y;
            if (!(z5Var == null || (adobjecttype = z5Var.f23904s) == null || (unifiedadtype = ((C9430r5) adobjecttype).f23272f) == null)) {
                unifiedadtype.onHide();
            }
            view.setVisibility(8);
            WeakReference<Animator> weakReference = this.f24509b.f24590h;
            if (!(weakReference == null || weakReference.get() == null)) {
                weakReference.get().cancel();
            }
            this.f24509b.getClass();
            C9710x5.m28527a(view, true, true);
        } catch (Exception e) {
            Log.log(e);
        }
    }
}
