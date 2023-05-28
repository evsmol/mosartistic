package com.iab.omid.library.ironsrc.walking.p115a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.p111b.C4311a;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.walking.p115a.C4344b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.f */
public class C4350f extends C4343a {
    public C4350f(C4344b.C4346b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m12394b(String str) {
        C4311a a = C4311a.m12213a();
        if (a != null) {
            for (C4309a next : a.mo32938b()) {
                if (this.f10361a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().mo32991a(str, this.f10363c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C4326b.m12291b(this.f10362b, this.f10365d.mo33037b())) {
            return null;
        }
        this.f10365d.mo33036a(this.f10362b);
        return this.f10362b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m12394b(str);
        }
        super.onPostExecute(str);
    }
}
