package com.bytedance.sdk.component.adexpress.dynamic.interact.p306a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C10397c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.a */
/* compiled from: LongPressTouch */
public class C10392a implements View.OnTouchListener {

    /* renamed from: a */
    private float f25825a;

    /* renamed from: b */
    private float f25826b;

    /* renamed from: c */
    private long f25827c;

    /* renamed from: d */
    private boolean f25828d;

    /* renamed from: e */
    private InteractViewContainer f25829e;

    /* renamed from: f */
    private C10397c f25830f;

    public C10392a(InteractViewContainer interactViewContainer, C10397c cVar) {
        this.f25829e = interactViewContainer;
        this.f25830f = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25827c = System.currentTimeMillis();
            this.f25825a = motionEvent.getX();
            this.f25826b = motionEvent.getY();
            this.f25829e.mo63687c();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f25825a) >= C10305b.m29747a(C10303c.m29743a(), 10.0f) || Math.abs(y - this.f25826b) >= C10305b.m29747a(C10303c.m29743a(), 10.0f)) {
                    this.f25828d = true;
                    this.f25829e.mo63688d();
                }
            }
        } else if (this.f25828d) {
            return false;
        } else {
            if (System.currentTimeMillis() - this.f25827c >= 1500) {
                C10397c cVar = this.f25830f;
                if (cVar != null) {
                    cVar.mo63685a();
                }
            } else {
                this.f25829e.mo63688d();
            }
        }
        return true;
    }
}
