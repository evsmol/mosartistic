package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4207c;
import com.iab.omid.library.applovin.walking.async.C4241b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.e */
public class C4246e extends C4240a {
    public C4246e(C4241b.C4243b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11946b(String str) {
        C4207c c = C4207c.m11754c();
        if (c != null) {
            for (C4197a next : c.mo32546b()) {
                if (this.f10134c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32607a(str, this.f10136e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10135d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m11946b(str);
        super.onPostExecute(str);
    }
}
