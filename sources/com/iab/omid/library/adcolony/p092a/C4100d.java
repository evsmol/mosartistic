package com.iab.omid.library.adcolony.p092a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.adcolony.a.d */
public final class C4100d extends ContentObserver {

    /* renamed from: a */
    private final Context f9791a;

    /* renamed from: b */
    private final AudioManager f9792b;

    /* renamed from: c */
    private final C4097a f9793c;

    /* renamed from: d */
    private final C4099c f9794d;

    /* renamed from: e */
    private float f9795e;

    public C4100d(Handler handler, Context context, C4097a aVar, C4099c cVar) {
        super(handler);
        this.f9791a = context;
        this.f9792b = (AudioManager) context.getSystemService("audio");
        this.f9793c = aVar;
        this.f9794d = cVar;
    }

    /* renamed from: a */
    private boolean m11247a(float f) {
        return f != this.f9795e;
    }

    /* renamed from: c */
    private float m11248c() {
        return this.f9793c.mo32058a(this.f9792b.getStreamVolume(3), this.f9792b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m11249d() {
        this.f9794d.mo32060a(this.f9795e);
    }

    /* renamed from: a */
    public void mo32061a() {
        this.f9795e = m11248c();
        m11249d();
        this.f9791a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo32062b() {
        this.f9791a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m11248c();
        if (m11247a(c)) {
            this.f9795e = c;
            m11249d();
        }
    }
}
