package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.mediation.p234a.C8075e;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.y */
public class C8630y {

    /* renamed from: a */
    private final C8490n f21794a;

    /* renamed from: b */
    private final C8626v f21795b;

    /* renamed from: c */
    private final View f21796c;

    public C8630y(View view, C8490n nVar) {
        this.f21794a = nVar;
        this.f21795b = nVar.mo57320D();
        this.f21796c = view;
    }

    /* renamed from: a */
    public long mo57831a(C8075e eVar) {
        if (C8626v.m26252a()) {
            this.f21795b.mo57818b("ViewabilityTracker", "Checking visibility...");
        }
        long j = 0;
        if (!this.f21796c.isShown()) {
            if (C8626v.m26252a()) {
                this.f21795b.mo57822e("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f21796c.getAlpha() < eVar.mo56143J()) {
            if (C8626v.m26252a()) {
                this.f21795b.mo57822e("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f21796c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C8626v.m26252a()) {
                this.f21795b.mo57822e("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f21796c.getParent() == null) {
            if (C8626v.m26252a()) {
                this.f21795b.mo57822e("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f21796c.getContext(), this.f21796c.getWidth());
        if (pxToDp < eVar.mo56141H()) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f21795b;
                vVar.mo57822e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f21796c.getContext(), this.f21796c.getHeight());
        if (pxToDp2 < eVar.mo56142I()) {
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21795b;
                vVar2.mo57822e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Point a = C8571h.m26081a(this.f21796c.getContext());
        Rect rect = new Rect(0, 0, a.x, a.y);
        int[] iArr = {-1, -1};
        this.f21796c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f21796c.getWidth(), iArr[1] + this.f21796c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (C8626v.m26252a()) {
                C8626v vVar3 = this.f21795b;
                vVar3.mo57822e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity a2 = this.f21794a.mo57368ai().mo56831a();
        if (a2 != null && !Utils.isViewInTopActivity(this.f21796c, a2)) {
            if (C8626v.m26252a()) {
                this.f21795b.mo57822e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (C8626v.m26252a()) {
            C8626v vVar4 = this.f21795b;
            vVar4.mo57818b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
