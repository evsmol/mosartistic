package com.bytedance.sdk.component.adexpress.dynamic.interact.p306a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C10397c;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.b */
/* compiled from: SlideRightTouch */
public class C10393b implements View.OnTouchListener {

    /* renamed from: a */
    private float f25831a;

    /* renamed from: b */
    private float f25832b;

    /* renamed from: c */
    private boolean f25833c;

    /* renamed from: d */
    private C10397c f25834d;

    public C10393b(C10397c cVar) {
        this.f25834d = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C10397c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25831a = motionEvent.getX();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                this.f25832b = x;
                if (Math.abs(x - this.f25831a) > 10.0f) {
                    this.f25833c = true;
                }
            }
        } else if (!this.f25833c) {
            return false;
        } else {
            int b = C10305b.m29751b(C10303c.m29743a(), Math.abs(this.f25832b - this.f25831a));
            if (this.f25832b > this.f25831a && b > 5 && (cVar = this.f25834d) != null) {
                cVar.mo63685a();
            }
        }
        return true;
    }
}
