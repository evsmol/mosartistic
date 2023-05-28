package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.C6787ab;
import com.applovin.exoplayer2.C6797ac;
import com.applovin.exoplayer2.C6811ak;
import com.applovin.exoplayer2.C6813am;
import com.applovin.exoplayer2.C6814an;
import com.applovin.exoplayer2.C6833aw;
import com.applovin.exoplayer2.C6904ba;
import com.applovin.exoplayer2.p206h.C7483ad;
import com.applovin.exoplayer2.p206h.C7509p;
import com.applovin.exoplayer2.p206h.C7524u;
import com.applovin.exoplayer2.p219j.C7644h;
import com.applovin.exoplayer2.p220k.C7683p;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p224ui.C7844f;
import com.applovin.exoplayer2.p224ui.C7850g;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.C7888a;
import com.applovin.impl.adview.C7995j;
import com.applovin.impl.adview.C8008m;
import com.applovin.impl.adview.C8023s;
import com.applovin.impl.adview.C8024t;
import com.applovin.impl.adview.C8025u;
import com.applovin.impl.adview.activity.p231a.C7899c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8345a;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p252ad.C8357g;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.C8619r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C8656R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.e */
public class C7931e extends C7905a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected final ProgressBar f19145A;

    /* renamed from: B */
    protected final C7995j f19146B;

    /* renamed from: C */
    protected boolean f19147C;

    /* renamed from: D */
    protected long f19148D;

    /* renamed from: E */
    protected int f19149E;

    /* renamed from: F */
    protected boolean f19150F;

    /* renamed from: G */
    protected boolean f19151G;

    /* renamed from: H */
    private final C7899c f19152H = new C7899c(this.f19083a, this.f19087e, this.f19084b);

    /* renamed from: I */
    private final C7941a f19153I = new C7941a();

    /* renamed from: J */
    private final Handler f19154J;

    /* renamed from: K */
    private final boolean f19155K;

    /* renamed from: L */
    private long f19156L;

    /* renamed from: M */
    private final AtomicBoolean f19157M;

    /* renamed from: N */
    private final AtomicBoolean f19158N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f19159O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public long f19160P;

    /* renamed from: u */
    protected final C7850g f19161u;

    /* renamed from: v */
    protected final C6833aw f19162v;

    /* renamed from: w */
    protected final C7888a f19163w;

    /* renamed from: x */
    protected final C8008m f19164x;

    /* renamed from: y */
    protected final ImageView f19165y;

    /* renamed from: z */
    protected final C8024t f19166z;

    /* renamed from: com.applovin.impl.adview.activity.b.e$a */
    private class C7941a implements C8025u.C8026a {
        private C7941a() {
        }

        /* renamed from: a */
        public void mo55621a(C8024t tVar) {
            C8626v vVar = C7931e.this.f19085c;
            if (C8626v.m26252a()) {
                C7931e.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C7931e.this.mo55590a(tVar.getAndClearLastClickLocation());
        }

        /* renamed from: b */
        public void mo55622b(C8024t tVar) {
            C8626v vVar = C7931e.this.f19085c;
            if (C8626v.m26252a()) {
                C7931e.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C7931e.this.mo55555h();
        }

        /* renamed from: c */
        public void mo55623c(C8024t tVar) {
            C8626v vVar = C7931e.this.f19085c;
            if (C8626v.m26252a()) {
                C7931e.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C7931e.this.mo55591c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$b */
    private class C7942b implements C6814an.C6818b, C7844f.C7849d, AppLovinTouchToClickListener.OnClickListener {
        private C7942b() {
        }

        /* renamed from: a */
        public void mo55354a(int i) {
            if (i == 0) {
                C7931e.this.f19161u.mo55358b();
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo52471a(C6787ab abVar, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, abVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52472a(C6797ac acVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, acVar);
        }

        /* renamed from: a */
        public void mo52473a(C6811ak akVar) {
            C7931e eVar = C7931e.this;
            eVar.mo55593c("Video view error (" + akVar + ")");
            C7931e.this.mo55555h();
        }

        /* renamed from: a */
        public /* synthetic */ void mo52474a(C6813am amVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, amVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52475a(C6814an.C6816a aVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, aVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52476a(C6814an.C6821e eVar, C6814an.C6821e eVar2, int i) {
            C6814an.C6818b.CC.$default$a(this, eVar, eVar2, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52478a(C6814an anVar, C6814an.C6819c cVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, anVar, cVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52479a(C6904ba baVar, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, baVar, i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo52482a(C7483ad adVar, C7644h hVar) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, adVar, hVar);
        }

        @Deprecated
        /* renamed from: a */
        public /* synthetic */ void mo52493a(boolean z, int i) {
            C6814an.C6818b.CC.$default$a((C6814an.C6818b) this, z, i);
        }

        @Deprecated
        /* renamed from: b */
        public /* synthetic */ void mo52496b() {
            C6814an.C6818b.CC.$default$b(this);
        }

        /* renamed from: b */
        public void mo52497b(int i) {
            C8626v vVar = C7931e.this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = C7931e.this.f19085c;
                vVar2.mo57818b("AppLovinFullscreenActivity", "Player state changed to state " + i + " and will play when ready: " + C7931e.this.f19162v.mo52789x());
            }
            if (i == 2) {
                C7931e.this.mo55594x();
                C7931e.this.f19086d.mo57139g();
            } else if (i == 3) {
                C7931e.this.f19162v.mo52861a(C7931e.this.f19147C ^ true ? 1.0f : 0.0f);
                C7931e eVar = C7931e.this;
                eVar.mo55592c(eVar.f19162v.mo52751H());
                C7931e.this.mo55569u();
                C8626v vVar3 = C7931e.this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar4 = C7931e.this.f19085c;
                    vVar4.mo57818b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C7931e.this.f19162v);
                }
                C7931e.this.f19146B.mo55743a();
                if (C7931e.this.f19164x != null) {
                    C7931e.this.mo55608C();
                }
                C7931e.this.mo55595y();
                if (C7931e.this.f19101s.mo57070c()) {
                    C7931e.this.mo55552e();
                }
            } else if (i == 4) {
                C8626v vVar5 = C7931e.this.f19085c;
                if (C8626v.m26252a()) {
                    C7931e.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Video completed");
                }
                C7931e.this.f19151G = true;
                if (!C7931e.this.f19093k) {
                    C7931e.this.mo55589A();
                } else if (C7931e.this.mo55568t()) {
                    C7931e.this.m23518H();
                }
            }
        }

        /* renamed from: b */
        public /* synthetic */ void mo52501b(C6811ak akVar) {
            C6814an.C6818b.CC.$default$b((C6814an.C6818b) this, akVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo52507b(boolean z, int i) {
            C6814an.C6818b.CC.$default$b(this, z, i);
        }

        /* renamed from: b_ */
        public /* synthetic */ void mo52508b_(boolean z) {
            C6814an.C6818b.CC.$default$b_(this, z);
        }

        /* renamed from: c */
        public /* synthetic */ void mo52510c(int i) {
            C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, i);
        }

        @Deprecated
        /* renamed from: c */
        public /* synthetic */ void mo52515c(boolean z) {
            C6814an.C6818b.CC.$default$c((C6814an.C6818b) this, z);
        }

        /* renamed from: d */
        public /* synthetic */ void mo52517d(int i) {
            C6814an.C6818b.CC.$default$d((C6814an.C6818b) this, i);
        }

        /* renamed from: d */
        public /* synthetic */ void mo52520d(boolean z) {
            C6814an.C6818b.CC.$default$d((C6814an.C6818b) this, z);
        }

        @Deprecated
        /* renamed from: e */
        public /* synthetic */ void mo52522e(int i) {
            C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, i);
        }

        /* renamed from: e */
        public /* synthetic */ void mo52524e(boolean z) {
            C6814an.C6818b.CC.$default$e((C6814an.C6818b) this, z);
        }

        public void onClick(View view, PointF pointF) {
            C7931e.this.mo55590a(pointF);
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.e$c */
    private class C7943c implements View.OnClickListener {
        private C7943c() {
        }

        public void onClick(View view) {
            if (view == C7931e.this.f19164x) {
                if (C7931e.this.mo55567s()) {
                    C7931e.this.mo55552e();
                    C7931e.this.mo55564p();
                    C7931e.this.f19101s.mo57069b();
                    return;
                }
                C7931e.this.mo55591c();
            } else if (view == C7931e.this.f19165y) {
                C7931e.this.mo55596z();
            } else {
                C8626v vVar = C7931e.this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = C7931e.this.f19085c;
                    vVar2.mo57822e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public C7931e(C8350e eVar, Activity activity, C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f19154J = handler;
        this.f19146B = new C7995j(handler, this.f19084b);
        this.f19155K = this.f19083a.mo55846f();
        this.f19147C = Utils.isVideoMutedInitially(this.f19084b);
        this.f19156L = -1;
        this.f19157M = new AtomicBoolean();
        this.f19158N = new AtomicBoolean();
        this.f19159O = -2;
        this.f19160P = 0;
        if (eVar.hasVideoUrl()) {
            C7943c cVar = new C7943c();
            if (eVar.mo57019r() >= 0) {
                C8008m mVar = new C8008m(eVar.mo57025x(), activity);
                this.f19164x = mVar;
                mVar.setVisibility(8);
                this.f19164x.setOnClickListener(cVar);
            } else {
                this.f19164x = null;
            }
            if (m23521a(this.f19147C, nVar)) {
                ImageView imageView = new ImageView(activity);
                this.f19165y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f19165y.setClickable(true);
                this.f19165y.setOnClickListener(cVar);
                mo55612d(this.f19147C);
            } else {
                this.f19165y = null;
            }
            String C = eVar.mo56946C();
            if (StringUtils.isValidString(C)) {
                C8025u uVar = new C8025u(nVar);
                uVar.mo55801a(new WeakReference(this.f19153I));
                C8024t tVar = new C8024t(uVar, activity);
                this.f19166z = tVar;
                tVar.mo55800a(C);
            } else {
                this.f19166z = null;
            }
            if (this.f19155K) {
                C7888a aVar = new C7888a(activity, ((Integer) nVar.mo57342a(C8380b.f20813cJ)).intValue(), 16842874);
                this.f19163w = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f19163w.setBackgroundColor(Color.parseColor("#00000000"));
                this.f19163w.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.f19163w = null;
            }
            if (eVar.mo56957O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.f19145A = progressBar;
                progressBar.setMax(10000);
                this.f19145A.setPadding(0, 0, 0, 0);
                if (C8571h.m26086d()) {
                    this.f19145A.setProgressTintList(ColorStateList.valueOf(eVar.mo56958P()));
                }
                this.f19146B.mo55744a("PROGRESS_BAR", ((Long) nVar.mo57342a(C8380b.f20810cG)).longValue(), (C7995j.C7997a) new C7995j.C7997a() {
                    /* renamed from: a */
                    public void mo55597a() {
                        if (C7931e.this.f19150F) {
                            C7931e.this.f19145A.setVisibility(8);
                            return;
                        }
                        C7931e.this.f19145A.setProgress((int) ((((float) C7931e.this.f19162v.mo52752I()) / ((float) C7931e.this.f19148D)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo55598b() {
                        return !C7931e.this.f19150F;
                    }
                });
            } else {
                this.f19145A = null;
            }
            this.f19162v = new C6833aw.C6835a(activity).mo52870a();
            C7942b bVar = new C7942b();
            this.f19162v.mo52863a((C6814an.C6818b) bVar);
            this.f19162v.mo52778c(0);
            C7850g gVar = new C7850g(activity);
            this.f19161u = gVar;
            gVar.mo55358b();
            this.f19161u.setControllerVisibilityListener(bVar);
            this.f19161u.setPlayer(this.f19162v);
            this.f19161u.setOnTouchListener(new AppLovinTouchToClickListener(nVar, C8380b.f20720aV, activity, bVar));
            mo55607B();
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* renamed from: G */
    private void m23517G() {
        C8024t tVar;
        C8023s D = this.f19083a.mo56947D();
        if (D != null && D.mo55791e() && !this.f19150F && (tVar = this.f19166z) != null) {
            final boolean z = tVar.getVisibility() == 4;
            final long f = D.mo55793f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        C8619r.m26223a((View) C7931e.this.f19166z, f, (Runnable) null);
                    } else {
                        C8619r.m26228b(C7931e.this.f19166z, f, (Runnable) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m23518H() {
        this.f19152H.mo55526a(this.f19090h);
        this.f19092j = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private static boolean m23521a(boolean z, C8490n nVar) {
        if (!((Boolean) nVar.mo57342a(C8380b.f20854cy)).booleanValue()) {
            return false;
        }
        if (!((Boolean) nVar.mo57342a(C8380b.f20855cz)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) nVar.mo57342a(C8380b.f20805cB)).booleanValue();
    }

    /* renamed from: A */
    public void mo55589A() {
        mo55609D();
        this.f19152H.mo55530a(this.f19089g, this.f19088f);
        mo55544a("javascript:al_onPoststitialShow(" + this.f19094l + "," + this.f19095m + ");", (long) this.f19083a.mo56961S());
        if (this.f19089g != null) {
            int i = (this.f19083a.mo57021t() > 0 ? 1 : (this.f19083a.mo57021t() == 0 ? 0 : -1));
            C8008m mVar = this.f19089g;
            if (i >= 0) {
                mo55541a(mVar, this.f19083a.mo57021t(), new Runnable() {
                    public void run() {
                        C7931e.this.f19092j = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        mo55570v();
        this.f19150F = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo55607B() {
        mo55545a(!this.f19155K);
        C7524u a = new C7524u.C7526a(new C7683p(this.f19087e, C7728ai.m22199a((Context) this.f19087e, "com.applovin.sdk"))).mo54583a(C6787ab.m17328a(this.f19083a.mo55850h()));
        this.f19162v.mo52861a(this.f19147C ^ true ? 1.0f : 0.0f);
        this.f19162v.mo52864a((C7509p) a);
        this.f19162v.mo52788w();
        this.f19162v.mo52770a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo55608C() {
        if (this.f19158N.compareAndSet(false, true)) {
            mo55541a(this.f19164x, this.f19083a.mo57019r(), new Runnable() {
                public void run() {
                    long unused = C7931e.this.f19159O = -1;
                    long unused2 = C7931e.this.f19160P = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo55609D() {
        this.f19149E = mo55611F();
        this.f19162v.mo52770a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo55610E() {
        if (this.f19150F) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57821d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f19084b.mo57366ag().isApplicationPaused()) {
            C8626v vVar2 = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57821d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else {
            long j = this.f19156L;
            if (j >= 0) {
                C8626v vVar3 = this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar4 = this.f19085c;
                    vVar4.mo57818b("AppLovinFullscreenActivity", "Resuming video at position " + j + "ms for MediaPlayer: " + this.f19162v);
                }
                this.f19162v.mo52770a(true);
                this.f19146B.mo55743a();
                this.f19156L = -1;
                if (!this.f19162v.mo52771a()) {
                    mo55594x();
                    return;
                }
                return;
            }
            C8626v vVar5 = this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar6 = this.f19085c;
                vVar6.mo57818b("AppLovinFullscreenActivity", "Invalid last video position, isVideoPlaying=" + this.f19162v.mo52771a());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo55611F() {
        C6833aw awVar = this.f19162v;
        if (awVar == null) {
            return 0;
        }
        long I = awVar.mo52752I();
        if (this.f19151G) {
            return 100;
        }
        return I > 0 ? (int) ((((float) I) / ((float) this.f19148D)) * 100.0f) : this.f19149E;
    }

    /* renamed from: a */
    public void mo55584a() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* renamed from: a */
    public void mo55538a(long j) {
        mo55542a((Runnable) new Runnable() {
            public void run() {
                C7931e.this.mo55610E();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55590a(PointF pointF) {
        if (this.f19083a.mo55824E()) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57818b("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri k = this.f19083a.mo55856k();
            if (k != null) {
                this.f19084b.mo57406v().trackAndLaunchVideoClick(this.f19083a, k, pointF, this, this.f19088f != null ? this.f19088f.getContext() : this.f19084b.mo57332P());
                C8575k.m26143a(this.f19098p, (AppLovinAd) this.f19083a);
                this.f19086d.mo57131b();
                this.f19095m++;
                return;
            }
            return;
        }
        m23517G();
    }

    /* renamed from: a */
    public void mo55540a(ViewGroup viewGroup) {
        this.f19152H.mo55529a(this.f19165y, this.f19164x, this.f19166z, this.f19163w, this.f19145A, this.f19161u, this.f19088f, (ImageView) null, viewGroup);
        this.f19162v.mo52770a(true);
        if (this.f19083a.mo56998am()) {
            this.f19101s.mo57067a(this.f19083a, (Runnable) new Runnable() {
                public void run() {
                    C7931e.this.mo55538a(250);
                }
            });
        }
        if (this.f19155K) {
            mo55594x();
        }
        this.f19088f.renderAd(this.f19083a);
        this.f19086d.mo57132b(this.f19155K ? 1 : 0);
        if (this.f19164x != null) {
            this.f19084b.mo57337V().mo57230a(new C8458z(this.f19084b, new Runnable() {
                public void run() {
                    C7931e.this.mo55608C();
                }
            }), C8432o.C8434a.MAIN, this.f19083a.mo57020s(), true);
        }
        super.mo55549b(this.f19147C);
    }

    /* renamed from: b */
    public void mo55585b() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo55591c();
    }

    /* renamed from: c */
    public void mo55591c() {
        this.f19159O = SystemClock.elapsedRealtime() - this.f19160P;
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f19159O + "ms");
        }
        this.f19086d.mo57138f();
        this.f19094l++;
        if (this.f19083a.mo57026y()) {
            mo55555h();
        } else {
            mo55589A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55592c(long j) {
        this.f19148D = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55593c(String str) {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f19085c;
            vVar2.mo57822e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f19083a);
        }
        if (this.f19157M.compareAndSet(false, true)) {
            if (this.f19099q instanceof C8357g) {
                ((C8357g) this.f19099q).onAdDisplayFailed(str);
            }
            mo55555h();
        }
    }

    /* renamed from: c */
    public void mo55550c(boolean z) {
        super.mo55550c(z);
        if (z) {
            mo55538a(0);
        } else if (!this.f19150F) {
            mo55552e();
        }
    }

    /* renamed from: d */
    public void mo55551d() {
        mo55540a((ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo55612d(boolean z) {
        if (C8571h.m26086d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f19087e.getDrawable(z ? C8656R.C8659drawable.applovin_ic_unmute_to_mute : C8656R.C8659drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f19165y.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f19165y.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f19083a.mo56976aC() : this.f19083a.mo56977aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f19165y.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: e */
    public void mo55552e() {
        String str;
        C8626v vVar;
        C8626v vVar2 = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f19162v.mo52771a()) {
            this.f19156L = this.f19162v.mo52752I();
            this.f19162v.mo52770a(false);
            this.f19146B.mo55746c();
            C8626v vVar3 = this.f19085c;
            if (C8626v.m26252a()) {
                vVar = this.f19085c;
                str = "Paused video at position " + this.f19156L + "ms";
            } else {
                return;
            }
        } else {
            C8626v vVar4 = this.f19085c;
            if (C8626v.m26252a()) {
                vVar = this.f19085c;
                str = "Nothing to pause";
            } else {
                return;
            }
        }
        vVar.mo57818b("AppLovinFullscreenActivity", str);
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    /* renamed from: h */
    public void mo55555h() {
        this.f19146B.mo55745b();
        this.f19154J.removeCallbacksAndMessages((Object) null);
        mo55560m();
        super.mo55555h();
    }

    /* renamed from: k */
    public void mo55558k() {
        this.f19162v.mo52860E();
        if (this.f19155K) {
            AppLovinCommunicator.getInstance(this.f19087e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
        }
        super.mo55558k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo55560m() {
        super.mo55537a(mo55611F(), this.f19155K, mo55566r(), this.f19159O);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f19084b.mo57342a(C8380b.f20931eX)).booleanValue() && j == this.f19083a.getAdIdNumber() && this.f19155K) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.f19151G && !this.f19162v.mo52771a()) {
                    mo55593c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo55566r() {
        return this.f19083a != null && mo55611F() >= this.f19083a.mo56959Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo55567s() {
        return mo55568t() && !mo55566r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo55569u() {
        long j;
        int l;
        long j2 = 0;
        if (this.f19083a.mo56989ad() >= 0 || this.f19083a.mo56990ae() >= 0) {
            int i = (this.f19083a.mo56989ad() > 0 ? 1 : (this.f19083a.mo56989ad() == 0 ? 0 : -1));
            C8350e eVar = this.f19083a;
            if (i >= 0) {
                j = eVar.mo56989ad();
            } else {
                C8345a aVar = (C8345a) eVar;
                long j3 = this.f19148D;
                if (j3 > 0) {
                    j2 = 0 + j3;
                }
                if (aVar.mo56991af() && ((l = (int) ((C8345a) this.f19083a).mo56924l()) > 0 || (l = (int) aVar.mo57021t()) > 0)) {
                    j2 += TimeUnit.SECONDS.toMillis((long) l);
                }
                j = (long) (((double) j2) * (((double) this.f19083a.mo56990ae()) / 100.0d));
            }
            mo55547b(j);
        }
    }

    /* renamed from: w */
    public void mo55571w() {
        super.mo55571w();
        this.f19152H.mo55525a((View) this.f19166z);
        this.f19152H.mo55525a((View) this.f19164x);
        if (!mo55568t() || this.f19150F) {
            m23518H();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo55594x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C7931e.this.f19163w != null) {
                    C7931e.this.f19163w.mo55509a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo55595y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C7931e.this.f19163w != null) {
                    C7931e.this.f19163w.mo55510b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo55596z() {
        boolean z = !this.f19147C;
        this.f19147C = z;
        this.f19162v.mo52861a(z ^ true ? 1.0f : 0.0f);
        mo55612d(this.f19147C);
        mo55546a(this.f19147C, 0);
    }
}
