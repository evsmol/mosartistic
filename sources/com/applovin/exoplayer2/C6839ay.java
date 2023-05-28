package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.ay */
final class C6839ay {

    /* renamed from: a */
    private final Context f14958a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Handler f14959b;

    /* renamed from: c */
    private final C6841a f14960c;

    /* renamed from: d */
    private final AudioManager f14961d;

    /* renamed from: e */
    private C6842b f14962e;

    /* renamed from: f */
    private int f14963f = 3;

    /* renamed from: g */
    private int f14964g;

    /* renamed from: h */
    private boolean f14965h;

    /* renamed from: com.applovin.exoplayer2.ay$a */
    public interface C6841a {
        /* renamed from: a */
        void mo52874a(int i, boolean z);

        /* renamed from: f */
        void mo52880f(int i);
    }

    /* renamed from: com.applovin.exoplayer2.ay$b */
    private final class C6842b extends BroadcastReceiver {
        private C6842b() {
        }

        public void onReceive(Context context, Intent intent) {
            C6839ay.this.f14959b.post(new Runnable() {
                public final void run() {
                    C6839ay.this.m17914d();
                }
            });
        }
    }

    public C6839ay(Context context, Handler handler, C6841a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f14958a = applicationContext;
        this.f14959b = handler;
        this.f14960c = aVar;
        AudioManager audioManager = (AudioManager) C7717a.m22115a((AudioManager) applicationContext.getSystemService("audio"));
        this.f14961d = audioManager;
        this.f14964g = m17910a(audioManager, 3);
        this.f14965h = m17913b(this.f14961d, this.f14963f);
        C6842b bVar = new C6842b();
        try {
            this.f14958a.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f14962e = bVar;
        } catch (RuntimeException e) {
            C7755q.m22359b("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: a */
    private static int m17910a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C7755q.m22359b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: b */
    private static boolean m17913b(AudioManager audioManager, int i) {
        return C7728ai.f18249a >= 23 ? audioManager.isStreamMute(i) : m17910a(audioManager, i) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17914d() {
        int a = m17910a(this.f14961d, this.f14963f);
        boolean b = m17913b(this.f14961d, this.f14963f);
        if (this.f14964g != a || this.f14965h != b) {
            this.f14964g = a;
            this.f14965h = b;
            this.f14960c.mo52874a(a, b);
        }
    }

    /* renamed from: a */
    public int mo52893a() {
        if (C7728ai.f18249a >= 28) {
            return this.f14961d.getStreamMinVolume(this.f14963f);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo52894a(int i) {
        if (this.f14963f != i) {
            this.f14963f = i;
            m17914d();
            this.f14960c.mo52880f(i);
        }
    }

    /* renamed from: b */
    public int mo52895b() {
        return this.f14961d.getStreamMaxVolume(this.f14963f);
    }

    /* renamed from: c */
    public void mo52896c() {
        C6842b bVar = this.f14962e;
        if (bVar != null) {
            try {
                this.f14958a.unregisterReceiver(bVar);
            } catch (RuntimeException e) {
                C7755q.m22359b("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f14962e = null;
        }
    }
}
