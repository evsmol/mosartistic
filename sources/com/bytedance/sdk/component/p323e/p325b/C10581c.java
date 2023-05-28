package com.bytedance.sdk.component.p323e.p325b;

import android.text.TextUtils;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.sdk.component.e.b.c */
/* compiled from: NetExecutor */
public abstract class C10581c {

    /* renamed from: a */
    private Map<String, Object> f26380a;

    /* renamed from: c */
    protected C10476i f26381c;

    /* renamed from: d */
    protected String f26382d = null;

    /* renamed from: e */
    protected final Map<String, String> f26383e = new HashMap();

    /* renamed from: f */
    protected String f26384f = null;

    public C10581c(C10476i iVar) {
        this.f26381c = iVar;
        mo64178b(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64175a(C10479k.C10480a aVar) {
        if (aVar != null && this.f26383e.size() > 0) {
            for (Map.Entry next : this.f26383e.entrySet()) {
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
    }

    /* renamed from: a */
    public void mo64176a(String str) {
        this.f26384f = str;
    }

    /* renamed from: b */
    public String mo64177b() {
        return this.f26382d;
    }

    /* renamed from: b */
    public void mo64178b(String str) {
        this.f26382d = str;
    }

    /* renamed from: b */
    public void mo64179b(String str, String str2) {
        this.f26383e.put(str, str2);
    }

    /* renamed from: c */
    public Map<String, Object> mo64180c() {
        return this.f26380a;
    }

    /* renamed from: d */
    public void mo64181d(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                this.f26383e.put(next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: e */
    public void mo64182e(Map<String, Object> map) {
        this.f26380a = map;
    }
}
