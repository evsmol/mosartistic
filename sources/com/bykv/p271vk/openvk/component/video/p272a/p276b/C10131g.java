package com.bykv.p271vk.openvk.component.video.p272a.p276b;

import android.util.Log;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10137h;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10076a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10091a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10098a;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10099b;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10100c;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10101d;
import com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10114a;
import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.g */
/* compiled from: ProxyTask */
class C10131g extends C10074a {

    /* renamed from: m */
    private final Socket f25033m;

    /* renamed from: n */
    private final C10136c f25034n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C10102d f25035o;

    /* renamed from: p */
    private volatile C10088b f25036p;

    /* renamed from: q */
    private volatile boolean f25037q = true;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$c */
    /* compiled from: ProxyTask */
    public interface C10136c {
        /* renamed from: a */
        void mo62762a(C10131g gVar);

        /* renamed from: b */
        void mo62763b(C10131g gVar);
    }

    /* renamed from: a */
    private void m28860a(boolean z, int i, int i2, int i3, int i4) {
    }

    C10131g(C10134a aVar) {
        super(aVar.f25041a, aVar.f25042b);
        this.f25033m = aVar.f25043c;
        this.f25034n = aVar.f25044d;
        this.f25035o = C10102d.m28766c();
    }

    /* renamed from: h */
    private C10135b m28866h() {
        try {
            this.f24886i = C10139i.m28884a(this.f25033m.getInputStream());
            OutputStream outputStream = this.f25033m.getOutputStream();
            C10076a aVar = this.f24886i.f25051c.f25052a == 1 ? C10112e.f24977a : C10112e.f24978b;
            if (aVar == null) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.f24878a = aVar;
            this.f24884g = this.f24886i.f25051c.f25053b;
            this.f24885h = this.f24886i.f25051c.f25054c;
            this.f24887j = new C10146l(this.f24886i.f25051c.f25058g);
            this.f24883f = this.f24886i.f25050b;
            if (C10112e.f24979c) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.f24886i.toString());
            }
            return new C10135b(outputStream, this.f24886i.f25051c.f25055d);
        } catch (IOException e) {
            C10148a.m28913a(this.f25033m);
            if (C10112e.f24979c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
            mo62666a(this.f24878a == null ? null : Boolean.valueOf(mo62672g()), this.f24884g, e);
            return null;
        } catch (C10139i.C10143d e2) {
            C10148a.m28913a(this.f25033m);
            if (C10112e.f24979c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            mo62666a(this.f24878a == null ? null : Boolean.valueOf(mo62672g()), this.f24884g, e2);
            return null;
        }
    }

    public void run() {
        C10091a a;
        C10135b h = m28866h();
        if (h != null) {
            C10136c cVar = this.f25034n;
            if (cVar != null) {
                cVar.mo62762a(this);
            }
            this.f24878a.mo62674a(this.f24885h);
            if (C10112e.f24984h != 0 && ((a = this.f24879b.mo62712a(this.f24885h, this.f24886i.f25051c.f25052a)) == null || this.f24878a.mo62676c(this.f24885h).length() < ((long) a.f24933c))) {
                this.f25035o.mo62727a(mo62672g(), this.f24885h);
            }
            try {
                m28861a(h);
            } catch (C10098a e) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
                }
            } catch (Throwable th) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
                }
            }
            this.f24878a.mo62675b(this.f24885h);
            this.f25035o.mo62727a(mo62672g(), (String) null);
            mo62664a();
            C10148a.m28913a(this.f25033m);
            C10136c cVar2 = this.f25034n;
            if (cVar2 != null) {
                cVar2.mo62763b(this);
            }
        }
    }

    /* renamed from: a */
    private boolean m28861a(C10135b bVar) throws C10098a {
        while (this.f24887j.mo62793a()) {
            mo62670e();
            C10146l.C10147a b = this.f24887j.mo62794b();
            try {
                m28859a(bVar, b);
                return true;
            } catch (C10100c e) {
                b.mo62795a();
                mo62666a(Boolean.valueOf(mo62672g()), this.f24884g, e);
            } catch (IOException e2) {
                if (e2 instanceof SocketTimeoutException) {
                    b.mo62796b();
                }
                if (!mo62667b()) {
                    mo62666a(Boolean.valueOf(mo62672g()), this.f24884g, e2);
                } else if (C10112e.f24979c) {
                    if ("Canceled".equalsIgnoreCase(e2.getMessage())) {
                        Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                    } else {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                    }
                }
            } catch (C10101d e3) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
                }
                return true;
            } catch (C10137h.C10138a e4) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                }
                this.f25037q = false;
                mo62666a(Boolean.valueOf(mo62672g()), this.f24884g, e4);
            } catch (C10099b e5) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e5));
                }
                return false;
            } catch (Exception e6) {
                if (C10112e.f24979c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e6));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m28859a(C10135b bVar, C10146l.C10147a aVar) throws C10101d, IOException, C10137h.C10138a, C10098a, C10099b {
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(this.f24886i.f25049a.f25061a)) {
            m28863b(bVar, aVar);
        } else {
            m28864c(bVar, aVar);
        }
    }

    /* renamed from: b */
    private void m28863b(C10135b bVar, C10146l.C10147a aVar) throws IOException, C10101d {
        byte[] a = m28862a(this.f24879b.mo62712a(this.f24885h, this.f24886i.f25051c.f25052a), bVar, aVar);
        if (a != null) {
            bVar.mo62779a(a, 0, a.length);
        }
    }

    /* renamed from: c */
    private void m28864c(C10135b bVar, C10146l.C10147a aVar) throws C10137h.C10138a, C10101d, IOException, C10098a, C10099b {
        int i;
        if (this.f25037q) {
            File c = this.f24878a.mo62676c(this.f24885h);
            long length = c.length();
            C10091a a = this.f24879b.mo62712a(this.f24885h, this.f24886i.f25051c.f25052a);
            int b = bVar.mo62781b();
            long j = length - ((long) b);
            int i2 = (int) j;
            if (a == null) {
                i = -1;
            } else {
                i = a.f24933c;
            }
            if (length > ((long) bVar.mo62781b())) {
                if (C10112e.f24979c) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + j);
                }
                m28860a(true, i2, i, (int) length, b);
                m28858a(a, c, bVar, aVar);
                return;
            }
            m28860a(false, i2, i, (int) length, b);
        } else {
            m28860a(false, 0, 0, 0, bVar.mo62781b());
        }
        m28865d(bVar, aVar);
    }

    /* renamed from: a */
    private byte[] m28862a(C10091a aVar, C10135b bVar, C10146l.C10147a aVar2) throws IOException {
        if (aVar != null) {
            if (C10112e.f24979c) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return C10148a.m28902a(aVar, bVar.mo62781b()).getBytes(C10148a.f25078a);
        }
        C10114a a = mo62663a(aVar2, 0, -1, VersionInfo.GIT_BRANCH);
        if (a == null) {
            return null;
        }
        try {
            String a2 = C10148a.m28904a(a, false, false);
            if (a2 == null) {
                C10091a a3 = C10148a.m28900a(a, this.f24879b, this.f24885h, this.f24886i.f25051c.f25052a);
                if (C10112e.f24979c) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return C10148a.m28902a(a3, bVar.mo62781b()).getBytes(C10148a.f25078a);
            }
            throw new C10100c(a2 + ", rawKey: " + this.f24884g + ", url: " + aVar2);
        } finally {
            C10148a.m28909a((Closeable) a.mo62749d());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd A[SYNTHETIC, Splitter:B:92:0x01cd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28858a(com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10091a r8, java.io.File r9, com.bykv.p271vk.openvk.component.video.p272a.p276b.C10131g.C10135b r10, com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l.C10147a r11) throws java.io.IOException, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10101d, com.bykv.p271vk.openvk.component.video.p272a.p276b.C10137h.C10138a, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10098a, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10099b {
        /*
            r7 = this;
            boolean r0 = r10.mo62780a()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            byte[] r0 = r7.m28862a(r8, r10, r11)
            r7.mo62670e()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r2 = r0.length
            r10.mo62779a(r0, r1, r2)
        L_0x0015:
            r0 = 0
            if (r8 != 0) goto L_0x0068
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f24879b
            java.lang.String r2 = r7.f24885h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f24886i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f25051c
            int r3 = r3.f25052a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.mo62712a((java.lang.String) r2, (int) r3)
            if (r8 != 0) goto L_0x0068
            boolean r8 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r8 == 0) goto L_0x0033
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info from db"
            android.util.Log.e(r8, r2)
        L_0x0033:
            r7.m28862a(r0, r10, r11)
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f24879b
            java.lang.String r2 = r7.f24885h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f24886i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f25051c
            int r3 = r3.f25052a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.mo62712a((java.lang.String) r2, (int) r3)
            if (r8 == 0) goto L_0x0047
            goto L_0x0068
        L_0x0047:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "failed to get header, rawKey: "
            r9.append(r10)
            java.lang.String r10 = r7.f24884g
            r9.append(r10)
            java.lang.String r10 = ", url: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0068:
            long r2 = r9.length()
            int r4 = r8.f24933c
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e4
            com.bykv.vk.openvk.component.video.a.b.b r2 = r7.f25036p
            if (r2 == 0) goto L_0x0083
            boolean r3 = r2.mo62667b()
            if (r3 != 0) goto L_0x0083
            boolean r2 = r2.mo62669d()
            if (r2 == 0) goto L_0x00e4
        L_0x0083:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a
            r2.<init>()
            com.bykv.vk.openvk.component.video.a.b.a.a r3 = r7.f24878a
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62701a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p277a.C10076a) r3)
            com.bykv.vk.openvk.component.video.a.b.b.c r3 = r7.f24879b
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62703a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p278b.C10093c) r3)
            java.lang.String r3 = r7.f24884g
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62707a((java.lang.String) r3)
            java.lang.String r3 = r7.f24885h
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62710b(r3)
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l
            java.lang.String r4 = r11.f25075a
            r3.<init>((java.lang.String) r4)
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62705a((com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l) r3)
            java.util.List r3 = r7.f24883f
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62708a((java.util.List<com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i.C10141b>) r3)
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f24886i
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62704a((com.bykv.p271vk.openvk.component.video.p272a.p276b.C10139i) r3)
            com.bykv.vk.openvk.component.video.a.b.g$1 r3 = new com.bykv.vk.openvk.component.video.a.b.g$1
            r3.<init>()
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo62702a((com.bykv.p271vk.openvk.component.video.p272a.p276b.C10088b.C10090b) r3)
            com.bykv.vk.openvk.component.video.a.b.b r2 = r2.mo62709a()
            r7.f25036p = r2
            com.bytedance.sdk.component.f.f r3 = new com.bytedance.sdk.component.f.f
            r4 = 10
            r5 = 1
            r3.<init>(r2, r0, r4, r5)
            com.bykv.vk.openvk.component.video.a.b.g$2 r2 = new com.bykv.vk.openvk.component.video.a.b.g$2
            java.lang.String r4 = "processCacheNetWorkConcurrent"
            r2.<init>(r4, r3)
            com.bytedance.sdk.component.p328f.C10615e.m31159a((com.bytedance.sdk.component.p328f.C10618g) r2)
            boolean r2 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r4 = "fire download in process cache task"
            android.util.Log.e(r2, r4)
            goto L_0x00e5
        L_0x00e4:
            r3 = r0
        L_0x00e5:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "r"
            r4.<init>(r9, r5)     // Catch:{ all -> 0x01c5 }
            int r9 = r10.mo62781b()     // Catch:{ all -> 0x01c2 }
            long r5 = (long) r9     // Catch:{ all -> 0x01c2 }
            r4.mo62785a((long) r5)     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.f24886i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f25051c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f25056e     // Catch:{ all -> 0x01c2 }
            if (r9 <= 0) goto L_0x010d
            int r8 = r8.f24933c     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.f24886i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f25051c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f25056e     // Catch:{ all -> 0x01c2 }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x010d:
            int r8 = r8.f24933c     // Catch:{ all -> 0x01c2 }
        L_0x010f:
            int r9 = r10.mo62781b()     // Catch:{ all -> 0x01c2 }
            if (r9 >= r8) goto L_0x018b
            r7.mo62670e()     // Catch:{ all -> 0x01c2 }
            int r9 = r4.mo62783a((byte[]) r2)     // Catch:{ all -> 0x01c2 }
            if (r9 > 0) goto L_0x0184
            com.bykv.vk.openvk.component.video.a.b.b r9 = r7.f25036p     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x0131
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = r9.mo62698i()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0130
            com.bykv.vk.openvk.component.video.a.b.h$a r0 = r9.mo62697h()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0130:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0131:
            if (r9 == 0) goto L_0x0158
            boolean r0 = r9.mo62667b()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0158
            boolean r0 = r9.mo62669d()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0140
            goto L_0x0158
        L_0x0140:
            r7.mo62670e()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r9.f24915m     // Catch:{ all -> 0x01c2 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Object r9 = r9.f24915m     // Catch:{ InterruptedException -> 0x0150 }
            r5 = 1000(0x3e8, double:4.94E-321)
            r9.wait(r5)     // Catch:{ InterruptedException -> 0x0150 }
            goto L_0x0154
        L_0x014e:
            r8 = move-exception
            goto L_0x0156
        L_0x0150:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x014e }
        L_0x0154:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            goto L_0x0187
        L_0x0156:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0158:
            boolean r8 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01c2 }
            if (r8 == 0) goto L_0x0163
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r9 = "download task has finished!!!"
            android.util.Log.e(r8, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0163:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r9.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = "illegal state download task has finished, rawKey: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = r7.f24884g     // Catch:{ all -> 0x01c2 }
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", url: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            r9.append(r11)     // Catch:{ all -> 0x01c2 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c2 }
            r8.<init>(r9)     // Catch:{ all -> 0x01c2 }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0184:
            r10.mo62782b(r2, r1, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0187:
            r7.mo62670e()     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x018b:
            boolean r9 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x01b1
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r11.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "read cache file complete: "
            r11.append(r0)     // Catch:{ all -> 0x01c2 }
            int r10 = r10.mo62781b()     // Catch:{ all -> 0x01c2 }
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", "
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            r11.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x01c2 }
            android.util.Log.i(r9, r8)     // Catch:{ all -> 0x01c2 }
        L_0x01b1:
            r7.mo62668c()     // Catch:{ all -> 0x01c2 }
            r4.mo62784a()
            if (r3 == 0) goto L_0x01c1
            r3.get()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r8 = move-exception
            r8.printStackTrace()
        L_0x01c1:
            return
        L_0x01c2:
            r8 = move-exception
            r0 = r4
            goto L_0x01c6
        L_0x01c5:
            r8 = move-exception
        L_0x01c6:
            if (r0 == 0) goto L_0x01cb
            r0.mo62784a()
        L_0x01cb:
            if (r3 == 0) goto L_0x01d5
            r3.get()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r9 = move-exception
            r9.printStackTrace()
        L_0x01d5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10131g.m28858a(com.bykv.vk.openvk.component.video.a.b.b.a, java.io.File, com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ad A[EDGE_INSN: B:100:0x01ad->B:77:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015c A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015e A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b1 A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0208  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28865d(com.bykv.p271vk.openvk.component.video.p272a.p276b.C10131g.C10135b r13, com.bykv.p271vk.openvk.component.video.p272a.p276b.C10146l.C10147a r14) throws com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10101d, java.io.IOException, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10098a, com.bykv.p271vk.openvk.component.video.p272a.p276b.p279c.C10099b {
        /*
            r12 = this;
            r12.m28867i()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r13.mo62781b()
            com.bykv.vk.openvk.component.video.a.b.i r3 = r12.f24886i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f25051c
            int r3 = r3.f25056e
            java.lang.String r4 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r3 = r12.mo62663a(r14, r2, r3, r4)
            if (r3 != 0) goto L_0x001a
            return
        L_0x001a:
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r4 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28904a(r3, r6, r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", rawKey: "
            if (r4 != 0) goto L_0x01dc
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f24879b     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r12.f24885h     // Catch:{ all -> 0x01fe }
            int r9 = r12.mo62671f()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.mo62712a((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x01fe }
            int r8 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28898a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10114a) r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            if (r4 == 0) goto L_0x00a4
            int r10 = r4.f24933c     // Catch:{ all -> 0x01fe }
            if (r10 == r8) goto L_0x00a4
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01fe }
            if (r13 == 0) goto L_0x0069
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r13.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "Content-Length not match, old: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r4.f24933c     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            r13.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", key: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f24885h     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.e(r9, r13)     // Catch:{ all -> 0x01fe }
        L_0x0069:
            com.bykv.vk.openvk.component.video.a.b.c.b r13 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "Content-Length not match, old length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            int r9 = r4.f24933c     // Catch:{ all -> 0x01fe }
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = ", new length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            r2.append(r8)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f24884g     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", currentUrl: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = ", previousInfo: "
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r4.f24935e     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x00a4:
            boolean r14 = r13.mo62780a()     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00bb
            java.lang.String r14 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28903a((com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e.C10114a) r3, (int) r2)     // Catch:{ all -> 0x01fe }
            r12.mo62670e()     // Catch:{ all -> 0x01fe }
            java.nio.charset.Charset r2 = com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.f25078a     // Catch:{ all -> 0x01fe }
            byte[] r14 = r14.getBytes(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r14.length     // Catch:{ all -> 0x01fe }
            r13.mo62779a(r14, r6, r2)     // Catch:{ all -> 0x01fe }
        L_0x00bb:
            r12.mo62670e()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.a.a r14 = r12.f24878a     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f24885h     // Catch:{ all -> 0x01fe }
            java.io.File r14 = r14.mo62677d(r2)     // Catch:{ all -> 0x01fe }
            boolean r2 = r12.f25037q     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", from: "
            if (r2 == 0) goto L_0x0127
            if (r14 == 0) goto L_0x0127
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            int r2 = r13.mo62781b()     // Catch:{ all -> 0x01fe }
            long r10 = (long) r2     // Catch:{ all -> 0x01fe }
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0127
            com.bykv.vk.openvk.component.video.a.b.b.c r2 = r12.f24879b     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f24885h     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i r8 = r12.f24886i     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i$a r8 = r8.f25051c     // Catch:{ all -> 0x01fe }
            int r8 = r8.f25052a     // Catch:{ all -> 0x01fe }
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28900a(r3, r2, r7, r8)     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.h r2 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ a -> 0x00fa }
            java.lang.String r7 = "rwd"
            r2.<init>(r14, r7)     // Catch:{ a -> 0x00fa }
            int r7 = r13.mo62781b()     // Catch:{ a -> 0x00f8 }
            long r7 = (long) r7     // Catch:{ a -> 0x00f8 }
            r2.mo62785a((long) r7)     // Catch:{ a -> 0x00f8 }
            goto L_0x0100
        L_0x00f8:
            r7 = move-exception
            goto L_0x00fc
        L_0x00fa:
            r7 = move-exception
            r2 = r5
        L_0x00fc:
            r7.printStackTrace()     // Catch:{ all -> 0x01d9 }
            r2 = r5
        L_0x0100:
            boolean r7 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01d9 }
            if (r7 == 0) goto L_0x014e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r7.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = "can write to cache file in network task, cache file size: "
            r7.append(r8)     // Catch:{ all -> 0x01d9 }
            long r10 = r14.length()     // Catch:{ all -> 0x01d9 }
            r7.append(r10)     // Catch:{ all -> 0x01d9 }
            r7.append(r4)     // Catch:{ all -> 0x01d9 }
            int r14 = r13.mo62781b()     // Catch:{ all -> 0x01d9 }
            r7.append(r14)     // Catch:{ all -> 0x01d9 }
            java.lang.String r14 = r7.toString()     // Catch:{ all -> 0x01d9 }
            android.util.Log.i(r9, r14)     // Catch:{ all -> 0x01d9 }
            goto L_0x014e
        L_0x0127:
            boolean r2 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x014d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = "can't write to cache file in network task, cache file size: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            int r14 = r13.mo62781b()     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.w(r9, r14)     // Catch:{ all -> 0x01fe }
        L_0x014d:
            r2 = r5
        L_0x014e:
            com.bykv.vk.openvk.component.video.a.b.b.c r14 = r12.f24879b     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r12.f24885h     // Catch:{ all -> 0x01d9 }
            int r7 = r12.mo62671f()     // Catch:{ all -> 0x01d9 }
            com.bykv.vk.openvk.component.video.a.b.b.a r14 = r14.mo62712a((java.lang.String) r4, (int) r7)     // Catch:{ all -> 0x01d9 }
            if (r14 != 0) goto L_0x015e
            r14 = 0
            goto L_0x0160
        L_0x015e:
            int r14 = r14.f24933c     // Catch:{ all -> 0x01d9 }
        L_0x0160:
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x01d9 }
            java.io.InputStream r7 = r3.mo62749d()     // Catch:{ all -> 0x01d9 }
            r8 = 0
        L_0x0169:
            int r10 = r7.read(r4)     // Catch:{ all -> 0x01d5 }
            if (r10 < 0) goto L_0x01ad
            r12.mo62670e()     // Catch:{ all -> 0x01d5 }
            if (r10 <= 0) goto L_0x01a9
            r13.mo62782b(r4, r6, r10)     // Catch:{ all -> 0x01d5 }
            int r8 = r8 + r10
            if (r2 == 0) goto L_0x01a2
            r2.mo62786a(r4, r6, r10)     // Catch:{ all -> 0x017e }
            goto L_0x01a2
        L_0x017e:
            r10 = move-exception
            r2.mo62784a()     // Catch:{ all -> 0x01d5 }
            boolean r2 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01a0 }
            if (r2 == 0) goto L_0x019e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a0 }
            r2.<init>()     // Catch:{ all -> 0x01a0 }
            java.lang.String r11 = "append to cache file error in network task!!! "
            r2.append(r11)     // Catch:{ all -> 0x01a0 }
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ all -> 0x01a0 }
            r2.append(r10)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a0 }
            android.util.Log.e(r9, r2)     // Catch:{ all -> 0x01a0 }
        L_0x019e:
            r2 = r5
            goto L_0x01a2
        L_0x01a0:
            r13 = move-exception
            goto L_0x01d7
        L_0x01a2:
            int r10 = r13.mo62781b()     // Catch:{ all -> 0x01d5 }
            r12.mo62665a(r14, r10)     // Catch:{ all -> 0x01d5 }
        L_0x01a9:
            r12.mo62670e()     // Catch:{ all -> 0x01d5 }
            goto L_0x0169
        L_0x01ad:
            boolean r13 = com.bykv.p271vk.openvk.component.video.p272a.p276b.C10112e.f24979c     // Catch:{ all -> 0x01d5 }
            if (r13 == 0) goto L_0x01b6
            java.lang.String r13 = "read from net complete!"
            android.util.Log.i(r9, r13)     // Catch:{ all -> 0x01d5 }
        L_0x01b6:
            r12.mo62668c()     // Catch:{ all -> 0x01d5 }
            java.io.InputStream r13 = r3.mo62749d()
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28909a((java.io.Closeable) r13)
            if (r2 == 0) goto L_0x01c5
            r2.mo62784a()
        L_0x01c5:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.f24880c
            r13.addAndGet(r8)
            java.util.concurrent.atomic.AtomicLong r13 = r12.f24881d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r13.addAndGet(r2)
            return
        L_0x01d5:
            r13 = move-exception
            r5 = r2
        L_0x01d7:
            r6 = r8
            goto L_0x01ff
        L_0x01d9:
            r13 = move-exception
            r5 = r2
            goto L_0x01ff
        L_0x01dc:
            com.bykv.vk.openvk.component.video.a.b.c.c r13 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = r12.f24884g     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", url: "
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r13 = move-exception
        L_0x01ff:
            java.io.InputStream r14 = r3.mo62749d()
            com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a.m28909a((java.io.Closeable) r14)
            if (r5 == 0) goto L_0x020b
            r5.mo62784a()
        L_0x020b:
            java.util.concurrent.atomic.AtomicInteger r14 = r12.f24880c
            r14.addAndGet(r6)
            java.util.concurrent.atomic.AtomicLong r14 = r12.f24881d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r14.addAndGet(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p271vk.openvk.component.video.p272a.p276b.C10131g.m28865d(com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* renamed from: a */
    public void mo62664a() {
        super.mo62664a();
        m28867i();
    }

    /* renamed from: i */
    private void m28867i() {
        C10088b bVar = this.f25036p;
        this.f25036p = null;
        if (bVar != null) {
            bVar.mo62664a();
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$b */
    /* compiled from: ProxyTask */
    private static class C10135b {

        /* renamed from: a */
        private final OutputStream f25045a;

        /* renamed from: b */
        private int f25046b;

        /* renamed from: c */
        private boolean f25047c;

        C10135b(OutputStream outputStream, int i) {
            this.f25045a = outputStream;
            this.f25046b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo62780a() {
            return this.f25047c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo62779a(byte[] bArr, int i, int i2) throws C10101d {
            if (!this.f25047c) {
                try {
                    this.f25045a.write(bArr, i, i2);
                    this.f25047c = true;
                } catch (IOException e) {
                    throw new C10101d(e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo62782b(byte[] bArr, int i, int i2) throws C10101d {
            try {
                this.f25045a.write(bArr, i, i2);
                this.f25046b += i2;
            } catch (IOException e) {
                throw new C10101d(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo62781b() {
            return this.f25046b;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$a */
    /* compiled from: ProxyTask */
    static final class C10134a {

        /* renamed from: a */
        C10076a f25041a;

        /* renamed from: b */
        C10093c f25042b;

        /* renamed from: c */
        Socket f25043c;

        /* renamed from: d */
        C10136c f25044d;

        C10134a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10134a mo62775a(C10093c cVar) {
            if (cVar != null) {
                this.f25042b = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10134a mo62777a(Socket socket) {
            if (socket != null) {
                this.f25043c = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10134a mo62776a(C10136c cVar) {
            this.f25044d = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10131g mo62778a() {
            if (this.f25042b != null && this.f25043c != null) {
                return new C10131g(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
