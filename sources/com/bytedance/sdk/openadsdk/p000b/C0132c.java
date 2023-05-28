package com.bytedance.sdk.openadsdk.p000b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.p000b.C0141h;
import com.bytedance.sdk.openadsdk.p000b.C0147k;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.c */
/* compiled from: AdEventDispatcher */
public class C0132c<T extends C0147k> {

    /* renamed from: a */
    private C0141h<T> f523a;

    /* renamed from: b */
    private Handler f524b;

    /* renamed from: c */
    private C0141h<T> f525c;

    /* renamed from: d */
    private Handler f526d;

    /* renamed from: e */
    private AtomicBoolean f527e;

    public C0132c(C0139f<T> fVar, C0561n<T> nVar, C0141h.C0144c cVar, C0141h.C0143b bVar) {
        this.f523a = new C0141h<>(fVar, nVar, cVar, bVar);
        this.f525c = new C0148l(new C0149m(C0558m.m2663a()), nVar, cVar, bVar);
        this.f527e = new AtomicBoolean(false);
    }

    public C0132c(C0139f<T> fVar, C0561n<T> nVar, C0141h.C0144c cVar, C0141h.C0143b bVar, C0141h<T> hVar) {
        this.f523a = hVar;
        this.f525c = new C0148l(new C0149m(C0558m.m2663a()), nVar, cVar, bVar);
        this.f527e = new AtomicBoolean(false);
    }

    C0132c() {
    }

    /* renamed from: a */
    public synchronized void mo393a() {
        try {
            if (this.f527e != null && !this.f527e.get()) {
                if (this.f523a.getLooper() == null) {
                    this.f523a.start();
                    Handler handler = new Handler(this.f523a.getLooper(), this.f523a);
                    this.f524b = handler;
                    Message obtainMessage = handler.obtainMessage();
                    obtainMessage.what = 5;
                    this.f524b.sendMessageDelayed(obtainMessage, 10000);
                }
                if (this.f525c.getLooper() == null) {
                    this.f525c.start();
                    Handler handler2 = new Handler(this.f525c.getLooper(), this.f525c);
                    this.f526d = handler2;
                    Message obtainMessage2 = handler2.obtainMessage();
                    obtainMessage2.what = 5;
                    this.f526d.sendMessageDelayed(obtainMessage2, 10000);
                }
                this.f527e.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo395b() {
        this.f527e.set(false);
        this.f523a.quit();
        this.f525c.quit();
        this.f524b.removeCallbacksAndMessages((Object) null);
        this.f526d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public void mo394a(T t) {
        if (!this.f527e.get()) {
            mo393a();
        }
        if (t.mo309e()) {
            Message obtainMessage = this.f526d.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = t;
            this.f526d.sendMessage(obtainMessage);
            return;
        }
        Message obtainMessage2 = this.f524b.obtainMessage();
        obtainMessage2.what = 1;
        obtainMessage2.obj = t;
        this.f524b.sendMessage(obtainMessage2);
    }

    /* renamed from: c */
    public static C0133a m573c() {
        return C0133a.m578e();
    }

    /* renamed from: d */
    public static C0134b m574d() {
        return C0134b.m583e();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.c$a */
    /* compiled from: AdEventDispatcher */
    private static class C0133a extends C0132c<C0106a> {

        /* renamed from: a */
        private static volatile C0133a f528a;

        /* renamed from: a */
        public void mo394a(C0106a aVar) {
        }

        /* renamed from: b */
        public void mo395b() {
        }

        /* renamed from: e */
        public static C0133a m578e() {
            if (f528a == null) {
                synchronized (C0133a.class) {
                    if (f528a == null) {
                        f528a = new C0133a();
                    }
                }
            }
            return f528a;
        }

        C0133a() {
        }

        /* renamed from: a */
        public synchronized void mo393a() {
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.c$b */
    /* compiled from: AdEventDispatcher */
    private static class C0134b extends C0132c<C0818c.C0821a> {

        /* renamed from: a */
        private static volatile C0134b f529a;

        /* renamed from: a */
        public void mo394a(C0818c.C0821a aVar) {
        }

        /* renamed from: b */
        public void mo395b() {
        }

        /* renamed from: e */
        public static C0134b m583e() {
            if (f529a == null) {
                synchronized (C0134b.class) {
                    if (f529a == null) {
                        f529a = new C0134b();
                    }
                }
            }
            return f529a;
        }

        C0134b() {
        }

        /* renamed from: a */
        public synchronized void mo393a() {
        }
    }
}
