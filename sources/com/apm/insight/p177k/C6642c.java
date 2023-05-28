package com.apm.insight.p177k;

import com.apm.insight.CrashType;
import com.appnext.base.p264b.C8849c;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.c */
public abstract class C6642c {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C6642c> f14287a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1 */
    static /* synthetic */ class C66431 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14288a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14288a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14288a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14288a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p177k.C6642c.C66431.<clinit>():void");
        }
    }

    /* renamed from: com.apm.insight.k.c$a */
    public static class C6644a {

        /* renamed from: a */
        private JSONObject f14289a;

        /* renamed from: b */
        private JSONObject f14290b;

        /* renamed from: c */
        private CrashType f14291c;

        C6644a(JSONObject jSONObject, CrashType crashType) {
            this.f14291c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f14289a = ((JSONArray) jSONObject.opt(C8849c.DATA)).optJSONObject(0);
            } else {
                this.f14289a = jSONObject;
            }
            this.f14290b = jSONObject.optJSONObject("header");
        }

        /* renamed from: a */
        public String mo52128a() {
            return this.f14289a.optString("crash_thread_name", (String) null);
        }

        /* renamed from: b */
        public long mo52129b() {
            return (long) this.f14289a.optInt("app_start_time", -1);
        }

        /* renamed from: c */
        public String mo52130c() {
            int i = C66431.f14288a[this.f14291c.ordinal()];
            if (i == 1) {
                return this.f14289a.optString(C8849c.DATA, (String) null);
            }
            if (i == 2) {
                return this.f14289a.optString("stack", (String) null);
            }
            if (i != 3) {
                return null;
            }
            return this.f14289a.optString(C8849c.DATA, (String) null);
        }
    }

    /* renamed from: a */
    static void m16398a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<C6642c> concurrentLinkedQueue = f14287a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            C6644a aVar = new C6644a(jSONObject, crashType);
            while (!f14287a.isEmpty()) {
                C6642c poll = f14287a.poll();
                if (poll != null) {
                    poll.mo52127a(crashType, aVar);
                }
            }
            f14287a = null;
        }
    }

    /* renamed from: a */
    public abstract void mo52127a(CrashType crashType, C6644a aVar);
}
