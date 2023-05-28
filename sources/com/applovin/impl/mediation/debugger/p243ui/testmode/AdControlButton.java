package com.applovin.impl.mediation.debugger.p243ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C7888a;
import com.applovin.impl.sdk.utils.C8570g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C8656R;
import com.appodeal.ads.modules.common.internal.LogConstants;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a */
    private final Button f20176a;

    /* renamed from: b */
    private final C7888a f20177b;

    /* renamed from: c */
    private C8228b f20178c;

    /* renamed from: d */
    private MaxAdFormat f20179d;

    /* renamed from: e */
    private C8227a f20180e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    public interface C8227a {
        void onClick(AdControlButton adControlButton);
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    public enum C8228b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20176a = new Button(getContext());
        this.f20177b = new C7888a(getContext(), 20, 16842873);
        this.f20178c = C8228b.LOAD;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f20176a.setTextColor(-1);
        this.f20176a.setOnClickListener(this);
        frameLayout.addView(this.f20176a, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f20177b.setColor(-1);
        addView(this.f20177b, new FrameLayout.LayoutParams(-1, -1, 17));
        m24723a(C8228b.LOAD);
    }

    /* renamed from: a */
    private void m24723a(C8228b bVar) {
        if (C8228b.LOADING == bVar) {
            setEnabled(false);
            this.f20177b.mo55509a();
        } else {
            setEnabled(true);
            this.f20177b.mo55510b();
        }
        this.f20176a.setText(m24724b(bVar));
        this.f20176a.setBackgroundColor(m24725c(bVar));
    }

    /* renamed from: b */
    private String m24724b(C8228b bVar) {
        return C8228b.LOAD == bVar ? "Load" : C8228b.LOADING == bVar ? "" : LogConstants.EVENT_SHOW;
    }

    /* renamed from: c */
    private int m24725c(C8228b bVar) {
        return C8570g.m26080a((C8228b.LOAD == bVar || C8228b.LOADING == bVar) ? C8656R.C8658color.applovin_sdk_brand_color : C8656R.C8658color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public C8228b getControlState() {
        return this.f20178c;
    }

    public MaxAdFormat getFormat() {
        return this.f20179d;
    }

    public void onClick(View view) {
        C8227a aVar = this.f20180e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(C8228b bVar) {
        if (this.f20178c != bVar) {
            m24723a(bVar);
        }
        this.f20178c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f20179d = maxAdFormat;
    }

    public void setOnClickListener(C8227a aVar) {
        this.f20180e = aVar;
    }
}
