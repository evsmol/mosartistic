package com.explorestack.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.measurer.VastAdMeasurer;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.C1462c;
import com.explorestack.iab.vast.VastActivityListener;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VastPlaybackListener;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.activity.VastView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class VastActivity extends Activity {

    /* renamed from: g */
    public static final Map<String, WeakReference<VastActivityListener>> f4401g = new HashMap();

    /* renamed from: h */
    public static WeakReference<VastPlaybackListener> f4402h;

    /* renamed from: i */
    public static WeakReference<VastAdMeasurer> f4403i;

    /* renamed from: j */
    public static final String f4404j = VastActivity.class.getSimpleName();

    /* renamed from: a */
    public VastRequest f4405a;

    /* renamed from: b */
    public VastView f4406b;

    /* renamed from: c */
    public VastActivityListener f4407c;

    /* renamed from: d */
    public boolean f4408d;

    /* renamed from: e */
    public boolean f4409e;

    /* renamed from: f */
    public final VastView.VastViewListener f4410f = new C1423a();

    public static class Builder {

        /* renamed from: a */
        public VastRequest f4411a;

        /* renamed from: b */
        public VastActivityListener f4412b;

        /* renamed from: c */
        public VastPlaybackListener f4413c;

        /* renamed from: d */
        public VastAdMeasurer f4414d;

        /* renamed from: a */
        public Intent mo4253a(Context context) {
            Intent intent = new Intent(context, VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        public boolean display(Context context) {
            VastRequest vastRequest = this.f4411a;
            if (vastRequest == null) {
                VastLog.m6350a("VastRequest not provided");
                return false;
            }
            try {
                C1462c.m6524b(vastRequest);
                Intent a = mo4253a(context);
                a.putExtra("vast_request_id", this.f4411a.getId());
                VastActivityListener vastActivityListener = this.f4412b;
                if (vastActivityListener != null) {
                    VastActivity.m6391b(this.f4411a, vastActivityListener);
                }
                if (this.f4413c != null) {
                    WeakReference unused = VastActivity.f4402h = new WeakReference(this.f4413c);
                } else {
                    WeakReference unused2 = VastActivity.f4402h = null;
                }
                if (this.f4414d != null) {
                    WeakReference unused3 = VastActivity.f4403i = new WeakReference(this.f4414d);
                } else {
                    WeakReference unused4 = VastActivity.f4403i = null;
                }
                context.startActivity(a);
                return true;
            } catch (Throwable th) {
                VastLog.m6353a(VastActivity.f4404j, th);
                VastActivity.m6393d(this.f4411a);
                WeakReference unused5 = VastActivity.f4402h = null;
                WeakReference unused6 = VastActivity.f4403i = null;
                return false;
            }
        }

        public Builder setAdMeasurer(VastAdMeasurer vastAdMeasurer) {
            this.f4414d = vastAdMeasurer;
            return this;
        }

        public Builder setListener(VastActivityListener vastActivityListener) {
            this.f4412b = vastActivityListener;
            return this;
        }

        public Builder setPlaybackListener(VastPlaybackListener vastPlaybackListener) {
            this.f4413c = vastPlaybackListener;
            return this;
        }

        public Builder setRequest(VastRequest vastRequest) {
            this.f4411a = vastRequest;
            return this;
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastActivity$a */
    public class C1423a implements VastView.VastViewListener {
        public C1423a() {
        }

        public void onClick(VastView vastView, VastRequest vastRequest, IabClickCallback iabClickCallback, String str) {
            if (VastActivity.this.f4407c != null) {
                VastActivity.this.f4407c.onVastClick(VastActivity.this, vastRequest, iabClickCallback, str);
            }
        }

        public void onComplete(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f4407c != null) {
                VastActivity.this.f4407c.onVastComplete(VastActivity.this, vastRequest);
            }
        }

        public void onError(VastView vastView, VastRequest vastRequest, int i) {
            VastActivity.this.mo4245a(vastRequest, i);
        }

        public void onFinish(VastView vastView, VastRequest vastRequest, boolean z) {
            VastActivity.this.mo4246a(vastRequest, z);
        }

        public void onOrientationRequested(VastView vastView, VastRequest vastRequest, int i) {
            int forceOrientation = vastRequest.getForceOrientation();
            if (forceOrientation > -1) {
                i = forceOrientation;
            }
            VastActivity.this.mo4244a(i);
        }

        public void onShown(VastView vastView, VastRequest vastRequest) {
            if (VastActivity.this.f4407c != null) {
                VastActivity.this.f4407c.onVastShown(VastActivity.this, vastRequest);
            }
        }
    }

    /* renamed from: b */
    public static void m6391b(VastRequest vastRequest, VastActivityListener vastActivityListener) {
        f4401g.put(vastRequest.getId(), new WeakReference(vastActivityListener));
    }

    /* renamed from: c */
    public static VastActivityListener m6392c(VastRequest vastRequest) {
        Map<String, WeakReference<VastActivityListener>> map = f4401g;
        WeakReference weakReference = map.get(vastRequest.getId());
        if (weakReference != null && weakReference.get() != null) {
            return (VastActivityListener) weakReference.get();
        }
        map.remove(vastRequest.getId());
        return null;
    }

    /* renamed from: d */
    public static void m6393d(VastRequest vastRequest) {
        f4401g.remove(vastRequest.getId());
    }

    /* renamed from: a */
    public final void mo4244a(int i) {
        setRequestedOrientation(i == 1 ? 7 : i == 2 ? 6 : 4);
    }

    /* renamed from: a */
    public final void mo4245a(VastRequest vastRequest, int i) {
        VastActivityListener vastActivityListener = this.f4407c;
        if (vastActivityListener != null) {
            vastActivityListener.onVastError(this, vastRequest, i);
        }
    }

    /* renamed from: a */
    public final void mo4246a(VastRequest vastRequest, boolean z) {
        VastActivityListener vastActivityListener = this.f4407c;
        if (vastActivityListener != null && !this.f4409e) {
            vastActivityListener.onVastDismiss(this, vastRequest, z);
        }
        this.f4409e = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e) {
            VastLog.m6350a(e.getMessage());
        }
        if (vastRequest != null) {
            mo4244a(vastRequest.getRequestedOrientation());
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    public final void mo4247a(VastView vastView) {
        Utils.applyFullscreenActivityFlags(this);
        setContentView(vastView);
    }

    /* renamed from: b */
    public final Integer mo4248b(VastRequest vastRequest) {
        int forceOrientation = vastRequest.getForceOrientation();
        if (forceOrientation > -1) {
            return Integer.valueOf(forceOrientation);
        }
        int preferredVideoOrientation = vastRequest.getPreferredVideoOrientation();
        if (preferredVideoOrientation == 0 || preferredVideoOrientation == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(preferredVideoOrientation);
    }

    public void onBackPressed() {
        VastView vastView = this.f4406b;
        if (vastView != null) {
            vastView.handleBackPress();
        }
    }

    public void onCreate(Bundle bundle) {
        Integer b;
        getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.f4405a = C1462c.m6523a(getIntent().getStringExtra("vast_request_id"));
        if (bundle == null || !bundle.getBoolean("isFinishedPerformed")) {
            VastRequest vastRequest = this.f4405a;
            if (vastRequest == null) {
                mo4245a((VastRequest) null, (int) TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE);
                mo4246a((VastRequest) null, false);
                return;
            }
            if (bundle == null && (b = mo4248b(vastRequest)) != null) {
                mo4244a(b.intValue());
                try {
                    if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            this.f4407c = m6392c(this.f4405a);
            VastView vastView = new VastView(this);
            this.f4406b = vastView;
            vastView.setId(1);
            this.f4406b.setListener(this.f4410f);
            WeakReference<VastPlaybackListener> weakReference = f4402h;
            if (weakReference != null) {
                this.f4406b.setPlaybackListener((VastPlaybackListener) weakReference.get());
            }
            WeakReference<VastAdMeasurer> weakReference2 = f4403i;
            if (weakReference2 != null) {
                this.f4406b.setAdMeasurer((VastAdMeasurer) weakReference2.get());
            }
            if (bundle == null || !bundle.getBoolean("isLoadPerformed")) {
                this.f4408d = true;
                if (!this.f4406b.display(this.f4405a, Boolean.TRUE)) {
                    return;
                }
            }
            mo4247a(this.f4406b);
            return;
        }
        finish();
    }

    public void onDestroy() {
        VastRequest vastRequest;
        super.onDestroy();
        if (!isChangingConfigurations() && (vastRequest = this.f4405a) != null) {
            VastView vastView = this.f4406b;
            mo4246a(vastRequest, vastView != null && vastView.isFinished());
            VastView vastView2 = this.f4406b;
            if (vastView2 != null) {
                vastView2.destroy();
            }
            m6393d(this.f4405a);
            f4402h = null;
            f4403i = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f4408d);
        bundle.putBoolean("isFinishedPerformed", this.f4409e);
    }
}
