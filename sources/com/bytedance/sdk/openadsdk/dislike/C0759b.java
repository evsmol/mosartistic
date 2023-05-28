package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.C0761c;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.b */
/* compiled from: TTAdDislikeImpl */
public class C0759b implements TTAdDislike {

    /* renamed from: a */
    private final Context f2917a;

    /* renamed from: b */
    private C0477n f2918b;

    /* renamed from: c */
    private C0761c f2919c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTAdDislike.DislikeInteractionCallback f2920d;

    public C0759b(Context context, C0477n nVar) {
        if (!(context instanceof Activity)) {
            C10638l.m31234b("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.f2917a = context;
        this.f2918b = nVar;
        m3855a();
    }

    /* renamed from: a */
    private void m3855a() {
        C0761c cVar = new C0761c(this.f2917a, this.f2918b);
        this.f2919c = cVar;
        cVar.mo2526a((C0761c.C0767a) new C0761c.C0767a() {
            /* renamed from: a */
            public void mo2521a() {
                C10638l.m31235b("TTAdDislikeImpl", "onDislikeShow: ");
            }

            /* renamed from: a */
            public void mo2522a(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && C0759b.this.f2920d != null) {
                        C0759b.this.f2920d.onSelected(i, filterWord.getName());
                    }
                    C10638l.m31242e("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + String.valueOf(filterWord.getName()));
                } catch (Throwable th) {
                    C10638l.m31239c("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            /* renamed from: b */
            public void mo2523b() {
                C10638l.m31242e("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (C0759b.this.f2920d != null) {
                        C0759b.this.f2920d.onCancel();
                    }
                } catch (Throwable th) {
                    C10638l.m31239c("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            /* renamed from: c */
            public void mo2524c() {
                C10638l.m31242e("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }
        });
    }

    public void showDislikeDialog() {
        Context context = this.f2917a;
        if (((context instanceof Activity) && !((Activity) context).isFinishing()) && !this.f2919c.isShowing()) {
            this.f2919c.show();
        }
    }

    /* renamed from: a */
    public void mo2519a(C0477n nVar) {
        this.f2919c.mo2525a(nVar);
    }

    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f2920d = dislikeInteractionCallback;
    }

    /* renamed from: a */
    public void mo2520a(String str) {
        C0761c cVar = this.f2919c;
        if (cVar != null) {
            cVar.mo2527a(str);
        }
    }
}
