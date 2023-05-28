package com.bytedance.sdk.openadsdk.core.p016b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0590e;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.C0996u;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.a */
/* compiled from: ClickCreativeListener */
public class C0405a extends C0406b {

    /* renamed from: F */
    private boolean f1325F = false;

    /* renamed from: G */
    private boolean f1326G = false;

    /* renamed from: H */
    private int f1327H;

    /* renamed from: a */
    private boolean f1328a = true;

    /* renamed from: b */
    public boolean mo1094b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1096c() {
        return false;
    }

    public C0405a(Context context, C0477n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo1091a(boolean z) {
        this.f1328a = z;
    }

    /* renamed from: b */
    public void mo1093b(boolean z) {
        this.f1325F = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0208, code lost:
        if ((r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0220, code lost:
        if (((java.lang.Boolean) r2.getTag(com.bytedance.sdk.component.utils.C10647t.m31283e(com.bytedance.sdk.openadsdk.core.C0558m.m2663a(), "tt_id_is_video_picture"))).booleanValue() != false) goto L_0x0222;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106a(android.view.View r24, float r25, float r26, float r27, float r28, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.p016b.C0408c.C0409a> r29, boolean r30) {
        /*
            r23 = this;
            r11 = r23
            r10 = r24
            r9 = r30
            r2 = 2
            r0 = r23
            r1 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            boolean r0 = r0.mo1109a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            boolean r0 = r23.m1668i()
            java.lang.String r1 = "ClickCreativeListener"
            if (r0 == 0) goto L_0x0039
            boolean r0 = r23.m1665d(r24)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r11.f1326G
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "Intercept the native video view , Select the normal click event....."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)
            super.mo106a(r24, r25, r26, r27, r28, r29, r30)
            return
        L_0x0039:
            java.lang.String r0 = "Select creative area click event....."
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r1, (java.lang.String) r0)
            android.content.Context r0 = r11.f1332b
            if (r0 != 0) goto L_0x0048
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()
            r11.f1332b = r0
        L_0x0048:
            android.content.Context r0 = r11.f1332b
            if (r0 != 0) goto L_0x004d
            return
        L_0x004d:
            boolean r0 = r11.mo1110a(r10, r9)
            if (r0 != 0) goto L_0x0054
            return
        L_0x0054:
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.m2734a((android.view.View) r24)
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f1333c
            r18 = -1
            if (r1 == 0) goto L_0x006b
            com.bytedance.sdk.openadsdk.core.e.j r0 = r11.f1333c
            int r0 = r0.f1562l
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f1333c
            org.json.JSONObject r1 = r1.f1563m
            r16 = r0
            r17 = r1
            goto L_0x006f
        L_0x006b:
            r17 = r0
            r16 = -1
        L_0x006f:
            long r6 = r11.f1365w
            long r4 = r11.f1366x
            java.lang.ref.WeakReference r0 = r11.f1337g
            if (r0 != 0) goto L_0x007c
            android.view.View r0 = r23.mo1114d()
            goto L_0x0084
        L_0x007c:
            java.lang.ref.WeakReference r0 = r11.f1337g
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0084:
            r19 = r0
            java.lang.ref.WeakReference r0 = r11.f1338h
            if (r0 != 0) goto L_0x008f
            android.view.View r0 = r23.mo1117e()
            goto L_0x0097
        L_0x008f:
            java.lang.ref.WeakReference r0 = r11.f1338h
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0097:
            r20 = r0
            java.lang.String r12 = r23.mo1118f()
            android.content.Context r0 = r11.f1332b
            float r13 = com.bytedance.sdk.openadsdk.utils.C1002v.m4748e((android.content.Context) r0)
            android.content.Context r0 = r11.f1332b
            int r14 = com.bytedance.sdk.openadsdk.utils.C1002v.m4753g(r0)
            android.content.Context r0 = r11.f1332b
            float r15 = com.bytedance.sdk.openadsdk.utils.C1002v.m4751f((android.content.Context) r0)
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            r21 = r4
            r4 = r28
            r5 = r29
            r8 = r21
            r10 = r19
            r11 = r20
            com.bytedance.sdk.openadsdk.core.e.g r0 = r0.mo1097a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r23
            r1.f1339i = r0
            com.bytedance.sdk.openadsdk.core.e.n r0 = r1.f1334d
            int r0 = r0.mo1332L()
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            if (r0 == r5) goto L_0x0191
            if (r0 == r3) goto L_0x0191
            if (r0 == r2) goto L_0x0125
            r2 = 5
            if (r0 == r2) goto L_0x00e3
            r2 = r24
            r0 = -1
            goto L_0x0264
        L_0x00e3:
            java.lang.String r2 = r1.f1335e
            java.lang.String r10 = r1.m1664b((java.lang.String) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L_0x0102
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f1339i
            r11 = 1
            java.util.Map r12 = r1.f1345o
            if (r30 == 0) goto L_0x00fc
            r13 = 1
            goto L_0x00fd
        L_0x00fc:
            r13 = 2
        L_0x00fd:
            java.lang.String r7 = "click_call"
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r8, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x0102:
            android.content.Context r2 = r24.getContext()
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f1334d
            java.lang.String r3 = r3.mo1337Q()
            boolean r11 = com.bytedance.sdk.openadsdk.utils.C0996u.m4649d(r2, r3)
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f1339i
            java.lang.String r10 = r1.f1335e
            java.util.Map r12 = r1.f1345o
            if (r30 == 0) goto L_0x011e
            r13 = 1
            goto L_0x011f
        L_0x011e:
            r13 = 2
        L_0x011f:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r8, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018d
        L_0x0125:
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f1334d
            boolean r2 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2190a((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r2)
            if (r2 == 0) goto L_0x016b
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.f1341k
            if (r2 != 0) goto L_0x0135
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r2 = r1.f1346p
            if (r2 == 0) goto L_0x016b
        L_0x0135:
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f1334d
            int r8 = r1.f1336f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.f1341k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.f1346p
            java.lang.String r11 = r1.f1335e
            com.com.bytedance.overseas.sdk.a.c r12 = r1.f1344n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.C0747y.m3811a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.p056a.C1008c) r12, (boolean) r13)
            boolean r2 = r1.f1328a
            if (r2 == 0) goto L_0x018d
            android.content.Context r14 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r3 = r1.f1339i
            java.lang.String r6 = r1.f1335e
            java.util.Map r7 = r1.f1345o
            if (r30 == 0) goto L_0x015b
            r21 = 1
            goto L_0x015d
        L_0x015b:
            r21 = 2
        L_0x015d:
            java.lang.String r15 = "click"
            r16 = r2
            r17 = r3
            r18 = r6
            r20 = r7
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r16, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
            goto L_0x018d
        L_0x016b:
            com.com.bytedance.overseas.sdk.a.c r2 = r1.f1344n
            if (r2 == 0) goto L_0x018d
            com.com.bytedance.overseas.sdk.a.c r2 = r1.f1344n
            r2.mo2930d()
            boolean r2 = r1.f1328a
            if (r2 == 0) goto L_0x018d
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f1339i
            java.lang.String r10 = r1.f1335e
            r11 = 1
            java.util.Map r12 = r1.f1345o
            if (r30 == 0) goto L_0x0187
            r13 = 1
            goto L_0x0188
        L_0x0187:
            r13 = 2
        L_0x0188:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r8, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x018d:
            r2 = r24
            goto L_0x0264
        L_0x0191:
            if (r0 != r3) goto L_0x01d4
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f1334d
            java.lang.String r3 = r3.mo1335O()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x01d4
            java.lang.String r6 = "play.google.com/store/apps/details?id="
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x01d4
            java.lang.String r6 = "?id="
            int r6 = r3.indexOf(r6)
            int r6 = r6 + r2
            java.lang.String r2 = r3.substring(r6)
            android.content.Context r3 = r1.f1332b
            boolean r2 = com.com.bytedance.overseas.sdk.p056a.C1007b.m4764b(r3, r2)
            if (r2 == 0) goto L_0x01d4
            boolean r2 = r1.f1328a
            if (r2 == 0) goto L_0x018d
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f1339i
            java.lang.String r10 = r1.f1335e
            r11 = 1
            java.util.Map r12 = r1.f1345o
            if (r30 == 0) goto L_0x01cd
            r13 = 1
            goto L_0x01ce
        L_0x01cd:
            r13 = 2
        L_0x01ce:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r8, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018d
        L_0x01d4:
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.f1341k
            if (r2 != 0) goto L_0x01e0
            boolean r2 = r1.f1325F
            if (r2 == 0) goto L_0x01dd
            goto L_0x01e0
        L_0x01dd:
            r2 = r24
            goto L_0x01f6
        L_0x01e0:
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f1339i
            java.lang.String r10 = r1.f1335e
            r11 = 1
            java.util.Map r12 = r1.f1345o
            if (r30 == 0) goto L_0x01ef
            r13 = 1
            goto L_0x01f0
        L_0x01ef:
            r13 = 2
        L_0x01f0:
            java.lang.String r7 = "click_button"
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r8, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x01dd
        L_0x01f6:
            if (r2 == 0) goto L_0x020a
            int r3 = r24.getId()     // Catch:{ Exception -> 0x0226 }
            android.content.Context r6 = r1.f1332b     // Catch:{ Exception -> 0x0226 }
            java.lang.String r7 = "tt_root_view"
            int r6 = com.bytedance.sdk.component.utils.C10647t.m31283e(r6, r7)     // Catch:{ Exception -> 0x0226 }
            if (r3 == r6) goto L_0x0222
            boolean r3 = r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView     // Catch:{ Exception -> 0x0226 }
            if (r3 != 0) goto L_0x0222
        L_0x020a:
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r6 = "tt_id_is_video_picture"
            int r3 = com.bytedance.sdk.component.utils.C10647t.m31283e(r3, r6)     // Catch:{ Exception -> 0x0226 }
            java.lang.Object r3 = r2.getTag(r3)     // Catch:{ Exception -> 0x0226 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0226 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0226 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0226 }
            if (r3 == 0) goto L_0x0227
        L_0x0222:
            com.bytedance.sdk.openadsdk.core.C0747y.m3810a(r4)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0227
        L_0x0226:
        L_0x0227:
            android.content.Context r6 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f1334d
            int r8 = r1.f1336f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.f1341k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.f1346p
            int r3 = r1.f1336f
            java.lang.String r11 = com.bytedance.sdk.openadsdk.utils.C0996u.m4615a((int) r3)
            com.com.bytedance.overseas.sdk.a.c r12 = r1.f1344n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.C0747y.m3811a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.p056a.C1008c) r12, (boolean) r13)
            r3 = 0
            com.bytedance.sdk.openadsdk.core.C0747y.m3810a(r3)
            boolean r3 = r1.f1328a
            if (r3 == 0) goto L_0x0264
            android.content.Context r14 = r1.f1332b
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f1334d
            com.bytedance.sdk.openadsdk.core.e.g r6 = r1.f1339i
            java.lang.String r7 = r1.f1335e
            java.util.Map r8 = r1.f1345o
            if (r30 == 0) goto L_0x0255
            r21 = 1
            goto L_0x0257
        L_0x0255:
            r21 = 2
        L_0x0257:
            java.lang.String r15 = "click"
            r16 = r3
            r17 = r6
            r18 = r7
            r20 = r8
            com.bytedance.sdk.openadsdk.p000b.C0136e.m604a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r16, (com.bytedance.sdk.openadsdk.core.p021e.C0455g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
        L_0x0264:
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.f1340j
            if (r3 == 0) goto L_0x026d
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.f1340j
            r3.mo28a(r2, r0)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p016b.C0405a.mo106a(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1092a() {
        if (this.f1334d == null) {
            return true;
        }
        int c = C0558m.m2673h().mo1680c(C0996u.m4657f(this.f1334d));
        int c2 = C10642o.m31260c(C0558m.m2663a());
        if (c == 1) {
            return C0996u.m4656e(c2);
        }
        if (c != 2) {
            if (c == 3) {
                return false;
            }
            if (c == 5 && !C0996u.m4656e(c2) && !C0996u.m4666g(c2)) {
                return false;
            }
            return true;
        } else if (C0996u.m4661f(c2) || C0996u.m4656e(c2) || C0996u.m4666g(c2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private boolean m1666g() {
        return C0477n.m2012c(this.f1334d) && this.f1334d.mo1459p() == 1;
    }

    /* renamed from: d */
    private boolean m1665d(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof NativeVideoTsView) {
            C10638l.m31238c("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        } else if (view.getId() == C10647t.m31283e(this.f1332b, "tt_video_ad_cover_center_layout") || view.getId() == C10647t.m31283e(this.f1332b, "tt_video_ad_logo_image") || view.getId() == C10647t.m31283e(this.f1332b, "tt_video_btn_ad_image_tv") || view.getId() == C10647t.m31283e(this.f1332b, "tt_video_ad_name") || view.getId() == C10647t.m31283e(this.f1332b, "tt_video_ad_button")) {
            C10638l.m31238c("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        } else if (view.getId() == C10647t.m31283e(this.f1332b, "tt_root_view") || view.getId() == C10647t.m31283e(this.f1332b, "tt_video_play")) {
            C10638l.m31238c("ClickCreativeListener", "tt_root_view....");
            return true;
        } else if (!(view instanceof ViewGroup)) {
            return false;
        } else {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return false;
                }
                if (m1665d(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
    }

    /* renamed from: h */
    private boolean m1667h() {
        return this instanceof C0590e;
    }

    /* renamed from: i */
    private boolean m1668i() {
        if (this.f1334d == null || m1667h()) {
            return false;
        }
        if (this.f1334d.mo1383ad() != 5 && this.f1334d.mo1383ad() != 15) {
            return false;
        }
        if (this.f1327H == 0) {
            this.f1327H = C0996u.m4653e(this.f1334d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("!isViewVisibility()=");
        sb.append(!mo1094b());
        sb.append(",isAutoPlay()=");
        sb.append(mo1092a());
        sb.append(",!isCoverPageVisibility()=");
        sb.append(!mo1096c());
        C10638l.m31235b("ClickCreativeListener", sb.toString());
        if (this.f1327H == 5 && m1666g() && mo1092a() && !mo1094b() && !mo1096c()) {
            return false;
        }
        int i = this.f1327H;
        if (i == 1 || i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m1664b(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            java.lang.String r1 = "open_ad"
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1695837674: goto L_0x003f;
                case -1263194568: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 1844104722: goto L_0x0023;
                case 1912999166: goto L_0x0019;
                case 2091589896: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0049
        L_0x000f:
            java.lang.String r0 = "slide_banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 3
            goto L_0x004a
        L_0x0019:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 1
            goto L_0x004a
        L_0x0023:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 4
            goto L_0x004a
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 0
            goto L_0x004a
        L_0x0037:
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0049
            r8 = 5
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 2
            goto L_0x004a
        L_0x0049:
            r8 = -1
        L_0x004a:
            if (r8 == 0) goto L_0x0060
            if (r8 == r6) goto L_0x0060
            java.lang.String r0 = "banner_call"
            if (r8 == r5) goto L_0x005f
            if (r8 == r4) goto L_0x005f
            if (r8 == r3) goto L_0x005c
            if (r8 == r2) goto L_0x005b
            java.lang.String r8 = ""
            return r8
        L_0x005b:
            return r1
        L_0x005c:
            java.lang.String r8 = "interaction_call"
            return r8
        L_0x005f:
            return r0
        L_0x0060:
            java.lang.String r8 = "feed_call"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p016b.C0405a.m1664b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public void mo1095c(boolean z) {
        this.f1326G = z;
    }
}
