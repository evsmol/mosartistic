package com.bykv.p271vk.openvk.component.video.p272a.p284d;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.C10064a;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10073c;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: com.bykv.vk.openvk.component.video.a.d.b */
/* compiled from: AndroidMediaPlayer */
public class C10151b extends C10150a {

    /* renamed from: b */
    private final MediaPlayer f25089b;

    /* renamed from: c */
    private final C10152a f25090c;

    /* renamed from: d */
    private C10064a f25091d;

    /* renamed from: e */
    private Surface f25092e;

    /* renamed from: f */
    private final Object f25093f;

    /* renamed from: g */
    private volatile boolean f25094g;

    public C10151b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f25093f = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f25089b = mediaPlayer;
        }
        m28937a(mediaPlayer);
        try {
            this.f25089b.setAudioStreamType(3);
        } catch (Throwable th) {
            C10202c.m29294c("CSJ_VIDEO", "setAudioStreamType error: ", th);
        }
        this.f25090c = new C10152a(this);
        m28939p();
    }

    /* renamed from: a */
    private void m28937a(MediaPlayer mediaPlayer) {
        Field declaredField;
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 28) {
            try {
                Class<?> cls = Class.forName("android.media.MediaTimeProvider");
                Class<?> cls2 = Class.forName("android.media.SubtitleController");
                Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
                Object newInstance = cls2.getConstructor(new Class[]{Context.class, cls, Class.forName("android.media.SubtitleController$Listener")}).newInstance(new Object[]{C10184b.m29123a(), null, null});
                declaredField = cls2.getDeclaredField("mHandler");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", new Class[]{cls2, cls3}).invoke(mediaPlayer, new Object[]{newInstance, null});
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "setSubtitleController error: ", th);
            }
        }
    }

    /* renamed from: a */
    public void mo62817a(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f25093f) {
            try {
                if (!this.f25094g && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f25081a) {
                    this.f25089b.setDisplay(surfaceHolder);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo62816a(Surface surface) {
        m28940q();
        this.f25092e = surface;
        this.f25089b.setSurface(surface);
    }

    /* renamed from: a */
    public void mo62820a(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f25089b.setDataSource(str);
        } else {
            this.f25089b.setDataSource(parse.getPath());
        }
    }

    /* renamed from: a */
    public void mo62819a(FileDescriptor fileDescriptor) throws Throwable {
        this.f25089b.setDataSource(fileDescriptor);
    }

    /* renamed from: a */
    public synchronized void mo62818a(C10188c cVar) {
        this.f25091d = C10064a.m28638a(C10184b.m29123a(), cVar);
        C10073c.m28695a(cVar);
        this.f25089b.setDataSource(this.f25091d);
    }

    /* renamed from: o */
    private void m28938o() {
        C10064a aVar;
        if (Build.VERSION.SDK_INT >= 23 && (aVar = this.f25091d) != null) {
            try {
                aVar.close();
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "releaseMediaDataSource error: ", th);
            }
            this.f25091d = null;
        }
    }

    /* renamed from: e */
    public void mo62824e() throws Throwable {
        this.f25089b.start();
    }

    /* renamed from: f */
    public void mo62825f() throws Throwable {
        this.f25089b.stop();
    }

    /* renamed from: g */
    public void mo62827g() throws Throwable {
        this.f25089b.pause();
    }

    /* renamed from: h */
    public void mo62828h() {
        MediaPlayer mediaPlayer = this.f25089b;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    /* renamed from: b */
    public void mo62821b(boolean z) throws Throwable {
        this.f25089b.setScreenOnWhilePlaying(z);
    }

    /* renamed from: a */
    public void mo62815a(long j) throws Throwable {
        this.f25089b.seekTo((int) j);
    }

    /* renamed from: i */
    public long mo62829i() {
        try {
            return (long) this.f25089b.getCurrentPosition();
        } catch (Throwable th) {
            C10202c.m29294c("CSJ_VIDEO", "getCurrentPosition error: ", th);
            return 0;
        }
    }

    /* renamed from: j */
    public long mo62830j() {
        try {
            return (long) this.f25089b.getDuration();
        } catch (Throwable th) {
            C10202c.m29294c("CSJ_VIDEO", "getDuration error: ", th);
            return 0;
        }
    }

    /* renamed from: k */
    public void mo62831k() throws Throwable {
        synchronized (this.f25093f) {
            if (!this.f25094g) {
                this.f25089b.release();
                this.f25094g = true;
                m28940q();
                m28938o();
                mo62799a();
                m28939p();
            }
        }
    }

    /* renamed from: l */
    public void mo62832l() throws Throwable {
        try {
            this.f25089b.reset();
        } catch (Throwable th) {
            C10202c.m29294c("CSJ_VIDEO", "reset error: ", th);
        }
        m28938o();
        mo62799a();
        m28939p();
    }

    /* renamed from: c */
    public void mo62822c(boolean z) throws Throwable {
        this.f25089b.setLooping(z);
    }

    /* renamed from: d */
    public void mo62823d(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.f25089b;
        if (mediaPlayer != null) {
            if (z) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    /* renamed from: m */
    public int mo62833m() {
        MediaPlayer mediaPlayer = this.f25089b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: n */
    public int mo62834n() {
        MediaPlayer mediaPlayer = this.f25089b;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: p */
    private void m28939p() {
        this.f25089b.setOnPreparedListener(this.f25090c);
        this.f25089b.setOnBufferingUpdateListener(this.f25090c);
        this.f25089b.setOnCompletionListener(this.f25090c);
        this.f25089b.setOnSeekCompleteListener(this.f25090c);
        this.f25089b.setOnVideoSizeChangedListener(this.f25090c);
        this.f25089b.setOnErrorListener(this.f25090c);
        this.f25089b.setOnInfoListener(this.f25090c);
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.d.b$a */
    /* compiled from: AndroidMediaPlayer */
    private static class C10152a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<C10151b> f25095a;

        public C10152a(C10151b bVar) {
            this.f25095a = new WeakReference<>(bVar);
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C10202c.m29289b("CSJ_VIDEO", "onInfo: ");
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar == null || !bVar.mo62812b(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onInfo error: ", th);
                return false;
            }
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C10202c.m29291b("CSJ_VIDEO", "onError: ", Integer.valueOf(i), Integer.valueOf(i2));
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar == null || !bVar.mo62810a(i, i2)) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onError error: ", th);
                return false;
            }
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar != null) {
                    bVar.mo62801a(i, i2, 1, 1);
                }
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: ", th);
            }
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar != null) {
                    bVar.mo62814d();
                }
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onSeekComplete error: ", th);
            }
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar != null) {
                    bVar.mo62800a(i);
                }
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: ", th);
            }
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar != null) {
                    bVar.mo62813c();
                }
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onCompletion error: ", th);
            }
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                C10151b bVar = (C10151b) this.f25095a.get();
                if (bVar != null) {
                    bVar.mo62811b();
                }
            } catch (Throwable th) {
                C10202c.m29294c("CSJ_VIDEO", "AndroidMediaPlayerListenerHolder.onPrepared error: ", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        m28940q();
    }

    /* renamed from: q */
    private void m28940q() {
        try {
            if (this.f25092e != null) {
                this.f25092e.release();
                this.f25092e = null;
            }
        } catch (Throwable unused) {
        }
    }
}
