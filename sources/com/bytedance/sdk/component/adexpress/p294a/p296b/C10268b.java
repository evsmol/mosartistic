package com.bytedance.sdk.component.adexpress.p294a.p296b;

import android.os.Environment;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p325b.C10577a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10645r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.b */
/* compiled from: TemplateManager */
public class C10268b {

    /* renamed from: a */
    private static File f25350a;

    /* renamed from: b */
    private static volatile C10268b f25351b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AtomicBoolean f25352c = new AtomicBoolean(true);

    /* renamed from: d */
    private AtomicBoolean f25353d = new AtomicBoolean(false);

    /* renamed from: e */
    private boolean f25354e = false;

    /* renamed from: f */
    private AtomicBoolean f25355f = new AtomicBoolean(false);

    /* renamed from: g */
    private AtomicInteger f25356g = new AtomicInteger(0);

    /* renamed from: h */
    private AtomicLong f25357h = new AtomicLong();

    /* renamed from: a */
    public static C10268b m29502a() {
        if (f25351b == null) {
            synchronized (C10268b.class) {
                if (f25351b == null) {
                    f25351b = new C10268b();
                }
            }
        }
        return f25351b;
    }

    private C10268b() {
        m29509h();
    }

    /* renamed from: b */
    public void mo63100b() {
        m29509h();
    }

    /* renamed from: h */
    private void m29509h() {
        C10615e.m31160a(new C10618g(Constants.INIT) {
            public void run() {
                C10276e.m29540a();
                C10268b.this.f25352c.set(false);
                C10268b.this.m29510i();
                C10268b.this.mo63104e();
                if (C10262a.m29464a().mo63095c() != null && C10645r.m31269a(C10262a.m29464a().mo63095c().mo1819b())) {
                    C10262a.m29464a().mo63095c().mo1820c().post(new Runnable() {
                        public void run() {
                            if (C10262a.m29464a().mo63095c() != null) {
                                C10262a.m29464a().mo63095c().mo1821d();
                            }
                        }
                    });
                }
            }
        }, 10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[EDGE_INSN: B:22:0x007c->B:16:0x007c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m29510i() {
        /*
            r8 = this;
            java.lang.String r0 = "TemplateManager"
            java.lang.String r1 = "check template usable1"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r1)
            com.bytedance.sdk.component.adexpress.a.c.a r1 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29542b()
            if (r1 == 0) goto L_0x0098
            boolean r2 = r1.mo63131f()
            if (r2 != 0) goto L_0x0015
            goto L_0x0098
        L_0x0015:
            r2 = 1
            java.util.List r1 = r1.mo63130e()
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x007c
            java.lang.Object r3 = r1.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r3 = (com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a) r3
            java.lang.String r4 = r3.mo63133a()
            java.lang.String r5 = com.bytedance.sdk.component.utils.C10626e.m31201a((java.lang.String) r4)
            java.io.File r6 = new java.io.File
            java.io.File r7 = m29508f()
            r6.<init>(r7, r5)
            java.lang.String r5 = com.bytedance.sdk.component.utils.C10626e.m31200a((java.io.File) r6)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x005b
            boolean r7 = r6.isFile()
            if (r7 == 0) goto L_0x005b
            java.lang.String r7 = r3.mo63136b()
            if (r7 == 0) goto L_0x005b
            java.lang.String r3 = r3.mo63136b()
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x001e
        L_0x005b:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "check template usable3: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ","
            r1.append(r3)
            java.lang.String r3 = r6.getAbsolutePath()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r1)
        L_0x007c:
            if (r2 != 0) goto L_0x0081
            com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29545d()
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "check template usable4: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r1)
            r8.f25354e = r2
            return
        L_0x0098:
            java.lang.String r1 = "check template usable2"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b.m29510i():void");
    }

    /* renamed from: c */
    public boolean mo63102c() {
        return this.f25354e;
    }

    /* renamed from: d */
    public C10277a mo63103d() {
        return C10276e.m29542b();
    }

    /* renamed from: e */
    public void mo63104e() {
        mo63099a(false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:57|58|(2:60|61)|62|63|(2:65|66)|67|68|(2:74|(2:114|76)(1:77))|78|79|55|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0262, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0263, code lost:
        com.bytedance.sdk.component.utils.C10638l.m31230a("TemplateManager", "loadTemplate error: ", r12);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x017b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0184 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0215 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147 A[SYNTHETIC, Splitter:B:57:0x0147] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0181 A[SYNTHETIC, Splitter:B:65:0x0181] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bb A[Catch:{ all -> 0x0262 }, LOOP:2: B:54:0x013f->B:77:0x01bb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e1 A[Catch:{ all -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021b A[SYNTHETIC, Splitter:B:91:0x021b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo63099a(boolean r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f25352c
            boolean r0 = r0.get()
            java.lang.String r1 = "TemplateManager"
            if (r0 == 0) goto L_0x0010
            java.lang.String r12 = "loadTemplate error1"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r12)
            return
        L_0x0010:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f25353d     // Catch:{ all -> 0x0262 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x0034
            if (r12 == 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicInteger r0 = r11.f25356g     // Catch:{ all -> 0x0262 }
            r0.getAndIncrement()     // Catch:{ all -> 0x0262 }
        L_0x001f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r0.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = "loadTemplate error2: "
            r0.append(r2)     // Catch:{ all -> 0x0262 }
            r0.append(r12)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0262 }
            return
        L_0x0034:
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.f25353d     // Catch:{ all -> 0x0262 }
            r0 = 1
            r12.set(r0)     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.a.a r12 = com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a.m29464a()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.a.c r12 = r12.mo63095c()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a r12 = r12.mo1822e()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a r0 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29542b()     // Catch:{ all -> 0x0262 }
            r2 = 0
            if (r12 == 0) goto L_0x0252
            boolean r3 = r12.mo63131f()     // Catch:{ all -> 0x0262 }
            if (r3 != 0) goto L_0x0055
            goto L_0x0252
        L_0x0055:
            java.lang.String r3 = r12.mo63124b()     // Catch:{ all -> 0x0262 }
            boolean r3 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29543b(r3)     // Catch:{ all -> 0x0262 }
            if (r3 != 0) goto L_0x0073
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.f25353d     // Catch:{ all -> 0x0262 }
            r12.set(r2)     // Catch:{ all -> 0x0262 }
            java.util.concurrent.atomic.AtomicLong r12 = r11.f25357h     // Catch:{ all -> 0x0262 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0262 }
            r12.set(r2)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = "loadTemplate error4"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0262 }
            return
        L_0x0073:
            if (r3 == 0) goto L_0x0093
            com.bytedance.sdk.component.adexpress.a.a.a r3 = com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a.m29464a()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.a.c r3 = r3.mo63095c()     // Catch:{ all -> 0x0262 }
            if (r3 == 0) goto L_0x0093
            com.bytedance.sdk.component.adexpress.a.a.a r3 = com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a.m29464a()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.a.c r3 = r3.mo63095c()     // Catch:{ all -> 0x0262 }
            android.os.Handler r3 = r3.mo1820c()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.b.b$2 r4 = new com.bytedance.sdk.component.adexpress.a.b.b$2     // Catch:{ all -> 0x0262 }
            r4.<init>()     // Catch:{ all -> 0x0262 }
            r3.post(r4)     // Catch:{ all -> 0x0262 }
        L_0x0093:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0262 }
            r4.<init>()     // Catch:{ all -> 0x0262 }
            if (r0 == 0) goto L_0x012f
            java.util.List r5 = r0.mo63130e()     // Catch:{ all -> 0x0262 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x00ab
            goto L_0x012f
        L_0x00ab:
            java.util.List r5 = r12.mo63130e()     // Catch:{ all -> 0x0262 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x00c3
            java.util.List r0 = r0.mo63130e()     // Catch:{ all -> 0x0262 }
            r3.addAll(r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "loadTemplate update2"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0262 }
            goto L_0x013b
        L_0x00c3:
            java.util.List r5 = r12.mo63130e()     // Catch:{ all -> 0x0262 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0262 }
        L_0x00cb:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0262 }
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a$a r6 = (com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a) r6     // Catch:{ all -> 0x0262 }
            java.util.List r7 = r0.mo63130e()     // Catch:{ all -> 0x0262 }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x0262 }
            if (r7 != 0) goto L_0x00e5
            r4.add(r6)     // Catch:{ all -> 0x0262 }
            goto L_0x00cb
        L_0x00e5:
            java.lang.String r7 = r6.mo63133a()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a$a r7 = com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29539a((java.lang.String) r7)     // Catch:{ all -> 0x0262 }
            if (r7 == 0) goto L_0x00cb
            java.lang.String r8 = r6.mo63136b()     // Catch:{ all -> 0x0262 }
            if (r8 == 0) goto L_0x00cb
            java.lang.String r8 = r6.mo63136b()     // Catch:{ all -> 0x0262 }
            java.lang.String r7 = r7.mo63136b()     // Catch:{ all -> 0x0262 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0262 }
            if (r7 != 0) goto L_0x00cb
            r4.add(r6)     // Catch:{ all -> 0x0262 }
            goto L_0x00cb
        L_0x0107:
            java.util.List r0 = r0.mo63130e()     // Catch:{ all -> 0x0262 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0262 }
        L_0x010f:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x0129
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a$a r5 = (com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a) r5     // Catch:{ all -> 0x0262 }
            java.util.List r6 = r12.mo63130e()     // Catch:{ all -> 0x0262 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0262 }
            if (r6 != 0) goto L_0x010f
            r3.add(r5)     // Catch:{ all -> 0x0262 }
            goto L_0x010f
        L_0x0129:
            java.lang.String r0 = "loadTemplate update3"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0262 }
            goto L_0x013b
        L_0x012f:
            java.util.List r0 = r12.mo63130e()     // Catch:{ all -> 0x0262 }
            r4.addAll(r0)     // Catch:{ all -> 0x0262 }
            java.lang.String r0 = "loadTemplate update1"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0262 }
        L_0x013b:
            java.util.Iterator r0 = r4.iterator()     // Catch:{ all -> 0x0262 }
        L_0x013f:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0262 }
            java.lang.String r6 = ".tmp"
            if (r5 == 0) goto L_0x01d0
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a$a r5 = (com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a) r5     // Catch:{ all -> 0x0262 }
            java.lang.String r5 = r5.mo63133a()     // Catch:{ all -> 0x0262 }
            java.lang.String r7 = com.bytedance.sdk.component.utils.C10626e.m31201a((java.lang.String) r5)     // Catch:{ all -> 0x0262 }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x0262 }
            java.io.File r9 = m29508f()     // Catch:{ all -> 0x0262 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0262 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r10.<init>()     // Catch:{ all -> 0x0262 }
            r10.append(r8)     // Catch:{ all -> 0x0262 }
            r10.append(r6)     // Catch:{ all -> 0x0262 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0262 }
            r9.<init>(r6)     // Catch:{ all -> 0x0262 }
            boolean r6 = r8.exists()     // Catch:{ all -> 0x0262 }
            if (r6 == 0) goto L_0x017b
            r8.delete()     // Catch:{ all -> 0x017b }
        L_0x017b:
            boolean r6 = r9.exists()     // Catch:{ all -> 0x0262 }
            if (r6 == 0) goto L_0x0184
            r9.delete()     // Catch:{ all -> 0x0184 }
        L_0x0184:
            com.bytedance.sdk.component.adexpress.a.a.a r6 = com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a.m29464a()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.a.c r6 = r6.mo63095c()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.e.b.a r6 = r6.mo1823f()     // Catch:{ all -> 0x0262 }
            r6.mo64176a((java.lang.String) r5)     // Catch:{ all -> 0x0262 }
            java.io.File r5 = m29508f()     // Catch:{ all -> 0x0262 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x0262 }
            r6.mo64171a(r5, r7)     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.e.b r5 = r6.mo64168a()     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x01c2
            boolean r6 = r5.mo64166f()     // Catch:{ all -> 0x0262 }
            if (r6 == 0) goto L_0x01c2
            java.io.File r6 = r5.mo64165e()     // Catch:{ all -> 0x0262 }
            if (r6 == 0) goto L_0x01c2
            java.io.File r5 = r5.mo64165e()     // Catch:{ all -> 0x0262 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0262 }
            if (r5 != 0) goto L_0x01bb
            goto L_0x01c2
        L_0x01bb:
            java.lang.String r5 = "loadTemplate success"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0262 }
            goto L_0x013f
        L_0x01c2:
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.f25353d     // Catch:{ all -> 0x0262 }
            r12.set(r2)     // Catch:{ all -> 0x0262 }
            r11.m29506a((java.util.List<com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a>) r4)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = "loadTemplate error5"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0262 }
            return
        L_0x01d0:
            java.lang.String r0 = r12.mo63128d()     // Catch:{ all -> 0x0262 }
            r11.m29505a((java.lang.String) r0)     // Catch:{ all -> 0x0262 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x0262 }
        L_0x01db:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0262 }
            if (r3 == 0) goto L_0x021f
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.a.c.a$a r3 = (com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a.C10278a) r3     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = r3.mo63133a()     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = com.bytedance.sdk.component.utils.C10626e.m31201a((java.lang.String) r3)     // Catch:{ all -> 0x0262 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0262 }
            java.io.File r5 = m29508f()     // Catch:{ all -> 0x0262 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0262 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r5.<init>()     // Catch:{ all -> 0x0262 }
            r5.append(r4)     // Catch:{ all -> 0x0262 }
            r5.append(r6)     // Catch:{ all -> 0x0262 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0262 }
            r3.<init>(r5)     // Catch:{ all -> 0x0262 }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x0262 }
            if (r5 == 0) goto L_0x0215
            r4.delete()     // Catch:{ all -> 0x0215 }
        L_0x0215:
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0262 }
            if (r4 == 0) goto L_0x01db
            r3.delete()     // Catch:{ all -> 0x01db }
            goto L_0x01db
        L_0x021f:
            com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29541a((com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a) r12)     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.adexpress.p294a.p296b.C10276e.m29544c()     // Catch:{ all -> 0x0262 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r0.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r3 = "loadTemplate update success: "
            r0.append(r3)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = r12.mo63124b()     // Catch:{ all -> 0x0262 }
            r0.append(r12)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x0262 }
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0262 }
            r11.m29510i()     // Catch:{ all -> 0x0262 }
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.f25353d     // Catch:{ all -> 0x0262 }
            r12.set(r2)     // Catch:{ all -> 0x0262 }
            java.util.concurrent.atomic.AtomicLong r12 = r11.f25357h     // Catch:{ all -> 0x0262 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0262 }
            r12.set(r2)     // Catch:{ all -> 0x0262 }
            r11.m29511j()     // Catch:{ all -> 0x0262 }
            goto L_0x0268
        L_0x0252:
            java.util.concurrent.atomic.AtomicBoolean r12 = r11.f25353d     // Catch:{ all -> 0x0262 }
            r12.set(r2)     // Catch:{ all -> 0x0262 }
            r12 = 109(0x6d, float:1.53E-43)
            r11.m29504a((int) r12)     // Catch:{ all -> 0x0262 }
            java.lang.String r12 = "loadTemplate error3"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x0262 }
            return
        L_0x0262:
            r12 = move-exception
            java.lang.String r0 = "loadTemplate error: "
            com.bytedance.sdk.component.utils.C10638l.m31230a(r1, r0, r12)
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b.mo63099a(boolean):void");
    }

    /* renamed from: a */
    private void m29505a(String str) {
        String a = C10626e.m31201a(str);
        C10577a f = C10262a.m29464a().mo63095c().mo1823f();
        f.mo64176a(str);
        f.mo64171a(m29508f().getAbsolutePath(), a);
        C10576b a2 = f.mo64168a();
        if (a2 == null || !a2.mo64166f() || a2.mo64165e() == null || !a2.mo64165e().exists()) {
            File file = new File(m29508f(), a);
            File file2 = new File(file + C8850d.f22419eY);
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m29504a(int i) {
        if (C10262a.m29464a().mo63096d() != null) {
            C10262a.m29464a().mo63096d().mo1829a(i);
        }
    }

    /* renamed from: j */
    private void m29511j() {
        if (this.f25356g.getAndSet(0) > 0 && System.currentTimeMillis() - this.f25357h.get() > TTAdConstant.AD_MAX_EVENT_TIME) {
            mo63104e();
        }
    }

    /* renamed from: a */
    private void m29506a(List<C10277a.C10278a> list) {
        if (list != null && !list.isEmpty()) {
            for (C10277a.C10278a a : list) {
                File file = new File(m29508f(), C10626e.m31201a(a.mo63133a()));
                File file2 = new File(file + C8850d.f22419eY);
                if (file.exists()) {
                    try {
                        file.delete();
                    } catch (Throwable unused) {
                    }
                }
                if (file2.exists()) {
                    try {
                        file2.delete();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static File m29508f() {
        File file;
        if (f25350a == null) {
            try {
                if (C10303c.m29744b()) {
                    file = C10262a.m29464a().mo63095c().mo1819b().getCacheDir();
                } else if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && C10262a.m29464a().mo63095c().mo1819b().getExternalCacheDir() != null) {
                    file = C10262a.m29464a().mo63095c().mo1819b().getExternalCacheDir();
                } else {
                    file = C10262a.m29464a().mo63095c().mo1819b().getCacheDir();
                }
                File file2 = new File(new File(file, "tt_tmpl_pkg"), "template");
                file2.mkdirs();
                f25350a = file2;
            } catch (Throwable th) {
                C10638l.m31239c("TemplateManager", "getTemplateDir error", th);
            }
        }
        return f25350a;
    }

    /* renamed from: b */
    public void mo63101b(boolean z) {
        this.f25355f.set(z);
    }

    /* renamed from: g */
    public void mo63105g() {
        this.f25355f.set(true);
        this.f25354e = false;
        this.f25353d.set(false);
    }
}
