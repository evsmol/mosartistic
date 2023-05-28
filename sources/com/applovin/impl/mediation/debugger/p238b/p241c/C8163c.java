package com.applovin.impl.mediation.debugger.p238b.p241c;

import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.C8567e;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.c.c */
public class C8163c {

    /* renamed from: a */
    private final boolean f19960a;

    /* renamed from: b */
    private final boolean f19961b;

    /* renamed from: c */
    private final boolean f19962c;

    /* renamed from: d */
    private final String f19963d;

    public C8163c(JSONObject jSONObject, C8490n nVar) {
        this.f19960a = C8567e.m26072a(nVar.mo57332P()).mo57696a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z = false;
        if (jSONObject2 != null) {
            this.f19961b = true;
            this.f19963d = JsonUtils.getString(jSONObject2, "description", "");
            if (C8572i.m26100a()) {
                this.f19962c = true;
                return;
            }
            List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!C8572i.m26103a((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            this.f19962c = z;
            return;
        }
        this.f19961b = false;
        this.f19963d = "";
        this.f19962c = C8572i.m26100a();
    }

    /* renamed from: a */
    public boolean mo56395a() {
        return this.f19961b;
    }

    /* renamed from: b */
    public boolean mo56396b() {
        boolean z = this.f19962c;
        return z && (this.f19960a || z);
    }

    /* renamed from: c */
    public String mo56397c() {
        return this.f19960a ? this.f19963d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
