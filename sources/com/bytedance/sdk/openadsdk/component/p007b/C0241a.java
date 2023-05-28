package com.bytedance.sdk.openadsdk.component.p007b;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10197a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.core.C0492g;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.video.p035d.C0668a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.b.a */
/* compiled from: FeedAdManager */
public class C0241a {

    /* renamed from: a */
    private static volatile C0241a f794a;

    /* renamed from: b */
    private final C0561n f795b = C0558m.m2671f();

    /* renamed from: a */
    public static C0241a m938a() {
        if (f794a == null) {
            synchronized (C0241a.class) {
                if (f794a == null) {
                    f794a = new C0241a();
                }
            }
        }
        return f794a;
    }

    private C0241a() {
    }

    /* renamed from: a */
    public void mo602a(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        final Context context2 = context;
        final AdSlot adSlot2 = adSlot;
        this.f795b.mo1840a(adSlot, new C0479o(), 5, new C0561n.C0562a() {
            /* renamed from: a */
            public void mo186a(int i, String str) {
                feedAdListener2.onError(i, str);
            }

            /* renamed from: a */
            public void mo187a(C0448a aVar, C0449b bVar) {
                if (aVar.mo1199b() == null || aVar.mo1199b().isEmpty()) {
                    feedAdListener2.onError(-3, C0492g.m2254a(-3));
                    bVar.mo1204a(-3);
                    C0449b.m1835a(bVar);
                    return;
                }
                List<C0477n> b = aVar.mo1199b();
                ArrayList arrayList = new ArrayList(b.size());
                for (C0477n next : b) {
                    if (C0477n.m2012c(next)) {
                        arrayList.add(new C0243b(context2, next, 5, adSlot2));
                    } else if (next.mo1394ao()) {
                        arrayList.add(new C0243b(context2, next, 5, adSlot2));
                    }
                    if (!(!C0477n.m2012c(next) || next.mo1330J() == null || next.mo1330J().mo62923i() == null)) {
                        if (C0558m.m2673h().mo1679b(String.valueOf(C0996u.m4657f(next))) && C0558m.m2673h().mo1669G()) {
                            if (next.mo1330J() != null) {
                                next.mo1330J().mo62917f(1);
                            }
                            if (next.mo1375aF() != null) {
                                next.mo1375aF().mo62917f(1);
                            }
                            C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(next.mo1373aD()).mo62645a(), next);
                            a.mo62940a("material_meta", next);
                            a.mo62940a("ad_slot", adSlot2);
                            C0668a.m3283a(a, (C10197a.C10198a) null);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    AdSlot adSlot = adSlot2;
                    if (adSlot == null) {
                        C0136e.m618b(context2, b.get(0), C0996u.m4632b(5), currentTimeMillis);
                    } else if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        C0136e.m608a(b.get(0), "embeded_ad", System.currentTimeMillis() - currentTimeMillis);
                    } else {
                        C0136e.m618b(context2, b.get(0), C0996u.m4632b(adSlot2.getDurationSlotType()), currentTimeMillis);
                    }
                    feedAdListener2.onFeedAdLoad(arrayList);
                    if (bVar.mo1212e() != null && !bVar.mo1212e().isEmpty()) {
                        C0449b.m1835a(bVar);
                        return;
                    }
                    return;
                }
                feedAdListener2.onError(-4, C0492g.m2254a(-4));
                bVar.mo1204a(-4);
                C0449b.m1835a(bVar);
            }
        });
    }
}
