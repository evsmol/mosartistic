package com.appodeal.ads;

import android.view.View;

/* renamed from: com.appodeal.ads.e2 */
public final class C9175e2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9195g2 f23027a;

    public C9175e2(C9195g2 g2Var) {
        this.f23027a = g2Var;
    }

    public final void onClick(View view) {
        C9195g2 g2Var;
        boolean z;
        if (this.f23027a.mo59954c()) {
            C9195g2 g2Var2 = this.f23027a;
            if (g2Var2.f23110l) {
                g2Var2.f23105g.setVolume(1.0f, 1.0f);
                g2Var = this.f23027a;
                z = false;
            } else {
                g2Var2.f23105g.setVolume(0.0f, 0.0f);
                g2Var = this.f23027a;
                z = true;
            }
            g2Var.f23110l = z;
            this.f23027a.mo59958g();
        }
    }
}
