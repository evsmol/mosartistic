package com.bytedance.sdk.component.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.bytedance.sdk.component.utils.g */
/* compiled from: HackTouchDelegate */
public class C10630g extends TouchDelegate {

    /* renamed from: a */
    private View f26510a;

    /* renamed from: b */
    private Rect f26511b;

    /* renamed from: c */
    private Rect f26512c;

    /* renamed from: d */
    private boolean f26513d;

    /* renamed from: e */
    private int f26514e;

    public C10630g(Rect rect, View view) {
        super(rect, view);
        this.f26511b = rect;
        this.f26514e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.f26512c = rect2;
        int i = this.f26514e;
        rect2.inset(-i, -i);
        this.f26510a = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r7.getAction()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0033
            if (r2 == r4) goto L_0x0023
            if (r2 == r3) goto L_0x0023
            r0 = 3
            if (r2 == r0) goto L_0x001d
        L_0x001a:
            r0 = 1
            r4 = 0
            goto L_0x0041
        L_0x001d:
            boolean r0 = r6.f26513d
            r6.f26513d = r5
            r4 = r0
            goto L_0x0031
        L_0x0023:
            boolean r2 = r6.f26513d
            if (r2 == 0) goto L_0x0030
            android.graphics.Rect r4 = r6.f26512c
            boolean r4 = r4.contains(r0, r1)
            r0 = r4
            r4 = r2
            goto L_0x0041
        L_0x0030:
            r4 = r2
        L_0x0031:
            r0 = 1
            goto L_0x0041
        L_0x0033:
            android.graphics.Rect r2 = r6.f26511b
            boolean r0 = r2.contains(r0, r1)
            if (r0 == 0) goto L_0x003e
            r6.f26513d = r4
            goto L_0x0031
        L_0x003e:
            r6.f26513d = r5
            goto L_0x001a
        L_0x0041:
            if (r4 == 0) goto L_0x006a
            android.view.View r1 = r6.f26510a
            if (r0 == 0) goto L_0x0057
            int r0 = r1.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r2 = r1.getHeight()
            int r2 = r2 / r3
            float r2 = (float) r2
            r7.setLocation(r0, r2)
            goto L_0x0060
        L_0x0057:
            int r0 = r6.f26514e
            int r0 = r0 * 2
            int r0 = -r0
            float r0 = (float) r0
            r7.setLocation(r0, r0)
        L_0x0060:
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x006a
            boolean r5 = r1.dispatchTouchEvent(r7)
        L_0x006a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C10630g.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
