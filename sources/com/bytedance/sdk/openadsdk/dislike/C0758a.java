package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.a */
/* compiled from: DislikeDispatcher */
public class C0758a {

    /* renamed from: a */
    private static volatile C0758a f2915a;

    /* renamed from: b */
    private final C0561n<C0106a> f2916b = C0558m.m2671f();

    private C0758a() {
    }

    /* renamed from: a */
    public static C0758a m3852a() {
        if (f2915a == null) {
            synchronized (C0758a.class) {
                if (f2915a == null) {
                    f2915a = new C0758a();
                }
            }
        }
        return f2915a;
    }

    /* renamed from: a */
    public void mo2518a(C0477n nVar, List<FilterWord> list) {
        this.f2916b.mo1841a(nVar, list);
    }
}
