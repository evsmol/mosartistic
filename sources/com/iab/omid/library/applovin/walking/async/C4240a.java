package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.C4241b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.a */
public abstract class C4240a extends C4241b {

    /* renamed from: c */
    protected final HashSet<String> f10134c;

    /* renamed from: d */
    protected final JSONObject f10135d;

    /* renamed from: e */
    protected final long f10136e;

    public C4240a(C4241b.C4243b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f10134c = new HashSet<>(hashSet);
        this.f10135d = jSONObject;
        this.f10136e = j;
    }
}
