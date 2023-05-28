package com.bytedance.sdk.openadsdk.p041g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.sdk.component.utils.C10638l;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.g.g */
/* compiled from: VolumeChangeObserver */
public class C0790g {

    /* renamed from: a */
    private int f2954a = -1;

    /* renamed from: b */
    private C0789f f2955b;

    /* renamed from: c */
    private C0791a f2956c;

    /* renamed from: d */
    private Context f2957d;

    /* renamed from: e */
    private AudioManager f2958e;

    /* renamed from: f */
    private boolean f2959f = false;

    /* renamed from: g */
    private boolean f2960g = false;

    /* renamed from: h */
    private int f2961h = -1;

    public C0790g(Context context) {
        this.f2957d = context;
        this.f2958e = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public int mo2562a() {
        return this.f2961h;
    }

    /* renamed from: a */
    public void mo2563a(int i) {
        this.f2961h = i;
    }

    /* renamed from: b */
    public int mo2567b() {
        return this.f2954a;
    }

    /* renamed from: b */
    public void mo2568b(int i) {
        this.f2954a = i;
    }

    /* renamed from: c */
    public boolean mo2569c() {
        if (!this.f2960g) {
            return false;
        }
        this.f2960g = false;
        return true;
    }

    /* renamed from: d */
    public int mo2570d() {
        try {
            if (this.f2958e != null) {
                return this.f2958e.getStreamMaxVolume(3);
            }
            return 15;
        } catch (Throwable th) {
            C10638l.m31230a("VolumeChangeObserver", "getMaxMusicVolumeError: ", th);
            return 15;
        }
    }

    /* renamed from: a */
    public void mo2565a(boolean z) {
        mo2566a(z, false);
    }

    /* renamed from: a */
    public void mo2566a(boolean z, boolean z2) {
        if (this.f2958e != null) {
            int i = 0;
            if (z) {
                int g = mo2573g();
                if (g != 0) {
                    this.f2954a = g;
                }
                C10638l.m31235b("VolumeChangeObserver", "mute set volume to 0");
                this.f2958e.setStreamVolume(3, 0, 0);
                this.f2960g = true;
                return;
            }
            int i2 = this.f2954a;
            if (i2 == 0) {
                i2 = mo2570d() / 15;
            } else {
                if (i2 == -1) {
                    if (z2) {
                        i2 = mo2570d() / 15;
                    } else {
                        return;
                    }
                }
                C10638l.m31235b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f2954a);
                this.f2954a = -1;
                this.f2958e.setStreamVolume(3, i2, i);
                this.f2960g = true;
            }
            i = 1;
            C10638l.m31235b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f2954a);
            this.f2954a = -1;
            this.f2958e.setStreamVolume(3, i2, i);
            this.f2960g = true;
        }
    }

    /* renamed from: a */
    public void mo2564a(C0789f fVar) {
        this.f2955b = fVar;
    }

    /* renamed from: e */
    public void mo2571e() {
        try {
            this.f2956c = new C0791a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f2957d.registerReceiver(this.f2956c, intentFilter);
            this.f2959f = true;
        } catch (Throwable th) {
            C10638l.m31230a("VolumeChangeObserver", "registerReceiverError: ", th);
        }
    }

    /* renamed from: f */
    public void mo2572f() {
        if (this.f2959f) {
            try {
                this.f2957d.unregisterReceiver(this.f2956c);
                this.f2955b = null;
                this.f2959f = false;
            } catch (Throwable th) {
                C10638l.m31230a("VolumeChangeObserver", "unregisterReceiverError: ", th);
            }
        }
    }

    /* renamed from: g */
    public int mo2573g() {
        try {
            if (this.f2958e != null) {
                return this.f2958e.getStreamVolume(3);
            }
            return -1;
        } catch (Throwable th) {
            C10638l.m31230a("VolumeChangeObserver", "getCurrentMusicVolumeError: ", th);
            return -1;
        }
    }

    /* renamed from: h */
    public C0789f mo2574h() {
        return this.f2955b;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.g.g$a */
    /* compiled from: VolumeChangeObserver */
    private static class C0791a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C0790g> f2962a;

        public C0791a(C0790g gVar) {
            this.f2962a = new WeakReference<>(gVar);
        }

        public void onReceive(Context context, Intent intent) {
            C0789f h;
            int g;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    C10638l.m31235b("VolumeChangeObserver", "Media volume change notification.......");
                    C0790g gVar = (C0790g) this.f2962a.get();
                    if (gVar != null && (h = gVar.mo2574h()) != null && (g = gVar.mo2573g()) != gVar.mo2562a()) {
                        gVar.mo2563a(g);
                        if (g >= 0) {
                            h.mo63b(g);
                        }
                    }
                }
            } catch (Throwable th) {
                C10638l.m31230a("VolumeChangeObserver", "onVolumeChangedError: ", th);
            }
        }
    }
}
