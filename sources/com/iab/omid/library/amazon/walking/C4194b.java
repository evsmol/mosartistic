package com.iab.omid.library.amazon.walking;

import com.iab.omid.library.amazon.walking.p103a.C4187b;
import com.iab.omid.library.amazon.walking.p103a.C4190c;
import com.iab.omid.library.amazon.walking.p103a.C4191d;
import com.iab.omid.library.amazon.walking.p103a.C4192e;
import com.iab.omid.library.amazon.walking.p103a.C4193f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.b */
public class C4194b implements C4187b.C4189b {

    /* renamed from: a */
    private JSONObject f10018a;

    /* renamed from: b */
    private final C4190c f10019b;

    public C4194b(C4190c cVar) {
        this.f10019b = cVar;
    }

    /* renamed from: a */
    public void mo32453a() {
        this.f10019b.mo32446b(new C4191d(this));
    }

    /* renamed from: a */
    public void mo32444a(JSONObject jSONObject) {
        this.f10018a = jSONObject;
    }

    /* renamed from: a */
    public void mo32454a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10019b.mo32446b(new C4193f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo32445b() {
        return this.f10018a;
    }

    /* renamed from: b */
    public void mo32455b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10019b.mo32446b(new C4192e(this, hashSet, jSONObject, j));
    }
}
