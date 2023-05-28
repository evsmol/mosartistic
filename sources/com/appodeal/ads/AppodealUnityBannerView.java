package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.appodeal.ads.C9710x5;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.C9623a;
import p152ms.p153bd.p154o.Pgl.C5643c;

public final class AppodealUnityBannerView {

    /* renamed from: b */
    public static AppodealUnityBannerView f22718b;

    /* renamed from: a */
    public C8986b f22719a;

    /* renamed from: com.appodeal.ads.AppodealUnityBannerView$a */
    public class C8985a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22720a;

        /* renamed from: b */
        public final /* synthetic */ int f22721b;

        /* renamed from: c */
        public final /* synthetic */ int f22722c;

        /* renamed from: d */
        public final /* synthetic */ int f22723d;

        /* renamed from: e */
        public final /* synthetic */ int f22724e;

        /* renamed from: f */
        public final /* synthetic */ View f22725f;

        public C8985a(Activity activity, int i, int i2, int i3, int i4, FrameLayout frameLayout) {
            this.f22720a = activity;
            this.f22721b = i;
            this.f22722c = i2;
            this.f22723d = i3;
            this.f22724e = i4;
            this.f22725f = frameLayout;
        }

        public final void run() {
            if (AppodealUnityBannerView.this.f22719a != null) {
                C9409q4.m27850b(this.f22720a, this.f22721b);
                C8986b bVar = AppodealUnityBannerView.this.f22719a;
                if (bVar.getParent() != null && (bVar.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) bVar.getParent()).removeView(bVar);
                }
                AppodealUnityBannerView.this.f22719a = null;
            }
            int i = this.f22722c;
            AppodealUnityBannerView appodealUnityBannerView = AppodealUnityBannerView.this;
            int i2 = this.f22723d;
            int i3 = this.f22724e;
            appodealUnityBannerView.getClass();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2, (i2 != -3 ? (i2 == -2 || i2 == -1) ? 1 : 3 : 5) | (i3 != 8 ? 48 : 80));
            AppodealUnityBannerView.this.f22719a = new C8986b(this.f22720a);
            AppodealUnityBannerView appodealUnityBannerView2 = AppodealUnityBannerView.this;
            C8986b bVar2 = appodealUnityBannerView2.f22719a;
            int i4 = this.f22723d;
            if (i4 == -4 || i4 == -3 || i4 == -2 || i4 == -1) {
                i4 = 0;
            }
            int i5 = this.f22724e;
            appodealUnityBannerView2.getClass();
            if (i5 == 8 || i5 == 16) {
                i5 = 0;
            }
            bVar2.f22727c = i4;
            bVar2.f22728d = i5;
            bVar2.requestLayout();
            bVar2.invalidate();
            AppodealUnityBannerView.this.f22719a.setBackgroundColor(0);
            AppodealUnityBannerView.this.f22719a.addView(this.f22725f, layoutParams);
            this.f22720a.addContentView(AppodealUnityBannerView.this.f22719a, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: com.appodeal.ads.AppodealUnityBannerView$b */
    public static class C8986b extends C9710x5.C9715e {

        /* renamed from: c */
        public int f22727c = 0;

        /* renamed from: d */
        public int f22728d = 0;

        public C8986b(Activity activity) {
            super(activity);
        }

        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            if (this.f22727c == 0 && this.f22728d == 0) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int childCount = getChildCount();
            int paddingLeft = getPaddingLeft();
            int paddingRight = (i3 - i) - getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i10 = layoutParams.gravity;
                    if (i10 == -1) {
                        i10 = 8388659;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                    int i11 = i10 & 112;
                    int i12 = this.f22727c;
                    if (i12 != 0) {
                        i5 = i12 + paddingLeft;
                        int i13 = (i5 + measuredWidth) - paddingRight;
                        if (i13 > 0) {
                            i5 -= i13;
                        }
                        if (i5 < paddingLeft) {
                            i5 = paddingLeft;
                        }
                    } else {
                        int i14 = absoluteGravity & 7;
                        if (i14 == 1) {
                            i8 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                        } else if (i14 != 5) {
                            i5 = paddingLeft + layoutParams.leftMargin;
                        } else {
                            i8 = paddingRight - measuredWidth;
                        }
                        i5 = i8 - layoutParams.rightMargin;
                    }
                    int i15 = this.f22728d;
                    if (i15 != 0) {
                        i6 = layoutParams.topMargin + paddingTop + i15;
                        int i16 = (i6 + measuredHeight) - paddingBottom;
                        if (i16 > 0) {
                            i6 -= i16;
                        }
                        if (i6 < paddingTop) {
                            i6 = paddingTop;
                        }
                    } else {
                        if (i11 == 16) {
                            i7 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        } else if (i11 == 48 || i11 != 80) {
                            i6 = layoutParams.topMargin + paddingTop;
                        } else {
                            i7 = paddingBottom - measuredHeight;
                        }
                        i6 = i7 - layoutParams.bottomMargin;
                    }
                    childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
                }
            }
        }
    }

    public static AppodealUnityBannerView getInstance() {
        if (f22718b == null) {
            f22718b = new AppodealUnityBannerView();
        }
        return f22718b;
    }

    /* renamed from: a */
    public final boolean mo59204a(Activity activity, int i, int i2, int i3, String str) {
        int i4;
        int i5 = i;
        String str2 = str;
        if (activity == null) {
            Log.log(new C9623a("Unable to show an ad: activity = null"));
            return false;
        } else if (str2 == null) {
            Log.log(new C9623a("Unable to show an ad: placement = null"));
            return false;
        } else {
            FrameLayout frameLayout = null;
            int i6 = C5643c.COLLECT_MODE_FINANCE;
            if (i5 == 64) {
                frameLayout = C9409q4.m27809a((Context) activity);
                i6 = 320;
            } else if (i5 == 256) {
                frameLayout = C9409q4.m27845b((Context) activity);
            }
            FrameLayout frameLayout2 = frameLayout;
            if (frameLayout2 == null) {
                Log.log(new C9623a("Unable to show an ad: adView = null"));
                return false;
            }
            if (i2 == -1) {
                i4 = -1;
            } else {
                i4 = Math.round(C9182f1.m27290l(activity) * ((float) i6));
            }
            activity.runOnUiThread(new C8985a(activity, i, i4, i2, i3, frameLayout2));
            return C9409q4.m27842a(activity, i, str2);
        }
    }

    public void hideBannerView(Activity activity) {
        activity.runOnUiThread(new C9465s0(this, activity, 4));
    }

    public void hideMrecView(Activity activity) {
        activity.runOnUiThread(new C9465s0(this, activity, 256));
    }

    public boolean showBannerView(Activity activity, int i, int i2, String str) {
        return mo59204a(activity, 64, i, i2, str);
    }

    public boolean showMrecView(Activity activity, int i, int i2, String str) {
        return mo59204a(activity, 256, i, i2, str);
    }
}
