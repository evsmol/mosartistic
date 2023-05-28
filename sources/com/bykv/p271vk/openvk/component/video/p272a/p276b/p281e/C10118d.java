package com.bykv.p271vk.openvk.component.video.p272a.p276b.p281e;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.d */
/* compiled from: NetworkSoureVolleyImpl */
public class C10118d implements C10115b {

    /* renamed from: a */
    private C10476i f24991a;

    public C10118d() {
        this.f24991a = null;
        this.f24991a = C10184b.m29130e();
    }

    /* renamed from: a */
    public C10114a mo62753a(C10119e eVar) throws IOException {
        C10479k.C10480a aVar = new C10479k.C10480a();
        try {
            if (eVar.f24996e != null) {
                for (Map.Entry next : eVar.f24996e.entrySet()) {
                    String str = (String) next.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) next.getValue();
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar.mo63988b(str, str2);
                    }
                }
            }
            C10483m a = this.f24991a.mo63868a(aVar.mo63986a(eVar.f24993b).mo63981a().mo63989b()).mo63859a();
            C10202c.m29291b("NetworkSoureVolleyImpl", "response code = ", Integer.valueOf(a.mo63889c()));
            return new C10120f(a, eVar);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
