package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.sdk.controller.C4845x;
import com.ironsource.sdk.p137a.C4743a;
import com.ironsource.sdk.p137a.C4747d;
import com.ironsource.sdk.p137a.C4749f;
import com.ironsource.sdk.p139c.C4766d;
import com.ironsource.sdk.p140d.C4908b;
import com.ironsource.sdk.p144g.C4933b;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.p146i.C4951a;
import com.ironsource.sdk.p147j.C4963g;
import com.ironsource.sdk.utils.C4987d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

public class ControllerActivity extends Activity implements C4844w, C4963g {

    /* renamed from: a */
    private static final String f12119a = ControllerActivity.class.getSimpleName();

    /* renamed from: b */
    private static String f12120b = "removeWebViewContainerView | mContainer is null";

    /* renamed from: c */
    private static String f12121c = "removeWebViewContainerView | view is null";
    public int currentRequestedRotation = -1;

    /* renamed from: d */
    private String f12122d;

    /* renamed from: e */
    private C4845x f12123e;

    /* renamed from: f */
    private RelativeLayout f12124f;

    /* renamed from: g */
    private FrameLayout f12125g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f12126h = false;

    /* renamed from: i */
    private String f12127i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f12128j = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f12129k = new Runnable() {
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f12126h));
        }
    };

    /* renamed from: l */
    private RelativeLayout.LayoutParams f12130l = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: m */
    private C4933b f12131m;

    /* renamed from: n */
    private boolean f12132n;

    /* renamed from: o */
    private boolean f12133o;

    /* renamed from: a */
    private void m13987a() {
        Logger.m14507i(f12119a, "clearWebviewController");
        C4845x xVar = this.f12123e;
        if (xVar == null) {
            Logger.m14507i(f12119a, "clearWebviewController, null");
            return;
        }
        xVar.f12390j = C4845x.C4901g.Gone;
        this.f12123e.f12392l = null;
        this.f12123e.f12402v = null;
        this.f12123e.mo34437a(this.f12127i, "onDestroy");
    }

    /* renamed from: a */
    private void m13988a(String str) {
        if (str == null) {
            return;
        }
        if ("landscape".equalsIgnoreCase(str)) {
            m13991b();
        } else if ("portrait".equalsIgnoreCase(str)) {
            m13993c();
        } else if ("device".equalsIgnoreCase(str)) {
            if (C4407h.m12578q(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    /* renamed from: b */
    private void m13991b() {
        int k = C4407h.m12566k(this);
        Logger.m14507i(f12119a, "setInitiateLandscapeOrientation");
        if (k == 0) {
            Logger.m14507i(f12119a, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (k == 2) {
            Logger.m14507i(f12119a, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (k == 3) {
            Logger.m14507i(f12119a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (k == 1) {
            Logger.m14507i(f12119a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            Logger.m14507i(f12119a, "No Rotation");
        }
    }

    /* renamed from: c */
    private void m13993c() {
        int k = C4407h.m12566k(this);
        Logger.m14507i(f12119a, "setInitiatePortraitOrientation");
        if (k == 0) {
            Logger.m14507i(f12119a, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (k == 2) {
            Logger.m14507i(f12119a, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (k == 1) {
            Logger.m14507i(f12119a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (k == 3) {
            Logger.m14507i(f12119a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            Logger.m14507i(f12119a, "No Rotation");
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.m14507i(f12119a, "onBackPressed");
        new C4951a();
        if (!C4951a.m14424a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.m14507i(f12119a, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            C4845x xVar = (C4845x) C4908b.m14292a((Context) this).f12532a.f12194a;
            this.f12123e = xVar;
            xVar.f12389i.setId(1);
            this.f12123e.f12402v = this;
            this.f12123e.f12392l = this;
            Intent intent = getIntent();
            this.f12127i = intent.getStringExtra("productType");
            this.f12126h = intent.getBooleanExtra("immersive", false);
            this.f12122d = intent.getStringExtra("adViewId");
            this.f12132n = false;
            this.f12133o = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f12126h) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & 4098) == 0) {
                            ControllerActivity.this.f12128j.removeCallbacks(ControllerActivity.this.f12129k);
                            ControllerActivity.this.f12128j.postDelayed(ControllerActivity.this.f12129k, 500);
                        }
                    }
                });
                runOnUiThread(this.f12129k);
            }
            if (!TextUtils.isEmpty(this.f12127i) && C4936d.C4941e.OfferWall.toString().equalsIgnoreCase(this.f12127i)) {
                if (bundle != null) {
                    C4933b bVar = (C4933b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f12131m = bVar;
                        this.f12123e.mo34434a(bVar);
                    }
                    finish();
                } else {
                    this.f12131m = this.f12123e.f12393m;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f12124f = relativeLayout;
            setContentView(relativeLayout, this.f12130l);
            String str = this.f12122d;
            this.f12125g = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f12123e.f12389i : C4987d.m14533a(getApplicationContext(), C4766d.m13973a().mo34275a(str).mo34261b());
            if (this.f12124f.findViewById(1) == null && this.f12125g.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            m13988a(stringExtra);
            this.f12124f.addView(this.f12125g, this.f12130l);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.m14507i(f12119a, "onDestroy");
        try {
            if (this.f12124f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f12125g.getParent();
                View findViewById = this.f12122d == null ? viewGroup2.findViewById(1) : C4766d.m13973a().mo34275a(this.f12122d).mo34261b();
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f12125g);
                    if (!this.f12132n) {
                        Logger.m14507i(f12119a, "onDestroy | destroyedFromBackground");
                        m13987a();
                        return;
                    }
                    return;
                }
                throw new Exception(f12121c);
            }
            throw new Exception(f12120b);
        } catch (Exception e) {
            C4747d.m13921a(C4749f.f12052p, (Map<String, Object>) new C4743a().mo34234a("callfailreason", e.getMessage()).f12028a);
            String str = f12119a;
            Logger.m14507i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f12123e.f12388h != null) {
                this.f12123e.f12387g.onHideCustomView();
                return true;
            }
        }
        if (this.f12126h && (i == 25 || i == 24)) {
            this.f12128j.removeCallbacks(this.f12129k);
            this.f12128j.postDelayed(this.f12129k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onOrientationChanged(String str, int i) {
        m13988a(str);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        String str = f12119a;
        Logger.m14507i(str, "onPause, isFinishing=" + isFinishing());
        C4399a.f10491a.mo33206b(new Runnable((AudioManager) getSystemService("audio")) {

            /* renamed from: a */
            private /* synthetic */ AudioManager f12342a;

            {
                this.f12342a = r1;
            }

            public final void run() {
                try {
                    this.f12342a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        C4845x xVar = this.f12123e;
        if (xVar != null) {
            xVar.mo34355b((Context) this);
            if (!this.f12133o) {
                this.f12123e.mo34448k();
            }
            this.f12123e.mo34438a(false, "main");
            this.f12123e.mo34437a(this.f12127i, "onPause");
        }
        if (isFinishing()) {
            this.f12132n = true;
            m13987a();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.m14507i(f12119a, "onResume");
        C4845x xVar = this.f12123e;
        if (xVar != null) {
            xVar.mo34341a((Context) this);
            if (!this.f12133o) {
                this.f12123e.mo34449l();
            }
            this.f12123e.mo34438a(true, "main");
            this.f12123e.mo34437a(this.f12127i, "onResume");
        }
        C4399a.f10491a.mo33206b(new Runnable((AudioManager) getSystemService("audio")) {

            /* renamed from: a */
            private /* synthetic */ AudioManager f12343a;

            {
                this.f12343a = r1;
            }

            public final void run() {
                try {
                    this.f12343a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f12127i) && C4936d.C4941e.OfferWall.toString().equalsIgnoreCase(this.f12127i)) {
            this.f12131m.f12625d = true;
            bundle.putParcelable("state", this.f12131m);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Logger.m14507i(f12119a, "onStart");
        C4845x xVar = this.f12123e;
        if (xVar != null) {
            xVar.mo34437a(this.f12127i, "onStart");
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Logger.m14507i(f12119a, "onStop");
        C4845x xVar = this.f12123e;
        if (xVar != null) {
            xVar.mo34437a(this.f12127i, "onStop");
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m14507i(f12119a, "onUserLeaveHint");
        C4845x xVar = this.f12123e;
        if (xVar != null) {
            xVar.mo34437a(this.f12127i, "onUserLeaveHint");
        }
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f12126h && z) {
            runOnUiThread(this.f12129k);
        }
    }

    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f12119a;
            Logger.m14507i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        } : new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }
}
