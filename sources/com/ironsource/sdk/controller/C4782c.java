package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* renamed from: com.ironsource.sdk.controller.c */
public final class C4782c {

    /* renamed from: a */
    private MutableContextWrapper f12170a;

    /* renamed from: a */
    public final Activity mo34326a() {
        return (Activity) this.f12170a.getBaseContext();
    }

    /* renamed from: a */
    public final synchronized void mo34327a(Activity activity) {
        if (this.f12170a == null) {
            this.f12170a = new MutableContextWrapper(activity);
        }
        this.f12170a.setBaseContext(activity);
    }

    /* renamed from: b */
    public final synchronized void mo34328b() {
        this.f12170a = null;
    }
}
