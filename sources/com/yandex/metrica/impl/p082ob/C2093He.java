package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.He */
public class C2093He implements C2060Ge {

    /* renamed from: a */
    private final C3350pe f5531a;

    public C2093He() {
        this(new C3350pe());
    }

    /* renamed from: a */
    public byte[] mo15563a(C3397qe qeVar, C2275Lg lg) {
        if (!lg.mo16203T() && !TextUtils.isEmpty(qeVar.f8740b)) {
            try {
                JSONObject jSONObject = new JSONObject(qeVar.f8740b);
                jSONObject.remove("preloadInfo");
                qeVar.f8740b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f5531a.mo15563a(qeVar, lg);
    }

    C2093He(C3350pe peVar) {
        this.f5531a = peVar;
    }
}
