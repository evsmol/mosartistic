package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import kotlin.KotlinVersion;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.u */
class C6436u extends EditText {

    /* renamed from: a */
    private int f13839a;

    /* renamed from: b */
    private int f13840b;

    /* renamed from: c */
    private int f13841c;

    /* renamed from: d */
    private int f13842d;

    /* renamed from: e */
    private int f13843e;

    /* renamed from: f */
    private int f13844f;

    /* renamed from: g */
    private int f13845g;

    /* renamed from: h */
    private int f13846h;

    /* renamed from: i */
    private int f13847i;

    /* renamed from: j */
    private int f13848j;

    /* renamed from: k */
    private String f13849k;

    /* renamed from: l */
    private String f13850l;

    /* renamed from: m */
    private String f13851m;

    /* renamed from: n */
    private String f13852n;

    /* renamed from: o */
    private C6223c f13853o;

    /* renamed from: p */
    private C6312h0 f13854p;

    /* renamed from: com.adcolony.sdk.u$a */
    class C6437a implements C6327j0 {
        C6437a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51026a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$b */
    class C6438b implements C6327j0 {
        C6438b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51036k(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$c */
    class C6439c implements C6327j0 {
        C6439c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51030e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$d */
    class C6440d implements C6327j0 {
        C6440d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51031f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$e */
    class C6441e implements C6327j0 {
        C6441e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51029d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$f */
    class C6442f implements C6327j0 {
        C6442f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51035j(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$g */
    class C6443g implements C6327j0 {
        C6443g() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51032g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$h */
    class C6444h implements C6327j0 {
        C6444h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51033h(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$i */
    class C6445i implements C6327j0 {
        C6445i() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51027b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$j */
    class C6446j implements C6327j0 {
        C6446j() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6436u.this.mo51028c(h0Var)) {
                C6436u.this.mo51034i(h0Var);
            }
        }
    }

    C6436u(Context context, C6312h0 h0Var, int i, C6223c cVar) {
        super(context);
        this.f13839a = i;
        this.f13854p = h0Var;
        this.f13853o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo51024a(boolean z, int i) {
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
    public void mo51026a(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13847i = C6235c0.m15083d(a, "x");
        this.f13848j = C6235c0.m15083d(a, "y");
        setGravity(mo51024a(true, this.f13847i) | mo51024a(false, this.f13848j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo51027b(C6312h0 h0Var) {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15070a(b, "text", getText().toString());
        h0Var.mo50733a(b).mo50736c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo51028c(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        return C6235c0.m15083d(a, "id") == this.f13839a && C6235c0.m15083d(a, "container_id") == this.f13853o.mo50532c() && C6235c0.m15087h(a, "ad_session_id").equals(this.f13853o.mo50523a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo51029d(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "background_color");
        this.f13850l = h;
        setBackgroundColor(C6509z0.m15966f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo51030e(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13840b = C6235c0.m15083d(a, "x");
        this.f13841c = C6235c0.m15083d(a, "y");
        this.f13842d = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13843e = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f13840b, this.f13841c, 0, 0);
        layoutParams.width = this.f13842d;
        layoutParams.height = this.f13843e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo51031f(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "font_color");
        this.f13851m = h;
        setTextColor(C6509z0.m15966f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo51032g(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "font_size");
        this.f13846h = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo51033h(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "font_style");
        this.f13844f = d;
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
    public void mo51034i(C6312h0 h0Var) {
        String h = C6235c0.m15087h(h0Var.mo50732a(), "text");
        this.f13852n = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo51035j(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "font_family");
        this.f13845g = d;
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
    public void mo51036k(C6312h0 h0Var) {
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
        C6235c0.m15077b(b2, "view_id", this.f13839a);
        C6235c0.m15070a(b2, "ad_session_id", this.f13849k);
        C6235c0.m15077b(b2, "container_x", this.f13840b + x);
        C6235c0.m15077b(b2, "container_y", this.f13841c + y);
        C6235c0.m15077b(b2, "view_x", x);
        C6235c0.m15077b(b2, "view_y", y);
        C6235c0.m15077b(b2, "id", this.f13853o.mo50532c());
        if (action == 0) {
            new C6312h0("AdContainer.on_touch_began", this.f13853o.mo50551k(), b2).mo50736c();
        } else if (action == 1) {
            if (!this.f13853o.mo50558p()) {
                b.mo50777a(c.mo50618d().get(this.f13849k));
            }
            new C6312h0("AdContainer.on_touch_ended", this.f13853o.mo50551k(), b2).mo50736c();
        } else if (action == 2) {
            new C6312h0("AdContainer.on_touch_moved", this.f13853o.mo50551k(), b2).mo50736c();
        } else if (action == 3) {
            new C6312h0("AdContainer.on_touch_cancelled", this.f13853o.mo50551k(), b2).mo50736c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f13840b);
            C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f13841c);
            C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action2));
            C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C6312h0("AdContainer.on_touch_began", this.f13853o.mo50551k(), b2).mo50736c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f13840b);
            C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f13841c);
            C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action3));
            C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f13853o.mo50558p()) {
                b.mo50777a(c.mo50618d().get(this.f13849k));
            }
            new C6312h0("AdContainer.on_touch_ended", this.f13853o.mo50551k(), b2).mo50736c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51025a() {
        C6294f1 a = this.f13854p.mo50732a();
        this.f13849k = C6235c0.m15087h(a, "ad_session_id");
        this.f13840b = C6235c0.m15083d(a, "x");
        this.f13841c = C6235c0.m15083d(a, "y");
        this.f13842d = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13843e = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        this.f13845g = C6235c0.m15083d(a, "font_family");
        this.f13844f = C6235c0.m15083d(a, "font_style");
        this.f13846h = C6235c0.m15083d(a, "font_size");
        this.f13850l = C6235c0.m15087h(a, "background_color");
        this.f13851m = C6235c0.m15087h(a, "font_color");
        this.f13852n = C6235c0.m15087h(a, "text");
        this.f13847i = C6235c0.m15083d(a, "align_x");
        this.f13848j = C6235c0.m15083d(a, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13842d, this.f13843e);
        layoutParams.setMargins(this.f13840b, this.f13841c, 0, 0);
        layoutParams.gravity = 0;
        this.f13853o.addView(this, layoutParams);
        int i = this.f13845g;
        if (i == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i2 = this.f13844f;
        if (i2 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i2 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i2 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i2 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.f13852n);
        setTextSize((float) this.f13846h);
        setGravity(mo51024a(true, this.f13847i) | mo51024a(false, this.f13848j));
        if (!this.f13850l.equals("")) {
            setBackgroundColor(C6509z0.m15966f(this.f13850l));
        }
        if (!this.f13851m.equals("")) {
            setTextColor(C6509z0.m15966f(this.f13851m));
        }
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_visible", (C6327j0) new C6438b(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_bounds", (C6327j0) new C6439c(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_font_color", (C6327j0) new C6440d(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_background_color", (C6327j0) new C6441e(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_typeface", (C6327j0) new C6442f(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_font_size", (C6327j0) new C6443g(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_font_style", (C6327j0) new C6444h(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.get_text", (C6327j0) new C6445i(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.set_text", (C6327j0) new C6446j(), true));
        this.f13853o.mo50547i().add(C6185a.m14881a("TextView.align", (C6327j0) new C6437a(), true));
        this.f13853o.mo50549j().add("TextView.set_visible");
        this.f13853o.mo50549j().add("TextView.set_bounds");
        this.f13853o.mo50549j().add("TextView.set_font_color");
        this.f13853o.mo50549j().add("TextView.set_background_color");
        this.f13853o.mo50549j().add("TextView.set_typeface");
        this.f13853o.mo50549j().add("TextView.set_font_size");
        this.f13853o.mo50549j().add("TextView.set_font_style");
        this.f13853o.mo50549j().add("TextView.get_text");
        this.f13853o.mo50549j().add("TextView.set_text");
        this.f13853o.mo50549j().add("TextView.align");
    }
}
