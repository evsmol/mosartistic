package com.iab.omid.library.appodeal.p104a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.iab.omid.library.appodeal.a.d */
public final class C4257d extends ContentObserver {

    /* renamed from: a */
    private final Context f10150a;

    /* renamed from: b */
    private final AudioManager f10151b;

    /* renamed from: c */
    private final C4254a f10152c;

    /* renamed from: d */
    private final C4256c f10153d;

    /* renamed from: e */
    private float f10154e;

    public C4257d(Handler handler, Context context, C4254a aVar, C4256c cVar) {
        super(handler);
        this.f10150a = context;
        this.f10151b = (AudioManager) context.getSystemService("audio");
        this.f10152c = aVar;
        this.f10153d = cVar;
    }

    /* renamed from: a */
    private boolean m11960a(float f) {
        return f != this.f10154e;
    }

    /* renamed from: c */
    private float m11961c() {
        return this.f10152c.mo32668a(this.f10151b.getStreamVolume(3), this.f10151b.getStreamMaxVolume(3));
    }

    /* renamed from: d */
    private void m11962d() {
        this.f10153d.mo32670a(this.f10154e);
    }

    /* renamed from: a */
    public void mo32671a() {
        this.f10154e = m11961c();
        m11962d();
        this.f10150a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: b */
    public void mo32672b() {
        this.f10150a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c = m11961c();
        if (m11960a(c)) {
            this.f10154e = c;
            m11962d();
        }
    }
}
