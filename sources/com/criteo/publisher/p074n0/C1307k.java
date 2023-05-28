package com.criteo.publisher.p074n0;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.AdSize;

/* renamed from: com.criteo.publisher.n0.k */
/* compiled from: DeviceUtil */
public class C1307k {

    /* renamed from: a */
    private final Context f4026a;

    public C1307k(Context context) {
        C1197h.m5407b(getClass());
        this.f4026a = context;
    }

    /* renamed from: c */
    public boolean mo3657c() {
        DisplayMetrics b = m5770b();
        return ((float) Math.min(b.widthPixels, b.heightPixels)) >= b.density * 600.0f;
    }

    /* renamed from: a */
    public AdSize mo3656a() {
        DisplayMetrics b = m5770b();
        return new AdSize(Math.round(((float) b.widthPixels) / b.density), Math.round(((float) b.heightPixels) / b.density));
    }

    /* renamed from: b */
    private DisplayMetrics m5770b() {
        return this.f4026a.getResources().getDisplayMetrics();
    }

    /* renamed from: d */
    public boolean mo3658d() {
        return Build.VERSION.SDK_INT >= 19;
    }
}
