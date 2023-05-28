package com.bytedance.sdk.component.p293a;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.w */
/* compiled from: PermissionConfigRepository */
class C10255w {

    /* renamed from: a */
    private final Collection<String> f25329a;

    /* renamed from: b */
    private final Map<String, C10250v> f25330b;

    /* renamed from: c */
    private final C10233k f25331c;

    /* renamed from: d */
    private final Set<C10256a> f25332d;

    /* renamed from: com.bytedance.sdk.component.a.w$a */
    /* compiled from: PermissionConfigRepository */
    interface C10256a {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10250v mo63084a(String str) {
        if (this.f25329a.contains(str) || TextUtils.equals(str, "host")) {
            return m29445a(str, (JSONObject) null);
        }
        throw new IllegalArgumentException("Namespace: " + str + " not registered.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63085a(C10256a aVar) {
        this.f25332d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo63086b(C10256a aVar) {
        this.f25332d.remove(aVar);
    }

    /* renamed from: a */
    private C10250v m29445a(String str, JSONObject jSONObject) {
        C10250v vVar = this.f25330b.get(str);
        if (vVar == null) {
            C10250v vVar2 = new C10250v(str, this.f25331c.mo63051c(), this.f25331c.mo63049a(), this.f25331c.mo63050b(), jSONObject);
            this.f25330b.put(str, vVar2);
            return vVar2;
        } else if (jSONObject == null) {
            return vVar;
        } else {
            vVar.mo63083a(jSONObject);
            return vVar;
        }
    }
}
