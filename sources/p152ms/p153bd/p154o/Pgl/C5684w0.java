package p152ms.p153bd.p154o.Pgl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ms.bd.o.Pgl.w0 */
public class C5684w0 {

    /* renamed from: c */
    private static C5684w0 f13039c;

    /* renamed from: a */
    private Context f13040a = null;

    /* renamed from: b */
    private List<Integer> f13041b = new ArrayList();

    private C5684w0(Context context) {
        this.f13040a = context;
    }

    /* renamed from: a */
    public static C5684w0 m14697a(Context context) {
        if (f13039c == null) {
            synchronized (C5684w0.class) {
                if (f13039c == null) {
                    f13039c = new C5684w0(context);
                }
            }
        }
        return f13039c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        r0 = -10001;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42240a() {
        /*
            r4 = this;
            monitor-enter(r4)     // Catch:{ Exception -> 0x0013, all -> 0x0011 }
            int r0 = r4.mo42243d()     // Catch:{ all -> 0x000e }
            int r1 = r4.mo42242c()     // Catch:{ all -> 0x000e }
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            int r0 = r0 * 10000
            int r0 = r0 + r1
            goto L_0x0015
        L_0x000e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            throw r0     // Catch:{ Exception -> 0x0013, all -> 0x0011 }
        L_0x0011:
            r0 = move-exception
            throw r0
        L_0x0013:
            r0 = -10001(0xffffffffffffd8ef, float:NaN)
        L_0x0015:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x001c
            return
        L_0x001c:
            java.util.List<java.lang.Integer> r1 = r4.f13041b
            r1.add(r0)
            java.util.List<java.lang.Integer> r0 = r4.f13041b     // Catch:{ all -> 0x003f }
            int r0 = r0.size()     // Catch:{ all -> 0x003f }
            r1 = 20
            if (r0 <= r1) goto L_0x003f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x003f }
            java.util.List<java.lang.Integer> r2 = r4.f13041b     // Catch:{ all -> 0x003f }
            int r3 = r0 + -10
            java.util.List r0 = r2.subList(r3, r0)     // Catch:{ all -> 0x003f }
            r1.<init>(r0)     // Catch:{ all -> 0x003f }
            java.util.List<java.lang.Integer> r0 = r4.f13041b     // Catch:{ all -> 0x003f }
            r0.clear()     // Catch:{ all -> 0x003f }
            r4.f13041b = r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.C5684w0.mo42240a():void");
    }

    /* renamed from: b */
    public int mo42241b() {
        Intent registerReceiver = this.f13040a.registerReceiver((BroadcastReceiver) null, new IntentFilter((String) pblk.m14617a(16777217, 0, 0, "377329", new byte[]{35, 59, 64, 85, 2, 39, 52, 88, 111, 109, 54, 48, 74, 83, 67, 47, 51, 2, 111, 108, 44, 123, 102, 102, 57, Ascii.SUB, Ascii.NAK, 36, 95, 92, 1, Ascii.f15546GS, 101, 105, 42, Ascii.f15555VT, Ascii.DC4})));
        if (registerReceiver == null) {
            return -1;
        }
        int intExtra = registerReceiver.getIntExtra((String) pblk.m14617a(16777217, 0, 0, "ba6883", new byte[]{96, 119, 68, 88, Ascii.DC2, 55}), -1);
        return (intExtra == 2 || intExtra == 5) ? 1 : 0;
    }

    /* renamed from: c */
    public int mo42242c() {
        Intent registerReceiver = this.f13040a.registerReceiver((BroadcastReceiver) null, new IntentFilter((String) pblk.m14617a(16777217, 0, 0, "80674a", new byte[]{40, 60, 65, 81, 4, Ascii.DEL, 63, 95, 110, 105, 61, 55, 75, 87, 69, 119, 56, 5, 110, 104, 39, 124, 103, 98, 63, 66, Ascii.f15550RS, 35, 94, 88, 10, Ascii.SUB, 100, 109, 44, 83, Ascii.f15554US})));
        if (registerReceiver == null) {
            return -1;
        }
        return Math.round(((((float) registerReceiver.getIntExtra((String) pblk.m14617a(16777217, 0, 0, "c49360", new byte[]{126, 51, 92, 66, 5}), -1)) / ((float) registerReceiver.getIntExtra((String) pblk.m14617a(16777217, 0, 0, "864dbc", new byte[]{58, 55, 70, Ascii.f15545FS, 88}), -1))) * 100.0f) * 10.0f) / 10;
    }

    /* renamed from: d */
    public int mo42243d() {
        Intent registerReceiver = this.f13040a.registerReceiver((BroadcastReceiver) null, new IntentFilter((String) pblk.m14617a(16777217, 0, 0, "f0700a", new byte[]{118, 60, 64, 86, 0, Ascii.DEL, 97, 95, 111, 110, 99, 55, 74, 80, 65, 119, 102, 5, 111, 111, 121, 124, 102, 101, 59, 66, 64, 35, 95, 95, 84, Ascii.SUB, 101, 106, 40, 83, 65})));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra((String) pblk.m14617a(16777217, 0, 0, "a8c62d", new byte[]{96, 54, 5, 69, 10, 118, 102}), -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        return new int[0];
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int[] mo42244e() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.List<java.lang.Integer> r0 = r5.f13041b     // Catch:{ all -> 0x0051 }
            int r0 = r0.size()     // Catch:{ all -> 0x0051 }
            r1 = 0
            if (r0 > 0) goto L_0x000e
            int[] r0 = new int[r1]     // Catch:{ all -> 0x0051 }
            monitor-exit(r5)
            return r0
        L_0x000e:
            r2 = 1
            if (r0 != r2) goto L_0x0023
            int[] r0 = new int[r2]     // Catch:{ all -> 0x0051 }
            java.util.List<java.lang.Integer> r2 = r5.f13041b     // Catch:{ all -> 0x0051 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0051 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0051 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0051 }
            r0[r1] = r2     // Catch:{ all -> 0x0051 }
            monitor-exit(r5)
            return r0
        L_0x0023:
            java.util.List<java.lang.Integer> r2 = r5.f13041b     // Catch:{ all -> 0x004d }
            int r3 = r0 + -10
            if (r3 <= 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            java.util.List r0 = r2.subList(r3, r0)     // Catch:{ all -> 0x004d }
            int r2 = r0.size()     // Catch:{ all -> 0x004d }
            int[] r2 = new int[r2]     // Catch:{ all -> 0x004d }
            r3 = 0
        L_0x0036:
            int r4 = r0.size()     // Catch:{ all -> 0x004d }
            if (r3 >= r4) goto L_0x004b
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x004d }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x004d }
            int r4 = r4.intValue()     // Catch:{ all -> 0x004d }
            r2[r3] = r4     // Catch:{ all -> 0x004d }
            int r3 = r3 + 1
            goto L_0x0036
        L_0x004b:
            monitor-exit(r5)
            return r2
        L_0x004d:
            int[] r0 = new int[r1]     // Catch:{ all -> 0x0051 }
            monitor-exit(r5)
            return r0
        L_0x0051:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152ms.p153bd.p154o.Pgl.C5684w0.mo42244e():int[]");
    }
}
