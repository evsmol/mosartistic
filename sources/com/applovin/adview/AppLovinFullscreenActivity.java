package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.C7999k;
import com.applovin.impl.adview.C8010o;
import com.applovin.impl.adview.activity.C7892a;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p232b.C7905a;
import com.applovin.impl.adview.activity.p232b.C7931e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8562b;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenActivity extends Activity implements C7999k {
    public static C8010o parentInterstitialWrapper;

    /* renamed from: a */
    private C8490n f14561a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7905a f14562b;

    /* renamed from: c */
    private final AtomicBoolean f14563c = new AtomicBoolean(true);

    /* renamed from: d */
    private C7892a f14564d;

    /* renamed from: e */
    private C6779a f14565e;

    /* renamed from: f */
    private boolean f14566f;

    /* renamed from: com.applovin.adview.AppLovinFullscreenActivity$a */
    private static class C6779a implements OnBackInvokedCallback {

        /* renamed from: a */
        private final Runnable f14569a;

        protected C6779a(Runnable runnable) {
            this.f14569a = runnable;
        }

        public void onBackInvoked() {
            this.f14569a.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17080a() {
        C7905a aVar = this.f14562b;
        if (aVar != null) {
            aVar.mo55559l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public void dismiss() {
        if (C8571h.m26093k() && this.f14565e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f14565e);
            this.f14565e = null;
        }
        C7905a aVar = this.f14562b;
        if (aVar != null) {
            aVar.mo55555h();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        m17080a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C7905a aVar = this.f14562b;
        if (aVar != null) {
            aVar.mo55539a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                C8626v.m26257h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            C8626v.m26255f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            C8626v.m26254c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(-16777216);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            C8010o oVar = parentInterstitialWrapper;
            if (!(oVar == null || oVar.mo55771e() == null)) {
                C8010o.m23788a(parentInterstitialWrapper.mo55771e(), parentInterstitialWrapper.mo55768b(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        C8490n nVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).coreSdk;
        this.f14561a = nVar;
        this.f14566f = ((Boolean) nVar.mo57342a(C8380b.f20815cL)).booleanValue();
        if (((Boolean) this.f14561a.mo57342a(C8380b.f20816cM)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        C8562b.m26057a(this.f14566f, this);
        if (C8571h.m26093k() && ((Boolean) this.f14561a.mo57342a(C8380b.f20966fg)).booleanValue()) {
            this.f14565e = new C6779a(new Runnable() {
                public void run() {
                    AppLovinFullscreenActivity.this.m17080a();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f14565e);
        }
        C8010o oVar2 = parentInterstitialWrapper;
        if (oVar2 != null) {
            C7905a.m23400a(oVar2.mo55771e(), parentInterstitialWrapper.mo55770d(), parentInterstitialWrapper.mo55768b(), parentInterstitialWrapper.mo55769c(), this.f14561a, this, new C7905a.C7919a() {
                /* renamed from: a */
                public void mo52368a(C7905a aVar) {
                    C7905a unused = AppLovinFullscreenActivity.this.f14562b = aVar;
                    aVar.mo55551d();
                }

                /* renamed from: a */
                public void mo52369a(String str, Throwable th) {
                    C8010o.m23788a(AppLovinFullscreenActivity.parentInterstitialWrapper.mo55771e(), AppLovinFullscreenActivity.parentInterstitialWrapper.mo55768b(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        C7892a aVar = new C7892a(this, this.f14561a);
        this.f14564d = aVar;
        bindService(intent, aVar, 1);
        if (C8571h.m26090h()) {
            String str = this.f14561a.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.DISABLE_SET_DATA_DIRECTORY_SUFFIX);
            if (!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) {
                try {
                    WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        parentInterstitialWrapper = null;
        C7892a aVar = this.f14564d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        C7905a aVar2 = this.f14562b;
        if (aVar2 != null) {
            if (!aVar2.mo55556i()) {
                this.f14562b.mo55555h();
            }
            this.f14562b.mo55558k();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C7905a aVar = this.f14562b;
        if (aVar != null) {
            aVar.mo55536a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C7905a aVar = this.f14562b;
        if (aVar != null) {
            aVar.mo55554g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C7905a aVar;
        try {
            super.onResume();
            if (!this.f14563c.get() && (aVar = this.f14562b) != null) {
                aVar.mo55553f();
            }
        } catch (IllegalArgumentException e) {
            this.f14561a.mo57320D();
            if (C8626v.m26252a()) {
                this.f14561a.mo57320D().mo57819b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C8490n nVar = this.f14561a;
        if (nVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) nVar.mo57342a(C8380b.f20932eY)).booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C7905a aVar = this.f14562b;
        if (aVar != null) {
            aVar.mo55557j();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f14562b != null) {
            if (!this.f14563c.getAndSet(false) || (this.f14562b instanceof C7931e)) {
                this.f14562b.mo55550c(z);
            }
            if (z) {
                C8562b.m26057a(this.f14566f, this);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(C7905a aVar) {
        this.f14562b = aVar;
    }
}
