package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.applovin.devicevolume.d */
public final class C4203d extends ContentObserver {

    /* renamed from: a */
    private final Context f10049a;

    /* renamed from: b */
    private final AudioManager f10050b;

    /* renamed from: c */
    private final C4200a f10051c;

    /* renamed from: d */
    private final C4202c f10052d;

    /* renamed from: e */
    private float f10053e;

    public C4203d(Handler handler, Context context, C4200a aVar, C4202c cVar) {
        super(handler);
        this.f10049a = context;
        this.f10050b = (AudioManager) context.getSystemService("audio");
        this.f10051c = aVar;
        this.f10052d = cVar;
    }

    /* renamed from: a */
    private float m11739a() {
        return this.f10051c.mo32531a(this.f10050b.getStreamVolume(3), this.f10050b.getStreamMaxVolume(3));
    }

    /* renamed from: a */
    private boolean m11740a(float f) {
        return f != this.f10053e;
    }

    /* renamed from: b */
    private void m11741b() {
        this.f10052d.mo32533a(this.f10053e);
    }

    /* renamed from: c */
    public void mo32534c() {
        this.f10053e = m11739a();
        m11741b();
        this.f10049a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void mo32535d() {
        this.f10049a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float a = m11739a();
        if (m11740a(a)) {
            this.f10053e = a;
            m11741b();
        }
    }
}
