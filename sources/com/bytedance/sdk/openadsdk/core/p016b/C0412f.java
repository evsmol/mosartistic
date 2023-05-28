package com.bytedance.sdk.openadsdk.core.p016b;

import android.util.SparseArray;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.f */
/* compiled from: TouchInfoHelper */
public class C0412f {

    /* renamed from: j */
    public static int f1373j = ViewConfiguration.get(C0558m.m2663a()).getScaledTouchSlop();

    /* renamed from: m */
    private static float f1374m = 0.0f;

    /* renamed from: n */
    private static float f1375n = 0.0f;

    /* renamed from: o */
    private static float f1376o = 0.0f;

    /* renamed from: p */
    private static float f1377p = 0.0f;

    /* renamed from: q */
    private static long f1378q = 0;

    /* renamed from: a */
    public float f1379a = -1.0f;

    /* renamed from: b */
    public float f1380b = -1.0f;

    /* renamed from: c */
    public float f1381c = -1.0f;

    /* renamed from: d */
    public float f1382d = -1.0f;

    /* renamed from: e */
    public long f1383e = -1;

    /* renamed from: f */
    public long f1384f = -1;

    /* renamed from: g */
    public int f1385g = -1;

    /* renamed from: h */
    public int f1386h = -1024;

    /* renamed from: i */
    public int f1387i = -1;

    /* renamed from: k */
    public boolean f1388k = true;

    /* renamed from: l */
    public SparseArray<C0408c.C0409a> f1389l = new SparseArray<>();

    /* renamed from: r */
    private int f1390r = 0;

    /* renamed from: s */
    private int f1391s = 0;

    static {
        if (ViewConfiguration.get(C0558m.m2663a()) != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (f1377p <= ((float) r2)) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1121a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getDeviceId()
            r12.f1386h = r0
            r0 = 0
            int r1 = r13.getToolType(r0)
            r12.f1385g = r1
            int r1 = r13.getSource()
            r12.f1387i = r1
            int r1 = r13.getActionMasked()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x00df
            if (r1 == r3) goto L_0x00a7
            r4 = 2
            if (r1 == r4) goto L_0x002a
            if (r1 == r2) goto L_0x0026
            r0 = -1
            r5 = -1
            goto L_0x011a
        L_0x0026:
            r0 = 4
            r5 = 4
            goto L_0x011a
        L_0x002a:
            float r1 = f1376o
            float r2 = r13.getX()
            float r5 = f1374m
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            f1376o = r1
            float r1 = f1377p
            float r2 = r13.getY()
            float r5 = f1375n
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            f1377p = r1
            float r1 = r13.getX()
            f1374m = r1
            float r1 = r13.getY()
            f1375n = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = f1378q
            long r1 = r1 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0074
            float r1 = f1376o
            int r2 = f1373j
            float r5 = (float) r2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0075
            float r1 = f1377p
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r3 = 2
        L_0x0075:
            float r1 = r13.getRawX()
            r12.f1381c = r1
            float r1 = r13.getRawY()
            r12.f1382d = r1
            float r1 = r12.f1381c
            int r2 = r12.f1390r
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.C0558m.f2080a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            float r1 = r12.f1382d
            int r2 = r12.f1391s
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.C0558m.f2080a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00a5
        L_0x00a3:
            r12.f1388k = r0
        L_0x00a5:
            r5 = r3
            goto L_0x011a
        L_0x00a7:
            float r1 = r13.getRawX()
            r12.f1381c = r1
            float r1 = r13.getRawY()
            r12.f1382d = r1
            long r3 = java.lang.System.currentTimeMillis()
            r12.f1384f = r3
            float r1 = r12.f1381c
            int r3 = r12.f1390r
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.C0558m.f2080a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00db
            float r1 = r12.f1382d
            int r3 = r12.f1391s
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.C0558m.f2080a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x00dd
        L_0x00db:
            r12.f1388k = r0
        L_0x00dd:
            r5 = 3
            goto L_0x011a
        L_0x00df:
            float r1 = r13.getRawX()
            int r1 = (int) r1
            r12.f1390r = r1
            float r1 = r13.getRawY()
            int r1 = (int) r1
            r12.f1391s = r1
            float r1 = r13.getRawX()
            r12.f1379a = r1
            float r1 = r13.getRawY()
            r12.f1380b = r1
            long r1 = java.lang.System.currentTimeMillis()
            r12.f1383e = r1
            int r1 = r13.getToolType(r0)
            r12.f1385g = r1
            int r1 = r13.getDeviceId()
            r12.f1386h = r1
            int r1 = r13.getSource()
            r12.f1387i = r1
            long r1 = java.lang.System.currentTimeMillis()
            f1378q = r1
            r12.f1388k = r3
            r5 = 0
        L_0x011a:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r0 = r12.f1389l
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.b.c$a r2 = new com.bytedance.sdk.openadsdk.core.b.c$a
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r13 = r13.getPressure()
            double r8 = (double) r13
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p016b.C0412f.mo1121a(android.view.MotionEvent):void");
    }
}
