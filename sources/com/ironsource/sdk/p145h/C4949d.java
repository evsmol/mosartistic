package com.ironsource.sdk.p145h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.d */
public final class C4949d {

    /* renamed from: a */
    private String f12692a;

    public C4949d(String str) {
        this.f12692a = str;
    }

    /* renamed from: a */
    private boolean m14416a(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m14417b().getPath()) != 0;
    }

    /* renamed from: b */
    private C4948c m14417b() {
        C4948c cVar = new C4948c(this.f12692a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo34691a() {
        return new JSONObject(IronSourceStorageUtils.readFile(m14417b()));
    }

    /* renamed from: a */
    public final synchronized boolean mo34692a(String str) {
        JSONObject a = mo34691a();
        if (!a.has(str)) {
            return true;
        }
        a.remove(str);
        return m14416a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo34693a(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo34691a();
        a.put(str, jSONObject);
        return m14416a(a);
    }

    /* renamed from: a */
    public final boolean mo34694a(ArrayList<C4948c> arrayList) {
        Iterator<C4948c> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!mo34692a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo34695b(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo34691a();
        JSONObject optJSONObject = a.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a.putOpt(str, jSONObject);
        }
        return m14416a(a);
    }
}
