package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.p115a.C4344b;
import com.iab.omid.library.ironsrc.walking.p115a.C4347c;
import com.iab.omid.library.ironsrc.walking.p115a.C4348d;
import com.iab.omid.library.ironsrc.walking.p115a.C4349e;
import com.iab.omid.library.ironsrc.walking.p115a.C4350f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
public class C4351b implements C4344b.C4346b {

    /* renamed from: a */
    private JSONObject f10370a;

    /* renamed from: b */
    private final C4347c f10371b;

    public C4351b(C4347c cVar) {
        this.f10371b = cVar;
    }

    /* renamed from: a */
    public void mo33045a() {
        this.f10371b.mo33038b(new C4348d(this));
    }

    /* renamed from: a */
    public void mo33036a(JSONObject jSONObject) {
        this.f10370a = jSONObject;
    }

    /* renamed from: a */
    public void mo33046a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10371b.mo33038b(new C4350f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo33037b() {
        return this.f10370a;
    }

    /* renamed from: b */
    public void mo33047b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10371b.mo33038b(new C4349e(this, hashSet, jSONObject, j));
    }
}
