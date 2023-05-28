package com.bytedance.sdk.openadsdk.core.p016b;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p026j.C0518a;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.g */
/* compiled from: VastClickListenerWrapper */
public abstract class C0413g extends C0408c {

    /* renamed from: a */
    private final String f1392a;

    /* renamed from: b */
    private final C0518a f1393b;

    /* renamed from: c */
    private C0408c f1394c;

    /* renamed from: a */
    public abstract void mo827a();

    public C0413g(String str, C0518a aVar) {
        this(str, aVar, (C0408c) null);
    }

    public C0413g(String str, C0518a aVar, C0408c cVar) {
        this.f1392a = str;
        this.f1393b = aVar;
        this.f1394c = cVar;
    }

    /* renamed from: a */
    public void mo1122a(C0408c cVar) {
        this.f1394c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
        View view2 = view;
        C0518a aVar = this.f1393b;
        if (aVar != null) {
            aVar.mo1739e(this.f1392a);
        }
        if (view2 != null) {
            if (view.getId() == C10647t.m31283e(view.getContext(), "tt_reward_ad_appname")) {
                view.setTag("VAST_TITLE");
            } else if (view.getId() == C10647t.m31283e(view.getContext(), "tt_reward_ad_description")) {
                view.setTag("VAST_DESCRIPTION");
            } else {
                view.setTag(this.f1392a);
            }
        }
        C0408c cVar = this.f1394c;
        if (cVar != null) {
            cVar.f1365w = this.f1365w;
            this.f1394c.f1366x = this.f1366x;
            this.f1394c.f1367y = this.f1367y;
            this.f1394c.f1368z = this.f1367y;
            this.f1394c.f1355A = this.f1367y;
            this.f1394c.mo106a(view, f, f2, f3, f4, sparseArray, z);
        }
        mo827a();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
