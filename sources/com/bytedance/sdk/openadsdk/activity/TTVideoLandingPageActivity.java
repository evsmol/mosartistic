package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10189a;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10190b;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.adexpress.p299c.C10304a;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.C0749z;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0676b;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.multipro.p053b.C0935a;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p038e.C0773d;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTVideoLandingPageActivity extends Activity implements C0773d {

    /* renamed from: A */
    protected ViewStub f282A;

    /* renamed from: B */
    protected Button f283B;

    /* renamed from: C */
    protected ProgressBar f284C;

    /* renamed from: D */
    protected C1008c f285D;

    /* renamed from: E */
    protected boolean f286E = false;

    /* renamed from: F */
    protected String f287F;

    /* renamed from: G */
    protected boolean f288G = false;

    /* renamed from: H */
    protected boolean f289H = true;

    /* renamed from: I */
    protected boolean f290I = false;

    /* renamed from: J */
    protected String f291J = null;

    /* renamed from: K */
    protected int f292K;

    /* renamed from: L */
    protected C0935a f293L;

    /* renamed from: M */
    protected C0150n f294M;

    /* renamed from: N */
    protected AtomicBoolean f295N = new AtomicBoolean(true);

    /* renamed from: O */
    protected JSONArray f296O = null;

    /* renamed from: P */
    protected String f297P;

    /* renamed from: Q */
    protected C0405a f298Q = null;

    /* renamed from: R */
    private final C10192c.C10194b f299R = new C10192c.C10194b() {
        /* renamed from: a */
        public void mo258a(boolean z) {
            TTVideoLandingPageActivity.this.f286E = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                C1002v.m4716a((View) TTVideoLandingPageActivity.this.f302a, 8);
                C1002v.m4716a((View) TTVideoLandingPageActivity.this.f312k, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f313l.getLayoutParams();
                TTVideoLandingPageActivity.this.f319r = marginLayoutParams.leftMargin;
                TTVideoLandingPageActivity.this.f318q = marginLayoutParams.topMargin;
                TTVideoLandingPageActivity.this.f320s = marginLayoutParams.width;
                TTVideoLandingPageActivity.this.f321t = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                TTVideoLandingPageActivity.this.f313l.setLayoutParams(marginLayoutParams);
                return;
            }
            C1002v.m4716a((View) TTVideoLandingPageActivity.this.f302a, 0);
            C1002v.m4716a((View) TTVideoLandingPageActivity.this.f312k, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f313l.getLayoutParams();
            marginLayoutParams2.width = TTVideoLandingPageActivity.this.f320s;
            marginLayoutParams2.height = TTVideoLandingPageActivity.this.f321t;
            marginLayoutParams2.leftMargin = TTVideoLandingPageActivity.this.f319r;
            marginLayoutParams2.topMargin = TTVideoLandingPageActivity.this.f318q;
            TTVideoLandingPageActivity.this.f313l.setLayoutParams(marginLayoutParams2);
        }
    };

    /* renamed from: S */
    private boolean f300S = false;

    /* renamed from: T */
    private final BroadcastReceiver f301T = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int i = 0;
                if (!intent.getBooleanExtra("noConnectivity", false)) {
                    NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                    if (networkInfo != null) {
                        int type = networkInfo.getType();
                        if (type == 1) {
                            i = 4;
                        } else if (type == 0) {
                            i = 1;
                        }
                    } else {
                        i = C10642o.m31260c(context);
                    }
                }
                if (!(TTVideoLandingPageActivity.this.f292K != 0 || i == 0 || TTVideoLandingPageActivity.this.f302a == null || TTVideoLandingPageActivity.this.f291J == null)) {
                    TTVideoLandingPageActivity.this.f302a.mo64297a(TTVideoLandingPageActivity.this.f291J);
                }
                if (!(TTVideoLandingPageActivity.this.f315n == null || TTVideoLandingPageActivity.this.f315n.getNativeVideoController() == null || TTVideoLandingPageActivity.this.f288G || TTVideoLandingPageActivity.this.f292K == i)) {
                    ((C0676b) TTVideoLandingPageActivity.this.f315n.getNativeVideoController()).mo2236a(context, i);
                }
                TTVideoLandingPageActivity.this.f292K = i;
            }
        }
    };

    /* renamed from: a */
    protected SSWebView f302a;

    /* renamed from: b */
    protected ImageView f303b;

    /* renamed from: c */
    protected ImageView f304c;

    /* renamed from: d */
    protected TextView f305d;

    /* renamed from: e */
    protected Context f306e;

    /* renamed from: f */
    protected int f307f;

    /* renamed from: g */
    protected String f308g;

    /* renamed from: h */
    protected String f309h;

    /* renamed from: i */
    protected C0709w f310i;

    /* renamed from: j */
    protected int f311j;

    /* renamed from: k */
    protected RelativeLayout f312k;

    /* renamed from: l */
    protected FrameLayout f313l;

    /* renamed from: m */
    protected int f314m = -1;

    /* renamed from: n */
    protected NativeVideoTsView f315n;

    /* renamed from: o */
    protected long f316o;

    /* renamed from: p */
    protected C0477n f317p;

    /* renamed from: q */
    protected int f318q = 0;

    /* renamed from: r */
    protected int f319r = 0;

    /* renamed from: s */
    protected int f320s = 0;

    /* renamed from: t */
    protected int f321t = 0;

    /* renamed from: u */
    protected String f322u = "ダウンロード";

    /* renamed from: v */
    protected RelativeLayout f323v;

    /* renamed from: w */
    protected TextView f324w;

    /* renamed from: x */
    protected RoundImageView f325x;

    /* renamed from: y */
    protected TextView f326y;

    /* renamed from: z */
    protected TextView f327z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo231a() {
        return "tt_activity_videolandingpage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo233c() {
        return "tt_titlebar_close";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            boolean r0 = com.bytedance.sdk.openadsdk.TTAdSdk.isInitSuccess()
            if (r0 != 0) goto L_0x000c
            r12.finish()
        L_0x000c:
            android.view.Window r0 = r12.getWindow()     // Catch:{ all -> 0x0015 }
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.addFlags(r1)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            com.bytedance.sdk.openadsdk.core.C0558m.m2665a(r12)     // Catch:{ all -> 0x0019 }
            goto L_0x001a
        L_0x0019:
        L_0x001a:
            android.content.Context r0 = r12.getApplicationContext()
            int r0 = com.bytedance.sdk.component.utils.C10642o.m31260c(r0)
            r12.f292K = r0
            java.lang.String r0 = r12.mo231a()
            int r0 = com.bytedance.sdk.component.utils.C10647t.m31284f(r12, r0)
            r12.setContentView(r0)
            r12.f306e = r12
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "sdk_version"
            r2 = 1
            int r1 = r0.getIntExtra(r1, r2)
            r12.f307f = r1
            java.lang.String r1 = "adid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f308g = r1
            java.lang.String r1 = "log_extra"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f309h = r1
            r1 = -1
            java.lang.String r3 = "source"
            int r1 = r0.getIntExtra(r3, r1)
            r12.f311j = r1
            java.lang.String r1 = "url"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f291J = r1
            java.lang.String r1 = "web_title"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r3 = "event_tag"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.f287F = r3
            java.lang.String r3 = "gecko_id"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.f297P = r3
            java.lang.String r3 = "video_is_auto_play"
            boolean r3 = r0.getBooleanExtra(r3, r2)
            r12.f290I = r3
            r3 = 0
            java.lang.String r5 = "video_play_position"
            if (r13 == 0) goto L_0x0091
            long r6 = r13.getLong(r5)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0091
            long r6 = r13.getLong(r5, r3)
            r12.f316o = r6
        L_0x0091:
            java.lang.String r6 = "multi_process_data"
            java.lang.String r6 = r0.getStringExtra(r6)
            boolean r7 = com.bytedance.sdk.openadsdk.multipro.C0934b.m4334c()
            if (r7 == 0) goto L_0x00bd
            java.lang.String r7 = "multi_process_materialmeta"
            java.lang.String r0 = r0.getStringExtra(r7)
            if (r0 == 0) goto L_0x00b2
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b1 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00b1 }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.C0402b.m1636a((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x00b1 }
            r12.f317p = r0     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f317p
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.mo1383ad()
            r12.f314m = r0
            goto L_0x00d6
        L_0x00bd:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.C0625t.m3022a()
            com.bytedance.sdk.openadsdk.core.e.n r0 = r0.mo2031c()
            r12.f317p = r0
            if (r0 == 0) goto L_0x00cf
            int r0 = r0.mo1383ad()
            r12.f314m = r0
        L_0x00cf:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.C0625t.m3022a()
            r0.mo2036h()
        L_0x00d6:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f317p
            if (r0 != 0) goto L_0x00de
            r12.finish()
            return
        L_0x00de:
            if (r6 == 0) goto L_0x00f5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ec }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00ec }
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = com.bytedance.sdk.openadsdk.multipro.p053b.C0935a.m4335a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x00ec }
            r12.f293L = r0     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = r12.f293L
            if (r0 == 0) goto L_0x00f5
            long r6 = r0.f3252g
            r12.f316o = r6
        L_0x00f5:
            if (r13 == 0) goto L_0x011d
            java.lang.String r0 = "material_meta"
            java.lang.String r0 = r13.getString(r0)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r12.f317p
            if (r6 != 0) goto L_0x010e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x010d }
            r6.<init>(r0)     // Catch:{ all -> 0x010d }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.C0402b.m1636a((org.json.JSONObject) r6)     // Catch:{ all -> 0x010d }
            r12.f317p = r0     // Catch:{ all -> 0x010d }
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            long r5 = r13.getLong(r5)
            java.lang.String r0 = "is_complete"
            r13.getBoolean(r0)
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x011d
            r12.f316o = r5
        L_0x011d:
            r12.mo234d()
            r12.mo240j()
            r12.m358n()
            r13 = 4
            r12.m350a((int) r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            r3 = 0
            if (r13 < r0) goto L_0x0133
            r13 = 1
            goto L_0x0134
        L_0x0133:
            r13 = 0
        L_0x0134:
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f302a
            java.lang.String r4 = "landingpage_split_screen"
            if (r0 == 0) goto L_0x0167
            android.content.Context r0 = r12.f306e
            com.bytedance.sdk.openadsdk.core.widget.a.b r0 = com.bytedance.sdk.openadsdk.core.widget.p036a.C0728b.m3733a((android.content.Context) r0)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r0.mo2470a((boolean) r13)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r13.mo2472b((boolean) r3)
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f302a
            android.webkit.WebView r0 = r0.getWebView()
            r13.mo2471a((android.webkit.WebView) r0)
            com.bytedance.sdk.openadsdk.b.n r13 = new com.bytedance.sdk.openadsdk.b.n
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f317p
            com.bytedance.sdk.component.widget.SSWebView r5 = r12.f302a
            android.webkit.WebView r5 = r5.getWebView()
            r13.<init>(r12, r0, r5)
            com.bytedance.sdk.openadsdk.b.n r13 = r13.mo428a((boolean) r2)
            r12.f294M = r13
            r13.mo438a((java.lang.String) r4)
        L_0x0167:
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            r13.setLandingPage(r2)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            r13.setTag(r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f317p
            com.bytedance.sdk.component.widget.b.a r0 = r0.mo1372aC()
            r13.setMaterialMeta(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1
            android.content.Context r7 = r12.f306e
            com.bytedance.sdk.openadsdk.core.w r8 = r12.f310i
            java.lang.String r9 = r12.f308g
            com.bytedance.sdk.openadsdk.b.n r10 = r12.f294M
            r11 = 1
            r5 = r0
            r6 = r12
            r5.<init>(r7, r8, r9, r10, r11)
            r13.setWebViewClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            if (r13 == 0) goto L_0x01a2
            android.webkit.WebView r0 = r13.getWebView()
            int r2 = r12.f307f
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.C0981i.m4546a((android.webkit.WebView) r0, (int) r2)
            r13.setUserAgentString(r0)
        L_0x01a2:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r13 < r0) goto L_0x01ad
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            r13.setMixedContentMode(r3)
        L_0x01ad:
            android.content.Context r13 = r12.f306e
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f317p
            com.bytedance.sdk.openadsdk.p000b.C0136e.m593a((android.content.Context) r13, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r0, (java.lang.String) r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            java.lang.String r0 = r12.f291J
            com.bytedance.sdk.openadsdk.utils.C0982j.m4548a(r13, r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3
            com.bytedance.sdk.openadsdk.core.w r2 = r12.f310i
            com.bytedance.sdk.openadsdk.b.n r3 = r12.f294M
            r0.<init>(r2, r3)
            r13.setWebChromeClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f302a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4
            r0.<init>()
            r13.setDownloadListener(r0)
            android.widget.TextView r13 = r12.f305d
            if (r13 == 0) goto L_0x01e6
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = "tt_web_title_default"
            java.lang.String r1 = com.bytedance.sdk.component.utils.C10647t.m31276a(r12, r0)
        L_0x01e3:
            r13.setText(r1)
        L_0x01e6:
            r12.mo241k()
            r12.mo235e()
            r12.m357m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: m */
    private void m357m() {
        C0477n nVar = this.f317p;
        if (nVar != null && nVar.mo1332L() == 4) {
            this.f282A.setVisibility(0);
            Button button = (Button) findViewById(C10647t.m31283e(this, "tt_browser_download_btn"));
            this.f283B = button;
            if (button != null) {
                m353a(mo232b());
                this.f283B.setOnClickListener(this.f298Q);
                this.f283B.setOnTouchListener(this.f298Q);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo232b() {
        C0477n nVar = this.f317p;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo1343W())) {
            this.f322u = this.f317p.mo1343W();
        }
        return this.f322u;
    }

    /* renamed from: a */
    private void m353a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.f283B) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTVideoLandingPageActivity.this.f283B != null && !TTVideoLandingPageActivity.this.isFinishing()) {
                        TTVideoLandingPageActivity.this.f283B.setText(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo234d() {
        this.f284C = (ProgressBar) findViewById(C10647t.m31283e(this, "tt_browser_progress"));
        this.f282A = (ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_download_btn_stub"));
        this.f302a = (SSWebView) findViewById(C10647t.m31283e(this, "tt_browser_webview"));
        ImageView imageView = (ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_back"));
        this.f303b = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f302a == null) {
                        return;
                    }
                    if (TTVideoLandingPageActivity.this.f302a.mo64308e()) {
                        TTVideoLandingPageActivity.this.f302a.mo64309f();
                    } else if (TTVideoLandingPageActivity.this.m362r()) {
                        TTVideoLandingPageActivity.this.onBackPressed();
                    } else {
                        Map<String, Object> map = null;
                        if (!(TTVideoLandingPageActivity.this.f315n == null || TTVideoLandingPageActivity.this.f315n.getNativeVideoController() == null)) {
                            map = C0996u.m4620a(TTVideoLandingPageActivity.this.f317p, TTVideoLandingPageActivity.this.f315n.getNativeVideoController().mo2110h(), TTVideoLandingPageActivity.this.f315n.getNativeVideoController().mo2114n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        C0136e.m597a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.f317p, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.mo237g(), TTVideoLandingPageActivity.this.mo238h(), map, (C0146j) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.f290I);
        }
        ImageView imageView2 = (ImageView) findViewById(C10647t.m31283e(this, mo233c()));
        this.f304c = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f315n != null) {
                        Map<String, Object> map = null;
                        if (TTVideoLandingPageActivity.this.f315n.getNativeVideoController() != null) {
                            map = C0996u.m4620a(TTVideoLandingPageActivity.this.f317p, TTVideoLandingPageActivity.this.f315n.getNativeVideoController().mo2110h(), TTVideoLandingPageActivity.this.f315n.getNativeVideoController().mo2114n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        C0136e.m597a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.f317p, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.mo237g(), TTVideoLandingPageActivity.this.mo238h(), map, (C0146j) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f305d = (TextView) findViewById(C10647t.m31283e(this, "tt_titlebar_title"));
        this.f313l = (FrameLayout) findViewById(C10647t.m31283e(this, "tt_native_video_container"));
        this.f312k = (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_native_video_titlebar"));
        this.f323v = (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_rl_download"));
        this.f324w = (TextView) findViewById(C10647t.m31283e(this, "tt_video_btn_ad_image_tv"));
        this.f326y = (TextView) findViewById(C10647t.m31283e(this, "tt_video_ad_name"));
        this.f327z = (TextView) findViewById(C10647t.m31283e(this, "tt_video_ad_button"));
        this.f325x = (RoundImageView) findViewById(C10647t.m31283e(this, "tt_video_ad_logo_image"));
        mo239i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m357m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo235e() {
        if (mo236f()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.f306e, this.f317p, true, (C0146j) null);
                this.f315n = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.f315n.getNativeVideoController().mo2098a(false);
                }
                if (this.f288G) {
                    this.f313l.setVisibility(0);
                    this.f313l.removeAllViews();
                    this.f313l.addView(this.f315n);
                    this.f315n.mo2202b(true);
                } else {
                    if (!this.f290I) {
                        this.f316o = 0;
                    }
                    if (!(this.f293L == null || this.f315n.getNativeVideoController() == null)) {
                        this.f315n.getNativeVideoController().mo2099b(this.f293L.f3252g);
                        this.f315n.getNativeVideoController().mo2105c(this.f293L.f3250e);
                        this.f315n.setIsQuiet(C0558m.m2673h().mo1676a(C0996u.m4657f(this.f317p)));
                    }
                    if (this.f315n.mo2201a(this.f316o, this.f289H, this.f288G)) {
                        this.f313l.setVisibility(0);
                        this.f313l.removeAllViews();
                        this.f313l.addView(this.f315n);
                    }
                    if (this.f315n.getNativeVideoController() != null) {
                        this.f315n.getNativeVideoController().mo2098a(false);
                        this.f315n.getNativeVideoController().mo2149a(this.f299R);
                    }
                }
                C0750a.m3822a().mo64068a(this.f317p.mo1336P().get(0).mo1281a()).mo64107a(C10571t.BITMAP).mo64102a((C10565n) new C10565n<Bitmap>() {
                    /* renamed from: a */
                    public void mo256a(int i, String str, Throwable th) {
                    }

                    /* renamed from: a */
                    public void mo257a(C10561j<Bitmap> jVar) {
                        try {
                            Bitmap b = jVar.mo64116b();
                            if (Build.VERSION.SDK_INT >= 17) {
                                new C0087a(b, TTVideoLandingPageActivity.this.f315n.getNativeVideoController().mo2115o()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.f315n.findViewById(C10647t.m31283e(this.f306e, "tt_root_view")).setOnTouchListener((View.OnTouchListener) null);
                this.f315n.findViewById(C10647t.m31283e(this.f306e, "tt_root_view")).setOnClickListener((View.OnClickListener) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.f292K == 0) {
                try {
                    Toast.makeText(this, C10647t.m31279b(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo236f() {
        return this.f314m == 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public long mo237g() {
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f315n.getNativeVideoController().mo2112j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo238h() {
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f315n.getNativeVideoController().mo2171l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo239i() {
        String str;
        C0477n nVar = this.f317p;
        if (nVar != null && nVar.mo1332L() == 4) {
            C1002v.m4716a((View) this.f323v, 0);
            if (!TextUtils.isEmpty(this.f317p.mo1341U())) {
                str = this.f317p.mo1341U();
            } else if (!TextUtils.isEmpty(this.f317p.mo1342V())) {
                str = this.f317p.mo1342V();
            } else {
                str = !TextUtils.isEmpty(this.f317p.mo1331K()) ? this.f317p.mo1331K() : "";
            }
            if (this.f317p.mo1333M() != null && this.f317p.mo1333M().mo1281a() != null) {
                C1002v.m4716a((View) this.f325x, 0);
                C1002v.m4716a((View) this.f324w, 4);
                C0835d.m4093a().mo2658a(this.f317p.mo1333M(), (ImageView) this.f325x);
            } else if (!TextUtils.isEmpty(str)) {
                C1002v.m4716a((View) this.f325x, 4);
                C1002v.m4716a((View) this.f324w, 0);
                this.f324w.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.f317p.mo1343W())) {
                this.f327z.setText(this.f317p.mo1343W());
            }
            if (!TextUtils.isEmpty(str)) {
                this.f326y.setText(str);
            }
            C1002v.m4716a((View) this.f326y, 0);
            C1002v.m4716a((View) this.f327z, 0);
        }
    }

    /* renamed from: j */
    public void mo240j() {
        C0477n nVar = this.f317p;
        if (nVar != null) {
            this.f285D = C1009d.m4776a(this, nVar, this.f287F);
            C0405a aVar = new C0405a(this, this.f317p, this.f287F, this.f311j);
            this.f298Q = aVar;
            aVar.mo1091a(false);
            this.f298Q.mo1095c(true);
            this.f327z.setOnClickListener(this.f298Q);
            this.f327z.setOnTouchListener(this.f298Q);
            this.f298Q.mo1106a(this.f285D);
        }
    }

    /* renamed from: n */
    private void m358n() {
        C0709w wVar = new C0709w(this);
        this.f310i = wVar;
        wVar.mo2365b(this.f302a).mo2378d(this.f308g).mo2383e(this.f309h).mo2364b(this.f311j).mo2345a(this.f317p).mo2339a(this.f317p.mo1326F()).mo2342a(this.f302a).mo2372c("landingpage_split_screen").mo2385f(C0996u.m4673i(this.f317p));
    }

    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.f286E && (nativeVideoTsView = this.f315n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((C10189a) this.f315n.getNativeVideoController()).mo2166e((C10190b) null, (View) null);
            this.f286E = false;
        } else if (!m362r() || this.f295N.getAndSet(true)) {
            super.onBackPressed();
        } else {
            m354a(true);
            m350a(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C0477n nVar = this.f317p;
        bundle.putString("material_meta", nVar != null ? nVar.mo1397ar().toString() : null);
        bundle.putLong("video_play_position", this.f316o);
        bundle.putBoolean("is_complete", this.f288G);
        long j = this.f316o;
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            j = this.f315n.getNativeVideoController().mo2109g();
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f289H) {
            m359o();
        }
        this.f289H = false;
        C0709w wVar = this.f310i;
        if (wVar != null) {
            wVar.mo2395l();
        }
        C0150n nVar = this.f294M;
        if (nVar != null) {
            nVar.mo441d();
        }
        m363s();
    }

    /* renamed from: o */
    private void m359o() {
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null && !m361q()) {
            this.f315n.mo2211l();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        NativeVideoTsView nativeVideoTsView;
        NativeVideoTsView nativeVideoTsView2;
        super.onPause();
        C0709w wVar = this.f310i;
        if (wVar != null) {
            wVar.mo2396m();
        }
        m360p();
        if (this.f288G || !((nativeVideoTsView2 = this.f315n) == null || nativeVideoTsView2.getNativeVideoController() == null || !this.f315n.getNativeVideoController().mo2117q())) {
            this.f288G = true;
            C0947a.m4400a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
            C0947a.m4400a("sp_multi_native_video_data", "key_native_video_complete", (Boolean) true);
            C0947a.m4400a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        }
        if (!this.f288G && (nativeVideoTsView = this.f315n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            m351a(this.f315n.getNativeVideoController());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C0150n nVar = this.f294M;
        if (nVar != null) {
            nVar.mo442e();
        }
    }

    /* renamed from: a */
    private void m351a(C10192c cVar) {
        C0947a.m4400a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
        C0947a.m4400a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        C0947a.m4400a("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(cVar.mo2117q()));
        C0947a.m4403a("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(cVar.mo2109g()));
        C0947a.m4403a("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(cVar.mo2112j() + cVar.mo2110h()));
        C0947a.m4403a("sp_multi_native_video_data", "key_video_duration", Long.valueOf(cVar.mo2112j()));
    }

    /* renamed from: p */
    private void m360p() {
        if (this.f315n != null && !m361q()) {
            this.f315n.mo2211l();
        }
    }

    /* renamed from: q */
    private boolean m361q() {
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.f315n.getNativeVideoController().mo2117q();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        mo242l();
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
            this.f317p.mo1369a(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f302a;
        if (sSWebView != null) {
            C0749z.m3817a(this.f306e, sSWebView.getWebView());
            C0749z.m3818a(this.f302a.getWebView());
        }
        this.f302a = null;
        C0709w wVar = this.f310i;
        if (wVar != null) {
            wVar.mo2398n();
        }
        NativeVideoTsView nativeVideoTsView = this.f315n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            this.f315n.getNativeVideoController().mo2168f();
        }
        this.f315n = null;
        this.f317p = null;
        C0150n nVar = this.f294M;
        if (nVar != null) {
            nVar.mo443f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo241k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            this.f306e.registerReceiver(this.f301T, intentFilter);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo242l() {
        try {
            this.f306e.unregisterReceiver(this.f301T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m362r() {
        return !TextUtils.isEmpty(this.f291J) && this.f291J.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m350a(int i) {
        if (this.f304c != null && m362r()) {
            C1002v.m4716a((View) this.f304c, i);
        }
    }

    /* renamed from: a */
    private void m354a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z);
            this.f310i.mo2359a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    private void m363s() {
        if (this.f317p != null) {
            JSONArray b = m356b(this.f291J);
            int f = C0996u.m4657f(this.f317p);
            int e = C0996u.m4653e(this.f317p);
            C0561n<C0106a> f2 = C0558m.m2671f();
            if (b != null && f2 != null && f > 0 && e > 0) {
                C0479o oVar = new C0479o();
                oVar.f1730e = b;
                AdSlot x = this.f317p.mo1477x();
                if (x != null) {
                    x.setAdCount(6);
                    f2.mo1840a(x, oVar, e, new C0561n.C0562a() {
                        /* renamed from: a */
                        public void mo186a(int i, String str) {
                            TTVideoLandingPageActivity.this.m350a(0);
                        }

                        /* renamed from: a */
                        public void mo187a(C0448a aVar, C0449b bVar) {
                            if (aVar != null) {
                                try {
                                    TTVideoLandingPageActivity.this.f295N.set(false);
                                    TTVideoLandingPageActivity.this.f310i.mo2366b(new JSONObject(aVar.mo1201c()));
                                } catch (Exception unused) {
                                    TTVideoLandingPageActivity.this.m350a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private JSONArray m356b(String str) {
        int i;
        JSONArray jSONArray = this.f296O;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f296O;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    /* renamed from: a */
    public void mo169a(boolean z, JSONArray jSONArray) {
        if (z && jSONArray != null && jSONArray.length() > 0) {
            this.f296O = jSONArray;
            m363s();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$a */
    private static class C0087a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        private Bitmap f339a;

        /* renamed from: b */
        private WeakReference<C10190b> f340b;

        private C0087a(Bitmap bitmap, C10190b bVar) {
            this.f339a = bitmap;
            this.f340b = new WeakReference<>(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap a = C10304a.m29746a(C0558m.m2663a(), this.f339a, 25);
                if (a == null) {
                    return null;
                }
                return new BitmapDrawable(C0558m.m2663a().getResources(), a);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            WeakReference<C10190b> weakReference;
            if (drawable != null && (weakReference = this.f340b) != null && weakReference.get() != null) {
                ((C10190b) this.f340b.get()).mo2302a(drawable);
            }
        }
    }
}
