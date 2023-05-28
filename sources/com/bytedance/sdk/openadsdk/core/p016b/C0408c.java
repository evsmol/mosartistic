package com.bytedance.sdk.openadsdk.core.p016b;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.c */
/* compiled from: InteractionListener */
public abstract class C0408c implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: B */
    protected static int f1349B = ViewConfiguration.get(C0558m.m2663a()).getScaledTouchSlop();

    /* renamed from: a */
    private static float f1350a = 0.0f;

    /* renamed from: b */
    private static float f1351b = 0.0f;

    /* renamed from: c */
    private static float f1352c = 0.0f;

    /* renamed from: d */
    private static float f1353d = 0.0f;

    /* renamed from: e */
    private static long f1354e = 0;

    /* renamed from: A */
    protected int f1355A = -1;

    /* renamed from: C */
    protected boolean f1356C = true;

    /* renamed from: D */
    protected View f1357D;

    /* renamed from: E */
    public SparseArray<C0409a> f1358E = new SparseArray<>();

    /* renamed from: f */
    private int f1359f = 0;

    /* renamed from: g */
    private int f1360g = 0;

    /* renamed from: s */
    protected float f1361s = -1.0f;

    /* renamed from: t */
    protected float f1362t = -1.0f;

    /* renamed from: u */
    protected float f1363u = -1.0f;

    /* renamed from: v */
    protected float f1364v = -1.0f;

    /* renamed from: w */
    protected long f1365w = -1;

    /* renamed from: x */
    protected long f1366x = -1;

    /* renamed from: y */
    protected int f1367y = -1;

    /* renamed from: z */
    protected int f1368z = -1024;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0409a> sparseArray, boolean z);

    static {
        if (ViewConfiguration.get(C0558m.m2663a()) != null) {
        }
    }

    public void onClick(View view) {
        if (C0515e.m2397a()) {
            mo106a(view, this.f1361s, this.f1362t, this.f1363u, this.f1364v, this.f1358E, this.f1356C);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2;
        this.f1368z = motionEvent.getDeviceId();
        this.f1367y = motionEvent.getToolType(0);
        this.f1355A = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1359f = (int) motionEvent.getRawX();
            this.f1360g = (int) motionEvent.getRawY();
            this.f1361s = motionEvent.getRawX();
            this.f1362t = motionEvent.getRawY();
            this.f1365w = System.currentTimeMillis();
            this.f1367y = motionEvent.getToolType(0);
            this.f1368z = motionEvent.getDeviceId();
            this.f1355A = motionEvent.getSource();
            f1354e = System.currentTimeMillis();
            this.f1356C = true;
            this.f1357D = view;
            i = 0;
        } else if (actionMasked == 1) {
            this.f1363u = motionEvent.getRawX();
            this.f1364v = motionEvent.getRawY();
            this.f1366x = System.currentTimeMillis();
            if (Math.abs(this.f1363u - ((float) this.f1359f)) >= ((float) C0558m.f2080a) || Math.abs(this.f1364v - ((float) this.f1360g)) >= ((float) C0558m.f2080a)) {
                this.f1356C = false;
            }
            Point point = new Point((int) this.f1363u, (int) this.f1364v);
            if (view != null && !C0406b.m1677c(view) && m1702a((View) view.getParent(), point)) {
                return true;
            }
            i = 3;
        } else if (actionMasked != 2) {
            i = actionMasked != 3 ? -1 : 4;
        } else {
            f1352c += Math.abs(motionEvent.getX() - f1350a);
            f1353d += Math.abs(motionEvent.getY() - f1351b);
            f1350a = motionEvent.getX();
            f1351b = motionEvent.getY();
            if (System.currentTimeMillis() - f1354e > 200) {
                float f = f1352c;
                int i3 = f1349B;
                if (f > ((float) i3) || f1353d > ((float) i3)) {
                    i2 = 1;
                    this.f1363u = motionEvent.getRawX();
                    this.f1364v = motionEvent.getRawY();
                    if (Math.abs(this.f1363u - ((float) this.f1359f)) >= ((float) C0558m.f2080a) || Math.abs(this.f1364v - ((float) this.f1360g)) >= ((float) C0558m.f2080a)) {
                        this.f1356C = false;
                    }
                    i = i2;
                }
            }
            i2 = 2;
            this.f1363u = motionEvent.getRawX();
            this.f1364v = motionEvent.getRawY();
            this.f1356C = false;
            i = i2;
        }
        this.f1358E.put(motionEvent.getActionMasked(), new C0409a(i, (double) motionEvent.getSize(), (double) motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    /* renamed from: a */
    private boolean m1702a(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                if (C0406b.m1677c(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    if (!view.isShown() || point.x < iArr[0] || point.x > iArr[0] + childAt.getWidth() || point.y < iArr[1] || point.y > iArr[1] + childAt.getHeight()) {
                        return false;
                    }
                    return true;
                } else if (m1702a(childAt, point)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.b.c$a */
    /* compiled from: InteractionListener */
    public static class C0409a {

        /* renamed from: a */
        public int f1369a = -1;

        /* renamed from: b */
        public double f1370b = -1.0d;

        /* renamed from: c */
        public double f1371c = -1.0d;

        /* renamed from: d */
        public long f1372d = -1;

        public C0409a(int i, double d, double d2, long j) {
            this.f1369a = i;
            this.f1370b = d;
            this.f1371c = d2;
            this.f1372d = j;
        }
    }
}
