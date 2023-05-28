package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0411e;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.b */
/* compiled from: RewardFullPlayableManager */
public class C0266b {

    /* renamed from: a */
    protected final AtomicBoolean f863a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f864b = new AtomicBoolean(false);

    /* renamed from: c */
    boolean f865c = false;

    /* renamed from: d */
    boolean f866d = false;

    /* renamed from: e */
    long f867e = 0;

    /* renamed from: f */
    int f868f = 0;

    /* renamed from: g */
    int f869g = 0;

    /* renamed from: h */
    int f870h = 0;

    /* renamed from: i */
    private Activity f871i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C0477n f872j;

    /* renamed from: k */
    private C0279f f873k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f874l;

    /* renamed from: m */
    private int f875m = 1;

    /* renamed from: n */
    private PlayableLoadingView f876n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f877o = true;

    /* renamed from: p */
    private HomeWatcherReceiver f878p;

    /* renamed from: q */
    private boolean f879q = false;

    public C0266b(Activity activity) {
        this.f871i = activity;
    }

    /* renamed from: a */
    public void mo675a(C0279f fVar, C0477n nVar, String str, int i) {
        if (!this.f879q) {
            this.f879q = true;
            this.f873k = fVar;
            this.f872j = nVar;
            this.f874l = str;
            this.f875m = i;
            m1051l();
        }
    }

    /* renamed from: l */
    private void m1051l() {
        Activity activity = this.f871i;
        this.f876n = (PlayableLoadingView) activity.findViewById(C10647t.m31283e(activity, "tt_reward_playable_loading"));
    }

    /* renamed from: a */
    public boolean mo680a() {
        if (this.f876n == null) {
            return false;
        }
        C0477n nVar = this.f872j;
        if (nVar == null || !nVar.mo1376aG() || !C0480p.m2198i(this.f872j)) {
            this.f876n.mo2409a();
            return false;
        }
        this.f876n.mo2410b();
        return true;
    }

    /* renamed from: b */
    public void mo682b() {
        if (!this.f863a.getAndSet(true) && this.f873k.mo787c() != null && this.f873k.mo789d() != null) {
            C1002v.m4716a((View) this.f873k.mo787c(), 0);
            C1002v.m4716a((View) this.f873k.mo789d(), 8);
        }
    }

    /* renamed from: a */
    public void mo674a(DownloadListener downloadListener) {
        if (this.f873k.mo789d() != null) {
            String m = m1052m();
            if (!TextUtils.isEmpty(m)) {
                this.f873k.mo789d().setWebViewClient(new C0730d(this.f871i, this.f873k.mo792f(), this.f872j.mo1345Y(), (C0150n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        if (C0266b.this.f877o) {
                            C0136e.m626c(this.f2820d, C0266b.this.f872j, C0266b.this.f874l, "loading_h5_success", (JSONObject) null);
                        }
                        super.onPageFinished(webView, str);
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = C0266b.this.f877o = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = C0266b.this.f877o = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = C0266b.this.f877o = false;
                    }
                });
                this.f873k.mo789d().mo64297a(m);
                this.f873k.mo789d().setDisplayZoomControls(false);
                this.f873k.mo789d().setWebChromeClient(new C0729c(this.f873k.mo792f(), this.f873k.mo793g()));
                this.f873k.mo789d().setDownloadListener(downloadListener);
            }
        }
    }

    /* renamed from: m */
    private String m1052m() {
        C0477n nVar;
        String l = C0558m.m2673h().mo1706l();
        C10638l.m31238c("Playable", "getPlayableLoadH5Url->loadH5Url=" + l);
        if (TextUtils.isEmpty(l) || (nVar = this.f872j) == null || nVar.mo1380aa() == null) {
            return l;
        }
        String b = this.f872j.mo1380aa().mo1217b();
        double d = this.f872j.mo1380aa().mo1222d();
        int e = this.f872j.mo1380aa().mo1223e();
        String a = (this.f872j.mo1333M() == null || TextUtils.isEmpty(this.f872j.mo1333M().mo1281a())) ? "" : this.f872j.mo1333M().mo1281a();
        String Y = this.f872j.mo1345Y();
        String c = this.f872j.mo1380aa().mo1220c();
        String a2 = this.f872j.mo1380aa().mo1213a();
        String b2 = this.f872j.mo1380aa().mo1217b();
        String U = this.f872j.mo1341U();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appname=");
        stringBuffer.append(URLEncoder.encode(b));
        stringBuffer.append("&stars=");
        stringBuffer.append(d);
        stringBuffer.append("&comments=");
        stringBuffer.append(e);
        stringBuffer.append("&icon=");
        stringBuffer.append(URLEncoder.encode(a));
        stringBuffer.append("&downloading=");
        stringBuffer.append(true);
        stringBuffer.append("&id=");
        stringBuffer.append(URLEncoder.encode(Y));
        stringBuffer.append("&packageName=");
        stringBuffer.append(URLEncoder.encode(c));
        stringBuffer.append("&downloadUrl=");
        stringBuffer.append(URLEncoder.encode(a2));
        stringBuffer.append("&name=");
        stringBuffer.append(URLEncoder.encode(b2));
        stringBuffer.append("&orientation=");
        stringBuffer.append(this.f875m == 1 ? "portrait" : "landscape");
        stringBuffer.append("&apptitle=");
        stringBuffer.append(URLEncoder.encode(U));
        String str = l + "?" + stringBuffer.toString();
        C10638l.m31238c("Playable", "Playable-loadH5Url=" + str);
        return str;
    }

    /* renamed from: c */
    public void mo684c() {
        this.f865c = true;
    }

    /* renamed from: d */
    public boolean mo687d() {
        return this.f865c;
    }

    /* renamed from: a */
    public void mo679a(boolean z) {
        if (Build.VERSION.SDK_INT >= 19 && z) {
            this.f873k.mo787c().setDomStorageEnabled(true);
        }
    }

    /* renamed from: b */
    public void mo683b(boolean z) {
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.f873k.mo802p()) && this.f873k.mo800n() != 0) {
                    C0796b.m3985a().mo2606a(this.f873k.mo802p(), this.f873k.mo800n(), this.f873k.mo801o());
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.f873k.mo802p())) {
                    C0796b.m3985a().mo2611b(this.f873k.mo802p());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: e */
    public void mo688e() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.f878p = homeWatcherReceiver;
            homeWatcherReceiver.mo64259a(new HomeWatcherReceiver.C10620a() {
                /* renamed from: a */
                public void mo695a() {
                    C0266b.this.f866d = true;
                }

                /* renamed from: b */
                public void mo696b() {
                    C0266b.this.f866d = true;
                }
            });
            this.f871i.getApplicationContext().registerReceiver(this.f878p, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo673a(Context context) {
        try {
            this.f878p.mo64259a((HomeWatcherReceiver.C10620a) null);
            context.getApplicationContext().unregisterReceiver(this.f878p);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo677a(String str) {
        if (this.f866d) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - this.f867e));
            C0136e.m625c((Context) this.f871i, this.f872j, this.f874l, str, (Map<String, Object>) hashMap);
            if ("return_foreground".equals(str)) {
                this.f866d = false;
            }
        }
    }

    /* renamed from: f */
    public void mo689f() {
        this.f867e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo678a(Map<String, Object> map) {
        if (map != null) {
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(System.currentTimeMillis() - this.f867e));
        }
    }

    /* renamed from: a */
    public void mo671a(int i) {
        PlayableLoadingView playableLoadingView = this.f876n;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo676a(C0411e eVar) {
        PlayableLoadingView playableLoadingView = this.f876n;
        if (playableLoadingView != null && playableLoadingView.getPlayView() != null && C0480p.m2198i(this.f872j)) {
            this.f876n.getPlayView().setOnClickListener(eVar);
            this.f876n.getPlayView().setOnTouchListener(eVar);
        }
    }

    /* renamed from: g */
    public void mo690g() {
        PlayableLoadingView playableLoadingView = this.f876n;
        if (playableLoadingView != null) {
            playableLoadingView.mo2409a();
        }
    }

    /* renamed from: h */
    public void mo691h() {
        this.f864b.set(true);
    }

    /* renamed from: i */
    public boolean mo692i() {
        return this.f864b.get();
    }

    /* renamed from: b */
    public int mo681b(int i) {
        return this.f870h - (this.f869g - i);
    }

    /* renamed from: j */
    public int mo693j() {
        return this.f869g;
    }

    /* renamed from: k */
    public int mo694k() {
        return this.f868f;
    }

    /* renamed from: a */
    public void mo672a(int i, C0477n nVar, boolean z) {
        if (nVar != null) {
            this.f869g = nVar.mo1399at();
            this.f870h = C0558m.m2673h().mo1673a(String.valueOf(i), z);
        }
    }

    /* renamed from: c */
    public void mo685c(int i) {
        this.f868f = i - 1;
    }

    /* renamed from: d */
    public void mo686d(int i) {
        this.f868f = i;
    }
}
