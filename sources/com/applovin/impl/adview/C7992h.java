package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.applovin.impl.adview.h */
public class C7992h extends WebView {

    /* renamed from: a */
    private PointF f19307a = new PointF();

    public C7992h(Context context) {
        super(context);
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f19307a;
        this.f19307a = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f19307a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f19307a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
