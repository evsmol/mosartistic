package com.bytedance.sdk.openadsdk.core.p015a;

import com.bykv.p271vk.openvk.component.video.p272a.p283c.C10148a;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.a */
/* compiled from: AdCallBackAdapter */
public class C0380a implements C0561n.C0562a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0561n.C0562a f1281a;

    public C0380a(C0561n.C0562a aVar) {
        this.f1281a = aVar;
    }

    /* renamed from: a */
    public void mo186a(int i, String str) {
        C0561n.C0562a aVar = this.f1281a;
        if (aVar != null) {
            aVar.mo186a(i, str);
        }
    }

    /* renamed from: a */
    public void mo187a(final C0448a aVar, final C0449b bVar) {
        if (this.f1281a == null) {
            return;
        }
        if (C10148a.m28919b()) {
            this.f1281a.mo187a(aVar, bVar);
        } else {
            C0547k.m2622d().post(new Runnable() {
                public void run() {
                    C0380a.this.f1281a.mo187a(aVar, bVar);
                }
            });
        }
    }
}
