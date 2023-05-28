package com.bytedance.sdk.openadsdk.core.video.p035d;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10197a;
import com.bykv.p271vk.openvk.component.video.p272a.p273a.p275b.C10070a;
import com.bytedance.sdk.component.p307b.p308a.C10470f;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0116a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0124i;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0125j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0126k;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0127l;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.d.a */
/* compiled from: VideoPreloadFactory */
public class C0668a {

    /* renamed from: a */
    public static final C10197a f2462a = new C10070a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bytedance.sdk.openadsdk.core.e.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3283a(com.bykv.p271vk.openvk.component.video.api.p288c.C10188c r13, com.bykv.p271vk.openvk.component.video.api.p290e.C10197a.C10198a r14) {
        /*
            int r0 = r13.mo62943b()
            if (r0 > 0) goto L_0x000c
            boolean r0 = r13.mo62959h()
            if (r0 == 0) goto L_0x0013
        L_0x000c:
            int r0 = r13.mo62963l()
            r1 = -2
            if (r0 != r1) goto L_0x0014
        L_0x0013:
            return
        L_0x0014:
            r0 = 6000(0x1770, float:8.408E-42)
            r13.mo62950d((int) r0)
            r13.mo62954e((int) r0)
            r13.mo62955f(r0)
            java.lang.String r0 = "material_meta"
            java.lang.Object r1 = r13.mo62953e((java.lang.String) r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r13.mo62953e((java.lang.String) r0)
            boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.core.p021e.C0477n
            if (r1 == 0) goto L_0x0033
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            java.lang.String r4 = "ad_slot"
            java.lang.Object r5 = r13.mo62953e((java.lang.String) r4)
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r13.mo62953e((java.lang.String) r4)
            boolean r5 = r5 instanceof com.bytedance.sdk.openadsdk.AdSlot
            if (r5 == 0) goto L_0x0045
            r2 = 1
        L_0x0045:
            r5 = 0
            if (r1 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            java.lang.Object r0 = r13.mo62953e((java.lang.String) r0)
            r5 = r0
            com.bytedance.sdk.openadsdk.core.e.n r5 = (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r5
            java.lang.Object r0 = r13.mo62953e((java.lang.String) r4)
            com.bytedance.sdk.openadsdk.AdSlot r0 = (com.bytedance.sdk.openadsdk.AdSlot) r0
            m3289b(r13, r5, r0)
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.sdk.openadsdk.core.video.d.a$1 r4 = new com.bytedance.sdk.openadsdk.core.video.d.a$1
            r6 = r4
            r7 = r14
            r8 = r5
            r9 = r0
            r10 = r1
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r12)
            java.lang.String r6 = r13.mo62961j()
            boolean r6 = m3288a((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a1
            if (r14 == 0) goto L_0x0091
            r3 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "unexpected url: "
            r4.append(r6)
            java.lang.String r6 = r13.mo62961j()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r14.mo592a(r13, r3, r4)
        L_0x0091:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r9 = r3 - r1
            r11 = -1
            java.lang.String r12 = "video url is invalid"
            r6 = r13
            r7 = r5
            r8 = r0
            m3291b(r6, r7, r8, r9, r11, r12)
            return
        L_0x00a1:
            int r14 = r13.mo62963l()
            if (r14 != r3) goto L_0x00a8
            goto L_0x00bf
        L_0x00a8:
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r14 < r0) goto L_0x00b8
            com.bykv.vk.openvk.component.video.api.e.a r14 = f2462a     // Catch:{ Exception -> 0x00bf }
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ Exception -> 0x00bf }
            r14.mo62659a(r0, r13, r4)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00bf
        L_0x00b8:
            com.bykv.vk.openvk.component.video.a.b.f.a r14 = com.bykv.p271vk.openvk.component.video.p272a.p276b.p282f.C10126a.m28843a()
            r14.mo62768a(r13)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p035d.C0668a.m3283a(com.bykv.vk.openvk.component.video.api.c.c, com.bykv.vk.openvk.component.video.api.e.a$a):void");
    }

    /* renamed from: a */
    private static boolean m3287a(C10188c cVar) {
        return Build.VERSION.SDK_INT >= 23 || cVar.mo62963l() != 0;
    }

    /* renamed from: b */
    private static void m3289b(C10188c cVar, C0477n nVar, AdSlot adSlot) {
        if (m3287a(cVar)) {
            C0113a.m471a((C0116a<C0126k>) new C0116a(nVar, C0996u.m4632b(adSlot.getDurationSlotType()), C0113a.m467a(nVar, (String) null, -1, cVar.mo62963l()), new C0126k(cVar.mo62961j(), cVar.mo62959h() ? cVar.mo62957g() : (long) cVar.mo62943b())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m3291b(C10188c cVar, C0477n nVar, AdSlot adSlot, long j, int i, String str) {
        if (m3287a(cVar)) {
            String b = C0996u.m4632b(adSlot.getDurationSlotType());
            JSONObject a = C0113a.m467a(nVar, (String) null, -1, cVar.mo62963l());
            C0125j jVar = new C0125j();
            jVar.mo350a(cVar.mo62961j());
            jVar.mo349a((long) cVar.mo62943b());
            jVar.mo351b(j);
            jVar.mo348a(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jVar.mo352b(str);
            jVar.mo353c("");
            C0113a.m484c((C0116a<C0125j>) new C0116a(nVar, b, a, jVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m3290b(C10188c cVar, C0477n nVar, AdSlot adSlot, long j) {
        if (m3287a(cVar)) {
            String b = C0996u.m4632b(adSlot.getDurationSlotType());
            JSONObject a = C0113a.m467a(nVar, (String) null, -1, cVar.mo62963l());
            C0127l lVar = new C0127l();
            lVar.mo355a(cVar.mo62961j());
            lVar.mo354a((long) cVar.mo62943b());
            lVar.mo356b(j);
            if (cVar.mo62967p() == 1) {
                lVar.mo357c(1);
            } else {
                lVar.mo357c(0);
            }
            C0113a.m481b((C0116a<C0127l>) new C0116a(nVar, b, a, lVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m3292c(C10188c cVar, C0477n nVar, AdSlot adSlot) {
        if (m3287a(cVar)) {
            C0113a.m487d((C0116a<C0124i>) new C0116a(nVar, C0996u.m4632b(adSlot.getDurationSlotType()), C0113a.m467a(nVar, (String) null, -1, cVar.mo62963l()), new C0124i(cVar.mo62961j(), (long) cVar.mo62943b())));
        }
    }

    /* renamed from: a */
    public static boolean m3288a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        if (C10470f.m30553c(str) == null) {
            return false;
        }
        return true;
    }
}
