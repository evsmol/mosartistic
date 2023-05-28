package com.applovin.impl.sdk.p253b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.b.b */
public class C8369b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8490n f20627a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Activity f20628b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AlertDialog f20629c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8376a f20630d;

    /* renamed from: com.applovin.impl.sdk.b.b$a */
    public interface C8376a {
        /* renamed from: a */
        void mo55584a();

        /* renamed from: b */
        void mo55585b();
    }

    public C8369b(Activity activity, C8490n nVar) {
        this.f20627a = nVar;
        this.f20628b = activity;
    }

    /* renamed from: a */
    public void mo57066a() {
        this.f20628b.runOnUiThread(new Runnable() {
            public void run() {
                if (C8369b.this.f20629c != null) {
                    C8369b.this.f20629c.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo57067a(final C8350e eVar, final Runnable runnable) {
        this.f20628b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C8369b.this.f20628b);
                builder.setTitle(eVar.mo56999an());
                String ao = eVar.mo57000ao();
                if (AppLovinSdkUtils.isValidString(ao)) {
                    builder.setMessage(ao);
                }
                builder.setPositiveButton(eVar.mo57001ap(), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setCancelable(false);
                AlertDialog unused = C8369b.this.f20629c = builder.show();
            }
        });
    }

    /* renamed from: a */
    public void mo57068a(C8376a aVar) {
        this.f20630d = aVar;
    }

    /* renamed from: b */
    public void mo57069b() {
        this.f20628b.runOnUiThread(new Runnable() {
            public void run() {
                AlertDialog unused = C8369b.this.f20629c = new AlertDialog.Builder(C8369b.this.f20628b).setTitle((CharSequence) C8369b.this.f20627a.mo57342a(C8380b.f20756bE)).setMessage((CharSequence) C8369b.this.f20627a.mo57342a(C8380b.f20757bF)).setCancelable(false).setPositiveButton((CharSequence) C8369b.this.f20627a.mo57342a(C8380b.f20759bH), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C8369b.this.f20630d.mo55584a();
                    }
                }).setNegativeButton((CharSequence) C8369b.this.f20627a.mo57342a(C8380b.f20758bG), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C8369b.this.f20630d.mo55585b();
                    }
                }).show();
            }
        });
    }

    /* renamed from: c */
    public boolean mo57070c() {
        AlertDialog alertDialog = this.f20629c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
