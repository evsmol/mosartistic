package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.utils.C1002v;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.d */
/* compiled from: VideoOnTouchLayout */
public class C0739d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0741a f2856a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f2857b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f2858c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f2859d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f2860e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f2861f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f2862g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f2863h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f2864i = false;

    /* renamed from: j */
    private final View.OnTouchListener f2865j = new View.OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!C0739d.this.f2856a.mo2290o()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    C0739d dVar = C0739d.this;
                    boolean unused = dVar.f2866k = dVar.m3765a(motionEvent);
                    float unused2 = C0739d.this.f2859d = x;
                    float unused3 = C0739d.this.f2860e = y;
                    int unused4 = C0739d.this.f2861f = (int) x;
                    int unused5 = C0739d.this.f2862g = (int) y;
                    boolean unused6 = C0739d.this.f2863h = true;
                    if (C0739d.this.f2856a != null && C0739d.this.f2858c && !C0739d.this.f2857b) {
                        C0739d.this.f2856a.mo2267a(view, true);
                    }
                } else if (action == 1) {
                    if (Math.abs(x - ((float) C0739d.this.f2861f)) > 20.0f || Math.abs(y - ((float) C0739d.this.f2862g)) > 20.0f) {
                        boolean unused7 = C0739d.this.f2863h = false;
                    }
                    if (!C0739d.this.f2857b) {
                        boolean unused8 = C0739d.this.f2863h = true;
                    }
                    boolean unused9 = C0739d.this.f2864i = false;
                    float unused10 = C0739d.this.f2859d = 0.0f;
                    float unused11 = C0739d.this.f2860e = 0.0f;
                    int unused12 = C0739d.this.f2861f = 0;
                    if (C0739d.this.f2856a != null) {
                        C0739d.this.f2856a.mo2267a(view, C0739d.this.f2863h);
                    }
                    boolean unused13 = C0739d.this.f2866k = false;
                } else if (action != 2) {
                    if (action == 3) {
                        boolean unused14 = C0739d.this.f2866k = false;
                    }
                } else if (C0739d.this.f2857b && !C0739d.this.f2866k) {
                    float abs = Math.abs(x - C0739d.this.f2859d);
                    float abs2 = Math.abs(y - C0739d.this.f2860e);
                    if (!C0739d.this.f2864i) {
                        if (abs <= 20.0f && abs2 <= 20.0f) {
                            return true;
                        }
                        boolean unused15 = C0739d.this.f2864i = true;
                    }
                    if (C0739d.this.f2856a != null) {
                        C0739d.this.f2856a.mo2289n();
                    }
                    float unused16 = C0739d.this.f2859d = x;
                    float unused17 = C0739d.this.f2860e = y;
                }
                if (C0739d.this.f2857b || !C0739d.this.f2858c) {
                    return true;
                }
                return false;
            } else if (C0739d.this.f2857b || !C0739d.this.f2858c) {
                return true;
            } else {
                return false;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f2866k;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.d$a */
    /* compiled from: VideoOnTouchLayout */
    public interface C0741a {
        /* renamed from: a */
        void mo2267a(View view, boolean z);

        /* renamed from: n */
        void mo2289n();

        /* renamed from: o */
        boolean mo2290o();
    }

    public C0739d(C0741a aVar) {
        this.f2856a = aVar;
    }

    /* renamed from: a */
    public void mo2497a(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f2865j);
        }
    }

    /* renamed from: a */
    public void mo2498a(boolean z) {
        this.f2858c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m3765a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int c = C1002v.m4740c(C0558m.m2663a().getApplicationContext());
        int d = C1002v.m4744d(C0558m.m2663a().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = (float) c;
        if (rawX > f * 0.01f && rawX < f * 0.99f) {
            float f2 = (float) d;
            if (rawY <= 0.01f * f2 || rawY >= f2 * 0.99f) {
                return true;
            }
            return false;
        }
        return true;
    }
}
