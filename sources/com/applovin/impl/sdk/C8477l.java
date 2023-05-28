package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8616p;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.l */
class C8477l implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static AlertDialog f21291b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final AtomicBoolean f21292c = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8483m f21293a;

    /* renamed from: d */
    private C8616p f21294d;

    /* renamed from: com.applovin.impl.sdk.l$a */
    public interface C8482a {
        /* renamed from: a */
        void mo57307a();

        /* renamed from: b */
        void mo57308b();
    }

    C8477l(C8483m mVar, C8490n nVar) {
        this.f21293a = mVar;
        nVar.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        nVar.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: a */
    public void mo57302a(long j, final C8490n nVar, final C8482a aVar) {
        if (j > 0) {
            AlertDialog alertDialog = f21291b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                if (f21292c.getAndSet(true)) {
                    int i = (j > this.f21294d.mo57779a() ? 1 : (j == this.f21294d.mo57779a() ? 0 : -1));
                    nVar.mo57320D();
                    if (i < 0) {
                        if (C8626v.m26252a()) {
                            C8626v D = nVar.mo57320D();
                            D.mo57818b("ConsentAlertManager", "Scheduling consent alert earlier (" + j + "ms) than remaining scheduled time (" + this.f21294d.mo57779a() + "ms)");
                        }
                        this.f21294d.mo57782d();
                    } else if (C8626v.m26252a()) {
                        C8626v D2 = nVar.mo57320D();
                        D2.mo57821d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f21294d.mo57779a() + " milliseconds");
                        return;
                    } else {
                        return;
                    }
                }
                nVar.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D3 = nVar.mo57320D();
                    D3.mo57818b("ConsentAlertManager", "Scheduling consent alert for " + j + " milliseconds");
                }
                this.f21294d = C8616p.m26205a(j, nVar, new Runnable() {
                    public void run() {
                        String str;
                        C8626v vVar;
                        if (C8477l.this.f21293a.mo57312d()) {
                            nVar.mo57320D();
                            if (C8626v.m26252a()) {
                                nVar.mo57320D().mo57822e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                                return;
                            }
                            return;
                        }
                        Activity a = nVar.mo57368ai().mo56831a();
                        if (a == null || !C8572i.m26102a(nVar.mo57332P())) {
                            if (a == null) {
                                nVar.mo57320D();
                                if (C8626v.m26252a()) {
                                    vVar = nVar.mo57320D();
                                    str = "No parent Activity found - rescheduling consent alert...";
                                }
                                C8477l.f21292c.set(false);
                                C8477l.this.mo57302a(((Long) nVar.mo57342a(C8380b.f20713aO)).longValue(), nVar, aVar);
                                return;
                            }
                            nVar.mo57320D();
                            if (C8626v.m26252a()) {
                                vVar = nVar.mo57320D();
                                str = "No internet available - rescheduling consent alert...";
                            }
                            C8477l.f21292c.set(false);
                            C8477l.this.mo57302a(((Long) nVar.mo57342a(C8380b.f20713aO)).longValue(), nVar, aVar);
                            return;
                            vVar.mo57822e("ConsentAlertManager", str);
                            C8477l.f21292c.set(false);
                            C8477l.this.mo57302a(((Long) nVar.mo57342a(C8380b.f20713aO)).longValue(), nVar, aVar);
                            return;
                        }
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                AlertDialog unused = C8477l.f21291b = new AlertDialog.Builder(nVar.mo57368ai().mo56831a()).setTitle((CharSequence) nVar.mo57342a(C8380b.f20714aP)).setMessage((CharSequence) nVar.mo57342a(C8380b.f20715aQ)).setCancelable(false).setPositiveButton((CharSequence) nVar.mo57342a(C8380b.f20716aR), new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        aVar.mo57307a();
                                        dialogInterface.dismiss();
                                        C8477l.f21292c.set(false);
                                    }
                                }).setNegativeButton((CharSequence) nVar.mo57342a(C8380b.f20717aS), new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        aVar.mo57308b();
                                        dialogInterface.dismiss();
                                        C8477l.f21292c.set(false);
                                        C8477l.this.mo57302a(((Long) nVar.mo57342a(C8380b.f20712aN)).longValue(), nVar, aVar);
                                    }
                                }).create();
                                C8477l.f21291b.show();
                            }
                        });
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f21294d != null) {
            String action = intent.getAction();
            if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
                this.f21294d.mo57780b();
            } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
                this.f21294d.mo57781c();
            }
        }
    }
}
