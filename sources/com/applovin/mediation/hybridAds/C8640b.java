package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.C8619r;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.C8638a;

/* renamed from: com.applovin.mediation.hybridAds.b */
public class C8640b extends Activity implements C8638a.C8639a {

    /* renamed from: a */
    protected C8638a f21836a;

    /* renamed from: b */
    protected C8641c f21837b;

    /* renamed from: c */
    private C8490n f21838c;

    /* renamed from: d */
    private MaxAdapterListener f21839d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58009a(C8072c cVar, C8490n nVar, MaxAdapterListener maxAdapterListener) {
        this.f21838c = nVar;
        this.f21839d = maxAdapterListener;
        this.f21837b = cVar.mo56094n();
    }

    /* renamed from: a */
    public void mo58008a(C8638a aVar) {
        if (!isFinishing()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        viewGroup.setBackgroundColor(this.f21837b.mo58011a());
        C8562b.m26057a(((Boolean) this.f21838c.mo57342a(C8380b.f20815cL)).booleanValue(), this);
        C8638a aVar = new C8638a(this.f21837b, this);
        this.f21836a = aVar;
        aVar.setListener(this);
        this.f21836a.setVisibility(4);
        viewGroup.addView(this.f21836a);
        C8619r.m26222a((View) this.f21836a, this.f21837b.mo58016f());
        MaxAdapterListener maxAdapterListener = this.f21839d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayed();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayed();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAdapterListener maxAdapterListener = this.f21839d;
        if (maxAdapterListener != null) {
            if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
                ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdHidden();
            } else if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdHidden();
            }
        }
        super.onDestroy();
    }
}
