package com.iab.omid.library.adcolony.walking.p097a;

import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p093b.C4104a;
import com.iab.omid.library.adcolony.walking.p097a.C4137b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.e */
public class C4142e extends C4136a {
    public C4142e(C4137b.C4139b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11463b(String str) {
        C4104a a = C4104a.m11278a();
        if (a != null) {
            for (C4102a next : a.mo32138b()) {
                if (this.f9892a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32204b(str, this.f9894c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f9893b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m11463b(str);
        super.onPostExecute(str);
    }
}
