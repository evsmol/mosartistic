package com.applovin.exoplayer2.p224ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C6811ak;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7539i;
import com.applovin.exoplayer2.C7818o;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p219j.C7643g;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7742k;
import com.applovin.exoplayer2.p221l.C7759u;
import com.applovin.exoplayer2.p222m.C7816o;
import com.applovin.exoplayer2.p224ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.p224ui.C7844f;
import com.applovin.sdk.C8656R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.ui.g */
public class C7850g extends FrameLayout {

    /* renamed from: A */
    private boolean f18816A;

    /* renamed from: a */
    private final C7851a f18817a;

    /* renamed from: b */
    private final AspectRatioFrameLayout f18818b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f18819c;

    /* renamed from: d */
    private final View f18820d;

    /* renamed from: e */
    private final boolean f18821e;

    /* renamed from: f */
    private final ImageView f18822f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final SubtitleView f18823g;

    /* renamed from: h */
    private final View f18824h;

    /* renamed from: i */
    private final TextView f18825i;

    /* renamed from: j */
    private final C7844f f18826j;

    /* renamed from: k */
    private final FrameLayout f18827k;

    /* renamed from: l */
    private final FrameLayout f18828l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6814an f18829m;

    /* renamed from: n */
    private boolean f18830n;

    /* renamed from: o */
    private C7844f.C7849d f18831o;

    /* renamed from: p */
    private boolean f18832p;

    /* renamed from: q */
    private Drawable f18833q;

    /* renamed from: r */
    private int f18834r;

    /* renamed from: s */
    private boolean f18835s;

    /* renamed from: t */
    private C7742k<? super C6811ak> f18836t;

    /* renamed from: u */
    private CharSequence f18837u;

    /* renamed from: v */
    private int f18838v;

    /* renamed from: w */
    private boolean f18839w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f18840x;

    /* renamed from: y */
    private boolean f18841y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f18842z;

    /* renamed from: com.applovin.exoplayer2.ui.g$a */
    private final class C7851a implements View.OnClickListener, View.OnLayoutChangeListener, C6814an.C6820d, C7844f.C7849d {

        /* renamed from: b */
        private final C6904ba.C6906a f18844b = new C6904ba.C6906a();

        /* renamed from: c */
        private Object f18845c;

        public C7851a() {
        }

        /* renamed from: a */
        public void mo52456a() {
            if (C7850g.this.f18819c != null) {
                C7850g.this.f18819c.setVisibility(4);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo52457a(float f) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, f);
        }

        /* renamed from: a */
        public void mo55354a(int i) {
            C7850g.this.m23151m();
        }

        /* renamed from: a */
        public /* synthetic */ void mo52458a(int i, int i2) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, i, i2);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52467a(int i, boolean z) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, i, z);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52471a(C6787ab abVar, int i) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, abVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52472a(C6797ac acVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, acVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52473a(C6811ak akVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, akVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52474a(C6813am amVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, amVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52475a(C6814an.C6816a aVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, aVar);
        }

        /* renamed from: a */
        public void mo52476a(C6814an.C6821e eVar, C6814an.C6821e eVar2, int i) {
            if (C7850g.this.m23140g() && C7850g.this.f18840x) {
                C7850g.this.mo55358b();
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo52478a(C6814an anVar, C6814an.C6819c cVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, anVar, cVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52479a(C6904ba baVar, int i) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, baVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52481a(C7399a aVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, aVar);
        }

        /* renamed from: a */
        public void mo52482a(C7483ad adVar, C7644h hVar) {
            C6814an anVar = (C6814an) C7717a.m22120b(C7850g.this.f18829m);
            C6904ba S = anVar.mo52762S();
            if (!S.mo53081d()) {
                if (!anVar.mo52759P().mo54484a()) {
                    this.f18845c = S.mo52440a(anVar.mo52749F(), this.f18844b, true).f15257b;
                } else {
                    Object obj = this.f18845c;
                    if (obj != null) {
                        int c = S.mo52448c(obj);
                        if (c != -1 && anVar.mo52750G() == S.mo53078a(c, this.f18844b).f15258c) {
                            return;
                        }
                    }
                }
                C7850g.this.m23131c(false);
            }
            this.f18845c = null;
            C7850g.this.m23131c(false);
        }

        /* renamed from: a */
        public void mo52483a(C7816o oVar) {
            C7850g.this.m23141h();
        }

        /* renamed from: a */
        public /* synthetic */ void mo52484a(C7818o oVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, oVar);
        }

        /* renamed from: a */
        public void mo52491a(List<C7540a> list) {
            if (C7850g.this.f18823g != null) {
                C7850g.this.f18823g.setCues(list);
            }
        }

        @Deprecated
        /* renamed from: a */
        public /* synthetic */ void mo52493a(boolean z, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, z, i);
        }

        /* renamed from: a_ */
        public /* synthetic */ void mo52495a_(boolean z) {
            C6814an.C6820d.CC.$default$a_(this, z);
        }

        @Deprecated
        /* renamed from: b */
        public /* synthetic */ void mo52496b() {
            C6814an.C6818b.CC.$default$b(this);
        }

        /* renamed from: b */
        public void mo52497b(int i) {
            C7850g.this.m23147k();
            C7850g.this.m23149l();
            C7850g.this.m23152n();
        }

        /* renamed from: b */
        public /* synthetic */ void mo52501b(C6811ak akVar) {
            C6814an.C6820d.CC.$default$b((C6814an.C6820d) this, akVar);
        }

        /* renamed from: b */
        public void mo52507b(boolean z, int i) {
            C7850g.this.m23147k();
            C7850g.this.m23152n();
        }

        /* renamed from: b_ */
        public /* synthetic */ void mo52508b_(boolean z) {
            C6814an.C6820d.CC.$default$b_(this, z);
        }

        /* renamed from: c */
        public /* synthetic */ void mo52510c(int i) {
            C6814an.C6820d.CC.$default$c(this, i);
        }

        @Deprecated
        /* renamed from: c */
        public /* synthetic */ void mo52515c(boolean z) {
            C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, z);
        }

        /* renamed from: d */
        public /* synthetic */ void mo52517d(int i) {
            C6814an.C6820d.CC.$default$d((C6814an.C6820d) this, i);
        }

        /* renamed from: d */
        public /* synthetic */ void mo52520d(boolean z) {
            C6814an.C6820d.CC.$default$d((C6814an.C6820d) this, z);
        }

        @Deprecated
        /* renamed from: e */
        public /* synthetic */ void mo52522e(int i) {
            C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, i);
        }

        /* renamed from: e */
        public /* synthetic */ void mo52524e(boolean z) {
            C6814an.C6820d.CC.$default$e(this, z);
        }

        public void onClick(View view) {
            boolean unused = C7850g.this.m23136e();
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C7850g.m23127b((TextureView) view, C7850g.this.f18842z);
        }
    }

    public C7850g(Context context) {
        this(context, (AttributeSet) null);
    }

    public C7850g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7850g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f18817a = new C7851a();
        if (isInEditMode()) {
            this.f18818b = null;
            this.f18819c = null;
            this.f18820d = null;
            this.f18821e = false;
            this.f18822f = null;
            this.f18823g = null;
            this.f18824h = null;
            this.f18825i = null;
            this.f18826j = null;
            this.f18827k = null;
            this.f18828l = null;
            ImageView imageView = new ImageView(context2);
            if (C7728ai.f18249a >= 23) {
                m23118a(getResources(), imageView);
            } else {
                m23126b(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = C8656R.layout.applovin_exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C8656R.styleable.AppLovinPlayerView, i, 0);
            try {
                z3 = obtainStyledAttributes.hasValue(C8656R.styleable.AppLovinPlayerView_al_shutter_background_color);
                i6 = obtainStyledAttributes.getColor(C8656R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C8656R.styleable.AppLovinPlayerView_al_player_layout_id, i8);
                z2 = obtainStyledAttributes.getBoolean(C8656R.styleable.AppLovinPlayerView_al_use_artwork, true);
                i5 = obtainStyledAttributes.getResourceId(C8656R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                z = obtainStyledAttributes.getBoolean(C8656R.styleable.AppLovinPlayerView_al_use_controller, true);
                i4 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinPlayerView_al_surface_type, 1);
                i3 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i9 = obtainStyledAttributes.getInt(C8656R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z9 = obtainStyledAttributes.getBoolean(C8656R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z10 = obtainStyledAttributes.getBoolean(C8656R.styleable.AppLovinPlayerView_al_auto_show, true);
                int i10 = resourceId;
                i7 = obtainStyledAttributes.getInteger(C8656R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                boolean z11 = z9;
                this.f18835s = obtainStyledAttributes.getBoolean(C8656R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.f18835s);
                boolean z12 = obtainStyledAttributes.getBoolean(C8656R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z6 = z11;
                boolean z13 = z12;
                i8 = i10;
                i2 = i9;
                z4 = z10;
                z5 = z13;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z6 = true;
            z5 = true;
            z4 = true;
            i7 = 0;
            z3 = false;
            i6 = 0;
            z2 = true;
            i5 = 0;
            z = true;
            i4 = 1;
            i3 = 0;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C8656R.C8660id.al_exo_content_frame);
        this.f18818b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m23120a(aspectRatioFrameLayout, i3);
        }
        View findViewById = findViewById(C8656R.C8660id.al_exo_shutter);
        this.f18819c = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i6);
        }
        if (this.f18818b == null || i4 == 0) {
            this.f18820d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.f18820d = new TextureView(context2);
            } else if (i4 == 3) {
                try {
                    this.f18820d = (View) Class.forName("com.applovin.exoplayer2.m.a.i").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                    z8 = true;
                    this.f18820d.setLayoutParams(layoutParams);
                    this.f18820d.setOnClickListener(this.f18817a);
                    this.f18820d.setClickable(false);
                    this.f18818b.addView(this.f18820d, 0);
                    z7 = z8;
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i4 != 4) {
                this.f18820d = new SurfaceView(context2);
            } else {
                try {
                    this.f18820d = (View) Class.forName("com.applovin.exoplayer2.m.i").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z8 = false;
            this.f18820d.setLayoutParams(layoutParams);
            this.f18820d.setOnClickListener(this.f18817a);
            this.f18820d.setClickable(false);
            this.f18818b.addView(this.f18820d, 0);
            z7 = z8;
        }
        this.f18821e = z7;
        this.f18827k = (FrameLayout) findViewById(C8656R.C8660id.al_exo_ad_overlay);
        this.f18828l = (FrameLayout) findViewById(C8656R.C8660id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(C8656R.C8660id.al_exo_artwork);
        this.f18822f = imageView2;
        this.f18832p = z2 && imageView2 != null;
        if (i5 != 0) {
            this.f18833q = ContextCompat.getDrawable(getContext(), i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C8656R.C8660id.al_exo_subtitles);
        this.f18823g = subtitleView;
        if (subtitleView != null) {
            subtitleView.mo55283d();
            this.f18823g.mo55282c();
        }
        View findViewById2 = findViewById(C8656R.C8660id.al_exo_buffering);
        this.f18824h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f18834r = i7;
        TextView textView = (TextView) findViewById(C8656R.C8660id.al_exo_error_message);
        this.f18825i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C7844f fVar = (C7844f) findViewById(C8656R.C8660id.al_exo_controller);
        View findViewById3 = findViewById(C8656R.C8660id.al_exo_controller_placeholder);
        if (fVar != null) {
            this.f18826j = fVar;
        } else if (findViewById3 != null) {
            C7844f fVar2 = new C7844f(context2, (AttributeSet) null, 0, attributeSet2);
            this.f18826j = fVar2;
            fVar2.setId(C8656R.C8660id.al_exo_controller);
            this.f18826j.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(this.f18826j, indexOfChild);
        } else {
            this.f18826j = null;
        }
        this.f18838v = this.f18826j != null ? i2 : 0;
        this.f18841y = z6;
        this.f18839w = z4;
        this.f18840x = z5;
        this.f18830n = z && this.f18826j != null;
        mo55358b();
        m23151m();
        C7844f fVar3 = this.f18826j;
        if (fVar3 != null) {
            fVar3.mo55321a((C7844f.C7849d) this.f18817a);
        }
    }

    /* renamed from: a */
    private static void m23118a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C8656R.C8659drawable.applovin_exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(C8656R.C8658color.al_exo_edit_mode_background_color, (Resources.Theme) null));
    }

    /* renamed from: a */
    private static void m23120a(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: a */
    private void m23122a(boolean z) {
        if ((!m23140g() || !this.f18840x) && m23132c()) {
            boolean z2 = this.f18826j.mo55325c() && this.f18826j.getShowTimeoutMs() <= 0;
            boolean f = m23138f();
            if (z || z2 || f) {
                m23129b(f);
            }
        }
    }

    /* renamed from: a */
    private boolean m23123a(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* renamed from: a */
    private boolean m23124a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                mo55356a(this.f18818b, ((float) intrinsicWidth) / ((float) intrinsicHeight));
                this.f18822f.setImageDrawable(drawable);
                this.f18822f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m23125a(C6797ac acVar) {
        if (acVar.f14697l == null) {
            return false;
        }
        return m23124a((Drawable) new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(acVar.f14697l, 0, acVar.f14697l.length)));
    }

    /* renamed from: b */
    private static void m23126b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C8656R.C8659drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(C8656R.C8658color.al_exo_edit_mode_background_color));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m23127b(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate((float) i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: b */
    private void m23129b(boolean z) {
        if (m23132c()) {
            this.f18826j.setShowTimeoutMs(z ? 0 : this.f18838v);
            this.f18826j.mo55320a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m23131c(boolean z) {
        C6814an anVar = this.f18829m;
        if (anVar != null && !anVar.mo52759P().mo54484a()) {
            if (z && !this.f18835s) {
                m23146j();
            }
            C7644h Q = anVar.mo52760Q();
            for (int i = 0; i < Q.f17931a; i++) {
                C7643g a = Q.mo54863a(i);
                if (a != null) {
                    for (int i2 = 0; i2 < a.mo54810e(); i2++) {
                        if (C7759u.m22383e(a.mo54806a(i2).f18921l) == 2) {
                            m23143i();
                            return;
                        }
                    }
                    continue;
                }
            }
            m23146j();
            if (!m23134d() || (!m23125a(anVar.mo52761R()) && !m23124a(this.f18833q))) {
                m23143i();
            }
        } else if (!this.f18835s) {
            m23143i();
            m23146j();
        }
    }

    /* renamed from: c */
    private boolean m23132c() {
        if (!this.f18830n) {
            return false;
        }
        C7717a.m22115a(this.f18826j);
        return true;
    }

    /* renamed from: d */
    private boolean m23134d() {
        if (!this.f18832p) {
            return false;
        }
        C7717a.m22115a(this.f18822f);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m23136e() {
        if (!m23132c() || this.f18829m == null) {
            return false;
        }
        if (!this.f18826j.mo55325c()) {
            m23122a(true);
        } else if (this.f18841y) {
            this.f18826j.mo55323b();
        }
        return true;
    }

    /* renamed from: f */
    private boolean m23138f() {
        C6814an anVar = this.f18829m;
        if (anVar == null) {
            return true;
        }
        int t = anVar.mo52786t();
        return this.f18839w && (t == 1 || t == 4 || !this.f18829m.mo52789x());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m23140g() {
        C6814an anVar = this.f18829m;
        return anVar != null && anVar.mo52754K() && this.f18829m.mo52789x();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23141h() {
        C6814an anVar = this.f18829m;
        C7816o T = anVar != null ? anVar.mo52763T() : C7816o.f18542a;
        int i = T.f18544b;
        int i2 = T.f18545c;
        int i3 = T.f18546d;
        float f = 0.0f;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (((float) i) * T.f18547e) / ((float) i2);
        if (this.f18820d instanceof TextureView) {
            if (f2 > 0.0f && (i3 == 90 || i3 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.f18842z != 0) {
                this.f18820d.removeOnLayoutChangeListener(this.f18817a);
            }
            this.f18842z = i3;
            if (i3 != 0) {
                this.f18820d.addOnLayoutChangeListener(this.f18817a);
            }
            m23127b((TextureView) this.f18820d, this.f18842z);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f18818b;
        if (!this.f18821e) {
            f = f2;
        }
        mo55356a(aspectRatioFrameLayout, f);
    }

    /* renamed from: i */
    private void m23143i() {
        ImageView imageView = this.f18822f;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f18822f.setVisibility(4);
        }
    }

    /* renamed from: j */
    private void m23146j() {
        View view = this.f18819c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m23147k() {
        int i;
        if (this.f18824h != null) {
            C6814an anVar = this.f18829m;
            boolean z = true;
            int i2 = 0;
            if (anVar == null || anVar.mo52786t() != 2 || ((i = this.f18834r) != 2 && (i != 1 || !this.f18829m.mo52789x()))) {
                z = false;
            }
            View view = this.f18824h;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m23149l() {
        C7742k<? super C6811ak> kVar;
        TextView textView = this.f18825i;
        if (textView != null) {
            CharSequence charSequence = this.f18837u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f18825i.setVisibility(0);
                return;
            }
            C6814an anVar = this.f18829m;
            C6811ak e = anVar != null ? anVar.mo52780e() : null;
            if (e == null || (kVar = this.f18836t) == null) {
                this.f18825i.setVisibility(8);
                return;
            }
            this.f18825i.setText((CharSequence) kVar.mo55008a(e).second);
            this.f18825i.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m23151m() {
        C7844f fVar = this.f18826j;
        String str = null;
        if (fVar != null && this.f18830n) {
            if (fVar.getVisibility() != 0) {
                setContentDescription(getResources().getString(C8656R.string.al_exo_controls_show));
                return;
            } else if (this.f18841y) {
                str = getResources().getString(C8656R.string.al_exo_controls_hide);
            }
        }
        setContentDescription(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m23152n() {
        if (!m23140g() || !this.f18840x) {
            m23122a(false);
        } else {
            mo55358b();
        }
    }

    /* renamed from: a */
    public void mo55355a() {
        m23129b(m23138f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55356a(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* renamed from: a */
    public boolean mo55357a(KeyEvent keyEvent) {
        return m23132c() && this.f18826j.mo55322a(keyEvent);
    }

    /* renamed from: b */
    public void mo55358b() {
        C7844f fVar = this.f18826j;
        if (fVar != null) {
            fVar.mo55323b();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C6814an anVar = this.f18829m;
        if (anVar != null && anVar.mo52754K()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a = m23123a(keyEvent.getKeyCode());
        if ((a && m23132c() && !this.f18826j.mo55325c()) || mo55357a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m23122a(true);
            return true;
        } else if (!a || !m23132c()) {
            return false;
        } else {
            m23122a(true);
            return false;
        }
    }

    public List<C7839a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f18828l;
        if (frameLayout != null) {
            arrayList.add(new C7839a(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        C7844f fVar = this.f18826j;
        if (fVar != null) {
            arrayList.add(new C7839a(fVar, 0));
        }
        return C7033s.m18797a(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C7717a.m22116a(this.f18827k, (Object) "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f18839w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f18841y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f18838v;
    }

    public Drawable getDefaultArtwork() {
        return this.f18833q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f18828l;
    }

    public C6814an getPlayer() {
        return this.f18829m;
    }

    public int getResizeMode() {
        C7717a.m22115a(this.f18818b);
        return this.f18818b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f18823g;
    }

    public boolean getUseArtwork() {
        return this.f18832p;
    }

    public boolean getUseController() {
        return this.f18830n;
    }

    public View getVideoSurfaceView() {
        return this.f18820d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m23132c() || this.f18829m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18816A = true;
            return true;
        } else if (action != 1 || !this.f18816A) {
            return false;
        } else {
            this.f18816A = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m23132c() || this.f18829m == null) {
            return false;
        }
        m23122a(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return m23136e();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.C7836a aVar) {
        C7717a.m22115a(this.f18818b);
        this.f18818b.setAspectRatioListener(aVar);
    }

    @Deprecated
    public void setControlDispatcher(C7539i iVar) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setControlDispatcher(iVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.f18839w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f18840x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18841y = z;
        m23151m();
    }

    public void setControllerShowTimeoutMs(int i) {
        C7717a.m22115a(this.f18826j);
        this.f18838v = i;
        if (this.f18826j.mo55325c()) {
            mo55355a();
        }
    }

    public void setControllerVisibilityListener(C7844f.C7849d dVar) {
        C7717a.m22115a(this.f18826j);
        C7844f.C7849d dVar2 = this.f18831o;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                this.f18826j.mo55324b(dVar2);
            }
            this.f18831o = dVar;
            if (dVar != null) {
                this.f18826j.mo55321a(dVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C7717a.m22121b(this.f18825i != null);
        this.f18837u = charSequence;
        m23149l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f18833q != drawable) {
            this.f18833q = drawable;
            m23131c(false);
        }
    }

    public void setErrorMessageProvider(C7742k<? super C6811ak> kVar) {
        if (this.f18836t != kVar) {
            this.f18836t = kVar;
            m23149l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f18835s != z) {
            this.f18835s = z;
            m23131c(false);
        }
    }

    public void setPlayer(C6814an anVar) {
        C7717a.m22121b(Looper.myLooper() == Looper.getMainLooper());
        C7717a.m22118a(anVar == null || anVar.mo52784r() == Looper.getMainLooper());
        C6814an anVar2 = this.f18829m;
        if (anVar2 != anVar) {
            if (anVar2 != null) {
                anVar2.mo52775b((C6814an.C6820d) this.f18817a);
                if (anVar2.mo52772a(26)) {
                    View view = this.f18820d;
                    if (view instanceof TextureView) {
                        anVar2.mo52774b((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        anVar2.mo52773b((SurfaceView) view);
                    }
                }
            }
            SubtitleView subtitleView = this.f18823g;
            if (subtitleView != null) {
                subtitleView.setCues((List<C7540a>) null);
            }
            this.f18829m = anVar;
            if (m23132c()) {
                this.f18826j.setPlayer(anVar);
            }
            m23147k();
            m23149l();
            m23131c(true);
            if (anVar != null) {
                if (anVar.mo52772a(26)) {
                    View view2 = this.f18820d;
                    if (view2 instanceof TextureView) {
                        anVar.mo52768a((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        anVar.mo52767a((SurfaceView) view2);
                    }
                    m23141h();
                }
                if (this.f18823g != null && anVar.mo52772a(27)) {
                    this.f18823g.setCues(anVar.mo52764V());
                }
                anVar.mo52769a((C6814an.C6820d) this.f18817a);
                m23122a(false);
                return;
            }
            mo55358b();
        }
    }

    public void setRepeatToggleModes(int i) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C7717a.m22115a(this.f18818b);
        this.f18818b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f18834r != i) {
            this.f18834r = i;
            m23147k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C7717a.m22115a(this.f18826j);
        this.f18826j.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f18819c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        C7717a.m22121b(!z || this.f18822f != null);
        if (this.f18832p != z) {
            this.f18832p = z;
            m23131c(false);
        }
    }

    public void setUseController(boolean z) {
        C7844f fVar;
        C6814an anVar;
        C7717a.m22121b(!z || this.f18826j != null);
        if (this.f18830n != z) {
            this.f18830n = z;
            if (m23132c()) {
                fVar = this.f18826j;
                anVar = this.f18829m;
            } else {
                C7844f fVar2 = this.f18826j;
                if (fVar2 != null) {
                    fVar2.mo55323b();
                    fVar = this.f18826j;
                    anVar = null;
                }
                m23151m();
            }
            fVar.setPlayer(anVar);
            m23151m();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f18820d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
