package com.applovin.impl.adview.activity.p231a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C8008m;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8350e;

/* renamed from: com.applovin.impl.adview.activity.a.b */
public class C7898b extends C7897a {
    public C7898b(C8350e eVar, Activity activity, C8490n nVar) {
        super(eVar, activity, nVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55525a(View view) {
        super.mo55525a(view);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55526a(C8008m mVar) {
        super.mo55526a(mVar);
    }

    /* renamed from: a */
    public void mo55528a(C8008m mVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f19063d.addView(appLovinAdView);
        if (mVar != null) {
            mo55527a(this.f19062c.mo56966X(), (this.f19062c.mo56987ab() ? 3 : 5) | 48, mVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f19063d);
        } else {
            this.f19061b.setContentView(this.f19063d);
        }
    }
}
