package com.applovin.exoplayer2.p224ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C6811ak;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7818o;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p222m.C7816o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ui.SubtitleView */
public final class SubtitleView extends FrameLayout implements C6814an.C6820d {

    /* renamed from: a */
    private List<C7540a> f18693a;

    /* renamed from: b */
    private C7841c f18694b;

    /* renamed from: c */
    private int f18695c;

    /* renamed from: d */
    private float f18696d;

    /* renamed from: e */
    private float f18697e;

    /* renamed from: f */
    private boolean f18698f;

    /* renamed from: g */
    private boolean f18699g;

    /* renamed from: h */
    private int f18700h;

    /* renamed from: i */
    private C7838a f18701i;

    /* renamed from: j */
    private View f18702j;

    /* renamed from: com.applovin.exoplayer2.ui.SubtitleView$a */
    interface C7838a {
        /* renamed from: a */
        void mo55291a(List<C7540a> list, C7841c cVar, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18693a = Collections.emptyList();
        this.f18694b = C7841c.f18712a;
        this.f18695c = 0;
        this.f18696d = 0.0533f;
        this.f18697e = 0.08f;
        this.f18698f = true;
        this.f18699g = true;
        C7840b bVar = new C7840b(context);
        this.f18701i = bVar;
        this.f18702j = bVar;
        addView(bVar);
        this.f18700h = 1;
    }

    /* renamed from: a */
    private C7540a m22967a(C7540a aVar) {
        C7540a.C7542a a = aVar.mo54635a();
        if (!this.f18698f) {
            C7858j.m23211a(a);
        } else if (!this.f18699g) {
            C7858j.m23213b(a);
        }
        return a.mo54656e();
    }

    /* renamed from: a */
    private void m22968a(int i, float f) {
        this.f18695c = i;
        this.f18696d = f;
        m22969e();
    }

    /* renamed from: e */
    private void m22969e() {
        this.f18701i.mo55291a(getCuesWithStylingPreferencesApplied(), this.f18694b, this.f18696d, this.f18695c, this.f18697e);
    }

    private List<C7540a> getCuesWithStylingPreferencesApplied() {
        if (this.f18698f && this.f18699g) {
            return this.f18693a;
        }
        ArrayList arrayList = new ArrayList(this.f18693a.size());
        for (int i = 0; i < this.f18693a.size(); i++) {
            arrayList.add(m22967a(this.f18693a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (C7728ai.f18249a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C7841c getUserCaptionStyle() {
        if (C7728ai.f18249a < 19 || isInEditMode()) {
            return C7841c.f18712a;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C7841c.f18712a : C7841c.m23006a(captioningManager.getUserStyle());
    }

    private <T extends View & C7838a> void setView(T t) {
        removeView(this.f18702j);
        View view = this.f18702j;
        if (view instanceof C7861l) {
            ((C7861l) view).mo55404a();
        }
        this.f18702j = t;
        this.f18701i = (C7838a) t;
        addView(t);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52456a() {
        C6814an.C6820d.CC.$default$a(this);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52457a(float f) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, f);
    }

    /* renamed from: a */
    public void mo55281a(float f, boolean z) {
        m22968a(z ? 1 : 0, f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52458a(int i, int i2) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, i, i2);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52467a(int i, boolean z) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, i, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52471a(C6787ab abVar, int i) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, abVar, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52472a(C6797ac acVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, acVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52473a(C6811ak akVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, akVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52474a(C6813am amVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, amVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52475a(C6814an.C6816a aVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, aVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52476a(C6814an.C6821e eVar, C6814an.C6821e eVar2, int i) {
        C6814an.C6820d.CC.$default$a(this, eVar, eVar2, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52478a(C6814an anVar, C6814an.C6819c cVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, anVar, cVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52479a(C6904ba baVar, int i) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, baVar, i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52481a(C7399a aVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, aVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52482a(C7483ad adVar, C7644h hVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, adVar, hVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52483a(C7816o oVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, oVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo52484a(C7818o oVar) {
        C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, oVar);
    }

    /* renamed from: a */
    public void mo52491a(List<C7540a> list) {
        setCues(list);
    }

    @Deprecated
    /* renamed from: a */
    public /* synthetic */ void mo52493a(boolean z, int i) {
        C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, z, i);
    }

    /* renamed from: a_ */
    public /* synthetic */ void mo52495a_(boolean z) {
        C6814an.C6820d.CC.$default$a_(this, z);
    }

    @Deprecated
    /* renamed from: b */
    public /* synthetic */ void mo52496b() {
        C6814an.C6818b.CC.$default$b(this);
    }

    /* renamed from: b */
    public /* synthetic */ void mo52497b(int i) {
        C6814an.C6820d.CC.$default$b((C6814an.C6820d) this, i);
    }

    /* renamed from: b */
    public /* synthetic */ void mo52501b(C6811ak akVar) {
        C6814an.C6820d.CC.$default$b((C6814an.C6820d) this, akVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo52507b(boolean z, int i) {
        C6814an.C6820d.CC.$default$b(this, z, i);
    }

    /* renamed from: b_ */
    public /* synthetic */ void mo52508b_(boolean z) {
        C6814an.C6820d.CC.$default$b_(this, z);
    }

    /* renamed from: c */
    public void mo55282c() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: c */
    public /* synthetic */ void mo52510c(int i) {
        C6814an.C6820d.CC.$default$c(this, i);
    }

    @Deprecated
    /* renamed from: c */
    public /* synthetic */ void mo52515c(boolean z) {
        C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, z);
    }

    /* renamed from: d */
    public void mo55283d() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: d */
    public /* synthetic */ void mo52517d(int i) {
        C6814an.C6820d.CC.$default$d((C6814an.C6820d) this, i);
    }

    /* renamed from: d */
    public /* synthetic */ void mo52520d(boolean z) {
        C6814an.C6820d.CC.$default$d((C6814an.C6820d) this, z);
    }

    @Deprecated
    /* renamed from: e */
    public /* synthetic */ void mo52522e(int i) {
        C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, i);
    }

    /* renamed from: e */
    public /* synthetic */ void mo52524e(boolean z) {
        C6814an.C6820d.CC.$default$e(this, z);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f18699g = z;
        m22969e();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f18698f = z;
        m22969e();
    }

    public void setBottomPaddingFraction(float f) {
        this.f18697e = f;
        m22969e();
    }

    public void setCues(List<C7540a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f18693a = list;
        m22969e();
    }

    public void setFractionalTextSize(float f) {
        mo55281a(f, false);
    }

    public void setStyle(C7841c cVar) {
        this.f18694b = cVar;
        m22969e();
    }

    public void setViewType(int i) {
        View view;
        if (this.f18700h != i) {
            if (i == 1) {
                view = new C7840b(getContext());
            } else if (i == 2) {
                view = new C7861l(getContext());
            } else {
                throw new IllegalArgumentException();
            }
            setView(view);
            this.f18700h = i;
        }
    }
}
