package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C6617h;
import com.appodeal.ads.adapters.admob.BuildConfig;

/* renamed from: com.apm.insight.runtime.t */
public final class C6769t {

    /* renamed from: a */
    private String f14544a = null;

    /* renamed from: b */
    private int f14545b = -1;

    public C6769t(Context context) {
    }

    /* renamed from: a */
    public String mo52322a() {
        if (!TextUtils.isEmpty(this.f14544a) && !BuildConfig.ADAPTER_VERSION.equals(this.f14544a)) {
            return this.f14544a;
        }
        String d = C6617h.m16297a().mo52293d();
        this.f14544a = d;
        if (!TextUtils.isEmpty(d) && !BuildConfig.ADAPTER_VERSION.equals(this.f14544a)) {
            return this.f14544a;
        }
        String b = C6766s.m17031a().mo52317b();
        this.f14544a = b;
        return b;
    }

    /* renamed from: a */
    public void mo52323a(String str) {
        this.f14544a = str;
        C6766s.m17031a().mo52319b(str);
    }

    /* renamed from: b */
    public boolean mo52324b() {
        return this.f14544a != null;
    }
}
