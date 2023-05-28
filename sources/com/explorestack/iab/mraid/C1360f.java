package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import com.explorestack.iab.utils.Utils;

/* renamed from: com.explorestack.iab.mraid.f */
public class C1360f {

    /* renamed from: a */
    public final Rect f4178a = new Rect();

    /* renamed from: b */
    public final Rect f4179b = new Rect();

    /* renamed from: c */
    public final Rect f4180c = new Rect();

    /* renamed from: d */
    public final Rect f4181d = new Rect();

    /* renamed from: e */
    public final Rect f4182e = new Rect();

    /* renamed from: f */
    public final Rect f4183f = new Rect();

    /* renamed from: g */
    public final Rect f4184g = new Rect();

    /* renamed from: h */
    public final Rect f4185h = new Rect();

    /* renamed from: i */
    public final float f4186i;

    public C1360f(Context context) {
        this.f4186i = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public Rect mo3893a() {
        return this.f4183f;
    }

    /* renamed from: a */
    public void mo3894a(Rect rect, Rect rect2) {
        rect2.set(Utils.pixelsToIntDips((float) rect.left, this.f4186i), Utils.pixelsToIntDips((float) rect.top, this.f4186i), Utils.pixelsToIntDips((float) rect.right, this.f4186i), Utils.pixelsToIntDips((float) rect.bottom, this.f4186i));
    }

    /* renamed from: a */
    public boolean mo3895a(int i, int i2) {
        if (this.f4178a.width() == i && this.f4178a.height() == i2) {
            return false;
        }
        this.f4178a.set(0, 0, i, i2);
        mo3894a(this.f4178a, this.f4179b);
        return true;
    }

    /* renamed from: a */
    public boolean mo3896a(int i, int i2, int i3, int i4) {
        return mo3897a(this.f4182e, this.f4183f, i, i2, i3, i4);
    }

    /* renamed from: a */
    public final boolean mo3897a(Rect rect, Rect rect2, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && i + i3 == rect.right && i2 + i4 == rect.bottom) {
            return false;
        }
        rect.set(i, i2, i3 + i, i4 + i2);
        mo3894a(rect, rect2);
        return true;
    }

    /* renamed from: b */
    public Rect mo3898b() {
        return this.f4184g;
    }

    /* renamed from: b */
    public boolean mo3899b(int i, int i2, int i3, int i4) {
        return mo3897a(this.f4184g, this.f4185h, i, i2, i3, i4);
    }

    /* renamed from: c */
    public Rect mo3900c() {
        return this.f4185h;
    }

    /* renamed from: c */
    public boolean mo3901c(int i, int i2, int i3, int i4) {
        return mo3897a(this.f4180c, this.f4181d, i, i2, i3, i4);
    }

    /* renamed from: d */
    public Rect mo3902d() {
        return this.f4181d;
    }

    /* renamed from: e */
    public Rect mo3903e() {
        return this.f4179b;
    }
}
