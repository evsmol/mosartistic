package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.adexpress.p294a.p297c.C10277a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C0607o;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.p000b.C0145i;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.n */
/* compiled from: NetApi */
public interface C0561n<T> {

    /* renamed from: com.bytedance.sdk.openadsdk.core.n$a */
    /* compiled from: NetApi */
    public interface C0562a {
        /* renamed from: a */
        void mo186a(int i, String str);

        /* renamed from: a */
        void mo187a(C0448a aVar, C0449b bVar);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.n$b */
    /* compiled from: NetApi */
    public interface C0563b {
        /* renamed from: a */
        void mo228a(int i, String str);

        /* renamed from: a */
        void mo229a(C0607o.C0618b bVar);
    }

    /* renamed from: a */
    C10277a mo1837a();

    /* renamed from: a */
    C0145i mo1838a(List<T> list);

    /* renamed from: a */
    JSONObject mo1839a(JSONObject jSONObject);

    /* renamed from: a */
    void mo1840a(AdSlot adSlot, C0479o oVar, int i, C0562a aVar);

    /* renamed from: a */
    void mo1841a(C0477n nVar, List<FilterWord> list);

    /* renamed from: a */
    void mo1842a(String str);

    /* renamed from: a */
    void mo1843a(JSONObject jSONObject, C0563b bVar);

    /* renamed from: a */
    void mo1844a(JSONObject jSONObject, String str);

    /* renamed from: b */
    C0145i mo1845b(JSONObject jSONObject);
}
