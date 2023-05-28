package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Handler;
import com.yandex.metrica.C10718c;
import com.yandex.metrica.C10725i;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import com.yandex.metrica.impl.p082ob.C2753Z0;
import com.yandex.metrica.impl.p082ob.C3685y6;
import com.yandex.metrica.rtm.wrapper.C3775e;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.P2 */
public class C2415P2 implements C2502S0 {

    /* renamed from: a */
    private final Context f6417a;

    /* renamed from: b */
    private final Handler f6418b;

    /* renamed from: c */
    private final C2443Q f6419c;

    /* renamed from: d */
    private final C3650xb f6420d;

    /* renamed from: e */
    private final ICommonExecutor f6421e;

    /* renamed from: f */
    private final C3520u f6422f;

    /* renamed from: g */
    private volatile C1909C1 f6423g;

    /* renamed from: h */
    private C3685y6 f6424h;

    /* renamed from: i */
    private final C3775e f6425i;

    /* renamed from: j */
    private final C3014h1 f6426j;

    /* renamed from: k */
    private boolean f6427k;

    C2415P2(Context context, C2166Im im) {
        this(context.getApplicationContext(), im.mo15961b(), im.mo15960a());
    }

    /* renamed from: e */
    private void m8105e() {
        if (C2753Z0.m8930a("com.yandex.metrica.CounterConfiguration")) {
            this.f6421e.execute(new C2750Yl(this.f6417a));
            return;
        }
        throw new C2753Z0.C2754a("\nClass com.yandex.metrica.CounterConfiguration isn't found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################");
    }

    /* renamed from: a */
    public synchronized void mo16441a(C10725i iVar, C2361O0 o0) {
        if (!this.f6427k) {
            Boolean bool = iVar.crashReporting;
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue() && this.f6423g == null) {
                C2719Xg xg = new C2719Xg(this.f6425i);
                C1915C6 c6 = new C1915C6(this.f6417a, new C3681y2(o0, "20799a27-fa80-4b36-b2db-0f8141f24180"), (C3685y6.C3686a) new C2293M2(this), (C10718c) null);
                C1915C6 c62 = new C1915C6(this.f6417a, new C3681y2(o0, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), (C3685y6.C3686a) new C2327N2(this), (C10718c) null);
                if (this.f6424h == null) {
                    this.f6424h = new C1915C6(this.f6417a, (C3681y2) new C3046i1(o0, iVar), (C3685y6.C3686a) new C2363O2(this), iVar.f26880l);
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                this.f6423g = new C1909C1(defaultUncaughtExceptionHandler, Arrays.asList(new C1854A6[]{xg, c6, c62, this.f6424h}), C2410P.m8089g().mo16436j(), new C3048i3(), new C3112k3());
                Thread.setDefaultUncaughtExceptionHandler(this.f6423g);
            }
            Boolean bool3 = iVar.appOpenTrackingEnabled;
            if (bool3 != null) {
                bool2 = bool3;
            }
            if (bool2.booleanValue()) {
                this.f6422f.mo18244a();
            }
            this.f6427k = true;
        }
    }

    /* renamed from: b */
    public ICommonExecutor mo16443b() {
        return this.f6421e;
    }

    /* renamed from: c */
    public Handler mo16444c() {
        return this.f6418b;
    }

    /* renamed from: d */
    public C1984Eb mo16445d() {
        return this.f6420d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C2415P2(android.content.Context r9, com.yandex.metrica.core.api.executors.IHandlerExecutor r10, com.yandex.metrica.core.api.executors.ICommonExecutor r11) {
        /*
            r8 = this;
            com.yandex.metrica.impl.ob.xb r6 = new com.yandex.metrica.impl.ob.xb
            com.yandex.metrica.impl.ob.xb$c r1 = new com.yandex.metrica.impl.ob.xb$c
            r1.<init>()
            com.yandex.metrica.impl.ob.xb$e r2 = new com.yandex.metrica.impl.ob.xb$e
            r2.<init>()
            com.yandex.metrica.impl.ob.xb$e r3 = new com.yandex.metrica.impl.ob.xb$e
            r3.<init>()
            java.lang.String r5 = "Client"
            r0 = r6
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.yandex.metrica.impl.ob.Q r4 = new com.yandex.metrica.impl.ob.Q
            r4.<init>()
            com.yandex.metrica.impl.ob.u r5 = new com.yandex.metrica.impl.ob.u
            r5.<init>(r11)
            com.yandex.metrica.impl.ob.Zg r11 = new com.yandex.metrica.impl.ob.Zg
            r11.<init>()
            com.yandex.metrica.impl.ob.h1 r7 = new com.yandex.metrica.impl.ob.h1
            r7.<init>()
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2415P2.<init>(android.content.Context, com.yandex.metrica.core.api.executors.IHandlerExecutor, com.yandex.metrica.core.api.executors.ICommonExecutor):void");
    }

    C2415P2(Context context, C3650xb xbVar, IHandlerExecutor iHandlerExecutor, C2443Q q, C3520u uVar, C2772Zg zg, C3014h1 h1Var) {
        this.f6427k = false;
        this.f6417a = context;
        this.f6421e = iHandlerExecutor;
        this.f6422f = uVar;
        this.f6426j = h1Var;
        C2670Vl.m8797a(context);
        C3015h2.m9663b();
        this.f6420d = xbVar;
        xbVar.mo18398c(context);
        this.f6418b = iHandlerExecutor.getHandler();
        this.f6419c = q;
        q.mo16497a();
        this.f6425i = zg.mo17113a(context);
        m8105e();
    }

    /* renamed from: a */
    public void mo16442a(Map<String, Object> map) {
        this.f6426j.mo17647a(map);
    }

    /* renamed from: a */
    public C3520u mo16440a() {
        return this.f6422f;
    }
}
