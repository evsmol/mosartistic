package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.C7993i;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.l */
class C8000l extends Dialog implements C7999k {

    /* renamed from: a */
    private final Activity f19326a;

    /* renamed from: b */
    private final C8490n f19327b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8626v f19328c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7981d f19329d;

    /* renamed from: e */
    private final C8345a f19330e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f19331f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C7993i f19332g;

    C8000l(C8345a aVar, C7981d dVar, Activity activity, C8490n nVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        } else if (nVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity != null) {
            this.f19327b = nVar;
            this.f19328c = nVar.mo57320D();
            this.f19326a = activity;
            this.f19329d = dVar;
            this.f19330e = aVar;
            requestWindowFeature(1);
            setCancelable(false);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    /* renamed from: a */
    private int m23764a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f19326a, i);
    }

    /* renamed from: a */
    private void m23766a(C7993i.C7994a aVar) {
        if (this.f19332g == null) {
            C7993i a = C7993i.m23745a(aVar, this.f19326a);
            this.f19332g = a;
            a.setVisibility(8);
            this.f19332g.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C8000l.this.m23770d();
                }
            });
            this.f19332g.setClickable(false);
            int a2 = m23764a(((Integer) this.f19327b.mo57342a(C8380b.f20832cc)).intValue());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.addRule(10);
            int i = 9;
            layoutParams.addRule(((Boolean) this.f19327b.mo57342a(C8380b.f20835cf)).booleanValue() ? 9 : 11);
            this.f19332g.mo55738a(a2);
            int a3 = m23764a(((Integer) this.f19327b.mo57342a(C8380b.f20834ce)).intValue());
            int a4 = m23764a(((Integer) this.f19327b.mo57342a(C8380b.f20833cd)).intValue());
            layoutParams.setMargins(a4, a3, a4, 0);
            this.f19331f.addView(this.f19332g, layoutParams);
            this.f19332g.bringToFront();
            int a5 = m23764a(((Integer) this.f19327b.mo57342a(C8380b.f20836cg)).intValue());
            View view = new View(this.f19326a);
            view.setBackgroundColor(0);
            int i2 = a2 + a5;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams2.addRule(10);
            if (!((Boolean) this.f19327b.mo57342a(C8380b.f20835cf)).booleanValue()) {
                i = 11;
            }
            layoutParams2.addRule(i);
            layoutParams2.setMargins(a4 - m23764a(5), a3 - m23764a(5), a4 - m23764a(5), 0);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (C8000l.this.f19332g.isClickable()) {
                        C8000l.this.f19332g.performClick();
                    }
                }
            });
            this.f19331f.addView(view, layoutParams2);
            view.bringToFront();
        } else if (C8626v.m26252a()) {
            this.f19328c.mo57821d("ExpandedAdDialog", "Attempting to create duplicate close button");
        }
    }

    /* renamed from: c */
    private void m23768c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f19329d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f19326a);
        this.f19331f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f19331f.setBackgroundColor(-1157627904);
        this.f19331f.addView(this.f19329d);
        if (!this.f19330e.mo56925m()) {
            m23766a(this.f19330e.mo56926n());
            m23773e();
        }
        setContentView(this.f19331f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m23770d() {
        this.f19329d.mo55708a("javascript:al_onCloseTapped();", (Runnable) new Runnable() {
            public void run() {
                C8000l.this.dismiss();
            }
        });
    }

    /* renamed from: e */
    private void m23773e() {
        this.f19326a.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C8000l.this.f19332g == null) {
                        C8000l.this.m23770d();
                    }
                    C8000l.this.f19332g.setVisibility(0);
                    C8000l.this.f19332g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationEnd(Animation animation) {
                            C8000l.this.f19332g.setClickable(true);
                        }

                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    C8000l.this.f19332g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    C8626v unused = C8000l.this.f19328c;
                    if (C8626v.m26252a()) {
                        C8000l.this.f19328c.mo57819b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    C8000l.this.m23770d();
                }
            }
        });
    }

    /* renamed from: a */
    public C8345a mo55751a() {
        return this.f19330e;
    }

    /* renamed from: b */
    public C7981d mo55752b() {
        return this.f19329d;
    }

    public void dismiss() {
        C8392d statsManagerHelper = this.f19329d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.mo57137e();
        }
        this.f19326a.runOnUiThread(new Runnable() {
            public void run() {
                C8000l.this.f19331f.removeView(C8000l.this.f19329d);
                C8000l.super.dismiss();
            }
        });
    }

    public void onBackPressed() {
        this.f19329d.mo55708a("javascript:al_onBackPressed();", (Runnable) new Runnable() {
            public void run() {
                C8000l.this.dismiss();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m23768c();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f19326a.getWindow().getAttributes().flags, this.f19326a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (C8626v.m26252a()) {
                this.f19328c.mo57822e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C8626v.m26252a()) {
                this.f19328c.mo57819b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
