package com.applovin.exoplayer2.p181b;

import android.os.Handler;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6864g;
import com.applovin.exoplayer2.p182c.C6920e;
import com.applovin.exoplayer2.p182c.C6924h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.b.g */
public interface C6864g {

    /* renamed from: com.applovin.exoplayer2.b.g$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(C6864g gVar, int i, long j, long j2) {
        }

        public static void $default$a(C6864g gVar, long j) {
        }

        @Deprecated
        public static void $default$a(C6864g gVar, C7864v vVar) {
        }

        public static void $default$a_(C6864g gVar, boolean z) {
        }

        public static void $default$b(C6864g gVar, C7864v vVar, C6924h hVar) {
        }

        public static void $default$b(C6864g gVar, Exception exc) {
        }

        public static void $default$b(C6864g gVar, String str) {
        }

        public static void $default$b(C6864g gVar, String str, long j, long j2) {
        }

        public static void $default$c(C6864g gVar, C6920e eVar) {
        }

        public static void $default$c(C6864g gVar, Exception exc) {
        }

        public static void $default$d(C6864g gVar, C6920e eVar) {
        }
    }

    /* renamed from: com.applovin.exoplayer2.b.g$a */
    public static final class C6865a {

        /* renamed from: a */
        private final Handler f15021a;

        /* renamed from: b */
        private final C6864g f15022b;

        public C6865a(Handler handler, C6864g gVar) {
            this.f15021a = gVar != null ? (Handler) C7717a.m22120b(handler) : null;
            this.f15022b = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17982b(int i, long j, long j2) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52460a(i, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17983b(long j) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52468a(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17984b(C7864v vVar, C6924h hVar) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52485a(vVar);
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52503b(vVar, hVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17985b(String str) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52505b(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17986b(String str, long j, long j2) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52506b(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17987b(boolean z) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52495a_(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m17988c(C6920e eVar) {
            eVar.mo53138a();
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52519d(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m17989c(Exception exc) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52514c(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m17990d(C6920e eVar) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52513c(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m17991d(Exception exc) {
            ((C6864g) C7728ai.m22198a(this.f15022b)).mo52504b(exc);
        }

        /* renamed from: a */
        public void mo52936a(int i, long j, long j2) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(i, j, j2) {
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ long f$2;
                    public final /* synthetic */ long f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r5;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17982b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52937a(long j) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(j) {
                    public final /* synthetic */ long f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17983b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52938a(C6920e eVar) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ C6920e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17990d(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52939a(C7864v vVar, C6924h hVar) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(vVar, hVar) {
                    public final /* synthetic */ C7864v f$1;
                    public final /* synthetic */ C6924h f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17984b(this.f$1, this.f$2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52940a(Exception exc) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17991d(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52941a(String str) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(str) {
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17985b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52942a(String str, long j, long j2) {
            Handler handler = this.f15021a;
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
                        C6864g.C6865a.this.m17986b(this.f$1, this.f$2, this.f$3);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo52943a(boolean z) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(z) {
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17987b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo52944b(C6920e eVar) {
            eVar.mo53138a();
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(eVar) {
                    public final /* synthetic */ C6920e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17988c(this.f$1);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo52945b(Exception exc) {
            Handler handler = this.f15021a;
            if (handler != null) {
                handler.post(new Runnable(exc) {
                    public final /* synthetic */ Exception f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C6864g.C6865a.this.m17989c(this.f$1);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    void mo52460a(int i, long j, long j2);

    /* renamed from: a */
    void mo52468a(long j);

    @Deprecated
    /* renamed from: a */
    void mo52485a(C7864v vVar);

    /* renamed from: a_ */
    void mo52495a_(boolean z);

    /* renamed from: b */
    void mo52503b(C7864v vVar, C6924h hVar);

    /* renamed from: b */
    void mo52504b(Exception exc);

    /* renamed from: b */
    void mo52505b(String str);

    /* renamed from: b */
    void mo52506b(String str, long j, long j2);

    /* renamed from: c */
    void mo52513c(C6920e eVar);

    /* renamed from: c */
    void mo52514c(Exception exc);

    /* renamed from: d */
    void mo52519d(C6920e eVar);
}
