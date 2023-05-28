package com.applovin.exoplayer2.p222m;

import android.os.Handler;
import android.os.SystemClock;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p182c.C6920e;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p222m.C7814n;

/* renamed from: com.applovin.exoplayer2.m.n */
public interface C7814n {

    /* renamed from: com.applovin.exoplayer2.m.n$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C7814n nVar, int i, long j) {
        }

        public static void $default$a(C7814n nVar, long j, int i) {
        }

        public static void $default$a(C7814n nVar, C6920e eVar) {
        }

        public static void $default$a(C7814n nVar, C7816o oVar) {
        }

        public static void $default$a(C7814n nVar, C7864v vVar, C6924h hVar) {
        }

        public static void $default$a(C7814n nVar, Exception exc) {
        }

        public static void $default$a(C7814n nVar, Object obj, long j) {
        }

        public static void $default$a(C7814n nVar, String str) {
        }

        public static void $default$a(C7814n nVar, String str, long j, long j2) {
        }

        @Deprecated
        public static void $default$a_(C7814n nVar, C7864v vVar) {
        }

        public static void $default$b(C7814n nVar, C6920e eVar) {
        }
    }

    /* renamed from: com.applovin.exoplayer2.m.n$a */
    public static final class C7815a {

        /* renamed from: a */
        private final Handler f18540a;

        /* renamed from: b */
        private final C7814n f18541b;

        public C7815a(Handler handler, C7814n nVar) {
            this.f18540a = nVar != null ? (Handler) C7717a.m22120b(handler) : null;
            this.f18541b = nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m22693a(Object obj, long j) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52488a(obj, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22694b(int i, long j) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52459a(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22695b(long j, int i) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52469a(j, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22696b(C7816o oVar) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52483a(oVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22697b(C7864v vVar, C6924h hVar) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52494a_(vVar);
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52486a(vVar, hVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22698b(Exception exc) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52487a(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22699b(String str) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52489a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m22700b(String str, long j, long j2) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52490a(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m22701c(C6920e eVar) {
            eVar.mo53138a();
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52502b(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m22702d(C6920e eVar) {
            ((C7814n) C7728ai.m22198a(this.f18541b)).mo52480a(eVar);
        }

        /* renamed from: a */
        public void mo55211a(int i, long j) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(i, j) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22694b(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55212a(long j, int i) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(j, i) {
                    public final /* synthetic */ long f$1;
                    public final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r4;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22695b(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55213a(C6920e eVar) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ C6920e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22702d(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55214a(C7816o oVar) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(oVar) {
                    public final /* synthetic */ C7816o f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22696b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55215a(C7864v vVar, C6924h hVar) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(vVar, hVar) {
                    public final /* synthetic */ C7864v f$1;
                    public final /* synthetic */ C6924h f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22697b(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55216a(Exception exc) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22698b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55217a(Object obj) {
            if (this.f18540a != null) {
                this.f18540a.post(new Runnable(obj, SystemClock.elapsedRealtime()) {
                    public final /* synthetic */ Object f$1;
                    public final /* synthetic */ long f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22693a(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55218a(String str) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22699b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo55219a(String str, long j, long j2) {
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(str, j, j2) {
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22700b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo55220b(C6920e eVar) {
            eVar.mo53138a();
            Handler handler = this.f18540a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ C6920e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C7814n.C7815a.this.m22701c(this.f$1);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo52459a(int i, long j);

    /* renamed from: a */
    void mo52469a(long j, int i);

    /* renamed from: a */
    void mo52480a(C6920e eVar);

    /* renamed from: a */
    void mo52483a(C7816o oVar);

    /* renamed from: a */
    void mo52486a(C7864v vVar, C6924h hVar);

    /* renamed from: a */
    void mo52487a(Exception exc);

    /* renamed from: a */
    void mo52488a(Object obj, long j);

    /* renamed from: a */
    void mo52489a(String str);

    /* renamed from: a */
    void mo52490a(String str, long j, long j2);

    @Deprecated
    /* renamed from: a_ */
    void mo52494a_(C7864v vVar);

    /* renamed from: b */
    void mo52502b(C6920e eVar);
}
