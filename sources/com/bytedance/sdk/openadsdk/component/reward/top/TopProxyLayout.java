package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;

public class TopProxyLayout extends View implements C0357a<TopProxyLayout> {

    /* renamed from: a */
    private C0357a f1172a;

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public TopProxyLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View getITopLayout() {
        C0357a aVar = this.f1172a;
        if (!(aVar instanceof View)) {
            return null;
        }
        return (View) aVar;
    }

    /* renamed from: a */
    public TopProxyLayout mo952a(boolean z, C0477n nVar) {
        TopLayoutDislike2 a = new TopLayoutDislike2(getContext()).mo938a(z, nVar);
        if (a instanceof C0357a) {
            this.f1172a = a;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                m1471a((View) a, (ViewGroup) parent);
            }
            return this;
        }
        C10638l.m31242e("TopProxyLayout", "view not implements ITopLayout interface");
        return this;
    }

    /* renamed from: a */
    private void m1471a(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setShowSkip(boolean z) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.setShowSkip(z);
        }
    }

    public void setSkipEnable(boolean z) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.setSkipEnable(z);
        }
    }

    /* renamed from: c */
    public void mo942c() {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.mo942c();
        }
    }

    public void setShowSound(boolean z) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.setShowSound(z);
        }
    }

    public void setSoundMute(boolean z) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    /* renamed from: a */
    public void mo940a(CharSequence charSequence, CharSequence charSequence2) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.mo940a(charSequence, charSequence2);
        }
    }

    public void setShowDislike(boolean z) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.setShowDislike(z);
        }
    }

    public void setListener(C0358b bVar) {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.setListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo939a() {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.mo939a();
        }
    }

    /* renamed from: b */
    public void mo941b() {
        C0357a aVar = this.f1172a;
        if (aVar != null) {
            aVar.mo941b();
        }
    }
}
