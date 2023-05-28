package com.applovin.impl.mediation.debugger.p243ui.p248d;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.b */
public class C8213b {

    /* renamed from: a */
    public TextView f20115a;

    /* renamed from: b */
    public TextView f20116b;

    /* renamed from: c */
    public ImageView f20117c;

    /* renamed from: d */
    public ImageView f20118d;

    /* renamed from: e */
    private C8214c f20119e;

    /* renamed from: f */
    private int f20120f;

    /* renamed from: a */
    public int mo56472a() {
        return this.f20120f;
    }

    /* renamed from: a */
    public void mo56473a(int i) {
        this.f20120f = i;
    }

    /* renamed from: a */
    public void mo56474a(C8214c cVar) {
        this.f20119e = cVar;
        this.f20115a.setText(cVar.mo56478k());
        this.f20115a.setTextColor(cVar.mo56481n());
        if (this.f20116b != null) {
            if (!TextUtils.isEmpty(cVar.mo56445i_())) {
                this.f20116b.setTypeface((Typeface) null, 0);
                this.f20116b.setVisibility(0);
                this.f20116b.setText(cVar.mo56445i_());
                this.f20116b.setTextColor(cVar.mo56424e());
                if (cVar.mo56446j_()) {
                    this.f20116b.setTypeface((Typeface) null, 1);
                }
            } else {
                this.f20116b.setVisibility(8);
            }
        }
        if (this.f20117c != null) {
            if (cVar.mo56443g() > 0) {
                this.f20117c.setImageResource(cVar.mo56443g());
                this.f20117c.setColorFilter(cVar.mo56482o());
                this.f20117c.setVisibility(0);
            } else {
                this.f20117c.setVisibility(8);
            }
        }
        if (this.f20118d == null) {
            return;
        }
        if (cVar.mo55477a() > 0) {
            this.f20118d.setImageResource(cVar.mo55477a());
            this.f20118d.setColorFilter(cVar.mo55478b());
            this.f20118d.setVisibility(0);
            return;
        }
        this.f20118d.setVisibility(8);
    }

    /* renamed from: b */
    public C8214c mo56475b() {
        return this.f20119e;
    }
}
