package com.appodeal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.VideoPlayerActivity;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.C9634m;
import com.appodeal.ads.utils.C9637n;
import com.appodeal.ads.utils.C9650s;
import com.appodeal.ads.utils.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.view.CircleCountdownView;
import java.io.File;
import java.util.List;
import java.util.Timer;

/* renamed from: com.appodeal.ads.g2 */
public final class C9195g2 extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.C8997a {

    /* renamed from: x */
    public static final String f23097x = C9195g2.class.getSimpleName();

    /* renamed from: y */
    public static C9195g2 f23098y;

    /* renamed from: a */
    public C9263l2 f23099a;

    /* renamed from: b */
    public boolean f23100b = false;

    /* renamed from: c */
    public ImageView f23101c;

    /* renamed from: d */
    public ProgressBar f23102d;

    /* renamed from: e */
    public ImageView f23103e;

    /* renamed from: f */
    public CircleCountdownView f23104f;

    /* renamed from: g */
    public MediaPlayer f23105g;

    /* renamed from: h */
    public TextureView f23106h;

    /* renamed from: i */
    public Timer f23107i;

    /* renamed from: j */
    public boolean f23108j;

    /* renamed from: k */
    public boolean f23109k;

    /* renamed from: l */
    public boolean f23110l = true;

    /* renamed from: m */
    public boolean f23111m;

    /* renamed from: n */
    public boolean f23112n;

    /* renamed from: o */
    public boolean f23113o;

    /* renamed from: p */
    public boolean f23114p;

    /* renamed from: q */
    public boolean f23115q;

    /* renamed from: r */
    public volatile boolean f23116r;

    /* renamed from: s */
    public boolean f23117s;

    /* renamed from: t */
    public VastRequest f23118t;

    /* renamed from: u */
    public int f23119u;

    /* renamed from: v */
    public int f23120v;

    /* renamed from: w */
    public int f23121w = 1;

    public C9195g2(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m27312a(C9195g2 g2Var, TrackingEvent trackingEvent) {
        C9263l2 l2Var;
        List<String> list;
        VastRequest vastRequest = g2Var.f23118t;
        if (!(vastRequest == null || vastRequest.getVastAd() == null || (list = g2Var.f23118t.getVastAd().getTrackingEventListMap().get(trackingEvent)) == null)) {
            for (String a : list) {
                C9326n5.m27538a(a, C9650s.f24449e);
            }
        }
        if (trackingEvent == TrackingEvent.complete && (l2Var = g2Var.f23099a) != null) {
            l2Var.mo60122g();
        }
    }

    /* renamed from: b */
    public static boolean m27314b(C9195g2 g2Var) {
        g2Var.getClass();
        return g2Var.getGlobalVisibleRect(new Rect()) && g2Var.isShown() && g2Var.hasWindowFocus();
    }

    /* renamed from: e */
    public static /* synthetic */ void m27317e(C9195g2 g2Var) {
        g2Var.f23120v++;
    }

    /* renamed from: c */
    public final boolean mo59954c() {
        return !this.f23116r && this.f23105g != null;
    }

    /* renamed from: d */
    public final void mo59955d() {
        if (mo59954c() && this.f23105g.isPlaying()) {
            this.f23105g.pause();
        }
        if (this.f23121w != 3) {
            this.f23121w = 4;
            mo59959h();
        }
    }

    /* renamed from: e */
    public final void mo59956e() {
        try {
            if (!this.f23111m && this.f23099a.f23302q != null && !this.f23112n && !this.f23116r) {
                this.f23105g.setDataSource(getContext(), this.f23099a.f23302q);
                this.f23105g.prepareAsync();
                this.f23112n = true;
            }
        } catch (Exception e) {
            Log.log(e);
        }
    }

    /* renamed from: f */
    public final void mo59957f() {
        List<String> impressionUrlList;
        if (this.f23105g == null) {
            mo59953b();
        }
        if (!this.f23111m) {
            mo59956e();
        }
        if (mo59954c() && !this.f23105g.isPlaying() && this.f23111m && this.f23113o) {
            if (getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus()) {
                this.f23121w = 2;
                mo59959h();
                this.f23105g.start();
                if (!this.f23108j) {
                    VastRequest vastRequest = this.f23118t;
                    if (!(vastRequest == null || vastRequest.getVastAd() == null || (impressionUrlList = this.f23118t.getVastAd().getImpressionUrlList()) == null)) {
                        for (String a : impressionUrlList) {
                            C9326n5.m27538a(a, C9650s.f24449e);
                        }
                    }
                    this.f23108j = true;
                    Log.log(f23097x, "Video", "started");
                }
                if (this.f23107i == null && this.f23115q) {
                    Timer timer = new Timer();
                    this.f23107i = timer;
                    timer.schedule(new C9184f2(this), 0, (long) 500);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo59958g() {
        CircleCountdownView circleCountdownView = this.f23104f;
        if (circleCountdownView != null) {
            circleCountdownView.setImage(Assets.getBitmapFromBase64(this.f23110l ? "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII=" : "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg=="));
        }
    }

    /* renamed from: h */
    public final void mo59959h() {
        int a = C9270m.m27455a(this.f23121w);
        if (a == 0) {
            ImageView imageView = this.f23101c;
            if (imageView != null) {
                imageView.setVisibility(0);
                this.f23101c.bringToFront();
            }
            if (this.f23115q) {
                this.f23106h.setVisibility(4);
                this.f23102d.setVisibility(4);
            } else {
                return;
            }
        } else if (a == 1) {
            ImageView imageView2 = this.f23101c;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            if (this.f23115q) {
                this.f23106h.setVisibility(0);
                this.f23106h.bringToFront();
                this.f23104f.setVisibility(0);
                this.f23104f.bringToFront();
                mo59958g();
                this.f23102d.setVisibility(4);
                this.f23103e.setVisibility(4);
                return;
            }
            return;
        } else if (a == 2) {
            ImageView imageView3 = this.f23101c;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                this.f23101c.bringToFront();
            }
            if (this.f23115q) {
                this.f23102d.setVisibility(0);
                this.f23102d.bringToFront();
                this.f23106h.setVisibility(4);
            } else {
                return;
            }
        } else if (a == 3) {
            ImageView imageView4 = this.f23101c;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
                this.f23101c.bringToFront();
            }
            if (this.f23115q) {
                this.f23103e.setVisibility(0);
                this.f23103e.bringToFront();
                this.f23106h.setVisibility(4);
                this.f23102d.setVisibility(4);
                this.f23104f.setVisibility(4);
            }
            return;
        } else {
            return;
        }
        this.f23103e.setVisibility(4);
        this.f23104f.setVisibility(4);
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C9263l2 l2Var;
        List<String> list;
        if (!this.f23109k) {
            TrackingEvent trackingEvent = TrackingEvent.complete;
            VastRequest vastRequest = this.f23118t;
            if (!(vastRequest == null || vastRequest.getVastAd() == null || (list = this.f23118t.getVastAd().getTrackingEventListMap().get(trackingEvent)) == null)) {
                for (String a : list) {
                    C9326n5.m27538a(a, C9650s.f24449e);
                }
            }
            if (trackingEvent == TrackingEvent.complete && (l2Var = this.f23099a) != null) {
                l2Var.mo60122g();
            }
            this.f23109k = true;
            Log.log(f23097x, "Video", "finished");
        }
        Timer timer = this.f23107i;
        if (timer != null) {
            timer.cancel();
            this.f23107i = null;
        }
        mo59955d();
        if (mo59954c()) {
            this.f23105g.seekTo(0);
        }
        this.f23117s = true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.log(f23097x, LogConstants.EVENT_MV_PLAYER_ERROR, String.format("what: %s, extra: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        mo59951a();
        return true;
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(size, measuredWidth) : measuredWidth;
        }
        int i3 = (int) (((float) size) * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i3) {
            size2 = i3;
        } else {
            size = (int) (((float) size2) * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i, i2);
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        Log.log(f23097x, LogConstants.EVENT_MV_PLAYER, "prepared");
        this.f23111m = true;
        if (Native.f22732b == Native.NativeAdType.NoVideo) {
            return;
        }
        if (this.f23114p) {
            mo59957f();
            return;
        }
        this.f23121w = 4;
        mo59959h();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        try {
            if (Native.f22732b != Native.NativeAdType.NoVideo) {
                if (this.f23105g == null) {
                    mo59953b();
                }
                this.f23105g.setSurface(new Surface(surfaceTexture));
                mo59956e();
            }
        } catch (Exception e) {
            Log.log(e);
            this.f23121w = 1;
            mo59959h();
            this.f23115q = false;
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 0 || i2 == 0) {
            Log.log(f23097x, "Video", "onVideoSizeChanged - skip: width or height is 0");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f23106h.getLayoutParams();
        int width = getWidth();
        int height = getHeight();
        if (i > i2) {
            layoutParams.width = width;
            layoutParams.height = (width * i2) / i;
        } else {
            layoutParams.width = (i * height) / i2;
            layoutParams.height = height;
        }
        this.f23106h.setLayoutParams(layoutParams);
    }

    public final void onWindowVisibilityChanged(int i) {
        if (Native.f22732b != Native.NativeAdType.NoVideo) {
            if (i != 0) {
                mo59955d();
            } else if (this.f23114p) {
                mo59957f();
            }
        }
        super.onWindowVisibilityChanged(i);
    }

    public void setNativeAd(C9263l2 l2Var) {
        Runnable runnable;
        C9263l2 l2Var2;
        this.f23099a = l2Var;
        if (Native.f22732b != Native.NativeAdType.NoVideo && ((l2Var.mo60120e() != null && !l2Var.mo60120e().isEmpty()) || (l2Var.mo60119d() != null && !l2Var.mo60119d().isEmpty()))) {
            this.f23115q = true;
            if (l2Var.mo60118c() != null) {
                this.f23118t = l2Var.mo60118c();
            }
        }
        if (!this.f23100b) {
            this.f23100b = true;
            this.f23101c = new ImageView(getContext());
            this.f23101c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f23101c.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f23101c.setAdjustViewBounds(true);
            addView(this.f23101c);
            if (this.f23115q) {
                int round = Math.round(C9182f1.m27290l(getContext()) * 50.0f);
                this.f23102d = new ProgressBar(getContext(), (AttributeSet) null, 16842874);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(round, round);
                layoutParams.addRule(13, -1);
                this.f23102d.setLayoutParams(layoutParams);
                this.f23102d.setBackgroundColor(Color.parseColor("#6b000000"));
                addView(this.f23102d);
                ImageView imageView = new ImageView(getContext());
                this.f23103e = imageView;
                imageView.setImageResource(17301540);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round, round);
                layoutParams2.addRule(13, -1);
                this.f23103e.setLayoutParams(layoutParams2);
                this.f23103e.setBackgroundColor(Color.parseColor("#6b000000"));
                this.f23103e.setOnClickListener(new C9003a2(this));
                addView(this.f23103e);
                TextureView textureView = new TextureView(getContext());
                this.f23106h = textureView;
                textureView.setSurfaceTextureListener(this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(13);
                this.f23106h.setLayoutParams(layoutParams3);
                this.f23106h.setOnClickListener(new C9130b2(this));
                addView(this.f23106h);
                CircleCountdownView circleCountdownView = new CircleCountdownView(getContext());
                this.f23104f = circleCountdownView;
                circleCountdownView.setColors(Assets.mainAssetsColor, Assets.backgroundColor);
                int a = C9182f1.m27267a(getContext(), 8.0f);
                this.f23104f.setPadding(a, a, a, a);
                int a2 = C9182f1.m27267a(getContext(), 40.0f);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(a2, a2);
                layoutParams4.addRule(9);
                layoutParams4.addRule(10);
                this.f23104f.setLayoutParams(layoutParams4);
                mo59958g();
                this.f23104f.setOnClickListener(new C9175e2(this));
                addView(this.f23104f);
                mo59953b();
                if (Native.f22732b != Native.NativeAdType.Video || (l2Var2 = this.f23099a) == null || l2Var2.mo60117b() == null || !new File(this.f23099a.mo60117b().getPath()).exists()) {
                    this.f23121w = 3;
                    mo59959h();
                    if (this.f23099a.mo60120e() != null && !this.f23099a.mo60120e().isEmpty()) {
                        runnable = new C9634m(getContext(), new C9141c2(this), this.f23099a.mo60120e());
                    } else if (this.f23099a.mo60119d() != null && !this.f23099a.mo60119d().isEmpty()) {
                        runnable = new C9637n(getContext(), new C9168d2(this), this.f23099a.mo60119d());
                    }
                    C9650s.f24449e.f24450a.execute(runnable);
                } else {
                    this.f23114p = Native.f22735e;
                }
            } else {
                this.f23121w = 1;
                mo59959h();
                this.f23101c.bringToFront();
            }
        }
        C9263l2 l2Var3 = this.f23099a;
        if (l2Var3 != null) {
            C9263l2.m27438a(this.f23101c, l2Var3.f23297l, l2Var3.f23298m);
        }
    }

    /* renamed from: b */
    public final void mo59953b() {
        float f;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.f23105g = mediaPlayer2;
        mediaPlayer2.setOnCompletionListener(this);
        this.f23105g.setOnErrorListener(this);
        this.f23105g.setOnPreparedListener(this);
        this.f23105g.setOnVideoSizeChangedListener(this);
        this.f23105g.setAudioStreamType(3);
        if (mo59954c()) {
            if (this.f23110l) {
                mediaPlayer = this.f23105g;
                f = 0.0f;
            } else {
                mediaPlayer = this.f23105g;
                f = 1.0f;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    /* renamed from: a */
    public final void mo59951a() {
        this.f23114p = false;
        if (this.f23105g != null) {
            try {
                if (!this.f23116r) {
                    if (this.f23105g.isPlaying()) {
                        this.f23105g.stop();
                    }
                    this.f23105g.reset();
                }
                this.f23105g.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                this.f23105g.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                this.f23105g.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                this.f23105g.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
                this.f23105g.release();
            } catch (Exception e) {
                Log.log(e);
            }
            this.f23105g = null;
        }
        this.f23121w = 1;
        mo59959h();
        Timer timer = this.f23107i;
        if (timer != null) {
            timer.cancel();
            this.f23107i = null;
        }
        this.f23116r = true;
        this.f23115q = false;
        VastRequest vastRequest = this.f23118t;
        if (vastRequest != null) {
            vastRequest.sendError(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
        }
    }

    /* renamed from: a */
    public final void mo59952a(int i, boolean z) {
        C9263l2 l2Var;
        List<String> list;
        Log.log(f23097x, LogConstants.EVENT_MV_STATE, String.format("videoPlayerActivityClosed, position: %s, finished: %s", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)}));
        if (z) {
            try {
                if (!this.f23109k) {
                    TrackingEvent trackingEvent = TrackingEvent.complete;
                    VastRequest vastRequest = this.f23118t;
                    if (!(vastRequest == null || vastRequest.getVastAd() == null || (list = this.f23118t.getVastAd().getTrackingEventListMap().get(trackingEvent)) == null)) {
                        for (String a : list) {
                            C9326n5.m27538a(a, C9650s.f24449e);
                        }
                    }
                    if (trackingEvent == TrackingEvent.complete && (l2Var = this.f23099a) != null) {
                        l2Var.mo60122g();
                    }
                    this.f23109k = true;
                    Log.log(f23097x, "Video", "finished");
                }
                Timer timer = this.f23107i;
                if (timer != null) {
                    timer.cancel();
                    this.f23107i = null;
                }
                mo59955d();
                if (mo59954c()) {
                    this.f23105g.seekTo(0);
                }
                this.f23117s = true;
            } catch (Exception e) {
                Log.log(e);
            }
        } else if (mo59954c()) {
            this.f23105g.seekTo(i);
        }
        f23098y = null;
    }
}
