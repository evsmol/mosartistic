package com.appnext.core;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.ResultReceiver;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AdsService extends IntentService {
    public static final int ADD_PACK = 8348;
    public static final int START_APP = 8346;
    /* access modifiers changed from: private */

    /* renamed from: gf */
    public static HashMap<String, C8933n> f22492gf = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: gg */
    public Runnable f22493gg = new Runnable() {
        public final void run() {
            try {
                for (Map.Entry entry : new HashMap(AdsService.f22492gf).entrySet()) {
                    C8933n nVar = (C8933n) entry.getValue();
                    if (AdsService.this.m26802Q(nVar.f22655am)) {
                        new Bundle().putAll(nVar.f22656hz);
                        AdsService.this.mo58847a(nVar);
                        AdsService.f22492gf.remove(entry.getKey());
                        AdsService.this.startActivity(AdsService.this.getPackageManager().getLaunchIntentForPackage(nVar.f22655am));
                    }
                }
                if (AdsService.this.mHandler == null) {
                    return;
                }
                if (AdsService.f22492gf.entrySet().size() > 0) {
                    AdsService.this.mHandler.postDelayed(AdsService.this.f22493gg, 10000);
                    return;
                }
                AdsService.this.mHandler.removeCallbacksAndMessages((Object) null);
                Handler unused = AdsService.this.mHandler = null;
            } catch (Throwable unused2) {
            }
        }
    };
    /* access modifiers changed from: private */
    public Handler mHandler;
    Messenger mMessenger = new Messenger(new C8880a());

    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* renamed from: com.appnext.core.AdsService$a */
    class C8880a extends Handler {
        C8880a() {
        }

        public final void handleMessage(Message message) {
            if (message.what != 8348) {
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            AdsService.this.addPack(data.getString("package"), data, (ResultReceiver) data.getParcelable("receiver"));
            new StringBuilder("Package added: ").append(data.getString("package"));
        }
    }

    public AdsService() {
        super("AdsService");
    }

    public void onDestroy() {
        super.onDestroy();
        f22492gf.clear();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.mHandler = null;
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent.getIntExtra("added_info", 0) == 8348) {
            addPack(intent.getStringExtra("package"), intent.getExtras(), (ResultReceiver) intent.getParcelableExtra("receiver"));
            new StringBuilder("Package added: ").append(intent.getStringExtra("package"));
        }
    }

    public void addPack(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (f22492gf == null) {
            f22492gf = new HashMap<>();
        }
        if (f22492gf.containsKey(str)) {
            C8933n nVar = f22492gf.get(str);
            if (nVar == null) {
                addPack(str, bundle, resultReceiver);
                return;
            }
            nVar.f22656hz = bundle;
            f22492gf.put(str, nVar);
            return;
        }
        C8933n nVar2 = new C8933n();
        nVar2.f22655am = str;
        nVar2.f22656hz = bundle;
        f22492gf.put(str, nVar2);
        if (this.mHandler == null) {
            Handler handler = new Handler();
            this.mHandler = handler;
            handler.postDelayed(this.f22493gg, 10000);
        }
    }

    /* renamed from: a */
    private void m26805a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        C8933n nVar = f22492gf.get(str);
        if (nVar == null) {
            addPack(str, bundle, resultReceiver);
            return;
        }
        nVar.f22656hz = bundle;
        f22492gf.put(str, nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public boolean m26802Q(String str) {
        try {
            getPackageManager().getPackageInfo(str, 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo58847a(final C8933n nVar) {
        new Thread(new Runnable() {
            public final void run() {
                HashMap hashMap = new HashMap();
                hashMap.put("guid", nVar.f22656hz.getString("guid"));
                String str = "";
                hashMap.put("zone", nVar.f22656hz.getString("zone") == null ? str : nVar.f22656hz.getString("zone"));
                hashMap.put("adsID", C8917f.m26931b((Context) AdsService.this, true));
                hashMap.put("isApk", BuildConfig.ADAPTER_VERSION);
                hashMap.put("bannerid", nVar.f22656hz.getString("bannerid"));
                hashMap.put("placementid", nVar.f22656hz.getString("placementid"));
                hashMap.put("vid", nVar.f22656hz.getString("vid"));
                hashMap.put("tid", nVar.f22656hz.getString("tid", str));
                hashMap.put("osid", "100");
                hashMap.put("auid", nVar.f22656hz.getString("auid", str));
                String installerPackageName = AdsService.this.getPackageManager().getInstallerPackageName(nVar.f22655am);
                if (installerPackageName != null) {
                    str = installerPackageName;
                }
                hashMap.put("installer", str);
                try {
                    C8917f.m26919a("https://admin.appnext.com/AdminService.asmx/SetOpenV1", (HashMap<String, String>) hashMap);
                } catch (IOException unused) {
                }
            }
        }).start();
    }

    public IBinder onBind(Intent intent) {
        return this.mMessenger.getBinder();
    }
}
