package com.criteo.publisher.p074n0;

import android.content.Context;
import com.criteo.publisher.model.AdSize;

/* renamed from: com.criteo.publisher.n0.c */
/* compiled from: AndroidUtil */
public class C1296c {

    /* renamed from: a */
    private final Context f4011a;

    /* renamed from: b */
    private final C1307k f4012b;

    public C1296c(Context context, C1307k kVar) {
        this.f4011a = context;
        this.f4012b = kVar;
    }

    /* renamed from: a */
    public int mo3619a() {
        AdSize a = this.f4012b.mo3656a();
        return a.getWidth() < a.getHeight() ? 1 : 2;
    }

    /* renamed from: a */
    public int mo3620a(int i) {
        return (int) Math.ceil((double) (((float) i) * this.f4011a.getResources().getDisplayMetrics().density));
    }
}
