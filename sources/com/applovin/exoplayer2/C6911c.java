package com.applovin.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.exoplayer2.C6911c;
import com.applovin.exoplayer2.p181b.C6856d;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.c */
final class C6911c {

    /* renamed from: a */
    private final AudioManager f15296a;

    /* renamed from: b */
    private final C6912a f15297b;

    /* renamed from: c */
    private C6913b f15298c;

    /* renamed from: d */
    private C6856d f15299d;

    /* renamed from: e */
    private int f15300e;

    /* renamed from: f */
    private int f15301f;

    /* renamed from: g */
    private float f15302g = 1.0f;

    /* renamed from: h */
    private AudioFocusRequest f15303h;

    /* renamed from: i */
    private boolean f15304i;

    /* renamed from: com.applovin.exoplayer2.c$a */
    private class C6912a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b */
        private final Handler f15306b;

        public C6912a(Handler handler) {
            this.f15306b = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m18424a(int i) {
            C6911c.this.m18412c(i);
        }

        public void onAudioFocusChange(int i) {
            this.f15306b.post(new Runnable(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C6911c.C6912a.this.m18424a(this.f$1);
                }
            });
        }
    }

    /* renamed from: com.applovin.exoplayer2.c$b */
    public interface C6913b {
        /* renamed from: a */
        void mo52872a(float f);

        /* renamed from: a */
        void mo52873a(int i);
    }

    public C6911c(Context context, Handler handler, C6913b bVar) {
        this.f15296a = (AudioManager) C7717a.m22120b((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f15298c = bVar;
        this.f15297b = new C6912a(handler);
        this.f15300e = 0;
    }

    /* renamed from: a */
    private boolean m18408a(int i) {
        return i == 1 || this.f15301f != 1;
    }

    /* renamed from: b */
    private static int m18409b(C6856d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f15003d) {
            case 0:
                C7755q.m22361c("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (dVar.f15001b == 1) {
                    return 2;
                }
                break;
            case 16:
                return C7728ai.f18249a >= 19 ? 4 : 2;
            default:
                C7755q.m22361c("AudioFocusManager", "Unidentified audio usage: " + dVar.f15003d);
                return 0;
        }
        return 3;
    }

    /* renamed from: b */
    private void m18410b(int i) {
        if (this.f15300e != i) {
            this.f15300e = i;
            float f = i == 3 ? 0.2f : 1.0f;
            if (this.f15302g != f) {
                this.f15302g = f;
                C6913b bVar = this.f15298c;
                if (bVar != null) {
                    bVar.mo52872a(f);
                }
            }
        }
    }

    /* renamed from: c */
    private int m18411c() {
        if (this.f15300e == 1) {
            return 1;
        }
        if ((C7728ai.f18249a >= 26 ? m18416f() : m18415e()) == 1) {
            m18410b(1);
            return 1;
        }
        m18410b(0);
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m18412c(int i) {
        int i2;
        if (i == -3 || i == -2) {
            if (i == -2 || m18419i()) {
                m18414d(0);
                i2 = 2;
            } else {
                i2 = 3;
            }
            m18410b(i2);
        } else if (i == -1) {
            m18414d(-1);
            m18413d();
        } else if (i != 1) {
            C7755q.m22361c("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            m18410b(1);
            m18414d(1);
        }
    }

    /* renamed from: d */
    private void m18413d() {
        if (this.f15300e != 0) {
            if (C7728ai.f18249a >= 26) {
                m18418h();
            } else {
                m18417g();
            }
            m18410b(0);
        }
    }

    /* renamed from: d */
    private void m18414d(int i) {
        C6913b bVar = this.f15298c;
        if (bVar != null) {
            bVar.mo52873a(i);
        }
    }

    /* renamed from: e */
    private int m18415e() {
        return this.f15296a.requestAudioFocus(this.f15297b, C7728ai.m22262g(((C6856d) C7717a.m22120b(this.f15299d)).f15003d), this.f15301f);
    }

    /* renamed from: f */
    private int m18416f() {
        if (this.f15303h == null || this.f15304i) {
            this.f15303h = (this.f15303h == null ? new AudioFocusRequest.Builder(this.f15301f) : new AudioFocusRequest.Builder(this.f15303h)).setAudioAttributes(((C6856d) C7717a.m22120b(this.f15299d)).mo52914a()).setWillPauseWhenDucked(m18419i()).setOnAudioFocusChangeListener(this.f15297b).build();
            this.f15304i = false;
        }
        return this.f15296a.requestAudioFocus(this.f15303h);
    }

    /* renamed from: g */
    private void m18417g() {
        this.f15296a.abandonAudioFocus(this.f15297b);
    }

    /* renamed from: h */
    private void m18418h() {
        AudioFocusRequest audioFocusRequest = this.f15303h;
        if (audioFocusRequest != null) {
            this.f15296a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* renamed from: i */
    private boolean m18419i() {
        C6856d dVar = this.f15299d;
        return dVar != null && dVar.f15001b == 1;
    }

    /* renamed from: a */
    public float mo53116a() {
        return this.f15302g;
    }

    /* renamed from: a */
    public int mo53117a(boolean z, int i) {
        if (m18408a(i)) {
            m18413d();
            return z ? 1 : -1;
        } else if (z) {
            return m18411c();
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public void mo53118a(C6856d dVar) {
        if (!C7728ai.m22218a((Object) this.f15299d, (Object) dVar)) {
            this.f15299d = dVar;
            int b = m18409b(dVar);
            this.f15301f = b;
            boolean z = true;
            if (!(b == 1 || b == 0)) {
                z = false;
            }
            C7717a.m22119a(z, (Object) "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: b */
    public void mo53119b() {
        this.f15298c = null;
        m18413d();
    }
}
