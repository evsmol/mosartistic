package com.iab.omid.library.amazon.p098a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.amazon.a.d */
public final class C4150d extends ContentObserver {

    /* renamed from: a */
    private final Context f9908a;

    /* renamed from: b */
    private final AudioManager f9909b;

    /* renamed from: c */
    private final C4147a f9910c;

    /* renamed from: d */
    private final C4149c f9911d;

    /* renamed from: e */
    private float f9912e;

    public C4150d(Handler handler, Context context, C4147a aVar, C4149c cVar) {
        super(handler);
        this.f9908a = context;
        this.f9909b = (AudioManager) context.getSystemService("audio");
        this.f9910c = aVar;
        this.f9911d = cVar;
    }

    /* renamed from: a */
    private boolean m11477a(float f) {
        return f != this.f9912e;
    }

    /* renamed from: c */
    private float m11478c() {
        return this.f9910c.mo32257a(this.f9909b.getStreamVolume(3), this.f9909b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m11479d() {
        this.f9911d.mo32259a(this.f9912e);
    }

    /* renamed from: a */
    public void mo32260a() {
        this.f9912e = m11478c();
        m11479d();
        this.f9908a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo32261b() {
        this.f9908a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m11478c();
        if (m11477a(c)) {
            this.f9912e = c;
            m11479d();
        }
    }
}
