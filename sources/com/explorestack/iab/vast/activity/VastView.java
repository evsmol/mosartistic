package com.explorestack.iab.vast.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.measurer.VastAdMeasurer;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.C1392d;
import com.explorestack.iab.utils.C1393e;
import com.explorestack.iab.utils.C1394f;
import com.explorestack.iab.utils.C1395g;
import com.explorestack.iab.utils.C1398h;
import com.explorestack.iab.utils.C1399i;
import com.explorestack.iab.utils.C1400j;
import com.explorestack.iab.utils.C1401k;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.C1422a;
import com.explorestack.iab.vast.C1459b;
import com.explorestack.iab.vast.C1462c;
import com.explorestack.iab.vast.C1463d;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VastPlaybackListener;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VastRequestListener;
import com.explorestack.iab.vast.VideoType;
import com.explorestack.iab.vast.processor.VastAd;
import com.explorestack.iab.vast.tags.AppodealExtensionTag;
import com.explorestack.iab.vast.tags.CompanionTag;
import com.explorestack.iab.vast.tags.PostBannerTag;
import com.explorestack.iab.vast.view.C1474a;
import com.explorestack.iab.view.C1475a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class VastView extends RelativeLayout implements IabClickCallback {

    /* renamed from: A */
    public int f4416A;

    /* renamed from: B */
    public int f4417B;

    /* renamed from: C */
    public int f4418C;

    /* renamed from: D */
    public boolean f4419D;

    /* renamed from: E */
    public boolean f4420E;

    /* renamed from: F */
    public boolean f4421F;

    /* renamed from: G */
    public boolean f4422G;

    /* renamed from: H */
    public boolean f4423H;

    /* renamed from: I */
    public boolean f4424I;

    /* renamed from: J */
    public boolean f4425J;

    /* renamed from: K */
    public boolean f4426K;

    /* renamed from: L */
    public boolean f4427L;

    /* renamed from: M */
    public boolean f4428M;

    /* renamed from: N */
    public final List<View> f4429N;

    /* renamed from: O */
    public final List<C1395g<? extends View>> f4430O;

    /* renamed from: P */
    public final Runnable f4431P;

    /* renamed from: Q */
    public final Runnable f4432Q;

    /* renamed from: R */
    public final C1431b0 f4433R;

    /* renamed from: S */
    public final C1431b0 f4434S;

    /* renamed from: T */
    public final LinkedList<Integer> f4435T;

    /* renamed from: U */
    public int f4436U;

    /* renamed from: V */
    public float f4437V;

    /* renamed from: W */
    public final C1431b0 f4438W;

    /* renamed from: a */
    public final String f4439a;

    /* renamed from: a0 */
    public final TextureView.SurfaceTextureListener f4440a0;

    /* renamed from: b */
    public C1474a f4441b;

    /* renamed from: b0 */
    public final MediaPlayer.OnCompletionListener f4442b0;

    /* renamed from: c */
    public FrameLayout f4443c;

    /* renamed from: c0 */
    public final MediaPlayer.OnErrorListener f4444c0;

    /* renamed from: d */
    public Surface f4445d;

    /* renamed from: d0 */
    public final MediaPlayer.OnPreparedListener f4446d0;

    /* renamed from: e */
    public FrameLayout f4447e;

    /* renamed from: e0 */
    public final MediaPlayer.OnVideoSizeChangedListener f4448e0;

    /* renamed from: f */
    public C1475a f4449f;

    /* renamed from: f0 */
    public C1459b.C1461b f4450f0;

    /* renamed from: g */
    public C1392d f4451g;

    /* renamed from: g0 */
    public final View.OnTouchListener f4452g0;

    /* renamed from: h */
    public C1393e f4453h;

    /* renamed from: h0 */
    public final WebChromeClient f4454h0;

    /* renamed from: i */
    public C1401k f4455i;

    /* renamed from: i0 */
    public final WebViewClient f4456i0;

    /* renamed from: j */
    public C1399i f4457j;

    /* renamed from: k */
    public C1398h f4458k;

    /* renamed from: l */
    public C1400j f4459l;

    /* renamed from: m */
    public C1394f f4460m;

    /* renamed from: n */
    public MediaPlayer f4461n;

    /* renamed from: o */
    public View f4462o;

    /* renamed from: p */
    public CompanionTag f4463p;

    /* renamed from: q */
    public CompanionTag f4464q;

    /* renamed from: r */
    public ImageView f4465r;

    /* renamed from: s */
    public MraidInterstitial f4466s;

    /* renamed from: t */
    public VastRequest f4467t;

    /* renamed from: u */
    public C1433c0 f4468u;

    /* renamed from: v */
    public VastViewListener f4469v;

    /* renamed from: w */
    public VastPlaybackListener f4470w;

    /* renamed from: x */
    public VastAdMeasurer f4471x;

    /* renamed from: y */
    public C1457z f4472y;

    /* renamed from: z */
    public int f4473z;

    public interface VastViewListener {
        void onClick(VastView vastView, VastRequest vastRequest, IabClickCallback iabClickCallback, String str);

        void onComplete(VastView vastView, VastRequest vastRequest);

        void onError(VastView vastView, VastRequest vastRequest, int i);

        void onFinish(VastView vastView, VastRequest vastRequest, boolean z);

        void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i);

        void onShown(VastView vastView, VastRequest vastRequest);
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$a */
    public class C1424a extends C1457z {

        /* renamed from: f */
        public final /* synthetic */ WeakReference f4474f;

        /* renamed from: com.explorestack.iab.vast.activity.VastView$a$a */
        public class C1425a implements View.OnClickListener {
            public C1425a() {
            }

            public void onClick(View view) {
                boolean unused = VastView.this.mo4315j();
                VastView.this.mo4296e();
            }
        }

        /* renamed from: com.explorestack.iab.vast.activity.VastView$a$b */
        public class C1426b extends AnimatorListenerAdapter {
            public C1426b() {
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                VastView.this.f4443c.setVisibility(8);
            }
        }

        /* renamed from: com.explorestack.iab.vast.activity.VastView$a$c */
        public class C1427c implements View.OnClickListener {
            public C1427c() {
            }

            public void onClick(View view) {
                boolean unused = VastView.this.mo4315j();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1424a(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f4474f = weakReference;
        }

        /* renamed from: a */
        public void mo4350a(Bitmap bitmap) {
            View.OnClickListener onClickListener;
            ImageView imageView = (ImageView) this.f4474f.get();
            if (imageView != null) {
                if (bitmap == null) {
                    onClickListener = new C1425a();
                } else {
                    imageView.setImageBitmap(bitmap);
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(100).setListener(new C1426b()).start();
                    onClickListener = new C1427c();
                }
                imageView.setOnClickListener(onClickListener);
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$a0 */
    public static class C1428a0 extends View.BaseSavedState {
        public static final Parcelable.Creator<C1428a0> CREATOR = new C1429a();

        /* renamed from: a */
        public C1433c0 f4479a;

        /* renamed from: com.explorestack.iab.vast.activity.VastView$a0$a */
        public class C1429a implements Parcelable.Creator<C1428a0> {
            /* renamed from: a */
            public C1428a0 createFromParcel(Parcel parcel) {
                return new C1428a0(parcel);
            }

            /* renamed from: a */
            public C1428a0[] newArray(int i) {
                return new C1428a0[i];
            }
        }

        public C1428a0(Parcel parcel) {
            super(parcel);
            this.f4479a = (C1433c0) parcel.readParcelable(C1433c0.class.getClassLoader());
        }

        public C1428a0(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4479a, 0);
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$b */
    public class C1430b implements Runnable {
        public C1430b() {
        }

        public void run() {
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.mo4292d();
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$b0 */
    public interface C1431b0 {
        /* renamed from: a */
        void mo4360a(int i, int i2, float f);
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$c */
    public class C1432c implements Runnable {
        public C1432c() {
        }

        public void run() {
            try {
                if (VastView.this.isPlaybackStarted() && VastView.this.f4461n.isPlaying()) {
                    int duration = VastView.this.f4461n.getDuration();
                    int currentPosition = VastView.this.f4461n.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f = (((float) currentPosition) * 100.0f) / ((float) duration);
                        VastView.this.f4433R.mo4360a(duration, currentPosition, f);
                        VastView.this.f4434S.mo4360a(duration, currentPosition, f);
                        VastView.this.f4438W.mo4360a(duration, currentPosition, f);
                        if (f > 105.0f) {
                            VastLog.m6351a(VastView.this.f4439a, "Playback tracking: video hang detected");
                            VastView.this.mo4303h();
                        }
                    }
                }
            } catch (Exception e) {
                String f2 = VastView.this.f4439a;
                VastLog.m6351a(f2, "Playback tracking exception: " + e.getMessage());
            }
            VastView.this.postDelayed(this, 16);
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$c0 */
    public static class C1433c0 implements Parcelable {
        public static final Parcelable.Creator<C1433c0> CREATOR = new C1434a();

        /* renamed from: a */
        public String f4482a;

        /* renamed from: b */
        public float f4483b;

        /* renamed from: c */
        public int f4484c;

        /* renamed from: d */
        public int f4485d;

        /* renamed from: e */
        public boolean f4486e;

        /* renamed from: f */
        public boolean f4487f;

        /* renamed from: g */
        public boolean f4488g;

        /* renamed from: h */
        public boolean f4489h;

        /* renamed from: i */
        public boolean f4490i;

        /* renamed from: j */
        public boolean f4491j;

        /* renamed from: k */
        public boolean f4492k;

        /* renamed from: l */
        public boolean f4493l;

        /* renamed from: m */
        public boolean f4494m;

        /* renamed from: n */
        public boolean f4495n;

        /* renamed from: com.explorestack.iab.vast.activity.VastView$c0$a */
        public class C1434a implements Parcelable.Creator<C1433c0> {
            /* renamed from: a */
            public C1433c0 createFromParcel(Parcel parcel) {
                return new C1433c0(parcel);
            }

            /* renamed from: a */
            public C1433c0[] newArray(int i) {
                return new C1433c0[i];
            }
        }

        public C1433c0() {
            this.f4482a = null;
            this.f4483b = 5.0f;
            this.f4484c = 0;
            this.f4485d = 0;
            this.f4486e = true;
            this.f4487f = false;
            this.f4488g = false;
            this.f4489h = false;
            this.f4490i = false;
            this.f4491j = false;
            this.f4492k = false;
            this.f4493l = false;
            this.f4494m = true;
            this.f4495n = false;
        }

        public C1433c0(Parcel parcel) {
            this.f4482a = null;
            this.f4483b = 5.0f;
            boolean z = false;
            this.f4484c = 0;
            this.f4485d = 0;
            this.f4486e = true;
            this.f4487f = false;
            this.f4488g = false;
            this.f4489h = false;
            this.f4490i = false;
            this.f4491j = false;
            this.f4492k = false;
            this.f4493l = false;
            this.f4494m = true;
            this.f4495n = false;
            this.f4482a = parcel.readString();
            this.f4483b = parcel.readFloat();
            this.f4484c = parcel.readInt();
            this.f4485d = parcel.readInt();
            this.f4486e = parcel.readByte() != 0;
            this.f4487f = parcel.readByte() != 0;
            this.f4488g = parcel.readByte() != 0;
            this.f4489h = parcel.readByte() != 0;
            this.f4490i = parcel.readByte() != 0;
            this.f4491j = parcel.readByte() != 0;
            this.f4492k = parcel.readByte() != 0;
            this.f4493l = parcel.readByte() != 0;
            this.f4494m = parcel.readByte() != 0;
            this.f4495n = parcel.readByte() != 0 ? true : z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f4482a);
            parcel.writeFloat(this.f4483b);
            parcel.writeInt(this.f4484c);
            parcel.writeInt(this.f4485d);
            parcel.writeByte(this.f4486e ? (byte) 1 : 0);
            parcel.writeByte(this.f4487f ? (byte) 1 : 0);
            parcel.writeByte(this.f4488g ? (byte) 1 : 0);
            parcel.writeByte(this.f4489h ? (byte) 1 : 0);
            parcel.writeByte(this.f4490i ? (byte) 1 : 0);
            parcel.writeByte(this.f4491j ? (byte) 1 : 0);
            parcel.writeByte(this.f4492k ? (byte) 1 : 0);
            parcel.writeByte(this.f4493l ? (byte) 1 : 0);
            parcel.writeByte(this.f4494m ? (byte) 1 : 0);
            parcel.writeByte(this.f4495n ? (byte) 1 : 0);
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$d */
    public class C1435d implements C1431b0 {
        public C1435d() {
        }

        /* renamed from: a */
        public void mo4360a(int i, int i2, float f) {
            C1393e eVar;
            VastView vastView = VastView.this;
            C1433c0 c0Var = vastView.f4468u;
            if (!c0Var.f4490i && c0Var.f4483b != 0.0f && vastView.f4467t.getVideoType() == VideoType.NonRewarded) {
                VastView vastView2 = VastView.this;
                float f2 = vastView2.f4468u.f4483b * 1000.0f;
                float f3 = (float) i2;
                float f4 = f2 - f3;
                int i3 = (int) ((f3 * 100.0f) / f2);
                String f5 = vastView2.f4439a;
                VastLog.m6354d(f5, "Skip percent: " + i3);
                if (i3 < 100 && (eVar = VastView.this.f4453h) != null) {
                    eVar.mo4107a(i3, (int) Math.ceil(((double) f4) / 1000.0d));
                }
                if (f4 <= 0.0f) {
                    VastView vastView3 = VastView.this;
                    C1433c0 c0Var2 = vastView3.f4468u;
                    c0Var2.f4483b = 0.0f;
                    c0Var2.f4490i = true;
                    vastView3.setCloseControlsVisible(true);
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$e */
    public class C1436e implements C1431b0 {
        public C1436e() {
        }

        /* renamed from: a */
        public void mo4360a(int i, int i2, float f) {
            VastView vastView = VastView.this;
            C1433c0 c0Var = vastView.f4468u;
            if (!c0Var.f4489h || c0Var.f4484c != 3) {
                if (vastView.f4467t.getMaxDurationMillis() > 0 && i2 > VastView.this.f4467t.getMaxDurationMillis() && VastView.this.f4467t.getVideoType() == VideoType.Rewarded) {
                    VastView vastView2 = VastView.this;
                    vastView2.f4468u.f4490i = true;
                    vastView2.setCloseControlsVisible(true);
                }
                VastView vastView3 = VastView.this;
                int i3 = vastView3.f4468u.f4484c;
                if (f > ((float) i3) * 25.0f) {
                    if (i3 == 3) {
                        VastLog.m6354d(vastView3.f4439a, "Video at third quartile: (" + f + "%)");
                        VastView.this.mo4290c(TrackingEvent.thirdQuartile);
                        if (VastView.this.f4470w != null) {
                            VastView.this.f4470w.onVideoThirdQuartile();
                        }
                    } else if (i3 == 0) {
                        VastLog.m6354d(vastView3.f4439a, "Video at start: (" + f + "%)");
                        VastView.this.mo4290c(TrackingEvent.start);
                        if (VastView.this.f4470w != null) {
                            VastView.this.f4470w.onVideoStarted((float) i, VastView.this.f4468u.f4487f ? 0.0f : 1.0f);
                        }
                    } else if (i3 == 1) {
                        VastLog.m6354d(vastView3.f4439a, "Video at first quartile: (" + f + "%)");
                        VastView.this.mo4290c(TrackingEvent.firstQuartile);
                        if (VastView.this.f4470w != null) {
                            VastView.this.f4470w.onVideoFirstQuartile();
                        }
                    } else if (i3 == 2) {
                        VastLog.m6354d(vastView3.f4439a, "Video at midpoint: (" + f + "%)");
                        VastView.this.mo4290c(TrackingEvent.midpoint);
                        if (VastView.this.f4470w != null) {
                            VastView.this.f4470w.onVideoMidpoint();
                        }
                    }
                    VastView.this.f4468u.f4484c++;
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$f */
    public class C1437f implements C1431b0 {
        public C1437f() {
        }

        /* renamed from: a */
        public void mo4360a(int i, int i2, float f) {
            if (VastView.this.f4435T.size() == 2 && ((Integer) VastView.this.f4435T.getFirst()).intValue() > ((Integer) VastView.this.f4435T.getLast()).intValue()) {
                VastLog.m6351a(VastView.this.f4439a, "Playing progressing error: seek");
                VastView.this.f4435T.removeFirst();
            }
            if (VastView.this.f4435T.size() == 19) {
                int intValue = ((Integer) VastView.this.f4435T.getFirst()).intValue();
                int intValue2 = ((Integer) VastView.this.f4435T.getLast()).intValue();
                VastLog.m6354d(VastView.this.f4439a, String.format(Locale.ENGLISH, "Playing progressing position: last=%d, first=%d)", new Object[]{Integer.valueOf(intValue2), Integer.valueOf(intValue)}));
                if (intValue2 > intValue) {
                    VastView.this.f4435T.removeFirst();
                } else {
                    VastView.m6428l(VastView.this);
                    if (VastView.this.f4436U >= 3) {
                        VastLog.m6351a(VastView.this.f4439a, "Playing progressing error: video hang detected");
                        VastView.this.mo4316k();
                        return;
                    }
                }
            }
            try {
                VastView.this.f4435T.addLast(Integer.valueOf(i2));
                if (i != 0 && i2 > 0) {
                    VastView vastView = VastView.this;
                    if (vastView.f4459l != null) {
                        String f2 = vastView.f4439a;
                        VastLog.m6354d(f2, "Playing progressing percent: " + f);
                        if (VastView.this.f4437V < f) {
                            float unused = VastView.this.f4437V = f;
                            int i3 = i / 1000;
                            VastView.this.f4459l.mo4129a(f, Math.min(i3, (int) Math.ceil((double) (((float) i2) / 1000.0f))), i3);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$g */
    public class C1438g implements TextureView.SurfaceTextureListener {
        public C1438g() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VastLog.m6354d(VastView.this.f4439a, "onSurfaceTextureAvailable");
            VastView.this.f4445d = new Surface(surfaceTexture);
            boolean unused = VastView.this.f4421F = true;
            if (VastView.this.f4422G) {
                boolean unused2 = VastView.this.f4422G = false;
                VastView.this.startPlayback("onSurfaceTextureAvailable");
            } else if (VastView.this.isPlaybackStarted()) {
                VastView vastView = VastView.this;
                vastView.f4461n.setSurface(vastView.f4445d);
                VastView.this.mo4342t();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            VastLog.m6354d(VastView.this.f4439a, "onSurfaceTextureDestroyed");
            VastView vastView = VastView.this;
            vastView.f4445d = null;
            boolean unused = vastView.f4421F = false;
            if (VastView.this.isPlaybackStarted()) {
                VastView.this.f4461n.setSurface((Surface) null);
                VastView.this.mo4320n();
            }
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            String f = VastView.this.f4439a;
            VastLog.m6354d(f, "onSurfaceTextureSizeChanged: " + i + "/" + i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$h */
    public class C1439h implements MediaPlayer.OnCompletionListener {
        public C1439h() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            VastLog.m6354d(VastView.this.f4439a, "MediaPlayer - onCompletion");
            VastView.this.mo4303h();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$i */
    public class C1440i implements MediaPlayer.OnErrorListener {
        public C1440i() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String f = VastView.this.f4439a;
            VastLog.m6354d(f, "MediaPlayer - onError: what=" + i + ", extra=" + i2);
            VastView.this.mo4316k();
            return true;
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$j */
    public class C1441j implements MediaPlayer.OnPreparedListener {
        public C1441j() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            VastLog.m6354d(VastView.this.f4439a, "MediaPlayer - onPrepared");
            VastView vastView = VastView.this;
            if (!vastView.f4468u.f4491j) {
                vastView.mo4290c(TrackingEvent.creativeView);
                VastView.this.mo4290c(TrackingEvent.fullscreen);
                VastView.this.mo4265A();
                VastView.this.setLoadingViewVisibility(false);
                boolean unused = VastView.this.f4424I = true;
                if (!VastView.this.f4468u.f4488g) {
                    mediaPlayer.start();
                    VastView.this.mo4346w();
                }
                VastView.this.mo4349z();
                int i = VastView.this.f4468u.f4485d;
                if (i > 0) {
                    mediaPlayer.seekTo(i);
                    VastView.this.mo4290c(TrackingEvent.resume);
                    if (VastView.this.f4470w != null) {
                        VastView.this.f4470w.onVideoResumed();
                    }
                }
                VastView vastView2 = VastView.this;
                if (!vastView2.f4468u.f4494m) {
                    vastView2.mo4320n();
                }
                VastView vastView3 = VastView.this;
                if (!vastView3.f4468u.f4492k) {
                    vastView3.mo4306i();
                    if (VastView.this.f4467t.shouldPreloadCompanion()) {
                        VastView.this.mo4280a(false);
                    }
                }
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$k */
    public class C1442k implements View.OnClickListener {
        public C1442k() {
        }

        public void onClick(View view) {
            if (VastView.this.isPlaybackStarted() || VastView.this.f4468u.f4491j) {
                VastView.this.mo4345v();
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$l */
    public class C1443l implements MediaPlayer.OnVideoSizeChangedListener {
        public C1443l() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            VastLog.m6354d(VastView.this.f4439a, "onVideoSizeChanged");
            int unused = VastView.this.f4417B = i;
            int unused2 = VastView.this.f4418C = i2;
            VastView.this.mo4292d();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$m */
    public class C1444m implements C1459b.C1461b {
        public C1444m() {
        }

        /* renamed from: a */
        public void mo4377a(boolean z) {
            VastView.this.mo4266B();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$n */
    public class C1445n implements View.OnTouchListener {
        public C1445n() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            VastView.this.f4429N.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$o */
    public class C1446o extends WebChromeClient {
        public C1446o() {
        }

        /* renamed from: a */
        public final boolean mo4379a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.m6354d("JS alert", str2);
            return mo4379a(jsResult);
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            VastLog.m6354d("JS confirm", str2);
            return mo4379a(jsResult);
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            VastLog.m6354d("JS prompt", str2);
            return mo4379a(jsPromptResult);
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$p */
    public class C1447p extends WebViewClient {
        public C1447p() {
        }

        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, (Paint) null);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.hasGesture()) {
                VastView.this.f4429N.add(webView);
            }
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!VastView.this.f4429N.contains(webView)) {
                return true;
            }
            VastLog.m6354d(VastView.this.f4439a, "banner clicked");
            VastView vastView = VastView.this;
            boolean unused = vastView.mo4282a(vastView.f4463p, str);
            return true;
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$q */
    public class C1448q implements C1463d {

        /* renamed from: a */
        public final /* synthetic */ boolean f4509a;

        public C1448q(boolean z) {
            this.f4509a = z;
        }

        /* renamed from: a */
        public void mo4386a(VastRequest vastRequest) {
            VastView vastView = VastView.this;
            vastView.mo4277a(vastView.f4469v, vastRequest);
        }

        /* renamed from: a */
        public void mo4387a(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.mo4274a(vastRequest, vastAd, this.f4509a);
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$r */
    public class C1449r implements C1463d {

        /* renamed from: a */
        public final /* synthetic */ boolean f4511a;

        public C1449r(boolean z) {
            this.f4511a = z;
        }

        /* renamed from: a */
        public void mo4386a(VastRequest vastRequest) {
            VastView vastView = VastView.this;
            vastView.mo4277a(vastView.f4469v, vastRequest);
        }

        /* renamed from: a */
        public void mo4387a(VastRequest vastRequest, VastAd vastAd) {
            VastView.this.mo4274a(vastRequest, vastAd, this.f4511a);
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$s */
    public class C1450s implements C1475a.C1479d {
        public C1450s() {
        }

        public void onCloseClick() {
            VastView vastView = VastView.this;
            vastView.mo4277a(vastView.f4469v, VastView.this.f4467t);
        }

        public void onCountDownFinish() {
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$t */
    public class C1451t implements View.OnClickListener {
        public C1451t() {
        }

        public void onClick(View view) {
            boolean unused = VastView.this.mo4315j();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$u */
    public class C1452u implements View.OnClickListener {
        public C1452u() {
        }

        public void onClick(View view) {
            VastRequest vastRequest = VastView.this.f4467t;
            if (vastRequest != null && vastRequest.isR1()) {
                VastView vastView = VastView.this;
                if (!vastView.f4468u.f4493l && vastView.mo4315j()) {
                    return;
                }
            }
            if (VastView.this.f4423H) {
                VastView.this.mo4296e();
            } else {
                VastView.this.handleBackPress();
            }
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$v */
    public class C1453v implements View.OnClickListener {
        public C1453v() {
        }

        public void onClick(View view) {
            VastView.this.mo4267C();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$w */
    public class C1454w implements View.OnClickListener {
        public C1454w() {
        }

        public void onClick(View view) {
            VastView.this.mo4334s();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$x */
    public class C1455x implements View.OnClickListener {
        public C1455x() {
        }

        public void onClick(View view) {
            boolean unused = VastView.this.mo4315j();
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$y */
    public final class C1456y implements MraidInterstitialListener {
        private C1456y() {
        }

        public /* synthetic */ C1456y(VastView vastView, C1442k kVar) {
            this();
        }

        public void onClose(MraidInterstitial mraidInterstitial) {
            VastView.this.mo4298f();
        }

        public void onError(MraidInterstitial mraidInterstitial, int i) {
            VastView.this.mo4300g();
        }

        public void onLoaded(MraidInterstitial mraidInterstitial) {
            VastView vastView = VastView.this;
            if (vastView.f4468u.f4491j) {
                vastView.setLoadingViewVisibility(false);
                mraidInterstitial.showInView(VastView.this, false);
            }
        }

        public void onOpenBrowser(MraidInterstitial mraidInterstitial, String str, IabClickCallback iabClickCallback) {
            iabClickCallback.clickHandled();
            VastView vastView = VastView.this;
            boolean unused = vastView.mo4282a(vastView.f4464q, str);
        }

        public void onPlayVideo(MraidInterstitial mraidInterstitial, String str) {
        }

        public void onShown(MraidInterstitial mraidInterstitial) {
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastView$z */
    public static abstract class C1457z extends Thread {

        /* renamed from: a */
        public WeakReference<Context> f4520a;

        /* renamed from: b */
        public Uri f4521b;

        /* renamed from: c */
        public String f4522c;

        /* renamed from: d */
        public Bitmap f4523d;

        /* renamed from: e */
        public boolean f4524e;

        /* renamed from: com.explorestack.iab.vast.activity.VastView$z$a */
        public class C1458a implements Runnable {
            public C1458a() {
            }

            public void run() {
                C1457z zVar = C1457z.this;
                zVar.mo4350a(zVar.f4523d);
            }
        }

        public C1457z(Context context, Uri uri, String str) {
            this.f4520a = new WeakReference<>(context);
            this.f4521b = uri;
            this.f4522c = str;
            if (str != null || (uri != null && !TextUtils.isEmpty(uri.getPath()) && new File(uri.getPath()).exists())) {
                start();
            } else {
                mo4350a((Bitmap) null);
            }
        }

        /* renamed from: a */
        public void mo4393a() {
            this.f4524e = true;
        }

        /* renamed from: a */
        public abstract void mo4350a(Bitmap bitmap);

        public void run() {
            Context context = (Context) this.f4520a.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f4521b;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f4522c;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f4523d = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e) {
                    VastLog.m6351a("MediaFrameRetriever", e.getMessage());
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e2) {
                VastLog.m6351a("MediaFrameRetriever", e2.getMessage());
            }
            if (!this.f4524e) {
                Utils.onUiThread(new C1458a());
            }
        }
    }

    public VastView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VastView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4439a = "VASTView-" + Integer.toHexString(hashCode());
        this.f4468u = new C1433c0();
        this.f4473z = 0;
        this.f4416A = 0;
        this.f4419D = false;
        this.f4420E = false;
        this.f4421F = false;
        this.f4422G = false;
        this.f4423H = false;
        this.f4424I = false;
        this.f4425J = false;
        this.f4426K = false;
        this.f4427L = true;
        this.f4428M = false;
        this.f4429N = new ArrayList();
        this.f4430O = new ArrayList();
        this.f4431P = new C1430b();
        this.f4432Q = new C1432c();
        this.f4433R = new C1435d();
        this.f4434S = new C1436e();
        this.f4435T = new LinkedList<>();
        this.f4436U = 0;
        this.f4437V = 0.0f;
        this.f4438W = new C1437f();
        C1438g gVar = new C1438g();
        this.f4440a0 = gVar;
        this.f4442b0 = new C1439h();
        this.f4444c0 = new C1440i();
        this.f4446d0 = new C1441j();
        this.f4448e0 = new C1443l();
        this.f4450f0 = new C1444m();
        this.f4452g0 = new C1445n();
        this.f4454h0 = new C1446o();
        this.f4456i0 = new C1447p();
        setBackgroundColor(-16777216);
        setOnClickListener(new C1442k());
        C1474a aVar = new C1474a(context);
        this.f4441b = aVar;
        aVar.setSurfaceTextureListener(gVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4443c = frameLayout;
        frameLayout.addView(this.f4441b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f4443c, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f4447e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f4447e, new ViewGroup.LayoutParams(-1, -1));
        C1475a aVar2 = new C1475a(getContext());
        this.f4449f = aVar2;
        aVar2.setBackgroundColor(0);
        addView(this.f4449f, new ViewGroup.LayoutParams(-1, -1));
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: l */
    public static /* synthetic */ int m6428l(VastView vastView) {
        int i = vastView.f4436U;
        vastView.f4436U = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z) {
        this.f4426K = z;
        mo4348y();
    }

    /* access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z) {
        C1398h hVar = this.f4458k;
        if (hVar != null) {
            if (z) {
                hVar.mo4112a(0);
                this.f4458k.mo4111a();
                return;
            }
            hVar.mo4112a(8);
        }
    }

    private void setMute(boolean z) {
        this.f4468u.f4487f = z;
        mo4349z();
        mo4290c(this.f4468u.f4487f ? TrackingEvent.mute : TrackingEvent.unmute);
    }

    private void setPlaceholderViewVisible(boolean z) {
        C1475a aVar = this.f4449f;
        VastRequest vastRequest = this.f4467t;
        aVar.setCloseVisibility(z, vastRequest != null ? vastRequest.getPlaceholderTimeoutSec() : 3.0f);
    }

    /* renamed from: A */
    public final void mo4265A() {
        if (isLoaded()) {
            mo4345v();
        }
    }

    /* renamed from: B */
    public final void mo4266B() {
        if (!this.f4419D || !C1459b.m6521b(getContext())) {
            mo4320n();
        } else if (this.f4420E) {
            this.f4420E = false;
            startPlayback("onWindowFocusChanged");
        } else if (!this.f4468u.f4491j) {
            mo4342t();
        } else {
            setLoadingViewVisibility(false);
        }
    }

    /* renamed from: C */
    public final void mo4267C() {
        setMute(!this.f4468u.f4487f);
    }

    /* renamed from: a */
    public final View mo4268a(Context context, CompanionTag companionTag) {
        boolean isTablet = Utils.isTablet(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Utils.dpToPx(context, companionTag.getWidth() > 0 ? (float) companionTag.getWidth() : isTablet ? 728.0f : 320.0f), Utils.dpToPx(context, companionTag.getHeight() > 0 ? (float) companionTag.getHeight() : isTablet ? 90.0f : 50.0f));
        WebView webView = new WebView(context);
        webView.setId(Utils.generateViewId());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f4452g0);
        webView.setWebViewClient(this.f4456i0);
        webView.setWebChromeClient(this.f4454h0);
        String html = companionTag.getHtml();
        if (html != null) {
            webView.loadDataWithBaseURL("", html, "text/html", "utf-8", (String) null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(Utils.generateViewId());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: a */
    public final ImageView mo4269a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    /* renamed from: a */
    public final IabElementStyle mo4270a(C1422a aVar, IabElementStyle iabElementStyle) {
        if (aVar == null) {
            return null;
        }
        if (iabElementStyle == null) {
            IabElementStyle iabElementStyle2 = new IabElementStyle();
            iabElementStyle2.setStrokeColor(aVar.getAssetsColor());
            iabElementStyle2.setFillColor(aVar.getAssetsBackgroundColor());
            return iabElementStyle2;
        }
        if (!iabElementStyle.hasStrokeColor()) {
            iabElementStyle.setStrokeColor(aVar.getAssetsColor());
        }
        if (!iabElementStyle.hasFillColor()) {
            iabElementStyle.setFillColor(aVar.getAssetsBackgroundColor());
        }
        return iabElementStyle;
    }

    /* renamed from: a */
    public final void mo4271a() {
        for (C1395g<? extends View> b : this.f4430O) {
            b.mo4116b();
        }
    }

    /* renamed from: a */
    public final void mo4272a(int i) {
        VastRequest vastRequest;
        try {
            VastRequest vastRequest2 = this.f4467t;
            if (vastRequest2 != null) {
                vastRequest2.sendError(i);
            }
        } catch (Exception e) {
            VastLog.m6351a(this.f4439a, e.getMessage());
        }
        VastViewListener vastViewListener = this.f4469v;
        if (vastViewListener != null && (vastRequest = this.f4467t) != null) {
            vastViewListener.onError(this, vastRequest, i);
        }
    }

    /* renamed from: a */
    public final void mo4273a(TrackingEvent trackingEvent) {
        VastLog.m6354d(this.f4439a, String.format("Track Banner Event: %s", new Object[]{trackingEvent}));
        CompanionTag companionTag = this.f4463p;
        if (companionTag != null) {
            mo4279a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    /* renamed from: a */
    public final void mo4274a(VastRequest vastRequest, VastAd vastAd, boolean z) {
        C1433c0 c0Var;
        float f;
        AppodealExtensionTag appodealExtension = vastAd.getAppodealExtension();
        this.f4473z = vastRequest.getPreferredVideoOrientation();
        this.f4463p = (appodealExtension == null || !appodealExtension.getCtaStyle().isVisible().booleanValue()) ? null : appodealExtension.getCompanionTag();
        if (this.f4463p == null) {
            this.f4463p = vastAd.getBanner(getContext());
        }
        mo4307i((C1422a) appodealExtension);
        boolean z2 = true;
        mo4276a((C1422a) appodealExtension, this.f4462o != null);
        mo4275a((C1422a) appodealExtension);
        mo4287b((C1422a) appodealExtension);
        mo4297e((C1422a) appodealExtension);
        mo4304h((C1422a) appodealExtension);
        mo4301g((C1422a) appodealExtension);
        mo4293d((C1422a) appodealExtension);
        mo4291c((C1422a) appodealExtension);
        setLoadingViewVisibility(false);
        VastAdMeasurer vastAdMeasurer = this.f4471x;
        if (vastAdMeasurer != null) {
            vastAdMeasurer.registerAdContainer(this);
            this.f4471x.registerAdView(this.f4441b);
        }
        VastViewListener vastViewListener = this.f4469v;
        if (vastViewListener != null) {
            vastViewListener.onOrientationRequested(this, vastRequest, this.f4468u.f4491j ? this.f4416A : this.f4473z);
        }
        if (!z) {
            this.f4468u.f4482a = vastRequest.getId();
            C1433c0 c0Var2 = this.f4468u;
            c0Var2.f4494m = this.f4427L;
            c0Var2.f4495n = this.f4428M;
            if (appodealExtension != null) {
                c0Var2.f4487f = appodealExtension.isMuted();
            }
            if (vastRequest.isForceUseNativeCloseTime() || vastAd.getSkipOffsetSec() <= 0) {
                if (vastRequest.getVideoCloseTime() >= 0.0f) {
                    c0Var = this.f4468u;
                    f = vastRequest.getVideoCloseTime();
                } else {
                    c0Var = this.f4468u;
                    f = 5.0f;
                }
                c0Var.f4483b = f;
            } else {
                this.f4468u.f4483b = (float) vastAd.getSkipOffsetSec();
            }
            VastAdMeasurer vastAdMeasurer2 = this.f4471x;
            if (vastAdMeasurer2 != null) {
                vastAdMeasurer2.onAdViewReady(this.f4441b);
            }
            VastViewListener vastViewListener2 = this.f4469v;
            if (vastViewListener2 != null) {
                vastViewListener2.onShown(this, vastRequest);
            }
        }
        if (vastRequest.getVideoType() == VideoType.Rewarded) {
            z2 = false;
        }
        setCloseControlsVisible(z2);
        startPlayback("load (restoring: " + z + ")");
    }

    /* renamed from: a */
    public final void mo4275a(C1422a aVar) {
        if (aVar == null || aVar.getCloseStyle().isVisible().booleanValue()) {
            if (this.f4451g == null) {
                C1392d dVar = new C1392d(new C1452u());
                this.f4451g = dVar;
                this.f4430O.add(dVar);
            }
            this.f4451g.mo4113a(getContext(), (ViewGroup) this.f4447e, mo4270a(aVar, aVar != null ? aVar.getCloseStyle() : null));
            return;
        }
        C1392d dVar2 = this.f4451g;
        if (dVar2 != null) {
            dVar2.mo4117c();
        }
    }

    /* renamed from: a */
    public final void mo4276a(C1422a aVar, boolean z) {
        if (!z && (aVar == null || aVar.getCtaStyle().isVisible().booleanValue())) {
            if (this.f4460m == null) {
                C1394f fVar = new C1394f(new C1451t());
                this.f4460m = fVar;
                this.f4430O.add(fVar);
            }
            this.f4460m.mo4113a(getContext(), (ViewGroup) this.f4447e, mo4270a(aVar, aVar != null ? aVar.getCtaStyle() : null));
            return;
        }
        C1394f fVar2 = this.f4460m;
        if (fVar2 != null) {
            fVar2.mo4117c();
        }
    }

    /* renamed from: a */
    public final void mo4277a(VastViewListener vastViewListener, VastRequest vastRequest) {
        if (!(vastViewListener == null || vastRequest == null)) {
            vastViewListener.onError(this, vastRequest, 3);
        }
        if (vastViewListener != null && vastRequest != null) {
            vastViewListener.onFinish(this, vastRequest, false);
        }
    }

    /* renamed from: a */
    public final void mo4278a(List<String> list) {
        if (isLoaded()) {
            if (list == null || list.size() == 0) {
                VastLog.m6354d(this.f4439a, "\turl list is null");
            } else {
                this.f4467t.fireUrls(list, (Bundle) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo4279a(Map<TrackingEvent, List<String>> map, TrackingEvent trackingEvent) {
        if (map == null || map.size() <= 0) {
            VastLog.m6354d(this.f4439a, String.format("Processing Event - fail: %s (tracking event map is null or empty)", new Object[]{trackingEvent}));
            return;
        }
        mo4278a(map.get(trackingEvent));
    }

    /* renamed from: a */
    public final void mo4280a(boolean z) {
        CompanionTag companion;
        if (isLoaded()) {
            if (!z && this.f4464q != (companion = this.f4467t.getVastAd().getCompanion(getAvailableWidth(), getAvailableHeight()))) {
                this.f4416A = (companion == null || !this.f4467t.shouldUseScreenSizeForCompanionOrientation()) ? this.f4473z : Utils.orientationBySize(companion.getWidth(), companion.getHeight());
                this.f4464q = companion;
                MraidInterstitial mraidInterstitial = this.f4466s;
                if (mraidInterstitial != null) {
                    mraidInterstitial.destroy();
                    this.f4466s = null;
                }
            }
            if (this.f4464q == null) {
                if (this.f4465r == null) {
                    this.f4465r = mo4269a(getContext());
                }
            } else if (this.f4466s == null) {
                mo4332r();
                String htmlForMraid = this.f4464q.getHtmlForMraid();
                if (htmlForMraid != null) {
                    AppodealExtensionTag appodealExtension = this.f4467t.getVastAd().getAppodealExtension();
                    PostBannerTag postBannerTag = appodealExtension != null ? appodealExtension.getPostBannerTag() : null;
                    MraidInterstitial.Builder listener = MraidInterstitial.newBuilder().setBaseUrl((String) null).setCacheControl(CacheControl.FullLoad).setCloseTime(this.f4467t.getCompanionCloseTime()).forceUseNativeCloseButton(this.f4467t.isForceUseNativeCloseTime()).setIsTag(false).setListener(new C1456y(this, (C1442k) null));
                    if (postBannerTag != null) {
                        listener.setCloseStyle(postBannerTag.getCloseStyle());
                        listener.setCountDownStyle(postBannerTag.getCountDownStyle());
                        listener.setLoadingStyle(postBannerTag.getLoadingStyle());
                        listener.setProgressStyle(postBannerTag.getProgressStyle());
                        listener.setDurationSec(postBannerTag.getDurationSec());
                        listener.setProductLink(postBannerTag.getProductLink());
                        if (postBannerTag.isForceUseNativeClose()) {
                            listener.forceUseNativeCloseButton(true);
                        }
                        listener.setR1(postBannerTag.isR1());
                        listener.setR2(postBannerTag.isR2());
                    }
                    try {
                        MraidInterstitial build = listener.build(getContext());
                        this.f4466s = build;
                        build.load(htmlForMraid);
                        return;
                    } catch (Throwable unused) {
                    }
                }
                mo4300g();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo4281a(VastRequest vastRequest, Boolean bool, boolean z) {
        String str;
        String str2;
        stopPlayback();
        if (!z) {
            this.f4468u = new C1433c0();
        }
        if (!Utils.isNetworkAvailable(getContext())) {
            this.f4467t = null;
            mo4296e();
            str = this.f4439a;
            str2 = "vastRequest.getVastAd() is null. Stop playing...";
        } else {
            if (bool != null) {
                this.f4468u.f4486e = bool.booleanValue();
            }
            this.f4467t = vastRequest;
            if (vastRequest == null) {
                mo4296e();
                str = this.f4439a;
                str2 = "VastRequest is null. Stop playing...";
            } else {
                VastAd vastAd = vastRequest.getVastAd();
                if (vastAd == null) {
                    mo4296e();
                    str = this.f4439a;
                    str2 = "VastAd is null. Stop playing...";
                } else {
                    if (vastRequest.getCacheControl() == CacheControl.PartialLoad && !isVideoFileLoaded()) {
                        vastRequest.setVastFileLoadedListener(new C1448q(z));
                        mo4299f((C1422a) vastAd.getAppodealExtension());
                        setPlaceholderViewVisible(true);
                        setLoadingViewVisibility(true);
                    } else if (vastRequest.getCacheControl() != CacheControl.Stream || isVideoFileLoaded()) {
                        mo4274a(vastRequest, vastAd, z);
                    } else {
                        vastRequest.setVastFileLoadedListener(new C1449r(z));
                        mo4299f((C1422a) vastAd.getAppodealExtension());
                        setPlaceholderViewVisible(true);
                        setLoadingViewVisibility(true);
                        vastRequest.performCache(getContext().getApplicationContext(), (VastRequestListener) null);
                    }
                    return true;
                }
            }
        }
        VastLog.m6351a(str, str2);
        return false;
    }

    /* renamed from: a */
    public final boolean mo4282a(CompanionTag companionTag, String str) {
        VastRequest vastRequest = this.f4467t;
        ArrayList arrayList = null;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        ArrayList<String> wrapperCompanionClickTrackingUrlList = vastAd != null ? vastAd.getWrapperCompanionClickTrackingUrlList() : null;
        List<String> companionClickTrackingList = companionTag != null ? companionTag.getCompanionClickTrackingList() : null;
        if (!(wrapperCompanionClickTrackingUrlList == null && companionClickTrackingList == null)) {
            arrayList = new ArrayList();
            if (companionClickTrackingList != null) {
                arrayList.addAll(companionClickTrackingList);
            }
            if (wrapperCompanionClickTrackingUrlList != null) {
                arrayList.addAll(wrapperCompanionClickTrackingUrlList);
            }
        }
        return mo4283a((List<String>) arrayList, str);
    }

    /* renamed from: a */
    public final boolean mo4283a(List<String> list, String str) {
        String str2 = this.f4439a;
        VastLog.m6354d(str2, "processClickThroughEvent: " + str);
        this.f4468u.f4493l = true;
        if (str == null) {
            return false;
        }
        mo4278a(list);
        if (!(this.f4469v == null || this.f4467t == null)) {
            mo4320n();
            setLoadingViewVisibility(true);
            this.f4469v.onClick(this, this.f4467t, this, str);
        }
        return true;
    }

    public void addView(View view) {
        super.addView(view);
        this.f4447e.bringToFront();
    }

    /* renamed from: b */
    public final void mo4285b() {
        C1457z zVar = this.f4472y;
        if (zVar != null) {
            zVar.mo4393a();
            this.f4472y = null;
        }
    }

    /* renamed from: b */
    public final void mo4286b(TrackingEvent trackingEvent) {
        VastLog.m6354d(this.f4439a, String.format("Track Companion Event: %s", new Object[]{trackingEvent}));
        CompanionTag companionTag = this.f4464q;
        if (companionTag != null) {
            mo4279a(companionTag.getTrackingEventListMap(), trackingEvent);
        }
    }

    /* renamed from: b */
    public final void mo4287b(C1422a aVar) {
        if (aVar == null || aVar.getCountDownStyle().isVisible().booleanValue()) {
            IabElementStyle iabElementStyle = null;
            if (this.f4453h == null) {
                C1393e eVar = new C1393e((View.OnClickListener) null);
                this.f4453h = eVar;
                this.f4430O.add(eVar);
            }
            if (aVar != null) {
                iabElementStyle = aVar.getCountDownStyle();
            }
            this.f4453h.mo4113a(getContext(), (ViewGroup) this.f4447e, mo4270a(aVar, iabElementStyle));
            return;
        }
        C1393e eVar2 = this.f4453h;
        if (eVar2 != null) {
            eVar2.mo4117c();
        }
    }

    /* renamed from: b */
    public final void mo4288b(boolean z) {
        VastViewListener vastViewListener;
        if (isLoaded() && !this.f4423H) {
            this.f4423H = true;
            this.f4468u.f4491j = true;
            int i = getResources().getConfiguration().orientation;
            int i2 = this.f4416A;
            if (!(i == i2 || (vastViewListener = this.f4469v) == null)) {
                vastViewListener.onOrientationRequested(this, this.f4467t, i2);
            }
            C1400j jVar = this.f4459l;
            if (jVar != null) {
                jVar.mo4117c();
            }
            C1399i iVar = this.f4457j;
            if (iVar != null) {
                iVar.mo4117c();
            }
            C1401k kVar = this.f4455i;
            if (kVar != null) {
                kVar.mo4117c();
            }
            mo4271a();
            if (this.f4468u.f4495n) {
                if (this.f4465r == null) {
                    this.f4465r = mo4269a(getContext());
                }
                this.f4465r.setImageBitmap(this.f4441b.getBitmap());
                addView(this.f4465r, new FrameLayout.LayoutParams(-1, -1));
                this.f4447e.bringToFront();
                return;
            }
            mo4280a(z);
            if (this.f4464q == null) {
                setCloseControlsVisible(true);
                if (this.f4465r != null) {
                    this.f4472y = new C1424a(getContext(), this.f4467t.getFileUri(), this.f4467t.getVastAd().getPickedMediaFileTag().getText(), new WeakReference(this.f4465r));
                }
                addView(this.f4465r, new FrameLayout.LayoutParams(-1, -1));
            } else {
                setCloseControlsVisible(false);
                this.f4443c.setVisibility(8);
                mo4331q();
                C1394f fVar = this.f4460m;
                if (fVar != null) {
                    fVar.mo4112a(8);
                }
                MraidInterstitial mraidInterstitial = this.f4466s;
                if (mraidInterstitial == null) {
                    setLoadingViewVisibility(false);
                    mo4300g();
                } else if (mraidInterstitial.isReady()) {
                    setLoadingViewVisibility(false);
                    this.f4466s.showInView(this, false);
                } else {
                    setLoadingViewVisibility(true);
                }
            }
            stopPlayback();
            this.f4447e.bringToFront();
            mo4286b(TrackingEvent.creativeView);
        }
    }

    /* renamed from: c */
    public final void mo4289c() {
        removeCallbacks(this.f4432Q);
    }

    /* renamed from: c */
    public final void mo4290c(TrackingEvent trackingEvent) {
        VastLog.m6354d(this.f4439a, String.format("Track Event: %s", new Object[]{trackingEvent}));
        VastRequest vastRequest = this.f4467t;
        VastAd vastAd = vastRequest != null ? vastRequest.getVastAd() : null;
        if (vastAd != null) {
            mo4279a(vastAd.getTrackingEventListMap(), trackingEvent);
        }
    }

    /* renamed from: c */
    public final void mo4291c(C1422a aVar) {
        if (aVar != null && aVar.isVideoClickable()) {
            this.f4430O.clear();
        }
    }

    public void clickHandleCanceled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else {
            mo4342t();
        }
    }

    public void clickHandleError() {
        if (isPlaybackStarted()) {
            mo4342t();
        } else if (!isCompanionShown()) {
            mo4343u();
        } else {
            mo4298f();
        }
    }

    public void clickHandled() {
        if (isCompanionShown()) {
            setLoadingViewVisibility(false);
        } else if (!this.f4419D) {
            mo4320n();
        } else {
            mo4342t();
        }
    }

    /* renamed from: d */
    public final void mo4292d() {
        int i;
        int i2 = this.f4417B;
        if (i2 == 0 || (i = this.f4418C) == 0) {
            VastLog.m6354d(this.f4439a, "configureVideoSurface - skip: videoWidth or videoHeight is 0");
        } else {
            this.f4441b.mo4562a(i2, i);
        }
    }

    /* renamed from: d */
    public final void mo4293d(C1422a aVar) {
        if (aVar == null || aVar.getLoadingStyle().isVisible().booleanValue()) {
            IabElementStyle iabElementStyle = null;
            if (this.f4458k == null) {
                this.f4458k = new C1398h((View.OnClickListener) null);
            }
            if (aVar != null) {
                iabElementStyle = aVar.getLoadingStyle();
            }
            this.f4458k.mo4113a(getContext(), (ViewGroup) this, mo4270a(aVar, iabElementStyle));
            return;
        }
        C1398h hVar = this.f4458k;
        if (hVar != null) {
            hVar.mo4117c();
        }
    }

    public void destroy() {
        MraidInterstitial mraidInterstitial = this.f4466s;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.f4466s = null;
            this.f4464q = null;
        }
    }

    public boolean display(VastRequest vastRequest, Boolean bool) {
        return mo4281a(vastRequest, bool, false);
    }

    /* renamed from: e */
    public final void mo4296e() {
        VastRequest vastRequest;
        VastLog.m6351a(this.f4439a, "handleClose");
        mo4290c(TrackingEvent.close);
        VastViewListener vastViewListener = this.f4469v;
        if (vastViewListener != null && (vastRequest = this.f4467t) != null) {
            vastViewListener.onFinish(this, vastRequest, isFinished());
        }
    }

    /* renamed from: e */
    public final void mo4297e(C1422a aVar) {
        if (aVar == null || aVar.getMuteStyle().isVisible().booleanValue()) {
            if (this.f4457j == null) {
                C1399i iVar = new C1399i(new C1453v());
                this.f4457j = iVar;
                this.f4430O.add(iVar);
            }
            this.f4457j.mo4113a(getContext(), (ViewGroup) this.f4447e, mo4270a(aVar, aVar != null ? aVar.getMuteStyle() : null));
            return;
        }
        C1399i iVar2 = this.f4457j;
        if (iVar2 != null) {
            iVar2.mo4117c();
        }
    }

    /* renamed from: f */
    public final void mo4298f() {
        VastRequest vastRequest;
        VastLog.m6351a(this.f4439a, "handleCompanionClose");
        mo4286b(TrackingEvent.close);
        VastViewListener vastViewListener = this.f4469v;
        if (vastViewListener != null && (vastRequest = this.f4467t) != null) {
            vastViewListener.onFinish(this, vastRequest, isFinished());
        }
    }

    /* renamed from: f */
    public final void mo4299f(C1422a aVar) {
        IabElementStyle iabElementStyle = null;
        this.f4449f.setCountDownStyle(mo4270a(aVar, aVar != null ? aVar.getCountDownStyle() : null));
        if (isFullscreen()) {
            if (aVar != null) {
                iabElementStyle = aVar.getCloseStyle();
            }
            this.f4449f.setCloseStyle(mo4270a(aVar, iabElementStyle));
            this.f4449f.setCloseClickListener(new C1450s());
        }
        mo4293d(aVar);
    }

    /* renamed from: g */
    public final void mo4300g() {
        VastRequest vastRequest;
        VastLog.m6351a(this.f4439a, "handleCompanionShowError");
        mo4272a(600);
        if (this.f4464q != null) {
            mo4318m();
            mo4288b(true);
            return;
        }
        VastViewListener vastViewListener = this.f4469v;
        if (vastViewListener != null && (vastRequest = this.f4467t) != null) {
            vastViewListener.onFinish(this, vastRequest, isFinished());
        }
    }

    /* renamed from: g */
    public final void mo4301g(C1422a aVar) {
        if (aVar == null || aVar.getProgressStyle().isVisible().booleanValue()) {
            IabElementStyle iabElementStyle = null;
            if (this.f4459l == null) {
                C1400j jVar = new C1400j((View.OnClickListener) null);
                this.f4459l = jVar;
                this.f4430O.add(jVar);
            }
            if (aVar != null) {
                iabElementStyle = aVar.getProgressStyle();
            }
            this.f4459l.mo4113a(getContext(), (ViewGroup) this.f4447e, mo4270a(aVar, iabElementStyle));
            this.f4459l.mo4129a(0.0f, 0, 0);
            return;
        }
        C1400j jVar2 = this.f4459l;
        if (jVar2 != null) {
            jVar2.mo4117c();
        }
    }

    public VastViewListener getListener() {
        return this.f4469v;
    }

    /* renamed from: h */
    public final void mo4303h() {
        VastLog.m6354d(this.f4439a, "handleComplete");
        C1433c0 c0Var = this.f4468u;
        c0Var.f4490i = true;
        if (!this.f4425J && !c0Var.f4489h) {
            c0Var.f4489h = true;
            VastViewListener vastViewListener = this.f4469v;
            if (vastViewListener != null) {
                vastViewListener.onComplete(this, this.f4467t);
            }
            VastPlaybackListener vastPlaybackListener = this.f4470w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoCompleted();
            }
            VastRequest vastRequest = this.f4467t;
            if (vastRequest != null && vastRequest.isR2() && !this.f4468u.f4493l) {
                mo4315j();
            }
            mo4290c(TrackingEvent.complete);
        }
        if (this.f4468u.f4489h) {
            mo4317l();
        }
    }

    /* renamed from: h */
    public final void mo4304h(C1422a aVar) {
        if (aVar == null || !aVar.getRepeatStyle().isVisible().booleanValue()) {
            C1401k kVar = this.f4455i;
            if (kVar != null) {
                kVar.mo4117c();
                return;
            }
            return;
        }
        if (this.f4455i == null) {
            C1401k kVar2 = new C1401k(new C1454w());
            this.f4455i = kVar2;
            this.f4430O.add(kVar2);
        }
        this.f4455i.mo4113a(getContext(), (ViewGroup) this.f4447e, mo4270a(aVar, aVar.getRepeatStyle()));
    }

    public void handleBackPress() {
        if (this.f4449f.isVisible() && this.f4449f.canBeClosed()) {
            mo4277a(this.f4469v, this.f4467t);
        } else if (isSkipEnabled()) {
            if (!isCompanionShown()) {
                mo4321o();
                return;
            }
            VastRequest vastRequest = this.f4467t;
            if (vastRequest != null && vastRequest.getVideoType() == VideoType.NonRewarded) {
                if (this.f4464q == null) {
                    mo4296e();
                    return;
                }
                MraidInterstitial mraidInterstitial = this.f4466s;
                if (mraidInterstitial != null) {
                    mraidInterstitial.dispatchClose();
                } else {
                    mo4298f();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo4306i() {
        VastLog.m6354d(this.f4439a, "handleImpressions");
        VastRequest vastRequest = this.f4467t;
        if (vastRequest != null) {
            this.f4468u.f4492k = true;
            mo4278a(vastRequest.getVastAd().getImpressionUrlList());
        }
    }

    /* renamed from: i */
    public final void mo4307i(C1422a aVar) {
        IabElementStyle iabElementStyle;
        IabElementStyle iabElementStyle2 = Assets.defVideoStyle;
        if (aVar != null) {
            iabElementStyle2 = iabElementStyle2.copyWith(aVar.getVideoStyle());
        }
        if (aVar == null || !aVar.isVideoClickable()) {
            this.f4443c.setOnClickListener((View.OnClickListener) null);
            this.f4443c.setClickable(false);
        } else {
            this.f4443c.setOnClickListener(new C1455x());
        }
        this.f4443c.setBackgroundColor(iabElementStyle2.getFillColor().intValue());
        mo4331q();
        if (this.f4463p == null || this.f4468u.f4491j) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f4443c.setLayoutParams(layoutParams);
            return;
        }
        this.f4462o = mo4268a(getContext(), this.f4463p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f4462o.getLayoutParams());
        if ("inline".equals(iabElementStyle2.getStyle())) {
            iabElementStyle = Assets.defInlineBannerStyle;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (iabElementStyle2.getHorizontalPosition().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.f4462o.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.f4462o.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (iabElementStyle2.getVerticalPosition().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.f4462o.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.f4462o.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            IabElementStyle iabElementStyle3 = Assets.defBannerStyle;
            layoutParams2.addRule(13);
            iabElementStyle = iabElementStyle3;
        }
        if (aVar != null) {
            iabElementStyle = iabElementStyle.copyWith(aVar.getCtaStyle());
        }
        iabElementStyle.applyPadding(getContext(), this.f4462o);
        iabElementStyle.applyMargin(getContext(), layoutParams3);
        iabElementStyle.applyRelativeAlignment(layoutParams3);
        this.f4462o.setBackgroundColor(iabElementStyle.getFillColor().intValue());
        iabElementStyle2.applyPadding(getContext(), this.f4443c);
        iabElementStyle2.applyMargin(getContext(), layoutParams2);
        this.f4443c.setLayoutParams(layoutParams2);
        addView(this.f4462o, layoutParams3);
        mo4273a(TrackingEvent.creativeView);
    }

    public boolean isCompanionShown() {
        return this.f4468u.f4491j;
    }

    public boolean isFinished() {
        VastRequest vastRequest = this.f4467t;
        return vastRequest != null && ((vastRequest.getCompanionCloseTime() == 0.0f && this.f4468u.f4489h) || (this.f4467t.getCompanionCloseTime() > 0.0f && this.f4468u.f4491j));
    }

    public boolean isFullscreen() {
        return this.f4468u.f4486e;
    }

    public boolean isLoaded() {
        VastRequest vastRequest = this.f4467t;
        return (vastRequest == null || vastRequest.getVastAd() == null) ? false : true;
    }

    public boolean isPlaybackStarted() {
        return this.f4461n != null && this.f4424I;
    }

    public boolean isSkipEnabled() {
        C1433c0 c0Var = this.f4468u;
        return c0Var.f4490i || c0Var.f4483b == 0.0f;
    }

    public boolean isVideoFileLoaded() {
        VastRequest vastRequest = this.f4467t;
        return vastRequest != null && vastRequest.checkFile();
    }

    /* renamed from: j */
    public final boolean mo4315j() {
        VastLog.m6351a(this.f4439a, "handleInfoClicked");
        VastRequest vastRequest = this.f4467t;
        if (vastRequest != null) {
            return mo4283a(vastRequest.getVastAd().getClickTrackingUrlList(), this.f4467t.getVastAd().getClickThroughUrl());
        }
        return false;
    }

    /* renamed from: k */
    public final void mo4316k() {
        VastLog.m6351a(this.f4439a, "handlePlaybackError");
        this.f4425J = true;
        mo4272a((int) TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
        mo4317l();
    }

    /* renamed from: l */
    public final void mo4317l() {
        VastLog.m6354d(this.f4439a, "finishVideoPlaying");
        stopPlayback();
        VastRequest vastRequest = this.f4467t;
        if (vastRequest == null || vastRequest.isAutoClose() || (this.f4467t.getVastAd().getAppodealExtension() != null && !this.f4467t.getVastAd().getAppodealExtension().getPostBannerTag().isVisible())) {
            mo4296e();
            return;
        }
        if (isSkipEnabled()) {
            mo4290c(TrackingEvent.close);
        }
        setLoadingViewVisibility(false);
        mo4331q();
        mo4343u();
    }

    /* renamed from: m */
    public final void mo4318m() {
        if (this.f4465r != null) {
            mo4332r();
        } else {
            MraidInterstitial mraidInterstitial = this.f4466s;
            if (mraidInterstitial != null) {
                mraidInterstitial.destroy();
                this.f4466s = null;
                this.f4464q = null;
            }
        }
        this.f4423H = false;
    }

    public void mute() {
        setMute(true);
    }

    /* renamed from: n */
    public final void mo4320n() {
        if (isPlaybackStarted() && !this.f4468u.f4488g) {
            VastLog.m6354d(this.f4439a, "pausePlayback");
            C1433c0 c0Var = this.f4468u;
            c0Var.f4488g = true;
            c0Var.f4485d = this.f4461n.getCurrentPosition();
            this.f4461n.pause();
            mo4289c();
            mo4271a();
            mo4290c(TrackingEvent.pause);
            VastPlaybackListener vastPlaybackListener = this.f4470w;
            if (vastPlaybackListener != null) {
                vastPlaybackListener.onVideoPaused();
            }
        }
    }

    /* renamed from: o */
    public final void mo4321o() {
        VastLog.m6351a(this.f4439a, "performVideoCloseClick");
        stopPlayback();
        if (!this.f4425J) {
            if (!this.f4468u.f4489h) {
                mo4290c(TrackingEvent.skip);
                VastPlaybackListener vastPlaybackListener = this.f4470w;
                if (vastPlaybackListener != null) {
                    vastPlaybackListener.onVideoSkipped();
                }
            }
            VastRequest vastRequest = this.f4467t;
            if (vastRequest != null && vastRequest.getMaxDurationMillis() > 0 && this.f4467t.getVideoType() == VideoType.Rewarded) {
                VastViewListener vastViewListener = this.f4469v;
                if (vastViewListener != null) {
                    vastViewListener.onComplete(this, this.f4467t);
                }
                VastPlaybackListener vastPlaybackListener2 = this.f4470w;
                if (vastPlaybackListener2 != null) {
                    vastPlaybackListener2.onVideoCompleted();
                }
            }
            mo4317l();
            return;
        }
        mo4296e();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4419D) {
            startPlayback("onAttachedToWindow");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isLoaded()) {
            mo4307i((C1422a) this.f4467t.getVastAd().getAppodealExtension());
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopPlayback();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1428a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1428a0 a0Var = (C1428a0) parcelable;
        super.onRestoreInstanceState(a0Var.getSuperState());
        C1433c0 c0Var = a0Var.f4479a;
        if (c0Var != null) {
            this.f4468u = c0Var;
        }
        VastRequest a = C1462c.m6523a(this.f4468u.f4482a);
        if (a != null) {
            mo4281a(a, (Boolean) null, true);
        }
    }

    public Parcelable onSaveInstanceState() {
        if (isPlaybackStarted()) {
            this.f4468u.f4485d = this.f4461n.getCurrentPosition();
        }
        C1428a0 a0Var = new C1428a0(super.onSaveInstanceState());
        a0Var.f4479a = this.f4468u;
        return a0Var;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        removeCallbacks(this.f4431P);
        post(this.f4431P);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        String str = this.f4439a;
        VastLog.m6354d(str, "onWindowFocusChanged: " + z);
        this.f4419D = z;
        mo4266B();
    }

    /* renamed from: p */
    public final void mo4329p() {
        try {
            if (isLoaded() && !this.f4468u.f4491j) {
                if (this.f4461n == null) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    this.f4461n = mediaPlayer;
                    mediaPlayer.setLooping(false);
                    this.f4461n.setAudioStreamType(3);
                    this.f4461n.setOnCompletionListener(this.f4442b0);
                    this.f4461n.setOnErrorListener(this.f4444c0);
                    this.f4461n.setOnPreparedListener(this.f4446d0);
                    this.f4461n.setOnVideoSizeChangedListener(this.f4448e0);
                }
                this.f4461n.setSurface(this.f4445d);
                Uri fileUri = isVideoFileLoaded() ? this.f4467t.getFileUri() : null;
                if (fileUri == null) {
                    setLoadingViewVisibility(true);
                    this.f4461n.setDataSource(this.f4467t.getVastAd().getPickedMediaFileTag().getText());
                } else {
                    setLoadingViewVisibility(false);
                    this.f4461n.setDataSource(getContext(), fileUri);
                }
                this.f4461n.prepareAsync();
            }
        } catch (Exception e) {
            VastLog.m6352a(this.f4439a, e.getMessage(), e);
            mo4316k();
        }
    }

    public void pause() {
        setCanAutoResume(false);
        mo4320n();
    }

    /* renamed from: q */
    public final void mo4331q() {
        View view = this.f4462o;
        if (view != null) {
            Utils.removeFromParent(view);
            this.f4462o = null;
        }
    }

    /* renamed from: r */
    public final void mo4332r() {
        if (this.f4465r != null) {
            mo4285b();
            removeView(this.f4465r);
            this.f4465r = null;
        }
    }

    public void resume() {
        setCanAutoResume(true);
        mo4342t();
    }

    /* renamed from: s */
    public final void mo4334s() {
        if (isLoaded()) {
            C1433c0 c0Var = this.f4468u;
            c0Var.f4491j = false;
            c0Var.f4485d = 0;
            mo4318m();
            mo4307i((C1422a) this.f4467t.getVastAd().getAppodealExtension());
            startPlayback("restartPlayback");
        }
    }

    public void setAdMeasurer(VastAdMeasurer vastAdMeasurer) {
        this.f4471x = vastAdMeasurer;
    }

    public void setCanAutoResume(boolean z) {
        this.f4427L = z;
        this.f4468u.f4494m = z;
    }

    public void setCanIgnorePostBanner(boolean z) {
        this.f4428M = z;
        this.f4468u.f4495n = z;
    }

    public void setListener(VastViewListener vastViewListener) {
        this.f4469v = vastViewListener;
    }

    public void setPlaybackListener(VastPlaybackListener vastPlaybackListener) {
        this.f4470w = vastPlaybackListener;
    }

    public void startPlayback(String str) {
        String str2 = this.f4439a;
        VastLog.m6354d(str2, "startPlayback: " + str);
        if (isLoaded()) {
            setPlaceholderViewVisible(false);
            if (this.f4468u.f4491j) {
                mo4343u();
            } else if (this.f4419D) {
                if (this.f4421F) {
                    stopPlayback();
                    mo4318m();
                    mo4292d();
                    mo4329p();
                    C1459b.m6518a(this, this.f4450f0);
                } else {
                    this.f4422G = true;
                }
                if (this.f4443c.getVisibility() != 0) {
                    this.f4443c.setVisibility(0);
                }
            } else {
                this.f4420E = true;
            }
        }
    }

    public void stopPlayback() {
        this.f4468u.f4488g = false;
        if (this.f4461n != null) {
            VastLog.m6354d(this.f4439a, "stopPlayback");
            if (this.f4461n.isPlaying()) {
                this.f4461n.stop();
            }
            this.f4461n.release();
            this.f4461n = null;
            this.f4424I = false;
            this.f4425J = false;
            mo4289c();
            C1459b.m6517a((View) this);
        }
    }

    /* renamed from: t */
    public final void mo4342t() {
        C1433c0 c0Var = this.f4468u;
        if (!c0Var.f4494m) {
            if (isPlaybackStarted()) {
                this.f4461n.start();
                this.f4461n.pause();
                setLoadingViewVisibility(false);
            } else if (!this.f4468u.f4491j) {
                startPlayback("resumePlayback (canAutoResume: false)");
            }
        } else if (c0Var.f4488g && this.f4419D) {
            VastLog.m6354d(this.f4439a, "resumePlayback");
            this.f4468u.f4488g = false;
            if (isPlaybackStarted()) {
                this.f4461n.start();
                mo4265A();
                mo4346w();
                setLoadingViewVisibility(false);
                mo4290c(TrackingEvent.resume);
                VastPlaybackListener vastPlaybackListener = this.f4470w;
                if (vastPlaybackListener != null) {
                    vastPlaybackListener.onVideoResumed();
                }
            } else if (!this.f4468u.f4491j) {
                startPlayback("resumePlayback");
            }
        }
    }

    /* renamed from: u */
    public final void mo4343u() {
        mo4288b(false);
    }

    public void unmute() {
        setMute(false);
    }

    /* renamed from: v */
    public final void mo4345v() {
        for (C1395g<? extends View> g : this.f4430O) {
            g.mo4121g();
        }
    }

    /* renamed from: w */
    public final void mo4346w() {
        mo4347x();
        mo4289c();
        this.f4432Q.run();
    }

    /* renamed from: x */
    public final void mo4347x() {
        this.f4435T.clear();
        this.f4436U = 0;
        this.f4437V = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4348y() {
        /*
            r5 = this;
            boolean r0 = r5.f4426K
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0009
            r0 = 0
        L_0x0007:
            r1 = 0
            goto L_0x0017
        L_0x0009:
            boolean r0 = r5.isSkipEnabled()
            if (r0 != 0) goto L_0x0016
            boolean r0 = r5.f4423H
            if (r0 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0007
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.explorestack.iab.utils.d r3 = r5.f4451g
            r4 = 8
            if (r3 == 0) goto L_0x0026
            if (r1 == 0) goto L_0x0021
            r1 = 0
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            r3.mo4112a((int) r1)
        L_0x0026:
            com.explorestack.iab.utils.e r1 = r5.f4453h
            if (r1 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r2 = 8
        L_0x002f:
            r1.mo4112a((int) r2)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.activity.VastView.mo4348y():void");
    }

    /* renamed from: z */
    public final void mo4349z() {
        C1399i iVar;
        float f;
        VastPlaybackListener vastPlaybackListener;
        if (isPlaybackStarted() && (iVar = this.f4457j) != null) {
            iVar.mo4127a(this.f4468u.f4487f);
            if (this.f4468u.f4487f) {
                f = 0.0f;
                this.f4461n.setVolume(0.0f, 0.0f);
                vastPlaybackListener = this.f4470w;
                if (vastPlaybackListener == null) {
                    return;
                }
            } else {
                f = 1.0f;
                this.f4461n.setVolume(1.0f, 1.0f);
                vastPlaybackListener = this.f4470w;
                if (vastPlaybackListener == null) {
                    return;
                }
            }
            vastPlaybackListener.onVideoVolumeChanged(f);
        }
    }
}
