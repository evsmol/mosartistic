package com.bytedance.sdk.openadsdk.p046i;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.openadsdk.core.C0492g;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.explorestack.protobuf.openrtb.LossReason;

/* renamed from: com.bytedance.sdk.openadsdk.i.b */
/* compiled from: StatsImageListener */
public class C0833b implements C10565n<Bitmap> {

    /* renamed from: a */
    private boolean f3044a;

    /* renamed from: b */
    private C0795b f3045b;

    /* renamed from: a */
    public void mo2645a(String str) {
        C0795b bVar;
        if (this.f3044a && (bVar = this.f3045b) != null) {
            bVar.mo2582c(str);
        }
    }

    /* renamed from: a */
    public void mo2644a(int i) {
        C0795b bVar;
        if (this.f3044a && (bVar = this.f3045b) != null) {
            bVar.mo2577a(i);
        }
    }

    /* renamed from: b */
    public void mo2646b(String str) {
        C0795b bVar;
        if (this.f3044a && (bVar = this.f3045b) != null) {
            bVar.mo2586e(str);
        }
    }

    /* renamed from: c */
    public void mo2647c(String str) {
        C0795b bVar;
        if (this.f3044a && (bVar = this.f3045b) != null) {
            bVar.mo2584d(str);
        }
    }

    /* renamed from: d */
    public void mo2648d(String str) {
        C0795b bVar;
        if (this.f3044a && (bVar = this.f3045b) != null) {
            bVar.mo2590g(str);
        }
    }

    public C0833b(boolean z) {
        this.f3044a = z;
        if (z) {
            this.f3045b = C0795b.m3955b();
        }
    }

    /* renamed from: a */
    public void mo257a(C10561j<Bitmap> jVar) {
        if (this.f3044a && this.f3045b != null) {
            if (jVar == null || jVar.mo64116b() == null) {
                this.f3045b.mo2580b((int) LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE).mo2588f(C0492g.m2254a(LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE));
                C0796b.m3985a().mo2615e(this.f3045b);
            }
        }
    }

    /* renamed from: a */
    public void mo256a(int i, String str, Throwable th) {
        C0795b bVar;
        if (this.f3044a && (bVar = this.f3045b) != null) {
            bVar.mo2580b(201).mo2588f(C0492g.m2254a(201));
            C0796b.m3985a().mo2615e(this.f3045b);
        }
    }
}
