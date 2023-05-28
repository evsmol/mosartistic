package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.p097a.C4137b;
import com.iab.omid.library.adcolony.walking.p097a.C4140c;
import com.iab.omid.library.adcolony.walking.p097a.C4141d;
import com.iab.omid.library.adcolony.walking.p097a.C4142e;
import com.iab.omid.library.adcolony.walking.p097a.C4143f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.b */
public class C4144b implements C4137b.C4139b {

    /* renamed from: a */
    private JSONObject f9901a;

    /* renamed from: b */
    private final C4140c f9902b;

    public C4144b(C4140c cVar) {
        this.f9902b = cVar;
    }

    /* renamed from: a */
    public void mo32254a() {
        this.f9902b.mo32247b(new C4141d(this));
    }

    /* renamed from: a */
    public void mo32245a(JSONObject jSONObject) {
        this.f9901a = jSONObject;
    }

    /* renamed from: a */
    public void mo32255a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f9902b.mo32247b(new C4143f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo32246b() {
        return this.f9901a;
    }

    /* renamed from: b */
    public void mo32256b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f9902b.mo32247b(new C4142e(this, hashSet, jSONObject, j));
    }
}
