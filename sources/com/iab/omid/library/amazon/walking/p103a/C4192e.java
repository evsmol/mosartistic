package com.iab.omid.library.amazon.walking.p103a;

import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p099b.C4154a;
import com.iab.omid.library.amazon.walking.p103a.C4187b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.e */
public class C4192e extends C4186a {
    public C4192e(C4187b.C4189b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11693b(String str) {
        C4154a a = C4154a.m11508a();
        if (a != null) {
            for (C4152a next : a.mo32337b()) {
                if (this.f10009a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32403b(str, this.f10011c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10010b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m11693b(str);
        super.onPostExecute(str);
    }
}
