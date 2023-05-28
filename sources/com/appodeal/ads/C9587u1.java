package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.u1 */
public final class C9587u1 {

    /* renamed from: a */
    public final UnifiedAdCallbackClickTrackListener f24320a;

    public C9587u1(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        this.f24320a = unifiedAdCallbackClickTrackListener;
    }

    /* renamed from: a */
    public static final void m28328a(C9587u1 u1Var) {
        Intrinsics.checkNotNullParameter(u1Var, "this$0");
        UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener = u1Var.f24320a;
        if (unifiedAdCallbackClickTrackListener != null) {
            unifiedAdCallbackClickTrackListener.onTrackError();
        }
    }

    /* renamed from: a */
    public static final void m28329a(C9587u1 u1Var, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(u1Var, "this$0");
        UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener = u1Var.f24320a;
        if (unifiedAdCallbackClickTrackListener != null) {
            unifiedAdCallbackClickTrackListener.onTrackSuccess(jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo60863a() {
        C9212h5.f23153a.post(new Runnable() {
            public final void run() {
                C9587u1.m28328a(C9587u1.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo60864a(JSONObject jSONObject) {
        C9212h5.f23153a.post(new Runnable(jSONObject) {
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9587u1.m28329a(C9587u1.this, this.f$1);
            }
        });
    }
}
