package com.iab.omid.library.ironsrc.p110a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.ironsrc.a.d */
public final class C4307d extends ContentObserver {

    /* renamed from: a */
    private final Context f10263a;

    /* renamed from: b */
    private final AudioManager f10264b;

    /* renamed from: c */
    private final C4304a f10265c;

    /* renamed from: d */
    private final C4306c f10266d;

    /* renamed from: e */
    private float f10267e;

    public C4307d(Handler handler, Context context, C4304a aVar, C4306c cVar) {
        super(handler);
        this.f10263a = context;
        this.f10264b = (AudioManager) context.getSystemService("audio");
        this.f10265c = aVar;
        this.f10266d = cVar;
    }

    /* renamed from: a */
    private boolean m12184a(float f) {
        return f != this.f10267e;
    }

    /* renamed from: c */
    private float m12185c() {
        return this.f10265c.mo32862a(this.f10264b.getStreamVolume(3), this.f10264b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m12186d() {
        this.f10266d.mo32864a(this.f10267e);
    }

    /* renamed from: a */
    public final void mo32865a() {
        this.f10267e = m12185c();
        m12186d();
        this.f10263a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public final void mo32866b() {
        this.f10263a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c = m12185c();
        if (m12184a(c)) {
            this.f10267e = c;
            m12186d();
        }
    }
}
