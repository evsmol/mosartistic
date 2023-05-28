package com.appnext.base;

import android.content.Context;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.p264b.C8854g;
import com.appnext.base.p264b.C8856i;
import com.appnext.base.p264b.C8857j;
import com.appnext.base.services.OperationService;
import com.appnext.core.C8917f;

public class Appnext {

    /* renamed from: dp */
    private static final Appnext f22357dp = new Appnext();
    /* access modifiers changed from: private */

    /* renamed from: do */
    public Context f22358do = null;
    /* access modifiers changed from: private */

    /* renamed from: dq */
    public boolean f22359dq = false;

    private Appnext() {
    }

    /* renamed from: T */
    protected static Appnext m26568T() {
        return f22357dp;
    }

    /* renamed from: b */
    private void m26572b(Context context) throws ExceptionInInitializerError {
        if (context != null) {
            try {
                if (!this.f22359dq || this.f22358do == null) {
                    this.f22359dq = true;
                    C8852e.init(context);
                    this.f22358do = context.getApplicationContext();
                    if (C8857j.m26702a(OperationService.class)) {
                        C8854g.m26679aN().mo58748b(new Runnable() {
                            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run() {
                                /*
                                    r14 = this;
                                    android.content.Context r0 = com.appnext.base.p264b.C8852e.getContext()     // Catch:{ all -> 0x00a6 }
                                    r1 = 1
                                    java.lang.String r0 = com.appnext.core.C8917f.m26931b((android.content.Context) r0, (boolean) r1)     // Catch:{ all -> 0x00a6 }
                                    java.lang.String r2 = "aidForSend"
                                    com.appnext.base.b.d$a r3 = com.appnext.base.p264b.C8850d.C8851a.String     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.p264b.C8857j.m26700a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.base.p264b.C8850d.C8851a) r3)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.b.i r0 = com.appnext.base.p264b.C8856i.m26695aR()     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r2 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r2 = r2.f22358do     // Catch:{ all -> 0x00a6 }
                                    r0.init(r2)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r0 = r0.f22358do     // Catch:{ all -> 0x00a6 }
                                    boolean r0 = com.appnext.base.p264b.C8857j.m26712i(r0)     // Catch:{ all -> 0x00a6 }
                                    if (r0 == 0) goto L_0x0039
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    r2 = 0
                                    boolean unused = r0.f22359dq = false     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.b.i r0 = com.appnext.base.p264b.C8856i.m26695aR()     // Catch:{ all -> 0x00a6 }
                                    java.lang.String r2 = "lat"
                                    r0.putBoolean(r2, r1)     // Catch:{ all -> 0x00a6 }
                                    return
                                L_0x0039:
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r0 = r0.f22358do     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.p264b.C8852e.init(r0)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.b.i r0 = com.appnext.base.p264b.C8856i.m26695aR()     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r2 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r2 = r2.f22358do     // Catch:{ all -> 0x00a6 }
                                    r0.init(r2)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext.m26573b((com.appnext.base.Appnext) r0)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r0 = r0.f22358do     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.a.a r2 = com.appnext.base.p260a.C8831a.m26576X()     // Catch:{  }
                                    com.appnext.base.a.c.c r2 = r2.mo58686ab()     // Catch:{  }
                                    java.util.List r2 = r2.mo58721as()     // Catch:{  }
                                    if (r2 == 0) goto L_0x00a6
                                    int r2 = r2.size()     // Catch:{  }
                                    if (r2 != 0) goto L_0x00a6
                                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                                    java.lang.String r3 = "cdm"
                                    r2.<init>(r3)     // Catch:{  }
                                    long r3 = java.lang.System.currentTimeMillis()     // Catch:{  }
                                    r2.append(r3)     // Catch:{  }
                                    java.lang.String r12 = r2.toString()     // Catch:{  }
                                    com.appnext.base.a.b.c r2 = new com.appnext.base.a.b.c     // Catch:{  }
                                    java.lang.String r6 = "on"
                                    java.lang.String r7 = "1"
                                    java.lang.String r8 = "hour"
                                    java.lang.String r9 = "1"
                                    java.lang.String r10 = "interval"
                                    java.lang.String r11 = "cdm"
                                    r13 = 0
                                    r5 = r2
                                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{  }
                                    com.appnext.base.a.a r3 = com.appnext.base.p260a.C8831a.m26576X()     // Catch:{  }
                                    com.appnext.base.a.c.c r3 = r3.mo58686ab()     // Catch:{  }
                                    r3.mo58719a((com.appnext.base.p260a.p262b.C8838c) r2)     // Catch:{  }
                                    com.appnext.base.services.b.a r0 = com.appnext.base.services.p266b.C8873a.m26797d(r0)     // Catch:{  }
                                    r0.mo58814a(r2, r1)     // Catch:{  }
                                L_0x00a6:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.Appnext.C88281.run():void");
                            }
                        });
                        return;
                    }
                    return;
                }
                this.f22358do = context.getApplicationContext();
            } catch (Throwable unused) {
            }
        } else {
            throw new ExceptionInInitializerError("Cannot init Appnext with null context");
        }
    }

    public static void setParam(String str, String str2) {
        try {
            if (C8852e.getContext() != null && str.hashCode() == 951500826) {
                C8857j.m26700a(C8850d.f22435fo, str2, C8850d.C8851a.Boolean);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: U */
    private void m26569U() {
        try {
            String b = C8917f.m26931b(this.f22358do, true);
            if (!b.equals(C8856i.m26695aR().getString(C8856i.f22444fB, ""))) {
                C8856i.m26695aR().clear();
                C8856i.m26695aR().putString(C8856i.f22444fB, b);
            }
        } catch (Throwable unused) {
        }
    }

    public static void init(Context context) {
        Appnext appnext = f22357dp;
        if (context != null) {
            try {
                if (!appnext.f22359dq || appnext.f22358do == null) {
                    appnext.f22359dq = true;
                    C8852e.init(context);
                    appnext.f22358do = context.getApplicationContext();
                    if (C8857j.m26702a(OperationService.class)) {
                        C8854g.m26679aN().mo58748b(new Runnable() {
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run() {
                                /*
                                    r14 = this;
                                    android.content.Context r0 = com.appnext.base.p264b.C8852e.getContext()     // Catch:{ all -> 0x00a6 }
                                    r1 = 1
                                    java.lang.String r0 = com.appnext.core.C8917f.m26931b((android.content.Context) r0, (boolean) r1)     // Catch:{ all -> 0x00a6 }
                                    java.lang.String r2 = "aidForSend"
                                    com.appnext.base.b.d$a r3 = com.appnext.base.p264b.C8850d.C8851a.String     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.p264b.C8857j.m26700a((java.lang.String) r2, (java.lang.String) r0, (com.appnext.base.p264b.C8850d.C8851a) r3)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.b.i r0 = com.appnext.base.p264b.C8856i.m26695aR()     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r2 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r2 = r2.f22358do     // Catch:{ all -> 0x00a6 }
                                    r0.init(r2)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r0 = r0.f22358do     // Catch:{ all -> 0x00a6 }
                                    boolean r0 = com.appnext.base.p264b.C8857j.m26712i(r0)     // Catch:{ all -> 0x00a6 }
                                    if (r0 == 0) goto L_0x0039
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    r2 = 0
                                    boolean unused = r0.f22359dq = false     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.b.i r0 = com.appnext.base.p264b.C8856i.m26695aR()     // Catch:{ all -> 0x00a6 }
                                    java.lang.String r2 = "lat"
                                    r0.putBoolean(r2, r1)     // Catch:{ all -> 0x00a6 }
                                    return
                                L_0x0039:
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r0 = r0.f22358do     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.p264b.C8852e.init(r0)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.b.i r0 = com.appnext.base.p264b.C8856i.m26695aR()     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r2 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r2 = r2.f22358do     // Catch:{ all -> 0x00a6 }
                                    r0.init(r2)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext.m26573b((com.appnext.base.Appnext) r0)     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.Appnext r0 = com.appnext.base.Appnext.this     // Catch:{ all -> 0x00a6 }
                                    android.content.Context r0 = r0.f22358do     // Catch:{ all -> 0x00a6 }
                                    com.appnext.base.a.a r2 = com.appnext.base.p260a.C8831a.m26576X()     // Catch:{  }
                                    com.appnext.base.a.c.c r2 = r2.mo58686ab()     // Catch:{  }
                                    java.util.List r2 = r2.mo58721as()     // Catch:{  }
                                    if (r2 == 0) goto L_0x00a6
                                    int r2 = r2.size()     // Catch:{  }
                                    if (r2 != 0) goto L_0x00a6
                                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                                    java.lang.String r3 = "cdm"
                                    r2.<init>(r3)     // Catch:{  }
                                    long r3 = java.lang.System.currentTimeMillis()     // Catch:{  }
                                    r2.append(r3)     // Catch:{  }
                                    java.lang.String r12 = r2.toString()     // Catch:{  }
                                    com.appnext.base.a.b.c r2 = new com.appnext.base.a.b.c     // Catch:{  }
                                    java.lang.String r6 = "on"
                                    java.lang.String r7 = "1"
                                    java.lang.String r8 = "hour"
                                    java.lang.String r9 = "1"
                                    java.lang.String r10 = "interval"
                                    java.lang.String r11 = "cdm"
                                    r13 = 0
                                    r5 = r2
                                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{  }
                                    com.appnext.base.a.a r3 = com.appnext.base.p260a.C8831a.m26576X()     // Catch:{  }
                                    com.appnext.base.a.c.c r3 = r3.mo58686ab()     // Catch:{  }
                                    r3.mo58719a((com.appnext.base.p260a.p262b.C8838c) r2)     // Catch:{  }
                                    com.appnext.base.services.b.a r0 = com.appnext.base.services.p266b.C8873a.m26797d(r0)     // Catch:{  }
                                    r0.mo58814a(r2, r1)     // Catch:{  }
                                L_0x00a6:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.Appnext.C88281.run():void");
                            }
                        });
                        return;
                    }
                    return;
                }
                appnext.f22358do = context.getApplicationContext();
            } catch (Throwable unused) {
            }
        } else {
            throw new ExceptionInInitializerError("Cannot init Appnext with null context");
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m26573b(Appnext appnext) {
        try {
            String b = C8917f.m26931b(appnext.f22358do, true);
            if (!b.equals(C8856i.m26695aR().getString(C8856i.f22444fB, ""))) {
                C8856i.m26695aR().clear();
                C8856i.m26695aR().putString(C8856i.f22444fB, b);
            }
        } catch (Throwable unused) {
        }
    }
}
