package com.criteo.publisher;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p060b0.C1053a;
import com.criteo.publisher.p060b0.C1056c;
import com.explorestack.protobuf.openrtb.LossReason;
import java.lang.ref.WeakReference;

public class CriteoInterstitialActivity extends Activity {

    /* renamed from: a */
    private final C1195g f3371a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private WebView f3372b;

    /* renamed from: c */
    private ResultReceiver f3373c;

    /* renamed from: d */
    private FrameLayout f3374d;

    /* renamed from: e */
    private ComponentName f3375e;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            m4851c();
        } catch (Throwable th) {
            this.f3371a.mo3337a(C1328v.m5922b(th));
            finish();
        }
    }

    /* renamed from: c */
    private void m4851c() {
        setContentView(C1013R.layout.activity_criteo_interstitial);
        this.f3374d = (FrameLayout) findViewById(C1013R.C1016id.AdLayout);
        WebView webView = new WebView(getApplicationContext());
        this.f3372b = webView;
        this.f3374d.addView(webView, 0);
        ImageButton imageButton = (ImageButton) findViewById(C1013R.C1016id.closeButton);
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || extras.getString("webviewdata") == null)) {
            String string = extras.getString("webviewdata");
            this.f3373c = (ResultReceiver) extras.getParcelable("resultreceiver");
            this.f3375e = (ComponentName) extras.getParcelable("callingactivity");
            m4852d();
            m4848a(string);
        }
        imageButton.setOnClickListener(new C1011a());
    }

    /* renamed from: com.criteo.publisher.CriteoInterstitialActivity$a */
    class C1011a implements View.OnClickListener {
        C1011a() {
        }

        public void onClick(View view) {
            CriteoInterstitialActivity.this.m4849b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4849b() {
        Bundle bundle = new Bundle();
        bundle.putInt("Action", 201);
        this.f3373c.send(100, bundle);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4846a() {
        Bundle bundle = new Bundle();
        bundle.putInt("Action", LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE);
        this.f3373c.send(100, bundle);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3374d.removeAllViews();
        this.f3372b.destroy();
        this.f3372b = null;
    }

    /* renamed from: a */
    private void m4848a(String str) {
        this.f3372b.loadDataWithBaseURL("https://criteo.com", str, "text/html", "UTF-8", "about:blank");
    }

    /* renamed from: d */
    private void m4852d() {
        this.f3372b.getSettings().setJavaScriptEnabled(true);
        this.f3372b.setWebViewClient(new C1053a(new C1012b(new WeakReference(this), (C1011a) null), this.f3375e));
    }

    public void onBackPressed() {
        m4849b();
    }

    /* renamed from: com.criteo.publisher.CriteoInterstitialActivity$b */
    private static class C1012b implements C1056c {

        /* renamed from: a */
        private final WeakReference<CriteoInterstitialActivity> f3377a;

        /* synthetic */ C1012b(WeakReference weakReference, C1011a aVar) {
            this(weakReference);
        }

        private C1012b(WeakReference<CriteoInterstitialActivity> weakReference) {
            this.f3377a = weakReference;
        }

        /* renamed from: b */
        public void mo2981b() {
            CriteoInterstitialActivity criteoInterstitialActivity = (CriteoInterstitialActivity) this.f3377a.get();
            if (criteoInterstitialActivity != null) {
                criteoInterstitialActivity.m4846a();
            }
        }

        /* renamed from: a */
        public void mo2980a() {
            CriteoInterstitialActivity criteoInterstitialActivity = (CriteoInterstitialActivity) this.f3377a.get();
            if (criteoInterstitialActivity != null) {
                criteoInterstitialActivity.m4849b();
            }
        }
    }
}
