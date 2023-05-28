package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import kotlin.KotlinVersion;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.a0 */
class C6186a0 extends ImageView {

    /* renamed from: a */
    private int f13245a;

    /* renamed from: b */
    private int f13246b;

    /* renamed from: c */
    private int f13247c;

    /* renamed from: d */
    private int f13248d;

    /* renamed from: e */
    private int f13249e;

    /* renamed from: f */
    private boolean f13250f;

    /* renamed from: g */
    private boolean f13251g;

    /* renamed from: h */
    private boolean f13252h;

    /* renamed from: i */
    private String f13253i;

    /* renamed from: j */
    private String f13254j;

    /* renamed from: k */
    private C6312h0 f13255k;

    /* renamed from: l */
    private C6223c f13256l;

    /* renamed from: com.adcolony.sdk.a0$a */
    class C6187a implements C6327j0 {
        C6187a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6186a0.this.m14894a(h0Var)) {
                C6186a0.this.m14900d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a0$b */
    class C6188b implements C6327j0 {
        C6188b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6186a0.this.m14894a(h0Var)) {
                C6186a0.this.m14896b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a0$c */
    class C6189c implements C6327j0 {
        C6189c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6186a0.this.m14894a(h0Var)) {
                C6186a0.this.m14898c(h0Var);
            }
        }
    }

    C6186a0(Context context, C6312h0 h0Var, int i, C6223c cVar) {
        super(context);
        this.f13245a = i;
        this.f13255k = h0Var;
        this.f13256l = cVar;
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
        C6235c0.m15077b(b2, "view_id", this.f13245a);
        C6235c0.m15070a(b2, "ad_session_id", this.f13254j);
        C6235c0.m15077b(b2, "container_x", this.f13246b + x);
        C6235c0.m15077b(b2, "container_y", this.f13247c + y);
        C6235c0.m15077b(b2, "view_x", x);
        C6235c0.m15077b(b2, "view_y", y);
        C6235c0.m15077b(b2, "id", this.f13256l.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f13256l.mo50558p()) {
                    b.mo50777a(c.mo50618d().get(this.f13254j));
                }
                if (x <= 0 || x >= this.f13248d || i <= 0 || i >= this.f13249e) {
                    new C6312h0("AdContainer.on_touch_cancelled", this.f13256l.mo50551k(), b2).mo50736c();
                    return true;
                }
                new C6312h0("AdContainer.on_touch_ended", this.f13256l.mo50551k(), b2).mo50736c();
                return true;
            } else if (action == 2) {
                new C6312h0("AdContainer.on_touch_moved", this.f13256l.mo50551k(), b2).mo50736c();
                return true;
            } else if (action == 3) {
                new C6312h0("AdContainer.on_touch_cancelled", this.f13256l.mo50551k(), b2).mo50736c();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f13246b);
                C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f13247c);
                C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action2));
                C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C6312h0("AdContainer.on_touch_began", this.f13256l.mo50551k(), b2).mo50736c();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C6235c0.m15077b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f13246b);
                C6235c0.m15077b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f13247c);
                C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action3));
                C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f13256l.mo50558p()) {
                    b.mo50777a(c.mo50618d().get(this.f13254j));
                }
                if (x2 <= 0 || x2 >= this.f13248d || y2 <= 0 || y2 >= this.f13249e) {
                    new C6312h0("AdContainer.on_touch_cancelled", this.f13256l.mo50551k(), b2).mo50736c();
                    return true;
                }
                new C6312h0("AdContainer.on_touch_ended", this.f13256l.mo50551k(), b2).mo50736c();
                return true;
            }
        } else {
            new C6312h0("AdContainer.on_touch_began", this.f13256l.mo50551k(), b2).mo50736c();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m14894a(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        return C6235c0.m15083d(a, "id") == this.f13245a && C6235c0.m15083d(a, "container_id") == this.f13256l.mo50532c() && C6235c0.m15087h(a, "ad_session_id").equals(this.f13256l.mo50523a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m14896b(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13246b = C6235c0.m15083d(a, "x");
        this.f13247c = C6235c0.m15083d(a, "y");
        this.f13248d = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13249e = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        if (this.f13250f) {
            float s = (((float) this.f13249e) * C6185a.m14887b().mo50803n().mo50956s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f13249e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f13248d = intrinsicWidth;
            this.f13246b -= intrinsicWidth;
            this.f13247c -= this.f13249e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f13246b, this.f13247c, 0, 0);
        layoutParams.width = this.f13248d;
        layoutParams.height = this.f13249e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14898c(C6312h0 h0Var) {
        this.f13253i = C6235c0.m15087h(h0Var.mo50732a(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f13253i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14900d(C6312h0 h0Var) {
        if (C6235c0.m15076b(h0Var.mo50732a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50428a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        C6294f1 a = this.f13255k.mo50732a();
        this.f13254j = C6235c0.m15087h(a, "ad_session_id");
        this.f13246b = C6235c0.m15083d(a, "x");
        this.f13247c = C6235c0.m15083d(a, "y");
        this.f13248d = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13249e = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        this.f13253i = C6235c0.m15087h(a, "filepath");
        this.f13250f = C6235c0.m15076b(a, "dpi");
        this.f13251g = C6235c0.m15076b(a, "invert_y");
        this.f13252h = C6235c0.m15076b(a, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f13253i)));
        if (this.f13250f) {
            float s = (((float) this.f13249e) * C6185a.m14887b().mo50803n().mo50956s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f13249e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f13248d = intrinsicWidth;
            this.f13246b -= intrinsicWidth;
            if (this.f13251g) {
                i = this.f13247c + this.f13249e;
            } else {
                i = this.f13247c - this.f13249e;
            }
            this.f13247c = i;
        }
        setVisibility(4);
        if (this.f13252h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f13248d, this.f13249e);
        }
        layoutParams.setMargins(this.f13246b, this.f13247c, 0, 0);
        layoutParams.gravity = 0;
        this.f13256l.addView(this, layoutParams);
        this.f13256l.mo50547i().add(C6185a.m14881a("ImageView.set_visible", (C6327j0) new C6187a(), true));
        this.f13256l.mo50547i().add(C6185a.m14881a("ImageView.set_bounds", (C6327j0) new C6188b(), true));
        this.f13256l.mo50547i().add(C6185a.m14881a("ImageView.set_image", (C6327j0) new C6189c(), true));
        this.f13256l.mo50549j().add("ImageView.set_visible");
        this.f13256l.mo50549j().add("ImageView.set_bounds");
        this.f13256l.mo50549j().add("ImageView.set_image");
    }
}
