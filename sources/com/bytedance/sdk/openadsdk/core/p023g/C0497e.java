package com.bytedance.sdk.openadsdk.core.p023g;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.g.e */
/* compiled from: PermissionsResultAction */
public abstract class C0497e {

    /* renamed from: a */
    private static final String f1791a = C0497e.class.getSimpleName();

    /* renamed from: b */
    private final Set<String> f1792b = new HashSet(1);

    /* renamed from: c */
    private Looper f1793c = Looper.getMainLooper();

    /* renamed from: a */
    public abstract void mo151a();

    /* renamed from: a */
    public abstract void mo152a(String str);

    /* renamed from: b */
    public synchronized boolean mo1577b(String str) {
        String str2 = f1791a;
        Log.d(str2, "Permission not found: " + str);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo1575a(String str, int i) {
        if (i == 0) {
            return mo1576a(str, C0495c.GRANTED);
        }
        return mo1576a(str, C0495c.DENIED);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.g.e$5 */
    /* compiled from: PermissionsResultAction */
    static /* synthetic */ class C05025 {

        /* renamed from: a */
        static final /* synthetic */ int[] f1800a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.g.c[] r0 = com.bytedance.sdk.openadsdk.core.p023g.C0495c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1800a = r0
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.p023g.C0495c.GRANTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1800a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.p023g.C0495c.DENIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1800a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.p023g.C0495c.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p023g.C0497e.C05025.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo1576a(final String str, C0495c cVar) {
        this.f1792b.remove(str);
        int i = C05025.f1800a[cVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                new Handler(this.f1793c).post(new Runnable() {
                    public void run() {
                        C0497e.this.mo152a(str);
                    }
                });
                return true;
            } else if (i == 3) {
                if (!mo1577b(str)) {
                    new Handler(this.f1793c).post(new Runnable() {
                        public void run() {
                            C0497e.this.mo152a(str);
                        }
                    });
                    return true;
                } else if (this.f1792b.isEmpty()) {
                    new Handler(this.f1793c).post(new Runnable() {
                        public void run() {
                            C0497e.this.mo151a();
                        }
                    });
                    return true;
                }
            }
        } else if (this.f1792b.isEmpty()) {
            new Handler(this.f1793c).post(new Runnable() {
                public void run() {
                    C0497e.this.mo151a();
                }
            });
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo1574a(String[] strArr) {
        Collections.addAll(this.f1792b, strArr);
    }
}
