package com.bytedance.sdk.component.adexpress.dynamic.interact.p306a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C10397c;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.d */
/* compiled from: TapTouch */
public class C10395d implements View.OnTouchListener {

    /* renamed from: c */
    private static int f25840c = 10;

    /* renamed from: a */
    private float f25841a;

    /* renamed from: b */
    private float f25842b;

    /* renamed from: d */
    private boolean f25843d;

    /* renamed from: e */
    private C10397c f25844e;

    public C10395d(C10397c cVar) {
        this.f25844e = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25841a = motionEvent.getX();
            this.f25842b = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f25841a) >= ((float) f25840c) || Math.abs(y - this.f25842b) >= ((float) f25840c)) {
                    this.f25843d = true;
                }
            } else if (action == 3) {
                this.f25843d = false;
            }
        } else if (this.f25843d) {
            this.f25843d = false;
            return false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f25841a) >= ((float) f25840c) || Math.abs(y2 - this.f25842b) >= ((float) f25840c)) {
                this.f25843d = false;
            } else {
                C10397c cVar = this.f25844e;
                if (cVar != null) {
                    cVar.mo63685a();
                }
            }
        }
        return true;
    }
}
