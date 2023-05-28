package com.bytedance.sdk.openadsdk.component.p006a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.component.a.b */
/* compiled from: TTAppOpenAdClickManager */
public class C0237b {

    /* renamed from: a */
    private String f782a = "open_ad";

    /* renamed from: b */
    private int f783b = 4;

    /* renamed from: c */
    private C0236a f784c;

    /* renamed from: d */
    private C1008c f785d;

    public C0237b(C0477n nVar, Activity activity) {
        C0236a aVar = new C0236a(activity.getApplicationContext(), nVar, this.f782a, this.f783b);
        this.f784c = aVar;
        aVar.mo1100a(activity.findViewById(16908290));
        this.f784c.mo1112b(activity.findViewById(C10647t.m31283e(C0558m.m2663a(), "tt_top_dislike")));
        HashMap hashMap = new HashMap();
        hashMap.put("click_area", Integer.valueOf(nVar.mo1414c()));
        hashMap.put("openad_creative_type", C0477n.m2012c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("click_scence", Integer.valueOf(C0480p.m2198i(nVar) ? 3 : 1));
        this.f784c.mo1108a((Map<String, Object>) hashMap);
        m927a(activity.getApplicationContext(), nVar);
    }

    /* renamed from: a */
    private void m927a(Context context, C0477n nVar) {
        if (mo596a(nVar) == 4) {
            C1008c a = C1009d.m4776a(context, nVar, "open_ad");
            this.f785d = a;
            this.f784c.mo1106a(a);
        }
    }

    /* renamed from: a */
    public int mo596a(C0477n nVar) {
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1332L();
    }

    /* renamed from: a */
    public void mo598a(C0406b.C0407a aVar) {
        C0236a aVar2 = this.f784c;
        if (aVar2 != null) {
            aVar2.mo1104a(aVar);
        }
    }

    /* renamed from: a */
    public C0236a mo597a() {
        return this.f784c;
    }
}
