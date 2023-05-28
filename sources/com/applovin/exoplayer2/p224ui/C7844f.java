package com.applovin.exoplayer2.p224ui;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C6811ak;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.C7539i;
import com.applovin.exoplayer2.C7818o;
import com.applovin.exoplayer2.C7833t;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p209i.C7540a;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7719ab;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p222m.C7816o;
import com.applovin.exoplayer2.p224ui.C7859k;
import com.applovin.sdk.C8656R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.applovin.exoplayer2.ui.f */
public class C7844f extends FrameLayout {

    /* renamed from: A */
    private final Drawable f18760A;

    /* renamed from: B */
    private final Drawable f18761B;

    /* renamed from: C */
    private final float f18762C;

    /* renamed from: D */
    private final float f18763D;

    /* renamed from: E */
    private final String f18764E;

    /* renamed from: F */
    private final String f18765F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C6814an f18766G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C7539i f18767H;

    /* renamed from: I */
    private C7848c f18768I;

    /* renamed from: J */
    private boolean f18769J;

    /* renamed from: K */
    private boolean f18770K;

    /* renamed from: L */
    private boolean f18771L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f18772M;

    /* renamed from: N */
    private int f18773N = 5000;

    /* renamed from: O */
    private int f18774O = 200;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f18775P = 0;

    /* renamed from: Q */
    private boolean f18776Q = true;

    /* renamed from: R */
    private boolean f18777R = true;

    /* renamed from: S */
    private boolean f18778S = true;

    /* renamed from: T */
    private boolean f18779T = true;

    /* renamed from: U */
    private boolean f18780U = false;

    /* renamed from: V */
    private long f18781V = -9223372036854775807L;

    /* renamed from: W */
    private long[] f18782W;

    /* renamed from: a */
    private final C7847b f18783a;

    /* renamed from: aa */
    private boolean[] f18784aa;

    /* renamed from: ab */
    private long[] f18785ab;

    /* renamed from: ac */
    private boolean[] f18786ac;

    /* renamed from: ad */
    private long f18787ad;

    /* renamed from: ae */
    private long f18788ae;

    /* renamed from: af */
    private long f18789af;

    /* renamed from: b */
    private final CopyOnWriteArrayList<C7849d> f18790b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final View f18791c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f18792d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View f18793e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View f18794f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final View f18795g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final View f18796h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ImageView f18797i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ImageView f18798j;

    /* renamed from: k */
    private final View f18799k;

    /* renamed from: l */
    private final TextView f18800l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final TextView f18801m;

    /* renamed from: n */
    private final C7859k f18802n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final StringBuilder f18803o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Formatter f18804p;

    /* renamed from: q */
    private final C6904ba.C6906a f18805q;

    /* renamed from: r */
    private final C6904ba.C6908c f18806r;

    /* renamed from: s */
    private final Runnable f18807s;

    /* renamed from: t */
    private final Runnable f18808t;

    /* renamed from: u */
    private final Drawable f18809u;

    /* renamed from: v */
    private final Drawable f18810v;

    /* renamed from: w */
    private final Drawable f18811w;

    /* renamed from: x */
    private final String f18812x;

    /* renamed from: y */
    private final String f18813y;

    /* renamed from: z */
    private final String f18814z;

    /* renamed from: com.applovin.exoplayer2.ui.f$a */
    private static final class C7846a {
        /* renamed from: a */
        public static boolean m23081a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.f$b */
    private final class C7847b implements View.OnClickListener, C6814an.C6820d, C7859k.C7860a {
        private C7847b() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo52456a() {
            C6814an.C6820d.CC.$default$a(this);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52457a(float f) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, f);
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
        public /* synthetic */ void mo52476a(C6814an.C6821e eVar, C6814an.C6821e eVar2, int i) {
            C6814an.C6820d.CC.$default$a(this, eVar, eVar2, i);
        }

        /* renamed from: a */
        public void mo52478a(C6814an anVar, C6814an.C6819c cVar) {
            if (cVar.mo52801a(4, 5)) {
                C7844f.this.m23051f();
            }
            if (cVar.mo52801a(4, 5, 7)) {
                C7844f.this.m23062k();
            }
            if (cVar.mo52800a(8)) {
                C7844f.this.m23056h();
            }
            if (cVar.mo52800a(9)) {
                C7844f.this.m23058i();
            }
            if (cVar.mo52801a(8, 9, 11, 0, 13)) {
                C7844f.this.m23054g();
            }
            if (cVar.mo52801a(11, 0)) {
                C7844f.this.m23060j();
            }
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
        public /* synthetic */ void mo52482a(C7483ad adVar, C7644h hVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, adVar, hVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52483a(C7816o oVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, oVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52484a(C7818o oVar) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, oVar);
        }

        /* renamed from: a */
        public void mo55349a(C7859k kVar, long j) {
            boolean unused = C7844f.this.f18772M = true;
            if (C7844f.this.f18801m != null) {
                C7844f.this.f18801m.setText(C7728ai.m22201a(C7844f.this.f18803o, C7844f.this.f18804p, j));
            }
        }

        /* renamed from: a */
        public void mo55350a(C7859k kVar, long j, boolean z) {
            boolean unused = C7844f.this.f18772M = false;
            if (!z && C7844f.this.f18766G != null) {
                C7844f fVar = C7844f.this;
                fVar.m23033a(fVar.f18766G, j);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo52491a(List<C7540a> list) {
            C6814an.C6820d.CC.$default$a((C6814an.C6820d) this, (List) list);
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
        public /* synthetic */ void mo52497b(int i) {
            C6814an.C6820d.CC.$default$b((C6814an.C6820d) this, i);
        }

        /* renamed from: b */
        public /* synthetic */ void mo52501b(C6811ak akVar) {
            C6814an.C6820d.CC.$default$b((C6814an.C6820d) this, akVar);
        }

        /* renamed from: b */
        public void mo55351b(C7859k kVar, long j) {
            if (C7844f.this.f18801m != null) {
                C7844f.this.f18801m.setText(C7728ai.m22201a(C7844f.this.f18803o, C7844f.this.f18804p, j));
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo52507b(boolean z, int i) {
            C6814an.C6820d.CC.$default$b(this, z, i);
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
            C6814an j = C7844f.this.f18766G;
            if (j != null) {
                if (C7844f.this.f18792d == view) {
                    C7844f.this.f18767H.mo54632c(j);
                } else if (C7844f.this.f18791c == view) {
                    C7844f.this.f18767H.mo54630b(j);
                } else if (C7844f.this.f18795g == view) {
                    if (j.mo52786t() != 4) {
                        C7844f.this.f18767H.mo54634e(j);
                    }
                } else if (C7844f.this.f18796h == view) {
                    C7844f.this.f18767H.mo54633d(j);
                } else if (C7844f.this.f18793e == view) {
                    C7844f.this.m23042b(j);
                } else if (C7844f.this.f18794f == view) {
                    C7844f.this.m23045c(j);
                } else if (C7844f.this.f18797i == view) {
                    C7844f.this.f18767H.mo54626a(j, C7719ab.m22125a(j.mo52790y(), C7844f.this.f18775P));
                } else if (C7844f.this.f18798j == view) {
                    C7844f.this.f18767H.mo54631b(j, !j.mo52791z());
                }
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.ui.f$c */
    public interface C7848c {
        /* renamed from: a */
        void mo55353a(long j, long j2);
    }

    /* renamed from: com.applovin.exoplayer2.ui.f$d */
    public interface C7849d {
        /* renamed from: a */
        void mo55354a(int i);
    }

    static {
        C7833t.m22962a("goog.exo.ui");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7844f(android.content.Context r4, android.util.AttributeSet r5, int r6, android.util.AttributeSet r7) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            int r5 = com.applovin.sdk.C8656R.layout.applovin_exo_player_control_view
            r0 = 5000(0x1388, float:7.006E-42)
            r3.f18773N = r0
            r0 = 0
            r3.f18775P = r0
            r1 = 200(0xc8, float:2.8E-43)
            r3.f18774O = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f18781V = r1
            r1 = 1
            r3.f18776Q = r1
            r3.f18777R = r1
            r3.f18778S = r1
            r3.f18779T = r1
            r3.f18780U = r0
            if (r7 == 0) goto L_0x008c
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int[] r2 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r7, r2, r6, r0)
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_show_timeout     // Catch:{ all -> 0x0087 }
            int r2 = r3.f18773N     // Catch:{ all -> 0x0087 }
            int r1 = r6.getInt(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.f18773N = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_controller_layout_id     // Catch:{ all -> 0x0087 }
            int r5 = r6.getResourceId(r1, r5)     // Catch:{ all -> 0x0087 }
            int r1 = r3.f18775P     // Catch:{ all -> 0x0087 }
            int r1 = m23031a((android.content.res.TypedArray) r6, (int) r1)     // Catch:{ all -> 0x0087 }
            r3.f18775P = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_show_rewind_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.f18776Q     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.f18776Q = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_show_fastforward_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.f18777R     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.f18777R = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_show_previous_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.f18778S     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.f18778S = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_show_next_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.f18779T     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.f18779T = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_show_shuffle_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.f18780U     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.f18780U = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.C8656R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval     // Catch:{ all -> 0x0087 }
            int r2 = r3.f18774O     // Catch:{ all -> 0x0087 }
            int r1 = r6.getInt(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.setTimeBarMinUpdateInterval(r1)     // Catch:{ all -> 0x0087 }
            r6.recycle()
            goto L_0x008c
        L_0x0087:
            r4 = move-exception
            r6.recycle()
            throw r4
        L_0x008c:
            java.util.concurrent.CopyOnWriteArrayList r6 = new java.util.concurrent.CopyOnWriteArrayList
            r6.<init>()
            r3.f18790b = r6
            com.applovin.exoplayer2.ba$a r6 = new com.applovin.exoplayer2.ba$a
            r6.<init>()
            r3.f18805q = r6
            com.applovin.exoplayer2.ba$c r6 = new com.applovin.exoplayer2.ba$c
            r6.<init>()
            r3.f18806r = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r3.f18803o = r6
            java.util.Formatter r6 = new java.util.Formatter
            java.lang.StringBuilder r1 = r3.f18803o
            java.util.Locale r2 = java.util.Locale.getDefault()
            r6.<init>(r1, r2)
            r3.f18804p = r6
            long[] r6 = new long[r0]
            r3.f18782W = r6
            boolean[] r6 = new boolean[r0]
            r3.f18784aa = r6
            long[] r6 = new long[r0]
            r3.f18785ab = r6
            boolean[] r6 = new boolean[r0]
            r3.f18786ac = r6
            com.applovin.exoplayer2.ui.f$b r6 = new com.applovin.exoplayer2.ui.f$b
            r1 = 0
            r6.<init>()
            r3.f18783a = r6
            com.applovin.exoplayer2.j r6 = new com.applovin.exoplayer2.j
            r6.<init>()
            r3.f18767H = r6
            com.applovin.exoplayer2.ui.-$$Lambda$f$HOUhDgOu5XHOS9rBEb_jr5wCE8g r6 = new com.applovin.exoplayer2.ui.-$$Lambda$f$HOUhDgOu5XHOS9rBEb_jr5wCE8g
            r6.<init>()
            r3.f18807s = r6
            com.applovin.exoplayer2.ui.-$$Lambda$UYas5eXFtG7n_uq6CrQ8KdCtlyI r6 = new com.applovin.exoplayer2.ui.-$$Lambda$UYas5eXFtG7n_uq6CrQ8KdCtlyI
            r6.<init>()
            r3.f18808t = r6
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r4)
            r6.inflate(r5, r3)
            r5 = 262144(0x40000, float:3.67342E-40)
            r3.setDescendantFocusability(r5)
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_progress
            android.view.View r5 = r3.findViewById(r5)
            com.applovin.exoplayer2.ui.k r5 = (com.applovin.exoplayer2.p224ui.C7859k) r5
            int r6 = com.applovin.sdk.C8656R.C8660id.al_exo_progress_placeholder
            android.view.View r6 = r3.findViewById(r6)
            if (r5 == 0) goto L_0x0101
        L_0x00fe:
            r3.f18802n = r5
            goto L_0x0127
        L_0x0101:
            if (r6 == 0) goto L_0x0125
            com.applovin.exoplayer2.ui.d r5 = new com.applovin.exoplayer2.ui.d
            r5.<init>(r4, r1, r0, r7)
            int r7 = com.applovin.sdk.C8656R.C8660id.al_exo_progress
            r5.setId(r7)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r5.setLayoutParams(r7)
            android.view.ViewParent r7 = r6.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r1 = r7.indexOfChild(r6)
            r7.removeView(r6)
            r7.addView(r5, r1)
            goto L_0x00fe
        L_0x0125:
            r3.f18802n = r1
        L_0x0127:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_duration
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.f18800l = r5
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_position
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.f18801m = r5
            com.applovin.exoplayer2.ui.k r5 = r3.f18802n
            if (r5 == 0) goto L_0x0144
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.mo55293a(r6)
        L_0x0144:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_play
            android.view.View r5 = r3.findViewById(r5)
            r3.f18793e = r5
            if (r5 == 0) goto L_0x0153
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x0153:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_pause
            android.view.View r5 = r3.findViewById(r5)
            r3.f18794f = r5
            if (r5 == 0) goto L_0x0162
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x0162:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_prev
            android.view.View r5 = r3.findViewById(r5)
            r3.f18791c = r5
            if (r5 == 0) goto L_0x0171
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x0171:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_next
            android.view.View r5 = r3.findViewById(r5)
            r3.f18792d = r5
            if (r5 == 0) goto L_0x0180
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x0180:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_rew
            android.view.View r5 = r3.findViewById(r5)
            r3.f18796h = r5
            if (r5 == 0) goto L_0x018f
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x018f:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_ffwd
            android.view.View r5 = r3.findViewById(r5)
            r3.f18795g = r5
            if (r5 == 0) goto L_0x019e
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x019e:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_repeat_toggle
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.f18797i = r5
            if (r5 == 0) goto L_0x01af
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x01af:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_shuffle
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.f18798j = r5
            if (r5 == 0) goto L_0x01c0
            com.applovin.exoplayer2.ui.f$b r6 = r3.f18783a
            r5.setOnClickListener(r6)
        L_0x01c0:
            int r5 = com.applovin.sdk.C8656R.C8660id.al_exo_vr
            android.view.View r5 = r3.findViewById(r5)
            r3.f18799k = r5
            r3.setShowVrButton(r0)
            android.view.View r5 = r3.f18799k
            r3.m23037a((boolean) r0, (boolean) r0, (android.view.View) r5)
            android.content.res.Resources r4 = r4.getResources()
            int r5 = com.applovin.sdk.C8656R.integer.al_exo_media_button_opacity_percentage_enabled
            int r5 = r4.getInteger(r5)
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            r3.f18762C = r5
            int r5 = com.applovin.sdk.C8656R.integer.al_exo_media_button_opacity_percentage_disabled
            int r5 = r4.getInteger(r5)
            float r5 = (float) r5
            float r5 = r5 / r6
            r3.f18763D = r5
            int r5 = com.applovin.sdk.C8656R.C8659drawable.al_exo_controls_repeat_off
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.f18809u = r5
            int r5 = com.applovin.sdk.C8656R.C8659drawable.al_exo_controls_repeat_one
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.f18810v = r5
            int r5 = com.applovin.sdk.C8656R.C8659drawable.al_exo_controls_repeat_all
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.f18811w = r5
            int r5 = com.applovin.sdk.C8656R.C8659drawable.al_exo_controls_shuffle_on
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.f18760A = r5
            int r5 = com.applovin.sdk.C8656R.C8659drawable.al_exo_controls_shuffle_off
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.f18761B = r5
            int r5 = com.applovin.sdk.C8656R.string.al_exo_controls_repeat_off_description
            java.lang.String r5 = r4.getString(r5)
            r3.f18812x = r5
            int r5 = com.applovin.sdk.C8656R.string.al_exo_controls_repeat_one_description
            java.lang.String r5 = r4.getString(r5)
            r3.f18813y = r5
            int r5 = com.applovin.sdk.C8656R.string.al_exo_controls_repeat_all_description
            java.lang.String r5 = r4.getString(r5)
            r3.f18814z = r5
            int r5 = com.applovin.sdk.C8656R.string.al_exo_controls_shuffle_on_description
            java.lang.String r5 = r4.getString(r5)
            r3.f18764E = r5
            int r5 = com.applovin.sdk.C8656R.string.al_exo_controls_shuffle_off_description
            java.lang.String r4 = r4.getString(r5)
            r3.f18765F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p224ui.C7844f.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    private static int m23031a(TypedArray typedArray, int i) {
        return typedArray.getInt(C8656R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i);
    }

    /* renamed from: a */
    private void m23032a(C6814an anVar) {
        int t = anVar.mo52786t();
        if (t == 1 || t == 4 || !anVar.mo52789x()) {
            m23042b(anVar);
        } else {
            m23045c(anVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23033a(C6814an anVar, long j) {
        int i;
        C6904ba S = anVar.mo52762S();
        if (this.f18771L && !S.mo53081d()) {
            int b = S.mo52823b();
            i = 0;
            while (true) {
                long c = S.mo53079a(i, this.f18806r).mo53107c();
                if (j < c) {
                    break;
                } else if (i == b - 1) {
                    j = c;
                    break;
                } else {
                    j -= c;
                    i++;
                }
            }
        } else {
            i = anVar.mo52750G();
        }
        m23039a(anVar, i, j);
        m23062k();
    }

    /* renamed from: a */
    private void m23037a(boolean z, boolean z2, View view) {
        if (view != null) {
            view.setEnabled(z2);
            view.setAlpha(z2 ? this.f18762C : this.f18763D);
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    private static boolean m23038a(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: a */
    private boolean m23039a(C6814an anVar, int i, long j) {
        return this.f18767H.mo54627a(anVar, i, j);
    }

    /* renamed from: a */
    private static boolean m23040a(C6904ba baVar, C6904ba.C6908c cVar) {
        if (baVar.mo52823b() > 100) {
            return false;
        }
        int b = baVar.mo52823b();
        for (int i = 0; i < b; i++) {
            if (baVar.mo53079a(i, cVar).f15284o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m23042b(C6814an anVar) {
        int t = anVar.mo52786t();
        if (t == 1) {
            this.f18767H.mo54625a(anVar);
        } else if (t == 4) {
            m23039a(anVar, anVar.mo52750G(), -9223372036854775807L);
        }
        this.f18767H.mo54628a(anVar, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m23045c(C6814an anVar) {
        this.f18767H.mo54628a(anVar, false);
    }

    /* renamed from: d */
    private void m23047d() {
        removeCallbacks(this.f18808t);
        if (this.f18773N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f18773N;
            this.f18781V = uptimeMillis + ((long) i);
            if (this.f18769J) {
                postDelayed(this.f18808t, (long) i);
                return;
            }
            return;
        }
        this.f18781V = -9223372036854775807L;
    }

    /* renamed from: e */
    private void m23049e() {
        m23051f();
        m23054g();
        m23056h();
        m23058i();
        m23060j();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m23051f() {
        boolean z;
        boolean z2;
        if (mo55325c() && this.f18769J) {
            boolean n = m23068n();
            View view = this.f18793e;
            int i = 8;
            boolean z3 = true;
            if (view != null) {
                z2 = (n && view.isFocused()) | false;
                z = (C7728ai.f18249a < 21 ? z2 : n && C7846a.m23081a(this.f18793e)) | false;
                this.f18793e.setVisibility(n ? 8 : 0);
            } else {
                z2 = false;
                z = false;
            }
            View view2 = this.f18794f;
            if (view2 != null) {
                z2 |= !n && view2.isFocused();
                if (C7728ai.f18249a < 21) {
                    z3 = z2;
                } else if (n || !C7846a.m23081a(this.f18794f)) {
                    z3 = false;
                }
                z |= z3;
                View view3 = this.f18794f;
                if (n) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z2) {
                m23064l();
            }
            if (z) {
                m23066m();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m23054g() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (mo55325c() && this.f18769J) {
            C6814an anVar = this.f18766G;
            boolean z5 = false;
            if (anVar != null) {
                boolean a = anVar.mo52772a(4);
                boolean a2 = anVar.mo52772a(6);
                z = anVar.mo52772a(10) && this.f18767H.mo54624a();
                if (anVar.mo52772a(11) && this.f18767H.mo54629b()) {
                    z5 = true;
                }
                boolean z6 = a;
                z3 = anVar.mo52772a(8);
                z4 = z5;
                z5 = a2;
                z2 = z6;
            } else {
                z4 = false;
                z3 = false;
                z2 = false;
                z = false;
            }
            m23037a(this.f18778S, z5, this.f18791c);
            m23037a(this.f18776Q, z, this.f18796h);
            m23037a(this.f18777R, z4, this.f18795g);
            m23037a(this.f18779T, z3, this.f18792d);
            C7859k kVar = this.f18802n;
            if (kVar != null) {
                kVar.setEnabled(z2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23056h() {
        ImageView imageView;
        String str;
        ImageView imageView2;
        if (mo55325c() && this.f18769J && (imageView = this.f18797i) != null) {
            if (this.f18775P == 0) {
                m23037a(false, false, (View) imageView);
                return;
            }
            C6814an anVar = this.f18766G;
            if (anVar == null) {
                m23037a(true, false, (View) imageView);
                this.f18797i.setImageDrawable(this.f18809u);
                this.f18797i.setContentDescription(this.f18812x);
                return;
            }
            m23037a(true, true, (View) imageView);
            int y = anVar.mo52790y();
            if (y == 0) {
                this.f18797i.setImageDrawable(this.f18809u);
                imageView2 = this.f18797i;
                str = this.f18812x;
            } else if (y != 1) {
                if (y == 2) {
                    this.f18797i.setImageDrawable(this.f18811w);
                    imageView2 = this.f18797i;
                    str = this.f18814z;
                }
                this.f18797i.setVisibility(0);
            } else {
                this.f18797i.setImageDrawable(this.f18810v);
                imageView2 = this.f18797i;
                str = this.f18813y;
            }
            imageView2.setContentDescription(str);
            this.f18797i.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m23058i() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (mo55325c() && this.f18769J && (imageView = this.f18798j) != null) {
            C6814an anVar = this.f18766G;
            if (!this.f18780U) {
                m23037a(false, false, (View) imageView);
                return;
            }
            if (anVar == null) {
                m23037a(true, false, (View) imageView);
                this.f18798j.setImageDrawable(this.f18761B);
                imageView2 = this.f18798j;
            } else {
                m23037a(true, true, (View) imageView);
                this.f18798j.setImageDrawable(anVar.mo52791z() ? this.f18760A : this.f18761B);
                imageView2 = this.f18798j;
                if (anVar.mo52791z()) {
                    str = this.f18764E;
                    imageView2.setContentDescription(str);
                }
            }
            str = this.f18765F;
            imageView2.setContentDescription(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m23060j() {
        int i;
        long j;
        C6814an anVar = this.f18766G;
        if (anVar != null) {
            boolean z = true;
            this.f18771L = this.f18770K && m23040a(anVar.mo52762S(), this.f18806r);
            this.f18787ad = 0;
            C6904ba S = anVar.mo52762S();
            if (!S.mo53081d()) {
                int G = anVar.mo52750G();
                int i2 = this.f18771L ? 0 : G;
                int b = this.f18771L ? S.mo52823b() - 1 : G;
                long j2 = 0;
                i = 0;
                while (true) {
                    if (i2 > b) {
                        break;
                    }
                    if (i2 == G) {
                        this.f18787ad = C7476h.m20797a(j2);
                    }
                    S.mo53079a(i2, this.f18806r);
                    if (this.f18806r.f15284o == -9223372036854775807L) {
                        C7717a.m22121b(this.f18771L ^ z);
                        break;
                    }
                    for (int i3 = this.f18806r.f15285p; i3 <= this.f18806r.f15286q; i3++) {
                        S.mo53078a(i3, this.f18805q);
                        int d = this.f18805q.mo53096d();
                        for (int e = this.f18805q.mo53098e(); e < d; e++) {
                            long a = this.f18805q.mo53087a(e);
                            if (a == Long.MIN_VALUE) {
                                if (this.f18805q.f15259d == -9223372036854775807L) {
                                } else {
                                    a = this.f18805q.f15259d;
                                }
                            }
                            long c = a + this.f18805q.mo53094c();
                            if (c >= 0) {
                                long[] jArr = this.f18782W;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f18782W = Arrays.copyOf(this.f18782W, length);
                                    this.f18784aa = Arrays.copyOf(this.f18784aa, length);
                                }
                                this.f18782W[i] = C7476h.m20797a(j2 + c);
                                this.f18784aa[i] = this.f18805q.mo53095c(e);
                                i++;
                            }
                        }
                    }
                    j2 += this.f18806r.f15284o;
                    i2++;
                    z = true;
                }
                j = j2;
            } else {
                j = 0;
                i = 0;
            }
            long a2 = C7476h.m20797a(j);
            TextView textView = this.f18800l;
            if (textView != null) {
                textView.setText(C7728ai.m22201a(this.f18803o, this.f18804p, a2));
            }
            C7859k kVar = this.f18802n;
            if (kVar != null) {
                kVar.setDuration(a2);
                int length2 = this.f18785ab.length;
                int i4 = i + length2;
                long[] jArr2 = this.f18782W;
                if (i4 > jArr2.length) {
                    this.f18782W = Arrays.copyOf(jArr2, i4);
                    this.f18784aa = Arrays.copyOf(this.f18784aa, i4);
                }
                System.arraycopy(this.f18785ab, 0, this.f18782W, i, length2);
                System.arraycopy(this.f18786ac, 0, this.f18784aa, i, length2);
                this.f18802n.mo55294a(this.f18782W, this.f18784aa, i4);
            }
            m23062k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m23062k() {
        long j;
        if (mo55325c() && this.f18769J) {
            C6814an anVar = this.f18766G;
            long j2 = 0;
            if (anVar != null) {
                j2 = this.f18787ad + anVar.mo52757N();
                j = this.f18787ad + anVar.mo52758O();
            } else {
                j = 0;
            }
            boolean z = false;
            boolean z2 = j2 != this.f18788ae;
            if (j != this.f18789af) {
                z = true;
            }
            this.f18788ae = j2;
            this.f18789af = j;
            TextView textView = this.f18801m;
            if (textView != null && !this.f18772M && z2) {
                textView.setText(C7728ai.m22201a(this.f18803o, this.f18804p, j2));
            }
            C7859k kVar = this.f18802n;
            if (kVar != null) {
                kVar.setPosition(j2);
                this.f18802n.setBufferedPosition(j);
            }
            if (this.f18768I != null && (z2 || z)) {
                this.f18768I.mo55353a(j2, j);
            }
            removeCallbacks(this.f18807s);
            int t = anVar == null ? 1 : anVar.mo52786t();
            long j3 = 1000;
            if (anVar != null && anVar.mo52771a()) {
                C7859k kVar2 = this.f18802n;
                long min = Math.min(kVar2 != null ? kVar2.getPreferredUpdateDelay() : 1000, 1000 - (j2 % 1000));
                float f = anVar.mo52748D().f14832b;
                if (f > 0.0f) {
                    j3 = (long) (((float) min) / f);
                }
                postDelayed(this.f18807s, C7728ai.m22192a(j3, (long) this.f18774O, 1000));
            } else if (t != 4 && t != 1) {
                postDelayed(this.f18807s, 1000);
            }
        }
    }

    /* renamed from: l */
    private void m23064l() {
        View view;
        View view2;
        boolean n = m23068n();
        if (!n && (view2 = this.f18793e) != null) {
            view2.requestFocus();
        } else if (n && (view = this.f18794f) != null) {
            view.requestFocus();
        }
    }

    /* renamed from: m */
    private void m23066m() {
        View view;
        View view2;
        boolean n = m23068n();
        if (!n && (view2 = this.f18793e) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (n && (view = this.f18794f) != null) {
            view.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: n */
    private boolean m23068n() {
        C6814an anVar = this.f18766G;
        return (anVar == null || anVar.mo52786t() == 4 || this.f18766G.mo52786t() == 1 || !this.f18766G.mo52789x()) ? false : true;
    }

    /* renamed from: a */
    public void mo55320a() {
        if (!mo55325c()) {
            setVisibility(0);
            Iterator<C7849d> it = this.f18790b.iterator();
            while (it.hasNext()) {
                it.next().mo55354a(getVisibility());
            }
            m23049e();
            m23064l();
            m23066m();
        }
        m23047d();
    }

    /* renamed from: a */
    public void mo55321a(C7849d dVar) {
        C7717a.m22120b(dVar);
        this.f18790b.add(dVar);
    }

    /* renamed from: a */
    public boolean mo55322a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C6814an anVar = this.f18766G;
        if (anVar == null || !m23038a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (anVar.mo52786t() == 4) {
                return true;
            }
            this.f18767H.mo54634e(anVar);
            return true;
        } else if (keyCode == 89) {
            this.f18767H.mo54633d(anVar);
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                m23032a(anVar);
                return true;
            } else if (keyCode == 87) {
                this.f18767H.mo54632c(anVar);
                return true;
            } else if (keyCode == 88) {
                this.f18767H.mo54630b(anVar);
                return true;
            } else if (keyCode == 126) {
                m23042b(anVar);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                m23045c(anVar);
                return true;
            }
        }
    }

    /* renamed from: b */
    public void mo55323b() {
        if (mo55325c()) {
            setVisibility(8);
            Iterator<C7849d> it = this.f18790b.iterator();
            while (it.hasNext()) {
                it.next().mo55354a(getVisibility());
            }
            removeCallbacks(this.f18807s);
            removeCallbacks(this.f18808t);
            this.f18781V = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public void mo55324b(C7849d dVar) {
        this.f18790b.remove(dVar);
    }

    /* renamed from: c */
    public boolean mo55325c() {
        return getVisibility() == 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo55322a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f18808t);
        } else if (motionEvent.getAction() == 1) {
            m23047d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C6814an getPlayer() {
        return this.f18766G;
    }

    public int getRepeatToggleModes() {
        return this.f18775P;
    }

    public boolean getShowShuffleButton() {
        return this.f18780U;
    }

    public int getShowTimeoutMs() {
        return this.f18773N;
    }

    public boolean getShowVrButton() {
        View view = this.f18799k;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18769J = true;
        long j = this.f18781V;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo55323b();
            } else {
                postDelayed(this.f18808t, uptimeMillis);
            }
        } else if (mo55325c()) {
            m23047d();
        }
        m23049e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18769J = false;
        removeCallbacks(this.f18807s);
        removeCallbacks(this.f18808t);
    }

    @Deprecated
    public void setControlDispatcher(C7539i iVar) {
        if (this.f18767H != iVar) {
            this.f18767H = iVar;
            m23054g();
        }
    }

    public void setPlayer(C6814an anVar) {
        boolean z = true;
        C7717a.m22121b(Looper.myLooper() == Looper.getMainLooper());
        if (!(anVar == null || anVar.mo52784r() == Looper.getMainLooper())) {
            z = false;
        }
        C7717a.m22118a(z);
        C6814an anVar2 = this.f18766G;
        if (anVar2 != anVar) {
            if (anVar2 != null) {
                anVar2.mo52775b((C6814an.C6820d) this.f18783a);
            }
            this.f18766G = anVar;
            if (anVar != null) {
                anVar.mo52769a((C6814an.C6820d) this.f18783a);
            }
            m23049e();
        }
    }

    public void setProgressUpdateListener(C7848c cVar) {
        this.f18768I = cVar;
    }

    public void setRepeatToggleModes(int i) {
        int i2;
        C7539i iVar;
        C6814an anVar;
        this.f18775P = i;
        C6814an anVar2 = this.f18766G;
        if (anVar2 != null) {
            int y = anVar2.mo52790y();
            if (i != 0 || y == 0) {
                i2 = 2;
                if (i == 1 && y == 2) {
                    this.f18767H.mo54626a(this.f18766G, 1);
                } else if (i == 2 && y == 1) {
                    iVar = this.f18767H;
                    anVar = this.f18766G;
                }
            } else {
                iVar = this.f18767H;
                anVar = this.f18766G;
                i2 = 0;
            }
            iVar.mo54626a(anVar, i2);
        }
        m23056h();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f18777R = z;
        m23054g();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f18770K = z;
        m23060j();
    }

    public void setShowNextButton(boolean z) {
        this.f18779T = z;
        m23054g();
    }

    public void setShowPreviousButton(boolean z) {
        this.f18778S = z;
        m23054g();
    }

    public void setShowRewindButton(boolean z) {
        this.f18776Q = z;
        m23054g();
    }

    public void setShowShuffleButton(boolean z) {
        this.f18780U = z;
        m23058i();
    }

    public void setShowTimeoutMs(int i) {
        this.f18773N = i;
        if (mo55325c()) {
            m23047d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f18799k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f18774O = C7728ai.m22180a(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f18799k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m23037a(getShowVrButton(), onClickListener != null, this.f18799k);
        }
    }
}
