package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
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
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
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

/* renamed from: com.applovin.impl.adview.activity.b.f */
public class C7944f extends C7905a implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    protected ImageView f19181A = null;

    /* renamed from: B */
    protected final C7995j f19182B;

    /* renamed from: C */
    protected boolean f19183C;

    /* renamed from: D */
    protected long f19184D;

    /* renamed from: E */
    protected boolean f19185E;

    /* renamed from: F */
    private final C7899c f19186F = new C7899c(this.f19083a, this.f19087e, this.f19084b);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public MediaPlayer f19187G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C7957b f19188H = new C7957b();

    /* renamed from: I */
    private final C7956a f19189I = new C7956a();

    /* renamed from: J */
    private final Handler f19190J;

    /* renamed from: K */
    private final boolean f19191K;

    /* renamed from: L */
    private int f19192L;

    /* renamed from: M */
    private int f19193M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f19194N;

    /* renamed from: O */
    private final AtomicBoolean f19195O;

    /* renamed from: P */
    private final AtomicBoolean f19196P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f19197Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public long f19198R;

    /* renamed from: u */
    protected final AppLovinVideoView f19199u;

    /* renamed from: v */
    protected final C7888a f19200v;

    /* renamed from: w */
    protected final C8008m f19201w;

    /* renamed from: x */
    protected final ImageView f19202x;

    /* renamed from: y */
    protected final C8024t f19203y;

    /* renamed from: z */
    protected final ProgressBar f19204z;

    /* renamed from: com.applovin.impl.adview.activity.b.f$a */
    private class C7956a implements C8025u.C8026a {
        private C7956a() {
        }

        /* renamed from: a */
        public void mo55621a(C8024t tVar) {
            C8626v vVar = C7944f.this.f19085c;
            if (C8626v.m26252a()) {
                C7944f.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C7944f.this.mo55600a(tVar.getAndClearLastClickLocation());
        }

        /* renamed from: b */
        public void mo55622b(C8024t tVar) {
            C8626v vVar = C7944f.this.f19085c;
            if (C8626v.m26252a()) {
                C7944f.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C7944f.this.mo55555h();
        }

        /* renamed from: c */
        public void mo55623c(C8024t tVar) {
            C8626v vVar = C7944f.this.f19085c;
            if (C8626v.m26252a()) {
                C7944f.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C7944f.this.mo55591c();
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$b */
    private class C7957b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private C7957b() {
        }

        public void onClick(View view, PointF pointF) {
            C7944f.this.mo55600a(pointF);
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            C8626v vVar = C7944f.this.f19085c;
            if (C8626v.m26252a()) {
                C7944f.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Video completed");
            }
            boolean unused = C7944f.this.f19194N = true;
            if (!C7944f.this.f19093k) {
                C7944f.this.mo55599A();
            } else if (C7944f.this.mo55568t()) {
                C7944f.this.m23581F();
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C7944f fVar = C7944f.this;
            fVar.mo55602c("Video view error (" + i + "," + i2 + ")");
            C7944f.this.f19199u.start();
            return true;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C8626v vVar = C7944f.this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = C7944f.this.f19085c;
                vVar2.mo57818b("AppLovinFullscreenActivity", "MediaPlayer Info: (" + i + ", " + i2 + ")");
            }
            if (i == 701) {
                C7944f.this.mo55603x();
                C7944f.this.f19086d.mo57139g();
                return false;
            } else if (i == 3) {
                C7944f.this.f19182B.mo55743a();
                if (C7944f.this.f19201w != null) {
                    C7944f.this.m23578C();
                }
                C7944f.this.mo55604y();
                if (!C7944f.this.f19101s.mo57070c()) {
                    return false;
                }
                C7944f.this.mo55552e();
                return false;
            } else if (i != 702) {
                return false;
            } else {
                C7944f.this.mo55604y();
                return false;
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayer unused = C7944f.this.f19187G = mediaPlayer;
            mediaPlayer.setOnInfoListener(C7944f.this.f19188H);
            mediaPlayer.setOnErrorListener(C7944f.this.f19188H);
            float f = C7944f.this.f19183C ^ true ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f, f);
            C7944f.this.mo55601c((long) mediaPlayer.getDuration());
            C7944f.this.mo55569u();
            C8626v vVar = C7944f.this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar2 = C7944f.this.f19085c;
                vVar2.mo57818b("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C7944f.this.f19187G);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.f$c */
    private class C7958c implements View.OnClickListener {
        private C7958c() {
        }

        public void onClick(View view) {
            if (view == C7944f.this.f19201w) {
                if (C7944f.this.mo55567s()) {
                    C7944f.this.mo55552e();
                    C7944f.this.mo55564p();
                    C7944f.this.f19101s.mo57069b();
                    return;
                }
                C7944f.this.mo55591c();
            } else if (view == C7944f.this.f19202x) {
                C7944f.this.mo55605z();
            } else {
                C8626v vVar = C7944f.this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = C7944f.this.f19085c;
                    vVar2.mo57822e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                }
            }
        }
    }

    public C7944f(C8350e eVar, Activity activity, C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, nVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f19190J = handler;
        this.f19182B = new C7995j(handler, this.f19084b);
        this.f19191K = this.f19083a.mo55846f();
        this.f19183C = Utils.isVideoMutedInitially(this.f19084b);
        this.f19193M = -1;
        this.f19195O = new AtomicBoolean();
        this.f19196P = new AtomicBoolean();
        this.f19197Q = -2;
        this.f19198R = 0;
        if (eVar.hasVideoUrl()) {
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
            this.f19199u = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(this.f19188H);
            this.f19199u.setOnCompletionListener(this.f19188H);
            this.f19199u.setOnErrorListener(this.f19188H);
            this.f19199u.setOnTouchListener(new AppLovinTouchToClickListener(nVar, C8380b.f20720aV, activity, this.f19188H));
            C7958c cVar = new C7958c();
            if (eVar.mo57019r() >= 0) {
                C8008m mVar = new C8008m(eVar.mo57025x(), activity);
                this.f19201w = mVar;
                mVar.setVisibility(8);
                this.f19201w.setOnClickListener(cVar);
            } else {
                this.f19201w = null;
            }
            if (m23586a(this.f19183C, nVar)) {
                ImageView imageView = new ImageView(activity);
                this.f19202x = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f19202x.setClickable(true);
                this.f19202x.setOnClickListener(cVar);
                m23593e(this.f19183C);
            } else {
                this.f19202x = null;
            }
            String C = eVar.mo56946C();
            if (StringUtils.isValidString(C)) {
                C8025u uVar = new C8025u(nVar);
                uVar.mo55801a(new WeakReference(this.f19189I));
                C8024t tVar = new C8024t(uVar, activity);
                this.f19203y = tVar;
                tVar.mo55800a(C);
            } else {
                this.f19203y = null;
            }
            if (this.f19191K) {
                C7888a aVar = new C7888a(activity, ((Integer) nVar.mo57342a(C8380b.f20813cJ)).intValue(), 16842874);
                this.f19200v = aVar;
                aVar.setColor(Color.parseColor("#75FFFFFF"));
                this.f19200v.setBackgroundColor(Color.parseColor("#00000000"));
                this.f19200v.setVisibility(8);
                AppLovinCommunicator.getInstance(activity).subscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            } else {
                this.f19200v = null;
            }
            if (eVar.mo56957O()) {
                ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842872);
                this.f19204z = progressBar;
                progressBar.setMax(10000);
                this.f19204z.setPadding(0, 0, 0, 0);
                if (C8571h.m26086d()) {
                    this.f19204z.setProgressTintList(ColorStateList.valueOf(eVar.mo56958P()));
                }
                this.f19182B.mo55744a("PROGRESS_BAR", ((Long) nVar.mo57342a(C8380b.f20810cG)).longValue(), (C7995j.C7997a) new C7995j.C7997a() {
                    /* renamed from: a */
                    public void mo55597a() {
                        if (C7944f.this.f19185E) {
                            C7944f.this.f19204z.setVisibility(8);
                            return;
                        }
                        C7944f.this.f19204z.setProgress((int) ((((float) C7944f.this.f19199u.getCurrentPosition()) / ((float) C7944f.this.f19184D)) * 10000.0f));
                    }

                    /* renamed from: b */
                    public boolean mo55598b() {
                        return !C7944f.this.f19185E;
                    }
                });
                return;
            }
            this.f19204z = null;
            return;
        }
        throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m23578C() {
        if (this.f19196P.compareAndSet(false, true)) {
            mo55541a(this.f19201w, this.f19083a.mo57019r(), new Runnable() {
                public void run() {
                    long unused = C7944f.this.f19197Q = -1;
                    long unused2 = C7944f.this.f19198R = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: D */
    private void m23579D() {
        C8024t tVar;
        C8023s D = this.f19083a.mo56947D();
        if (D != null && D.mo55791e() && !this.f19185E && (tVar = this.f19203y) != null) {
            final boolean z = tVar.getVisibility() == 4;
            final long f = D.mo55793f();
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (z) {
                        C8619r.m26223a((View) C7944f.this.f19203y, f, (Runnable) null);
                    } else {
                        C8619r.m26228b(C7944f.this.f19203y, f, (Runnable) null);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m23580E() {
        if (this.f19185E) {
            C8626v vVar = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57821d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
            }
        } else if (this.f19084b.mo57366ag().isApplicationPaused()) {
            C8626v vVar2 = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57821d("AppLovinFullscreenActivity", "Skip video resume - app paused");
            }
        } else if (this.f19193M >= 0) {
            C8626v vVar3 = this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.f19085c;
                vVar4.mo57818b("AppLovinFullscreenActivity", "Resuming video at position " + this.f19193M + "ms for MediaPlayer: " + this.f19187G);
            }
            this.f19199u.seekTo(this.f19193M);
            this.f19199u.start();
            this.f19182B.mo55743a();
            this.f19193M = -1;
            mo55542a((Runnable) new Runnable() {
                public void run() {
                    if (C7944f.this.f19200v != null) {
                        C7944f.this.f19200v.mo55509a();
                        C7944f.this.mo55542a((Runnable) new Runnable() {
                            public void run() {
                                C7944f.this.f19200v.mo55510b();
                            }
                        }, 2000);
                    }
                }
            }, 250);
        } else {
            C8626v vVar5 = this.f19085c;
            if (C8626v.m26252a()) {
                this.f19085c.mo57818b("AppLovinFullscreenActivity", "Invalid last video position");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m23581F() {
        this.f19186F.mo55526a(this.f19090h);
        this.f19092j = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private static boolean m23586a(boolean z, C8490n nVar) {
        if (!((Boolean) nVar.mo57342a(C8380b.f20854cy)).booleanValue()) {
            return false;
        }
        if (!((Boolean) nVar.mo57342a(C8380b.f20855cz)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) nVar.mo57342a(C8380b.f20805cB)).booleanValue();
    }

    /* renamed from: d */
    private void m23591d(boolean z) {
        this.f19192L = mo55625B();
        if (z) {
            this.f19199u.pause();
        } else {
            this.f19199u.stopPlayback();
        }
    }

    /* renamed from: e */
    private void m23593e(boolean z) {
        if (C8571h.m26086d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f19087e.getDrawable(z ? C8656R.C8659drawable.applovin_ic_unmute_to_mute : C8656R.C8659drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f19202x.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f19202x.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f19083a.mo56976aC() : this.f19083a.mo56977aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f19202x.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: A */
    public void mo55599A() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        m23591d(this.f19083a.mo56983aJ());
        this.f19186F.mo55530a(this.f19089g, this.f19088f);
        mo55544a("javascript:al_onPoststitialShow(" + this.f19094l + "," + this.f19095m + ");", (long) this.f19083a.mo56961S());
        if (this.f19089g != null) {
            int i = (this.f19083a.mo57021t() > 0 ? 1 : (this.f19083a.mo57021t() == 0 ? 0 : -1));
            C8008m mVar = this.f19089g;
            if (i >= 0) {
                mo55541a(mVar, this.f19083a.mo57021t(), new Runnable() {
                    public void run() {
                        C7944f.this.f19092j = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                mVar.setVisibility(0);
            }
        }
        mo55570v();
        this.f19185E = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo55625B() {
        long currentPosition = (long) this.f19199u.getCurrentPosition();
        if (this.f19194N) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((((float) currentPosition) / ((float) this.f19184D)) * 100.0f) : this.f19192L;
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
                C7944f.this.m23580E();
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55600a(PointF pointF) {
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
        m23579D();
    }

    /* renamed from: a */
    public void mo55540a(ViewGroup viewGroup) {
        String str;
        this.f19186F.mo55529a(this.f19202x, this.f19201w, this.f19203y, this.f19200v, this.f19204z, this.f19199u, this.f19088f, this.f19181A, viewGroup);
        if (C8571h.m26089g() && (str = this.f19084b.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.AUDIO_FOCUS_REQUEST)) != null) {
            this.f19199u.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        mo55545a(!this.f19191K);
        this.f19199u.setVideoURI(this.f19083a.mo55850h());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (this.f19083a.mo56998am()) {
            this.f19101s.mo57067a(this.f19083a, (Runnable) new Runnable() {
                public void run() {
                    C7944f.this.mo55538a(250);
                }
            });
        }
        this.f19199u.start();
        if (this.f19191K) {
            mo55603x();
        }
        this.f19088f.renderAd(this.f19083a);
        this.f19086d.mo57132b(this.f19191K ? 1 : 0);
        if (this.f19201w != null) {
            this.f19084b.mo57337V().mo57230a(new C8458z(this.f19084b, new Runnable() {
                public void run() {
                    C7944f.this.m23578C();
                }
            }), C8432o.C8434a.MAIN, this.f19083a.mo57020s(), true);
        }
        super.mo55549b(this.f19183C);
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
        this.f19197Q = SystemClock.elapsedRealtime() - this.f19198R;
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f19197Q + "ms");
        }
        this.f19086d.mo57138f();
        this.f19094l++;
        if (this.f19083a.mo57026y()) {
            mo55555h();
        } else {
            mo55599A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55601c(long j) {
        this.f19184D = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo55602c(String str) {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f19085c;
            vVar2.mo57822e("AppLovinFullscreenActivity", "Encountered media error: " + str + " for ad: " + this.f19083a);
        }
        if (this.f19195O.compareAndSet(false, true)) {
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
        } else if (!this.f19185E) {
            mo55552e();
        }
    }

    /* renamed from: d */
    public void mo55551d() {
        mo55540a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo55552e() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57818b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f19193M = this.f19199u.getCurrentPosition();
        this.f19199u.pause();
        this.f19182B.mo55746c();
        C8626v vVar2 = this.f19085c;
        if (C8626v.m26252a()) {
            C8626v vVar3 = this.f19085c;
            vVar3.mo57818b("AppLovinFullscreenActivity", "Paused video at position " + this.f19193M + "ms");
        }
    }

    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    /* renamed from: h */
    public void mo55555h() {
        this.f19182B.mo55745b();
        this.f19190J.removeCallbacksAndMessages((Object) null);
        mo55560m();
        super.mo55555h();
    }

    /* renamed from: k */
    public void mo55558k() {
        C8626v vVar = this.f19085c;
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (this.f19191K) {
                AppLovinCommunicator.getInstance(this.f19087e).unsubscribe((AppLovinCommunicatorSubscriber) this, "video_caching_failed");
            }
            if (this.f19199u != null) {
                this.f19199u.pause();
                this.f19199u.stopPlayback();
            }
            if (this.f19187G != null) {
                this.f19187G.release();
            }
        } catch (Throwable th) {
            Log.e("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.mo55558k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo55560m() {
        super.mo55537a(mo55625B(), this.f19191K, mo55566r(), this.f19197Q);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j = messageData.getLong("ad_id");
            if (((Boolean) this.f19084b.mo57342a(C8380b.f20931eX)).booleanValue() && j == this.f19083a.getAdIdNumber() && this.f19191K) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string != null || i < 200 || i >= 300) && !this.f19194N && !this.f19199u.isPlaying()) {
                    mo55602c("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo55566r() {
        return mo55625B() >= this.f19083a.mo56959Q();
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
                long j3 = this.f19184D;
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
        this.f19186F.mo55525a((View) this.f19203y);
        this.f19186F.mo55525a((View) this.f19201w);
        if (!mo55568t() || this.f19185E) {
            m23581F();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo55603x() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C7944f.this.f19200v != null) {
                    C7944f.this.f19200v.mo55509a();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo55604y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C7944f.this.f19200v != null) {
                    C7944f.this.f19200v.mo55510b();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo55605z() {
        if (this.f19187G != null) {
            try {
                boolean z = false;
                float f = (float) (!this.f19183C ? 0 : 1);
                this.f19187G.setVolume(f, f);
                if (!this.f19183C) {
                    z = true;
                }
                this.f19183C = z;
                m23593e(z);
                mo55546a(this.f19183C, 0);
            } catch (Throwable unused) {
            }
        }
    }
}
