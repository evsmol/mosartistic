package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;

public class MaxHybridMRecAdActivity extends C8640b {

    /* renamed from: c */
    private View f21831c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58002a(C8072c cVar, View view, C8490n nVar, MaxAdapterListener maxAdapterListener) {
        super.mo58009a(cVar, nVar, maxAdapterListener);
        this.f21831c = view;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(16908290)).addView(this.f21831c);
        this.f21836a.bringToFront();
    }
}
