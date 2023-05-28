package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10131g;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10077b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10079c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10617f;
import com.bytedance.sdk.component.p328f.C10618g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.f */
/* compiled from: ProxyServer */
public class C10121f {

    /* renamed from: d */
    private static volatile C10121f f24998d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile ServerSocket f24999a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile int f25000b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicInteger f25001c = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile C10093c f25002e;

    /* renamed from: f */
    private volatile C10079c f25003f;

    /* renamed from: g */
    private volatile C10077b f25004g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<Set<C10131g>> f25005h = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C10131g.C10136c f25006i = new C10131g.C10136c() {
        /* renamed from: a */
        public void mo62762a(C10131g gVar) {
            synchronized (C10121f.this.f25005h) {
                Set set = (Set) C10121f.this.f25005h.get(gVar.mo62671f());
                if (set != null) {
                    set.add(gVar);
                }
            }
        }

        /* renamed from: b */
        public void mo62763b(C10131g gVar) {
            if (C10112e.f24979c) {
                Log.d("ProxyServer", "afterExecute, ProxyTask: " + gVar);
            }
            int f = gVar.mo62671f();
            synchronized (C10121f.this.f25005h) {
                Set set = (Set) C10121f.this.f25005h.get(f);
                if (set != null) {
                    set.remove(gVar);
                }
            }
        }
    };

    /* renamed from: j */
    private volatile C10097c f25007j;

    /* renamed from: k */
    private volatile C10097c f25008k;

    /* renamed from: l */
    private final Runnable f25009l = new Runnable() {
        public void run() {
            try {
                int i = 0;
                ServerSocket unused = C10121f.this.f24999a = new ServerSocket(0, 50, InetAddress.getByName(C10121f.this.m28832i()));
                C10121f fVar = C10121f.this;
                int unused2 = fVar.f25000b = fVar.f24999a.getLocalPort();
                if (C10121f.this.f25000b == -1) {
                    C10121f.m28820b("socket not bound", "");
                    C10121f.this.m28824e();
                    return;
                }
                C10144j.m28890a(C10121f.this.m28832i(), C10121f.this.f25000b);
                if (C10121f.this.m28828g()) {
                    C10202c.m29291b("ProxyServer", "run:  state = ", C10121f.this.f25001c);
                    if (C10121f.this.f25001c.compareAndSet(0, 1)) {
                        C10202c.m29291b("ProxyServer", "run:  state = ", C10121f.this.f25001c);
                        if (C10112e.f24979c) {
                            C10202c.m29289b("ProxyServer", "proxy server start!");
                        }
                        while (C10121f.this.f25001c.get() == 1) {
                            try {
                                Socket accept = C10121f.this.f24999a.accept();
                                C10093c h = C10121f.this.f25002e;
                                if (h != null) {
                                    final C10131g a = new C10131g.C10134a().mo62775a(h).mo62777a(accept).mo62776a(C10121f.this.f25006i).mo62778a();
                                    C10615e.m31156a().execute(new C10618g("ProxyTask", 10) {
                                        public void run() {
                                            a.run();
                                        }
                                    });
                                } else {
                                    C10148a.m28913a(accept);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                C10121f.m28820b("accept error", Log.getStackTraceString(e));
                                i++;
                                if (i > 3) {
                                    break;
                                }
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                Log.e("ProxyServer", "proxy server crashed!  " + stackTraceString);
                                C10121f.m28820b("error", stackTraceString);
                            }
                        }
                        if (C10112e.f24979c) {
                            C10202c.m29289b("ProxyServer", "proxy server closed!");
                        }
                        C10121f.this.m28824e();
                    }
                }
            } catch (IOException e2) {
                if (C10112e.f24979c) {
                    Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e2));
                }
                C10121f.m28820b("create ServerSocket error", Log.getStackTraceString(e2));
                C10121f.this.m28824e();
            }
        }
    };

    /* renamed from: m */
    private final AtomicBoolean f25010m = new AtomicBoolean();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m28820b(String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo62758a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r1 = r3.f25005h
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r2 = r3.f25005h     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0030 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x002e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0015:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0030 }
            com.bykv.vk.openvk.component.video.a.b.g r2 = (com.bykv.p271vk.openvk.component.video.p272a.p276b.C10131g) r2     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f24885h     // Catch:{ all -> 0x0030 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r4
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10121f.mo62758a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C10121f m28816a() {
        if (f24998d == null) {
            synchronized (C10121f.class) {
                if (f24998d == null) {
                    f24998d = new C10121f();
                }
            }
        }
        return f24998d;
    }

    private C10121f() {
        this.f25005h.put(0, new HashSet());
        this.f25005h.put(1, new HashSet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10097c mo62759b() {
        return this.f25007j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10097c mo62760c() {
        return this.f25008k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62757a(C10093c cVar) {
        this.f25002e = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo62756a(C10079c cVar) {
        this.f25003f = cVar;
    }

    /* renamed from: a */
    public String mo62755a(boolean z, boolean z2, String str, String... strArr) {
        String str2;
        String str3;
        if (strArr == null || strArr.length == 0) {
            m28820b("url", "url is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            m28820b("key", "key is empty");
            return strArr[0];
        } else if (this.f25002e == null) {
            m28820b("db", "VideoProxyDB is null");
            return strArr[0];
        } else {
            if ((z ? this.f25004g : this.f25003f) == null) {
                m28820b("cache", "Cache is null");
                return strArr[0];
            }
            int i = this.f25001c.get();
            if (i != 1) {
                m28820b("state", "ProxyServer is not running, " + i);
                return strArr[0];
            }
            List<String> a = C10148a.m28907a(strArr);
            if (a == null) {
                m28820b("url", "url not start with http/https");
                return strArr[0];
            }
            if (z2) {
                str2 = str;
            } else {
                str2 = C10201b.m29279a(str);
            }
            String a2 = C10139i.m28885a(str, str2, a);
            if (a2 == null) {
                m28820b("url", "combine proxy url error");
                return strArr[0];
            }
            if (z) {
                str3 = "https://" + m28832i() + ":" + this.f25000b + "?f=" + 1 + "&" + a2;
            } else {
                str3 = "https://" + m28832i() + ":" + this.f25000b + "?" + a2;
            }
            return str3.replaceFirst("s", "");
        }
    }

    /* renamed from: d */
    public void mo62761d() {
        if (this.f25010m.compareAndSet(false, true)) {
            Thread thread = new Thread(this.f25009l);
            thread.setName("tt_pangle_thread_proxy_server");
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28824e() {
        if (this.f25001c.compareAndSet(1, 2) || this.f25001c.compareAndSet(0, 2)) {
            C10148a.m28912a(this.f24999a);
            m28825f();
        }
    }

    /* renamed from: f */
    private void m28825f() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f25005h) {
            int size = this.f25005h.size();
            for (int i = 0; i < size; i++) {
                Set set = this.f25005h.get(this.f25005h.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10131g) it.next()).mo62664a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m28828g() {
        C10617f fVar = new C10617f(new C10125a(m28832i(), this.f25000b), 5, 1);
        C10615e.m31156a().submit(fVar);
        m28830h();
        try {
            if (!((Boolean) fVar.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                m28820b("ping error", "");
                m28824e();
                return false;
            }
            C10202c.m29289b("ProxyServer", "pingTest: ");
            if (C10112e.f24979c) {
                C10202c.m29289b("ProxyServer", "Ping OK!");
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            m28820b("ping error", Log.getStackTraceString(th));
            m28824e();
            return false;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f$a */
    /* compiled from: ProxyServer */
    private static final class C10125a implements Callable<Boolean> {

        /* renamed from: a */
        private final String f25015a;

        /* renamed from: b */
        private final int f25016b;

        C10125a(String str, int i) {
            this.f25015a = str;
            this.f25016b = i;
        }

        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                C10202c.m29289b("ProxyServer", "call: ");
                socket = new Socket(this.f25015a, this.f25016b);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(C10148a.f25078a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        C10148a.m28913a(socket);
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        C10202c.m29289b("ProxyServer", "call: " + th.getMessage());
                        C10121f.m28820b("ping error", Log.getStackTraceString(th));
                        C10148a.m28913a(socket);
                        return false;
                    } catch (Throwable th3) {
                        C10148a.m28913a(socket);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                socket = null;
                th = th5;
                th.printStackTrace();
                C10202c.m29289b("ProxyServer", "call: " + th.getMessage());
                C10121f.m28820b("ping error", Log.getStackTraceString(th));
                C10148a.m28913a(socket);
                return false;
            }
            C10148a.m28913a(socket);
            return false;
        }
    }

    /* renamed from: h */
    private void m28830h() {
        Socket socket = null;
        try {
            socket = this.f24999a.accept();
            socket.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(C10148a.f25078a));
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            m28820b("ping error", Log.getStackTraceString(e));
        } catch (Throwable th) {
            C10148a.m28913a((Socket) null);
            throw th;
        }
        C10148a.m28913a(socket);
        C10202c.m29289b("ProxyServer", "answerPing: ");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m28832i() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
