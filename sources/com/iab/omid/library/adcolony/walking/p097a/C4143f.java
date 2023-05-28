package com.iab.omid.library.adcolony.walking.p097a;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p093b.C4104a;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.walking.p097a.C4137b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.f */
public class C4143f extends C4136a {
    public C4143f(C4137b.C4139b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11466b(String str) {
        C4104a a = C4104a.m11278a();
        if (a != null) {
            for (C4102a next : a.mo32138b()) {
                if (this.f9892a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32199a(str, this.f9894c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4119b.m11360b(this.f9893b, this.f9896d.mo32246b())) {
            return null;
        }
        this.f9896d.mo32245a(this.f9893b);
        return this.f9893b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m11466b(str);
        }
        super.onPostExecute(str);
    }
}
