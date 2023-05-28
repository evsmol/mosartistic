package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.C10705b;
import com.yandex.metrica.rtm.wrapper.C3779i;
import com.yandex.metrica.rtm.wrapper.C3780j;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.Zg */
public class C2772Zg {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1877B0 f7280a;

    /* renamed from: com.yandex.metrica.impl.ob.Zg$a */
    class C2773a implements C3779i {
        C2773a() {
        }

        public File getCrashesDirectory(Context context) {
            return C2772Zg.this.f7280a.mo15519a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C2772Zg.this.f7280a.mo15519a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zg$b */
    class C2774b implements C3780j {
        C2774b(C2772Zg zg) {
        }

        public String getDeviceType(Context context) {
            C10705b a = C2007F0.m7154g().mo15751n().mo17477a().mo17355a();
            if (a == null) {
                return null;
            }
            return a.mo64728a();
        }

        public String getVersion(Context context) {
            return C1848A2.m6796a(context, context.getPackageName());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zg$c */
    class C2775c implements C3779i {
        C2775c() {
        }

        public File getCrashesDirectory(Context context) {
            return C2772Zg.this.f7280a.mo15519a(context, "appmetrica_rtm_crashes");
        }

        public File getCrashesTriggerDirectory(Context context) {
            return C2772Zg.this.f7280a.mo15519a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public C2772Zg() {
        this(new C1877B0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.C3776f mo17114b(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p082ob.C3015h2.m9660a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0024
            com.yandex.metrica.rtm.wrapper.l r0 = new com.yandex.metrica.rtm.wrapper.l     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.Zg$a r1 = new com.yandex.metrica.impl.ob.Zg$a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.F0 r2 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.Pm r2 = r2.mo15754q()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.core.api.executors.ICommonExecutor r2 = r2.mo16493f()     // Catch:{ all -> 0x0024 }
            com.yandex.metrica.impl.ob.Zg$b r3 = new com.yandex.metrica.impl.ob.Zg$b     // Catch:{ all -> 0x0024 }
            r3.<init>(r4)     // Catch:{ all -> 0x0024 }
            r0.<init>(r1, r5, r2, r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x002c
            com.yandex.metrica.impl.ob.Wg r0 = new com.yandex.metrica.impl.ob.Wg
            r0.<init>()
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2772Zg.mo17114b(android.content.Context):com.yandex.metrica.rtm.wrapper.f");
    }

    C2772Zg(C1877B0 b0) {
        this.f7280a = b0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.C3775e mo17113a(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p082ob.C3015h2.m9660a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0013
            com.yandex.metrica.rtm.wrapper.h r0 = new com.yandex.metrica.rtm.wrapper.h     // Catch:{ all -> 0x0013 }
            com.yandex.metrica.impl.ob.Zg$c r1 = new com.yandex.metrica.impl.ob.Zg$c     // Catch:{ all -> 0x0013 }
            r1.<init>()     // Catch:{ all -> 0x0013 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 != 0) goto L_0x001b
            com.yandex.metrica.impl.ob.Vg r0 = new com.yandex.metrica.impl.ob.Vg
            r0.<init>()
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2772Zg.mo17113a(android.content.Context):com.yandex.metrica.rtm.wrapper.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.rtm.wrapper.C3774d mo17112a(com.yandex.metrica.rtm.wrapper.C3781k r2, java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "com.yandex.metrica.rtm.client.ExceptionProcessor"
            boolean r0 = com.yandex.metrica.impl.p082ob.C3015h2.m9660a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000e
            com.yandex.metrica.rtm.wrapper.g r0 = new com.yandex.metrica.rtm.wrapper.g     // Catch:{ all -> 0x000e }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0016
            com.yandex.metrica.impl.ob.Ug r0 = new com.yandex.metrica.impl.ob.Ug
            r0.<init>()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2772Zg.mo17112a(com.yandex.metrica.rtm.wrapper.k, java.lang.String, boolean):com.yandex.metrica.rtm.wrapper.d");
    }
}
