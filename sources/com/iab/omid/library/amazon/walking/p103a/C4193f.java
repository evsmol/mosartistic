package com.iab.omid.library.amazon.walking.p103a;

import android.text.TextUtils;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p099b.C4154a;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.walking.p103a.C4187b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.f */
public class C4193f extends C4186a {
    public C4193f(C4187b.C4189b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m11696b(String str) {
        C4154a a = C4154a.m11508a();
        if (a != null) {
            for (C4152a next : a.mo32337b()) {
                if (this.f10009a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32398a(str, this.f10011c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4169b.m11590b(this.f10010b, this.f10013d.mo32445b())) {
            return null;
        }
        this.f10013d.mo32444a(this.f10010b);
        return this.f10010b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m11696b(str);
        }
        super.onPostExecute(str);
    }
}
