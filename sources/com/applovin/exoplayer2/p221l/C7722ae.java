package com.applovin.exoplayer2.p221l;

import android.os.Handler;
import android.os.Message;
import com.applovin.exoplayer2.p221l.C7749o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.l.ae */
final class C7722ae implements C7749o {

    /* renamed from: a */
    private static final List<C7724a> f18237a = new ArrayList(50);

    /* renamed from: b */
    private final Handler f18238b;

    /* renamed from: com.applovin.exoplayer2.l.ae$a */
    private static final class C7724a implements C7749o.C7750a {

        /* renamed from: a */
        private Message f18239a;

        /* renamed from: b */
        private C7722ae f18240b;

        private C7724a() {
        }

        /* renamed from: b */
        private void m22151b() {
            this.f18239a = null;
            this.f18240b = null;
            C7722ae.m22139b(this);
        }

        /* renamed from: a */
        public C7724a mo54978a(Message message, C7722ae aeVar) {
            this.f18239a = message;
            this.f18240b = aeVar;
            return this;
        }

        /* renamed from: a */
        public void mo54979a() {
            ((Message) C7717a.m22120b(this.f18239a)).sendToTarget();
            m22151b();
        }

        /* renamed from: a */
        public boolean mo54980a(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C7717a.m22120b(this.f18239a));
            m22151b();
            return sendMessageAtFrontOfQueue;
        }
    }

    public C7722ae(Handler handler) {
        this.f18238b = handler;
    }

    /* renamed from: a */
    private static C7724a m22137a() {
        C7724a aVar;
        synchronized (f18237a) {
            aVar = f18237a.isEmpty() ? new C7724a() : f18237a.remove(f18237a.size() - 1);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22139b(C7724a aVar) {
        synchronized (f18237a) {
            if (f18237a.size() < 50) {
                f18237a.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public C7749o.C7750a mo54967a(int i, int i2, int i3) {
        return m22137a().mo54978a(this.f18238b.obtainMessage(i, i2, i3), this);
    }

    /* renamed from: a */
    public C7749o.C7750a mo54968a(int i, int i2, int i3, Object obj) {
        return m22137a().mo54978a(this.f18238b.obtainMessage(i, i2, i3, obj), this);
    }

    /* renamed from: a */
    public C7749o.C7750a mo54969a(int i, Object obj) {
        return m22137a().mo54978a(this.f18238b.obtainMessage(i, obj), this);
    }

    /* renamed from: a */
    public void mo54970a(Object obj) {
        this.f18238b.removeCallbacksAndMessages(obj);
    }

    /* renamed from: a */
    public boolean mo54971a(int i) {
        return this.f18238b.hasMessages(i);
    }

    /* renamed from: a */
    public boolean mo54972a(int i, long j) {
        return this.f18238b.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: a */
    public boolean mo54973a(C7749o.C7750a aVar) {
        return ((C7724a) aVar).mo54980a(this.f18238b);
    }

    /* renamed from: a */
    public boolean mo54974a(Runnable runnable) {
        return this.f18238b.post(runnable);
    }

    /* renamed from: b */
    public C7749o.C7750a mo54975b(int i) {
        return m22137a().mo54978a(this.f18238b.obtainMessage(i), this);
    }

    /* renamed from: c */
    public boolean mo54976c(int i) {
        return this.f18238b.sendEmptyMessage(i);
    }

    /* renamed from: d */
    public void mo54977d(int i) {
        this.f18238b.removeMessages(i);
    }
}
