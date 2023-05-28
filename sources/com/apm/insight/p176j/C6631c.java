package com.apm.insight.p176j;

import android.os.Handler;
import android.text.TextUtils;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6688q;
import com.appodeal.ads.adapters.admob.BuildConfig;

/* renamed from: com.apm.insight.j.c */
public class C6631c extends C6628a {
    C6631c(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }

    public void run() {
        String str;
        if (!C6617h.m16309c().mo52324b()) {
            String d = C6617h.m16297a().mo52293d();
            if (TextUtils.isEmpty(d) || BuildConfig.ADAPTER_VERSION.equals(d)) {
                mo52114a(mo52116c());
                str = "[DeviceIdTask] did is null, continue check.";
            } else {
                C6617h.m16309c().mo52323a(d);
                str = "[DeviceIdTask] did is " + d;
            }
            C6688q.m16625a((Object) str);
        }
    }
}
