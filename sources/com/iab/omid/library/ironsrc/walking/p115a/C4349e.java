package com.iab.omid.library.ironsrc.walking.p115a;

import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.p111b.C4311a;
import com.iab.omid.library.ironsrc.walking.p115a.C4344b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.e */
public class C4349e extends C4343a {
    public C4349e(C4344b.C4346b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m12391b(String str) {
        C4311a a = C4311a.m12213a();
        if (a != null) {
            for (C4309a next : a.mo32938b()) {
                if (this.f10361a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32996b(str, this.f10363c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10362b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m12391b(str);
        super.onPostExecute(str);
    }
}
