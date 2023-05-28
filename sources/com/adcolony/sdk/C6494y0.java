package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import kotlin.KotlinVersion;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.y0 */
class C6494y0 extends Button {

    /* renamed from: a */
    private int f13938a;

    /* renamed from: b */
    private int f13939b;

    /* renamed from: c */
    private int f13940c;

    /* renamed from: d */
    private int f13941d;

    /* renamed from: e */
    private int f13942e;

    /* renamed from: f */
    private int f13943f;

    /* renamed from: g */
    private int f13944g;

    /* renamed from: h */
    private int f13945h;

    /* renamed from: i */
    private int f13946i;

    /* renamed from: j */
    private int f13947j;

    /* renamed from: k */
    private String f13948k;

    /* renamed from: l */
    private String f13949l;

    /* renamed from: m */
    private String f13950m;

    /* renamed from: n */
    private String f13951n;

    /* renamed from: o */
    private C6223c f13952o;

    /* renamed from: p */
    private C6312h0 f13953p;

    /* renamed from: com.adcolony.sdk.y0$a */
    class C6495a implements C6327j0 {
        C6495a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51095a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$b */
    class C6496b implements C6327j0 {
        C6496b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51105k(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$c */
    class C6497c implements C6327j0 {
        C6497c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51099e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$d */
    class C6498d implements C6327j0 {
        C6498d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51100f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$e */
    class C6499e implements C6327j0 {
        C6499e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51098d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$f */
    class C6500f implements C6327j0 {
        C6500f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51104j(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$g */
    class C6501g implements C6327j0 {
        C6501g() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51101g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$h */
    class C6502h implements C6327j0 {
        C6502h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51102h(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$i */
    class C6503i implements C6327j0 {
        C6503i() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51096b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$j */
    class C6504j implements C6327j0 {
        C6504j() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6494y0.this.mo51097c(h0Var)) {
                C6494y0.this.mo51103i(h0Var);
            }
        }
    }

    C6494y0(Context context, C6312h0 h0Var, int i, C6223c cVar) {
        super(context);
        this.f13938a = i;
        this.f13953p = h0Var;
        this.f13952o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo51093a(boolean z, int i) {
        if (i == 0) {
            return z ? 1 : 16;
        }
        if (i == 1) {
            return z ? 8388611 : 48;
        }
        if (i != 2) {
            return 17;
        }
        return z ? 8388613 : 80;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51095a(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13946i = C6235c0.m15083d(a, "x");
        this.f13947j = C6235c0.m15083d(a, "y");
        setGravity(mo51093a(true, this.f13946i) | mo51093a(false, this.f13947j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51096b(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "text", getText().toString());
        h0Var.mo50733a(b).mo50736c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo51097c(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        return C6235c0.m15083d(a, "id") == this.f13938a && C6235c0.m15083d(a, "container_id") == this.f13952o.mo50532c() && C6235c0.m15087h(a, "ad_session_id").equals(this.f13952o.mo50523a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo51098d(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "background_color");
        this.f13948k = h;
        setBackgroundColor(C6509z0.m15966f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo51099e(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13939b = C6235c0.m15083d(a, "x");
        this.f13940c = C6235c0.m15083d(a, "y");
        this.f13941d = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13942e = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f13939b, this.f13940c, 0, 0);
        layoutParams.width = this.f13941d;
        layoutParams.height = this.f13942e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo51100f(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "font_color");
        this.f13949l = h;
        setTextColor(C6509z0.m15966f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo51101g(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "font_size");
        this.f13945h = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo51102h(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "font_style");
        this.f13943f = d;
        if (d == 0) {
            setTypeface(getTypeface(), 0);
        } else if (d == 1) {
            setTypeface(getTypeface(), 1);
        } else if (d == 2) {
            setTypeface(getTypeface(), 2);
        } else if (d == 3) {
            setTypeface(getTypeface(), 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo51103i(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "text");
        this.f13950m = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo51104j(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "font_family");
        this.f13944g = d;
        if (d == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (d == 1) {
            setTypeface(Typeface.SERIF);
        } else if (d == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (d == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo51105k(C6312h0 h0Var) {
        if (C6235c0.m15076b(h0Var.mo50732a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C6328k b = C6185a.m14887b();
        C6252d c = b.mo50787c();
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C6294f1 b2 = C6235c0.m15073b();
        C6235c0.m15077b(b2, "view_id", this.f13938a);
        C6235c0.m15070a(b2, "ad_session_id", this.f13951n);
        C6235c0.m15077b(b2, "container_x", this.f13939b + x);
        C6235c0.m15077b(b2, "container_y", this.f13940c + y);
        C6235c0.m15077b(b2, "view_x", x);
        C6235c0.m15077b(b2, "view_y", y);
        C6235c0.m15077b(b2, "id", this.f13952o.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f13952o.mo50558p()) {
                    b.mo50777a(c.mo50618d().get(this.f13951n));
                }
                if (x <= 0 || x >= getWidth() || i <= 0 || i >= getHeight()) {
                    new C6312h0("AdContainer.on_touch_cancelled", this.f13952o.mo50551k(), b2).mo50736c();
                    return true;
                }
                new C6312h0("AdContainer.on_touch_ended", this.f13952o.mo50551k(), b2).mo50736c();
                return true;
            } else if (action == 2) {
                new C6312h0("AdContainer.on_touch_moved", this.f13952o.mo50551k(), b2).mo50736c();
                return true;
            } else if (action == 3) {
                new C6312h0("AdContainer.on_touch_cancelled", this.f13952o.mo50551k(), b2).mo50736c();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f13939b);
                C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f13940c);
                C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action2));
                C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C6312h0("AdContainer.on_touch_began", this.f13952o.mo50551k(), b2).mo50736c();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f13939b);
                C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f13940c);
                C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action3));
                C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f13952o.mo50558p()) {
                    b.mo50777a(c.mo50618d().get(this.f13951n));
                }
                if (x2 <= 0 || x2 >= getWidth() || y2 <= 0 || y2 >= getHeight()) {
                    new C6312h0("AdContainer.on_touch_cancelled", this.f13952o.mo50551k(), b2).mo50736c();
                    return true;
                }
                new C6312h0("AdContainer.on_touch_ended", this.f13952o.mo50551k(), b2).mo50736c();
                return true;
            }
        } else {
            new C6312h0("AdContainer.on_touch_began", this.f13952o.mo50551k(), b2).mo50736c();
            return true;
        }
    }

    C6494y0(Context context, int i, C6312h0 h0Var, int i2, C6223c cVar) {
        super(context, (AttributeSet) null, i);
        this.f13938a = i2;
        this.f13953p = h0Var;
        this.f13952o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51094a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        C6294f1 a = this.f13953p.mo50732a();
        this.f13951n = C6235c0.m15087h(a, "ad_session_id");
        this.f13939b = C6235c0.m15083d(a, "x");
        this.f13940c = C6235c0.m15083d(a, "y");
        this.f13941d = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13942e = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        this.f13944g = C6235c0.m15083d(a, "font_family");
        this.f13943f = C6235c0.m15083d(a, "font_style");
        this.f13945h = C6235c0.m15083d(a, "font_size");
        this.f13948k = C6235c0.m15087h(a, "background_color");
        this.f13949l = C6235c0.m15087h(a, "font_color");
        this.f13950m = C6235c0.m15087h(a, "text");
        this.f13946i = C6235c0.m15083d(a, "align_x");
        this.f13947j = C6235c0.m15083d(a, "align_y");
        C6328k b = C6185a.m14887b();
        if (this.f13950m.equals("")) {
            this.f13950m = "Learn More";
        }
        setVisibility(4);
        if (C6235c0.m15076b(a, "wrap_content")) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f13941d, this.f13942e);
        }
        layoutParams.gravity = 0;
        setText(this.f13950m);
        setTextSize((float) this.f13945h);
        if (C6235c0.m15076b(a, "overlay")) {
            this.f13939b = 0;
            this.f13940c = 0;
            i2 = (int) (b.mo50803n().mo50956s() * 6.0f);
            i = (int) (b.mo50803n().mo50956s() * 6.0f);
            int s = (int) (b.mo50803n().mo50956s() * 4.0f);
            setPadding(s, s, s, s);
            layoutParams.gravity = 8388693;
        } else {
            i2 = 0;
            i = 0;
        }
        layoutParams.setMargins(this.f13939b, this.f13940c, i2, i);
        this.f13952o.addView(this, layoutParams);
        int i3 = this.f13944g;
        if (i3 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i3 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i3 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i3 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i4 = this.f13943f;
        if (i4 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i4 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i4 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i4 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(mo51093a(true, this.f13946i) | mo51093a(false, this.f13947j));
        if (!this.f13948k.equals("")) {
            setBackgroundColor(C6509z0.m15966f(this.f13948k));
        }
        if (!this.f13949l.equals("")) {
            setTextColor(C6509z0.m15966f(this.f13949l));
        }
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_visible", (C6327j0) new C6496b(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_bounds", (C6327j0) new C6497c(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_font_color", (C6327j0) new C6498d(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_background_color", (C6327j0) new C6499e(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_typeface", (C6327j0) new C6500f(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_font_size", (C6327j0) new C6501g(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_font_style", (C6327j0) new C6502h(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.get_text", (C6327j0) new C6503i(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.set_text", (C6327j0) new C6504j(), true));
        this.f13952o.mo50547i().add(C6185a.m14881a("TextView.align", (C6327j0) new C6495a(), true));
        this.f13952o.mo50549j().add("TextView.set_visible");
        this.f13952o.mo50549j().add("TextView.set_bounds");
        this.f13952o.mo50549j().add("TextView.set_font_color");
        this.f13952o.mo50549j().add("TextView.set_background_color");
        this.f13952o.mo50549j().add("TextView.set_typeface");
        this.f13952o.mo50549j().add("TextView.set_font_size");
        this.f13952o.mo50549j().add("TextView.set_font_style");
        this.f13952o.mo50549j().add("TextView.get_text");
        this.f13952o.mo50549j().add("TextView.set_text");
        this.f13952o.mo50549j().add("TextView.align");
    }
}
