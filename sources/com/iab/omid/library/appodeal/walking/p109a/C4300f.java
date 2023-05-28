package com.iab.omid.library.appodeal.walking.p109a;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.p105b.C4261a;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.walking.p109a.C4294b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.a.f */
public class C4300f extends C4293a {
    public C4300f(C4294b.C4296b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m12173b(String str) {
        C4261a a = C4261a.m11989a();
        if (a != null) {
            for (C4259a next : a.mo32744b()) {
                if (this.f10247a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32805a(str, this.f10249c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4276b.m12070b(this.f10248b, this.f10251d.mo32851b())) {
            return null;
        }
        this.f10251d.mo32850a(this.f10248b);
        return this.f10248b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m12173b(str);
        }
        super.onPostExecute(str);
    }
}
