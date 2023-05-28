package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Window;
import com.explorestack.iab.utils.Utils;

public class MraidActivity extends Activity {

    /* renamed from: d */
    public static final SparseArray<MraidInterstitial> f4068d = new SparseArray<>();

    /* renamed from: a */
    public Integer f4069a;

    /* renamed from: b */
    public MraidInterstitial f4070b;

    /* renamed from: c */
    public boolean f4071c = false;

    /* renamed from: com.explorestack.iab.mraid.MraidActivity$a */
    public static /* synthetic */ class C1339a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4072a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.iab.mraid.MraidType[] r0 = com.explorestack.iab.mraid.MraidType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4072a = r0
                com.explorestack.iab.mraid.MraidType r1 = com.explorestack.iab.mraid.MraidType.Static     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4072a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.mraid.MraidType r1 = com.explorestack.iab.mraid.MraidType.Video     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4072a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.mraid.MraidType r1 = com.explorestack.iab.mraid.MraidType.Rewarded     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.MraidActivity.C1339a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Intent m5964a(Context context, MraidType mraidType, int i) {
        Intent a = m5965a(context, MraidActivity.class, mraidType, i);
        a.addFlags(268435456);
        a.addFlags(8388608);
        return a;
    }

    /* renamed from: a */
    public static Intent m5965a(Context context, Class<?> cls, MraidType mraidType, int i) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("InterstitialId", i);
        intent.putExtra("InterstitialType", mraidType);
        return intent;
    }

    /* renamed from: a */
    public static void m5966a(MraidInterstitial mraidInterstitial) {
        f4068d.put(mraidInterstitial.f4084id, mraidInterstitial);
    }

    /* renamed from: a */
    public static void m5967a(Integer num) {
        if (num != null) {
            f4068d.remove(num.intValue());
        }
    }

    public static void show(Context context, MraidInterstitial mraidInterstitial, MraidType mraidType) {
        if (mraidInterstitial == null) {
            MraidLog.m5981a("Mraid interstitial object not provided for display");
        } else if (context == null) {
            MraidLog.m5981a("Context not provided for display mraid interstitial");
            mraidInterstitial.mo3759d();
        } else if (mraidType == null) {
            MraidLog.m5981a("Mraid type not provided for display");
            mraidInterstitial.mo3759d();
        } else {
            try {
                m5966a(mraidInterstitial);
                context.startActivity(m5964a(context, mraidType, mraidInterstitial.f4084id));
            } catch (Throwable th) {
                th.printStackTrace();
                mraidInterstitial.mo3759d();
                m5967a(Integer.valueOf(mraidInterstitial.f4084id));
            }
        }
    }

    /* renamed from: a */
    public final void mo3747a() {
        MraidInterstitial mraidInterstitial = this.f4070b;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.f4070b = null;
        }
        m5967a(this.f4069a);
    }

    public void onBackPressed() {
        if (this.f4071c) {
            MraidInterstitial mraidInterstitial = this.f4070b;
            if (mraidInterstitial != null) {
                mraidInterstitial.dispatchClose();
            } else {
                Utils.finishActivityWithoutAnimation(this);
            }
        }
    }

    public void onBeforeCreate(Window window) {
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
    }

    public void onBeforeShowContent() {
        Utils.applyFullscreenActivityFlags(this);
    }

    public void onCreate(Bundle bundle) {
        onBeforeCreate(getWindow());
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            MraidLog.m5981a("Mraid display cache id not provided");
            Utils.finishActivityWithoutAnimation(this);
            return;
        }
        Integer valueOf = Integer.valueOf(getIntent().getIntExtra("InterstitialId", 0));
        this.f4069a = valueOf;
        MraidInterstitial mraidInterstitial = f4068d.get(valueOf.intValue());
        this.f4070b = mraidInterstitial;
        if (mraidInterstitial == null) {
            MraidLog.m5981a("Mraid interstitial not found in display cache, id=" + this.f4069a);
            Utils.finishActivityWithoutAnimation(this);
            return;
        }
        MraidType mraidType = (MraidType) getIntent().getSerializableExtra("InterstitialType");
        if (mraidType == null) {
            MraidLog.m5981a("Mraid type not provided");
            Utils.finishActivityWithoutAnimation(this);
            this.f4070b.mo3759d();
            return;
        }
        onBeforeShowContent();
        int i = C1339a.f4072a[mraidType.ordinal()];
        if (i == 1 || i == 2) {
            this.f4071c = true;
        } else if (i == 3) {
            this.f4071c = false;
        }
        try {
            this.f4070b.mo3755a((Activity) this, false);
        } catch (Exception e) {
            MraidLog.m5983a("Error showing Mraid interstitial", (Throwable) e);
            Utils.finishActivityWithoutAnimation(this);
            this.f4070b.mo3759d();
            mo3747a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f4070b != null && !isChangingConfigurations()) {
            this.f4070b.mo3757c();
            mo3747a();
        }
    }
}
