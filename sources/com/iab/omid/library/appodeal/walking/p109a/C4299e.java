package com.iab.omid.library.appodeal.walking.p109a;

import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.p105b.C4261a;
import com.iab.omid.library.appodeal.walking.p109a.C4294b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.a.e */
public class C4299e extends C4293a {
    public C4299e(C4294b.C4296b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m12170b(String str) {
        C4261a a = C4261a.m11989a();
        if (a != null) {
            for (C4259a next : a.mo32744b()) {
                if (this.f10247a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32810b(str, this.f10249c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f10248b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        m12170b(str);
        super.onPostExecute(str);
    }
}
