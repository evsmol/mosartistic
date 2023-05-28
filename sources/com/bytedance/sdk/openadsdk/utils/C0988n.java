package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C0558m;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.openadsdk.utils.n */
/* compiled from: SimUtils */
public class C0988n {

    /* renamed from: a */
    private static String f3321a = null;

    /* renamed from: b */
    private static String f3322b = null;

    /* renamed from: c */
    private static String f3323c = null;

    /* renamed from: d */
    private static volatile boolean f3324d = true;

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|(9:4|5|6|7|8|(1:(1:11)(1:12))(1:13)|14|(1:16)(1:17)|18)|22|(2:23|24)|27|28|(3:32|33|34)|36|37|38|39|(1:44)(1:43)|45|(1:47)|48|(1:50)|51|(2:53|55)(1:57)) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004c, code lost:
        if (r4.length() < 5) goto L_0x004e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x005f A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006c A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0073 A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007b A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0083 A[Catch:{ all -> 0x0034, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4585e() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 1
            f3324d = r0
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0085 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ all -> 0x0085 }
            r2 = 0
            int r3 = r1.getSimState()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0023
            if (r3 == r0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            f3324d = r2     // Catch:{ all -> 0x0034 }
            goto L_0x0025
        L_0x0023:
            f3324d = r2     // Catch:{ all -> 0x0034 }
        L_0x0025:
            java.lang.String r0 = "MCC"
            boolean r3 = f3324d     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = "Have SIM card"
            goto L_0x0030
        L_0x002e:
            java.lang.String r3 = "No SIM card"
        L_0x0030:
            com.bytedance.sdk.component.utils.C10638l.m31242e(r0, r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0085 }
        L_0x0038:
            r0 = 0
            java.lang.String r3 = r1.getSimOperatorName()     // Catch:{ all -> 0x003e }
            goto L_0x003f
        L_0x003e:
            r3 = r0
        L_0x003f:
            java.lang.String r4 = r1.getNetworkOperator()     // Catch:{ all -> 0x0044 }
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x004e
            int r5 = r4.length()     // Catch:{ all -> 0x0085 }
            r6 = 5
            if (r5 >= r6) goto L_0x0052
        L_0x004e:
            java.lang.String r4 = r1.getSimOperator()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0085 }
            if (r1 != 0) goto L_0x006c
            int r1 = r4.length()     // Catch:{ all -> 0x0085 }
            r5 = 4
            if (r1 <= r5) goto L_0x006c
            r0 = 3
            java.lang.String r1 = r4.substring(r2, r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = r4.substring(r0)     // Catch:{ all -> 0x0085 }
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006d
        L_0x006c:
            r1 = r0
        L_0x006d:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x0075
            f3321a = r3     // Catch:{ all -> 0x0085 }
        L_0x0075:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0085 }
            if (r2 != 0) goto L_0x007d
            f3322b = r0     // Catch:{ all -> 0x0085 }
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0085
            f3323c = r1     // Catch:{ all -> 0x0085 }
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C0988n.m4585e():void");
    }

    /* renamed from: a */
    public static String m4581a() {
        C0989a.m4586c();
        return f3321a;
    }

    /* renamed from: b */
    public static String m4582b() {
        try {
            C0989a.m4586c();
            Configuration configuration = C0558m.m2663a().getResources().getConfiguration();
            String valueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : f3322b;
            C10638l.m31242e("MCC", "config=" + configuration.mcc + ",sMCC=" + f3322b);
            if (f3324d) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getMCC");
            sb.append(f3324d ? "Have SIM card" : "No SIM card, MCC returns null");
            C10638l.m31242e("MCC", sb.toString());
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m4583c() {
        C0989a.m4586c();
        return f3323c;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.n$a */
    /* compiled from: SimUtils */
    public static class C0989a extends C10618g {

        /* renamed from: a */
        public static AtomicBoolean f3325a = new AtomicBoolean(false);

        /* renamed from: b */
        private static AtomicLong f3326b = new AtomicLong(0);

        public C0989a(String str, int i) {
            super(str, i);
        }

        /* renamed from: c */
        public static void m4586c() {
            if (!f3325a.get()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f3326b.get() >= TTAdConstant.AD_MAX_EVENT_TIME) {
                    f3326b.set(currentTimeMillis);
                    C10615e.m31160a(new C0989a("UpdateSimStatusTask", 5), 5);
                }
            }
        }

        public void run() {
            f3325a.set(true);
            C0988n.m4585e();
            f3325a.set(false);
        }
    }
}
