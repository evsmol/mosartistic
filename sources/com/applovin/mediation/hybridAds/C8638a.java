package com.applovin.mediation.hybridAds;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C8021q;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.mediation.hybridAds.a */
public class C8638a extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private C8639a f21835a;

    /* renamed from: com.applovin.mediation.hybridAds.a$a */
    interface C8639a {
        /* renamed from: a */
        void mo58008a(C8638a aVar);
    }

    public C8638a(C8641c cVar, Context context) {
        super(context);
        setOnClickListener(this);
        C8021q qVar = new C8021q(context);
        int dpToPx = AppLovinSdkUtils.dpToPx(context, cVar.mo58014d());
        qVar.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, 17));
        qVar.mo55738a(dpToPx);
        addView(qVar);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(context, cVar.mo58014d() + (cVar.mo58015e() * 2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, 8388661);
        int dpToPx3 = AppLovinSdkUtils.dpToPx(context, cVar.mo58012b());
        int dpToPx4 = AppLovinSdkUtils.dpToPx(context, cVar.mo58013c());
        layoutParams.setMargins(dpToPx4, dpToPx3, dpToPx4, 0);
        setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        this.f21835a.mo58008a(this);
    }

    public void setListener(C8639a aVar) {
        this.f21835a = aVar;
    }
}
