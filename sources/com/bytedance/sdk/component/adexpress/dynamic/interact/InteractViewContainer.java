package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p306a.C10392a;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p306a.C10393b;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p306a.C10394c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p306a.C10395d;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10350g;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

public class InteractViewContainer extends FrameLayout implements C10397c {

    /* renamed from: a */
    private Context f25811a;

    /* renamed from: b */
    private DynamicBaseWidget f25812b;

    /* renamed from: c */
    private C10350g f25813c;

    /* renamed from: d */
    private View f25814d;

    /* renamed from: e */
    private C10396b f25815e;

    /* renamed from: f */
    private String f25816f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RippleView f25817g;

    /* renamed from: h */
    private View.OnTouchListener f25818h;

    /* renamed from: i */
    private int f25819i;

    /* renamed from: j */
    private int f25820j;

    /* renamed from: k */
    private int f25821k;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar) {
        super(context);
        this.f25811a = context;
        this.f25812b = dynamicBaseWidget;
        this.f25813c = gVar;
        m30299e();
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, C10350g gVar, int i, int i2) {
        super(context);
        this.f25811a = context;
        this.f25812b = dynamicBaseWidget;
        this.f25813c = gVar;
        this.f25820j = i;
        this.f25821k = i2;
        m30299e();
    }

    /* renamed from: e */
    private void m30299e() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f25816f = this.f25813c.mo63505D();
        this.f25819i = this.f25813c.mo63506E();
        C10396b a = C10398d.m30315a(this.f25811a, this.f25812b, this.f25813c, this.f25820j, this.f25821k);
        this.f25815e = a;
        if (a != null) {
            this.f25814d = a.mo63695d();
            if (TextUtils.equals(this.f25816f, "6")) {
                RippleView rippleView = new RippleView(this.f25811a);
                this.f25817g = rippleView;
                addView(rippleView, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.f25817g.mo63784b();
                    }
                });
            }
            addView(this.f25815e.mo63695d());
            m30300f();
            setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m30300f() {
        if (this.f25814d != null) {
            String str = this.f25816f;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 50) {
                switch (hashCode) {
                    case 53:
                        if (str.equals("5")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 54:
                        if (str.equals("6")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 55:
                        if (str.equals("7")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 56:
                        if (str.equals("8")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 57:
                        if (str.equals("9")) {
                            c = 0;
                            break;
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case 1568:
                                if (str.equals("11")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1569:
                                if (str.equals("12")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 1570:
                                if (str.equals("13")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1571:
                                if (str.equals("14")) {
                                    c = 8;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1573:
                                        if (str.equals("16")) {
                                            c = 11;
                                            break;
                                        }
                                        break;
                                    case 1574:
                                        if (str.equals("17")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 1575:
                                        if (str.equals("18")) {
                                            c = 12;
                                            break;
                                        }
                                        break;
                                }
                        }
                }
            } else if (str.equals("2")) {
                c = 9;
            }
            switch (c) {
                case 0:
                case 1:
                    this.f25814d.setTag(2);
                    break;
                case 2:
                    this.f25818h = new C10394c(this, this.f25819i);
                    break;
                case 3:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f25818h = new C10395d(this);
                    break;
                case 4:
                case 5:
                    this.f25812b.setClipChildren(false);
                    this.f25812b.setClipChildren(false);
                    ViewGroup viewGroup = (ViewGroup) this.f25812b.getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    this.f25818h = new C10395d(this);
                    break;
                case 6:
                    this.f25818h = new C10393b(this);
                    break;
                case 7:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f25818h = new C10393b(this);
                    break;
                case 8:
                    this.f25818h = new C10392a(this, this);
                    break;
                case 9:
                case 10:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f25818h = new C10392a(this, this);
                    break;
                case 11:
                    View view = this.f25814d;
                    if (!(view == null || !(view instanceof ShakeAnimationView) || ((ShakeAnimationView) view).getShakeLayout() == null)) {
                        ((ShakeAnimationView) this.f25814d).getShakeLayout().setTag(2);
                    }
                    this.f25814d.setTag(2);
                    break;
                case 12:
                    View view2 = this.f25814d;
                    if (!(view2 == null || !(view2 instanceof WriggleGuideAnimationView) || ((WriggleGuideAnimationView) view2).getWriggleLayout() == null)) {
                        ((WriggleGuideAnimationView) this.f25814d).getWriggleLayout().setTag(2);
                    }
                    this.f25814d.setTag(2);
                    break;
            }
            View.OnTouchListener onTouchListener = this.f25818h;
            if (onTouchListener != null) {
                setOnTouchListener(onTouchListener);
            }
            if (m30301g()) {
                setOnClickListener((View.OnClickListener) this.f25812b.getDynamicClickListener());
            }
        }
    }

    /* renamed from: g */
    private boolean m30301g() {
        if (!this.f25813c.mo63511J() && !TextUtils.equals("9", this.f25816f) && !TextUtils.equals("16", this.f25816f) && !TextUtils.equals("17", this.f25816f) && !TextUtils.equals("18", this.f25816f)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo63686b() {
        C10396b bVar = this.f25815e;
        if (bVar != null) {
            bVar.mo63692a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10396b bVar = this.f25815e;
        if (bVar != null) {
            bVar.mo63693b();
        }
    }

    /* renamed from: c */
    public void mo63687c() {
        if (this.f25814d != null && TextUtils.equals(this.f25816f, "2")) {
            View view = this.f25814d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).mo63726c();
            }
        }
    }

    /* renamed from: d */
    public void mo63688d() {
        if (this.f25814d != null && TextUtils.equals(this.f25816f, "2")) {
            View view = this.f25814d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).mo63727d();
            }
        }
    }

    /* renamed from: a */
    public void mo63685a() {
        if (TextUtils.equals(this.f25816f, "6")) {
            RippleView rippleView = this.f25817g;
            if (rippleView != null) {
                rippleView.mo63785c();
                postDelayed(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.m30302h();
                    }
                }, 300);
                return;
            }
            return;
        }
        m30302h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m30302h() {
        if (this.f25818h != null) {
            setOnClickListener((View.OnClickListener) this.f25812b.getDynamicClickListener());
            performClick();
        }
    }
}
