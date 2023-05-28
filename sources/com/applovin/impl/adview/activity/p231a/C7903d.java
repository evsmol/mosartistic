package com.applovin.impl.adview.activity.p231a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C7888a;
import com.applovin.impl.adview.C8008m;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.a.d */
public class C7903d extends C7897a {
    public C7903d(C8350e eVar, Activity activity, C8490n nVar) {
        super(eVar, activity, nVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55525a(View view) {
        super.mo55525a(view);
    }

    /* renamed from: a */
    public void mo55534a(ImageView imageView, C8008m mVar, C8008m mVar2, C7888a aVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f19063d.addView(appLovinAdView);
        int i = 3;
        if (mVar != null) {
            mo55527a(this.f19062c.mo56966X(), (this.f19062c.mo56988ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            if (!this.f19062c.mo56987ab()) {
                i = 5;
            }
            mo55527a(this.f19062c.mo56966X(), i | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f19061b, ((Integer) this.f19060a.mo57342a(C8380b.f20807cD)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f19060a.mo57342a(C8380b.f20809cF)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f19061b, ((Integer) this.f19060a.mo57342a(C8380b.f20808cE)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f19063d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f19063d.addView(aVar, this.f19064e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f19063d);
        } else {
            this.f19061b.setContentView(this.f19063d);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55526a(C8008m mVar) {
        super.mo55526a(mVar);
    }
}
