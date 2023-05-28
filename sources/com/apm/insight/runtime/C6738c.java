package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.apm.insight.runtime.c */
public class C6738c {

    /* renamed from: a */
    private final List<ICrashCallback> f14474a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<ICrashCallback> f14475b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final List<ICrashCallback> f14476c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<ICrashCallback> f14477d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final List<IOOMCallback> f14478e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1 */
    static /* synthetic */ class C67391 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14479a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14479a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14479a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.ANR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14479a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14479a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14479a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C6738c.C67391.<clinit>():void");
        }
    }

    /* renamed from: a */
    public List<IOOMCallback> mo52281a() {
        return this.f14478e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52282a(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i = C67391.f14479a[crashType.ordinal()];
        if (i == 1) {
            this.f14474a.add(iCrashCallback);
            this.f14475b.add(iCrashCallback);
            this.f14476c.add(iCrashCallback);
        } else if (i != 2) {
            if (i == 3) {
                list = this.f14475b;
            } else if (i == 4) {
                list = this.f14474a;
            } else if (i == 5) {
                list = this.f14476c;
            } else {
                return;
            }
            list.add(iCrashCallback);
        }
        list = this.f14477d;
        list.add(iCrashCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52283a(IOOMCallback iOOMCallback) {
        this.f14478e.add(iOOMCallback);
    }

    /* renamed from: b */
    public List<ICrashCallback> mo52284b() {
        return this.f14474a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52285b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i = C67391.f14479a[crashType.ordinal()];
        if (i == 1) {
            this.f14474a.remove(iCrashCallback);
            this.f14475b.remove(iCrashCallback);
            this.f14476c.remove(iCrashCallback);
        } else if (i != 2) {
            if (i == 3) {
                list = this.f14475b;
            } else if (i == 4) {
                list = this.f14474a;
            } else if (i == 5) {
                list = this.f14476c;
            } else {
                return;
            }
            list.remove(iCrashCallback);
        }
        list = this.f14477d;
        list.remove(iCrashCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52286b(IOOMCallback iOOMCallback) {
        this.f14478e.remove(iOOMCallback);
    }

    /* renamed from: c */
    public List<ICrashCallback> mo52287c() {
        return this.f14475b;
    }

    /* renamed from: d */
    public List<ICrashCallback> mo52288d() {
        return this.f14476c;
    }

    /* renamed from: e */
    public List<ICrashCallback> mo52289e() {
        return this.f14477d;
    }
}
