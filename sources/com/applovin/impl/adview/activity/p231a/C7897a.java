package com.applovin.impl.adview.activity.p231a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C8008m;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8350e;

/* renamed from: com.applovin.impl.adview.activity.a.a */
abstract class C7897a {

    /* renamed from: a */
    final C8490n f19060a;

    /* renamed from: b */
    final Activity f19061b;

    /* renamed from: c */
    final C8350e f19062c;

    /* renamed from: d */
    final ViewGroup f19063d;

    /* renamed from: e */
    final FrameLayout.LayoutParams f19064e = new FrameLayout.LayoutParams(-1, -1, 17);

    C7897a(C8350e eVar, Activity activity, C8490n nVar) {
        this.f19062c = eVar;
        this.f19060a = nVar;
        this.f19061b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f19063d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f19063d.setLayoutParams(this.f19064e);
    }

    /* renamed from: a */
    public void mo55525a(View view) {
        this.f19063d.removeView(view);
    }

    /* renamed from: a */
    public void mo55526a(C8008m mVar) {
        if (mVar != null && mVar.getParent() == null) {
            mo55527a(this.f19062c.mo56966X(), (this.f19062c.mo56987ab() ? 3 : 5) | 48, mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55527a(C8350e.C8354c cVar, int i, C8008m mVar) {
        mVar.mo55765a(cVar.f20586a, cVar.f20590e, cVar.f20589d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        layoutParams.setMargins(cVar.f20588c, cVar.f20587b, cVar.f20588c, 0);
        layoutParams.gravity = i;
        this.f19063d.addView(mVar, layoutParams);
    }
}
