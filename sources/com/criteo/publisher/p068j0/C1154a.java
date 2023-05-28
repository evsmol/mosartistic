package com.criteo.publisher.p068j0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.criteo.publisher.CriteoInterstitialActivity;
import com.criteo.publisher.p059a0.C1019b;
import com.criteo.publisher.p072m0.C1217d;
import com.criteo.publisher.p074n0.C1305i;

/* renamed from: com.criteo.publisher.j0.a */
/* compiled from: InterstitialActivityHelper */
public class C1154a {

    /* renamed from: a */
    private final Context f3666a;

    /* renamed from: b */
    private final C1019b f3667b;

    public C1154a(Context context, C1019b bVar) {
        this.f3666a = context;
        this.f3667b = bVar;
    }

    /* renamed from: b */
    public boolean mo3252b() {
        if (this.f3666a.getPackageManager().resolveActivity(m5285a(), 65536) == null || this.f3666a.getResources().getIdentifier("activity_criteo_interstitial", "layout", this.f3666a.getPackageName()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo3251a(String str, C1217d dVar) {
        if (mo3252b()) {
            C1305i a = mo3250a(dVar);
            ComponentName a2 = this.f3667b.mo2996a();
            Intent a3 = m5285a();
            a3.setFlags(268435456);
            a3.putExtra("webviewdata", str);
            a3.putExtra("resultreceiver", a);
            a3.putExtra("callingactivity", a2);
            this.f3666a.startActivity(a3);
        }
    }

    /* renamed from: a */
    private Intent m5285a() {
        return new Intent(this.f3666a, CriteoInterstitialActivity.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1305i mo3250a(C1217d dVar) {
        return new C1305i(new Handler(Looper.getMainLooper()), dVar);
    }
}
