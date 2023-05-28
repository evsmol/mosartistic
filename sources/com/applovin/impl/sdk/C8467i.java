package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.i */
public class C8467i extends C8548p {

    /* renamed from: c */
    private final long f21266c;

    /* renamed from: d */
    private final long f21267d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f21268e;

    /* renamed from: f */
    private WeakReference<View> f21269f = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f21270g = 0;

    /* renamed from: h */
    private Handler f21271h;

    /* renamed from: i */
    private final HandlerThread f21272i = new HandlerThread("BlackViewDetector");

    /* renamed from: j */
    private final Runnable f21273j = new Runnable() {
        public void run() {
            C8467i.this.m25524b();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8472a f21274k;

    /* renamed from: com.applovin.impl.sdk.i$a */
    public interface C8472a {
        /* renamed from: a */
        void mo55573a(View view);
    }

    /* renamed from: com.applovin.impl.sdk.i$b */
    private interface C8473b {
        /* renamed from: a */
        void mo57282a(Bitmap bitmap);

        /* renamed from: a */
        void mo57283a(boolean z);
    }

    public C8467i(C8490n nVar) {
        super("black_view", nVar);
        this.f21266c = ((Long) nVar.mo57342a(C8380b.f20970fk)).longValue();
        this.f21267d = ((Long) nVar.mo57342a(C8380b.f20969fj)).longValue();
        this.f21268e = ((Integer) nVar.mo57342a(C8380b.f20971fl)).intValue();
    }

    /* renamed from: a */
    private void m25518a(View view, final C8473b bVar) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        final Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            Activity b = this.f21586a.mo57368ai().mo56833b();
            if (b == null) {
                C8626v vVar = this.f21587b;
                if (C8626v.m26252a()) {
                    this.f21587b.mo57822e("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                bVar.mo57283a(false);
                return;
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            try {
                PixelCopy.request(b.getWindow(), new Rect(iArr[0], iArr[1], iArr[0] + measuredWidth, iArr[1] + measuredHeight), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                    public void onPixelCopyFinished(int i) {
                        if (i == 0) {
                            bVar.mo57282a(createBitmap);
                            return;
                        }
                        C8626v vVar = C8467i.this.f21587b;
                        if (C8626v.m26252a()) {
                            C8626v vVar2 = C8467i.this.f21587b;
                            vVar2.mo57822e("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
                        }
                        bVar.mo57283a(true);
                    }
                }, new Handler());
            } catch (Throwable th) {
                C8626v vVar2 = this.f21587b;
                if (C8626v.m26252a()) {
                    C8626v vVar3 = this.f21587b;
                    vVar3.mo57822e("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
            }
        } else {
            C8626v vVar4 = this.f21587b;
            if (C8626v.m26252a()) {
                this.f21587b.mo57821d("BlackViewDetector", "Unable to capture screenshots on views below API 26");
            }
            bVar.mo57283a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25520a(int i) {
        return Color.red(i) == 0 && Color.blue(i) == 0 && Color.green(i) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25524b() {
        View view = (View) this.f21269f.get();
        if (view == null) {
            C8626v vVar = this.f21587b;
            if (C8626v.m26252a()) {
                this.f21587b.mo57821d("BlackViewDetector", "Monitored view no longer exists.");
            }
            mo57279a();
            return;
        }
        C8626v vVar2 = this.f21587b;
        if (C8626v.m26252a()) {
            C8626v vVar3 = this.f21587b;
            vVar3.mo57818b("BlackViewDetector", "Checking for black view: " + view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            C8626v vVar4 = this.f21587b;
            if (C8626v.m26252a()) {
                C8626v vVar5 = this.f21587b;
                vVar5.mo57821d("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
            }
            this.f21270g = 0;
            m25525c();
            return;
        }
        m25518a(view, (C8473b) new C8473b() {
            /* renamed from: a */
            public void mo57282a(Bitmap bitmap) {
                int b = measuredWidth / C8467i.this.f21268e;
                int b2 = measuredHeight / C8467i.this.f21268e;
                int i = b / 2;
                int i2 = b2 / 2;
                loop0:
                while (true) {
                    if (i2 >= measuredHeight) {
                        C8467i.m25527d(C8467i.this);
                        break;
                    }
                    for (int i3 = i; i3 < measuredWidth; i3 += b) {
                        if (!C8467i.this.m25520a(bitmap.getPixel(i3, i2))) {
                            int unused = C8467i.this.f21270g = 0;
                            break loop0;
                        }
                    }
                    i2 += b2;
                }
                bitmap.recycle();
                C8467i.this.m25525c();
            }

            /* renamed from: a */
            public void mo57283a(boolean z) {
                if (z) {
                    C8467i.this.mo57279a();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r6.f21270g == 1) goto L_0x000d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25525c() {
        /*
            r6 = this;
            long r0 = r6.f21266c
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002d
            int r3 = r6.f21270g
            if (r3 <= r2) goto L_0x0011
        L_0x000d:
            r6.m25528d()
            goto L_0x0032
        L_0x0011:
            android.os.Handler r2 = r6.f21271h
            if (r2 == 0) goto L_0x001b
            java.lang.Runnable r3 = r6.f21273j
            r2.postDelayed(r3, r0)
            goto L_0x0035
        L_0x001b:
            com.applovin.impl.sdk.v r0 = r6.f21587b
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0032
            com.applovin.impl.sdk.v r0 = r6.f21587b
            java.lang.String r1 = "BlackViewDetector"
            java.lang.String r2 = "Monitoring handler was unexpectedly null"
            r0.mo57821d(r1, r2)
            goto L_0x0032
        L_0x002d:
            int r0 = r6.f21270g
            if (r0 != r2) goto L_0x0032
            goto L_0x000d
        L_0x0032:
            r6.mo57279a()
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C8467i.m25525c():void");
    }

    /* renamed from: d */
    static /* synthetic */ int m25527d(C8467i iVar) {
        int i = iVar.f21270g;
        iVar.f21270g = i + 1;
        return i;
    }

    /* renamed from: d */
    private void m25528d() {
        final View view = (View) this.f21269f.get();
        C8626v vVar = this.f21587b;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f21587b;
            vVar2.mo57821d("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C8467i.this.f21274k != null) {
                    C8467i.this.f21274k.mo55573a(view);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo57279a() {
        if (this.f21269f.get() != null) {
            C8626v vVar = this.f21587b;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.f21587b;
                vVar2.mo57818b("BlackViewDetector", "Stopped monitoring view: " + this.f21269f.get());
            }
            Handler handler = this.f21271h;
            if (handler != null) {
                handler.removeCallbacks(this.f21273j);
                this.f21271h = null;
                this.f21272i.quit();
            }
            this.f21269f.clear();
            this.f21274k = null;
        }
    }

    /* renamed from: a */
    public void mo57280a(View view, C8472a aVar) {
        if (((Boolean) this.f21586a.mo57342a(C8380b.f20968fi)).booleanValue()) {
            View view2 = (View) this.f21269f.get();
            if (view2 != null) {
                C8626v vVar = this.f21587b;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.f21587b;
                    vVar2.mo57821d("BlackViewDetector", "Monitoring is already in progress for a view:" + view2);
                    return;
                }
                return;
            }
            this.f21274k = aVar;
            this.f21269f = new WeakReference<>(view);
            this.f21270g = 0;
            C8626v vVar3 = this.f21587b;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.f21587b;
                vVar4.mo57818b("BlackViewDetector", "Started monitoring view: " + view);
            }
            this.f21272i.start();
            Handler handler = new Handler(this.f21272i.getLooper());
            this.f21271h = handler;
            handler.postDelayed(this.f21273j, this.f21267d);
        }
    }
}
