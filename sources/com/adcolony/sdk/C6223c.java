package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.adcolony.sdk.C6288e0;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.adcolony.sdk.c */
class C6223c extends FrameLayout {

    /* renamed from: a */
    private HashMap<Integer, C6190a1> f13369a;

    /* renamed from: b */
    private HashMap<Integer, C6494y0> f13370b;

    /* renamed from: c */
    private HashMap<Integer, C6204b1> f13371c;

    /* renamed from: d */
    private HashMap<Integer, C6436u> f13372d;

    /* renamed from: e */
    private HashMap<Integer, C6186a0> f13373e;

    /* renamed from: f */
    private HashMap<Integer, Boolean> f13374f;

    /* renamed from: g */
    private HashMap<Integer, View> f13375g;

    /* renamed from: h */
    private int f13376h;

    /* renamed from: i */
    private int f13377i;

    /* renamed from: j */
    private int f13378j;

    /* renamed from: k */
    private int f13379k;

    /* renamed from: l */
    private String f13380l;

    /* renamed from: m */
    boolean f13381m;

    /* renamed from: n */
    boolean f13382n;

    /* renamed from: o */
    private float f13383o = 0.0f;

    /* renamed from: p */
    private double f13384p = 0.0d;

    /* renamed from: q */
    private int f13385q = 0;

    /* renamed from: r */
    private int f13386r = 0;

    /* renamed from: s */
    private ArrayList<C6327j0> f13387s;

    /* renamed from: t */
    private ArrayList<String> f13388t;

    /* renamed from: u */
    private boolean f13389u;

    /* renamed from: v */
    private boolean f13390v;

    /* renamed from: w */
    private boolean f13391w;

    /* renamed from: x */
    private AdSession f13392x;

    /* renamed from: y */
    Context f13393y;

    /* renamed from: z */
    VideoView f13394z;

    /* renamed from: com.adcolony.sdk.c$a */
    class C6224a implements C6327j0 {
        C6224a() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6223c cVar = C6223c.this;
                cVar.mo50526a((View) cVar.mo50533c(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$b */
    class C6225b implements C6327j0 {
        C6225b() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6223c.this.mo50544g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$c */
    class C6226c implements C6327j0 {

        /* renamed from: com.adcolony.sdk.c$c$a */
        class C6227a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13398a;

            C6227a(C6312h0 h0Var) {
                this.f13398a = h0Var;
            }

            public void run() {
                C6223c cVar = C6223c.this;
                cVar.mo50526a((View) cVar.mo50536d(this.f13398a), FriendlyObstructionPurpose.OTHER);
            }
        }

        C6226c() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6509z0.m15953b((Runnable) new C6227a(h0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$d */
    class C6228d implements C6327j0 {

        /* renamed from: com.adcolony.sdk.c$d$a */
        class C6229a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6312h0 f13401a;

            C6229a(C6312h0 h0Var) {
                this.f13401a = h0Var;
            }

            public void run() {
                C6223c.this.mo50546h(this.f13401a);
            }
        }

        C6228d() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6509z0.m15953b((Runnable) new C6229a(h0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$e */
    class C6230e implements C6327j0 {
        C6230e() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6223c cVar = C6223c.this;
                cVar.mo50526a(cVar.mo50530b(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$f */
    class C6231f implements C6327j0 {
        C6231f() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6223c.this.mo50542f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$g */
    class C6232g implements C6327j0 {
        C6232g() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6223c cVar = C6223c.this;
                cVar.mo50526a((View) cVar.mo50522a(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$h */
    class C6233h implements C6327j0 {
        C6233h() {
        }

        /* renamed from: a */
        public void mo50430a(C6312h0 h0Var) {
            if (C6223c.this.mo50548i(h0Var)) {
                C6223c.this.mo50540e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.c$i */
    class C6234i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f13407a;

        C6234i(boolean z) {
            this.f13407a = z;
        }

        public void run() {
            C6223c cVar = C6223c.this;
            if (!cVar.f13381m) {
                cVar.m15010a(this.f13407a);
                C6223c.this.m15012b(this.f13407a);
            }
        }
    }

    C6223c(Context context, String str) {
        super(context);
        this.f13393y = context;
        this.f13380l = str;
        setBackgroundColor(-16777216);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C6190a1 mo50533c(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "id");
        C6190a1 a1Var = new C6190a1(this.f13393y, h0Var, d, this);
        a1Var.mo50434d();
        this.f13369a.put(Integer.valueOf(d), a1Var);
        this.f13375g.put(Integer.valueOf(d), a1Var);
        return a1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6204b1 mo50536d(C6312h0 h0Var) {
        C6204b1 b1Var;
        C6294f1 a = h0Var.mo50732a();
        int d = C6235c0.m15083d(a, "id");
        boolean b = C6235c0.m15076b(a, "is_module");
        C6328k b2 = C6185a.m14887b();
        if (b) {
            b1Var = b2.mo50762B().get(Integer.valueOf(C6235c0.m15083d(a, "module_id")));
            if (b1Var == null) {
                new C6288e0.C6289a().mo50644a("Module WebView created with invalid id").mo50645a(C6288e0.f13497h);
                return null;
            }
            b1Var.mo50466b(h0Var, d, this);
        } else {
            try {
                b1Var = C6204b1.m14975a(this.f13393y, h0Var, d, this);
            } catch (RuntimeException e) {
                C6288e0.C6289a aVar = new C6288e0.C6289a();
                aVar.mo50644a(e.toString() + ": during WebView initialization.").mo50644a(" Disabling AdColony.").mo50645a(C6288e0.f13497h);
                AdColony.disable();
                return null;
            }
        }
        this.f13371c.put(Integer.valueOf(d), b1Var);
        this.f13375g.put(Integer.valueOf(d), b1Var);
        C6294f1 b3 = C6235c0.m15073b();
        C6235c0.m15077b(b3, "module_id", b1Var.getWebViewModuleId());
        if (b1Var instanceof C6369l0) {
            C6235c0.m15077b(b3, "mraid_module_id", ((C6369l0) b1Var).getAdcModuleId());
        }
        h0Var.mo50733a(b3).mo50736c();
        return b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo50540e(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "id");
        View remove = this.f13375g.remove(Integer.valueOf(d));
        C6186a0 remove2 = this.f13373e.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C6252d c = C6185a.m14887b().mo50787c();
            String b = h0Var.mo50734b();
            c.mo50612a(b, "" + d);
            return false;
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo50542f(C6312h0 h0Var) {
        TextView textView;
        int d = C6235c0.m15083d(h0Var.mo50732a(), "id");
        View remove = this.f13375g.remove(Integer.valueOf(d));
        if (this.f13374f.remove(Integer.valueOf(d)).booleanValue()) {
            textView = this.f13372d.remove(Integer.valueOf(d));
        } else {
            textView = this.f13370b.remove(Integer.valueOf(d));
        }
        if (remove == null || textView == null) {
            C6252d c = C6185a.m14887b().mo50787c();
            String b = h0Var.mo50734b();
            c.mo50612a(b, "" + d);
            return false;
        }
        removeView(textView);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo50544g(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "id");
        View remove = this.f13375g.remove(Integer.valueOf(d));
        C6190a1 remove2 = this.f13369a.remove(Integer.valueOf(d));
        if (remove == null || remove2 == null) {
            C6252d c = C6185a.m14887b().mo50787c();
            String b = h0Var.mo50734b();
            c.mo50612a(b, "" + d);
            return false;
        }
        if (remove2.mo50433c()) {
            remove2.mo50439j();
        }
        remove2.mo50431a();
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo50546h(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "id");
        C6328k b = C6185a.m14887b();
        View remove = this.f13375g.remove(Integer.valueOf(d));
        C6204b1 remove2 = this.f13371c.remove(Integer.valueOf(d));
        if (remove2 == null || remove == null) {
            C6252d c = b.mo50787c();
            String b2 = h0Var.mo50734b();
            c.mo50612a(b2, "" + d);
            return false;
        }
        if (remove2 instanceof C6360k0) {
            b.mo50807r().mo50746b((C6360k0) remove2);
        }
        removeView(remove2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo50548i(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        return C6235c0.m15083d(a, "container_id") == this.f13378j && C6235c0.m15087h(a, "ad_session_id").equals(this.f13380l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo50550j(C6312h0 h0Var) {
        Rect rect;
        this.f13369a = new HashMap<>();
        this.f13370b = new HashMap<>();
        this.f13371c = new HashMap<>();
        this.f13372d = new HashMap<>();
        this.f13373e = new HashMap<>();
        this.f13374f = new HashMap<>();
        this.f13375g = new HashMap<>();
        this.f13387s = new ArrayList<>();
        this.f13388t = new ArrayList<>();
        C6294f1 a = h0Var.mo50732a();
        if (C6235c0.m15076b(a, "transparent")) {
            setBackgroundColor(0);
        }
        this.f13378j = C6235c0.m15083d(a, "id");
        this.f13376h = C6235c0.m15083d(a, IabUtils.KEY_WIDTH);
        this.f13377i = C6235c0.m15083d(a, IabUtils.KEY_HEIGHT);
        this.f13379k = C6235c0.m15083d(a, "module_id");
        this.f13382n = C6235c0.m15076b(a, "viewability_enabled");
        this.f13389u = this.f13378j == 1;
        C6328k b = C6185a.m14887b();
        if (this.f13376h == 0 && this.f13377i == 0) {
            if (this.f13391w) {
                rect = b.mo50803n().mo50961x();
            } else {
                rect = b.mo50803n().mo50960w();
            }
            this.f13376h = rect.width();
            this.f13377i = rect.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f13376h, this.f13377i));
        }
        this.f13387s.add(C6185a.m14881a("VideoView.create", (C6327j0) new C6224a(), true));
        this.f13387s.add(C6185a.m14881a("VideoView.destroy", (C6327j0) new C6225b(), true));
        this.f13387s.add(C6185a.m14881a("WebView.create", (C6327j0) new C6226c(), true));
        this.f13387s.add(C6185a.m14881a("WebView.destroy", (C6327j0) new C6228d(), true));
        this.f13387s.add(C6185a.m14881a("TextView.create", (C6327j0) new C6230e(), true));
        this.f13387s.add(C6185a.m14881a("TextView.destroy", (C6327j0) new C6231f(), true));
        this.f13387s.add(C6185a.m14881a("ImageView.create", (C6327j0) new C6232g(), true));
        this.f13387s.add(C6185a.m14881a("ImageView.destroy", (C6327j0) new C6233h(), true));
        this.f13388t.add("VideoView.create");
        this.f13388t.add("VideoView.destroy");
        this.f13388t.add("WebView.create");
        this.f13388t.add("WebView.destroy");
        this.f13388t.add("TextView.create");
        this.f13388t.add("TextView.destroy");
        this.f13388t.add("ImageView.create");
        this.f13388t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.f13393y);
        this.f13394z = videoView;
        videoView.setVisibility(8);
        addView(this.f13394z);
        setClipToPadding(false);
        if (this.f13382n) {
            m15012b(C6235c0.m15076b(h0Var.mo50732a(), "advanced_viewability"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo50551k() {
        return this.f13379k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public HashMap<Integer, C6494y0> mo50552l() {
        return this.f13370b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public HashMap<Integer, C6190a1> mo50553m() {
        return this.f13369a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public HashMap<Integer, C6204b1> mo50554n() {
        return this.f13371c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo50555o() {
        return this.f13390v;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C6328k b = C6185a.m14887b();
        C6252d c = b.mo50787c();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C6294f1 b2 = C6235c0.m15073b();
        C6235c0.m15077b(b2, "view_id", -1);
        C6235c0.m15070a(b2, "ad_session_id", this.f13380l);
        C6235c0.m15077b(b2, "container_x", x);
        C6235c0.m15077b(b2, "container_y", y);
        C6235c0.m15077b(b2, "view_x", x);
        C6235c0.m15077b(b2, "view_y", y);
        C6235c0.m15077b(b2, "id", this.f13378j);
        if (action == 0) {
            new C6312h0("AdContainer.on_touch_began", this.f13379k, b2).mo50736c();
        } else if (action == 1) {
            if (!this.f13389u) {
                b.mo50777a(c.mo50618d().get(this.f13380l));
            }
            new C6312h0("AdContainer.on_touch_ended", this.f13379k, b2).mo50736c();
        } else if (action == 2) {
            new C6312h0("AdContainer.on_touch_moved", this.f13379k, b2).mo50736c();
        } else if (action == 3) {
            new C6312h0("AdContainer.on_touch_cancelled", this.f13379k, b2).mo50736c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            C6235c0.m15077b(b2, "container_x", (int) motionEvent2.getX(action2));
            C6235c0.m15077b(b2, "container_y", (int) motionEvent2.getY(action2));
            C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action2));
            C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C6312h0("AdContainer.on_touch_began", this.f13379k, b2).mo50736c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            C6235c0.m15077b(b2, "container_x", (int) motionEvent2.getX(action3));
            C6235c0.m15077b(b2, "container_y", (int) motionEvent2.getY(action3));
            C6235c0.m15077b(b2, "view_x", (int) motionEvent2.getX(action3));
            C6235c0.m15077b(b2, "view_y", (int) motionEvent2.getY(action3));
            C6235c0.m15077b(b2, "x", (int) motionEvent2.getX(action3));
            C6235c0.m15077b(b2, "y", (int) motionEvent2.getY(action3));
            if (!this.f13389u) {
                b.mo50777a(c.mo50618d().get(this.f13380l));
            }
            new C6312h0("AdContainer.on_touch_ended", this.f13379k, b2).mo50736c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo50558p() {
        return this.f13389u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo50559q() {
        return this.f13391w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6186a0 mo50522a(C6312h0 h0Var) {
        int d = C6235c0.m15083d(h0Var.mo50732a(), "id");
        C6186a0 a0Var = new C6186a0(this.f13393y, h0Var, d, this);
        a0Var.mo50428a();
        this.f13373e.put(Integer.valueOf(d), a0Var);
        this.f13375g.put(Integer.valueOf(d), a0Var);
        return a0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo50530b(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        int d = C6235c0.m15083d(a, "id");
        if (C6235c0.m15076b(a, "editable")) {
            C6436u uVar = new C6436u(this.f13393y, h0Var, d, this);
            uVar.mo51025a();
            this.f13372d.put(Integer.valueOf(d), uVar);
            this.f13375g.put(Integer.valueOf(d), uVar);
            this.f13374f.put(Integer.valueOf(d), Boolean.TRUE);
            return uVar;
        } else if (!C6235c0.m15076b(a, "button")) {
            C6494y0 y0Var = new C6494y0(this.f13393y, h0Var, d, this);
            y0Var.mo51094a();
            this.f13370b.put(Integer.valueOf(d), y0Var);
            this.f13375g.put(Integer.valueOf(d), y0Var);
            this.f13374f.put(Integer.valueOf(d), Boolean.FALSE);
            return y0Var;
        } else {
            C6494y0 y0Var2 = new C6494y0(this.f13393y, 16974145, h0Var, d, this);
            y0Var2.mo51094a();
            this.f13370b.put(Integer.valueOf(d), y0Var2);
            this.f13375g.put(Integer.valueOf(d), y0Var2);
            this.f13374f.put(Integer.valueOf(d), Boolean.FALSE);
            return y0Var2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ArrayList<C6327j0> mo50547i() {
        return this.f13387s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo50532c() {
        return this.f13378j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15010a(boolean z) {
        C6204b1 b1Var;
        double d;
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = C6185a.m14887b().mo50787c().mo50618d().get(this.f13380l);
        if (adColonyAdView == null) {
            b1Var = null;
        } else {
            b1Var = adColonyAdView.getWebView();
        }
        C6204b1 b1Var2 = b1Var;
        Context a = C6185a.m14880a();
        boolean z2 = true;
        float a2 = C6308g1.m15310a(view, a, true, z, true, adColonyAdView != null);
        if (a == null) {
            d = 0.0d;
        } else {
            d = C6509z0.m15921a(C6509z0.m15926a(a));
        }
        int a3 = C6509z0.m15924a((View) b1Var2);
        int b = C6509z0.m15943b((View) b1Var2);
        if (a3 == this.f13385q && b == this.f13386r) {
            z2 = false;
        }
        if (z2) {
            this.f13385q = a3;
            this.f13386r = b;
            m15008a(a3, b, b1Var2);
        }
        if (!(this.f13383o == a2 && this.f13384p == d && !z2)) {
            m15007a(a2, d);
        }
        this.f13383o = a2;
        this.f13384p = d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50534c(boolean z) {
        this.f13389u = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public HashMap<Integer, View> mo50538e() {
        return this.f13375g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50539e(boolean z) {
        this.f13390v = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public HashMap<Integer, Boolean> mo50543g() {
        return this.f13374f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public HashMap<Integer, C6186a0> mo50545h() {
        return this.f13373e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public HashMap<Integer, C6436u> mo50541f() {
        return this.f13372d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15012b(boolean z) {
        C6509z0.m15938a((Runnable) new C6234i(z), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo50529b() {
        return this.f13377i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50531b(int i) {
        this.f13376h = i;
    }

    /* renamed from: a */
    private void m15008a(int i, int i2, C6204b1 b1Var) {
        float s = C6185a.m14887b().mo50803n().mo50956s();
        if (b1Var != null) {
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15077b(b, "app_orientation", C6509z0.m15960d(C6509z0.m15967f()));
            C6235c0.m15077b(b, IabUtils.KEY_WIDTH, (int) (((float) b1Var.getCurrentWidth()) / s));
            C6235c0.m15077b(b, IabUtils.KEY_HEIGHT, (int) (((float) b1Var.getCurrentHeight()) / s));
            C6235c0.m15077b(b, "x", i);
            C6235c0.m15077b(b, "y", i2);
            C6235c0.m15070a(b, "ad_session_id", this.f13380l);
            new C6312h0("MRAID.on_size_change", this.f13379k, b).mo50736c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo50535d() {
        return this.f13376h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo50537d(boolean z) {
        this.f13391w = z;
    }

    /* renamed from: a */
    private void m15007a(float f, double d) {
        C6294f1 b = C6235c0.m15073b();
        C6235c0.m15077b(b, "id", this.f13378j);
        C6235c0.m15070a(b, "ad_session_id", this.f13380l);
        C6235c0.m15067a(b, "exposure", (double) f);
        C6235c0.m15067a(b, "volume", d);
        new C6312h0("AdContainer.on_exposure_change", this.f13379k, b).mo50736c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo50523a() {
        return this.f13380l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50524a(int i) {
        this.f13377i = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50527a(AdSession adSession) {
        this.f13392x = adSession;
        mo50528a((Map) this.f13375g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50528a(Map map) {
        if (this.f13392x != null && map != null) {
            for (Map.Entry value : map.entrySet()) {
                mo50526a((View) value.getValue(), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50526a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.f13392x;
        if (adSession != null && view != null) {
            try {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50525a(View view) {
        AdSession adSession = this.f13392x;
        if (adSession != null && view != null) {
            try {
                adSession.removeFriendlyObstruction(view);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ArrayList<String> mo50549j() {
        return this.f13388t;
    }
}
