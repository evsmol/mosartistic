package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.C10314a;
import com.bytedance.sdk.component.adexpress.dynamic.C10342b;
import com.bytedance.sdk.component.adexpress.dynamic.C10353c;
import com.bytedance.sdk.component.adexpress.dynamic.C10374d;
import com.bytedance.sdk.component.adexpress.dynamic.p301a.C10321b;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10348e;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10349f;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10375a;
import com.bytedance.sdk.component.adexpress.p298b.C10294j;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.adexpress.theme.C10409a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;

public class DynamicRootView extends FrameLayout implements C10353c, C10409a {

    /* renamed from: a */
    protected final C10298m f25779a;

    /* renamed from: b */
    boolean f25780b;

    /* renamed from: c */
    private C10294j f25781c;

    /* renamed from: d */
    private DynamicBaseWidget f25782d;

    /* renamed from: e */
    private C10375a f25783e;

    /* renamed from: f */
    private ThemeStatusBroadcastReceiver f25784f;

    /* renamed from: g */
    private C10314a f25785g;

    /* renamed from: h */
    private ViewGroup f25786h = null;

    /* renamed from: i */
    private int f25787i = 0;

    /* renamed from: j */
    private List<C10342b> f25788j = new ArrayList();

    /* renamed from: k */
    private C10374d f25789k;

    /* renamed from: l */
    private int f25790l = 0;

    /* renamed from: m */
    private int f25791m = 0;

    /* renamed from: n */
    private C10296l f25792n;

    /* renamed from: o */
    private Context f25793o;

    /* renamed from: p */
    private String f25794p;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C10296l lVar, C10375a aVar) {
        super(context);
        this.f25793o = context;
        C10298m mVar = new C10298m();
        this.f25779a = mVar;
        mVar.mo63209a(2);
        this.f25783e = aVar;
        aVar.mo1184a((View) this);
        this.f25784f = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.mo63708a(this);
        this.f25780b = z;
        this.f25792n = lVar;
    }

    public String getBgColor() {
        return this.f25794p;
    }

    public void setBgColor(String str) {
        this.f25794p = str;
    }

    public void setRenderListener(C10294j jVar) {
        this.f25781c = jVar;
        this.f25783e.mo1185a(jVar);
    }

    /* renamed from: a */
    public void mo63655a(C10351h hVar, int i) {
        this.f25782d = mo63652a(hVar, (ViewGroup) this, i);
        this.f25779a.mo63211a(true);
        this.f25779a.mo63207a((double) this.f25782d.f25749e);
        this.f25779a.mo63214b((double) this.f25782d.f25750f);
        this.f25781c.mo63174a(this.f25779a);
    }

    /* renamed from: a */
    public DynamicBaseWidget mo63652a(C10351h hVar, ViewGroup viewGroup, int i) {
        if (hVar == null) {
            return null;
        }
        DynamicBaseWidget a = C10321b.m29824a(this.f25793o, this, hVar);
        if (a instanceof DynamicUnKnowView) {
            mo63654a(i == 3 ? 128 : 118);
            return null;
        }
        m30253a(hVar);
        a.mo63624c();
        if (viewGroup != null) {
            viewGroup.addView(a);
            m30252a(viewGroup, hVar);
        }
        List<C10351h> j = hVar.mo63564j();
        if (j == null || j.size() <= 0) {
            return null;
        }
        for (C10351h a2 : j) {
            mo63652a(a2, (ViewGroup) a, i);
        }
        return a;
    }

    /* renamed from: a */
    private void m30253a(C10351h hVar) {
        C10349f e;
        C10348e i = hVar.mo63563i();
        if (i != null && (e = i.mo63363e()) != null) {
            this.f25779a.mo63217b(e.mo63410ak());
        }
    }

    /* renamed from: a */
    private void m30252a(ViewGroup viewGroup, C10351h hVar) {
        ViewGroup viewGroup2;
        if (viewGroup != null && (viewGroup2 = (ViewGroup) viewGroup.getParent()) != null && hVar.mo63574t()) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    /* renamed from: a */
    public void mo63653a(double d, double d2, double d3, double d4, float f) {
        this.f25779a.mo63219c(d);
        this.f25779a.mo63222d(d2);
        this.f25779a.mo63225e(d3);
        this.f25779a.mo63227f(d4);
        this.f25779a.mo63208a(f);
        this.f25779a.mo63215b(f);
        this.f25779a.mo63220c(f);
        this.f25779a.mo63223d(f);
    }

    /* renamed from: a */
    public void mo63654a(int i) {
        this.f25779a.mo63211a(false);
        this.f25779a.mo63216b(i);
        this.f25781c.mo63174a(this.f25779a);
    }

    public void setMuteListener(C10314a aVar) {
        this.f25785g = aVar;
    }

    public void setDislikeView(View view) {
        this.f25783e.mo1186b(view);
    }

    public C10294j getRenderListener() {
        return this.f25781c;
    }

    public C10375a getDynamicClickListener() {
        return this.f25783e;
    }

    /* renamed from: b */
    public void mo1995b(int i) {
        DynamicBaseWidget dynamicBaseWidget = this.f25782d;
        if (dynamicBaseWidget != null) {
            dynamicBaseWidget.mo63622a(i);
        }
    }

    /* renamed from: a */
    public void mo1879a(CharSequence charSequence, int i, int i2) {
        for (int i3 = 0; i3 < this.f25788j.size(); i3++) {
            if (this.f25788j.get(i3) != null) {
                C10342b bVar = this.f25788j.get(i3);
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bVar.mo63313a(charSequence, z, i2);
            }
        }
    }

    public void setSoundMute(boolean z) {
        C10314a aVar = this.f25785g;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    public void setTimeUpdate(int i) {
        this.f25789k.setTimeUpdate(i);
    }

    /* renamed from: f */
    public void mo1884f() {
        this.f25789k.mo63607a();
    }

    public ViewGroup getTimeOut() {
        return this.f25786h;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.f25786h = viewGroup;
    }

    public int getTimedown() {
        return this.f25787i;
    }

    public void setTimedown(int i) {
        this.f25787i = i;
    }

    public List<C10342b> getTimeOutListener() {
        return this.f25788j;
    }

    public void setTimeOutListener(C10342b bVar) {
        this.f25788j.add(bVar);
    }

    public void setVideoListener(C10374d dVar) {
        this.f25789k = dVar;
    }

    public int getScoreCountWithIcon() {
        return this.f25791m;
    }

    public void setScoreCountWithIcon(int i) {
        this.f25791m = i;
    }

    public int getLogoUnionHeight() {
        return this.f25790l;
    }

    public void setLogoUnionHeight(int i) {
        this.f25790l = i;
    }

    public C10296l getRenderRequest() {
        return this.f25792n;
    }
}
