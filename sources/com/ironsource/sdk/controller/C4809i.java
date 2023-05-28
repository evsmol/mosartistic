package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.C4407h;
import com.ironsource.sdk.controller.C4845x;
import com.ironsource.sdk.p146i.C4951a;
import com.ironsource.sdk.p147j.C4963g;

/* renamed from: com.ironsource.sdk.controller.i */
public final class C4809i extends FrameLayout implements C4963g {

    /* renamed from: a */
    Context f12262a;

    /* renamed from: b */
    C4845x f12263b;

    public C4809i(Context context) {
        super(context);
        this.f12262a = context;
        setClickable(true);
    }

    /* renamed from: a */
    static /* synthetic */ ViewGroup m14062a(C4809i iVar) {
        Activity activity = (Activity) iVar.f12262a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo34384a() {
        int identifier;
        try {
            if (this.f12262a == null || (identifier = this.f12262a.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f12262a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo34385b() {
        Activity activity = (Activity) this.f12262a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (C4407h.m12574o(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                } else if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12263b.mo34449l();
        this.f12263b.mo34438a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new C4951a();
        return C4951a.m14424a((Activity) this.f12262a);
    }

    public final void onCloseRequested() {
        ((Activity) this.f12262a).runOnUiThread(new Runnable() {
            public final void run() {
                ViewGroup a = C4809i.m14062a(C4809i.this);
                if (a != null) {
                    a.removeView(C4809i.this);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12263b.mo34448k();
        this.f12263b.mo34438a(false, "main");
        C4845x xVar = this.f12263b;
        if (xVar != null) {
            xVar.f12390j = C4845x.C4901g.Gone;
            this.f12263b.f12392l = null;
            this.f12263b.f12402v = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i) {
    }
}
