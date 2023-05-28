package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.C4241b;
import com.iab.omid.library.applovin.walking.async.C4244c;
import com.iab.omid.library.applovin.walking.async.C4245d;
import com.iab.omid.library.applovin.walking.async.C4246e;
import com.iab.omid.library.applovin.walking.async.C4247f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.b */
public class C4248b implements C4241b.C4243b {

    /* renamed from: a */
    private JSONObject f10143a;

    /* renamed from: b */
    private final C4244c f10144b;

    public C4248b(C4244c cVar) {
        this.f10144b = cVar;
    }

    /* renamed from: a */
    public JSONObject mo32656a() {
        return this.f10143a;
    }

    /* renamed from: a */
    public void mo32657a(JSONObject jSONObject) {
        this.f10143a = jSONObject;
    }

    /* renamed from: a */
    public void mo32665a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10144b.mo32658b(new C4246e(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public void mo32666b() {
        this.f10144b.mo32658b(new C4245d(this));
    }

    /* renamed from: b */
    public void mo32667b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10144b.mo32658b(new C4247f(this, hashSet, jSONObject, j));
    }
}
