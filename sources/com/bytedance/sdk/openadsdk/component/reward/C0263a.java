package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.core.C0558m;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a */
/* compiled from: ContinueDownloadTask */
public class C0263a extends C10618g {

    /* renamed from: a */
    private final List<? extends C10618g> f857a;

    public C0263a(String str, List<? extends C10618g> list) {
        super(str);
        this.f857a = list;
    }

    public void run() {
        List<? extends C10618g> list;
        if (!(C10642o.m31260c(C0558m.m2663a()) == 0 || (list = this.f857a) == null)) {
            Iterator<? extends C10618g> it = list.iterator();
            while (it.hasNext()) {
                C10615e.m31160a((C10618g) it.next(), 1);
                it.remove();
            }
        }
        try {
            C10631h.m31217a().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
