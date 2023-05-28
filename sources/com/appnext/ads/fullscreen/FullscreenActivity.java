package com.appnext.ads.fullscreen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appnext.C8663R;
import com.appnext.ads.C8668a;
import com.appnext.ads.C8670b;
import com.appnext.ads.C8671c;
import com.appnext.base.p264b.C8850d;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C8874Ad;
import com.appnext.core.C8906e;
import com.appnext.core.C8917f;
import com.appnext.core.C8925j;
import com.appnext.core.C8936p;
import com.appnext.core.C8940q;
import com.appnext.core.p267a.C8894b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public class FullscreenActivity extends AppnextActivity implements C8721h, C8722i, C8723j, C8906e.C8915a {

    /* renamed from: aB */
    private C8936p f22049aB;

    /* renamed from: aC */
    private boolean f22050aC = true;
    /* access modifiers changed from: private */

    /* renamed from: aD */
    public AppnextAd f22051aD;
    /* access modifiers changed from: private */

    /* renamed from: aE */
    public AppnextAd f22052aE;

    /* renamed from: aF */
    C8670b f22053aF;

    /* renamed from: aG */
    private HashMap<String, Integer> f22054aG;

    /* renamed from: aH */
    private Video f22055aH;

    /* renamed from: aI */
    Runnable f22056aI = new Runnable() {
        public final void run() {
            if (FullscreenActivity.this.userAction != null) {
                FullscreenActivity.this.userAction.mo59061e(FullscreenActivity.this.f22051aD);
            }
            FullscreenActivity.this.report(C8668a.f21982G, "S2");
        }
    };

    /* renamed from: aJ */
    Runnable f22057aJ = new Runnable() {
        public final void run() {
            FullscreenActivity fullscreenActivity = FullscreenActivity.this;
            fullscreenActivity.mo58227a(fullscreenActivity.f22051aD, (C8906e.C8915a) null);
            FullscreenActivity.this.report(C8668a.f21983H, "S2");
        }
    };
    private ArrayList<AppnextAd> ads;
    private boolean finished = false;
    private Handler mHandler;
    private int state = 0;
    private int type;

    /* renamed from: c */
    private static void m26352c() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        if (bundle != null) {
            this.f22054aG = (HashMap) bundle.getSerializable("templates");
            this.state = bundle.getInt("state");
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = getResources().getConfiguration();
            configuration.setLayoutDirection(new Locale("en"));
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
        super.onCreate(bundle);
        if (Video.currentAd == null) {
            onError(AppnextError.NO_ADS);
            finish();
            return;
        }
        if (Video.currentAd instanceof RewardedVideo) {
            this.f22055aH = new RewardedVideo((Context) this, (RewardedVideo) Video.currentAd);
        } else {
            this.f22055aH = new FullScreenVideo((Context) this, (FullScreenVideo) Video.currentAd);
        }
        String orientation = m26353d().getOrientation();
        char c = 65535;
        switch (orientation.hashCode()) {
            case 729267099:
                if (orientation.equals("portrait")) {
                    c = 3;
                    break;
                }
                break;
            case 1430647483:
                if (orientation.equals("landscape")) {
                    c = 2;
                    break;
                }
                break;
            case 1673671211:
                if (orientation.equals(C8874Ad.ORIENTATION_AUTO)) {
                    c = 1;
                    break;
                }
                break;
            case 2129065206:
                if (orientation.equals(C8874Ad.ORIENTATION_DEFAULT)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            if (getResources().getConfiguration().orientation == 2) {
                setRequestedOrientation(6);
            } else {
                setRequestedOrientation(7);
            }
        } else if (c == 2) {
            setRequestedOrientation(6);
        } else if (c == 3) {
            setRequestedOrientation(7);
        }
        this.mHandler = new Handler();
        this.placementID = getIntent().getExtras().getString("id");
        int i = getIntent().getExtras().getInt("type");
        this.type = i;
        if (i == 1) {
            this.f22049aB = C8686c.m26400m();
        } else {
            this.f22049aB = C8704f.m26418q();
        }
        this.f22050aC = Boolean.parseBoolean(this.f22049aB.get("can_close"));
        if (m26353d() instanceof FullScreenVideo) {
            this.f22050aC = ((FullScreenVideo) m26353d()).isBackButtonCanClose();
        }
        String str = "";
        if (bundle == null) {
            ArrayList<AppnextAd> f = C8684b.m26383j().mo58368f(m26353d());
            this.ads = f;
            if (f == null) {
                onError(AppnextError.NO_ADS);
                finish();
                return;
            }
            this.f22051aD = mo58226a(f, this.placementID, str);
        } else {
            this.ads = (ArrayList) bundle.getSerializable("ads");
            this.f22051aD = (AppnextAd) bundle.getSerializable("currentAd");
        }
        if (this.f22051aD == null) {
            onError(AppnextError.NO_ADS);
            finish();
            return;
        }
        setContentView(C8663R.layout.apnxt_video_activity);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            if (m26353d() instanceof RewardedVideo) {
                str = ((RewardedVideo) m26353d()).getMode();
            }
            if (str.equals(RewardedVideo.VIDEO_MODE_DEFAULT)) {
                str = getConfig().get("default_mode");
            }
            if (this.type != 2 || !str.equals("multi")) {
                if (this.type == 2) {
                    report("normal");
                }
                fragment = new C8705g();
                bundle2.putBoolean("showCta", m26353d().isShowCta());
                this.state = 1;
            } else {
                fragment = new C8696e();
                bundle2.putInt(C8850d.f22432fl, ((RewardedVideo) m26353d()).getMultiTimerLength());
                report("multi");
            }
            fragment.setArguments(bundle2);
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.add(C8663R.C8666id.f21965ll, fragment, "fragment");
            try {
                beginTransaction.commit();
            } catch (Exception unused) {
                finish();
                return;
            }
        } else {
            this.finished = bundle.getBoolean("finished", true);
        }
        this.f22500gl = (RelativeLayout) findViewById(C8663R.C8666id.f21965ll);
        this.userAction = new C8940q(this, new C8940q.C8949a() {
            public final void report(String str) {
                FullscreenActivity.this.report(str);
            }

            /* renamed from: e */
            public final C8874Ad mo58261e() {
                return Video.currentAd;
            }

            /* renamed from: f */
            public final AppnextAd mo58262f() {
                return FullscreenActivity.this.f22052aE;
            }

            /* renamed from: g */
            public final C8936p mo58263g() {
                return FullscreenActivity.this.getConfig();
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onError(String str) {
        if (m26353d() != null && m26353d().getOnAdErrorCallback() != null) {
            m26353d().getOnAdErrorCallback().adError(str);
        }
    }

    /* access modifiers changed from: protected */
    public final C8936p getConfig() {
        if (this.f22049aB == null) {
            if (this.type == 1) {
                this.f22049aB = C8686c.m26400m();
            } else {
                this.f22049aB = C8704f.m26418q();
            }
        }
        return this.f22049aB;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58227a(AppnextAd appnextAd, C8906e.C8915a aVar) {
        super.mo58227a(appnextAd, (C8906e.C8915a) new C8906e.C8915a() {
            public final void error(String str) {
            }

            public final void onMarket(String str) {
            }
        });
    }

    /* renamed from: a */
    private Uri m26342a() {
        String str;
        String videoUrl = C8684b.getVideoUrl(this.f22051aD, m26353d().getVideoLength());
        String c = C8684b.m26381c(videoUrl);
        if (Video.getCacheVideo()) {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
        } else {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + m26353d().rnd + "/";
        }
        File file = new File(str + c);
        if (file.exists()) {
            Uri parse = Uri.parse(str + c);
            new StringBuilder("playing video ").append(parse.getPath());
            return parse;
        }
        Uri parse2 = Uri.parse(videoUrl);
        new StringBuilder("playing video from web: ").append(videoUrl);
        new StringBuilder("file not found: ").append(file.getAbsolutePath());
        return parse2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("finished", this.finished);
        bundle.putInt("type", this.type);
        bundle.putSerializable("templates", this.f22054aG);
        bundle.putSerializable("ads", this.ads);
        bundle.putInt("state", this.state);
        bundle.putSerializable("currentAd", this.f22051aD);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.finished = bundle.getBoolean("finished", true);
        this.type = bundle.getInt("type");
        this.f22054aG = (HashMap) bundle.getSerializable("templates");
    }

    /* renamed from: b */
    private boolean m26349b() {
        return m26353d().isBackButtonCanClose();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacks(this.f22056aI);
        this.mHandler.removeCallbacks(this.f22057aJ);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility() | 2;
        if (Build.VERSION.SDK_INT >= 16) {
            systemUiVisibility |= 4;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            systemUiVisibility |= 4096;
        }
        getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|5|6|(1:8)|9|10|11|(1:13)|14|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[Catch:{ all -> 0x0052 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r4 = this;
            super.onDestroy()
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.io.File r2 = r4.getFilesDir()     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0037 }
            r1.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "/data/appnext/videos/"
            r1.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "tmp/vid"
            r1.append(r2)     // Catch:{ all -> 0x0037 }
            com.appnext.ads.fullscreen.Video r2 = r4.m26353d()     // Catch:{ all -> 0x0037 }
            long r2 = r2.rnd     // Catch:{ all -> 0x0037 }
            r1.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0037 }
            r0.<init>(r1)     // Catch:{ all -> 0x0037 }
            com.appnext.core.C8917f.m26925a((java.io.File) r0)     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = 0
            android.os.Handler r1 = r4.mHandler     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0041
            android.os.Handler r1 = r4.mHandler     // Catch:{ all -> 0x0047 }
            r1.removeCallbacksAndMessages(r0)     // Catch:{ all -> 0x0047 }
        L_0x0041:
            r4.mHandler = r0     // Catch:{ all -> 0x0047 }
            r4.f22052aE = r0     // Catch:{ all -> 0x0047 }
            r4.f22051aD = r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            com.appnext.ads.b r1 = r4.f22053aF     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0050
            com.appnext.ads.b r1 = r4.f22053aF     // Catch:{ all -> 0x0052 }
            r1.mo58213a((android.content.Context) r4)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            r4.f22053aF = r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.fullscreen.FullscreenActivity.onDestroy():void");
    }

    /* renamed from: a */
    private void m26345a(AppnextAd appnextAd) {
        mo58228b(appnextAd, (C8906e.C8915a) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58228b(AppnextAd appnextAd, C8906e.C8915a aVar) {
        if (appnextAd != null) {
            this.f22052aE = appnextAd;
            if (m26353d().getOnAdClickedCallback() != null) {
                m26353d().getOnAdClickedCallback().adClicked();
            }
            if (this.finished || !(m26353d() instanceof RewardedVideo)) {
                super.mo58228b(appnextAd, aVar);
            }
        }
    }

    public void onMarket(String str) {
        mo58859ba();
        this.finished = true;
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f22051aD);
        this.ads.add(0, this.f22051aD);
        C8687d dVar = new C8687d();
        this.state = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C8663R.C8666id.f21965ll, dVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Exception unused) {
            finish();
        }
    }

    public void error(String str) {
        mo58859ba();
        report(C8668a.f21976A);
    }

    private void onClose() {
        try {
            C8684b.m26383j().mo58360a(this.f22051aD.getBannerID(), (C8874Ad) m26353d());
            if (!(m26353d() == null || m26353d().getOnAdClosedCallback() == null)) {
                m26353d().getOnAdClosedCallback().onAdClosed();
            }
            Video.currentAd = null;
        } catch (Throwable unused) {
        }
    }

    public void videoStarted() {
        this.mHandler.postDelayed(this.f22056aI, Long.parseLong(this.f22049aB.get("postpone_impression_sec")) * 1000);
        if (Boolean.parseBoolean(this.f22049aB.get("pview"))) {
            this.mHandler.postDelayed(this.f22057aJ, Long.parseLong(this.f22049aB.get("postpone_vta_sec")) * 1000);
        }
        if (m26353d() != null && m26353d().getOnAdOpenedCallback() != null) {
            m26353d().getOnAdOpenedCallback().adOpened();
        }
    }

    public void videoEnded() {
        this.state = 2;
        this.finished = true;
        if (!(m26353d() == null || m26353d().getOnVideoEndedCallback() == null)) {
            m26353d().getOnVideoEndedCallback().videoEnded();
        }
        new Thread(new Runnable() {
            public final void run() {
                RewardedServerSidePostback rewardedServerSidePostback;
                if ((FullscreenActivity.this.m26353d() instanceof RewardedVideo) && (rewardedServerSidePostback = ((RewardedVideo) FullscreenActivity.this.m26353d()).getRewardedServerSidePostback()) != null) {
                    HashMap<String, String> p = rewardedServerSidePostback.mo58292p();
                    p.put("placementId", FullscreenActivity.this.placementID);
                    try {
                        C8917f.m26919a("https://admin.appnext.com/adminService.asmx/SetRewards", p);
                    } catch (IOException unused) {
                    }
                }
            }
        }).start();
        Collections.shuffle(this.ads, new Random(System.nanoTime()));
        this.ads.remove(this.f22051aD);
        this.ads.add(0, this.f22051aD);
        C8687d dVar = new C8687d();
        this.state = 2;
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(C8663R.C8666id.f21965ll, dVar, "fragment");
        try {
            beginTransaction.commit();
            AppnextAd appnextAd = this.f22052aE;
            if (appnextAd != null) {
                super.mo58228b(appnextAd, this);
                report(C8668a.f21992Q);
                return;
            }
            report(C8668a.f21991P);
            if (Integer.parseInt(getConfig().get("clickType_b")) > new Random(System.nanoTime()).nextInt(100)) {
                installClicked(getSelectedAd());
            }
        } catch (Exception unused) {
            finish();
        }
    }

    public void videoSelected(AppnextAd appnextAd) {
        this.f22051aD = appnextAd;
        C8705g gVar = new C8705g();
        FragmentManager fragmentManager = getFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showCta", m26353d().isShowCta());
        gVar.setArguments(bundle);
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.replace(C8663R.C8666id.f21965ll, gVar, "fragment");
        try {
            beginTransaction.commit();
        } catch (Exception unused) {
            finish();
        }
    }

    public ArrayList<AppnextAd> getPreRollAds() {
        if (this.ads == null) {
            this.ads = C8684b.m26383j().mo58368f(m26353d());
        }
        ArrayList<AppnextAd> arrayList = new ArrayList<>();
        AppnextAd a = mo58226a(this.ads, this.placementID, "");
        arrayList.add(a);
        AppnextAd a2 = mo58226a(this.ads, this.placementID, a.getBannerID());
        if (a2 != null && !a2.getBannerID().equals(arrayList.get(0).getBannerID())) {
            arrayList.add(a2);
        }
        return arrayList;
    }

    public void privacyClicked() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C8917f.m26948g(this.f22051aD)));
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public void installClicked(AppnextAd appnextAd) {
        if (this.state == 1 && !isRewarded()) {
            mo58856a((ViewGroup) this.f22500gl, getResources().getDrawable(C8663R.C8665drawable.apnxt_loader));
        }
        mo58228b(appnextAd, (C8906e.C8915a) this);
    }

    public void closeClicked() {
        if (this.state != 1 || isRewarded() || Integer.parseInt(getConfig().get("clickType_a")) <= new Random(System.nanoTime()).nextInt(100)) {
            onClose();
            finish();
            return;
        }
        installClicked(getSelectedAd());
    }

    public AppnextAd getSelectedAd() {
        return this.f22051aD;
    }

    public boolean showClose() {
        return (m26353d() instanceof FullScreenVideo) && ((FullScreenVideo) m26353d()).isShowClose();
    }

    public C8936p getConfigManager() {
        return getConfig();
    }

    public int getTemplate(String str) {
        if (this.f22054aG == null) {
            this.f22054aG = new HashMap<>();
        }
        if (!this.f22054aG.containsKey(str)) {
            String a = C8671c.m26340a(getConfig().get(str));
            Resources resources = getResources();
            int identifier = resources.getIdentifier("apnxt_" + a, "layout", getPackageName());
            if (identifier == 0) {
                Resources resources2 = getResources();
                identifier = resources2.getIdentifier("apnxt_" + str.toLowerCase() + "t1", "layout", getPackageName());
            }
            this.f22054aG.put(str, Integer.valueOf(identifier));
        }
        return this.f22054aG.get(str).intValue();
    }

    public boolean getMute() {
        return m26353d().getMute();
    }

    public void report(String str, String str2) {
        m26348b(str, getResources().getResourceEntryName(getTemplate(str2)));
    }

    public ArrayList<AppnextAd> getPostRollAds() {
        return this.ads;
    }

    public boolean isRewarded() {
        return m26353d() instanceof RewardedVideo;
    }

    public String getLanguage() {
        return this.f22055aH.getLanguage();
    }

    public String getCtaText() {
        String buttonText = new FullscreenAd(this.f22051aD).getButtonText();
        AppnextAd appnextAd = this.f22051aD;
        String str = C8894b.f22529hY;
        if (appnextAd == null || !buttonText.equals("")) {
            C8894b bp = C8894b.m26842bp();
            String language = this.f22055aH.getLanguage();
            if (!isInstalled()) {
                str = C8894b.f22528hX;
            }
            return bp.mo58969b(language, str, buttonText);
        } else if (isInstalled()) {
            return C8894b.m26842bp().mo58969b(this.f22055aH.getLanguage(), str, "Open");
        } else {
            return C8894b.m26842bp().mo58969b(this.f22055aH.getLanguage(), C8894b.f22528hX, "Install");
        }
    }

    public boolean isInstalled() {
        try {
            return C8917f.m26946c(this, this.f22051aD.getAdPackage());
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getCaptionTextTime() {
        return m26353d().getRollCaptionTime();
    }

    public long closeDelay() {
        if (m26353d() instanceof FullScreenVideo) {
            return ((FullScreenVideo) m26353d()).getCloseDelay();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AppnextAd mo58226a(ArrayList<AppnextAd> arrayList, String str, String str2) {
        Iterator<AppnextAd> it = arrayList.iterator();
        while (it.hasNext()) {
            AppnextAd next = it.next();
            if (m26350b(next) && !m26346a(next.getBannerID(), str) && !next.getBannerID().equals(str2)) {
                return next;
            }
        }
        C8925j.m26963bj().mo59029ab(str);
        Iterator<AppnextAd> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AppnextAd next2 = it2.next();
            if (m26350b(next2) && !m26346a(next2.getBannerID(), str)) {
                return next2;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static boolean m26346a(String str, String str2) {
        return C8925j.m26963bj().mo59033o(str, str2);
    }

    /* renamed from: b */
    private static boolean m26350b(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        Resources resources = getResources();
        m26348b(str, resources.getResourceEntryName(getTemplate("S" + (this.state + 1))));
    }

    /* renamed from: b */
    private void m26348b(String str, String str2) {
        try {
            C8917f.m26926a(m26353d().getTID(), m26353d().getVID(), m26353d().getAUID(), this.placementID, m26353d().getSessionId(), str, str2, this.f22051aD != null ? this.f22051aD.getBannerID() : "", this.f22051aD != null ? this.f22051aD.getCampaignID() : "");
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Video m26353d() {
        if (Video.currentAd != null) {
            return Video.currentAd;
        }
        return this.f22055aH;
    }

    public void onBackPressed() {
        if (m26353d().isBackButtonCanClose()) {
            onClose();
            super.onBackPressed();
        }
    }

    public Uri getSelectedVideoUri() {
        String str;
        String videoUrl = C8684b.getVideoUrl(this.f22051aD, m26353d().getVideoLength());
        String c = C8684b.m26381c(videoUrl);
        if (Video.getCacheVideo()) {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/";
        } else {
            str = getFilesDir().getAbsolutePath() + "/data/appnext/videos/" + "tmp/vid" + m26353d().rnd + "/";
        }
        File file = new File(str + c);
        if (file.exists()) {
            Uri parse = Uri.parse(str + c);
            new StringBuilder("playing video ").append(parse.getPath());
            return parse;
        }
        Uri parse2 = Uri.parse(videoUrl);
        new StringBuilder("playing video from web: ").append(videoUrl);
        new StringBuilder("file not found: ").append(file.getAbsolutePath());
        return parse2;
    }
}
