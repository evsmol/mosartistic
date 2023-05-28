package com.bytedance.sdk.component.adexpress.p300d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C10261a;
import com.bytedance.sdk.component.adexpress.C10281b;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10279b;
import com.bytedance.sdk.component.adexpress.p298b.C10286d;
import com.bytedance.sdk.component.adexpress.p298b.C10289f;
import com.bytedance.sdk.component.adexpress.p298b.C10290g;
import com.bytedance.sdk.component.adexpress.p298b.C10294j;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.adexpress.theme.C10409a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10634k;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.d.a */
/* compiled from: BaseWebViewRender */
public abstract class C10308a implements C10261a, C10286d<SSWebView>, C10294j, C10409a {

    /* renamed from: a */
    protected SSWebView f25485a;

    /* renamed from: b */
    protected int f25486b = 8;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C10279b f25487c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public AtomicBoolean f25488d = new AtomicBoolean(false);

    /* renamed from: e */
    private Context f25489e;

    /* renamed from: f */
    private String f25490f;

    /* renamed from: g */
    private JSONObject f25491g;

    /* renamed from: h */
    private String f25492h;

    /* renamed from: i */
    private C10289f f25493i;

    /* renamed from: j */
    private boolean f25494j = false;

    /* renamed from: k */
    private boolean f25495k;

    /* renamed from: l */
    private C10290g f25496l;

    /* renamed from: m */
    private C10296l f25497m;

    /* renamed from: n */
    private boolean f25498n;

    /* renamed from: o */
    private int f25499o;

    /* renamed from: a */
    public abstract void mo1994a(int i);

    /* renamed from: c */
    public int mo1943c() {
        return 0;
    }

    /* renamed from: g */
    public abstract void mo1998g();

    /* renamed from: h */
    public void mo63241h() {
    }

    /* renamed from: i */
    public void mo63242i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo2000k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo2001l() {
    }

    public C10308a(Context context, C10296l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f25489e = context;
        this.f25497m = lVar;
        this.f25490f = lVar.mo63176b();
        this.f25491g = lVar.mo63175a();
        themeStatusBroadcastReceiver.mo63708a(this);
        SSWebView b = C10313e.m29785a().mo63264b();
        this.f25485a = b;
        if (b == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (C10303c.m29743a() != null) {
                this.f25485a = new SSWebView(C10303c.m29743a());
                return;
            }
            return;
        }
        this.f25494j = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    /* renamed from: a */
    public void mo63238a(String str) {
        this.f25492h = str;
    }

    /* renamed from: a */
    public SSWebView mo1993a() {
        return this.f25485a;
    }

    /* renamed from: a */
    public void mo63237a(C10290g gVar) {
        this.f25496l = gVar;
    }

    /* renamed from: a */
    public void mo1937a(C10289f fVar) {
        this.f25493i = fVar;
        if (mo1993a() == null || mo1993a().getWebView() == null) {
            this.f25493i.mo1929a(102);
        } else if (!C10266a.m29501f()) {
            this.f25493i.mo1929a(102);
        } else if (TextUtils.isEmpty(this.f25492h)) {
            this.f25493i.mo1929a(102);
        } else if (this.f25487c != null || C10266a.m29494a(this.f25491g)) {
            this.f25497m.mo63177c().mo1964a(this.f25494j);
            if (this.f25494j) {
                try {
                    this.f25485a.mo64325m();
                    this.f25497m.mo63177c().mo1965b();
                    C10634k.m31223a(this.f25485a.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                } catch (Exception unused) {
                    C10638l.m31235b("WebViewRender", "reuse webview load fail ");
                    C10313e.m29785a().mo63267c(this.f25485a);
                    this.f25493i.mo1929a(102);
                }
            } else {
                SSWebView a = mo1993a();
                a.mo64325m();
                this.f25497m.mo63177c().mo1965b();
                a.mo64297a(this.f25492h);
            }
        } else {
            this.f25493i.mo1929a(103);
        }
    }

    /* renamed from: b */
    public SSWebView mo1946e() {
        return mo1993a();
    }

    /* renamed from: d */
    public void mo1996d() {
        if (!this.f25488d.get()) {
            this.f25488d.set(true);
            mo1998g();
            if (this.f25485a.getParent() != null) {
                ((ViewGroup) this.f25485a.getParent()).removeView(this.f25485a);
            }
            if (this.f25495k) {
                C10313e.m29785a().mo63262a(this.f25485a);
            } else {
                C10313e.m29785a().mo63267c(this.f25485a);
            }
        }
    }

    /* renamed from: f */
    public void mo1997f() {
        if (mo1993a() != null) {
            try {
                mo1993a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo63239a(boolean z) {
        this.f25498n = z;
    }

    /* renamed from: a */
    public void mo63174a(final C10298m mVar) {
        if (mVar == null) {
            this.f25493i.mo1929a(105);
            return;
        }
        boolean a = mVar.mo63212a();
        final float b = (float) mVar.mo63213b();
        final float c = (float) mVar.mo63218c();
        if (b <= 0.0f || c <= 0.0f) {
            this.f25493i.mo1929a(105);
            return;
        }
        this.f25495k = a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m29758a(mVar, b, c);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    C10308a.this.m29758a(mVar, b, c);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29758a(C10298m mVar, float f, float f2) {
        if (!this.f25495k || this.f25498n) {
            C10313e.m29785a().mo63267c(this.f25485a);
            m29760c(mVar.mo63229h());
            return;
        }
        m29757a(f, f2);
        mo1994a(this.f25486b);
        C10289f fVar = this.f25493i;
        if (fVar != null) {
            fVar.mo1930a(mo1993a(), mVar);
        }
    }

    /* renamed from: a */
    public void mo63173a(View view, int i, C10281b bVar) {
        C10290g gVar = this.f25496l;
        if (gVar != null) {
            gVar.mo965a(view, i, bVar);
        }
    }

    /* renamed from: a */
    private void m29757a(float f, float f2) {
        this.f25497m.mo63177c().mo1967c();
        int a = (int) C10305b.m29747a(this.f25489e, f);
        int a2 = (int) C10305b.m29747a(this.f25489e, f2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mo1993a().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(a, a2);
        }
        layoutParams.width = a;
        layoutParams.height = a2;
        mo1993a().setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m29760c(int i) {
        C10289f fVar = this.f25493i;
        if (fVar != null) {
            fVar.mo1929a(i);
        }
    }

    /* renamed from: j */
    public void mo1999j() {
        mo2000k();
        Activity a = C10622b.m31189a(this.f25485a);
        if (a != null) {
            this.f25499o = a.hashCode();
        }
    }

    /* renamed from: a */
    public void mo63089a(Activity activity) {
        if (this.f25499o != 0 && activity != null && activity.hashCode() == this.f25499o) {
            C10638l.m31235b("WebViewRender", "release from activity onDestroy");
            mo1996d();
            mo2001l();
        }
    }
}
