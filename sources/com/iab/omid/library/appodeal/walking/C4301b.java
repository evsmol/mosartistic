package com.iab.omid.library.appodeal.walking;

import com.iab.omid.library.appodeal.walking.p109a.C4294b;
import com.iab.omid.library.appodeal.walking.p109a.C4297c;
import com.iab.omid.library.appodeal.walking.p109a.C4298d;
import com.iab.omid.library.appodeal.walking.p109a.C4299e;
import com.iab.omid.library.appodeal.walking.p109a.C4300f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.b */
public class C4301b implements C4294b.C4296b {

    /* renamed from: a */
    private JSONObject f10256a;

    /* renamed from: b */
    private final C4297c f10257b;

    public C4301b(C4297c cVar) {
        this.f10257b = cVar;
    }

    /* renamed from: a */
    public void mo32859a() {
        this.f10257b.mo32852b(new C4298d(this));
    }

    /* renamed from: a */
    public void mo32850a(JSONObject jSONObject) {
        this.f10256a = jSONObject;
    }

    /* renamed from: a */
    public void mo32860a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10257b.mo32852b(new C4300f(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo32851b() {
        return this.f10256a;
    }

    /* renamed from: b */
    public void mo32861b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f10257b.mo32852b(new C4299e(this, hashSet, jSONObject, j));
    }
}
