package com.bytedance.sdk.component.adexpress.dynamic.interact.p306a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C10397c;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.c */
/* compiled from: SlideUpTouch */
public class C10394c implements View.OnTouchListener {

    /* renamed from: a */
    private float f25835a;

    /* renamed from: b */
    private float f25836b;

    /* renamed from: c */
    private boolean f25837c;

    /* renamed from: d */
    private C10397c f25838d;

    /* renamed from: e */
    private int f25839e;

    public C10394c(C10397c cVar, int i) {
        this.f25838d = cVar;
        this.f25839e = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C10397c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25835a = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.f25836b = y;
                if (Math.abs(y - this.f25835a) > 10.0f) {
                    this.f25837c = true;
                }
            }
        } else if (!this.f25837c) {
            return false;
        } else {
            int b = C10305b.m29751b(C10303c.m29743a(), Math.abs(this.f25836b - this.f25835a));
            if (this.f25836b - this.f25835a < 0.0f && b > this.f25839e && (cVar = this.f25838d) != null) {
                cVar.mo63685a();
            }
        }
        return true;
    }
}
