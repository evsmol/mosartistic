package com.bytedance.sdk.openadsdk.p000b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.b.p */
/* compiled from: OpenAppSuccEvent */
public class C0156p {

    /* renamed from: a */
    private static volatile C0156p f598a;

    /* renamed from: b */
    private HandlerThread f599b;

    /* renamed from: c */
    private final Handler f600c;

    /* renamed from: d */
    private final Executor f601d = Executors.newCachedThreadPool();

    /* renamed from: e */
    private C0159b f602e = C0159b.m739a();

    /* renamed from: f */
    private Map<String, Object> f603f;

    /* renamed from: a */
    public static C0156p m729a() {
        if (f598a == null) {
            synchronized (C0156p.class) {
                if (f598a == null) {
                    f598a = new C0156p();
                }
            }
        }
        return f598a;
    }

    private C0156p() {
        if (this.f599b == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.f599b = handlerThread;
            handlerThread.start();
        }
        this.f600c = new Handler(this.f599b.getLooper(), new Handler.Callback() {
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.bytedance.sdk.openadsdk.b.p$a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 100
                    if (r0 != r1) goto L_0x001d
                    r0 = 0
                    java.lang.Object r1 = r3.obj
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r1 = r3.obj
                    boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.p000b.C0156p.C0158a
                    if (r1 == 0) goto L_0x0016
                    java.lang.Object r3 = r3.obj
                    r0 = r3
                    com.bytedance.sdk.openadsdk.b.p$a r0 = (com.bytedance.sdk.openadsdk.p000b.C0156p.C0158a) r0
                L_0x0016:
                    if (r0 == 0) goto L_0x001d
                    com.bytedance.sdk.openadsdk.b.p r3 = com.bytedance.sdk.openadsdk.p000b.C0156p.this
                    r3.m732b(r0)
                L_0x001d:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0156p.C01571.handleMessage(android.os.Message):boolean");
            }
        });
    }

    /* renamed from: a */
    public void mo450a(C0477n nVar, String str) {
        Message obtainMessage = this.f600c.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = C0158a.m735a(nVar, str, this.f603f);
        obtainMessage.sendToTarget();
    }

    /* renamed from: a */
    private void m730a(C0158a aVar) {
        if (aVar != null) {
            aVar.mo454b();
            if (aVar.mo452a() * this.f602e.f610a > this.f602e.f611b) {
                m733c(aVar.mo453a(false));
                return;
            }
            Message obtainMessage = this.f600c.obtainMessage();
            obtainMessage.what = 100;
            obtainMessage.obj = aVar;
            this.f600c.sendMessageDelayed(obtainMessage, (long) this.f602e.f610a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m732b(C0158a aVar) {
        if (aVar != null) {
            Context a = C0558m.m2663a();
            if (C0996u.m4643c(a, a.getPackageName())) {
                m730a(aVar);
            } else {
                m733c(aVar.mo453a(true));
            }
        }
    }

    /* renamed from: c */
    private void m733c(C0158a aVar) {
        if (aVar != null) {
            this.f601d.execute(aVar);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.p$a */
    /* compiled from: OpenAppSuccEvent */
    private static class C0158a implements Serializable, Runnable {

        /* renamed from: a */
        public final AtomicInteger f605a = new AtomicInteger(0);

        /* renamed from: b */
        public final AtomicBoolean f606b = new AtomicBoolean(false);

        /* renamed from: c */
        public C0477n f607c;

        /* renamed from: d */
        public String f608d;

        /* renamed from: e */
        public Map<String, Object> f609e;

        /* renamed from: a */
        public static C0158a m735a(C0477n nVar, String str, Map<String, Object> map) {
            return new C0158a(nVar, str, map);
        }

        public C0158a() {
        }

        public C0158a(C0477n nVar, String str, Map<String, Object> map) {
            this.f607c = nVar;
            this.f608d = str;
            this.f609e = map;
        }

        /* renamed from: a */
        public C0158a mo453a(boolean z) {
            this.f606b.set(z);
            return this;
        }

        /* renamed from: a */
        public int mo452a() {
            return this.f605a.get();
        }

        /* renamed from: b */
        public void mo454b() {
            this.f605a.incrementAndGet();
        }

        public void run() {
            if (this.f607c == null || TextUtils.isEmpty(this.f608d)) {
                C10638l.m31228a("materialMeta or eventTag is null, pls check");
            } else {
                C0136e.m627d(C0558m.m2663a(), this.f607c, this.f608d, this.f606b.get() ? "dpl_success" : "dpl_failed", this.f609e);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.p$b */
    /* compiled from: OpenAppSuccEvent */
    private static class C0159b {

        /* renamed from: a */
        public int f610a = 500;

        /* renamed from: b */
        public int f611b = 5000;

        /* renamed from: a */
        public static C0159b m739a() {
            return new C0159b();
        }
    }
}
